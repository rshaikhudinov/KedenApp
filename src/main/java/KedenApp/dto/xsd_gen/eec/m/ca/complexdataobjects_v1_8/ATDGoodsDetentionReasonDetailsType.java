
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * cведения об основании для задержания товаров
 * 
 * <p>Java class for ATDGoodsDetentionReasonDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDGoodsDetentionReasonDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CALegalActDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsDetentionReasonText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDGoodsDetentionReasonDetailsType", propOrder = {
    "caLegalActDetails",
    "goodsDetentionReasonText"
})
public class ATDGoodsDetentionReasonDetailsType {

    @XmlElement(name = "CALegalActDetails")
    protected List<CALegalActDetailsType> caLegalActDetails;
    @XmlElement(name = "GoodsDetentionReasonText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> goodsDetentionReasonText;

    /**
     * Gets the value of the caLegalActDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the caLegalActDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCALegalActDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CALegalActDetailsType }
     * 
     * 
     */
    public List<CALegalActDetailsType> getCALegalActDetails() {
        if (caLegalActDetails == null) {
            caLegalActDetails = new ArrayList<CALegalActDetailsType>();
        }
        return this.caLegalActDetails;
    }

    /**
     * Gets the value of the goodsDetentionReasonText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the goodsDetentionReasonText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsDetentionReasonText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGoodsDetentionReasonText() {
        if (goodsDetentionReasonText == null) {
            goodsDetentionReasonText = new ArrayList<String>();
        }
        return this.goodsDetentionReasonText;
    }

}
