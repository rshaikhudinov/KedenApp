package KedenApp.controller;

import KedenApp.postgresql.entity.Declaration;
import KedenApp.postgresql.entity.Parcel;
import KedenApp.postgresql.entity.Recipient;
import KedenApp.service.KedenAppService;
import KedenApp.service.RatesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.math.BigDecimal;
import java.util.Objects;

@Controller
@Slf4j
@RequiredArgsConstructor
public class KedenAppController {

    private final KedenAppService kedenAppService;
    private final RatesService ratesService;

    /**
     * Стартовая страница
     * @return index.html
     */
    @GetMapping("/")
    public String index(Model model) {
        BigDecimal usdRate = ratesService.getUsdRate();
        BigDecimal eurRate = ratesService.getEurRate();
        model.addAttribute("usdRate", Objects.requireNonNullElse(usdRate, "Не удалось получить курс"));
        model.addAttribute("eurRate", Objects.requireNonNullElse(eurRate, "Не удалось получить курс"));
        return "index";
    }

    @PostMapping("/submitShipmentDetails")
    @ResponseBody
    public String submitShipmentDetails(@ModelAttribute Declaration shipmentDetails) {
        if (shipmentDetails.getRecipients() != null && !shipmentDetails.getRecipients().isEmpty()) {
            log.info("Текущий курс: {}", shipmentDetails.getCurrencyRate());
            log.info("Recipients:");
            for (Recipient recipient : shipmentDetails.getRecipients()) {
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
                if (recipient.getParcels() != null && !recipient.getParcels().isEmpty()) {
                    for (Parcel parcel : recipient.getParcels()) {
                        log.info("   - Вес посылки: {}", parcel.getUnifiedGrossMassMeasure());
                        log.info("   - Сумма посылки: {}", parcel.getCurrencyInAmount());
                    }
                }
            }
        } else {
            log.info("No recipients provided.");
        }
        return kedenAppService.createDeclaration(shipmentDetails);
    }
}
