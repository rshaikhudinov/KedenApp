
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.ExchangeRateType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие базовые сведения о перевозке товаров
 * 
 * <p>Java class for DTGoodsShipmentBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTGoodsShipmentBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DepartureCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DestinationCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TradeCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DeliveryTermsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExchangeRate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTGoodsShipmentBaseType", propOrder = {
    "departureCountryDetails",
    "destinationCountryDetails",
    "tradeCountryDetails",
    "deliveryTermsDetails",
    "caValueAmount",
    "totalAmount",
    "exchangeRate"
})
@XmlSeeAlso({
    DTExchGoodsShipmentType.class,
    DeclarationGoodsShipmentDetailsType.class,
    GDCExchGoodsShipmentDetailsType.class,
    GDGoodsShipmentDetailsType.class,
    GRAGoodsShipmentDetailsType.class
})
public class DTGoodsShipmentBaseType {

    @XmlElement(name = "DepartureCountryDetails")
    protected CACountryDetailsType departureCountryDetails;
    @XmlElement(name = "DestinationCountryDetails")
    protected CACountryDetailsType destinationCountryDetails;
    @XmlElement(name = "TradeCountryDetails")
    protected TradeCountryDetailsType tradeCountryDetails;
    @XmlElement(name = "DeliveryTermsDetails")
    protected DeliveryTermsDetailsType deliveryTermsDetails;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType caValueAmount;
    @XmlElement(name = "TotalAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType totalAmount;
    @XmlElement(name = "ExchangeRate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected ExchangeRateType exchangeRate;

    /**
     * Gets the value of the departureCountryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryDetailsType }
     *     
     */
    public CACountryDetailsType getDepartureCountryDetails() {
        return departureCountryDetails;
    }

    /**
     * Sets the value of the departureCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryDetailsType }
     *     
     */
    public void setDepartureCountryDetails(CACountryDetailsType value) {
        this.departureCountryDetails = value;
    }

    /**
     * Gets the value of the destinationCountryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryDetailsType }
     *     
     */
    public CACountryDetailsType getDestinationCountryDetails() {
        return destinationCountryDetails;
    }

    /**
     * Sets the value of the destinationCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryDetailsType }
     *     
     */
    public void setDestinationCountryDetails(CACountryDetailsType value) {
        this.destinationCountryDetails = value;
    }

    /**
     * Gets the value of the tradeCountryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCountryDetailsType }
     *     
     */
    public TradeCountryDetailsType getTradeCountryDetails() {
        return tradeCountryDetails;
    }

    /**
     * Sets the value of the tradeCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCountryDetailsType }
     *     
     */
    public void setTradeCountryDetails(TradeCountryDetailsType value) {
        this.tradeCountryDetails = value;
    }

    /**
     * Gets the value of the deliveryTermsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTermsDetailsType }
     *     
     */
    public DeliveryTermsDetailsType getDeliveryTermsDetails() {
        return deliveryTermsDetails;
    }

    /**
     * Sets the value of the deliveryTermsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTermsDetailsType }
     *     
     */
    public void setDeliveryTermsDetails(DeliveryTermsDetailsType value) {
        this.deliveryTermsDetails = value;
    }

    /**
     * Стоимость декларируемых товаров в валюте цены договора (контракта) или в валюте платежа (оценки)
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getCAValueAmount() {
        return caValueAmount;
    }

    /**
     * Sets the value of the caValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setCAValueAmount(PaymentAmountWithCurrencyType value) {
        this.caValueAmount = value;
    }

    /**
     * Общая стоимость товара, перемещаемого через таможенную границу Евразийского экономического союза в несобранном или разобранном виде, в том числе некомплектном или незавершенном виде
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setTotalAmount(PaymentAmountWithCurrencyType value) {
        this.totalAmount = value;
    }

    /**
     * курс валюты цены договора (контракта) или валюты платежа (оценки)
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setExchangeRate(ExchangeRateType value) {
        this.exchangeRate = value;
    }

}
