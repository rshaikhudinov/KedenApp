
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.PhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие линейные размеры предмета (длина, ширина и высота)
 * 
 * <p>Java class for OverallDimensionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OverallDimensionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}LengthMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}WidthMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}HeightMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OverallDimensionDetailsType", propOrder = {
    "lengthMeasure",
    "widthMeasure",
    "heightMeasure"
})
public class OverallDimensionDetailsType {

    @XmlElement(name = "LengthMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected PhysicalMeasureType lengthMeasure;
    @XmlElement(name = "WidthMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected PhysicalMeasureType widthMeasure;
    @XmlElement(name = "HeightMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected PhysicalMeasureType heightMeasure;

    /**
     * Линейный размер объекта в продольном направлении
     * 
     * @return
     *     possible object is
     *     {@link PhysicalMeasureType }
     *     
     */
    public PhysicalMeasureType getLengthMeasure() {
        return lengthMeasure;
    }

    /**
     * Sets the value of the lengthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalMeasureType }
     *     
     */
    public void setLengthMeasure(PhysicalMeasureType value) {
        this.lengthMeasure = value;
    }

    /**
     * Линейный размер объекта в поперечном направлении
     * 
     * @return
     *     possible object is
     *     {@link PhysicalMeasureType }
     *     
     */
    public PhysicalMeasureType getWidthMeasure() {
        return widthMeasure;
    }

    /**
     * Sets the value of the widthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalMeasureType }
     *     
     */
    public void setWidthMeasure(PhysicalMeasureType value) {
        this.widthMeasure = value;
    }

    /**
     * Линейный размер объекта в вертикальном направлении
     * 
     * @return
     *     possible object is
     *     {@link PhysicalMeasureType }
     *     
     */
    public PhysicalMeasureType getHeightMeasure() {
        return heightMeasure;
    }

    /**
     * Sets the value of the heightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalMeasureType }
     *     
     */
    public void setHeightMeasure(PhysicalMeasureType value) {
        this.heightMeasure = value;
    }

}
