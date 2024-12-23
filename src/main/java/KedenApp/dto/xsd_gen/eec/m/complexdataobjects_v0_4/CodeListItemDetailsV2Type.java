
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие детализированную информацию о записи справочника (классификатора)
 * 
 * <p>Java class for CodeListItemDetailsV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListItemDetailsV2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CodeListItemStartDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}StartLegalActDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CodeListItemEndDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}EndLegalActDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListItemDetailsV2Type", propOrder = {
    "codeListItemStartDate",
    "startLegalActDetails",
    "codeListItemEndDate",
    "endLegalActDetails"
})
public class CodeListItemDetailsV2Type {

    @XmlElement(name = "CodeListItemStartDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar codeListItemStartDate;
    @XmlElement(name = "StartLegalActDetails")
    protected LegalActReferenceDetailsType startLegalActDetails;
    @XmlElement(name = "CodeListItemEndDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar codeListItemEndDate;
    @XmlElement(name = "EndLegalActDetails")
    protected LegalActReferenceDetailsType endLegalActDetails;

    /**
     * Gets the value of the codeListItemStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCodeListItemStartDate() {
        return codeListItemStartDate;
    }

    /**
     * Sets the value of the codeListItemStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCodeListItemStartDate(XMLGregorianCalendar value) {
        this.codeListItemStartDate = value;
    }

    /**
     * Сведения о нормативном правовом акте, регламентирующем начало действия записи справочника (классификатора)
     * 
     * @return
     *     possible object is
     *     {@link LegalActReferenceDetailsType }
     *     
     */
    public LegalActReferenceDetailsType getStartLegalActDetails() {
        return startLegalActDetails;
    }

    /**
     * Sets the value of the startLegalActDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalActReferenceDetailsType }
     *     
     */
    public void setStartLegalActDetails(LegalActReferenceDetailsType value) {
        this.startLegalActDetails = value;
    }

    /**
     * Gets the value of the codeListItemEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCodeListItemEndDate() {
        return codeListItemEndDate;
    }

    /**
     * Sets the value of the codeListItemEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCodeListItemEndDate(XMLGregorianCalendar value) {
        this.codeListItemEndDate = value;
    }

    /**
     * Сведения о нормативном правовом акте, регламентирующем окончание действия записи справочника (классификатора)
     * 
     * @return
     *     possible object is
     *     {@link LegalActReferenceDetailsType }
     *     
     */
    public LegalActReferenceDetailsType getEndLegalActDetails() {
        return endLegalActDetails;
    }

    /**
     * Sets the value of the endLegalActDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalActReferenceDetailsType }
     *     
     */
    public void setEndLegalActDetails(LegalActReferenceDetailsType value) {
        this.endLegalActDetails = value;
    }

}
