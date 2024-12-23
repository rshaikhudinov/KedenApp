
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.TransportMeansRegIdType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
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
 * Сведения о транспортном средстве
 * 
 * <p>Java class for CRAutomobileDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRAutomobileDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CAAutoBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportCategoryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportTypeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportColorCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleEcoClassCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EngineId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EngineKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EngineVolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EngineMaxPowerMeasure" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CapacityQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportCarryingCapacityMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}OrganizationName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExploitationDuration" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}AppointmentCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}MoveDirectCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}VehiclePassportRegDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TransportMeansRegId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RegistrationRemovalIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExportDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRAutomobileDetailsType", propOrder = {
    "transportCategoryCode",
    "transportTypeName",
    "transportColorCode",
    "vehicleEcoClassCode",
    "engineId",
    "engineKindCode",
    "engineVolumeMeasure",
    "engineMaxPowerMeasure",
    "capacityQuantity",
    "transportCarryingCapacityMeasure",
    "organizationName",
    "unifiedCountryCode",
    "exploitationDuration",
    "appointmentCode",
    "moveDirectCode",
    "vehiclePassportRegDetails",
    "transportMeansRegId",
    "registrationRemovalIndicator",
    "exportDate"
})
public class CRAutomobileDetailsType
    extends CAAutoBaseDetailsType
{

    @XmlElement(name = "TransportCategoryCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportCategoryCode;
    @XmlElement(name = "TransportTypeName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportTypeName;
    @XmlElement(name = "TransportColorCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportColorCode;
    @XmlElement(name = "VehicleEcoClassCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected VehicleEcoClassCodeType vehicleEcoClassCode;
    @XmlElement(name = "EngineId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String engineId;
    @XmlElement(name = "EngineKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String engineKindCode;
    @XmlElement(name = "EngineVolumeMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType engineVolumeMeasure;
    @XmlElement(name = "EngineMaxPowerMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<UnifiedPhysicalMeasureType> engineMaxPowerMeasure;
    @XmlElement(name = "CapacityQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger capacityQuantity;
    @XmlElement(name = "TransportCarryingCapacityMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType transportCarryingCapacityMeasure;
    @XmlElement(name = "OrganizationName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organizationName;
    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "ExploitationDuration", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Duration exploitationDuration;
    @XmlElement(name = "AppointmentCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String appointmentCode;
    @XmlElement(name = "MoveDirectCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String moveDirectCode;
    @XmlElement(name = "VehiclePassportRegDetails")
    protected VehiclePassportRegDetailsType vehiclePassportRegDetails;
    @XmlElement(name = "TransportMeansRegId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected TransportMeansRegIdType transportMeansRegId;
    @XmlElement(name = "RegistrationRemovalIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean registrationRemovalIndicator;
    @XmlElement(name = "ExportDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exportDate;

    /**
     * Gets the value of the transportCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportCategoryCode() {
        return transportCategoryCode;
    }

    /**
     * Sets the value of the transportCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportCategoryCode(String value) {
        this.transportCategoryCode = value;
    }

    /**
     * Gets the value of the transportTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportTypeName() {
        return transportTypeName;
    }

    /**
     * Sets the value of the transportTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportTypeName(String value) {
        this.transportTypeName = value;
    }

    /**
     * Gets the value of the transportColorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportColorCode() {
        return transportColorCode;
    }

    /**
     * Sets the value of the transportColorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportColorCode(String value) {
        this.transportColorCode = value;
    }

    /**
     * код экологического класса транспортного средства
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
     * Gets the value of the capacityQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCapacityQuantity() {
        return capacityQuantity;
    }

    /**
     * Sets the value of the capacityQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCapacityQuantity(BigInteger value) {
        this.capacityQuantity = value;
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
     * Наименование организации-изготовителя
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Код страны-изготовителя
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public UnifiedCountryCodeType getUnifiedCountryCode() {
        return unifiedCountryCode;
    }

    /**
     * Sets the value of the unifiedCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public void setUnifiedCountryCode(UnifiedCountryCodeType value) {
        this.unifiedCountryCode = value;
    }

    /**
     * Gets the value of the exploitationDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExploitationDuration() {
        return exploitationDuration;
    }

    /**
     * Sets the value of the exploitationDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExploitationDuration(Duration value) {
        this.exploitationDuration = value;
    }

    /**
     * назначение транспортного средства (для Российской Федерации)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppointmentCode() {
        return appointmentCode;
    }

    /**
     * Sets the value of the appointmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppointmentCode(String value) {
        this.appointmentCode = value;
    }

    /**
     * направление перемещения (для Российской Федерации)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoveDirectCode() {
        return moveDirectCode;
    }

    /**
     * Sets the value of the moveDirectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoveDirectCode(String value) {
        this.moveDirectCode = value;
    }

    /**
     * сведения о регистрации паспорта транспортного средства (паспорта шасси транспортного средства) (для Российской Федерации)
     * 
     * @return
     *     possible object is
     *     {@link VehiclePassportRegDetailsType }
     *     
     */
    public VehiclePassportRegDetailsType getVehiclePassportRegDetails() {
        return vehiclePassportRegDetails;
    }

    /**
     * Sets the value of the vehiclePassportRegDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePassportRegDetailsType }
     *     
     */
    public void setVehiclePassportRegDetails(VehiclePassportRegDetailsType value) {
        this.vehiclePassportRegDetails = value;
    }

    /**
     * Регистрационный номер транспортного средства (для Российской Федерации)
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
     * признак снятия с регистрационного учета в государстве предыдущей регистрации (для Российской Федерации)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRegistrationRemovalIndicator() {
        return registrationRemovalIndicator;
    }

    /**
     * Sets the value of the registrationRemovalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRegistrationRemovalIndicator(Boolean value) {
        this.registrationRemovalIndicator = value;
    }

    /**
     * Дата временного вывоза (для Российской Федерации)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExportDate() {
        return exportDate;
    }

    /**
     * Sets the value of the exportDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExportDate(XMLGregorianCalendar value) {
        this.exportDate = value;
    }

}
