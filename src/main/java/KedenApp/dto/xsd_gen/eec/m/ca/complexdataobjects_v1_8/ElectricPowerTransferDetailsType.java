
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о принятой и переданной электроэнергии
 * 
 * <p>Java class for ElectricPowerTransferDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElectricPowerTransferDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExportElectricPowerMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ImportElectricPowerMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElectricPowerTransferDetailsType", propOrder = {
    "exportElectricPowerMeasure",
    "importElectricPowerMeasure"
})
public class ElectricPowerTransferDetailsType {

    @XmlElement(name = "ExportElectricPowerMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType exportElectricPowerMeasure;
    @XmlElement(name = "ImportElectricPowerMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType importElectricPowerMeasure;

    /**
     * Gets the value of the exportElectricPowerMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getExportElectricPowerMeasure() {
        return exportElectricPowerMeasure;
    }

    /**
     * Sets the value of the exportElectricPowerMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setExportElectricPowerMeasure(UnifiedPhysicalMeasureType value) {
        this.exportElectricPowerMeasure = value;
    }

    /**
     * Gets the value of the importElectricPowerMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getImportElectricPowerMeasure() {
        return importElectricPowerMeasure;
    }

    /**
     * Sets the value of the importElectricPowerMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setImportElectricPowerMeasure(UnifiedPhysicalMeasureType value) {
        this.importElectricPowerMeasure = value;
    }

}
