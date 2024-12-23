
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
 * Сведения о нормативном правовом акте
 * 
 * <p>Java class for CALegalActDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CALegalActDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}LegalActName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}LegalActId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}LegalActCreationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LegalActArticleId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LegalActPositionId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LegalActSubPositionId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CALegalActDetailsType", propOrder = {
    "legalActName",
    "legalActId",
    "legalActCreationDate",
    "legalActArticleId",
    "legalActPositionId",
    "legalActSubPositionId"
})
public class CALegalActDetailsType {

    @XmlElement(name = "LegalActName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String legalActName;
    @XmlElement(name = "LegalActId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String legalActId;
    @XmlElement(name = "LegalActCreationDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar legalActCreationDate;
    @XmlElement(name = "LegalActArticleId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String legalActArticleId;
    @XmlElement(name = "LegalActPositionId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String legalActPositionId;
    @XmlElement(name = "LegalActSubPositionId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String legalActSubPositionId;

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
     * Gets the value of the legalActArticleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalActArticleId() {
        return legalActArticleId;
    }

    /**
     * Sets the value of the legalActArticleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalActArticleId(String value) {
        this.legalActArticleId = value;
    }

    /**
     * Gets the value of the legalActPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalActPositionId() {
        return legalActPositionId;
    }

    /**
     * Sets the value of the legalActPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalActPositionId(String value) {
        this.legalActPositionId = value;
    }

    /**
     * Gets the value of the legalActSubPositionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalActSubPositionId() {
        return legalActSubPositionId;
    }

    /**
     * Sets the value of the legalActSubPositionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalActSubPositionId(String value) {
        this.legalActSubPositionId = value;
    }

}
