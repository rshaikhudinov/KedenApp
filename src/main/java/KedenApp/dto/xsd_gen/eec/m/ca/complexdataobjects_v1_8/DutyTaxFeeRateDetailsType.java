
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigDecimal;
import java.math.BigInteger;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCurrencyN3CodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о составляющей ставке таможенного платежа
 * 
 * <p>Java class for DutyTaxFeeRateDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyTaxFeeRateDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DutyTaxFeeRateKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DutyTaxFeeRateValue" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedMeasurementUnitCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCurrencyN3Code" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DayQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}StageQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}MonthQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WeightRatioNumber" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyTaxFeeRateDetailsType", propOrder = {
    "dutyTaxFeeRateKindCode",
    "dutyTaxFeeRateValue",
    "unifiedMeasurementUnitCode",
    "unifiedCurrencyN3Code",
    "dayQuantity",
    "stageQuantity",
    "monthQuantity",
    "weightRatioNumber"
})
public class DutyTaxFeeRateDetailsType {

    @XmlElement(name = "DutyTaxFeeRateKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dutyTaxFeeRateKindCode;
    @XmlElement(name = "DutyTaxFeeRateValue", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected BigDecimal dutyTaxFeeRateValue;
    @XmlElement(name = "UnifiedMeasurementUnitCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type unifiedMeasurementUnitCode;
    @XmlElement(name = "UnifiedCurrencyN3Code", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCurrencyN3CodeType unifiedCurrencyN3Code;
    @XmlElement(name = "DayQuantity", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger dayQuantity;
    @XmlElement(name = "StageQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger stageQuantity;
    @XmlElement(name = "MonthQuantity", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger monthQuantity;
    @XmlElement(name = "WeightRatioNumber", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected BigDecimal weightRatioNumber;

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
     * Значение ставки таможенного платежа или ставки рефинансирования (ключевой ставки, учетной ставки)
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
     * Кодовое обозначение единицы измерения (специфическая ставка)
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
     * Цифровое кодовое обозначение валюты ставки (специфическая ставка)
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
     * Количество периодов
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStageQuantity() {
        return stageQuantity;
    }

    /**
     * Sets the value of the stageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStageQuantity(BigInteger value) {
        this.stageQuantity = value;
    }

    /**
     * Число полных и неполных календарных месяцев
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMonthQuantity() {
        return monthQuantity;
    }

    /**
     * Sets the value of the monthQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMonthQuantity(BigInteger value) {
        this.monthQuantity = value;
    }

    /**
     * Весовой коэффициент единицы измерения (специфическая ставка)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightRatioNumber() {
        return weightRatioNumber;
    }

    /**
     * Sets the value of the weightRatioNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightRatioNumber(BigDecimal value) {
        this.weightRatioNumber = value;
    }

}
