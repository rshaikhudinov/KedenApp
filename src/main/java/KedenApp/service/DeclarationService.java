package KedenApp.service;

import KedenApp.core.KedenAppException;
import KedenApp.postgresql.entity.Declaration;
import KedenApp.postgresql.entity.Parcel;
import KedenApp.postgresql.repository.DeclarationRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class DeclarationService {

    private final DeclarationRepository declarationRepository;

    @Transactional
    public Declaration getDeclarationById(String declarationId) {
        try {
            Declaration declaration = declarationRepository.findById(declarationId).orElse(new Declaration());
            declaration.getRecipients().forEach(recipient -> {
                List<Parcel> filteredParcels = recipient.getParcels().stream()
                        .filter(parcel -> parcel.getDeclarationId() != null && parcel.getDeclarationId().equals(declarationId))
                        .collect(Collectors.toList());
                recipient.setParcels(filteredParcels);
            });
            return declaration;
        } catch (Exception e) {
            throw new KedenAppException("Не удалось получить декларацию: " + e.getMessage());
        }
    }

    @Transactional
    public List<Declaration> getDeclarations(){
        return declarationRepository.findAll();
    }
}
