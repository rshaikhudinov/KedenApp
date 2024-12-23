
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigDecimal;
import java.math.BigInteger;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxModeCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithNCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCurrencyN3CodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения об общей сумме, подлежащей уплате (взысканию) по виду платежа
 * 
 * <p>Java class for CPCPaymentAmountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPCPaymentAmountDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsTaxModeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TaxBaseMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCurrencyN3Code" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DutyTaxFeeRateKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DutyTaxFeeRateValue" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DayQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAPaymentNAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPCPaymentAmountDetailsType", propOrder = {
    "customsTaxModeCode",
    "taxBaseMeasure",
    "unifiedCurrencyN3Code",
    "dutyTaxFeeRateKindCode",
    "dutyTaxFeeRateValue",
    "dayQuantity",
    "caPaymentNAmount"
})
public class CPCPaymentAmountDetailsType {

    @XmlElement(name = "CustomsTaxModeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsTaxModeCodeType customsTaxModeCode;
    @XmlElement(name = "TaxBaseMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected BigDecimal taxBaseMeasure;
    @XmlElement(name = "UnifiedCurrencyN3Code", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCurrencyN3CodeType unifiedCurrencyN3Code;
    @XmlElement(name = "DutyTaxFeeRateKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dutyTaxFeeRateKindCode;
    @XmlElement(name = "DutyTaxFeeRateValue", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected BigDecimal dutyTaxFeeRateValue;
    @XmlElement(name = "DayQuantity", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger dayQuantity;
    @XmlElement(name = "CAPaymentNAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithNCurrencyType caPaymentNAmount;

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
     * Gets the value of the taxBaseMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxBaseMeasure() {
        return taxBaseMeasure;
    }

    /**
     * Sets the value of the taxBaseMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxBaseMeasure(BigDecimal value) {
        this.taxBaseMeasure = value;
    }

    /**
     * Цифровое кодовое обозначение валюты основы начисления (адвалорная ставка)
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
     * Gets the value of the dutyTaxFeeRateKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyTaxFeeRateKindCode() {
        return dutyTaxFeeRateKindCode;
    }

    /**
     * Sets the value of the dutyTaxFeeRateKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyTaxFeeRateKindCode(String value) {
        this.dutyTaxFeeRateKindCode = value;
    }

    /**
     * Значение ставки таможенного платежа или ставки рефинансирования
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDutyTaxFeeRateValue() {
        return dutyTaxFeeRateValue;
    }

    /**
     * Sets the value of the dutyTaxFeeRateValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDutyTaxFeeRateValue(BigDecimal value) {
        this.dutyTaxFeeRateValue = value;
    }

    /**
     * Gets the value of the dayQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayQuantity() {
        return dayQuantity;
    }

    /**
     * Sets the value of the dayQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayQuantity(BigInteger value) {
        this.dayQuantity = value;
    }

    /**
     * Gets the value of the caPaymentNAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public PaymentAmountWithNCurrencyType getCAPaymentNAmount() {
        return caPaymentNAmount;
    }

    /**
     * Sets the value of the caPaymentNAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public void setCAPaymentNAmount(PaymentAmountWithNCurrencyType value) {
        this.caPaymentNAmount = value;
    }

}
