
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о припасах
 * 
 * <p>Java class for StoreDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}StoreIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}StoreItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreDetailsType", propOrder = {
    "storeIndicator",
    "storeItemDetails"
})
public class StoreDetailsType {

    @XmlElement(name = "StoreIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean storeIndicator;
    @XmlElement(name = "StoreItemDetails")
    protected List<StoreItemDetailsType> storeItemDetails;

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

    /**
     * Gets the value of the storeItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the storeItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StoreItemDetailsType }
     * 
     * 
     */
    public List<StoreItemDetailsType> getStoreItemDetails() {
        if (storeItemDetails == null) {
            storeItemDetails = new ArrayList<StoreItemDetailsType>();
        }
        return this.storeItemDetails;
    }

}
