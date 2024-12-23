
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о товарной партии
 * 
 * <p>Java class for TMPAGoodsShipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMPAGoodsShipmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TMPAGoodsItemDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FactPaymentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMPAGoodsShipmentDetailsType", propOrder = {
    "tmpaGoodsItemDetails",
    "factPaymentDetails"
})
public class TMPAGoodsShipmentDetailsType {

    @XmlElement(name = "TMPAGoodsItemDetails", required = true)
    protected TMPAGoodsItemDetailsType tmpaGoodsItemDetails;
    @XmlElement(name = "FactPaymentDetails")
    protected List<FactPaymentDetailsType> factPaymentDetails;

    /**
     * Gets the value of the tmpaGoodsItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TMPAGoodsItemDetailsType }
     *     
     */
    public TMPAGoodsItemDetailsType getTMPAGoodsItemDetails() {
        return tmpaGoodsItemDetails;
    }

    /**
     * Sets the value of the tmpaGoodsItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMPAGoodsItemDetailsType }
     *     
     */
    public void setTMPAGoodsItemDetails(TMPAGoodsItemDetailsType value) {
        this.tmpaGoodsItemDetails = value;
    }

    /**
     * Gets the value of the factPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the factPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FactPaymentDetailsType }
     * 
     * 
     */
    public List<FactPaymentDetailsType> getFactPaymentDetails() {
        if (factPaymentDetails == null) {
            factPaymentDetails = new ArrayList<FactPaymentDetailsType>();
        }
        return this.factPaymentDetails;
    }

}
