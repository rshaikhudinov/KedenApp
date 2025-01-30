package KedenApp.service;

import KedenApp.core.KedenAppException;
import KedenApp.postgresql.entity.Declaration;
import KedenApp.postgresql.entity.Parcel;
import KedenApp.postgresql.entity.Recipient;
import KedenApp.postgresql.repository.DeclarationRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
            String fileName = "photo.jpg";
            String contentType = "image/jpeg";
            List<Recipient> recipients = declaration.getRecipients();
            List<Recipient> recipientsPhoto = new ArrayList<>();
            for (Recipient recipient : recipients){
                List<Parcel> parcels = recipient.getParcels();
                List<Parcel> parcelsDeclaration = parcels.stream()
                        .filter(parcel -> Optional.ofNullable(parcel.getDeclaration())
                                .map(Declaration::getId)
                                .filter(id -> id.equals(declarationId))
                                .isPresent())
                        .collect(Collectors.toList());
                recipient.setParcels(parcelsDeclaration);
                MultipartFile multipartFile = new MockMultipartFile(
                        fileName,
                        fileName,
                        contentType,
                        recipient.getPhotoBase64().getBytes()
                );
                recipient.setPhoto(multipartFile);
                recipientsPhoto.add(recipient);
            }
            declaration.setRecipients(recipientsPhoto);
            return declaration;
        } catch (Exception e) {
            throw new KedenAppException("Не удалось получить декларацию: " + e.getMessage());
        }
    }
}
