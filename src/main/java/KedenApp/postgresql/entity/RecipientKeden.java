package KedenApp.postgresql.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "recipient_keden")
public class RecipientKeden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Автоматическая генерация ID
    private Long id; // Добавляем ID (ключевое поле)

    @Column(name = "fio") // Задаем имя колонки (опционально)
    private String fio;

    @Column(name = "iin")
    private String iin;

    @Column(name = "doc_id")
    private String docId;

    @Column(name = "doc_creation_date")
    private String docCreationDate;

    @Column(name = "city_name")
    private String cityName;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "region_name")
    private String regionName;

    @Column(name = "building_number_id")
    private String buildingNumberId;

    @Column(name = "room_number_id")
    private String roomNumberId;

    @Column(name = "phone")
    private String phone;

    @Transient
    private MultipartFile photo;

    @Lob
    @Column(name = "pdf_data")
    private byte[] pdfData;

    @ManyToOne  // в одной декларации много получателей
    @JoinColumn(name = "declaration_id")
    private EcHouseShipmentDetailsModel declaration;

    // у получателя много посылок
    @OneToMany(mappedBy = "recipient", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PackageKeden> packages;
}
