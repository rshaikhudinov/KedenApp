
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о товарной партии
 * 
 * <p>Java class for ECGoodsShipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECGoodsShipmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsignorDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsigneeDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsLocationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ECHouseShipmentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedGrossMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ECPaymentAmountDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FactPaymentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ECChangeDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECGoodsShipmentDetailsType", propOrder = {
    "consignorDetails",
    "consigneeDetails",
    "goodsLocationDetails",
    "ecHouseShipmentDetails",
    "unifiedGrossMassMeasure",
    "caValueAmount",
    "customsValueAmount",
    "ecPaymentAmountDetails",
    "factPaymentDetails",
    "ecChangeDetails"
})
public class ECGoodsShipmentDetailsType {

    @XmlElement(name = "ConsignorDetails")
    protected GoodsShipmentSubjectDetailsType consignorDetails;
    @XmlElement(name = "ConsigneeDetails")
    protected GoodsShipmentSubjectDetailsType consigneeDetails;
    @XmlElement(name = "GoodsLocationDetails")
    protected GoodsLocationDetailsType goodsLocationDetails;
    @XmlElement(name = "ECHouseShipmentDetails")
    protected List<ECHouseShipmentDetailsType> ecHouseShipmentDetails;
    @XmlElement(name = "UnifiedGrossMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedGrossMassMeasure;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType caValueAmount;
    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType customsValueAmount;
    @XmlElement(name = "ECPaymentAmountDetails")
    protected List<ECPaymentAmountDetailsType> ecPaymentAmountDetails;
    @XmlElement(name = "FactPaymentDetails")
    protected List<FactPaymentDetailsType> factPaymentDetails;
    @XmlElement(name = "ECChangeDetails")
    protected ECChangeDetailsType ecChangeDetails;

    /**
     * Сведения об отправителе по общей накладной
     * 
     * @return
     *     possible object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public GoodsShipmentSubjectDetailsType getConsignorDetails() {
        return consignorDetails;
    }

    /**
     * Sets the value of the consignorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public void setConsignorDetails(GoodsShipmentSubjectDetailsType value) {
        this.consignorDetails = value;
    }

    /**
     * Сведения о получателе по общей накладной
     * 
     * @return
     *     possible object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public GoodsShipmentSubjectDetailsType getConsigneeDetails() {
        return consigneeDetails;
    }

    /**
     * Sets the value of the consigneeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public void setConsigneeDetails(GoodsShipmentSubjectDetailsType value) {
        this.consigneeDetails = value;
    }

    /**
     * Gets the value of the goodsLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsLocationDetailsType }
     *     
     */
    public GoodsLocationDetailsType getGoodsLocationDetails() {
        return goodsLocationDetails;
    }

    /**
     * Sets the value of the goodsLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsLocationDetailsType }
     *     
     */
    public void setGoodsLocationDetails(GoodsLocationDetailsType value) {
        this.goodsLocationDetails = value;
    }

    /**
     * Gets the value of the ecHouseShipmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ecHouseShipmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getECHouseShipmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECHouseShipmentDetailsType }
     * 
     * 
     */
    public List<ECHouseShipmentDetailsType> getECHouseShipmentDetails() {
        if (ecHouseShipmentDetails == null) {
            ecHouseShipmentDetails = new ArrayList<ECHouseShipmentDetailsType>();
        }
        return this.ecHouseShipmentDetails;
    }

    /**
     * Общий вес брутто по декларации на товары для экспресс-грузов или пассажирской таможенной декларации для экспресс-грузов
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getUnifiedGrossMassMeasure() {
        return unifiedGrossMassMeasure;
    }

    /**
     * Sets the value of the unifiedGrossMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setUnifiedGrossMassMeasure(UnifiedPhysicalMeasureType value) {
        this.unifiedGrossMassMeasure = value;
    }

    /**
     * Общая стоимость товаров по пассажирской таможенной декларации для экспресс-грузов в валюте государства-члена
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
     * Общая таможенная стоимость товаров по декларации на товары для экспресс-грузов
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getCustomsValueAmount() {
        return customsValueAmount;
    }

    /**
     * Sets the value of the customsValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setCustomsValueAmount(PaymentAmountWithCurrencyType value) {
        this.customsValueAmount = value;
    }

    /**
     * Сумма таможенного и иного платежа, подлежащего уплате по декларации на товары для экспресс-грузов Gets the value of the ecPaymentAmountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ecPaymentAmountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getECPaymentAmountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECPaymentAmountDetailsType }
     * 
     * 
     */
    public List<ECPaymentAmountDetailsType> getECPaymentAmountDetails() {
        if (ecPaymentAmountDetails == null) {
            ecPaymentAmountDetails = new ArrayList<ECPaymentAmountDetailsType>();
        }
        return this.ecPaymentAmountDetails;
    }

    /**
     * Сведения о фактически уплаченных (взысканных) суммах таможенных и иных платежей по декларации на товары для экспресс-грузов Gets the value of the factPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the factPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FactPaymentDetailsType }
     * 
     * 
     */
    public List<FactPaymentDetailsType> getFactPaymentDetails() {
        if (factPaymentDetails == null) {
            factPaymentDetails = new ArrayList<FactPaymentDetailsType>();
        }
        return this.factPaymentDetails;
    }

    /**
     * Gets the value of the ecChangeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ECChangeDetailsType }
     *     
     */
    public ECChangeDetailsType getECChangeDetails() {
        return ecChangeDetails;
    }

    /**
     * Sets the value of the ecChangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECChangeDetailsType }
     *     
     */
    public void setECChangeDetails(ECChangeDetailsType value) {
        this.ecChangeDetails = value;
    }

}
