package KedenApp.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class TestController {

    @GetMapping("/declaration2")
    public String setDeclaration2(Model model) {
        return "declaration2";
    }


    @GetMapping("/pdfTest")
    public String pdfTest(Model model) {
        return "pdfTest";
    }
}
