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
@Table(name = "parcel")
public class Parcel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "commodityCode")
    private String commodityCode;

    @Column(name = "goodsDescriptionText")
    private String goodsDescriptionText;

    @Column(name = "unifiedGrossMassMeasure")
    private BigDecimal unifiedGrossMassMeasure;

    @Column(name = "currencyInAmount")
    private BigDecimal currencyInAmount;

    @ManyToOne
    @JoinColumn(name = "declaration_id")
    private Declaration declaration;

    @ManyToOne
    @JoinColumn(name = "recipient_iin")
    private Recipient recipient;
}
