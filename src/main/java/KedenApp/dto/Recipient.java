package KedenApp.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Recipient {
    private String fio;
    private String iin;
    private String docId;
    private String docCreationDate;
    private String cityName;
    private String streetName;
    private String regionName;
    private String buildingNumberId;
    private String roomNumberId;
    private String phone;
}
