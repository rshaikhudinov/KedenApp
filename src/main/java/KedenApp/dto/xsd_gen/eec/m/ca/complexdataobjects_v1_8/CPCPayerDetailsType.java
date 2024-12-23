
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о плательщике
 * 
 * <p>Java class for CPCPayerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPCPayerDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CASubjectDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}InformationUnknownIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPCPayerDetailsType", propOrder = {
    "informationUnknownIndicator"
})
public class CPCPayerDetailsType
    extends CASubjectDetailsType
{

    @XmlElement(name = "InformationUnknownIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean informationUnknownIndicator;

    /**
     * Gets the value of the informationUnknownIndicator property.
     * 
     */
    public Boolean isInformationUnknownIndicator() {
        return informationUnknownIndicator;
    }

    /**
     * Sets the value of the informationUnknownIndicator property.
     * 
     */
    public void setInformationUnknownIndicator(Boolean value) {
        this.informationUnknownIndicator = value;
    }

}
