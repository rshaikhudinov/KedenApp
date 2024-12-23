
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о наступлении обстоятельств, допускающих признание ТСЛП (ТСМП) не находящимся под таможенным контролем
 * 
 * <p>Java class for TIERemovalInfoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIERemovalInfoDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CustomsOfficeDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPersonDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIERemovalDocDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIERemovalInfoDetailsType", propOrder = {
    "eventDate",
    "customsOfficeDetails",
    "customsPersonDetails",
    "tieRemovalDocDetails"
})
public class TIERemovalInfoDetailsType {

    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "CustomsOfficeDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected CustomsOfficeDetailsType customsOfficeDetails;
    @XmlElement(name = "CustomsPersonDetails")
    protected CustomsPersonDetailsType customsPersonDetails;
    @XmlElement(name = "TIERemovalDocDetails")
    protected CADocDetailsType tieRemovalDocDetails;

    /**
     * Дата и время совершения операции по признанию транспортного средства не находящимся под таможенным контролем
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
     * Сведения о таможенном органе, совершившем операцию
     * 
     * @return
     *     possible object is
     *     {@link CustomsOfficeDetailsType }
     *     
     */
    public CustomsOfficeDetailsType getCustomsOfficeDetails() {
        return customsOfficeDetails;
    }

    /**
     * Sets the value of the customsOfficeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsOfficeDetailsType }
     *     
     */
    public void setCustomsOfficeDetails(CustomsOfficeDetailsType value) {
        this.customsOfficeDetails = value;
    }

    /**
     * Сведения о должностном лице таможенного органа, совершившего операцию
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
     * Сведения о документе, подтверждающем наступление обстоятельств, допускающих признание транспортного средства не находящимся под таможенным контролем
     * 
     * @return
     *     possible object is
     *     {@link CADocDetailsType }
     *     
     */
    public CADocDetailsType getTIERemovalDocDetails() {
        return tieRemovalDocDetails;
    }

    /**
     * Sets the value of the tieRemovalDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CADocDetailsType }
     *     
     */
    public void setTIERemovalDocDetails(CADocDetailsType value) {
        this.tieRemovalDocDetails = value;
    }

}
