
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о товаре, заявленном в предшествующем документе
 * 
 * <p>Java class for PrecedingGoodsDetaisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecedingGoodsDetaisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CommodityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedGrossMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedNetMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreDeclarationNetMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsMeasureDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecedingGoodsDetaisType", propOrder = {
    "commodityCode",
    "unifiedGrossMassMeasure",
    "unifiedNetMassMeasure",
    "preDeclarationNetMassMeasure",
    "customsValueAmount",
    "goodsMeasureDetails"
})
public class PrecedingGoodsDetaisType {

    @XmlElement(name = "CommodityCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commodityCode;
    @XmlElement(name = "UnifiedGrossMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedGrossMassMeasure;
    @XmlElement(name = "UnifiedNetMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedNetMassMeasure;
    @XmlElement(name = "PreDeclarationNetMassMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType preDeclarationNetMassMeasure;
    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType customsValueAmount;
    @XmlElement(name = "GoodsMeasureDetails")
    protected List<GoodsMeasureDetailsType> goodsMeasureDetails;

    /**
     * Кодовое обозначение товара в соответствии с ТН ВЭД ЕАЭС, указанное в предшествующем документе
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
     * масса брутто декларируемого товара
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
     * Масса нетто декларируемого товара либо товара, использованного при изготовлении или вошедшего в состав декларируемого товара
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
     * масса нетто товара, указанная в предшествующем документе
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getPreDeclarationNetMassMeasure() {
        return preDeclarationNetMassMeasure;
    }

    /**
     * Sets the value of the preDeclarationNetMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setPreDeclarationNetMassMeasure(UnifiedPhysicalMeasureType value) {
        this.preDeclarationNetMassMeasure = value;
    }

    /**
     * Таможенная стоимость товара, указанная в предшествующем документе
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
     * Количество декларируемого товара либо товара, использованного при изготовлении или вошедшего в состав декларируемого товара Gets the value of the goodsMeasureDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the goodsMeasureDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsMeasureDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsMeasureDetailsType }
     * 
     * 
     */
    public List<GoodsMeasureDetailsType> getGoodsMeasureDetails() {
        if (goodsMeasureDetails == null) {
            goodsMeasureDetails = new ArrayList<GoodsMeasureDetailsType>();
        }
        return this.goodsMeasureDetails;
    }

}
