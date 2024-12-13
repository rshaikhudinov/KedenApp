package KedenApp.service;

import KedenApp.core.KedenAppException;
import KedenApp.dto.EcHouseShipmentDetailsModel;
import KedenApp.dto.PackageKeden;
import KedenApp.dto.RecipientKeden;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.properties.HorizontalAlignment;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PDFService {

    public void generatePdf(EcHouseShipmentDetailsModel ecHouseShipmentDetailsModel, String folderName) {
        try {
            List<RecipientKeden> recipients = ecHouseShipmentDetailsModel.getRecipients();
            for (int i = 0; i < recipients.size(); i++) {
                RecipientKeden recipientKeden = recipients.get(i);

                // считаем количество посылок, вес и цену
                List<PackageKeden> packages = recipientKeden.getPackages();
                BigDecimal unifiedGrossMassMeasureAll = BigDecimal.valueOf(0.0);
                BigDecimal currencyInAmountAll = BigDecimal.valueOf(0.0);
                for (PackageKeden packageKeden : packages){
                    unifiedGrossMassMeasureAll = unifiedGrossMassMeasureAll.add(packageKeden.getUnifiedGrossMassMeasure());
                    currencyInAmountAll = currencyInAmountAll.add(packageKeden.getCurrencyInAmount());
                }

                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                PdfDocument pdfDoc = new PdfDocument(new PdfWriter(outputStream));
                Document document = new Document(pdfDoc);

                // Загрузка шрифта из ресурсов
                InputStream fontStream = getClass().getClassLoader().getResourceAsStream("static/fonts/Times New Roman.ttf");
                if (fontStream == null) {
                    throw new KedenAppException("Шрифт не найден в ресурсах");
                }

                // Преобразование InputStream в массив байтов
                byte[] fontBytes = fontStream.readAllBytes();

                // Создание шрифта из массива байтов
                PdfFont font = PdfFontFactory.createFont(fontBytes, "Cp1251");
                document.setFont(font);

                // Создаем таблицу для основной части
                Table tableHeader = new Table(UnitValue.createPercentArray(new float[]{1, 1}));
                tableHeader.setWidth(UnitValue.createPercentValue(100));

                // Первая строка: информация в 4 блоках
                String block1 = "Количество посылок\n" + packages.size() + " шт";
                String block2 = "Количество мест\n" + packages.size();
                String block3 = "Общий вес\n" + unifiedGrossMassMeasureAll + "  кг";
                String block4 = "Общая стоимость\n" + currencyInAmountAll + " " + ecHouseShipmentDetailsModel.getCurrencyName();
                Table firstCellTable = new Table(UnitValue.createPercentArray(new float[]{1, 1, 1, 1}));
                firstCellTable
                        .setWidth(UnitValue.createPercentValue(100))
                        .setTextAlignment(TextAlignment.CENTER)
                        .addCell(
                                new Cell()
                                        .add(new Paragraph(block1))
                                        .setBorder(Border.NO_BORDER)
                        )
                        .addCell(
                                new Cell()
                                        .add(new Paragraph(block2))
                                        .setBorder(Border.NO_BORDER)
                        )
                        .addCell(
                                new Cell()
                                        .add(new Paragraph(block3))
                                        .setBorder(Border.NO_BORDER)
                        )
                        .addCell(
                                new Cell()
                                        .add(new Paragraph(block4))
                                        .setBorder(Border.NO_BORDER)
                        );
                tableHeader.addCell(
                        new Cell(1, 2)
                                .add(firstCellTable));

                // Вторая срока
                String company = "";
                switch (ecHouseShipmentDetailsModel.getSender()) {
                    case 1 -> company = "OEC GMBH";
                    case 2 -> company = "OST EXPRESS COURIER GMBH";
                    case 3 -> company = "FTL GMBH";
                }
                tableHeader.addCell(
                        new Cell()
                                .add(new Paragraph("Я подтверждаю, что отправление не содержит предметы, запрещенные к пересылке. " +
                                        "С правилами пересылки ознакомлен.")
                                        .setTextAlignment(TextAlignment.LEFT))
                                .add(new Paragraph("\n\n" + company)
                                        .setTextAlignment(TextAlignment.RIGHT))
                                .setFontSize(8)
                );
                tableHeader.addCell(
                        new Cell()
                                .add(new Paragraph("Я подтверждаю, что мною прочитан договор оферты, подписан с помощью электронной " +
                                                "подписи посредством электронного кабинета, находящегося на сайте транспортной " +
                                                "компании, предоставившей услугу по доставке товара.")
                                        .setTextAlignment(TextAlignment.LEFT))
                                .add(new Paragraph("подпись получателя")
                                        .setTextAlignment(TextAlignment.RIGHT))
                                .setFontSize(8)
                );
                document.add(tableHeader);

                // Добавляем надпись в середине страницы
                document.add(
                        new Paragraph("Поднакладная")
                                .setTextAlignment(TextAlignment.CENTER)
                );

                // таблица с отправителем и получателем
                Table tableSenderAndRecipient = new Table(UnitValue.createPercentArray(new float[]{1, 1}));
                tableSenderAndRecipient
                        .setWidth(UnitValue.createPercentValue(100))
                        .setFontSize(8);
                tableSenderAndRecipient.addCell(
                        new Cell()
                                .add(new Paragraph(getSender(ecHouseShipmentDetailsModel.getSender())))
                                .setTextAlignment(TextAlignment.LEFT)
                );
                tableSenderAndRecipient.addCell(
                        new Cell()
                                .add(new Paragraph(
                                        "Кому\n\n" +
                                                recipientKeden.getFio() + "\n" +
                                                recipientKeden.getStreetName() + ", " +
                                                recipientKeden.getBuildingNumberId() + ", " +
                                                recipientKeden.getRoomNumberId() + ", " +
                                                recipientKeden.getCityName() + "\n" +
                                                recipientKeden.getPhone() + "\n" +
                                                "Казахстан"
                                ))
                                .setTextAlignment(TextAlignment.LEFT)
                );
                document.add(tableSenderAndRecipient);

                // добавляем таблицу с посылками
                Table tablePackages = new Table(UnitValue.createPercentArray(new float[]{5, 75, 9, 11}));
                tablePackages.setWidth(UnitValue.createPercentValue(100));
                tablePackages.addCell(
                        new Cell().add(new Paragraph("№"))
                                .setFontSize(10)
                                .setTextAlignment(TextAlignment.CENTER)
                );
                tablePackages.addCell(
                        new Cell().add(new Paragraph("Полное описание"))
                                .setFontSize(10)
                                .setTextAlignment(TextAlignment.CENTER)
                );
                tablePackages.addCell(
                        new Cell().add(new Paragraph("Вес"))
                                .setFontSize(10)
                                .setTextAlignment(TextAlignment.CENTER)
                );
                tablePackages.addCell(
                        new Cell().add(new Paragraph("Стоимость"))
                                .setFontSize(10)
                                .setTextAlignment(TextAlignment.CENTER)
                );
                for (int j = 0; j < packages.size(); j++){
                    PackageKeden packageKeden = packages.get(j);
                    tablePackages.addCell(
                            new Cell().add(new Paragraph(String.valueOf(j+1)))
                                    .setFontSize(9)
                                    .setTextAlignment(TextAlignment.CENTER)
                                    .setBorder(Border.NO_BORDER)
                    );
                    tablePackages.addCell(
                            new Cell().add(new Paragraph(packageKeden.getGoodsDescriptionText()))
                                    .setFontSize(7)
                                    .setTextAlignment(TextAlignment.LEFT)
                                    .setBorder(Border.NO_BORDER)
                    );
                    tablePackages.addCell(
                            new Cell().add(new Paragraph(packageKeden.getUnifiedGrossMassMeasure() + " kg"))
                                    .setFontSize(7)
                                    .setTextAlignment(TextAlignment.CENTER)
                                    .setBorder(Border.NO_BORDER)
                    );
                    tablePackages.addCell(
                            new Cell().add(new Paragraph(packageKeden.getCurrencyInAmount() + " " + ecHouseShipmentDetailsModel.getCurrencyName()))
                                    .setFontSize(7)
                                    .setTextAlignment(TextAlignment.CENTER)
                                    .setBorder(Border.NO_BORDER)
                    );
                }
                tablePackages.addCell(
                        new Cell().add(new Paragraph())
                                .setFontSize(10)
                                .setTextAlignment(TextAlignment.CENTER)
                                .setBorder(Border.NO_BORDER)
                                .setBorderTop(new SolidBorder(0.5f) )
                );
                tablePackages.addCell(
                        new Cell().add(new Paragraph("Total:"))
                                .setFontSize(10)
                                .setTextAlignment(TextAlignment.RIGHT)
                                .setBorder(Border.NO_BORDER)
                                .setBorderTop(new SolidBorder(0.5f))
                );
                tablePackages.addCell(
                        new Cell().add(new Paragraph(unifiedGrossMassMeasureAll + " kg"))
                                .setFontSize(10)
                                .setTextAlignment(TextAlignment.CENTER)
                                .setBorder(Border.NO_BORDER)
                                .setBorderTop(new SolidBorder(0.5f))
                );
                tablePackages.addCell(
                        new Cell().add(new Paragraph(currencyInAmountAll + " " + ecHouseShipmentDetailsModel.getCurrencyName()))
                                .setFontSize(10)
                                .setTextAlignment(TextAlignment.CENTER)
                                .setBorder(Border.NO_BORDER)
                                .setBorderTop(new SolidBorder(0.5f))
                );
                document.add(tablePackages);

                // добавляем фото документа
                MultipartFile photo = recipientKeden.getPhoto();
                if (!photo.isEmpty()) {
                    try {
                        byte[] photoBytes = photo.getBytes();
                        Image image = new Image(ImageDataFactory.create(photoBytes));

                        // Получаем размеры страницы
                        PdfDocument pdfDocument = document.getPdfDocument();
                        Rectangle pageSize = pdfDocument.getDefaultPageSize();

                        // Вычисляем доступную область (например, 70% от ширины и высоты страницы)
                        float maxWidth = pageSize.getWidth() * 0.5f;
                        float maxHeight = pageSize.getHeight() * 0.5f;

                        // Получаем размеры изображения
                        float imageWidth = image.getImageWidth();
                        float imageHeight = image.getImageHeight();

                        // Рассчитываем масштаб для сохранения пропорций
                        float widthScale = maxWidth / imageWidth;
                        float heightScale = maxHeight / imageHeight;
                        float scale = Math.min(widthScale, heightScale);

                        // Применяем масштабирование
                        image.scaleAbsolute(imageWidth * scale, imageHeight * scale);

                        // Устанавливаем выравнивание (опционально)
                        //image.setHorizontalAlignment(HorizontalAlignment.CENTER);

                        // Добавляем изображение в документ
                        document.add(image);
                    } catch (IOException e) {
                        throw new KedenAppException("Ошибка при чтении файла фото: " + e.getMessage());
                    }
                }


                /*if (!photo.isEmpty()) {
                    byte[] photoBytes;
                    try {
                        photoBytes = photo.getBytes();
                    } catch (IOException e) {
                        throw new KedenAppException("Ошибка при чтении файла фото:  " + e.getMessage());
                    }
                    Image image = new Image(ImageDataFactory.create(photoBytes));
                    image.scaleToFit(700, 350);
                    document.add(image);
                }*/
                // Закрываем документ
                document.close();

                // сохраняем в файл
                FileOutputStream fos = new FileOutputStream(folderName + "/" + (i+1)  + ".pdf");
                outputStream.writeTo(fos);
                fos.close();
            }
        } catch (Exception e) {
            throw new KedenAppException("Ошибка при генерации PDF:  " + e.getMessage());
        }
    }

    /**
     *
     * @param sender индекс отправителя
     * @return Возвращает строку для поднакладной с данными фирмы отправителя
     */
    private String getSender(int sender) {
        StringBuilder senderText = new StringBuilder();
        switch (sender) {
            case 1 -> {
                senderText
                        .append("От кого\n\n")
                        .append("OEC GMBH\n")
                        .append("Detmold FREILIGRATHSTRAßE 7\n")
                        .append("Germany");
            }
            case 2 -> {
                senderText
                        .append("От кого\n\n")
                        .append("OST EXPRESS COURIER GMBH\n")
                        .append("Detmold DENKMAL STR. 11\n")
                        .append("Germany");
            }
            case 3 -> {
                senderText
                        .append("От кого\n\n")
                        .append("FTL GMBH\n")
                        .append("SCHONECK KONRAD-ZUSE-RING 15A\n")
                        .append("Germany");
            }
        }
        return senderText.toString();
    }
}
