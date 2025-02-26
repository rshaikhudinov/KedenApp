
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие цифровое обозначение кода ТН ВЭД ЕАЭС
 * 
 * <p>Java class for TNVEDCodeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TNVEDCodeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TNVDSectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TNVDGroupCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TNVDPositionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TNVDGSSubPositionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TNVDEUSubPositionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TNVDCISSubPositionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TNVDNationalSubPositionCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TNVEDCodeDetailsType", propOrder = {
    "tnvdSectionCode",
    "tnvdGroupCode",
    "tnvdPositionCode",
    "tnvdgsSubPositionCode",
    "tnvdeuSubPositionCode",
    "tnvdcisSubPositionCode",
    "tnvdNationalSubPositionCode"
})
public class TNVEDCodeDetailsType {

    @XmlElement(name = "TNVDSectionCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tnvdSectionCode;
    @XmlElement(name = "TNVDGroupCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tnvdGroupCode;
    @XmlElement(name = "TNVDPositionCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tnvdPositionCode;
    @XmlElement(name = "TNVDGSSubPositionCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tnvdgsSubPositionCode;
    @XmlElement(name = "TNVDEUSubPositionCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tnvdeuSubPositionCode;
    @XmlElement(name = "TNVDCISSubPositionCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tnvdcisSubPositionCode;
    @XmlElement(name = "TNVDNationalSubPositionCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tnvdNationalSubPositionCode;

    /**
     * Gets the value of the tnvdSectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNVDSectionCode() {
        return tnvdSectionCode;
    }

    /**
     * Sets the value of the tnvdSectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNVDSectionCode(String value) {
        this.tnvdSectionCode = value;
    }

    /**
     * Gets the value of the tnvdGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNVDGroupCode() {
        return tnvdGroupCode;
    }

    /**
     * Sets the value of the tnvdGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNVDGroupCode(String value) {
        this.tnvdGroupCode = value;
    }

    /**
     * Gets the value of the tnvdPositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNVDPositionCode() {
        return tnvdPositionCode;
    }

    /**
     * Sets the value of the tnvdPositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNVDPositionCode(String value) {
        this.tnvdPositionCode = value;
    }

    /**
     * Gets the value of the tnvdgsSubPositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNVDGSSubPositionCode() {
        return tnvdgsSubPositionCode;
    }

    /**
     * Sets the value of the tnvdgsSubPositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNVDGSSubPositionCode(String value) {
        this.tnvdgsSubPositionCode = value;
    }

    /**
     * Gets the value of the tnvdeuSubPositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNVDEUSubPositionCode() {
        return tnvdeuSubPositionCode;
    }

    /**
     * Sets the value of the tnvdeuSubPositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNVDEUSubPositionCode(String value) {
        this.tnvdeuSubPositionCode = value;
    }

    /**
     * Gets the value of the tnvdcisSubPositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNVDCISSubPositionCode() {
        return tnvdcisSubPositionCode;
    }

    /**
     * Sets the value of the tnvdcisSubPositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNVDCISSubPositionCode(String value) {
        this.tnvdcisSubPositionCode = value;
    }

    /**
     * Gets the value of the tnvdNationalSubPositionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNVDNationalSubPositionCode() {
        return tnvdNationalSubPositionCode;
    }

    /**
     * Sets the value of the tnvdNationalSubPositionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNVDNationalSubPositionCode(String value) {
        this.tnvdNationalSubPositionCode = value;
    }

}
