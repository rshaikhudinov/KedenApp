
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsDecisionCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsProcedureCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.UnifiedFractionNumber246MeasureType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Информация о товарах при фактическом вывозе
 * 
 * <p>Java class for FEGoodsInfoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEGoodsInfoDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ConsignmentItemOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CommodityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsDescriptionText" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedGrossMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedNetMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsMeasureDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RemainGrossWeightMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RemainGoodsMeasureDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsFullyExportedIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsProcedureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsDecisionModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsIdentificationMethodText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReusableContainerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDeclarationIdDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEGoodsInfoDetailsType", propOrder = {
    "consignmentItemOrdinal",
    "commodityCode",
    "goodsDescriptionText",
    "unifiedGrossMassMeasure",
    "unifiedNetMassMeasure",
    "goodsMeasureDetails",
    "remainGrossWeightMeasure",
    "remainGoodsMeasureDetails",
    "goodsFullyExportedIndicator",
    "customsProcedureCode",
    "customsDecisionModeCode",
    "goodsIdentificationMethodText",
    "reusableContainerIndicator",
    "customsDeclarationIdDetails"
})
public class FEGoodsInfoDetailsType {

    @XmlElement(name = "ConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger consignmentItemOrdinal;
    @XmlElement(name = "CommodityCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commodityCode;
    @XmlElement(name = "GoodsDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> goodsDescriptionText;
    @XmlElement(name = "UnifiedGrossMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedGrossMassMeasure;
    @XmlElement(name = "UnifiedNetMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedNetMassMeasure;
    @XmlElement(name = "GoodsMeasureDetails")
    protected GoodsMeasureDetailsType goodsMeasureDetails;
    @XmlElement(name = "RemainGrossWeightMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedFractionNumber246MeasureType remainGrossWeightMeasure;
    @XmlElement(name = "RemainGoodsMeasureDetails")
    protected GoodsMeasureDetailsType remainGoodsMeasureDetails;
    @XmlElement(name = "GoodsFullyExportedIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean goodsFullyExportedIndicator;
    @XmlElement(name = "CustomsProcedureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CustomsProcedureCodeType customsProcedureCode;
    @XmlElement(name = "CustomsDecisionModeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CustomsDecisionCodeType customsDecisionModeCode;
    @XmlElement(name = "GoodsIdentificationMethodText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String goodsIdentificationMethodText;
    @XmlElement(name = "ReusableContainerIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean reusableContainerIndicator;
    @XmlElement(name = "CustomsDeclarationIdDetails")
    protected CustomsDocumentIdDetailsType customsDeclarationIdDetails;

    /**
     * Порядковый номер товара
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsignmentItemOrdinal() {
        return consignmentItemOrdinal;
    }

    /**
     * Sets the value of the consignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsignmentItemOrdinal(BigInteger value) {
        this.consignmentItemOrdinal = value;
    }

    /**
     * Кодовое обозначение товара в соответствии с ТН ВЭД ЕАЭС
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
     * описание товара, включая коммерческое, фирменное или иное традиционное наименование товара Gets the value of the goodsDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the goodsDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGoodsDescriptionText() {
        if (goodsDescriptionText == null) {
            goodsDescriptionText = new ArrayList<String>();
        }
        return this.goodsDescriptionText;
    }

    /**
     * Вес товара, брутто
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
     * Вес товара, нетто
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getUnifiedNetMassMeasure() {
        return unifiedNetMassMeasure;
    }

    /**
     * Sets the value of the unifiedNetMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setUnifiedNetMassMeasure(UnifiedPhysicalMeasureType value) {
        this.unifiedNetMassMeasure = value;
    }

    /**
     * Количество товара с указанием дополнительной единицы измерения
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

    /**
     * Gets the value of the remainGrossWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedFractionNumber246MeasureType }
     *     
     */
    public UnifiedFractionNumber246MeasureType getRemainGrossWeightMeasure() {
        return remainGrossWeightMeasure;
    }

    /**
     * Sets the value of the remainGrossWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedFractionNumber246MeasureType }
     *     
     */
    public void setRemainGrossWeightMeasure(UnifiedFractionNumber246MeasureType value) {
        this.remainGrossWeightMeasure = value;
    }

    /**
     * Gets the value of the remainGoodsMeasureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public GoodsMeasureDetailsType getRemainGoodsMeasureDetails() {
        return remainGoodsMeasureDetails;
    }

    /**
     * Sets the value of the remainGoodsMeasureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public void setRemainGoodsMeasureDetails(GoodsMeasureDetailsType value) {
        this.remainGoodsMeasureDetails = value;
    }

    /**
     * Gets the value of the goodsFullyExportedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoodsFullyExportedIndicator() {
        return goodsFullyExportedIndicator;
    }

    /**
     * Sets the value of the goodsFullyExportedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoodsFullyExportedIndicator(Boolean value) {
        this.goodsFullyExportedIndicator = value;
    }

    /**
     * Gets the value of the customsProcedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsProcedureCodeType }
     *     
     */
    public CustomsProcedureCodeType getCustomsProcedureCode() {
        return customsProcedureCode;
    }

    /**
     * Sets the value of the customsProcedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsProcedureCodeType }
     *     
     */
    public void setCustomsProcedureCode(CustomsProcedureCodeType value) {
        this.customsProcedureCode = value;
    }

    /**
     * Gets the value of the customsDecisionModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsDecisionCodeType }
     *     
     */
    public CustomsDecisionCodeType getCustomsDecisionModeCode() {
        return customsDecisionModeCode;
    }

    /**
     * Sets the value of the customsDecisionModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDecisionCodeType }
     *     
     */
    public void setCustomsDecisionModeCode(CustomsDecisionCodeType value) {
        this.customsDecisionModeCode = value;
    }

    /**
     * Gets the value of the goodsIdentificationMethodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsIdentificationMethodText() {
        return goodsIdentificationMethodText;
    }

    /**
     * Sets the value of the goodsIdentificationMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsIdentificationMethodText(String value) {
        this.goodsIdentificationMethodText = value;
    }

    /**
     * Gets the value of the reusableContainerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReusableContainerIndicator() {
        return reusableContainerIndicator;
    }

    /**
     * Sets the value of the reusableContainerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReusableContainerIndicator(Boolean value) {
        this.reusableContainerIndicator = value;
    }

    /**
     * Регистрационный номер транзитной декларации
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public CustomsDocumentIdDetailsType getCustomsDeclarationIdDetails() {
        return customsDeclarationIdDetails;
    }

    /**
     * Sets the value of the customsDeclarationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public void setCustomsDeclarationIdDetails(CustomsDocumentIdDetailsType value) {
        this.customsDeclarationIdDetails = value;
    }

}
