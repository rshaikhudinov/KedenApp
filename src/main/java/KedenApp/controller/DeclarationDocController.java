package KedenApp.controller;

import KedenApp.postgresql.entity.Declaration;
import KedenApp.service.DeclarationDocService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
@RequiredArgsConstructor
public class DeclarationDocController {

    private final DeclarationDocService declarationDocService;

    /**
     * Метод сохраняет xml файл декларации и pdf файлы накладных получателей
     * @param declaration данные с формы
     * @return сообщение о результате
     */
    @PostMapping("/createDeclaration")
    @ResponseBody
    public String createDeclaration(@ModelAttribute Declaration declaration) {
        return declarationDocService.createDeclaration(declaration);
    }
}
