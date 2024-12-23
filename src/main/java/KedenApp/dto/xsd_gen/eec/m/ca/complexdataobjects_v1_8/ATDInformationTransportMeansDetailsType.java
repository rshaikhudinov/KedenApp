
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.VehcicleMakeCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.TransportMeansRegIdType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о досматриваемом транспортном средстве
 * 
 * <p>Java class for ATDInformationTransportMeansDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDInformationTransportMeansDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ConditionArrivalCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TransportMeansRegId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleChassisId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleBodyId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VehicleMakeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VehicleModelName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDArrivalTransportMeansDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDInformationTransportMeansDetailsType", propOrder = {
    "conditionArrivalCode",
    "transportMeansRegId",
    "vehicleId",
    "vehicleChassisId",
    "vehicleBodyId",
    "vehicleMakeCode",
    "vehicleModelName",
    "atdArrivalTransportMeansDetails",
    "descriptionText"
})
public class ATDInformationTransportMeansDetailsType {

    @XmlElement(name = "ConditionArrivalCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String conditionArrivalCode;
    @XmlElement(name = "TransportMeansRegId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected TransportMeansRegIdType transportMeansRegId;
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
    @XmlElement(name = "VehicleMakeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected VehcicleMakeCodeType vehicleMakeCode;
    @XmlElement(name = "VehicleModelName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vehicleModelName;
    @XmlElement(name = "ATDArrivalTransportMeansDetails")
    protected ATDArrivalTransportMeansDetailsType atdArrivalTransportMeansDetails;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> descriptionText;

    /**
     * Gets the value of the conditionArrivalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionArrivalCode() {
        return conditionArrivalCode;
    }

    /**
     * Sets the value of the conditionArrivalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionArrivalCode(String value) {
        this.conditionArrivalCode = value;
    }

    /**
     * Регистрационный номер транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansRegIdType }
     *     
     */
    public TransportMeansRegIdType getTransportMeansRegId() {
        return transportMeansRegId;
    }

    /**
     * Sets the value of the transportMeansRegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansRegIdType }
     *     
     */
    public void setTransportMeansRegId(TransportMeansRegIdType value) {
        this.transportMeansRegId = value;
    }

    /**
     * Идентификационный номер транспортного средства, присвоенный изготовителем
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

    /**
     * Кодовое обозначение марки транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link VehcicleMakeCodeType }
     *     
     */
    public VehcicleMakeCodeType getVehicleMakeCode() {
        return vehicleMakeCode;
    }

    /**
     * Sets the value of the vehicleMakeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehcicleMakeCodeType }
     *     
     */
    public void setVehicleMakeCode(VehcicleMakeCodeType value) {
        this.vehicleMakeCode = value;
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

    /**
     * Gets the value of the atdArrivalTransportMeansDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDArrivalTransportMeansDetailsType }
     *     
     */
    public ATDArrivalTransportMeansDetailsType getATDArrivalTransportMeansDetails() {
        return atdArrivalTransportMeansDetails;
    }

    /**
     * Sets the value of the atdArrivalTransportMeansDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDArrivalTransportMeansDetailsType }
     *     
     */
    public void setATDArrivalTransportMeansDetails(ATDArrivalTransportMeansDetailsType value) {
        this.atdArrivalTransportMeansDetails = value;
    }

    /**
     * Иные сведения о транспортных средствах Gets the value of the descriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescriptionText() {
        if (descriptionText == null) {
            descriptionText = new ArrayList<String>();
        }
        return this.descriptionText;
    }

}
