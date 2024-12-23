
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * регистрационный номер (идентификатор) предварительного решения
 * 
 * <p>Java class for PreDecisionIdDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreDecisionIdDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreDecisionKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreDecisionTNVEDCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreDecisionCountryId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocCreationDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocValidityDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreDecisionIdDetailsType", propOrder = {
    "preDecisionKindCode",
    "preDecisionTNVEDCode",
    "preDecisionCountryId",
    "docCreationDate",
    "docValidityDate"
})
public class PreDecisionIdDetailsType {

    @XmlElement(name = "PreDecisionKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String preDecisionKindCode;
    @XmlElement(name = "PreDecisionTNVEDCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String preDecisionTNVEDCode;
    @XmlElement(name = "PreDecisionCountryId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String preDecisionCountryId;
    @XmlElement(name = "DocCreationDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docCreationDate;
    @XmlElement(name = "DocValidityDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docValidityDate;

    /**
     * Gets the value of the preDecisionKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreDecisionKindCode() {
        return preDecisionKindCode;
    }

    /**
     * Sets the value of the preDecisionKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreDecisionKindCode(String value) {
        this.preDecisionKindCode = value;
    }

    /**
     * Gets the value of the preDecisionTNVEDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreDecisionTNVEDCode() {
        return preDecisionTNVEDCode;
    }

    /**
     * Sets the value of the preDecisionTNVEDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreDecisionTNVEDCode(String value) {
        this.preDecisionTNVEDCode = value;
    }

    /**
     * Gets the value of the preDecisionCountryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreDecisionCountryId() {
        return preDecisionCountryId;
    }

    /**
     * Sets the value of the preDecisionCountryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreDecisionCountryId(String value) {
        this.preDecisionCountryId = value;
    }

    /**
     * Gets the value of the docCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocCreationDate() {
        return docCreationDate;
    }

    /**
     * Sets the value of the docCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocCreationDate(XMLGregorianCalendar value) {
        this.docCreationDate = value;
    }

    /**
     * Дата окончания действия предварительного решения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocValidityDate() {
        return docValidityDate;
    }

    /**
     * Sets the value of the docValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocValidityDate(XMLGregorianCalendar value) {
        this.docValidityDate = value;
    }

}
