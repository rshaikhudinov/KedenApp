package KedenApp.dto;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Recipient {
    private String fio;
    private String iin;

}
