
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о корректировке таможенной стоимости при ее определении по методу сделки с идентичными (однородными) товарами
 * 
 * <p>Java class for IdenticalGoodsCorrectionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdenticalGoodsCorrectionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}QuantityAdjustmentAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CommercialLevelAdjustmentAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PlaceName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportAdjustmentAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LoadingAdjustmentAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}InsuranceAdjustmentAmount" minOccurs="0"/&gt;
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
@XmlType(name = "IdenticalGoodsCorrectionDetailsType", propOrder = {
    "quantityAdjustmentAmount",
    "commercialLevelAdjustmentAmount",
    "placeName",
    "transportAdjustmentAmount",
    "loadingAdjustmentAmount",
    "insuranceAdjustmentAmount",
    "totalAmount"
})
public class IdenticalGoodsCorrectionDetailsType {

    @XmlElement(name = "QuantityAdjustmentAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType quantityAdjustmentAmount;
    @XmlElement(name = "CommercialLevelAdjustmentAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType commercialLevelAdjustmentAmount;
    @XmlElement(name = "PlaceName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String placeName;
    @XmlElement(name = "TransportAdjustmentAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType transportAdjustmentAmount;
    @XmlElement(name = "LoadingAdjustmentAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType loadingAdjustmentAmount;
    @XmlElement(name = "InsuranceAdjustmentAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType insuranceAdjustmentAmount;
    @XmlElement(name = "TotalAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType totalAmount;

    /**
     * Величина поправки на количество товаров
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getQuantityAdjustmentAmount() {
        return quantityAdjustmentAmount;
    }

    /**
     * Sets the value of the quantityAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setQuantityAdjustmentAmount(PaymentAmountWithCurrencyType value) {
        this.quantityAdjustmentAmount = value;
    }

    /**
     * Величина поправки на коммерческий уровень продажи товаров
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getCommercialLevelAdjustmentAmount() {
        return commercialLevelAdjustmentAmount;
    }

    /**
     * Sets the value of the commercialLevelAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setCommercialLevelAdjustmentAmount(PaymentAmountWithCurrencyType value) {
        this.commercialLevelAdjustmentAmount = value;
    }

    /**
     * Место прибытия ввозимых товаров на таможенную территорию Евразийского экономического союза или иное место, определенное Евразийской экономической комиссией, или место назначения ввозимых товаров на таможенной территории Евразийского экономического союза
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * Величина поправки на разницу в расходах на перевозку (транспортировку) товаров до места прибытия товаров на таможенную территорию Евразийского экономического союза или до иного места, определенного Евразийской экономической комиссией
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getTransportAdjustmentAmount() {
        return transportAdjustmentAmount;
    }

    /**
     * Sets the value of the transportAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setTransportAdjustmentAmount(PaymentAmountWithCurrencyType value) {
        this.transportAdjustmentAmount = value;
    }

    /**
     * Величина поправки на разницу в расходах на погрузку, разгрузку или перегрузку товаров и проведение иных операций, связанных с перевозкой (транспортировкой) товаров до места прибытия на таможенную территорию Евразийского экономического союза или до иного места, определенного Евразийской экономической комиссией
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getLoadingAdjustmentAmount() {
        return loadingAdjustmentAmount;
    }

    /**
     * Sets the value of the loadingAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setLoadingAdjustmentAmount(PaymentAmountWithCurrencyType value) {
        this.loadingAdjustmentAmount = value;
    }

    /**
     * Величина поправки на разницу в расходах на страхование в связи с перевозкой (транспортировкой), погрузкой, разгрузкой или перегрузкой товаров и проведением иных операций, связанных с их перевозкой (транспортировкой)
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getInsuranceAdjustmentAmount() {
        return insuranceAdjustmentAmount;
    }

    /**
     * Sets the value of the insuranceAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setInsuranceAdjustmentAmount(PaymentAmountWithCurrencyType value) {
        this.insuranceAdjustmentAmount = value;
    }

    /**
     * Величина поправок в валюте государства-члена
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
