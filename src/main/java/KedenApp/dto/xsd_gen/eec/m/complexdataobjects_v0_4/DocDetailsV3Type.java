
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.math.BigInteger;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию о документе
 * 
 * <p>Java class for DocDetailsV3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocDetailsV3Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocKindName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocSeriesId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocCreationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocValidityDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocValidityDuration" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AuthorityId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AuthorityName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PageQuantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocDetailsV3Type", propOrder = {
    "unifiedCountryCode",
    "docKindCode",
    "docKindName",
    "docName",
    "docSeriesId",
    "docId",
    "docCreationDate",
    "docValidityDate",
    "docValidityDuration",
    "authorityId",
    "authorityName",
    "descriptionText",
    "pageQuantity"
})
public class DocDetailsV3Type {

    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "DocKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type docKindCode;
    @XmlElement(name = "DocKindName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docKindName;
    @XmlElement(name = "DocName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docName;
    @XmlElement(name = "DocSeriesId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docSeriesId;
    @XmlElement(name = "DocId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docId;
    @XmlElement(name = "DocCreationDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docCreationDate;
    @XmlElement(name = "DocValidityDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docValidityDate;
    @XmlElement(name = "DocValidityDuration", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected Duration docValidityDuration;
    @XmlElement(name = "AuthorityId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authorityId;
    @XmlElement(name = "AuthorityName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authorityName;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;
    @XmlElement(name = "PageQuantity", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pageQuantity;

    /**
     * Gets the value of the unifiedCountryCode property.
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
     * Gets the value of the docKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getDocKindCode() {
        return docKindCode;
    }

    /**
     * Sets the value of the docKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setDocKindCode(UnifiedCode20Type value) {
        this.docKindCode = value;
    }

    /**
     * Gets the value of the docKindName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocKindName() {
        return docKindName;
    }

    /**
     * Sets the value of the docKindName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocKindName(String value) {
        this.docKindName = value;
    }

    /**
     * Gets the value of the docName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocName() {
        return docName;
    }

    /**
     * Sets the value of the docName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocName(String value) {
        this.docName = value;
    }

    /**
     * Gets the value of the docSeriesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSeriesId() {
        return docSeriesId;
    }

    /**
     * Sets the value of the docSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocSeriesId(String value) {
        this.docSeriesId = value;
    }

    /**
     * Gets the value of the docId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
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
     * Gets the value of the docValidityDate property.
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

    /**
     * Gets the value of the docValidityDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDocValidityDuration() {
        return docValidityDuration;
    }

    /**
     * Sets the value of the docValidityDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDocValidityDuration(Duration value) {
        this.docValidityDuration = value;
    }

    /**
     * Строка, идентифицирующая орган государственной власти либо уполномоченную им организацию, выдавшую или утвердившую документ
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
     * Полное наименование органа государственной власти либо уполномоченной им организации, выдавшей документ
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
     * Описание документа
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
     * Gets the value of the pageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageQuantity() {
        return pageQuantity;
    }

    /**
     * Sets the value of the pageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageQuantity(BigInteger value) {
        this.pageQuantity = value;
    }

}
