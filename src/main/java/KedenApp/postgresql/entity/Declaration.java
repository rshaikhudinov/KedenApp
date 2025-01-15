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
@Table(name = "declaration")
public class Declaration {

    @Id
    private String id;

    @Column(name = "currencyName")
    private String currencyName;

    @Column(name = "currencyRate")
    private BigDecimal currencyRate;

    @ManyToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;

    @Column(name = "recipientCompany")
    private int recipientCompany;

    @Column(name = "docIdDeclaration")
    private String docIdDeclaration;

    @Column(name = "docCreationDateDeclaration")
    private String docCreationDateDeclaration;

    @ManyToMany(cascade = {CascadeType.ALL, CascadeType.ALL})
    @JoinTable(
            name = "declaration_recipient",
            joinColumns = @JoinColumn(name = "declaration_id"),
            inverseJoinColumns = @JoinColumn(name = "recipient_iin")
    )
    private List<Recipient> recipients;

    @OneToMany(mappedBy = "declaration", cascade = CascadeType.ALL)
    private List<Parcel> parcels;
}
