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
    public String editDeclarationHtml(Model model) {
        List<Supplier> suppliers = supplierRepository.findAll();
        model.addAttribute("suppliers", suppliers);
        List<Declaration> declarations = declarationRepository.findAll();
        model.addAttribute("declarations", declarations);
        return "declarationEdit";
    }

    /**
     * Метод для получения декларации по id
     * @return declaration
     */
    @GetMapping("/declaration/{id}")
    public ResponseEntity<Declaration> getDeclarationHtmlById(@PathVariable String id) {
        return declarationService.getDeclarationHtmlById(id);
    }
}
