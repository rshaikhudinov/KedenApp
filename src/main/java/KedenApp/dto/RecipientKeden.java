package KedenApp.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
public class RecipientKeden {
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
    private List<PackageKeden> packages;
}
