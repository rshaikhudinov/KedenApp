package KedenApp.controller;

import KedenApp.core.KedenAppException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Controller
@Slf4j
@RequiredArgsConstructor
public class PdfController {

    @PostMapping("/generatePdf")
    public ResponseEntity<byte[]> generatePdf(
            @RequestParam("fullName") String fullName,
            @RequestParam("photo") MultipartFile photo) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, outputStream);
            document.open();
            if (!photo.isEmpty()) {
                byte[] photoBytes;
                try {
                    photoBytes = photo.getBytes();
                } catch (IOException e) {
                    throw new KedenAppException("Ошибка при чтении файла фото :  " + e.getMessage());
                }
                Image image = Image.getInstance(photoBytes);
                document.add(image);
            }
            document.add(new Paragraph("ФИО: " + fullName));
            document.close();
        } catch (DocumentException | IOException e) {
            throw new KedenAppException("Ошибка при генерации PDF :  " + e.getMessage());
        }

        // Создание заголовков ответа
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=generated.pdf");
        headers.add("Content-Type", "application/pdf");

        return new ResponseEntity<>(outputStream.toByteArray(), headers, HttpStatus.OK);
    }
}