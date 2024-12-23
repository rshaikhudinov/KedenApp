
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию о ссылке на нормативный правовой акт международного права
 * 
 * <p>Java class for LegalActReferenceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegalActReferenceDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}LegalActKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}LegalActKindName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}LegalActName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}LegalActId"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}LegalActCreationDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AuthorityId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AuthorityName" minOccurs="0"/&gt;
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
@XmlType(name = "LegalActReferenceDetailsType", propOrder = {
    "legalActKindCode",
    "legalActKindName",
    "legalActName",
    "legalActId",
    "legalActCreationDate",
    "authorityId",
    "authorityName",
    "eaeuDocIssuerId",
    "eaeuDocIssuerName"
})
public class LegalActReferenceDetailsType {

    @XmlElement(name = "LegalActKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String legalActKindCode;
    @XmlElement(name = "LegalActKindName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String legalActKindName;
    @XmlElement(name = "LegalActName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String legalActName;
    @XmlElement(name = "LegalActId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String legalActId;
    @XmlElement(name = "LegalActCreationDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar legalActCreationDate;
    @XmlElement(name = "AuthorityId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authorityId;
    @XmlElement(name = "AuthorityName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authorityName;
    @XmlElement(name = "EAEUDocIssuerId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eaeuDocIssuerId;
    @XmlElement(name = "EAEUDocIssuerName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eaeuDocIssuerName;

    /**
     * Gets the value of the legalActKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalActKindCode() {
        return legalActKindCode;
    }

    /**
     * Sets the value of the legalActKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalActKindCode(String value) {
        this.legalActKindCode = value;
    }

    /**
     * Gets the value of the legalActKindName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalActKindName() {
        return legalActKindName;
    }

    /**
     * Sets the value of the legalActKindName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalActKindName(String value) {
        this.legalActKindName = value;
    }

    /**
     * Gets the value of the legalActName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalActName() {
        return legalActName;
    }

    /**
     * Sets the value of the legalActName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalActName(String value) {
        this.legalActName = value;
    }

    /**
     * Gets the value of the legalActId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalActId() {
        return legalActId;
    }

    /**
     * Sets the value of the legalActId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalActId(String value) {
        this.legalActId = value;
    }

    /**
     * Gets the value of the legalActCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLegalActCreationDate() {
        return legalActCreationDate;
    }

    /**
     * Sets the value of the legalActCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLegalActCreationDate(XMLGregorianCalendar value) {
        this.legalActCreationDate = value;
    }

    /**
     * Gets the value of the authorityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityId() {
        return authorityId;
    }

    /**
     * Sets the value of the authorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityId(String value) {
        this.authorityId = value;
    }

    /**
     * Gets the value of the authorityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityName() {
        return authorityName;
    }

    /**
     * Sets the value of the authorityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityName(String value) {
        this.authorityName = value;
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
