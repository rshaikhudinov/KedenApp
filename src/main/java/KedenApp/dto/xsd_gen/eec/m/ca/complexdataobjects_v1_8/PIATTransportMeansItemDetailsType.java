
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CACountryCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransportTypeCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.TransportMeansRegIdType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.VehicleMakeCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о регистрационном номере и идентификаторах автомобильного транспортного средства при представлении предварительной информации
 * 
 * <p>Java class for PIATTransportMeansItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIATTransportMeansItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObjectOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RegistrationNationalityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TransportMeansRegId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleChassisId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleBodyId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleMakeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}VehicleModelName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIATTransportMeansItemDetailsType", propOrder = {
    "objectOrdinal",
    "registrationNationalityCode",
    "transportMeansRegId",
    "vehicleId",
    "vehicleChassisId",
    "vehicleBodyId",
    "transportTypeCode",
    "vehicleMakeCode",
    "vehicleModelName",
    "docId"
})
public class PIATTransportMeansItemDetailsType {

    @XmlElement(name = "ObjectOrdinal", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger objectOrdinal;
    @XmlElement(name = "RegistrationNationalityCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CACountryCodeType registrationNationalityCode;
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
    @XmlElement(name = "TransportTypeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected TransportTypeCodeType transportTypeCode;
    @XmlElement(name = "VehicleMakeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected VehicleMakeCodeType vehicleMakeCode;
    @XmlElement(name = "VehicleModelName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vehicleModelName;
    @XmlElement(name = "DocId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docId;

    /**
     * Порядковый номер транспортного средства
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
     * Gets the value of the registrationNationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryCodeType }
     *     
     */
    public CACountryCodeType getRegistrationNationalityCode() {
        return registrationNationalityCode;
    }

    /**
     * Sets the value of the registrationNationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryCodeType }
     *     
     */
    public void setRegistrationNationalityCode(CACountryCodeType value) {
        this.registrationNationalityCode = value;
    }

    /**
     * регистрационный номер автомобильного транспортного средства, прицепа, полуприцепа, название водного судна, номер рейса воздушного судна, номер железнодорожного транспортного средства (вагона, полувагона, платформы, цистерны и т.п.), идентификационный номер контейнера
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

    /**
     * кодовое обозначение типа транспортного средства
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
     * Номер свидетельства о регистрации транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
    }

}
