
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Детальная информация о регистрации временного ввоза (вывоза) транспортного средства
 * 
 * <p>Java class for TIERegistrationDetalsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIERegistrationDetalsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTMDocDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PassengerDeclarationIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegistrationOperationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsReleaseIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CustomsOfficeDetails" minOccurs="0"/&gt;
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
@XmlType(name = "TIERegistrationDetalsType", propOrder = {
    "dtmDocDetails",
    "passengerDeclarationIdDetails",
    "registrationOperationDetails",
    "goodsReleaseIdDetails",
    "customsOfficeDetails",
    "customsPersonDetails"
})
public class TIERegistrationDetalsType {

    @XmlElement(name = "DTMDocDetails")
    protected DTMDocDetailsType dtmDocDetails;
    @XmlElement(name = "PassengerDeclarationIdDetails")
    protected PassengerDeclarationIdDetailsType passengerDeclarationIdDetails;
    @XmlElement(name = "RegistrationOperationDetails")
    protected CustomsOperationDetailsType registrationOperationDetails;
    @XmlElement(name = "GoodsReleaseIdDetails")
    protected GoodsReleaseIdDetailsType goodsReleaseIdDetails;
    @XmlElement(name = "CustomsOfficeDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected CustomsOfficeDetailsType customsOfficeDetails;
    @XmlElement(name = "CustomsPersonDetails")
    protected CustomsPersonDetailsType customsPersonDetails;

    /**
     * Gets the value of the dtmDocDetails property.
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
     * Сведения о регистрационном номере пассажирской декларации
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
     * Регистрационный (учетный) номер таможенной операции оформления временного ввоза для Российской Федерации
     * 
     * @return
     *     possible object is
     *     {@link CustomsOperationDetailsType }
     *     
     */
    public CustomsOperationDetailsType getRegistrationOperationDetails() {
        return registrationOperationDetails;
    }

    /**
     * Sets the value of the registrationOperationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsOperationDetailsType }
     *     
     */
    public void setRegistrationOperationDetails(CustomsOperationDetailsType value) {
        this.registrationOperationDetails = value;
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
     * Сведения о таможенном органе, оформившем временный ввоз (вывоз) транспортного средства
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
     * Сведения о должностном лице таможенного органа, оформившем временный ввоз (вывоз) транспортного средства
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
