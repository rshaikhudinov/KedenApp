package KedenApp.controller;

import KedenApp.dto.EcHouseShipmentDetailsModel;
import KedenApp.dto.PackageKeden;
import KedenApp.dto.RecipientKeden;
import KedenApp.service.KedenAppService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

    @PostMapping("/submitShipmentDetails")
    @ResponseBody
    public String submitShipmentDetails(@ModelAttribute EcHouseShipmentDetailsModel shipmentDetails) {
        if (shipmentDetails.getRecipients() != null && !shipmentDetails.getRecipients().isEmpty()) {
            log.info("Текущий курс: " + shipmentDetails.getCurrency());
            log.info("Recipients:");
            for (RecipientKeden recipient : shipmentDetails.getRecipients()) {
                log.info(" - FIO: {}", recipient.getFio());
                log.info(" - IIN: {}", recipient.getIin());
                log.info(" - Doc ID: {}", recipient.getDocId());
                log.info(" - Doc Creation Date: {}", recipient.getDocCreationDate());
                log.info(" - Region Name: {}", recipient.getRegionName());
                log.info(" - City Name: {}", recipient.getCityName());
                log.info(" - Street Name: {}", recipient.getStreetName());
                log.info(" - Building Number: {}", recipient.getBuildingNumberId());
                log.info(" - Room Number: {}", recipient.getRoomNumberId());
                log.info(" - Phone: {}", recipient.getPhone());
                MultipartFile photo = recipient.getPhoto();
                if (photo != null && !photo.isEmpty()) {
                    log.info("File received: {}", photo.getOriginalFilename());
                }else {
                    log.warn("Photo is null or empty");
                }
                if (recipient.getPackages() != null && !recipient.getPackages().isEmpty()) {
                    for (PackageKeden packageKeden : recipient.getPackages()) {
                        log.info("   - Вес посылки: {}", packageKeden.getUnifiedGrossMassMeasure());
                        log.info("   - Сумма посылки: {}", packageKeden.getCurrencyInAmount());
                    }
                }
            }
        } else {
            log.info("No recipients provided.");
        }

        return kedenAppService.createDeclaration(shipmentDetails);
    }


    @GetMapping("/declaration2")
    public String setDeclaration2(Model model) {
        return "declaration2";
    }

    @GetMapping("/pdfTest")
    public String pdfTest(Model model) {
        return "pdfTest";
    }

    @PostMapping("/submitDeclaration")
    @ResponseBody
    public String submitDeclaration(@ModelAttribute EcHouseShipmentDetailsModel shipmentDetails) {

        return "декларация отправлена";
    }
}
