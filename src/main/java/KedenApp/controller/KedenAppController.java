package KedenApp.controller;

import KedenApp.dto.EcHouseShipmentDetailsModel;
import KedenApp.dto.Recipient;
import KedenApp.service.KedenAppService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Enumeration;

@Controller
@Slf4j
@RequiredArgsConstructor
public class KedenAppController {

    private final KedenAppService kedenAppService;

    @GetMapping("/declaration")
    public String setDeclaration(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "declaration";
    }

    /*@PostMapping("/test")
    public void test(@RequestParam(name="fullName", required=false) String fullName,
                     @RequestParam(name="sender", required=false) int sender,
                     @RequestParam(name="recipient", required=false) int recipient) {
        System.out.println("Полное имя: " + fullName);
        System.out.println("Отправитель: " + sender);
        System.out.println("Получатель: " + recipient);
    }*/

    @PostMapping("/test")
    @ResponseBody
    public String submitShipmentDetails(@ModelAttribute EcHouseShipmentDetailsModel shipmentDetails) {
        if (shipmentDetails.getRecipients() != null && !shipmentDetails.getRecipients().isEmpty()) {
            System.out.println("Recipients:");
            for (Recipient recipient : shipmentDetails.getRecipients()) {
                System.out.println(" - FIO: " + recipient.getFio());
                System.out.println(" - IIN: " + recipient.getIin());
                System.out.println(" - Doc ID: " + recipient.getDocId());
                System.out.println(" - Doc Creation Date: " + recipient.getDocCreationDate());
                System.out.println(" - Region Name: " + recipient.getRegionName());
                System.out.println(" - City Name: " + recipient.getCityName());
                System.out.println(" - Street Name: " + recipient.getStreetName());
                System.out.println(" - Building Number: " + recipient.getBuildingNumberId());
                System.out.println(" - Room Number: " + recipient.getRoomNumberId());
                System.out.println(" - Phone: " + recipient.getPhone());
            }
        } else {
            System.out.println("No recipients provided.");
        }
        kedenAppService.genXml(shipmentDetails);
        return "XML файл успешно сгенерирован";
    }
}
