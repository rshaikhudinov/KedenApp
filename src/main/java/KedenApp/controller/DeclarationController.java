package KedenApp.controller;

import KedenApp.postgresql.entity.EcHouseShipmentDetailsModel;
import KedenApp.postgresql.entity.Supplier;
import KedenApp.postgresql.repository.SupplierRepository;
import KedenApp.service.DeclarationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class DeclarationController {

    private final DeclarationService declarationService;
    private final SupplierRepository supplierRepository;

    /**
     * Метод для страницы заполнения декларации
     * @return declaration.html
     */
    @GetMapping("/declaration")
    public String getDeclarationHtml(Model model) {
        List<Supplier> suppliers = supplierRepository.findAll();
        model.addAttribute("suppliers", suppliers);
        return "declaration";
    }

    /**
     * Метод сохраняет xml файл декларации и pdf файлы накладных получателей
     * @param shipmentDetails данные с формы
     * @return сообщение о результате
     */
    @PostMapping("/createDeclaration")
    @ResponseBody
    public String createDeclaration(@ModelAttribute EcHouseShipmentDetailsModel shipmentDetails) {
        return declarationService.createDeclaration(shipmentDetails);
    }
}
