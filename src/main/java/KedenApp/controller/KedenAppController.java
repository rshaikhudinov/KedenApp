package KedenApp.controller;

import KedenApp.service.RatesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.math.BigDecimal;
import java.util.Objects;

@Controller
@Slf4j
@RequiredArgsConstructor
public class KedenAppController {

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
}
