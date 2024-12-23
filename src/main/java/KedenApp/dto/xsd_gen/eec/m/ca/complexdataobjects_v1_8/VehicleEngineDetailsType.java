
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о двигателе автомобильного транспортного средства
 * 
 * <p>Java class for VehicleEngineDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleEngineDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EngineId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EngineVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EngineMaxPowerMeasure" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EngineModelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EngineKindCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleEngineDetailsType", propOrder = {
    "engineId",
    "engineVolumeMeasure",
    "engineMaxPowerMeasure",
    "engineModelCode",
    "engineKindCode"
})
public class VehicleEngineDetailsType {

    @XmlElement(name = "EngineId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String engineId;
    @XmlElement(name = "EngineVolumeMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType engineVolumeMeasure;
    @XmlElement(name = "EngineMaxPowerMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<UnifiedPhysicalMeasureType> engineMaxPowerMeasure;
    @XmlElement(name = "EngineModelCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String engineModelCode;
    @XmlElement(name = "EngineKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String engineKindCode;

    /**
     * Gets the value of the engineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineId() {
        return engineId;
    }

    /**
     * Sets the value of the engineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineId(String value) {
        this.engineId = value;
    }

    /**
     * Gets the value of the engineVolumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getEngineVolumeMeasure() {
        return engineVolumeMeasure;
    }

    /**
     * Sets the value of the engineVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setEngineVolumeMeasure(UnifiedPhysicalMeasureType value) {
        this.engineVolumeMeasure = value;
    }

    /**
     * Gets the value of the engineMaxPowerMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the engineMaxPowerMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEngineMaxPowerMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnifiedPhysicalMeasureType }
     * 
     * 
     */
    public List<UnifiedPhysicalMeasureType> getEngineMaxPowerMeasure() {
        if (engineMaxPowerMeasure == null) {
            engineMaxPowerMeasure = new ArrayList<UnifiedPhysicalMeasureType>();
        }
        return this.engineMaxPowerMeasure;
    }

    /**
     * Gets the value of the engineModelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineModelCode() {
        return engineModelCode;
    }

    /**
     * Sets the value of the engineModelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineModelCode(String value) {
        this.engineModelCode = value;
    }

    /**
     * Gets the value of the engineKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineKindCode() {
        return engineKindCode;
    }

    /**
     * Sets the value of the engineKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineKindCode(String value) {
        this.engineKindCode = value;
    }

}
