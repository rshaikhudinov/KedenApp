
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Фактический вывоз товаров. Сведения о вывозимом товаре
 * 
 * <p>Java class for FEGoodsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEGoodsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FEGoodsInfoDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEGoodsDetailsType", propOrder = {
    "feGoodsInfoDetails",
    "caDocDetails"
})
public class FEGoodsDetailsType {

    @XmlElement(name = "FEGoodsInfoDetails", required = true)
    protected FEGoodsInfoDetailsType feGoodsInfoDetails;
    @XmlElement(name = "CADocDetails")
    protected List<CADocDetailsType> caDocDetails;

    /**
     * Сведения о товаре при фактическом вывозе
     * 
     * @return
     *     possible object is
     *     {@link FEGoodsInfoDetailsType }
     *     
     */
    public FEGoodsInfoDetailsType getFEGoodsInfoDetails() {
        return feGoodsInfoDetails;
    }

    /**
     * Sets the value of the feGoodsInfoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FEGoodsInfoDetailsType }
     *     
     */
    public void setFEGoodsInfoDetails(FEGoodsInfoDetailsType value) {
        this.feGoodsInfoDetails = value;
    }

    /**
     * Сведения о представленных документах Gets the value of the caDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the caDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCADocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CADocDetailsType }
     * 
     * 
     */
    public List<CADocDetailsType> getCADocDetails() {
        if (caDocDetails == null) {
            caDocDetails = new ArrayList<CADocDetailsType>();
        }
        return this.caDocDetails;
    }

}
