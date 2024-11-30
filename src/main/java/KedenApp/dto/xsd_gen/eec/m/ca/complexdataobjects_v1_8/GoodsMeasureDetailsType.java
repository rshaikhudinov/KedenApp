
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о количестве товаров в единице измерения
 * 
 * <p>Java class for GoodsMeasureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsMeasureDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsMeasure"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}MeasureUnitAbbreviationCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsMeasureDetailsType", propOrder = {
    "goodsMeasure",
    "measureUnitAbbreviationCode"
})
public class GoodsMeasureDetailsType {

    @XmlElement(name = "GoodsMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected UnifiedPhysicalMeasureType goodsMeasure;
    @XmlElement(name = "MeasureUnitAbbreviationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String measureUnitAbbreviationCode;

    /**
     * сведения о количестве товара с указанием единицы измерения
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getGoodsMeasure() {
        return goodsMeasure;
    }

    /**
     * Sets the value of the goodsMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setGoodsMeasure(UnifiedPhysicalMeasureType value) {
        this.goodsMeasure = value;
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
