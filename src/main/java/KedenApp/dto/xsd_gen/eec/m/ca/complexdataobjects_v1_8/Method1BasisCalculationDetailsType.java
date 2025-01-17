
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.ExchangeRateType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения об основе расчета таможенной стоимости по методу 1. Графа А (11, 12)
 * 
 * <p>Java class for Method1BasisCalculationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Method1BasisCalculationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}InvoicePriceAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}NationalInvoicePriceAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PriceCurrencyRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}NationalIndirectPaymentAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}IndirectPaymentCurrencyRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalAmount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Method1BasisCalculationDetailsType", propOrder = {
    "invoicePriceAmount",
    "nationalInvoicePriceAmount",
    "priceCurrencyRate",
    "nationalIndirectPaymentAmount",
    "indirectPaymentCurrencyRate",
    "totalAmount"
})
public class Method1BasisCalculationDetailsType {

    @XmlElement(name = "InvoicePriceAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType invoicePriceAmount;
    @XmlElement(name = "NationalInvoicePriceAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType nationalInvoicePriceAmount;
    @XmlElement(name = "PriceCurrencyRate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected ExchangeRateType priceCurrencyRate;
    @XmlElement(name = "NationalIndirectPaymentAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType nationalIndirectPaymentAmount;
    @XmlElement(name = "IndirectPaymentCurrencyRate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected ExchangeRateType indirectPaymentCurrencyRate;
    @XmlElement(name = "TotalAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType totalAmount;

    /**
     * Цена, фактически уплаченная или подлежащая уплате за ввозимый товар, или основа для определения таможенной стоимости ввозимых товаров в валюте счета
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getInvoicePriceAmount() {
        return invoicePriceAmount;
    }

    /**
     * Sets the value of the invoicePriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setInvoicePriceAmount(PaymentAmountWithCurrencyType value) {
        this.invoicePriceAmount = value;
    }

    /**
     * Цена, фактически уплаченная или подлежащая уплате за ввозимый товар, или иная основа для определения таможенной стоимости ввозимых товаров в валюте государства-члена
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getNationalInvoicePriceAmount() {
        return nationalInvoicePriceAmount;
    }

    /**
     * Sets the value of the nationalInvoicePriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setNationalInvoicePriceAmount(PaymentAmountWithCurrencyType value) {
        this.nationalInvoicePriceAmount = value;
    }

    /**
     * Курс пересчета цены, фактически уплаченной или подлежащей уплате за ввозимый товар, или иной основы для определения таможенной стоимости ввозимых товаров в валюту государства-члена
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getPriceCurrencyRate() {
        return priceCurrencyRate;
    }

    /**
     * Sets the value of the priceCurrencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setPriceCurrencyRate(ExchangeRateType value) {
        this.priceCurrencyRate = value;
    }

    /**
     * Величина косвенных платежей, в том числе величина стоимостной оценки условий или обязательств, влияние которых на цену ввозимых товаров может быть количественно определено, в валюте государства-члена
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getNationalIndirectPaymentAmount() {
        return nationalIndirectPaymentAmount;
    }

    /**
     * Sets the value of the nationalIndirectPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setNationalIndirectPaymentAmount(PaymentAmountWithCurrencyType value) {
        this.nationalIndirectPaymentAmount = value;
    }

    /**
     * Курс пересчета косвенных платежей, в том числе величины стоимостной оценки условий или обязательств, влияние которых на цену ввозимых товаров может быть количественно определено, в валюту государства-члена
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getIndirectPaymentCurrencyRate() {
        return indirectPaymentCurrencyRate;
    }

    /**
     * Sets the value of the indirectPaymentCurrencyRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setIndirectPaymentCurrencyRate(ExchangeRateType value) {
        this.indirectPaymentCurrencyRate = value;
    }

    /**
     * Величина основы для расчета таможенной стоимости ввозимых товаров в валюте государства-члена
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

}
