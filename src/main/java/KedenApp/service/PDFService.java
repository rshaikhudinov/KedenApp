package KedenApp.service;

import KedenApp.core.KedenAppException;
import KedenApp.postgresql.entity.Declaration;
import KedenApp.postgresql.entity.Parcel;
import KedenApp.postgresql.entity.Recipient;
import KedenApp.postgresql.entity.Supplier;
import KedenApp.postgresql.repository.SupplierRepository;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.borders.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Base64;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PDFService {

    private final SupplierRepository supplierRepository;

    /**
     * Метод для генерации файла pdf
     * @param declaration данные декларации
     * @param folderName название папки для сохранения файла
     */
    public void generatePdf(Declaration declaration, String folderName) {
        try {
            List<Recipient> recipients = declaration.getRecipients();
            for (int i = 0; i < recipients.size(); i++) {
                Recipient recipient = recipients.get(i);

                // считаем количество посылок, вес и цену
                List<Parcel> packages = recipient.getParcels();
                BigDecimal unifiedGrossMassMeasureAll = BigDecimal.valueOf(0.0);
                BigDecimal currencyInAmountAll = BigDecimal.valueOf(0.0);
                for (Parcel parcel : packages){
                    unifiedGrossMassMeasureAll = unifiedGrossMassMeasureAll.add(parcel.getUnifiedGrossMassMeasure());
                    currencyInAmountAll = currencyInAmountAll.add(parcel.getCurrencyInAmount());
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
                String block4 = "Общая стоимость\n" + currencyInAmountAll + " " + declaration.getCurrencyName();
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
                tableHeader.addCell(
                        new Cell()
                                .add(new Paragraph("Я подтверждаю, что отправление не содержит предметы, запрещенные к пересылке. " +
                                        "С правилами пересылки ознакомлен.")
                                        .setTextAlignment(TextAlignment.LEFT))
                                .add(new Paragraph("\n\n" + declaration.getSupplier().getCompanyName())
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
                                .add(new Paragraph(getSender(Math.toIntExact(declaration.getSupplier().getId()))))
                                .setTextAlignment(TextAlignment.LEFT)
                );
                tableSenderAndRecipient.addCell(
                        new Cell()
                                .add(new Paragraph(
                                        "Кому\n\n" +
                                                recipient.getFio() + "\n" +
                                                recipient.getStreetName() + ", " +
                                                recipient.getBuildingNumberId() + ", " +
                                                recipient.getRoomNumberId() + ", " +
                                                recipient.getCityName() + "\n" +
                                                recipient.getPhone() + "\n" +
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
                    Parcel parcel = packages.get(j);
                    tablePackages.addCell(
                            new Cell().add(new Paragraph(String.valueOf(j+1)))
                                    .setFontSize(9)
                                    .setTextAlignment(TextAlignment.CENTER)
                                    .setBorder(Border.NO_BORDER)
                    );
                    tablePackages.addCell(
                            new Cell().add(new Paragraph(parcel.getGoodsDescriptionText()))
                                    .setFontSize(7)
                                    .setTextAlignment(TextAlignment.LEFT)
                                    .setBorder(Border.NO_BORDER)
                    );
                    tablePackages.addCell(
                            new Cell().add(new Paragraph(parcel.getUnifiedGrossMassMeasure() + " kg"))
                                    .setFontSize(7)
                                    .setTextAlignment(TextAlignment.CENTER)
                                    .setBorder(Border.NO_BORDER)
                    );
                    tablePackages.addCell(
                            new Cell().add(new Paragraph(parcel.getCurrencyInAmount() + " " + declaration.getCurrencyName()))
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
                        new Cell().add(new Paragraph(currencyInAmountAll + " " + declaration.getCurrencyName()))
                                .setFontSize(10)
                                .setTextAlignment(TextAlignment.CENTER)
                                .setBorder(Border.NO_BORDER)
                                .setBorderTop(new SolidBorder(0.5f))
                );
                document.add(tablePackages);

                // добавляем фото документа и очищаем от лишних символов для html
                String photo = recipient.getPhotoBase64().replaceAll("^data:image/[a-z]+;base64,", "");
                if (!photo.isEmpty()) {
                    byte[] photoBytes = Base64.getDecoder().decode(photo);
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
                }
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
     * @param supplierId индекс отправителя
     * @return Возвращает строку для накладной с данными фирмы отправителя
     */
    private String getSender(int supplierId) {
        Supplier supplier = supplierRepository.findById(supplierId);
        StringBuilder senderText = new StringBuilder();
        String address = "";
        if (supplier.getRegion() != null && !supplier.getRegion().isEmpty() && !supplier.getRegion().equals("-")) {
            address += supplier.getRegion() + " ";
        }
        if (supplier.getCity() != null && !supplier.getCity().isEmpty() && !supplier.getCity().equals("-")) {
            address += supplier.getCity() + " ";
        }
        if (supplier.getStreet() != null && !supplier.getStreet().isEmpty() && !supplier.getStreet().equals("-")) {
            address += supplier.getStreet() + " ";
        }
        if (supplier.getHouse() != null && !supplier.getHouse().isEmpty() && !supplier.getHouse().equals("-")) {
            address += supplier.getHouse() + " ";
        }
        if (supplier.getApartment() != null && !supplier.getApartment().isEmpty() && !supplier.getApartment().equals("-")) {
            address += supplier.getApartment() + " ";
        }
        if (!address.isEmpty()) {
            address = address.trim();
        }
        senderText
                .append("От кого\n\n")
                .append(supplier.getCompanyName()).append("\n")
                .append(address).append("\n")
                .append(supplier.getCountryName());
        return senderText.toString();
    }
}
