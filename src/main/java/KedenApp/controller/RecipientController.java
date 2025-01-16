package KedenApp.controller;

import KedenApp.postgresql.entity.Recipient;
import KedenApp.service.RecipientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@Slf4j
@RequiredArgsConstructor
public class RecipientController {

    private final RecipientService recipientService;

    @GetMapping("/recipient/{iin}")
    public ResponseEntity<Recipient> getDeclarationById(@PathVariable String iin) {
        return recipientService.getRecipientByIin(iin);
    }
}
