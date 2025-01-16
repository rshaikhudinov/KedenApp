package KedenApp.postgresql.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String docCreationDate;

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

    @JsonIgnore
    @Lob
    @Column(name = "imgData")
    private byte[] imgData;

    @ManyToMany(mappedBy = "recipients")
    private List<Declaration> declarations;

    @OneToMany(mappedBy = "recipient", cascade = CascadeType.ALL)
    private List<Parcel> parcels;
}
