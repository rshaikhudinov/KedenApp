
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о наименовании и количестве припасов
 * 
 * <p>Java class for StoreItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoreItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsDescriptionText" maxOccurs="4"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsMeasureDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreItemDetailsType", propOrder = {
    "goodsDescriptionText",
    "goodsMeasureDetails"
})
public class StoreItemDetailsType {

    @XmlElement(name = "GoodsDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected List<String> goodsDescriptionText;
    @XmlElement(name = "GoodsMeasureDetails", required = true)
    protected GoodsMeasureDetailsType goodsMeasureDetails;

    /**
     * Описание припасов Gets the value of the goodsDescriptionText property.
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
     * Количество припасов
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
