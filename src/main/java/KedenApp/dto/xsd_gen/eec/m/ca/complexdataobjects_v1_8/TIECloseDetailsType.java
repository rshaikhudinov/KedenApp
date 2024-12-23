
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, предоставляющие информацию о завершении временного ввоза (вывоза) ТСЛП (ТСМП)
 * 
 * <p>Java class for TIECloseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIECloseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTMDocDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PassengerDeclarationIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CloseOperationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsReleaseIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CustomsOfficeDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPersonDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIECloseDetailsType", propOrder = {
    "eventDate",
    "dtmDocDetails",
    "passengerDeclarationIdDetails",
    "closeOperationDetails",
    "goodsReleaseIdDetails",
    "customsOfficeDetails",
    "customsPersonDetails"
})
public class TIECloseDetailsType {

    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "DTMDocDetails")
    protected DTMDocDetailsType dtmDocDetails;
    @XmlElement(name = "PassengerDeclarationIdDetails")
    protected PassengerDeclarationIdDetailsType passengerDeclarationIdDetails;
    @XmlElement(name = "CloseOperationDetails")
    protected CustomsOperationDetailsType closeOperationDetails;
    @XmlElement(name = "GoodsReleaseIdDetails")
    protected GoodsReleaseIdDetailsType goodsReleaseIdDetails;
    @XmlElement(name = "CustomsOfficeDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected CustomsOfficeDetailsType customsOfficeDetails;
    @XmlElement(name = "CustomsPersonDetails")
    protected CustomsPersonDetailsType customsPersonDetails;

    /**
     * Дата и время совершения таможенной операции по завершению временного ввоза (вывоза) транспортного средства
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
     * Сведения о регистрационном номере таможенной декларации на транспортное средство при завершении временного ввоза (вывоза) транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link DTMDocDetailsType }
     *     
     */
    public DTMDocDetailsType getDTMDocDetails() {
        return dtmDocDetails;
    }

    /**
     * Sets the value of the dtmDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTMDocDetailsType }
     *     
     */
    public void setDTMDocDetails(DTMDocDetailsType value) {
        this.dtmDocDetails = value;
    }

    /**
     * Сведения о регистрационном номере пассажирской декларации (для Республики Казахстан), номере разрешения на убытие (для Республики Беларусь) при завершении временного ввоза (вывоза) транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link PassengerDeclarationIdDetailsType }
     *     
     */
    public PassengerDeclarationIdDetailsType getPassengerDeclarationIdDetails() {
        return passengerDeclarationIdDetails;
    }

    /**
     * Sets the value of the passengerDeclarationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerDeclarationIdDetailsType }
     *     
     */
    public void setPassengerDeclarationIdDetails(PassengerDeclarationIdDetailsType value) {
        this.passengerDeclarationIdDetails = value;
    }

    /**
     * Gets the value of the closeOperationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsOperationDetailsType }
     *     
     */
    public CustomsOperationDetailsType getCloseOperationDetails() {
        return closeOperationDetails;
    }

    /**
     * Sets the value of the closeOperationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsOperationDetailsType }
     *     
     */
    public void setCloseOperationDetails(CustomsOperationDetailsType value) {
        this.closeOperationDetails = value;
    }

    /**
     * Номер, присвоенный информационной системой таможенного органа при выпуске товаров
     * 
     * @return
     *     possible object is
     *     {@link GoodsReleaseIdDetailsType }
     *     
     */
    public GoodsReleaseIdDetailsType getGoodsReleaseIdDetails() {
        return goodsReleaseIdDetails;
    }

    /**
     * Sets the value of the goodsReleaseIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsReleaseIdDetailsType }
     *     
     */
    public void setGoodsReleaseIdDetails(GoodsReleaseIdDetailsType value) {
        this.goodsReleaseIdDetails = value;
    }

    /**
     * Сведения о таможенном органе завершения временного ввоза (вывоза) транспортного средства
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
     * Сведения о должностном лице, оформившем завершение временного ввоза (вывоза) транспортного средства
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

}
