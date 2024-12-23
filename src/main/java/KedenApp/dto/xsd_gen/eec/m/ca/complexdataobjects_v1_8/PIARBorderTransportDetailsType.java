
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransportTypeCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.TransportMeansRegIdType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.VehicleMakeCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о транспортном средстве, прибывающем на территорию Евразийского экономического союза
 * 
 * <p>Java class for PIARBorderTransportDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIARBorderTransportDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObjectOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedTransportModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ContainerIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TransportMeansRegId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FlightDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DepartureDateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIItineraryPointDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportMeansEntryPurposeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleMakeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleMakeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VehicleModelName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OperatorDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CrewQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PassengersQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIARMasterDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIARCrewMemberDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIARPassengerDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIARBorderTransportDetailsType", propOrder = {
    "objectOrdinal",
    "unifiedTransportModeCode",
    "containerIndicator",
    "transportMeansRegId",
    "flightDetails",
    "departureDateTime",
    "piItineraryPointDetails",
    "transportMeansEntryPurposeCode",
    "transportTypeCode",
    "vehicleMakeCode",
    "vehicleMakeName",
    "vehicleModelName",
    "operatorDetails",
    "crewQuantity",
    "passengersQuantity",
    "piarMasterDetails",
    "piarCrewMemberDetails",
    "piarPassengerDetails"
})
public class PIARBorderTransportDetailsType {

