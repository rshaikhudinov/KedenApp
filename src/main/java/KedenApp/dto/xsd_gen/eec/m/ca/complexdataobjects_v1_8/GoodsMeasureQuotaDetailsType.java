
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.UnifiedFractionNumber246MeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения об остатке квоты, выраженные в количестве продукта. Заполняется в случае, если квота указывается в единицах измерения
 * 
 * <p>Java class for GoodsMeasureQuotaDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsMeasureQuotaDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsQuotaMeasure"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}MeasureUnitAbbreviationCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsMeasureQuotaDetailsType", propOrder = {
    "goodsQuotaMeasure",
    "measureUnitAbbreviationCode"
})
public class GoodsMeasureQuotaDetailsType {

    @XmlElement(name = "GoodsQuotaMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected UnifiedFractionNumber246MeasureType goodsQuotaMeasure;
    @XmlElement(name = "MeasureUnitAbbreviationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String measureUnitAbbreviationCode;

    /**
     * Gets the value of the goodsQuotaMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedFractionNumber246MeasureType }
     *     
     */
    public UnifiedFractionNumber246MeasureType getGoodsQuotaMeasure() {
        return goodsQuotaMeasure;
    }

    /**
     * Sets the value of the goodsQuotaMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedFractionNumber246MeasureType }
     *     
     */
    public void setGoodsQuotaMeasure(UnifiedFractionNumber246MeasureType value) {
        this.goodsQuotaMeasure = value;
    }

    /**
     * Gets the value of the measureUnitAbbreviationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureUnitAbbreviationCode() {
        return measureUnitAbbreviationCode;
    }

    /**
     * Sets the value of the measureUnitAbbreviationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureUnitAbbreviationCode(String value) {
        this.measureUnitAbbreviationCode = value;
    }

}
