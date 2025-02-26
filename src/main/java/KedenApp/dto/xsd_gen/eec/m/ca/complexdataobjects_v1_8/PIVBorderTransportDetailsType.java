
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.TransportMeansRegIdType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о транспортном средстве в месте прибытия товаров на таможенную территорию Союза при перевозке товаров водным транспортом
 * 
 * <p>Java class for PIVBorderTransportDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIVBorderTransportDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObjectOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedTransportModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ContainerIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TransportMeansRegId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VesselIMOId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VesselTypeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VesselTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GrossTonnageMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}VesselRegistrationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}VoyageDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIVItineraryPointDetails" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportMeansEntryPurposeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CrewQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PassengersQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIVMasterDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIVCrewMemberDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIVPassengerDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIVBorderTransportDetailsType", propOrder = {
    "objectOrdinal",
    "unifiedTransportModeCode",
    "containerIndicator",
    "transportMeansRegId",
    "vesselIMOId",
    "vesselTypeName",
    "vesselTypeCode",
    "grossTonnageMeasure",
    "vesselRegistrationDetails",
    "voyageDetails",
    "pivItineraryPointDetails",
    "transportMeansEntryPurposeCode",
    "crewQuantity",
    "passengersQuantity",
    "pivMasterDetails",
    "pivCrewMemberDetails",
    "pivPassengerDetails"
})
public class PIVBorderTransportDetailsType {

    @XmlElement(name = "ObjectOrdinal", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger objectOrdinal;
    @XmlElement(name = "UnifiedTransportModeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type unifiedTransportModeCode;
    @XmlElement(name = "ContainerIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean containerIndicator;
    @XmlElement(name = "TransportMeansRegId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected TransportMeansRegIdType transportMeansRegId;
    @XmlElement(name = "VesselIMOId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vesselIMOId;
    @XmlElement(name = "VesselTypeName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vesselTypeName;
    @XmlElement(name = "VesselTypeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vesselTypeCode;
    @XmlElement(name = "GrossTonnageMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType grossTonnageMeasure;
    @XmlElement(name = "VesselRegistrationDetails")
    protected VesselRegistrationDetailsType vesselRegistrationDetails;
    @XmlElement(name = "VoyageDetails")
    protected VoyageDetailsType voyageDetails;
    @XmlElement(name = "PIVItineraryPointDetails")
    protected List<PIVRoutePointDetailsType> pivItineraryPointDetails;
    @XmlElement(name = "TransportMeansEntryPurposeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportMeansEntryPurposeCode;
    @XmlElement(name = "CrewQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger crewQuantity;
    @XmlElement(name = "PassengersQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger passengersQuantity;
    @XmlElement(name = "PIVMasterDetails")
    protected PIVPersonOnBoardDetailsType pivMasterDetails;
    @XmlElement(name = "PIVCrewMemberDetails")
    protected List<PIVCrewMemberDetailsType> pivCrewMemberDetails;
    @XmlElement(name = "PIVPassengerDetails")
    protected List<PIVPassengerDetailsType> pivPassengerDetails;

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
     * наименование судна
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
     * Gets the value of the vesselIMOId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselIMOId() {
        return vesselIMOId;
    }

    /**
     * Sets the value of the vesselIMOId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselIMOId(String value) {
        this.vesselIMOId = value;
    }

    /**
     * Gets the value of the vesselTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselTypeName() {
        return vesselTypeName;
    }

    /**
     * Sets the value of the vesselTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselTypeName(String value) {
        this.vesselTypeName = value;
    }

    /**
     * Gets the value of the vesselTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselTypeCode() {
        return vesselTypeCode;
    }

    /**
     * Sets the value of the vesselTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselTypeCode(String value) {
        this.vesselTypeCode = value;
    }

    /**
     * Gets the value of the grossTonnageMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getGrossTonnageMeasure() {
        return grossTonnageMeasure;
    }

    /**
     * Sets the value of the grossTonnageMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setGrossTonnageMeasure(UnifiedPhysicalMeasureType value) {
        this.grossTonnageMeasure = value;
    }

    /**
     * Gets the value of the vesselRegistrationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VesselRegistrationDetailsType }
     *     
     */
    public VesselRegistrationDetailsType getVesselRegistrationDetails() {
        return vesselRegistrationDetails;
    }

    /**
     * Sets the value of the vesselRegistrationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VesselRegistrationDetailsType }
     *     
     */
    public void setVesselRegistrationDetails(VesselRegistrationDetailsType value) {
        this.vesselRegistrationDetails = value;
    }

    /**
     * Gets the value of the voyageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VoyageDetailsType }
     *     
     */
    public VoyageDetailsType getVoyageDetails() {
        return voyageDetails;
    }

    /**
     * Sets the value of the voyageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoyageDetailsType }
     *     
     */
    public void setVoyageDetails(VoyageDetailsType value) {
        this.voyageDetails = value;
    }

    /**
     * Gets the value of the pivItineraryPointDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pivItineraryPointDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIVItineraryPointDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIVRoutePointDetailsType }
     * 
     * 
     */
    public List<PIVRoutePointDetailsType> getPIVItineraryPointDetails() {
        if (pivItineraryPointDetails == null) {
            pivItineraryPointDetails = new ArrayList<PIVRoutePointDetailsType>();
        }
        return this.pivItineraryPointDetails;
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
     * Gets the value of the pivMasterDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PIVPersonOnBoardDetailsType }
     *     
     */
    public PIVPersonOnBoardDetailsType getPIVMasterDetails() {
        return pivMasterDetails;
    }

    /**
     * Sets the value of the pivMasterDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIVPersonOnBoardDetailsType }
     *     
     */
    public void setPIVMasterDetails(PIVPersonOnBoardDetailsType value) {
        this.pivMasterDetails = value;
    }

    /**
     * Gets the value of the pivCrewMemberDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pivCrewMemberDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIVCrewMemberDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIVCrewMemberDetailsType }
     * 
     * 
     */
    public List<PIVCrewMemberDetailsType> getPIVCrewMemberDetails() {
        if (pivCrewMemberDetails == null) {
            pivCrewMemberDetails = new ArrayList<PIVCrewMemberDetailsType>();
        }
        return this.pivCrewMemberDetails;
    }

    /**
     * Gets the value of the pivPassengerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pivPassengerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIVPassengerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIVPassengerDetailsType }
     * 
     * 
     */
    public List<PIVPassengerDetailsType> getPIVPassengerDetails() {
        if (pivPassengerDetails == null) {
            pivPassengerDetails = new ArrayList<PIVPassengerDetailsType>();
        }
        return this.pivPassengerDetails;
    }

}
