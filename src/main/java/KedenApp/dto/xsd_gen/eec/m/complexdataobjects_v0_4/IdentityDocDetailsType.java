
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.IdentityDocKindCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию об удостоверении личности
 * 
 * <p>Java class for IdentityDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentityDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}IdentityDocKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocKindName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}IdentityDocSeriesId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}IdentityDocNumberId"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocCreationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocValidityDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AuthorityId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AuthorityName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityDocDetailsType", propOrder = {
    "countryCode",
    "identityDocKindCode",
    "docKindName",
    "identityDocSeriesId",
    "identityDocNumberId",
    "docCreationDate",
    "docValidityDate",
    "authorityId",
    "authorityName"
})
public class IdentityDocDetailsType {

    @XmlElement(name = "CountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "IdentityDocKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected IdentityDocKindCodeType identityDocKindCode;
    @XmlElement(name = "DocKindName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docKindName;
    @XmlElement(name = "IdentityDocSeriesId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityDocSeriesId;
    @XmlElement(name = "IdentityDocNumberId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityDocNumberId;
    @XmlElement(name = "DocCreationDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docCreationDate;
    @XmlElement(name = "DocValidityDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docValidityDate;
    @XmlElement(name = "AuthorityId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authorityId;
    @XmlElement(name = "AuthorityName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authorityName;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the identityDocKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityDocKindCodeType }
     *     
     */
    public IdentityDocKindCodeType getIdentityDocKindCode() {
        return identityDocKindCode;
    }

    /**
     * Sets the value of the identityDocKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDocKindCodeType }
     *     
     */
    public void setIdentityDocKindCode(IdentityDocKindCodeType value) {
        this.identityDocKindCode = value;
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
     * Gets the value of the identityDocSeriesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocSeriesId() {
        return identityDocSeriesId;
    }

    /**
     * Sets the value of the identityDocSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityDocSeriesId(String value) {
        this.identityDocSeriesId = value;
    }

    /**
     * Gets the value of the identityDocNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocNumberId() {
        return identityDocNumberId;
    }

    /**
     * Sets the value of the identityDocNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityDocNumberId(String value) {
        this.identityDocNumberId = value;
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
     * Уникальный идентифицирующий признак структурного подразделения уполномоченного органа, выдавшего документ
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
     * Полное наименование структурного подразделения уполномоченного органа, выдавшего документ
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

}
