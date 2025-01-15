package KedenApp.postgresql.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Entity
@Table(name = "package_keden")
public class PackageKeden {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "commodity_code")
    private String commodityCode;

    @Column(name = "goods_description_text")
    private String goodsDescriptionText;

    @Column(name = "unified_gross_mass_measure")
    private BigDecimal unifiedGrossMassMeasure;

    @Column(name = "currency_in_Amount")
    private BigDecimal currencyInAmount;

    @ManyToOne
    @JoinColumn(name = "recipient_id")
    private RecipientKeden recipient;

    @ManyToOne
    @JoinColumn(name = "declaration_id")
    private EcHouseShipmentDetailsModel declaration;
}
