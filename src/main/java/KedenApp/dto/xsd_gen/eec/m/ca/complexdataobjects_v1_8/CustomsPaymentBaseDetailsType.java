
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxModeCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxPaymentFeatureCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithNCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCurrencyN3CodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие информацию о расчете таможенного платежа
 * 
 * <p>Java class for CustomsPaymentBaseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsPaymentBaseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsTaxModeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TaxBaseMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCurrencyN3Code" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedMeasurementUnitCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}EffectiveCustomsRateDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DutyTaxFeeRateDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsTaxPaymentFeatureCode" minOccurs="0"/&gt;
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
@XmlType(name = "CustomsPaymentBaseDetailsType", propOrder = {
    "customsTaxModeCode",
    "taxBaseMeasure",
    "unifiedCurrencyN3Code",
    "unifiedMeasurementUnitCode",
    "effectiveCustomsRateDetails",
    "dutyTaxFeeRateDate",
    "customsTaxPaymentFeatureCode",
    "caPaymentNAmount"
})
@XmlSeeAlso({
    CPCGoodsItemPaymentDetailsType.class,
    CRExchGoodsPaymentsDetailsType.class,
    CRGoodsItemPaymentDetailsType.class,
    GoodsItemPaymentDetailsType.class
})
public class CustomsPaymentBaseDetailsType {

    @XmlElement(name = "CustomsTaxModeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsTaxModeCodeType customsTaxModeCode;
    @XmlElement(name = "TaxBaseMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected BigDecimal taxBaseMeasure;
    @XmlElement(name = "UnifiedCurrencyN3Code", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCurrencyN3CodeType unifiedCurrencyN3Code;
    @XmlElement(name = "UnifiedMeasurementUnitCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type unifiedMeasurementUnitCode;
    @XmlElement(name = "EffectiveCustomsRateDetails")
    protected DutyTaxFeeRateDetailsType effectiveCustomsRateDetails;
    @XmlElement(name = "DutyTaxFeeRateDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dutyTaxFeeRateDate;
    @XmlElement(name = "CustomsTaxPaymentFeatureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CustomsTaxPaymentFeatureCodeType customsTaxPaymentFeatureCode;
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
     * База для исчисления платежа
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
     * Кодовое обозначение единицы измерения основы начисления (специфическая ставка)
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
     * Gets the value of the effectiveCustomsRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DutyTaxFeeRateDetailsType }
     *     
     */
    public DutyTaxFeeRateDetailsType getEffectiveCustomsRateDetails() {
        return effectiveCustomsRateDetails;
    }

    /**
     * Sets the value of the effectiveCustomsRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyTaxFeeRateDetailsType }
     *     
     */
    public void setEffectiveCustomsRateDetails(DutyTaxFeeRateDetailsType value) {
        this.effectiveCustomsRateDetails = value;
    }

    /**
     * Дата применения ставки платежа
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDutyTaxFeeRateDate() {
        return dutyTaxFeeRateDate;
    }

    /**
     * Sets the value of the dutyTaxFeeRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDutyTaxFeeRateDate(XMLGregorianCalendar value) {
        this.dutyTaxFeeRateDate = value;
    }

    /**
     * Gets the value of the customsTaxPaymentFeatureCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTaxPaymentFeatureCodeType }
     *     
     */
    public CustomsTaxPaymentFeatureCodeType getCustomsTaxPaymentFeatureCode() {
        return customsTaxPaymentFeatureCode;
    }

    /**
     * Sets the value of the customsTaxPaymentFeatureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTaxPaymentFeatureCodeType }
     *     
     */
    public void setCustomsTaxPaymentFeatureCode(CustomsTaxPaymentFeatureCodeType value) {
        this.customsTaxPaymentFeatureCode = value;
    }

    /**
     * сумма (размер) платежа
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
