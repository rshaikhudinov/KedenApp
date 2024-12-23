
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Детализированное описание ошибки, выявленной в результате входного контроля электронного документа (сведений)
 * 
 * <p>Java class for EDocErrorDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDocErrorDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EDocErrorCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EDocErrorText"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EDocDetailedErrorText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EDocElementText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDocErrorDetailsType", propOrder = {
    "eDocErrorCode",
    "eDocErrorText",
    "eDocDetailedErrorText",
    "eDocElementText"
})
public class EDocErrorDetailsType {

    @XmlElement(name = "EDocErrorCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eDocErrorCode;
    @XmlElement(name = "EDocErrorText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected String eDocErrorText;
    @XmlElement(name = "EDocDetailedErrorText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String eDocDetailedErrorText;
    @XmlElement(name = "EDocElementText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String eDocElementText;

    /**
     * Gets the value of the eDocErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocErrorCode() {
        return eDocErrorCode;
    }

    /**
     * Sets the value of the eDocErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocErrorCode(String value) {
        this.eDocErrorCode = value;
    }

    /**
     * Gets the value of the eDocErrorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocErrorText() {
        return eDocErrorText;
    }

    /**
     * Sets the value of the eDocErrorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocErrorText(String value) {
        this.eDocErrorText = value;
    }

    /**
     * Gets the value of the eDocDetailedErrorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocDetailedErrorText() {
        return eDocDetailedErrorText;
    }

    /**
     * Sets the value of the eDocDetailedErrorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocDetailedErrorText(String value) {
        this.eDocDetailedErrorText = value;
    }

    /**
     * Gets the value of the eDocElementText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocElementText() {
        return eDocElementText;
    }

    /**
     * Sets the value of the eDocElementText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocElementText(String value) {
        this.eDocElementText = value;
    }

}
