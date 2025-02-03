package KedenApp.service;

import KedenApp.postgresql.entity.Recipient;
import KedenApp.postgresql.repository.RecipientRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class RecipientService {

    private final RecipientRepository recipientRepository;

    @Transactional
    public ResponseEntity<Recipient> getRecipientByIin(String iin) {
        try {
            Recipient recipient = recipientRepository.findById(iin).orElse(null);
            if (recipient != null) {
                return ResponseEntity.ok(recipient);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            log.error("Error getting recipient by iin", e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
