
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CountryNumber3CodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о ранее оформленных таможенных документах
 * 
 * <p>Java class for CRPreviosDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRPreviosDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CountryN3Code"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CRPreviosCustomsDocKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsReceiptIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDeclarationIdDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRPreviosDocDetailsType", propOrder = {
    "countryN3Code",
    "crPreviosCustomsDocKindCode",
    "customsReceiptIdDetails",
    "customsDeclarationIdDetails"
})
public class CRPreviosDocDetailsType {

    @XmlElement(name = "CountryN3Code", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CountryNumber3CodeType countryN3Code;
    @XmlElement(name = "CRPreviosCustomsDocKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String crPreviosCustomsDocKindCode;
    @XmlElement(name = "CustomsReceiptIdDetails")
    protected CustomsReceiptIdDetailsType customsReceiptIdDetails;
    @XmlElement(name = "CustomsDeclarationIdDetails")
    protected CustomsDocumentIdDetailsType customsDeclarationIdDetails;

    /**
     * Gets the value of the countryN3Code property.
     * 
     * @return
     *     possible object is
     *     {@link CountryNumber3CodeType }
     *     
     */
    public CountryNumber3CodeType getCountryN3Code() {
        return countryN3Code;
    }

    /**
     * Sets the value of the countryN3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryNumber3CodeType }
     *     
     */
    public void setCountryN3Code(CountryNumber3CodeType value) {
        this.countryN3Code = value;
    }

    /**
     * Gets the value of the crPreviosCustomsDocKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRPreviosCustomsDocKindCode() {
        return crPreviosCustomsDocKindCode;
    }

    /**
     * Sets the value of the crPreviosCustomsDocKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRPreviosCustomsDocKindCode(String value) {
        this.crPreviosCustomsDocKindCode = value;
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
     * Gets the value of the customsDeclarationIdDetails property.
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

}
