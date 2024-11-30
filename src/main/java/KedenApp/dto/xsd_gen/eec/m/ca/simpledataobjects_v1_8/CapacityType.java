
package KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Числовая величина, определенная в результате измерения параметров пропускной способности пункта пропуска в каких-либо единицах измерения
 * 
 * <p>Java class for CapacityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CapacityType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:BaseDataTypes:v0.4.14&gt;MeasureType"&gt;
 *       &lt;attribute name="CapacityPeriodIndicator" use="required" type="{urn:EEC:M:BaseDataTypes:v0.4.14}IndicatorType" /&gt;
 *       &lt;attribute name="measurementUnitCode" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}MeasurementUnitCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CapacityType", propOrder = {
    "value"
})
@XmlSeeAlso({
    CheckPointCapacityMeasureType.class
})
public class CapacityType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "CapacityPeriodIndicator", required = true)
    protected boolean capacityPeriodIndicator;
    @XmlAttribute(name = "measurementUnitCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String measurementUnitCode;

    /**
     * Числовая величина, определенная в результате измерения объекта
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the capacityPeriodIndicator property.
     * 
     */
    public boolean isCapacityPeriodIndicator() {
        return capacityPeriodIndicator;
    }

    /**
     * Sets the value of the capacityPeriodIndicator property.
     * 
     */
    public void setCapacityPeriodIndicator(boolean value) {
        this.capacityPeriodIndicator = value;
    }

    /**
     * Gets the value of the measurementUnitCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementUnitCode() {
        return measurementUnitCode;
    }

    /**
     * Sets the value of the measurementUnitCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementUnitCode(String value) {
        this.measurementUnitCode = value;
    }

}
