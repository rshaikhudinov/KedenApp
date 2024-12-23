
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения об отвественном хранении
 * 
 * <p>Java class for ATDInformationStorageDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDInformationStorageDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDLocationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDAcceptOfficerDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDInformationStorageDetailsType", propOrder = {
    "eventDate",
    "atdLocationDetails",
    "atdAcceptOfficerDetails"
})
public class ATDInformationStorageDetailsType {

    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "ATDLocationDetails", required = true)
    protected ATDLocationDetailsType atdLocationDetails;
    @XmlElement(name = "ATDAcceptOfficerDetails", required = true)
    protected ATDAcceptOfficerDetailsType atdAcceptOfficerDetails;

    /**
     * Дата принятия на ответственное хранение
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
     * Сведения о месте ответственного хранения
     * 
     * @return
     *     possible object is
     *     {@link ATDLocationDetailsType }
     *     
     */
    public ATDLocationDetailsType getATDLocationDetails() {
        return atdLocationDetails;
    }

    /**
     * Sets the value of the atdLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDLocationDetailsType }
     *     
     */
    public void setATDLocationDetails(ATDLocationDetailsType value) {
        this.atdLocationDetails = value;
    }

    /**
     * Gets the value of the atdAcceptOfficerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDAcceptOfficerDetailsType }
     *     
     */
    public ATDAcceptOfficerDetailsType getATDAcceptOfficerDetails() {
        return atdAcceptOfficerDetails;
    }

    /**
     * Sets the value of the atdAcceptOfficerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDAcceptOfficerDetailsType }
     *     
     */
    public void setATDAcceptOfficerDetails(ATDAcceptOfficerDetailsType value) {
        this.atdAcceptOfficerDetails = value;
    }

}
