
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию о товарах, указанных в предварительном решении
 * 
 * <p>Java class for PreDecisionGoodsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreDecisionGoodsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ManufacturerName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ShortCountryName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreDecisionGoodsName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CommodityDescriptionDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsPartViewDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreDecisionGoodsDetailsType", propOrder = {
    "manufacturerName",
    "shortCountryName",
    "preDecisionGoodsName",
    "goodsDescriptionText",
    "caDocDetails",
    "commodityDescriptionDetails",
    "goodsPartViewDetails"
})
public class PreDecisionGoodsDetailsType {

    @XmlElement(name = "ManufacturerName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String manufacturerName;
    @XmlElement(name = "ShortCountryName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shortCountryName;
    @XmlElement(name = "PreDecisionGoodsName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String preDecisionGoodsName;
    @XmlElement(name = "GoodsDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> goodsDescriptionText;
    @XmlElement(name = "CADocDetails")
    protected List<CADocDetailsType> caDocDetails;
    @XmlElement(name = "CommodityDescriptionDetails")
    protected List<CACommodityDescriptionDetailsType> commodityDescriptionDetails;
    @XmlElement(name = "GoodsPartViewDetails")
    protected List<GoodsPartViewDetailsType> goodsPartViewDetails;

    /**
     * Gets the value of the manufacturerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Sets the value of the manufacturerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerName(String value) {
        this.manufacturerName = value;
    }

    /**
     * Gets the value of the shortCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortCountryName() {
        return shortCountryName;
    }

    /**
     * Sets the value of the shortCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCountryName(String value) {
        this.shortCountryName = value;
    }

    /**
     * Gets the value of the preDecisionGoodsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreDecisionGoodsName() {
        return preDecisionGoodsName;
    }

    /**
     * Sets the value of the preDecisionGoodsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreDecisionGoodsName(String value) {
        this.preDecisionGoodsName = value;
    }

    /**
     * Описание товара Gets the value of the goodsDescriptionText property.
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
     * Документы, содержащие информацию о товаре Gets the value of the caDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the caDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCADocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CADocDetailsType }
     * 
     * 
     */
    public List<CADocDetailsType> getCADocDetails() {
        if (caDocDetails == null) {
            caDocDetails = new ArrayList<CADocDetailsType>();
        }
        return this.caDocDetails;
    }

    /**
     * дополнительные характеристики товара, указанные заявителем Gets the value of the commodityDescriptionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the commodityDescriptionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodityDescriptionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CACommodityDescriptionDetailsType }
     * 
     * 
     */
    public List<CACommodityDescriptionDetailsType> getCommodityDescriptionDetails() {
        if (commodityDescriptionDetails == null) {
            commodityDescriptionDetails = new ArrayList<CACommodityDescriptionDetailsType>();
        }
        return this.commodityDescriptionDetails;
    }

    /**
     * сведения о компонентах товара при его классификации в несобранном виде (для Республики Казахстан и Российской Федерации) Gets the value of the goodsPartViewDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the goodsPartViewDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsPartViewDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsPartViewDetailsType }
     * 
     * 
     */
    public List<GoodsPartViewDetailsType> getGoodsPartViewDetails() {
        if (goodsPartViewDetails == null) {
            goodsPartViewDetails = new ArrayList<GoodsPartViewDetailsType>();
        }
        return this.goodsPartViewDetails;
    }

}
