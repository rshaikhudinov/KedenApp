
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты представляющие сведения о выпуске автомобилей в свободное обращение (для внутреннего потребления)
 * 
 * <p>Java class for ImportCarInfoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportCarInfoDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDeclarationIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsReceiptIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PassengerDeclarationIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsReleaseIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FLAvtoDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportCarInfoDetailsType", propOrder = {
    "unifiedCountryCode",
    "customsDeclarationIdDetails",
    "customsReceiptIdDetails",
    "passengerDeclarationIdDetails",
    "goodsReleaseIdDetails",
    "flAvtoDetails"
})
public class ImportCarInfoDetailsType {

    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "CustomsDeclarationIdDetails")
    protected CustomsDocumentIdDetailsType customsDeclarationIdDetails;
    @XmlElement(name = "CustomsReceiptIdDetails")
    protected CustomsReceiptIdDetailsType customsReceiptIdDetails;
    @XmlElement(name = "PassengerDeclarationIdDetails")
    protected PassengerDeclarationIdDetailsType passengerDeclarationIdDetails;
    @XmlElement(name = "GoodsReleaseIdDetails")
    protected GoodsReleaseIdDetailsType goodsReleaseIdDetails;
    @XmlElement(name = "FLAvtoDetails", required = true)
    protected List<FLAvtoDetailsType> flAvtoDetails;

    /**
     * Код государства-члена, представившего сведения
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public UnifiedCountryCodeType getUnifiedCountryCode() {
        return unifiedCountryCode;
    }

    /**
     * Sets the value of the unifiedCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public void setUnifiedCountryCode(UnifiedCountryCodeType value) {
        this.unifiedCountryCode = value;
    }

    /**
     * регистрационный номер декларации на товары
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public CustomsDocumentIdDetailsType getCustomsDeclarationIdDetails() {
        return customsDeclarationIdDetails;
    }

    /**
     * Sets the value of the customsDeclarationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public void setCustomsDeclarationIdDetails(CustomsDocumentIdDetailsType value) {
        this.customsDeclarationIdDetails = value;
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
     * Gets the value of the passengerDeclarationIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerDeclarationIdDetailsType }
     *     
     */
    public PassengerDeclarationIdDetailsType getPassengerDeclarationIdDetails() {
        return passengerDeclarationIdDetails;
    }

    /**
     * Sets the value of the passengerDeclarationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerDeclarationIdDetailsType }
     *     
     */
    public void setPassengerDeclarationIdDetails(PassengerDeclarationIdDetailsType value) {
        this.passengerDeclarationIdDetails = value;
    }

    /**
     * Gets the value of the goodsReleaseIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsReleaseIdDetailsType }
     *     
     */
    public GoodsReleaseIdDetailsType getGoodsReleaseIdDetails() {
        return goodsReleaseIdDetails;
    }

    /**
     * Sets the value of the goodsReleaseIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsReleaseIdDetailsType }
     *     
     */
    public void setGoodsReleaseIdDetails(GoodsReleaseIdDetailsType value) {
        this.goodsReleaseIdDetails = value;
    }

    /**
     * Gets the value of the flAvtoDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the flAvtoDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFLAvtoDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FLAvtoDetailsType }
     * 
     * 
     */
    public List<FLAvtoDetailsType> getFLAvtoDetails() {
        if (flAvtoDetails == null) {
            flAvtoDetails = new ArrayList<FLAvtoDetailsType>();
        }
        return this.flAvtoDetails;
    }

}