    @XmlElement(name = "ObjectOrdinal", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger objectOrdinal;
    @XmlElement(name = "UnifiedTransportModeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type unifiedTransportModeCode;
    @XmlElement(name = "ContainerIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean containerIndicator;
    @XmlElement(name = "TransportMeansRegId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected TransportMeansRegIdType transportMeansRegId;
    @XmlElement(name = "FlightDetails")
    protected FlightDetailsType flightDetails;
    @XmlElement(name = "DepartureDateTime", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlElement(name = "PIItineraryPointDetails")
    protected List<PIARRoutePointDetailsType> piItineraryPointDetails;
    @XmlElement(name = "TransportMeansEntryPurposeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportMeansEntryPurposeCode;
    @XmlElement(name = "TransportTypeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected TransportTypeCodeType transportTypeCode;
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
    @XmlElement(name = "OperatorDetails")
    protected OperatorDetailsType operatorDetails;
    @XmlElement(name = "CrewQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger crewQuantity;
    @XmlElement(name = "PassengersQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger passengersQuantity;
    @XmlElement(name = "PIARMasterDetails")
    protected PIPersonOnBoardMainDetailsType piarMasterDetails;
    @XmlElement(name = "PIARCrewMemberDetails")
    protected List<PIPersonOnBoardMainDetailsType> piarCrewMemberDetails;
    @XmlElement(name = "PIARPassengerDetails")
    protected List<PIPersonOnBoardMainDetailsType> piarPassengerDetails;

    /**
     * порядковый номер транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectOrdinal() {
        return objectOrdinal;
    }

    /**
     * Sets the value of the objectOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectOrdinal(BigInteger value) {
        this.objectOrdinal = value;
    }

    /**
     * Gets the value of the unifiedTransportModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getUnifiedTransportModeCode() {
        return unifiedTransportModeCode;
    }

    /**
     * Sets the value of the unifiedTransportModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setUnifiedTransportModeCode(UnifiedCode20Type value) {
        this.unifiedTransportModeCode = value;
    }

    /**
     * Gets the value of the containerIndicator property.
     * 
     */
    public Boolean isContainerIndicator() {
        return containerIndicator;
    }

    /**
     * Sets the value of the containerIndicator property.
     * 
     */
    public void setContainerIndicator(Boolean value) {
        this.containerIndicator = value;
    }

    /**
     * Регистрационный знак и код государства принадлежности воздушного судна
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
     * Gets the value of the flightDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailsType }
     *     
     */
    public FlightDetailsType getFlightDetails() {
        return flightDetails;
    }

    /**
     * Sets the value of the flightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailsType }
     *     
     */
    public void setFlightDetails(FlightDetailsType value) {
        this.flightDetails = value;
    }

    /**
     * Фактические дата и время вылета в аэропорт прибытия на таможенной территории Евразийского экономического союза
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * Sets the value of the departureDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTime(XMLGregorianCalendar value) {
        this.departureDateTime = value;
    }

    /**
     * Сведения о маршруте полета Gets the value of the piItineraryPointDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piItineraryPointDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIItineraryPointDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIARRoutePointDetailsType }
     * 
     * 
     */
    public List<PIARRoutePointDetailsType> getPIItineraryPointDetails() {
        if (piItineraryPointDetails == null) {
            piItineraryPointDetails = new ArrayList<PIARRoutePointDetailsType>();
        }
        return this.piItineraryPointDetails;
    }

    /**
     * Gets the value of the transportMeansEntryPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMeansEntryPurposeCode() {
        return transportMeansEntryPurposeCode;
    }

    /**
     * Sets the value of the transportMeansEntryPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMeansEntryPurposeCode(String value) {
        this.transportMeansEntryPurposeCode = value;
    }

    /**
     * Gets the value of the transportTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportTypeCodeType }
     *     
     */
    public TransportTypeCodeType getTransportTypeCode() {
        return transportTypeCode;
    }

    /**
     * Sets the value of the transportTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTypeCodeType }
     *     
     */
    public void setTransportTypeCode(TransportTypeCodeType value) {
        this.transportTypeCode = value;
    }

    /**
     * Кодовое обозначение марки транспортного средства
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
     * Наименование марки транспортного средства
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

    /**
     * Gets the value of the operatorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OperatorDetailsType }
     *     
     */
    public OperatorDetailsType getOperatorDetails() {
        return operatorDetails;
    }

    /**
     * Sets the value of the operatorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperatorDetailsType }
     *     
     */
    public void setOperatorDetails(OperatorDetailsType value) {
        this.operatorDetails = value;
    }

    /**
     * Gets the value of the crewQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCrewQuantity() {
        return crewQuantity;
    }

    /**
     * Sets the value of the crewQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCrewQuantity(BigInteger value) {
        this.crewQuantity = value;
    }

    /**
     * Gets the value of the passengersQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassengersQuantity() {
        return passengersQuantity;
    }

    /**
     * Sets the value of the passengersQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassengersQuantity(BigInteger value) {
        this.passengersQuantity = value;
    }

    /**
     * Gets the value of the piarMasterDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PIPersonOnBoardMainDetailsType }
     *     
     */
    public PIPersonOnBoardMainDetailsType getPIARMasterDetails() {
        return piarMasterDetails;
    }

    /**
     * Sets the value of the piarMasterDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIPersonOnBoardMainDetailsType }
     *     
     */
    public void setPIARMasterDetails(PIPersonOnBoardMainDetailsType value) {
        this.piarMasterDetails = value;
    }

    /**
     * Gets the value of the piarCrewMemberDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piarCrewMemberDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIARCrewMemberDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIPersonOnBoardMainDetailsType }
     * 
     * 
     */
    public List<PIPersonOnBoardMainDetailsType> getPIARCrewMemberDetails() {
        if (piarCrewMemberDetails == null) {
            piarCrewMemberDetails = new ArrayList<PIPersonOnBoardMainDetailsType>();
        }
        return this.piarCrewMemberDetails;
    }

    /**
     * Gets the value of the piarPassengerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piarPassengerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIARPassengerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIPersonOnBoardMainDetailsType }
     * 
     * 
     */
    public List<PIPersonOnBoardMainDetailsType> getPIARPassengerDetails() {
        if (piarPassengerDetails == null) {
            piarPassengerDetails = new ArrayList<PIPersonOnBoardMainDetailsType>();
        }
        return this.piarPassengerDetails;
    }

}
