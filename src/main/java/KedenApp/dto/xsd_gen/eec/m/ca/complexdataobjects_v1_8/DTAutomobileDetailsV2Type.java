
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.VehicleEcoClassCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения об автомобильном транспортном средстве
 * 
 * <p>Java class for DTAutomobileDetailsV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTAutomobileDetailsV2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CAAutoBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}VehicleEngineDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleEcoClassCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VehicleAxleQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}VehicleMassDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportCarryingCapacityMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VehicleWheelbaseMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SeatQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PlatformLengthMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VehicleMileageMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EmergencyDeviceId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTAutomobileDetailsV2Type", propOrder = {
    "vehicleEngineDetails",
    "vehicleEcoClassCode",
    "vehicleAxleQuantity",
    "vehicleMassDetails",
    "transportCarryingCapacityMeasure",
    "vehicleWheelbaseMeasure",
    "seatQuantity",
    "platformLengthMeasure",
    "vehicleMileageMeasure",
    "caValueAmount",
    "emergencyDeviceId"
})
public class DTAutomobileDetailsV2Type
    extends CAAutoBaseDetailsType
{

    @XmlElement(name = "VehicleEngineDetails")
    protected List<VehicleEngineDetailsType> vehicleEngineDetails;
    @XmlElement(name = "VehicleEcoClassCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected VehicleEcoClassCodeType vehicleEcoClassCode;
    @XmlElement(name = "VehicleAxleQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger vehicleAxleQuantity;
    @XmlElement(name = "VehicleMassDetails")
    protected VehicleMassDetailsType vehicleMassDetails;
    @XmlElement(name = "TransportCarryingCapacityMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType transportCarryingCapacityMeasure;
    @XmlElement(name = "VehicleWheelbaseMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType vehicleWheelbaseMeasure;
    @XmlElement(name = "SeatQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger seatQuantity;
    @XmlElement(name = "PlatformLengthMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType platformLengthMeasure;
    @XmlElement(name = "VehicleMileageMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType vehicleMileageMeasure;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType caValueAmount;
    @XmlElement(name = "EmergencyDeviceId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String emergencyDeviceId;

    /**
     * Gets the value of the vehicleEngineDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleEngineDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleEngineDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleEngineDetailsType }
     * 
     * 
     */
    public List<VehicleEngineDetailsType> getVehicleEngineDetails() {
        if (vehicleEngineDetails == null) {
            vehicleEngineDetails = new ArrayList<VehicleEngineDetailsType>();
        }
        return this.vehicleEngineDetails;
    }

    /**
     * Gets the value of the vehicleEcoClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleEcoClassCodeType }
     *     
     */
    public VehicleEcoClassCodeType getVehicleEcoClassCode() {
        return vehicleEcoClassCode;
    }

    /**
     * Sets the value of the vehicleEcoClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEcoClassCodeType }
     *     
     */
    public void setVehicleEcoClassCode(VehicleEcoClassCodeType value) {
        this.vehicleEcoClassCode = value;
    }

    /**
     * Gets the value of the vehicleAxleQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVehicleAxleQuantity() {
        return vehicleAxleQuantity;
    }

    /**
     * Sets the value of the vehicleAxleQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVehicleAxleQuantity(BigInteger value) {
        this.vehicleAxleQuantity = value;
    }

    /**
     * Gets the value of the vehicleMassDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleMassDetailsType }
     *     
     */
    public VehicleMassDetailsType getVehicleMassDetails() {
        return vehicleMassDetails;
    }

    /**
     * Sets the value of the vehicleMassDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleMassDetailsType }
     *     
     */
    public void setVehicleMassDetails(VehicleMassDetailsType value) {
        this.vehicleMassDetails = value;
    }

    /**
     * Gets the value of the transportCarryingCapacityMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getTransportCarryingCapacityMeasure() {
        return transportCarryingCapacityMeasure;
    }

    /**
     * Sets the value of the transportCarryingCapacityMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setTransportCarryingCapacityMeasure(UnifiedPhysicalMeasureType value) {
        this.transportCarryingCapacityMeasure = value;
    }

    /**
     * Gets the value of the vehicleWheelbaseMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getVehicleWheelbaseMeasure() {
        return vehicleWheelbaseMeasure;
    }

    /**
     * Sets the value of the vehicleWheelbaseMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setVehicleWheelbaseMeasure(UnifiedPhysicalMeasureType value) {
        this.vehicleWheelbaseMeasure = value;
    }

    /**
     * Gets the value of the seatQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeatQuantity() {
        return seatQuantity;
    }

    /**
     * Sets the value of the seatQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeatQuantity(BigInteger value) {
        this.seatQuantity = value;
    }

    /**
     * Максимальная внутренняя длина площадки для перевозки грузов (грузовой платформы)
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getPlatformLengthMeasure() {
        return platformLengthMeasure;
    }

    /**
     * Sets the value of the platformLengthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setPlatformLengthMeasure(UnifiedPhysicalMeasureType value) {
        this.platformLengthMeasure = value;
    }

    /**
     * Gets the value of the vehicleMileageMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getVehicleMileageMeasure() {
        return vehicleMileageMeasure;
    }

    /**
     * Sets the value of the vehicleMileageMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setVehicleMileageMeasure(UnifiedPhysicalMeasureType value) {
        this.vehicleMileageMeasure = value;
    }

    /**
     * Gets the value of the caValueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getCAValueAmount() {
        return caValueAmount;
    }

    /**
     * Sets the value of the caValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setCAValueAmount(PaymentAmountWithCurrencyType value) {
        this.caValueAmount = value;
    }

    /**
     * Gets the value of the emergencyDeviceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyDeviceId() {
        return emergencyDeviceId;
    }

    /**
     * Sets the value of the emergencyDeviceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyDeviceId(String value) {
        this.emergencyDeviceId = value;
    }

}
