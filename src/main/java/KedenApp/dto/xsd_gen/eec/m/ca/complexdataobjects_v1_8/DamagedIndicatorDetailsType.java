
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о признаках повреждений
 * 
 * <p>Java class for DamagedIndicatorDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DamagedIndicatorDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DamagedCargoAreaIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DamagedSealIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DamagedIndicatorDetailsType", propOrder = {
    "damagedCargoAreaIndicator",
    "damagedSealIndicator"
})
public class DamagedIndicatorDetailsType {

    @XmlElement(name = "DamagedCargoAreaIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean damagedCargoAreaIndicator;
    @XmlElement(name = "DamagedSealIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean damagedSealIndicator;

    /**
     * Gets the value of the damagedCargoAreaIndicator property.
     * 
     */
    public Boolean isDamagedCargoAreaIndicator() {
        return damagedCargoAreaIndicator;
    }

    /**
     * Sets the value of the damagedCargoAreaIndicator property.
     * 
     */
    public void setDamagedCargoAreaIndicator(Boolean value) {
        this.damagedCargoAreaIndicator = value;
    }

    /**
     * Gets the value of the damagedSealIndicator property.
     * 
     */
    public Boolean isDamagedSealIndicator() {
        return damagedSealIndicator;
    }

    /**
     * Sets the value of the damagedSealIndicator property.
     * 
     */
    public void setDamagedSealIndicator(Boolean value) {
        this.damagedSealIndicator = value;
    }

}
