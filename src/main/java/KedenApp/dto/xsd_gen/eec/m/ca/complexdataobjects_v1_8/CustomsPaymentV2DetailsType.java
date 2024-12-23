
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о расчете таможенного платежа
 * 
 * <p>Java class for CustomsPaymentV2DetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsPaymentV2DetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsTaxModeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TaxBaseMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCurrencyN3Code" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedMeasurementUnitCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}EffectiveCustomsRateDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CompareOperationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CompareOperationIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}IneffectiveTaxRateDetails" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DutyTaxFeeRateDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsTaxPaymentFeatureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAPaymentNAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CommodityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReferenceLineId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsPaymentV2DetailsType", propOrder = {
    "customsTaxModeCode",
    "taxBaseMeasure",
    "unifiedCurrencyN3Code",
    "unifiedMeasurementUnitCode",
    "effectiveCustomsRateDetails",
    "compareOperationCode",
    "compareOperationIndicator",
    "ineffectiveTaxRateDetails",
    "dutyTaxFeeRateDate",
    "customsTaxPaymentFeatureCode",
    "caPaymentNAmount",
    "commodityCode",
    "referenceLineId"
})
public class CustomsPaymentV2DetailsType {

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
    @XmlElement(name = "CompareOperationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String compareOperationCode;
    @XmlElement(name = "CompareOperationIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean compareOperationIndicator;
    @XmlElement(name = "IneffectiveTaxRateDetails")
    protected List<IneffectiveTaxRateDetailsType> ineffectiveTaxRateDetails;
    @XmlElement(name = "DutyTaxFeeRateDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dutyTaxFeeRateDate;
    @XmlElement(name = "CustomsTaxPaymentFeatureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CustomsTaxPaymentFeatureCodeType customsTaxPaymentFeatureCode;
    @XmlElement(name = "CAPaymentNAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithNCurrencyType caPaymentNAmount;
    @XmlElement(name = "CommodityCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commodityCode;
    @XmlElement(name = "ReferenceLineId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceLineId;

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
     * Цифровой код валюты основы начисления (адвалорная ставка)
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
     * Код единицы измерения основы начисления (специфическая ставка)
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
     * Gets the value of the compareOperationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompareOperationCode() {
        return compareOperationCode;
    }

    /**
     * Sets the value of the compareOperationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompareOperationCode(String value) {
        this.compareOperationCode = value;
    }

    /**
     * Gets the value of the compareOperationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCompareOperationIndicator() {
        return compareOperationIndicator;
    }

    /**
     * Sets the value of the compareOperationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCompareOperationIndicator(Boolean value) {
        this.compareOperationIndicator = value;
    }

    /**
     * Gets the value of the ineffectiveTaxRateDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ineffectiveTaxRateDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIneffectiveTaxRateDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IneffectiveTaxRateDetailsType }
     * 
     * 
     */
    public List<IneffectiveTaxRateDetailsType> getIneffectiveTaxRateDetails() {
        if (ineffectiveTaxRateDetails == null) {
            ineffectiveTaxRateDetails = new ArrayList<IneffectiveTaxRateDetailsType>();
        }
        return this.ineffectiveTaxRateDetails;
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

    /**
     * номер группы в соответствии с ТН ВЭД ЕАЭС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * идентификатор записи (номер строки) сведений о предшествующем документе, в которой указаны сведения о предшествующей декларации на товары
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceLineId() {
        return referenceLineId;
    }

    /**
     * Sets the value of the referenceLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceLineId(String value) {
        this.referenceLineId = value;
    }

}
