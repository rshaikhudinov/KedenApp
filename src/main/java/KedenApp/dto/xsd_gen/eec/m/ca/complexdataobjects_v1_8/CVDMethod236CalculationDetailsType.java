
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о подробностях расчета по методам по стоимости сделки с идентичными или с однородными товарами или по резервному методу на их основе
 * 
 * <p>Java class for CVDMethod236CalculationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVDMethod236CalculationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}IdenticalGoodsValueAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DeductionAdjustmentsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AdditionsAdjustmentsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}IdenticalGoodsMeasureDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsMeasureDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVDMethod236CalculationDetailsType", propOrder = {
    "identicalGoodsValueAmount",
    "deductionAdjustmentsDetails",
    "additionsAdjustmentsDetails",
    "caValueAmount",
    "identicalGoodsMeasureDetails",
    "goodsMeasureDetails"
})
public class CVDMethod236CalculationDetailsType {

    @XmlElement(name = "IdenticalGoodsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType identicalGoodsValueAmount;
    @XmlElement(name = "DeductionAdjustmentsDetails")
    protected IdenticalGoodsCorrectionDetailsType deductionAdjustmentsDetails;
    @XmlElement(name = "AdditionsAdjustmentsDetails")
    protected IdenticalGoodsCorrectionDetailsType additionsAdjustmentsDetails;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType caValueAmount;
    @XmlElement(name = "IdenticalGoodsMeasureDetails")
    protected GoodsMeasureDetailsType identicalGoodsMeasureDetails;
    @XmlElement(name = "GoodsMeasureDetails")
    protected GoodsMeasureDetailsType goodsMeasureDetails;

    /**
     * Gets the value of the identicalGoodsValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getIdenticalGoodsValueAmount() {
        return identicalGoodsValueAmount;
    }

    /**
     * Sets the value of the identicalGoodsValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setIdenticalGoodsValueAmount(PaymentAmountWithCurrencyType value) {
        this.identicalGoodsValueAmount = value;
    }

    /**
     * Gets the value of the deductionAdjustmentsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IdenticalGoodsCorrectionDetailsType }
     *     
     */
    public IdenticalGoodsCorrectionDetailsType getDeductionAdjustmentsDetails() {
        return deductionAdjustmentsDetails;
    }

    /**
     * Sets the value of the deductionAdjustmentsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdenticalGoodsCorrectionDetailsType }
     *     
     */
    public void setDeductionAdjustmentsDetails(IdenticalGoodsCorrectionDetailsType value) {
        this.deductionAdjustmentsDetails = value;
    }

    /**
     * Gets the value of the additionsAdjustmentsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IdenticalGoodsCorrectionDetailsType }
     *     
     */
    public IdenticalGoodsCorrectionDetailsType getAdditionsAdjustmentsDetails() {
        return additionsAdjustmentsDetails;
    }

    /**
     * Sets the value of the additionsAdjustmentsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdenticalGoodsCorrectionDetailsType }
     *     
     */
    public void setAdditionsAdjustmentsDetails(IdenticalGoodsCorrectionDetailsType value) {
        this.additionsAdjustmentsDetails = value;
    }

    /**
     * Стоимость сделки с идентичными или однородными товарами с учетом поправок в валюте государства-члена
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
     * Gets the value of the identicalGoodsMeasureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public GoodsMeasureDetailsType getIdenticalGoodsMeasureDetails() {
        return identicalGoodsMeasureDetails;
    }

    /**
     * Sets the value of the identicalGoodsMeasureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public void setIdenticalGoodsMeasureDetails(GoodsMeasureDetailsType value) {
        this.identicalGoodsMeasureDetails = value;
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
