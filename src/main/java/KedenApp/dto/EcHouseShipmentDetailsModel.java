package KedenApp.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;

@Data
@Accessors(chain = true)
public class EcHouseShipmentDetailsModel {

    private String currencyName;
    private BigDecimal currency;
    private int sender;
    private int recipientCompany;
    private List<RecipientKeden> recipients;
}
