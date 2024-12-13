package KedenApp.service;

import KedenApp.core.KedenAppException;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.borders.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Service
@Slf4j
@RequiredArgsConstructor
public class PDFService2 {


    public ResponseEntity<byte[]> generatePdf(String fullName, MultipartFile photo) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PdfDocument pdfDoc = new PdfDocument(new PdfWriter(outputStream));
            Document document = new Document(pdfDoc);

            // Загрузка шрифта из ресурсов
            InputStream fontStream = getClass().getClassLoader().getResourceAsStream("static/fonts/Times New Roman.ttf");
            if (fontStream == null) {
                throw new RuntimeException("Шрифт не найден в ресурсах");
            }

            // Преобразование InputStream в массив байтов
            byte[] fontBytes = fontStream.readAllBytes();

            // Создание шрифта из массива байтов
            PdfFont font = PdfFontFactory.createFont(fontBytes, "Cp1251");
            document.setFont(font);

            // Создаем таблицу для основной части
            Table table = new Table(UnitValue.createPercentArray(new float[]{1, 1}));
            table.setWidth(UnitValue.createPercentValue(100));

            // Первая строка: информация в 4 блоках
            String block1 = "Количество посылок\n2 шт";
            String block2 = "Количество мест\n2";
            String block3 = "Общий вес\n4 кг";
            String block4 = "Общая стоимость\n45$";
            Table firstCell = new Table(UnitValue.createPercentArray(new float[]{1, 1, 1, 1}));
            firstCell.setWidth(UnitValue.createPercentValue(100));
            Cell cell1 = new Cell();
            cell1.add(new Paragraph(block1));
            cell1.setBorder(Border.NO_BORDER);
            cell1.setTextAlignment(TextAlignment.CENTER);
            firstCell.addCell(cell1);

            Cell cell2 = new Cell();
            cell2.add(new Paragraph(block2));
            cell2.setBorder(Border.NO_BORDER);
            cell2.setTextAlignment(TextAlignment.CENTER);
            firstCell.addCell(cell2);

            Cell cell3 = new Cell();
            cell3.add(new Paragraph(block3));
            cell3.setBorder(Border.NO_BORDER);
            cell3.setTextAlignment(TextAlignment.CENTER);
            firstCell.addCell(cell3);

            Cell cell4 = new Cell();
            cell4.add(new Paragraph(block4));
            cell4.setBorder(Border.NO_BORDER);
            cell4.setTextAlignment(TextAlignment.CENTER);
            firstCell.addCell(cell4);

            Cell cellFirst = new Cell(1, 2);
            cellFirst.add(firstCell);
            table.addCell(cellFirst);

            // Вторая срока

            Paragraph paragraph1 = new Paragraph( "Я подтверждаю, что отправление не содержит предметы, запрещенные к пересылке. " +
                    "С правилами пересылки ознакомлен.");
            paragraph1.setTextAlignment(TextAlignment.LEFT);
            Paragraph paragraph2 = new Paragraph("\n\nФирма");
            paragraph2.setTextAlignment(TextAlignment.RIGHT);
            Cell cell21 = new Cell();
            cell21.add(paragraph1);
            cell21.add(paragraph2);
            cell21.setFontSize(8);

            Paragraph paragraph3 = new Paragraph("Я подтверждаю, что мною прочитан договор оферты, подписан с помощью электронной " +
                    "подписи посредством электронного кабинета, находящегося на сайте транспортной " +
                    "компании, предоставившей услугу по доставке товара.");
            paragraph3.setTextAlignment(TextAlignment.LEFT);
            Paragraph paragraph4 = new Paragraph("подпись получателя");
            paragraph4.setTextAlignment(TextAlignment.RIGHT);
            Cell cell22 = new Cell();
            cell22.add(paragraph3);
            cell22.add(paragraph4);
            cell22.setFontSize(8);
            table.addCell(cell21);
            table.addCell(cell22);

            // Добавляем таблицу в документ
            document.add(table);

            // Добавляем надпись в середине страницы
            Paragraph subTitle = new Paragraph("Поднакладная")
                    .setTextAlignment(TextAlignment.CENTER);
                    //.setMarginTop(50);
            document.add(subTitle);


            if (!photo.isEmpty()) {
                byte[] photoBytes;
                try {
                    photoBytes = photo.getBytes();
                } catch (IOException e) {
                    throw new KedenAppException("Ошибка при чтении файла фото :  " + e.getMessage());
                }
                Image image = new Image(ImageDataFactory.create(photoBytes));
                image.scaleToFit(700, 350);
                document.add(image);
            }
            // Закрываем документ
            document.close();

            // сохраняем в файл
            FileOutputStream fos = new FileOutputStream("output.pdf");
            outputStream.writeTo(fos);
            fos.close();

            // отдаем на веб страницу
            HttpHeaders headers = new HttpHeaders();
            headers.add("Content-Disposition", "attachment; filename=generated.pdf");
            headers.add("Content-Type", "application/pdf");
            return ResponseEntity.ok()
                    .headers(headers)
                    .body(outputStream.toByteArray());
        } catch (Exception e) {
            throw new KedenAppException("Ошибка при генерации PDF :  " + e.getMessage());
        }
    }
}
