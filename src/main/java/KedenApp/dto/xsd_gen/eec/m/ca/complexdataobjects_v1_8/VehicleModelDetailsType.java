
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.VehicleMakeCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Марка (модель) транспортного средства
 * 
 * <p>Java class for VehicleModelDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleModelDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleMakeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleMakeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VehicleModelName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleModelDetailsType", propOrder = {
    "vehicleMakeCode",
    "vehicleMakeName",
    "vehicleModelName"
})
public class VehicleModelDetailsType {

    @XmlElement(name = "VehicleMakeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected VehicleMakeCodeType vehicleMakeCode;
    @XmlElement(name = "VehicleMakeName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vehicleMakeName;
    @XmlElement(name = "VehicleModelName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vehicleModelName;

    /**
     * кодовое обозначение марки транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link VehicleMakeCodeType }
     *     
     */
    public VehicleMakeCodeType getVehicleMakeCode() {
        return vehicleMakeCode;
    }

    /**
     * Sets the value of the vehicleMakeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMakeCodeType }
     *     
     */
    public void setVehicleMakeCode(VehicleMakeCodeType value) {
        this.vehicleMakeCode = value;
    }

    /**
     * Gets the value of the vehicleMakeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleMakeName() {
        return vehicleMakeName;
    }

    /**
     * Sets the value of the vehicleMakeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleMakeName(String value) {
        this.vehicleMakeName = value;
    }

    /**
     * Наименование модели транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModelName() {
        return vehicleModelName;
    }

    /**
     * Sets the value of the vehicleModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModelName(String value) {
        this.vehicleModelName = value;
    }

}
