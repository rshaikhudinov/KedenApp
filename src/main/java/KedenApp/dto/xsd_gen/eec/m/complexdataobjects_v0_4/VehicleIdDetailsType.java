
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.CAAutoBaseDetailsType;
import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.TransportMeansIDDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Совокупность идентификаторов транспортного средства
 * 
 * <p>Java class for VehicleIdDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VehicleIdDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleChassisId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleBodyId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleIdDetailsType", propOrder = {
    "vehicleId",
    "vehicleChassisId",
    "vehicleBodyId"
})
@XmlSeeAlso({
    TransportMeansIDDetailsType.class,
    CAAutoBaseDetailsType.class
})
public class VehicleIdDetailsType {

    @XmlElement(name = "VehicleId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vehicleId;
    @XmlElement(name = "VehicleChassisId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vehicleChassisId;
    @XmlElement(name = "VehicleBodyId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vehicleBodyId;

    /**
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleId(String value) {
        this.vehicleId = value;
    }

    /**
     * Gets the value of the vehicleChassisId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleChassisId() {
        return vehicleChassisId;
    }

    /**
     * Sets the value of the vehicleChassisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleChassisId(String value) {
        this.vehicleChassisId = value;
    }

    /**
     * Gets the value of the vehicleBodyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleBodyId() {
        return vehicleBodyId;
    }

    /**
     * Sets the value of the vehicleBodyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleBodyId(String value) {
        this.vehicleBodyId = value;
    }

}
