package KedenApp.service;

import KedenApp.core.KedenAppException;
import KedenApp.dto.EcHouseShipmentDetailsModel;
import KedenApp.dto.PackageKeden;
import KedenApp.dto.RecipientKeden;
import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.*;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.*;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.IdentityDocKindCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import KedenApp.dto.xsd_gen.eec.r_043_expresscargodeclaration_v2_1.ExpressCargoDeclarationType;
import KedenApp.dto.xsd_gen.eec.r_043_expresscargodeclaration_v2_1.ObjectFactory;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class KedenAppService {

    private final PDFService pdfService;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    BigDecimal massSumAll = BigDecimal.valueOf(0.0);
    BigDecimal kztSumAll = BigDecimal.valueOf(0.0);

    public String createDeclaration(EcHouseShipmentDetailsModel ecHouseShipmentDetailsModel){
        // создание папки для хранения
        String folderName = createFolder();
        // создание XML
        genXml(ecHouseShipmentDetailsModel, folderName);
        // создание PDF
        pdfService.generatePdf(ecHouseShipmentDetailsModel, folderName);

        return "Файлы для декларации успешно созданы";
    }

    public void genXml(EcHouseShipmentDetailsModel ecHouseShipmentDetailsModel, String folderName){
        try {
            ObjectFactory objectFactory = new ObjectFactory();

            ExpressCargoDeclarationType declaration = objectFactory.createExpressCargoDeclarationType();
            declaration
                    .setExpressRegistryKindCode("ПТДЭГ")
                    .setDeclarationKindCode("ИМ")
                    .setEDocIndicatorCode("ЭД")
                    .setRegisterDocumentIdDetails(getRegisterDocumentIdDetails())
                    .setExpressCargoDeclarationIdDetails(getExpressCargoDeclarationIdDetails())
                    .setEcGoodsShipmentDetails(getECGoodsShipmentDetailsType(ecHouseShipmentDetailsModel))
                    .setSignatoryPersonV2Details(getSignatoryPersonDetailsV2Type());

            JAXBElement<ExpressCargoDeclarationType> element = objectFactory.createExpressCargoDeclaration(declaration);
            JAXBContext context = JAXBContext.newInstance(ExpressCargoDeclarationType.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            //вывод xml в консоль
            //marshaller.marshal(element, System.out);

            StringWriter writer = new StringWriter();
            marshaller.marshal(element, writer);

            String fileName = "express_cargo_declaration.xml";
            try (FileWriter fileWriter = new FileWriter(folderName + "/" + fileName)) {
                String xmlString = writer.toString();
                fileWriter.write(xmlString);
                log.info("XML файл {} успешно сгенерирован", fileName);
            } catch (IOException e) {
                log.error(e.getMessage());
                throw new KedenAppException("Ошибка при сохранении файла декларации:  " + e.getMessage());
            }
        } catch (JAXBException e) {
            log.error(e.getMessage());
            throw new KedenAppException("Ошибка при сериализации xml:  " + e.getMessage());
        }
    }

    public RegisterDocumentIdDetailsType getRegisterDocumentIdDetails(){
        UnifiedCode20Type docKindCode = new UnifiedCode20Type();
        docKindCode
                .setValue("09034");
        RegisterDocumentIdDetailsType registerDocumentIdDetails = new RegisterDocumentIdDetailsType();
        registerDocumentIdDetails
                .setDocKindCode(docKindCode)
                .setRegistrationNumberId("32");
        return registerDocumentIdDetails;
    }

    public CustomsDocumentIdDetailsType getExpressCargoDeclarationIdDetails(){
        CustomsDocumentIdDetailsType expressCargoDeclarationIdDetails = new CustomsDocumentIdDetailsType();
        expressCargoDeclarationIdDetails
                .setCustomsOfficeCode("55301");
        return expressCargoDeclarationIdDetails;
    }

    public ECGoodsShipmentDetailsType getECGoodsShipmentDetailsType(EcHouseShipmentDetailsModel ecHouseShipmentDetailsModel){

        ECGoodsShipmentDetailsType ecGoodsShipmentDetails = new ECGoodsShipmentDetailsType();
        ecGoodsShipmentDetails
                .setConsignorDetails(getConsignorDetails(ecHouseShipmentDetailsModel.getSender())) // отправитель
                .setConsigneeDetails(getConsigneeDetails(ecHouseShipmentDetailsModel.getRecipientCompany())) // фирма получатель
                .setEcHouseShipmentDetails(getEcHouseShipmentDetails(ecHouseShipmentDetailsModel)); // тут список получателей и посылок

        // итоговая масса по всем получателям
        UnifiedPhysicalMeasureType unifiedGrossMassMeasureEnd = new UnifiedPhysicalMeasureType();
        unifiedGrossMassMeasureEnd
                .setValue(massSumAll);
        // итоговая сумма по всем получателям в тенге
        PaymentAmountWithCurrencyType caValueAmount = new PaymentAmountWithCurrencyType();
        caValueAmount
                .setValue(kztSumAll);

        log.info("Итоговая масса по всем получателям = " + massSumAll);
        log.info("Итоговая сумма по всем получателям = " + kztSumAll);

        ecGoodsShipmentDetails
                .setUnifiedGrossMassMeasure(unifiedGrossMassMeasureEnd)
                .setCaValueAmount(caValueAmount);
        return ecGoodsShipmentDetails;
    }

    /**
     *
     * @return Данные по отправителю
     */
    public GoodsShipmentSubjectDetailsType getConsignorDetails(int index){
        GoodsShipmentSubjectDetailsType consignorDetails = new GoodsShipmentSubjectDetailsType();
        switch (index) {
            case 1 -> {
                consignorDetails
                        .setSubjectName("OEC GMBH")
                        .setSubjectBriefName("OEC GMBH");
                List<SubjectAddressDetailsType> subjectAddressDetails = new ArrayList<>();
                UnifiedCountryCodeType unifiedCountryCode = new UnifiedCountryCodeType();
                unifiedCountryCode
                        .setValue("DE");
                SubjectAddressDetailsType subjectAddressDetailsType = new SubjectAddressDetailsType();
                subjectAddressDetailsType
                        .setAddressKindCode("1")
                        .setUnifiedCountryCode(unifiedCountryCode)
                        .setCityName("Detmold")
                        .setStreetName("FREILIGRATHSTRAßE")
                        .setBuildingNumberId("7")
                        .setRoomNumberId("-")
                        .setRegionName("-");
                subjectAddressDetails.add(subjectAddressDetailsType);
                List<CommunicationDetailsType> communicationDetails = new ArrayList<>();
                List<String> communicationEmail = new ArrayList<>();
                communicationEmail.add(" expresscargo@t-online.de");
                CommunicationDetailsType communicationDetailsEmail= new CommunicationDetailsType();
                communicationDetailsEmail
                        .setCommunicationChannelCode("EM")
                        .setCommunicationChannelId(communicationEmail);
                communicationDetails.add(communicationDetailsEmail);
                consignorDetails
                        .setSubjectAddressDetails(subjectAddressDetails)
                        .setCommunicationDetails(communicationDetails);
            }
            case 2 -> {
                consignorDetails
                        .setSubjectName("OST EXPRESS COURIER GMBH")
                        .setSubjectBriefName("OST EXPRESS COURIER GMBH");
                List<SubjectAddressDetailsType> subjectAddressDetails = new ArrayList<>();
                UnifiedCountryCodeType unifiedCountryCode = new UnifiedCountryCodeType();
                unifiedCountryCode
                        .setValue("DE");
                SubjectAddressDetailsType subjectAddressDetailsType = new SubjectAddressDetailsType();
                subjectAddressDetailsType
                        .setAddressKindCode("1")
                        .setUnifiedCountryCode(unifiedCountryCode)
                        .setCityName("Detmold")
                        .setStreetName("DENKMAL STR.")
                        .setBuildingNumberId("11")
                        .setRoomNumberId("-")
                        .setRegionName("-");
                subjectAddressDetails.add(subjectAddressDetailsType);
                List<CommunicationDetailsType> communicationDetails = new ArrayList<>();
                List<String> communicationEmail = new ArrayList<>();
                communicationEmail.add(" expresscargo@t-online.de");
                CommunicationDetailsType communicationDetailsEmail= new CommunicationDetailsType();
                communicationDetailsEmail
                        .setCommunicationChannelCode("EM")
                        .setCommunicationChannelId(communicationEmail);
                communicationDetails.add(communicationDetailsEmail);
                consignorDetails
                        .setSubjectAddressDetails(subjectAddressDetails)
                        .setCommunicationDetails(communicationDetails);
            }
            case 3 -> {
                consignorDetails
                        .setSubjectName("FTL GMBH")
                        .setSubjectBriefName("FTL GMBH");
                List<SubjectAddressDetailsType> subjectAddressDetails = new ArrayList<>();
                UnifiedCountryCodeType unifiedCountryCode = new UnifiedCountryCodeType();
                unifiedCountryCode
                        .setValue("DE");
                SubjectAddressDetailsType subjectAddressDetailsType = new SubjectAddressDetailsType();
                subjectAddressDetailsType
                        .setAddressKindCode("1")
                        .setUnifiedCountryCode(unifiedCountryCode)
                        .setCityName("SCHONECK")
                        .setStreetName("KONRAD-ZUSE-RING")
                        .setBuildingNumberId("15A")
                        .setRoomNumberId("-")
                        .setRegionName("-");
                subjectAddressDetails.add(subjectAddressDetailsType);
                List<CommunicationDetailsType> communicationDetails = new ArrayList<>();
                List<String> communicationEmail = new ArrayList<>();
                communicationEmail.add(" expresscargo@t-online.de");
                CommunicationDetailsType communicationDetailsEmail= new CommunicationDetailsType();
                communicationDetailsEmail
                        .setCommunicationChannelCode("EM")
                        .setCommunicationChannelId(communicationEmail);
                communicationDetails.add(communicationDetailsEmail);
                consignorDetails
                        .setSubjectAddressDetails(subjectAddressDetails)
                        .setCommunicationDetails(communicationDetails);
            }
        }
        return consignorDetails;
    }

    /**
     *
     * @return Данные по получателю
     */
    public GoodsShipmentSubjectDetailsType getConsigneeDetails(int index){
        GoodsShipmentSubjectDetailsType consigneeDetails = new GoodsShipmentSubjectDetailsType();
            switch (index) {
                case 1 -> {
                    consigneeDetails
                            .setSubjectName("POSTAL EXPRESS")
                            .setSubjectBriefName("POSTAL EXPRESS")
                            .setTaxpayerId("050140011760");
                    List<SubjectAddressDetailsType> subjectAddressDetails = new ArrayList<>();
                    UnifiedCountryCodeType unifiedCountryCode = new UnifiedCountryCodeType();
                    unifiedCountryCode
                            .setValue("KZ");
                    SubjectAddressDetailsType subjectAddressDetailsType = new SubjectAddressDetailsType();
                    subjectAddressDetailsType
                            .setAddressKindCode("1")
                            .setUnifiedCountryCode(unifiedCountryCode)
                            .setCityName("Алматы")
                            .setStreetName("ул. Толи Би")
                            .setBuildingNumberId("190")
                            .setRoomNumberId("офис 54")
                            .setRegionName("-");
                    subjectAddressDetails.add(subjectAddressDetailsType);
                    List<CommunicationDetailsType> communicationDetails = new ArrayList<>();
                    List<String> communicationPhone = new ArrayList<>();
                    communicationPhone.add("+7 727 3790870");
                    List<String> communicationFax = new ArrayList<>();
                    communicationFax.add("+7 727 3790869");
                    CommunicationDetailsType communicationDetailsPhone= new CommunicationDetailsType();
                    communicationDetailsPhone
                            .setCommunicationChannelCode("TE")
                            .setCommunicationChannelId(communicationPhone);
                    CommunicationDetailsType communicationDetailsFax= new CommunicationDetailsType();
                    communicationDetailsFax
                            .setCommunicationChannelCode("FX")
                            .setCommunicationChannelId(communicationFax);
                    communicationDetails.add(communicationDetailsPhone);
                    communicationDetails.add(communicationDetailsFax);
                    consigneeDetails
                            .setSubjectAddressDetails(subjectAddressDetails)
                            .setCommunicationDetails(communicationDetails);
                }
                case 2 -> {
                    consigneeDetails
                            .setSubjectName("ТОО \"DISALES GROUP\"")
                            .setSubjectBriefName("ТОО \"DISALES GROUP\"")
                            .setTaxpayerId("170340017672");
                    List<SubjectAddressDetailsType> subjectAddressDetails = new ArrayList<>();
                    UnifiedCountryCodeType unifiedCountryCode = new UnifiedCountryCodeType();
                    unifiedCountryCode
                            .setValue("KZ");
                    SubjectAddressDetailsType subjectAddressDetailsType = new SubjectAddressDetailsType();
                    subjectAddressDetailsType
                            .setAddressKindCode("1")
                            .setUnifiedCountryCode(unifiedCountryCode)
                            .setCityName("Алматы")
                            .setStreetName("улица Пчеловодная")
                            .setBuildingNumberId("4")
                            .setRoomNumberId("-")
                            .setRegionName("-");
                    subjectAddressDetails.add(subjectAddressDetailsType);
                    List<CommunicationDetailsType> communicationDetails = new ArrayList<>();
                    List<String> communicationPhone = new ArrayList<>();
                    communicationPhone.add("+7 727 3176009");
                    CommunicationDetailsType communicationDetailsPhone= new CommunicationDetailsType();
                    communicationDetailsPhone
                            .setCommunicationChannelCode("TE")
                            .setCommunicationChannelId(communicationPhone);
                    communicationDetails.add(communicationDetailsPhone);
                    consigneeDetails
                            .setSubjectAddressDetails(subjectAddressDetails)
                            .setCommunicationDetails(communicationDetails);
                }
            }
        return consigneeDetails;
    }

    /**
     * Заполняем посылки по физ лицам
     * @param ecHouseShipmentDetailsModel данные с формы
     * @return данные по посылкам у физ лицам
     */
    public List<ECHouseShipmentDetailsType> getEcHouseShipmentDetails(EcHouseShipmentDetailsModel ecHouseShipmentDetailsModel){
        List<ECHouseShipmentDetailsType> ecHouseShipmentDetails = new ArrayList<>();
        List<RecipientKeden> recipients = ecHouseShipmentDetailsModel.getRecipients();
        int consignmentItemOrdinalIndex = 1; // номер всех посылок в декларации
        for (int i = 0; i < recipients.size(); i++) {
            RecipientKeden recipient = recipients.get(i);

            // данные по получателю
            DocDetailsV4Type transportDocumentDetails = new DocDetailsV4Type();
            transportDocumentDetails
                    .setDocId(ecHouseShipmentDetailsModel.getDocIdDeclaration())
                    .setDocCreationDate(ecHouseShipmentDetailsModel.getDocCreationDateDeclaration());

            UnifiedCode20Type docKindCode = new UnifiedCode20Type();
            docKindCode
                    .setValue("02021");
            DocDetailsV4Type houseWaybillDetails = new DocDetailsV4Type();
            houseWaybillDetails
                    .setDocKindCode(docKindCode)
                    .setDocName("Индивидуальная накладная при экспресс-доставке")
                    .setDocId(UUID.randomUUID().toString())
                    .setDocCreationDate(LocalDate.now().format(formatter));

            UnifiedCountryCodeType unifiedCountryCode = new UnifiedCountryCodeType();
            unifiedCountryCode
                    .setValue("KZ");
            IdentityDocKindCodeType identityDocKindCode = new IdentityDocKindCodeType();
            identityDocKindCode
                    .setValue("KZ02014");
            IdentityDocDetailsV3Type identityDocV3Details = new IdentityDocDetailsV3Type();
            identityDocV3Details
                    .setUnifiedCountryCode(unifiedCountryCode)
                    .setIdentityDocKindCode(identityDocKindCode)
                    .setDocKindName("Удостоверение")
                    .setDocId(recipient.getDocId())
                    .setDocCreationDate(recipient.getDocCreationDate());

            List<SubjectAddressDetailsType> subjectAddressDetails = new ArrayList<>();
            SubjectAddressDetailsType subjectAddressDetailsType = new SubjectAddressDetailsType();
            subjectAddressDetailsType
                    .setAddressKindCode("1")
                    .setUnifiedCountryCode(unifiedCountryCode)
                    .setCityName(recipient.getCityName())
                    .setStreetName(recipient.getStreetName())
                    .setRegionName(recipient.getRegionName())
                    .setBuildingNumberId(recipient.getBuildingNumberId())
                    .setRoomNumberId(recipient.getRoomNumberId());
            subjectAddressDetails.add(subjectAddressDetailsType);

            List<String> communicationChannelId = new ArrayList<>();
            communicationChannelId.add(recipient.getPhone());
            List<CommunicationDetailsType> communicationDetails = new ArrayList<>();
            CommunicationDetailsType communicationDetailsType = new CommunicationDetailsType();
            communicationDetailsType
                    .setCommunicationChannelCode("TE")
                    .setCommunicationChannelId(communicationChannelId);
            communicationDetails.add(communicationDetailsType);

            GoodsShipmentSubjectDetailsType consigneeDetails = new GoodsShipmentSubjectDetailsType();
            consigneeDetails.setSubjectName(recipient.getFio());
            consigneeDetails
                    .setPersonId(recipient.getIin())
                    .setIdentityDocV3Details(identityDocV3Details)
                    .setSubjectAddressDetails(subjectAddressDetails)
                    .setCommunicationDetails(communicationDetails);
            // закончились данные по получателю

            // данные по посылкам
            List<ECGoodsItemDetailsType> ecGoodsItemDetails = new ArrayList<>();
            List<PackageKeden> packageList = recipient.getPackages();
            BigDecimal massSum = BigDecimal.valueOf(0.0);
            BigDecimal kztSum = BigDecimal.valueOf(0.0);
            for (int j = 0; j < packageList.size(); j++) {
                PackageKeden packageKeden = packageList.get(j);
                ECGoodsItemDetailsType ecGoodsItemDetailsType = new ECGoodsItemDetailsType();
                ecGoodsItemDetailsType
                        .setConsignmentItemOrdinal(BigInteger.valueOf(consignmentItemOrdinalIndex));
                consignmentItemOrdinalIndex++;
                ecGoodsItemDetailsType
                        .setHmConsignmentItemNumber(BigDecimal.valueOf(j+1));
                ecGoodsItemDetailsType
                        .setCommodityCode(packageKeden.getCommodityCode());
                List<String> goodsDescriptionText = new ArrayList<>();
                goodsDescriptionText.add(packageKeden.getGoodsDescriptionText());
                ecGoodsItemDetailsType
                        .setGoodsDescriptionText(goodsDescriptionText);

                UnifiedPhysicalMeasureType goodsMeasure = new UnifiedPhysicalMeasureType();
                goodsMeasure
                        .setMeasurementUnitCode("796")
                        .setValue(BigDecimal.valueOf(1));
                GoodsMeasureDetailsType goodsMeasureDetails = new GoodsMeasureDetailsType();
                goodsMeasureDetails
                        .setGoodsMeasure(goodsMeasure);
                ecGoodsItemDetailsType
                        .setGoodsMeasureDetails(goodsMeasureDetails);
                UnifiedPhysicalMeasureType unifiedGrossMassMeasure = new UnifiedPhysicalMeasureType();
                unifiedGrossMassMeasure
                        .setValue(packageKeden.getUnifiedGrossMassMeasure());
                ecGoodsItemDetailsType
                        .setUnifiedGrossMassMeasure(unifiedGrossMassMeasure);
                // считаем сумму веса посылок по физ лицу
                massSum = massSum.add(packageKeden.getUnifiedGrossMassMeasure());

                        List<PaymentAmountWithCurrencyType> caValueAmountWithCurrencyTypeList = new ArrayList<>();
                PaymentAmountWithCurrencyType paymentAmountUSD = new PaymentAmountWithCurrencyType();
                paymentAmountUSD
                        .setCurrencyCode(ecHouseShipmentDetailsModel.getCurrencyName())
                        .setValue(packageKeden.getCurrencyInAmount());
                caValueAmountWithCurrencyTypeList.add(paymentAmountUSD);

                // сумма посылки в KZT округляя
                BigDecimal sumKZT = packageKeden.getCurrencyInAmount().multiply(ecHouseShipmentDetailsModel.getCurrency()).setScale(2, RoundingMode.HALF_UP);
                PaymentAmountWithCurrencyType paymentAmountKZT = new PaymentAmountWithCurrencyType();
                paymentAmountKZT
                        .setCurrencyCode("KZT")
                        .setValue(sumKZT);
                caValueAmountWithCurrencyTypeList.add(paymentAmountKZT);
                // считаем сумму цены посылок по физ лицу в тенге
                kztSum = kztSum.add(sumKZT);

                ecGoodsItemDetailsType
                        .setCaValueAmount(caValueAmountWithCurrencyTypeList);
                ecGoodsItemDetails.add(ecGoodsItemDetailsType);
            }

            // итоговый вес и цена по получателю
            UnifiedPhysicalMeasureType unifiedGrossMassMeasureEnd = new UnifiedPhysicalMeasureType();
            unifiedGrossMassMeasureEnd
                    .setValue(massSum);
            log.info("Итоговая масса по " + (i+1) + " получателю = " + massSum);
            massSumAll = massSumAll.add(massSum);
            PaymentAmountWithCurrencyType caValueAmount = new PaymentAmountWithCurrencyType();
            caValueAmount
                    .setValue(kztSum);
            log.info("Итоговая сумма по " + (i+1) + " получателю = " + kztSum);
            kztSumAll = kztSumAll.add(kztSum);
            ECHouseShipmentDetailsType ecHouseShipmentDetailsType = new ECHouseShipmentDetailsType();
            ecHouseShipmentDetailsType
                    .setObjectOrdinal(BigInteger.valueOf(i+1))
                    .setTransportDocumentDetails(transportDocumentDetails)
                    .setHouseWaybillDetails(houseWaybillDetails)
                    .setConsignorDetails(getConsignorDetails(ecHouseShipmentDetailsModel.getSender())) // тут нужен правильный индекс с формы
                    .setConsigneeDetails(consigneeDetails)          // данные получателя физ лицо
                    .setEcGoodsItemDetails(ecGoodsItemDetails)        // данные о посылке
                    .setUnifiedGrossMassMeasure(unifiedGrossMassMeasureEnd)   // итоговая масса
                    .setCaValueAmount(caValueAmount);            // итоговая сумма в тенге
            ecHouseShipmentDetails.add(ecHouseShipmentDetailsType);
        }
        return ecHouseShipmentDetails;
    }

    public SignatoryPersonDetailsV2Type getSignatoryPersonDetailsV2Type(){
        FullNameDetailsType fullNameDetails = new FullNameDetailsType();
        fullNameDetails
                .setFirstName("ВИКТОР")
                .setLastName("БОРИСОВИЧ")
                .setMiddleName("БИРЮКОВ")
                .setIin("790715302581");
        List<CommunicationDetailsType> communicationDetails = new ArrayList<>();
        List<String> communicationChannelId = new ArrayList<>();
        communicationChannelId.add("+7 701 9518191");
        CommunicationDetailsType communicationDetailsType = new CommunicationDetailsType();
        communicationDetailsType
                .setCommunicationChannelCode("TE")
                .setCommunicationChannelName("phone")
                .setCommunicationChannelId(communicationChannelId);
        communicationDetails.add(communicationDetailsType);

        SigningDetailsType signingDetails = new SigningDetailsType();
        signingDetails
                .setFullNameDetails(fullNameDetails)
                .setPositionName("Специалист по таможенному оформлению")
                .setCommunicationDetails(communicationDetails);

        UnifiedCountryCodeType unifiedCountryCode = new UnifiedCountryCodeType();
        unifiedCountryCode
                .setValue("KZ")
                .setCodeListId("2021");
        IdentityDocKindCodeType identityDocKindCode = new IdentityDocKindCodeType();
        identityDocKindCode
                .setValue("KZ02014");
        IdentityDocDetailsV3Type identityDocV3Details = new IdentityDocDetailsV3Type();
        identityDocV3Details
                .setUnifiedCountryCode(unifiedCountryCode)
                .setIdentityDocKindCode(identityDocKindCode)
                .setDocKindName("Удостоверение")
                .setDocId("049570847")
                .setDocCreationDate("2021-11-16");

        UnifiedCode20Type docKindCodePower = new UnifiedCode20Type();
        docKindCodePower.setValue("11003");
        CADocBaseType powerOfAttorneyDetails = new CADocBaseType();
        powerOfAttorneyDetails
                .setDocKindCode(docKindCodePower)
                .setDocId("32")
                .setDocCreationDate("2016-01-26");

        SignatoryPersonDetailsV2Type signatoryPersonV2Details = new SignatoryPersonDetailsV2Type();
        signatoryPersonV2Details
                .setSigningDetails(signingDetails)
                .setIdentityDocV3Details(identityDocV3Details)
                .setPowerOfAttorneyDetails(powerOfAttorneyDetails);
        return signatoryPersonV2Details;
    }

    public String createFolder() {
        String baseName = "express_cargo_declaration_";
        String dateString = LocalDate.now().format(formatter);
        int index = 0;
        Path folderPath;

        do {
            index++;
            folderPath = Paths.get(baseName + dateString + "_" + index);
        } while (Files.exists(folderPath));

        try {
            Files.createDirectory(folderPath);
            log.info("Создана папка с именем {}", folderPath);
        } catch (IOException e) {
            log.error("Не удалось создать папку с именем {}", folderPath, e);
            throw new KedenAppException("Не удалось создать папку: " + folderPath + " " + e.getMessage());
        }

        return folderPath.toString();
    }
}
