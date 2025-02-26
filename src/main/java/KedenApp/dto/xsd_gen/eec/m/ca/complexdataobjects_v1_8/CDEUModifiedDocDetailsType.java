
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.EAEUDocDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения об измененном решении Комиссии по классификации товаров по ТН ВЭД ЕАЭС
 * 
 * <p>Java class for CDEUModifiedDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDEUModifiedDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsDescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}EAEUDocDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDEUModifiedDocDetailsType", propOrder = {
    "goodsDescriptionText",
    "eaeuDocDetails"
})
public class CDEUModifiedDocDetailsType {

    @XmlElement(name = "GoodsDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String goodsDescriptionText;
    @XmlElement(name = "EAEUDocDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected EAEUDocDetailsType eaeuDocDetails;

    /**
     * Описание товара в рубрикаторе информационного ресурса
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsDescriptionText() {
        return goodsDescriptionText;
    }

    /**
     * Sets the value of the goodsDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsDescriptionText(String value) {
        this.goodsDescriptionText = value;
    }

    /**
     * реквизиты решения Комиссии по классификации товаров по ТН ВЭД ЕАЭС
     * 
     * @return
     *     possible object is
     *     {@link EAEUDocDetailsType }
     *     
     */
    public EAEUDocDetailsType getEAEUDocDetails() {
        return eaeuDocDetails;
    }

    /**
     * Sets the value of the eaeuDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAEUDocDetailsType }
     *     
     */
    public void setEAEUDocDetails(EAEUDocDetailsType value) {
        this.eaeuDocDetails = value;
    }

}
