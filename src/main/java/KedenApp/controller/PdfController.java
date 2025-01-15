package KedenApp.controller;

import KedenApp.service.PDFService2;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequiredArgsConstructor
public class PdfController {

    private final PDFService2 pdfService;

    @PostMapping("/generatePdf")
    public ResponseEntity<byte[]> generatePdf(
            @RequestParam("fullName") String fullName,
            @RequestParam("photo") MultipartFile photo) {
        return pdfService.generatePdf(fullName, photo);
    }
}