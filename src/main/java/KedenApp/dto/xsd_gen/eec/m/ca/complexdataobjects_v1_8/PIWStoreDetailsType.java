
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о припасах перемещаемых на железнодорожном транспорте
 * 
 * <p>Java class for PIWStoreDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIWStoreDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}StoreIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIWStoreDetailsType", propOrder = {
    "storeIndicator"
})
public class PIWStoreDetailsType {

    @XmlElement(name = "StoreIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean storeIndicator;

    /**
     * признак наличия припасов на борту транспортного средства
     * 
     */
    public Boolean isStoreIndicator() {
        return storeIndicator;
    }

    /**
     * Sets the value of the storeIndicator property.
     * 
     */
    public void setStoreIndicator(Boolean value) {
        this.storeIndicator = value;
    }

}
