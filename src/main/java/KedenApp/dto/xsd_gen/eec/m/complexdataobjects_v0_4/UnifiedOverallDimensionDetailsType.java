
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие линейные размеры предмета (длина, ширина и высота)
 * 
 * <p>Java class for UnifiedOverallDimensionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnifiedOverallDimensionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedLengthMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedWidthMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedHeightMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnifiedOverallDimensionDetailsType", propOrder = {
    "unifiedLengthMeasure",
    "unifiedWidthMeasure",
    "unifiedHeightMeasure"
})
public class UnifiedOverallDimensionDetailsType {

    @XmlElement(name = "UnifiedLengthMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedLengthMeasure;
    @XmlElement(name = "UnifiedWidthMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedWidthMeasure;
    @XmlElement(name = "UnifiedHeightMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedHeightMeasure;

    /**
     * Линейный размер объекта в продольном направлении
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getUnifiedLengthMeasure() {
        return unifiedLengthMeasure;
    }

    /**
     * Sets the value of the unifiedLengthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setUnifiedLengthMeasure(UnifiedPhysicalMeasureType value) {
        this.unifiedLengthMeasure = value;
    }

    /**
     * Линейный размер объекта в поперечном направлении
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getUnifiedWidthMeasure() {
        return unifiedWidthMeasure;
    }

    /**
     * Sets the value of the unifiedWidthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setUnifiedWidthMeasure(UnifiedPhysicalMeasureType value) {
        this.unifiedWidthMeasure = value;
    }

    /**
     * Линейный размер объекта в вертикальном направлении
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getUnifiedHeightMeasure() {
        return unifiedHeightMeasure;
    }

    /**
     * Sets the value of the unifiedHeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setUnifiedHeightMeasure(UnifiedPhysicalMeasureType value) {
        this.unifiedHeightMeasure = value;
    }

}
