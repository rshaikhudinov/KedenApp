
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о товарной партии при заполнении расчета размера обеспечения обязанностей по уплате
 * 
 * <p>Java class for PGCGoodsShipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PGCGoodsShipmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PGCGoodsItemDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PGCGuaranteeDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PGCGoodsShipmentDetailsType", propOrder = {
    "pgcGoodsItemDetails",
    "pgcGuaranteeDetails"
})
public class PGCGoodsShipmentDetailsType {

    @XmlElement(name = "PGCGoodsItemDetails", required = true)
    protected List<PGCGoodsItemDetailsType> pgcGoodsItemDetails;
    @XmlElement(name = "PGCGuaranteeDetails", required = true)
    protected PGCGuaranteeDetailsType pgcGuaranteeDetails;

    /**
     * Gets the value of the pgcGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pgcGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPGCGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PGCGoodsItemDetailsType }
     * 
     * 
     */
    public List<PGCGoodsItemDetailsType> getPGCGoodsItemDetails() {
        if (pgcGoodsItemDetails == null) {
            pgcGoodsItemDetails = new ArrayList<PGCGoodsItemDetailsType>();
        }
        return this.pgcGoodsItemDetails;
    }

    /**
     * Gets the value of the pgcGuaranteeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PGCGuaranteeDetailsType }
     *     
     */
    public PGCGuaranteeDetailsType getPGCGuaranteeDetails() {
        return pgcGuaranteeDetails;
    }

    /**
     * Sets the value of the pgcGuaranteeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PGCGuaranteeDetailsType }
     *     
     */
    public void setPGCGuaranteeDetails(PGCGuaranteeDetailsType value) {
        this.pgcGuaranteeDetails = value;
    }

}
