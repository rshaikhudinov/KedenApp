package KedenApp.controller;

import KedenApp.postgresql.entity.Declaration;
import KedenApp.postgresql.entity.Supplier;
import KedenApp.postgresql.repository.DeclarationRepository;
import KedenApp.postgresql.repository.SupplierRepository;
import KedenApp.service.DeclarationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class DeclarationController {

    private final DeclarationService declarationService;
    private final DeclarationRepository declarationRepository;
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
     * Метод для страницы редактирования декларации
     * @return declaration.html
     */
    @GetMapping("/declarationEdit")
    public String declarationEdit(@RequestParam("declarationId") String id, Model model) {
        List<Supplier> suppliers = supplierRepository.findAll();
        model.addAttribute("suppliers", suppliers);
        Declaration declaration = declarationService.getDeclarationById(id);
        model.addAttribute("declaration", declaration);
        return "declarationEdit";
    }

    /**
     *
     * Метод для страницы выбора декларации
     * @return edit.html
     */
    @GetMapping("/edit")
    public String edit(Model model) {
        List<Declaration> declarations = declarationRepository.findAll();
        model.addAttribute("declarations", declarations);
        return "edit";
    }
}
