
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о служебной ометке
 * 
 * <p>Java class for ATDServiceInfoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDServiceInfoDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ServiceMarkText"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPersonDetails"/&gt;
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
@XmlType(name = "ATDServiceInfoDetailsType", propOrder = {
    "serviceMarkText",
    "customsPersonDetails",
    "eventDate"
})
public class ATDServiceInfoDetailsType {

    @XmlElement(name = "ServiceMarkText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected String serviceMarkText;
    @XmlElement(name = "CustomsPersonDetails", required = true)
    protected CustomsPersonDetailsType customsPersonDetails;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;

    /**
     * Служебная отметка
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceMarkText() {
        return serviceMarkText;
    }

    /**
     * Sets the value of the serviceMarkText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceMarkText(String value) {
        this.serviceMarkText = value;
    }

    /**
     * Сведения о сотруднике таможни, сделавшем служебную отметку
     * 
     * @return
     *     possible object is
     *     {@link CustomsPersonDetailsType }
     *     
     */
    public CustomsPersonDetailsType getCustomsPersonDetails() {
        return customsPersonDetails;
    }

    /**
     * Sets the value of the customsPersonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsPersonDetailsType }
     *     
     */
    public void setCustomsPersonDetails(CustomsPersonDetailsType value) {
        this.customsPersonDetails = value;
    }

    /**
     * Дата создания служебной отметки
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
