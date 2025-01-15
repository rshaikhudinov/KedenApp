package KedenApp.postgresql.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "ec_house_shipment_details")
public class EcHouseShipmentDetailsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "currencyName")
    private String currencyName;

    @Column(name = "currency")
    private BigDecimal currency;

    @Column(name = "supplier")
    private int supplier;

    @Column(name = "recipientCompany")
    private int recipientCompany;

    @Column(name = "docIdDeclaration")
    private String docIdDeclaration;

    @Column(name = "docCreationDateDeclaration")
    private String docCreationDateDeclaration;

    @OneToMany(mappedBy = "declaration", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<RecipientKeden> recipients;
}
