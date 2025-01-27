package KedenApp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Controller
@Slf4j
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/pdfTest")
    public String pdfTest() {
        return "pdfTest";
    }

    @GetMapping("/testImg")
    public String getDeclarationHtml(Model model) {
        String previewImage = "";
        try {
            previewImage = new String(Files.readAllBytes(Paths.get("img.txt")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        model.addAttribute("previewImage", previewImage);
        return "testImg";
    }

    @PostMapping("/testSend")
    @ResponseBody
    public String testSend(@RequestBody String previewImage) {
        if (previewImage == null || !previewImage.startsWith("data:image")) {
            return "Invalid image format";
        }

        System.out.println("Received Base64 Image: " + previewImage.substring(0, 30) + "...");

        return "Image received successfully!";
    }
}
