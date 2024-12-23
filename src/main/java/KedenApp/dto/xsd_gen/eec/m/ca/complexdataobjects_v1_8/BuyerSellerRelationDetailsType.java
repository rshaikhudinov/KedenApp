
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о взаимосвязи продавца и покупателя
 * 
 * <p>Java class for BuyerSellerRelationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerSellerRelationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RelationIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PriceInfluenceIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ApproximateValueIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerSellerRelationDetailsType", propOrder = {
    "relationIndicator",
    "priceInfluenceIndicator",
    "approximateValueIndicator"
})
public class BuyerSellerRelationDetailsType {

    @XmlElement(name = "RelationIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean relationIndicator;
    @XmlElement(name = "PriceInfluenceIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean priceInfluenceIndicator;
    @XmlElement(name = "ApproximateValueIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean approximateValueIndicator;

    /**
     * Признак наличия взаимосвязи между продавцом и покупателем
     * 
     */
    public Boolean isRelationIndicator() {
        return relationIndicator;
    }

    /**
     * Sets the value of the relationIndicator property.
     * 
     */
    public void setRelationIndicator(Boolean value) {
        this.relationIndicator = value;
    }

    /**
     * Признак влияния взаимосвязи между продавцом и покупателем на цену ввозимых товаров
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPriceInfluenceIndicator() {
        return priceInfluenceIndicator;
    }

    /**
     * Sets the value of the priceInfluenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPriceInfluenceIndicator(Boolean value) {
        this.priceInfluenceIndicator = value;
    }

    /**
     * Признак близости стоимости сделки с ввозимыми товарами к одной из проверочных величин
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateValueIndicator() {
        return approximateValueIndicator;
    }

    /**
     * Sets the value of the approximateValueIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateValueIndicator(Boolean value) {
        this.approximateValueIndicator = value;
    }

}
