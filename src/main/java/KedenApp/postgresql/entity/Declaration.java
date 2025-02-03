package KedenApp.postgresql.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
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

    @Column(name = "currencyName")
    private String currencyName;

    @Column(name = "currencyRate")
    private BigDecimal currencyRate;

    @ManyToOne
    @JoinColumn(name = "supplierId")
    private Supplier supplier;

    @Column(name = "recipientCompany")
    private int recipientCompany;

    @Id
    @Column(name = "docIdDeclaration")
    private String docIdDeclaration;

    @Column(name = "docCreationDateDeclaration")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate docCreationDateDeclaration;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(
            name = "declaration_recipient",
            joinColumns = @JoinColumn(name = "declaration_id"),
            inverseJoinColumns = @JoinColumn(name = "recipient_iin")
    )
    private List<Recipient> recipients;
}
