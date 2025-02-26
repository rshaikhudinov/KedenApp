
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxPrefCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Преференции по уплате таможенных платежей
 * 
 * <p>Java class for PreferenceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreferenceDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsClearanceChargesPrefCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsDutyPrefCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExcisePrefCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VATPrefCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferenceDetailsType", propOrder = {
    "customsClearanceChargesPrefCode",
    "customsDutyPrefCode",
    "excisePrefCode",
    "vatPrefCode"
})
public class PreferenceDetailsType {

    @XmlElement(name = "CustomsClearanceChargesPrefCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsTaxPrefCodeType customsClearanceChargesPrefCode;
    @XmlElement(name = "CustomsDutyPrefCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsTaxPrefCodeType customsDutyPrefCode;
    @XmlElement(name = "ExcisePrefCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsTaxPrefCodeType excisePrefCode;
    @XmlElement(name = "VATPrefCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsTaxPrefCodeType vatPrefCode;

    /**
     * Gets the value of the customsClearanceChargesPrefCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTaxPrefCodeType }
     *     
     */
    public CustomsTaxPrefCodeType getCustomsClearanceChargesPrefCode() {
        return customsClearanceChargesPrefCode;
    }

    /**
     * Sets the value of the customsClearanceChargesPrefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTaxPrefCodeType }
     *     
     */
    public void setCustomsClearanceChargesPrefCode(CustomsTaxPrefCodeType value) {
        this.customsClearanceChargesPrefCode = value;
    }

    /**
     * Gets the value of the customsDutyPrefCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTaxPrefCodeType }
     *     
     */
    public CustomsTaxPrefCodeType getCustomsDutyPrefCode() {
        return customsDutyPrefCode;
    }

    /**
     * Sets the value of the customsDutyPrefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTaxPrefCodeType }
     *     
     */
    public void setCustomsDutyPrefCode(CustomsTaxPrefCodeType value) {
        this.customsDutyPrefCode = value;
    }

    /**
     * Gets the value of the excisePrefCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTaxPrefCodeType }
     *     
     */
    public CustomsTaxPrefCodeType getExcisePrefCode() {
        return excisePrefCode;
    }

    /**
     * Sets the value of the excisePrefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTaxPrefCodeType }
     *     
     */
    public void setExcisePrefCode(CustomsTaxPrefCodeType value) {
        this.excisePrefCode = value;
    }

    /**
     * Gets the value of the vatPrefCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTaxPrefCodeType }
     *     
     */
    public CustomsTaxPrefCodeType getVATPrefCode() {
        return vatPrefCode;
    }

    /**
     * Sets the value of the vatPrefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTaxPrefCodeType }
     *     
     */
    public void setVATPrefCode(CustomsTaxPrefCodeType value) {
        this.vatPrefCode = value;
    }

}
