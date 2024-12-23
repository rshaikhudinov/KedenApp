
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.EAEUDocKindCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию об акте органа Союза
 * 
 * <p>Java class for EAEUDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EAEUDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EAEUDocKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EAEUDocName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EAEUDocId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EAEUDocCreationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EAEUDocEffectiveDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EAEUDocValidityDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EAEUDocIssuerId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EAEUDocIssuerName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EAEUDocDetailsType", propOrder = {
    "eaeuDocKindCode",
    "eaeuDocName",
    "eaeuDocId",
    "eaeuDocCreationDate",
    "eaeuDocEffectiveDate",
    "eaeuDocValidityDate",
    "descriptionText",
    "eaeuDocIssuerId",
    "eaeuDocIssuerName"
})
public class EAEUDocDetailsType {

    @XmlElement(name = "EAEUDocKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected EAEUDocKindCodeType eaeuDocKindCode;
    @XmlElement(name = "EAEUDocName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eaeuDocName;
    @XmlElement(name = "EAEUDocId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eaeuDocId;
    @XmlElement(name = "EAEUDocCreationDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eaeuDocCreationDate;
    @XmlElement(name = "EAEUDocEffectiveDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eaeuDocEffectiveDate;
    @XmlElement(name = "EAEUDocValidityDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eaeuDocValidityDate;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;
    @XmlElement(name = "EAEUDocIssuerId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eaeuDocIssuerId;
    @XmlElement(name = "EAEUDocIssuerName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eaeuDocIssuerName;

    /**
     * Gets the value of the eaeuDocKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link EAEUDocKindCodeType }
     *     
     */
    public EAEUDocKindCodeType getEAEUDocKindCode() {
        return eaeuDocKindCode;
    }

    /**
     * Sets the value of the eaeuDocKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAEUDocKindCodeType }
     *     
     */
    public void setEAEUDocKindCode(EAEUDocKindCodeType value) {
        this.eaeuDocKindCode = value;
    }

    /**
     * Gets the value of the eaeuDocName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAEUDocName() {
        return eaeuDocName;
    }

    /**
     * Sets the value of the eaeuDocName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAEUDocName(String value) {
        this.eaeuDocName = value;
    }

    /**
     * Gets the value of the eaeuDocId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAEUDocId() {
        return eaeuDocId;
    }

    /**
     * Sets the value of the eaeuDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAEUDocId(String value) {
        this.eaeuDocId = value;
    }

    /**
     * Gets the value of the eaeuDocCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEAEUDocCreationDate() {
        return eaeuDocCreationDate;
    }

    /**
     * Sets the value of the eaeuDocCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEAEUDocCreationDate(XMLGregorianCalendar value) {
        this.eaeuDocCreationDate = value;
    }

    /**
     * Gets the value of the eaeuDocEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEAEUDocEffectiveDate() {
        return eaeuDocEffectiveDate;
    }

    /**
     * Sets the value of the eaeuDocEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEAEUDocEffectiveDate(XMLGregorianCalendar value) {
        this.eaeuDocEffectiveDate = value;
    }

    /**
     * Gets the value of the eaeuDocValidityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEAEUDocValidityDate() {
        return eaeuDocValidityDate;
    }

    /**
     * Sets the value of the eaeuDocValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEAEUDocValidityDate(XMLGregorianCalendar value) {
        this.eaeuDocValidityDate = value;
    }

    /**
     * Описание акта органа Союза
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

    /**
     * Gets the value of the eaeuDocIssuerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAEUDocIssuerId() {
        return eaeuDocIssuerId;
    }

    /**
     * Sets the value of the eaeuDocIssuerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAEUDocIssuerId(String value) {
        this.eaeuDocIssuerId = value;
    }

    /**
     * Gets the value of the eaeuDocIssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAEUDocIssuerName() {
        return eaeuDocIssuerName;
    }

    /**
     * Sets the value of the eaeuDocIssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAEUDocIssuerName(String value) {
        this.eaeuDocIssuerName = value;
    }

}
