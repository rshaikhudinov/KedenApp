
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
 * Компоненты, представляющие сведения о товарах, помещенных под таможенную процедуру свободной таможенной зоны или свободного склада
 * 
 * <p>Java class for WarehousingGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarehousingGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReferenceLineId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsDescriptionText" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsMeasureDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsItemGroupDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarehousingGoodsItemDetailsType", propOrder = {
    "referenceLineId",
    "goodsDescriptionText",
    "goodsMeasureDetails",
    "goodsItemGroupDetails"
})
public class WarehousingGoodsItemDetailsType {

    @XmlElement(name = "ReferenceLineId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceLineId;
    @XmlElement(name = "GoodsDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> goodsDescriptionText;
    @XmlElement(name = "GoodsMeasureDetails")
    protected List<GoodsMeasureDetailsType> goodsMeasureDetails;
    @XmlElement(name = "GoodsItemGroupDetails")
    protected List<GoodsItemGroupDetailsType> goodsItemGroupDetails;

    /**
     * идентификатор записи (номер строки) сведений о предшествующих документах, в которой указаны сведения о предшествующей декларации на товары
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

    /**
     * Описание товара, включая коммерческое, фирменное или иное традиционное наименование товара Gets the value of the goodsDescriptionText property.
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
     * Количество товара в дополнительной единице измерения Gets the value of the goodsMeasureDetails property.
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

    /**
     * Gets the value of the goodsItemGroupDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the goodsItemGroupDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsItemGroupDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemGroupDetailsType }
     * 
     * 
     */
    public List<GoodsItemGroupDetailsType> getGoodsItemGroupDetails() {
        if (goodsItemGroupDetails == null) {
            goodsItemGroupDetails = new ArrayList<GoodsItemGroupDetailsType>();
        }
        return this.goodsItemGroupDetails;
    }

}
