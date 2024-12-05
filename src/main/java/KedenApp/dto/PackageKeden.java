package KedenApp.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
public class PackageKeden {

    private String commodityCode;
    private String goodsDescriptionText;
    private BigDecimal unifiedGrossMassMeasure;
    private BigDecimal currencyInAmount;
}
