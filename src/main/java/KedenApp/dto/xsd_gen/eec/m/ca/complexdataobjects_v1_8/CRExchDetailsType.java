
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения из таможенного приходного ордера
 * 
 * <p>Java class for CRExchDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRExchDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CRTypeDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsReceiptIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}AddPageQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CRCurrencyDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CRCommonGoodsInfoDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CRExchGoodsDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CRExchPaymentDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AdditionalInfoText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRExchDetailsType", propOrder = {
    "crTypeDetails",
    "customsReceiptIdDetails",
    "addPageQuantity",
    "crCurrencyDetails",
    "crCommonGoodsInfoDetails",
    "crExchGoodsDetails",
    "crExchPaymentDetails",
    "additionalInfoText"
})
public class CRExchDetailsType {

    @XmlElement(name = "CRTypeDetails", required = true)
    protected CRTypeDetailsType crTypeDetails;
    @XmlElement(name = "CustomsReceiptIdDetails", required = true)
    protected CustomsReceiptIdDetailsType customsReceiptIdDetails;
    @XmlElement(name = "AddPageQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger addPageQuantity;
    @XmlElement(name = "CRCurrencyDetails", required = true)
    protected CRCurrencyDetailsType crCurrencyDetails;
    @XmlElement(name = "CRCommonGoodsInfoDetails", required = true)
    protected CRCommonGoodsInfoDetailsType crCommonGoodsInfoDetails;
    @XmlElement(name = "CRExchGoodsDetails", required = true)
    protected List<CRExchGoodsDetailsType> crExchGoodsDetails;
    @XmlElement(name = "CRExchPaymentDetails", required = true)
    protected List<CRExchPaymentDetailsType> crExchPaymentDetails;
    @XmlElement(name = "AdditionalInfoText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> additionalInfoText;

    /**
     * Gets the value of the crTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CRTypeDetailsType }
     *     
     */
    public CRTypeDetailsType getCRTypeDetails() {
        return crTypeDetails;
    }

    /**
     * Sets the value of the crTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRTypeDetailsType }
     *     
     */
    public void setCRTypeDetails(CRTypeDetailsType value) {
        this.crTypeDetails = value;
    }

    /**
     * Gets the value of the customsReceiptIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsReceiptIdDetailsType }
     *     
     */
    public CustomsReceiptIdDetailsType getCustomsReceiptIdDetails() {
        return customsReceiptIdDetails;
    }

    /**
     * Sets the value of the customsReceiptIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsReceiptIdDetailsType }
     *     
     */
    public void setCustomsReceiptIdDetails(CustomsReceiptIdDetailsType value) {
        this.customsReceiptIdDetails = value;
    }

    /**
     * Gets the value of the addPageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddPageQuantity() {
        return addPageQuantity;
    }

    /**
     * Sets the value of the addPageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddPageQuantity(BigInteger value) {
        this.addPageQuantity = value;
    }

    /**
     * Gets the value of the crCurrencyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CRCurrencyDetailsType }
     *     
     */
    public CRCurrencyDetailsType getCRCurrencyDetails() {
        return crCurrencyDetails;
    }

    /**
     * Sets the value of the crCurrencyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRCurrencyDetailsType }
     *     
     */
    public void setCRCurrencyDetails(CRCurrencyDetailsType value) {
        this.crCurrencyDetails = value;
    }

    /**
     * Gets the value of the crCommonGoodsInfoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CRCommonGoodsInfoDetailsType }
     *     
     */
    public CRCommonGoodsInfoDetailsType getCRCommonGoodsInfoDetails() {
        return crCommonGoodsInfoDetails;
    }

    /**
     * Sets the value of the crCommonGoodsInfoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRCommonGoodsInfoDetailsType }
     *     
     */
    public void setCRCommonGoodsInfoDetails(CRCommonGoodsInfoDetailsType value) {
        this.crCommonGoodsInfoDetails = value;
    }

    /**
     * Gets the value of the crExchGoodsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the crExchGoodsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRExchGoodsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRExchGoodsDetailsType }
     * 
     * 
     */
    public List<CRExchGoodsDetailsType> getCRExchGoodsDetails() {
        if (crExchGoodsDetails == null) {
            crExchGoodsDetails = new ArrayList<CRExchGoodsDetailsType>();
        }
        return this.crExchGoodsDetails;
    }

    /**
     * Gets the value of the crExchPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the crExchPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRExchPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRExchPaymentDetailsType }
     * 
     * 
     */
    public List<CRExchPaymentDetailsType> getCRExchPaymentDetails() {
        if (crExchPaymentDetails == null) {
            crExchPaymentDetails = new ArrayList<CRExchPaymentDetailsType>();
        }
        return this.crExchPaymentDetails;
    }

    /**
     * Представленные документы (дополнительная информация) Gets the value of the additionalInfoText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfoText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfoText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalInfoText() {
        if (additionalInfoText == null) {
            additionalInfoText = new ArrayList<String>();
        }
        return this.additionalInfoText;
    }

}
