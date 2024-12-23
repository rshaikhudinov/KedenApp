
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
 * Компоненты, представляющие детализированную информацию о событии, связанном со справочником (классификатором)
 * 
 * <p>Java class for CodeListEventDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListEventDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CodeListEventCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}LegalActDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListEventDetailsType", propOrder = {
    "eventDate",
    "codeListEventCode",
    "legalActDetails"
})
public class CodeListEventDetailsType {

    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "CodeListEventCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codeListEventCode;
    @XmlElement(name = "LegalActDetails")
    protected LegalActReferenceDetailsType legalActDetails;

    /**
     * Дата события
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the codeListEventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListEventCode() {
        return codeListEventCode;
    }

    /**
     * Sets the value of the codeListEventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListEventCode(String value) {
        this.codeListEventCode = value;
    }

    /**
     * Сведения об акте, регламентирующем событие
     * 
     * @return
     *     possible object is
     *     {@link LegalActReferenceDetailsType }
     *     
     */
    public LegalActReferenceDetailsType getLegalActDetails() {
        return legalActDetails;
    }

    /**
     * Sets the value of the legalActDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalActReferenceDetailsType }
     *     
     */
    public void setLegalActDetails(LegalActReferenceDetailsType value) {
        this.legalActDetails = value;
    }

}
