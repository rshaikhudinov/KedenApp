package KedenApp.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class PackageKeden {

    private String commodityCode;
    private String goodsDescriptionText;
    private Double unifiedGrossMassMeasure;
    private Double currencyInAmount;
}
