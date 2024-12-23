
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxModeCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxPaymentMethodCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.ExchangeRateType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCurrencyN3CodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о фактической уплате платежа
 * 
 * <p>Java class for FactPaymentOldDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FactPaymentOldDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsTaxModeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}FactPaidAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCurrencyN3Code" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsTaxPaymentMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PaymentDocDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FactPaymentOldDetailsType", propOrder = {
    "customsTaxModeCode",
    "factPaidAmount",
    "unifiedCurrencyN3Code",
    "exchangeRate",
    "customsTaxPaymentMethodCode",
    "paymentDocDetails"
})
public class FactPaymentOldDetailsType {

    @XmlElement(name = "CustomsTaxModeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsTaxModeCodeType customsTaxModeCode;
    @XmlElement(name = "FactPaidAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType factPaidAmount;
    @XmlElement(name = "UnifiedCurrencyN3Code", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCurrencyN3CodeType unifiedCurrencyN3Code;
    @XmlElement(name = "ExchangeRate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected ExchangeRateType exchangeRate;
    @XmlElement(name = "CustomsTaxPaymentMethodCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CustomsTaxPaymentMethodCodeType customsTaxPaymentMethodCode;
    @XmlElement(name = "PaymentDocDetails")
    protected PaymentDocDetailsType paymentDocDetails;

    /**
     * Gets the value of the customsTaxModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTaxModeCodeType }
     *     
     */
    public CustomsTaxModeCodeType getCustomsTaxModeCode() {
        return customsTaxModeCode;
    }

    /**
     * Sets the value of the customsTaxModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTaxModeCodeType }
     *     
     */
    public void setCustomsTaxModeCode(CustomsTaxModeCodeType value) {
        this.customsTaxModeCode = value;
    }

    /**
     * Gets the value of the factPaidAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getFactPaidAmount() {
        return factPaidAmount;
    }

    /**
     * Sets the value of the factPaidAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setFactPaidAmount(PaymentAmountWithCurrencyType value) {
        this.factPaidAmount = value;
    }

    /**
     * Цифровой код валюты платежа
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCurrencyN3CodeType }
     *     
     */
    public UnifiedCurrencyN3CodeType getUnifiedCurrencyN3Code() {
        return unifiedCurrencyN3Code;
    }

    /**
     * Sets the value of the unifiedCurrencyN3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCurrencyN3CodeType }
     *     
     */
    public void setUnifiedCurrencyN3Code(UnifiedCurrencyN3CodeType value) {
        this.unifiedCurrencyN3Code = value;
    }

    /**
     * Gets the value of the exchangeRate property.
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

    /**
     * Gets the value of the customsTaxPaymentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTaxPaymentMethodCodeType }
     *     
     */
    public CustomsTaxPaymentMethodCodeType getCustomsTaxPaymentMethodCode() {
        return customsTaxPaymentMethodCode;
    }

    /**
     * Sets the value of the customsTaxPaymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTaxPaymentMethodCodeType }
     *     
     */
    public void setCustomsTaxPaymentMethodCode(CustomsTaxPaymentMethodCodeType value) {
        this.customsTaxPaymentMethodCode = value;
    }

    /**
     * Gets the value of the paymentDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDocDetailsType }
     *     
     */
    public PaymentDocDetailsType getPaymentDocDetails() {
        return paymentDocDetails;
    }

    /**
     * Sets the value of the paymentDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDocDetailsType }
     *     
     */
    public void setPaymentDocDetails(PaymentDocDetailsType value) {
        this.paymentDocDetails = value;
    }

}
