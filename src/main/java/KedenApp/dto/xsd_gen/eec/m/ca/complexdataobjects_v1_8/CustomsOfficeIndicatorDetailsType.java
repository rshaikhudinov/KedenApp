
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о компетенциях таможенного органа
 * 
 * <p>Java class for CustomsOfficeIndicatorDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsOfficeIndicatorDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DeclarationRegistryAuthorityCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReservedCustomsOfficeIndicatorCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ATACarnetAuthorityCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EDeclarationCustomsOfficeListCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}FECustomsOfficeListCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsOfficeIndicatorDetailsType", propOrder = {
    "declarationRegistryAuthorityCode",
    "reservedCustomsOfficeIndicatorCode",
    "ataCarnetAuthorityCode",
    "eDeclarationCustomsOfficeListCode",
    "feCustomsOfficeListCode"
})
public class CustomsOfficeIndicatorDetailsType {

    @XmlElement(name = "DeclarationRegistryAuthorityCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String declarationRegistryAuthorityCode;
    @XmlElement(name = "ReservedCustomsOfficeIndicatorCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reservedCustomsOfficeIndicatorCode;
    @XmlElement(name = "ATACarnetAuthorityCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ataCarnetAuthorityCode;
    @XmlElement(name = "EDeclarationCustomsOfficeListCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eDeclarationCustomsOfficeListCode;
    @XmlElement(name = "FECustomsOfficeListCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String feCustomsOfficeListCode;

    /**
     * Gets the value of the declarationRegistryAuthorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarationRegistryAuthorityCode() {
        return declarationRegistryAuthorityCode;
    }

    /**
     * Sets the value of the declarationRegistryAuthorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarationRegistryAuthorityCode(String value) {
        this.declarationRegistryAuthorityCode = value;
    }

    /**
     * Gets the value of the reservedCustomsOfficeIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservedCustomsOfficeIndicatorCode() {
        return reservedCustomsOfficeIndicatorCode;
    }

    /**
     * Sets the value of the reservedCustomsOfficeIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservedCustomsOfficeIndicatorCode(String value) {
        this.reservedCustomsOfficeIndicatorCode = value;
    }

    /**
     * Gets the value of the ataCarnetAuthorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATACarnetAuthorityCode() {
        return ataCarnetAuthorityCode;
    }

    /**
     * Sets the value of the ataCarnetAuthorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATACarnetAuthorityCode(String value) {
        this.ataCarnetAuthorityCode = value;
    }

    /**
     * Gets the value of the eDeclarationCustomsOfficeListCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDeclarationCustomsOfficeListCode() {
        return eDeclarationCustomsOfficeListCode;
    }

    /**
     * Sets the value of the eDeclarationCustomsOfficeListCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDeclarationCustomsOfficeListCode(String value) {
        this.eDeclarationCustomsOfficeListCode = value;
    }

    /**
     * Gets the value of the feCustomsOfficeListCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFECustomsOfficeListCode() {
        return feCustomsOfficeListCode;
    }

    /**
     * Sets the value of the feCustomsOfficeListCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFECustomsOfficeListCode(String value) {
        this.feCustomsOfficeListCode = value;
    }

}
