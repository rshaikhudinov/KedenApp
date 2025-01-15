package KedenApp.dto.rates;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)

@XmlAccessorType(XmlAccessType.FIELD)
public class Item {
    @XmlElement(name = "title")
    private String title;

    @XmlElement(name = "pubDate")
    private String pubDate;

    @XmlElement(name = "description")
    private String description;

    @XmlElement(name = "quant")
    private Integer quant;

    @XmlElement(name = "index")
    private String index;

    @XmlElement(name = "change")
    private String change;

    @XmlElement(name = "link")
    private String link;
}
