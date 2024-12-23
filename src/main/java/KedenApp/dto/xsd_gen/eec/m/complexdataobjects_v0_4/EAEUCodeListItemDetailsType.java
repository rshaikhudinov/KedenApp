
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие детализированную информацию о записи справочника (классификатора) общего информационного ресурса Союза
 * 
 * <p>Java class for EAEUCodeListItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EAEUCodeListItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CodeListItemStartDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}StartEAEULegalActDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CodeListItemEndDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}EndEAEULegalActDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EAEUCodeListItemDetailsType", propOrder = {
    "codeListItemStartDate",
    "startEAEULegalActDetails",
    "codeListItemEndDate",
    "endEAEULegalActDetails"
})
public class EAEUCodeListItemDetailsType {

    @XmlElement(name = "CodeListItemStartDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar codeListItemStartDate;
    @XmlElement(name = "StartEAEULegalActDetails")
    protected EAEUDocDetailsType startEAEULegalActDetails;
    @XmlElement(name = "CodeListItemEndDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar codeListItemEndDate;
    @XmlElement(name = "EndEAEULegalActDetails")
    protected EAEUDocDetailsType endEAEULegalActDetails;

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
     *     {@link EAEUDocDetailsType }
     *     
     */
    public EAEUDocDetailsType getStartEAEULegalActDetails() {
        return startEAEULegalActDetails;
    }

    /**
     * Sets the value of the startEAEULegalActDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAEUDocDetailsType }
     *     
     */
    public void setStartEAEULegalActDetails(EAEUDocDetailsType value) {
        this.startEAEULegalActDetails = value;
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
     *     {@link EAEUDocDetailsType }
     *     
     */
    public EAEUDocDetailsType getEndEAEULegalActDetails() {
        return endEAEULegalActDetails;
    }

    /**
     * Sets the value of the endEAEULegalActDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAEUDocDetailsType }
     *     
     */
    public void setEndEAEULegalActDetails(EAEUDocDetailsType value) {
        this.endEAEULegalActDetails = value;
    }

}
