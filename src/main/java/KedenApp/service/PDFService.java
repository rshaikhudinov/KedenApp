package KedenApp.service;

import KedenApp.core.KedenAppException;
import com.itextpdf.layout.properties.TextAlignment;
import com.itextpdf.layout.properties.UnitValue;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import org.springframework.http.HttpHeaders;
import java.io.ByteArrayOutputStream;

@Service
@Slf4j
@RequiredArgsConstructor
public class PDFService {


    public ResponseEntity<byte[]> generatePdf(String fullName, MultipartFile photo) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            PdfDocument pdfDoc = new PdfDocument(new PdfWriter(outputStream));
            Document document = new Document(pdfDoc);

            // Создаем таблицу для основной части
            Table table = new Table(UnitValue.createPercentArray(new float[]{1, 1}));
            table.setWidth(UnitValue.createPercentValue(100));

            // Первый столбец: информация в 4 блоках
            String block1 = "Количество посылок\n2 шт";
            String block2 = "Количество мест\n2";
            String block3 = "Общий вес\n4 кг";
            String block4 = "Общая стоимость\n45$";
            String column1Content = String.join("\n", block1, block2, block3, block4);
            table.addCell(new Paragraph(column1Content).setTextAlignment(TextAlignment.LEFT));

            // Второй столбец: два абзаца текста
            String col2Text1 = "Я подтверждаю, что отправление не содержит предметы, запрещенные к пересылке. " +
                    "С правилами пересылки ознакомлен.";
            String col2Text2 = "Я подтверждаю, что мною прочитан договор оферты, подписан с помощью электронной " +
                    "подписи посредством электронного кабинета, находящегося на сайте транспортной " +
                    "компании, предоставившей услугу по доставке товара.";
            table.addCell(new Paragraph(col2Text1 + "\n\n" + col2Text2).setTextAlignment(TextAlignment.LEFT));

            // Добавляем таблицу в документ
            document.add(table);

            // Подписи в правом углу под таблицей
            Table signaturesTable = new Table(UnitValue.createPercentArray(new float[]{1, 1}));
            signaturesTable.setWidth(UnitValue.createPercentValue(100));

            signaturesTable.addCell(new Paragraph("Фирма 1")
                    .setTextAlignment(TextAlignment.RIGHT)
                    .setMarginTop(20));
            signaturesTable.addCell(new Paragraph("Подпись получателя")
                    .setTextAlignment(TextAlignment.RIGHT)
                    .setMarginTop(20));

            document.add(signaturesTable);

            // Добавляем надпись в середине страницы
            Paragraph subTitle = new Paragraph("Поднакладная")
                    .setTextAlignment(TextAlignment.CENTER)
                    .setMarginTop(50);
            document.add(subTitle);

            // Закрываем документ
            document.close();

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
