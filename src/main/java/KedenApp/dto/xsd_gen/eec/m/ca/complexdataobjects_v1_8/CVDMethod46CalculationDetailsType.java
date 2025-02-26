
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о подробностях расчета таможенной стоимости по методу вычитания или по резервному методу на его основе
 * 
 * <p>Java class for CVDMethod46CalculationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVDMethod46CalculationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsUnitPriceAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedMeasurementUnitCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ProfitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}UnionTaxPaymentAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ProcessingValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsMeasureDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVDMethod46CalculationDetailsType", propOrder = {
    "goodsUnitPriceAmount",
    "unifiedMeasurementUnitCode",
    "profitAmount",
    "transportValueAmount",
    "unionTaxPaymentAmount",
    "processingValueAmount",
    "totalAmount",
    "goodsMeasureDetails"
})
public class CVDMethod46CalculationDetailsType {

    @XmlElement(name = "GoodsUnitPriceAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType goodsUnitPriceAmount;
    @XmlElement(name = "UnifiedMeasurementUnitCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCode20Type unifiedMeasurementUnitCode;
    @XmlElement(name = "ProfitAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType profitAmount;
    @XmlElement(name = "TransportValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType transportValueAmount;
    @XmlElement(name = "UnionTaxPaymentAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType unionTaxPaymentAmount;
    @XmlElement(name = "ProcessingValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType processingValueAmount;
    @XmlElement(name = "TotalAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType totalAmount;
    @XmlElement(name = "GoodsMeasureDetails", required = true)
    protected GoodsMeasureDetailsType goodsMeasureDetails;

    /**
     * Gets the value of the goodsUnitPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getGoodsUnitPriceAmount() {
        return goodsUnitPriceAmount;
    }

    /**
     * Sets the value of the goodsUnitPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setGoodsUnitPriceAmount(PaymentAmountWithCurrencyType value) {
        this.goodsUnitPriceAmount = value;
    }

    /**
     * Кодовое обозначение единицы измерения единицы товара, за которую установлена цена
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getUnifiedMeasurementUnitCode() {
        return unifiedMeasurementUnitCode;
    }

    /**
     * Sets the value of the unifiedMeasurementUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setUnifiedMeasurementUnitCode(UnifiedCode20Type value) {
        this.unifiedMeasurementUnitCode = value;
    }

    /**
     * сумма вознаграждения агенту (посреднику), выплачиваемого или подлежащего выплате, либо надбавки к цене, производимой для получения прибыли и покрытия общих расходов (коммерческих и управленческих)
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getProfitAmount() {
        return profitAmount;
    }

    /**
     * Sets the value of the profitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setProfitAmount(PaymentAmountWithCurrencyType value) {
        this.profitAmount = value;
    }

    /**
     * Сумма расходов на осуществленные на таможенной территории Евразийского экономического союза перевозку (транспортировку) и страхование и иных связанных с такими операциями расходов
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getTransportValueAmount() {
        return transportValueAmount;
    }

    /**
     * Sets the value of the transportValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setTransportValueAmount(PaymentAmountWithCurrencyType value) {
        this.transportValueAmount = value;
    }

    /**
     * Сумма таможенных пошлин, налогов и сборов, а также иных налогов и сборов, подлежащих уплате в связи с ввозом и (или) продажей товаров на территориях государств-членов
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getUnionTaxPaymentAmount() {
        return unionTaxPaymentAmount;
    }

    /**
     * Sets the value of the unionTaxPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setUnionTaxPaymentAmount(PaymentAmountWithCurrencyType value) {
        this.unionTaxPaymentAmount = value;
    }

    /**
     * Стоимость, добавленная в результате переработки (обработки) товаров в государстве-члене
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getProcessingValueAmount() {
        return processingValueAmount;
    }

    /**
     * Sets the value of the processingValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setProcessingValueAmount(PaymentAmountWithCurrencyType value) {
        this.processingValueAmount = value;
    }

    /**
     * Величина вычетов сумм, которые включены в цену единицы товара, в валюте государства-члена
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
     * Количество ввозимых товаров
     * 
     * @return
     *     possible object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public GoodsMeasureDetailsType getGoodsMeasureDetails() {
        return goodsMeasureDetails;
    }

    /**
     * Sets the value of the goodsMeasureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public void setGoodsMeasureDetails(GoodsMeasureDetailsType value) {
        this.goodsMeasureDetails = value;
    }

}
