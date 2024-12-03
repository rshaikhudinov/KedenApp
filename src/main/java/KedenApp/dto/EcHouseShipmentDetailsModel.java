package KedenApp.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class EcHouseShipmentDetailsModel {

    private String currencyName;
    private Double currency;
    private int sender;
    private int recipientCompany;
    private List<RecipientKeden> recipients;
}
