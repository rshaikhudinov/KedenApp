
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о сотруднике таможни, передавшем товар на ответственное хранение и дате передачи на ответственное хранение
 * 
 * <p>Java class for ATDCustodianDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDCustodianDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDCustomsPersonDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDCustodianDetailsType", propOrder = {
    "atdCustomsPersonDetails",
    "eventDate"
})
public class ATDCustodianDetailsType {

    @XmlElement(name = "ATDCustomsPersonDetails", required = true)
    protected ATDCustomsPersonDetailsType atdCustomsPersonDetails;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;

    /**
     * Gets the value of the atdCustomsPersonDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDCustomsPersonDetailsType }
     *     
     */
    public ATDCustomsPersonDetailsType getATDCustomsPersonDetails() {
        return atdCustomsPersonDetails;
    }

    /**
     * Sets the value of the atdCustomsPersonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDCustomsPersonDetailsType }
     *     
     */
    public void setATDCustomsPersonDetails(ATDCustomsPersonDetailsType value) {
        this.atdCustomsPersonDetails = value;
    }

    /**
     * Дата передачи на ответственное хранение
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

}
