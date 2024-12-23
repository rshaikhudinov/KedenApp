
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о наличии объектов, их описании и количестве
 * 
 * <p>Java class for ItemAvailabilityDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemAvailabilityDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PresenceIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAvailabilityDetailsType", propOrder = {
    "presenceIndicator",
    "itemDetails"
})
public class ItemAvailabilityDetailsType {

    @XmlElement(name = "PresenceIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean presenceIndicator;
    @XmlElement(name = "ItemDetails")
    protected List<ItemDetailsType> itemDetails;

    /**
     * признак наличия
     * 
     */
    public Boolean isPresenceIndicator() {
        return presenceIndicator;
    }

    /**
     * Sets the value of the presenceIndicator property.
     * 
     */
    public void setPresenceIndicator(Boolean value) {
        this.presenceIndicator = value;
    }

    /**
     * Описание и количество Gets the value of the itemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDetailsType }
     * 
     * 
     */
    public List<ItemDetailsType> getItemDetails() {
        if (itemDetails == null) {
            itemDetails = new ArrayList<ItemDetailsType>();
        }
        return this.itemDetails;
    }

}
