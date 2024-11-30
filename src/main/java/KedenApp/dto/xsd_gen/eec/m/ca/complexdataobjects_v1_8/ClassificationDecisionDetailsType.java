
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о Решениях Комиссии по классификации товаров по ТН ВЭД ЕАЭС
 * 
 * <p>Java class for ClassificationDecisionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassificationDecisionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsDescriptionText"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CDEAUDocDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CDEAUModifiedDocDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassificationDecisionDetailsType", propOrder = {
    "goodsDescriptionText",
    "cdeauDocDetails",
    "cdeauModifiedDocDetails"
})
@XmlSeeAlso({
    RegistryClassificationDecisionDetailsType.class
})
public class ClassificationDecisionDetailsType {

    @XmlElement(name = "GoodsDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected String goodsDescriptionText;
    @XmlElement(name = "CDEAUDocDetails", required = true)
    protected CDEAUDocDetailsType cdeauDocDetails;
    @XmlElement(name = "CDEAUModifiedDocDetails")
    protected CDEUModifiedDocDetailsType cdeauModifiedDocDetails;

    /**
     * описание товара в рубрикаторе информационного ресурса решений Комиссии по классификации товаров по
     * ТН ВЭД ЕАЭС
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
     * Gets the value of the cdeauDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CDEAUDocDetailsType }
     *     
     */
    public CDEAUDocDetailsType getCDEAUDocDetails() {
        return cdeauDocDetails;
    }

    /**
     * Sets the value of the cdeauDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDEAUDocDetailsType }
     *     
     */
    public void setCDEAUDocDetails(CDEAUDocDetailsType value) {
        this.cdeauDocDetails = value;
    }

    /**
     * Gets the value of the cdeauModifiedDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CDEUModifiedDocDetailsType }
     *     
     */
    public CDEUModifiedDocDetailsType getCDEAUModifiedDocDetails() {
        return cdeauModifiedDocDetails;
    }

    /**
     * Sets the value of the cdeauModifiedDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDEUModifiedDocDetailsType }
     *     
     */
    public void setCDEAUModifiedDocDetails(CDEUModifiedDocDetailsType value) {
        this.cdeauModifiedDocDetails = value;
    }

}
