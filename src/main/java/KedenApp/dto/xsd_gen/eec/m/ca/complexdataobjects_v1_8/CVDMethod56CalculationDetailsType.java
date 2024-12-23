
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
 * Компоненты, представляющие сведения о подробностях расчета таможенной стоимости по методу сложения или по резервному методу на его основе
 * 
 * <p>Java class for CVDMethod56CalculationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVDMethod56CalculationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ProductionValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PackageValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DesignUnionValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ResourceValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ToolsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}MaterialsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DesignValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}AddProductionValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ProfitAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PlaceName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LoadingValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}InsuranceValueAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVDMethod56CalculationDetailsType", propOrder = {
    "productionValueAmount",
    "packageValueAmount",
    "designUnionValueAmount",
    "resourceValueAmount",
    "toolsValueAmount",
    "materialsValueAmount",
    "designValueAmount",
    "addProductionValueAmount",
    "profitAmount",
    "placeName",
    "transportValueAmount",
    "loadingValueAmount",
    "insuranceValueAmount"
})
public class CVDMethod56CalculationDetailsType {

    @XmlElement(name = "ProductionValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType productionValueAmount;
    @XmlElement(name = "PackageValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType packageValueAmount;
    @XmlElement(name = "DesignUnionValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType designUnionValueAmount;
    @XmlElement(name = "ResourceValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType resourceValueAmount;
    @XmlElement(name = "ToolsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType toolsValueAmount;
    @XmlElement(name = "MaterialsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType materialsValueAmount;
    @XmlElement(name = "DesignValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType designValueAmount;
    @XmlElement(name = "AddProductionValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType addProductionValueAmount;
    @XmlElement(name = "ProfitAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType profitAmount;
    @XmlElement(name = "PlaceName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String placeName;
    @XmlElement(name = "TransportValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType transportValueAmount;
    @XmlElement(name = "LoadingValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType loadingValueAmount;
    @XmlElement(name = "InsuranceValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType insuranceValueAmount;

    /**
     * Общая сумма расходов на изготовление или приобретение материалов и расходов на производство, а также на иные операции, связанные с производством ввозимых товаров
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getProductionValueAmount() {
        return productionValueAmount;
    }

    /**
     * Sets the value of the productionValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setProductionValueAmount(PaymentAmountWithCurrencyType value) {
        this.productionValueAmount = value;
    }

    /**
     * Расходы покупателя на тару и упаковку, в том числе стоимость упаковочных материалов и работ по упаковке
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getPackageValueAmount() {
        return packageValueAmount;
    }

    /**
     * Sets the value of the packageValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setPackageValueAmount(PaymentAmountWithCurrencyType value) {
        this.packageValueAmount = value;
    }

    /**
     * Gets the value of the designUnionValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getDesignUnionValueAmount() {
        return designUnionValueAmount;
    }

    /**
     * Sets the value of the designUnionValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setDesignUnionValueAmount(PaymentAmountWithCurrencyType value) {
        this.designUnionValueAmount = value;
    }

    /**
     * Стоимость сырья, материалов, деталей, полуфабрикатов и иных товаров, из которых произведены (состоят) ввозимые товары
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getResourceValueAmount() {
        return resourceValueAmount;
    }

    /**
     * Sets the value of the resourceValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setResourceValueAmount(PaymentAmountWithCurrencyType value) {
        this.resourceValueAmount = value;
    }

    /**
     * Стоимость инструментов, штампов, форм и иных подобных товаров, использованных при производстве ввозимых товаров
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getToolsValueAmount() {
        return toolsValueAmount;
    }

    /**
     * Sets the value of the toolsValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setToolsValueAmount(PaymentAmountWithCurrencyType value) {
        this.toolsValueAmount = value;
    }

    /**
     * Стоимость материалов, израсходованных при производстве ввозимых товаров
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getMaterialsValueAmount() {
        return materialsValueAmount;
    }

    /**
     * Sets the value of the materialsValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setMaterialsValueAmount(PaymentAmountWithCurrencyType value) {
        this.materialsValueAmount = value;
    }

    /**
     * Стоимость проектирования, разработки, инженерной, конструкторской работы, художественного оформления, дизайна, эскизов и чертежей, выполненных вне таможенной территории Евразийского экономического союза и необходимых для производства ввозимых товаров
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getDesignValueAmount() {
        return designValueAmount;
    }

    /**
     * Sets the value of the designValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setDesignValueAmount(PaymentAmountWithCurrencyType value) {
        this.designValueAmount = value;
    }

    /**
     * Величина иных расходов, связанных с производством ввозимых товаров
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getAddProductionValueAmount() {
        return addProductionValueAmount;
    }

    /**
     * Sets the value of the addProductionValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setAddProductionValueAmount(PaymentAmountWithCurrencyType value) {
        this.addProductionValueAmount = value;
    }

    /**
     * Сумма прибыли и общих расходов (коммерческих и управленческих)
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
     * Величина расходов на перевозку (транспортировку) ввозимых товаров до места прибытия на таможенную территорию Евразийского экономического союза или до иного места, определенного Евразийской экономической комиссией
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
     * Величина расходов на погрузку, разгрузку или перегрузку ввозимых товаров и проведение иных операций, связанных с их перевозкой (транспортировкой) до места прибытия на таможенную территорию Евразийского экономического союза или до иного места, определенного Евразийской экономической комиссией
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getLoadingValueAmount() {
        return loadingValueAmount;
    }

    /**
     * Sets the value of the loadingValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setLoadingValueAmount(PaymentAmountWithCurrencyType value) {
        this.loadingValueAmount = value;
    }

    /**
     * Величина расходов на страхование в связи с перевозкой (транспортировкой), погрузкой, разгрузкой или перегрузкой ввозимых товаров и проведением иных операций, связанных с их перевозкой (транспортировкой)
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getInsuranceValueAmount() {
        return insuranceValueAmount;
    }

    /**
     * Sets the value of the insuranceValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setInsuranceValueAmount(PaymentAmountWithCurrencyType value) {
        this.insuranceValueAmount = value;
    }

}
