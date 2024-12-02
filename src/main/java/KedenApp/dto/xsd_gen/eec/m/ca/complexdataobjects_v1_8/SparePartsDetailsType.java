
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о наличии запасных частей или оборудования
 * 
 * <p>Java class for SparePartsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SparePartsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SparePartsIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SparePartsItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SparePartsDetailsType", propOrder = {
    "sparePartsIndicator",
    "sparePartsItemDetails"
})
public class SparePartsDetailsType {

    @XmlElement(name = "SparePartsIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean sparePartsIndicator;
    @XmlElement(name = "SparePartsItemDetails")
    protected List<SparePartsItemDetailsType> sparePartsItemDetails;

    /**
     * Gets the value of the sparePartsIndicator property.
     * 
     */
    public Boolean isSparePartsIndicator() {
        return sparePartsIndicator;
    }

    /**
     * Sets the value of the sparePartsIndicator property.
     * 
     */
    public void setSparePartsIndicator(Boolean value) {
        this.sparePartsIndicator = value;
    }

    /**
     * Gets the value of the sparePartsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sparePartsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSparePartsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SparePartsItemDetailsType }
     * 
     * 
     */
    public List<SparePartsItemDetailsType> getSparePartsItemDetails() {
        if (sparePartsItemDetails == null) {
            sparePartsItemDetails = new ArrayList<SparePartsItemDetailsType>();
        }
        return this.sparePartsItemDetails;
    }

}
