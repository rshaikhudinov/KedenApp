
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, предоставляющие информацию о продлении срока временного ввоза ТСЛП (ТСМП)
 * 
 * <p>Java class for TIEExtensionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIEExtensionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ExtensionOperationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CustomsOfficeDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPersonDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TempImportLimitDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIEExtensionDetailsType", propOrder = {
    "eventDate",
    "extensionOperationDetails",
    "customsOfficeDetails",
    "customsPersonDetails",
    "tempImportLimitDate"
})
public class TIEExtensionDetailsType {

    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "ExtensionOperationDetails")
    protected CustomsOperationDetailsType extensionOperationDetails;
    @XmlElement(name = "CustomsOfficeDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected CustomsOfficeDetailsType customsOfficeDetails;
    @XmlElement(name = "CustomsPersonDetails")
    protected CustomsPersonDetailsType customsPersonDetails;
    @XmlElement(name = "TempImportLimitDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tempImportLimitDate;

    /**
     * Дата и время совершения операции по продлению срока временного ввоза транспортного средства
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
     * Gets the value of the extensionOperationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsOperationDetailsType }
     *     
     */
    public CustomsOperationDetailsType getExtensionOperationDetails() {
        return extensionOperationDetails;
    }

    /**
     * Sets the value of the extensionOperationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsOperationDetailsType }
     *     
     */
    public void setExtensionOperationDetails(CustomsOperationDetailsType value) {
        this.extensionOperationDetails = value;
    }

    /**
     * Сведения о таможенном органе, продлившем срок временного ввоза транспортного средства
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
     * Сведения о должностном лице таможенного органа, продлившем срок временного ввоза транспортного средства
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
     * Дата окончания срока временного ввоза транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempImportLimitDate() {
        return tempImportLimitDate;
    }

    /**
     * Sets the value of the tempImportLimitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempImportLimitDate(XMLGregorianCalendar value) {
        this.tempImportLimitDate = value;
    }

}
