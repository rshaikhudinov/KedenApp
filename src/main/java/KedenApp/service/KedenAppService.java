package KedenApp.service;

import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.*;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CommunicationDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.FullNameDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.IdentityDocDetailsV3Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.IdentityDocKindCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import KedenApp.dto.xsd_gen.eec.r_043_expresscargodeclaration_v2_1.ExpressCargoDeclarationType;
import KedenApp.dto.xsd_gen.eec.r_043_expresscargodeclaration_v2_1.ObjectFactory;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class KedenAppService {

    public void genXml(){
        try {
            ObjectFactory objectFactory = new ObjectFactory();

            //шапка
            UnifiedCode20Type docKindCode = new UnifiedCode20Type();
            docKindCode
                    .setValue("09034");
            RegisterDocumentIdDetailsType registerDocumentIdDetails = new RegisterDocumentIdDetailsType();
            registerDocumentIdDetails
                    .setDocKindCode(docKindCode)
                    .setRegistrationNumberId("32");
            CustomsDocumentIdDetailsType expressCargoDeclarationIdDetails = new CustomsDocumentIdDetailsType();
            expressCargoDeclarationIdDetails
                    .setCustomsOfficeCode("55301");

            //концовка
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

            ExpressCargoDeclarationType declaration = objectFactory.createExpressCargoDeclarationType();
            declaration
                    .setExpressRegistryKindCode("ПТДЭГ")
                    .setDeclarationKindCode("ИМ")
                    .setEDocIndicatorCode("ЭД")
                    .setRegisterDocumentIdDetails(registerDocumentIdDetails)
                    .setExpressCargoDeclarationIdDetails(expressCargoDeclarationIdDetails)
                    .setSignatoryPersonV2Details(signatoryPersonV2Details);

            JAXBElement<ExpressCargoDeclarationType> element = objectFactory.createExpressCargoDeclaration(declaration);
            JAXBContext context = JAXBContext.newInstance(ExpressCargoDeclarationType.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(element, System.out);

            /*StringWriter writer = new StringWriter();
            marshaller.marshal(element, writer);

            String xmlString = writer.toString();
            try (FileWriter fileWriter = new FileWriter("express_cargo_declaration.xml")) {
                fileWriter.write(xmlString);
            } catch (IOException e) {
                System.out.println(e.getMessage());;
            }*/
        } catch (Exception e) {
            log.error("e: ", e);;
        }


    }
}
