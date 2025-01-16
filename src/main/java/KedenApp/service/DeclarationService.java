package KedenApp.service;

import KedenApp.postgresql.entity.Declaration;
import KedenApp.postgresql.repository.DeclarationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class DeclarationService {

    private final DeclarationRepository declarationRepository;

    public ResponseEntity<Declaration> getDeclarationHtmlById(String id) {
        try {
            Declaration declaration = declarationRepository.findById(id).orElse(null);
            if (declaration != null) {
                return ResponseEntity.ok(declaration);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            log.error("Error getting declaration by id", e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
