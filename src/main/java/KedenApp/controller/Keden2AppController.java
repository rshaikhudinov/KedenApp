package KedenApp.controller;

import KedenApp.dto.EcHouseShipmentDetailsModel;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequiredArgsConstructor
public class Keden2AppController {



    @GetMapping("/declaration2")
    public String setDeclaration2(Model model) {
        return "declaration2";
    }

    @PostMapping("/submitDeclaration")
    @ResponseBody
    public String submitDeclaration(@ModelAttribute EcHouseShipmentDetailsModel shipmentDetails) {

        return "декларация отправлена";
    }

    @GetMapping("/pdfTest")
    public String pdfTest(Model model) {
        return "pdfTest";
    }
}
