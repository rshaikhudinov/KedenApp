
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
 * Компоненты, представляющие сведения об автомобильном транспортном средстве международной перевозки, находящимся за пределами Союза, в отношении которого совершаются операции, не предусмотренные п.1 и п.2 ст.277 ТК ЕАЭС
 * 
 * <p>Java class for TMPAAutomobileDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMPAAutomobileDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CAAutoBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EngineId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EngineVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EngineMaxPowerMeasure" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMPAAutomobileDetailsType", propOrder = {
    "engineId",
    "engineVolumeMeasure",
    "engineMaxPowerMeasure"
})
public class TMPAAutomobileDetailsType
    extends CAAutoBaseDetailsType
{

    @XmlElement(name = "EngineId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String engineId;
    @XmlElement(name = "EngineVolumeMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType engineVolumeMeasure;
    @XmlElement(name = "EngineMaxPowerMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<UnifiedPhysicalMeasureType> engineMaxPowerMeasure;

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

}
