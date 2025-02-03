package KedenApp.postgresql.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "recipient")
public class Recipient {

    @Id
    @Column(name = "iin")
    private String iin;

    @Column(name = "fio")
    private String fio;

    @Column(name = "docId")
    private String docId;

    @Column(name = "docCreationDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate docCreationDate;

    @Column(name = "cityName")
    private String cityName;

    @Column(name = "streetName")
    private String streetName;

    @Column(name = "regionName")
    private String regionName;

    @Column(name = "buildingNumberId")
    private String buildingNumberId;

    @Column(name = "roomNumberId")
    private String roomNumberId;

    @Column(name = "phone")
    private String phone;

    // для получения с html формы файла pdf
    @Transient
    private MultipartFile photo;

    @Column(name = "photoBase64", columnDefinition = "TEXT")
    private String photoBase64;

    @ManyToMany(mappedBy = "recipients")
    private List<Declaration> declarations;

    @OneToMany(mappedBy = "recipient", cascade = CascadeType.ALL)
    private List<Parcel> parcels;
}
