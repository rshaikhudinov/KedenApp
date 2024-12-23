
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
 * Компоненты, представляющие информацию о массе транспортного средства
 * 
 * <p>Java class for VehicleMassDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleMassDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VehicleMassKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedMassMeasure"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleMassDetailsType", propOrder = {
    "vehicleMassKindCode",
    "unifiedMassMeasure"
})
public class VehicleMassDetailsType {

    @XmlElement(name = "VehicleMassKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vehicleMassKindCode;
    @XmlElement(name = "UnifiedMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedPhysicalMeasureType unifiedMassMeasure;

    /**
     * Кодовое обозначение вида массы транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleMassKindCode() {
        return vehicleMassKindCode;
    }

    /**
     * Sets the value of the vehicleMassKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleMassKindCode(String value) {
        this.vehicleMassKindCode = value;
    }

    /**
     * Gets the value of the unifiedMassMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getUnifiedMassMeasure() {
        return unifiedMassMeasure;
    }

    /**
     * Sets the value of the unifiedMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setUnifiedMassMeasure(UnifiedPhysicalMeasureType value) {
        this.unifiedMassMeasure = value;
    }

}
