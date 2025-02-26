
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие дополнительные сведения о водном (морском, речном) судне
 * 
 * <p>Java class for VesselConstructionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselConstructionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VesselBodyId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ManufacturerName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedLengthMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedWidthMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DraftMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ManufactureYear" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}VesselEngineDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PassengersQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CabinQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselConstructionDetailsType", propOrder = {
    "vesselBodyId",
    "manufacturerName",
    "unifiedLengthMeasure",
    "unifiedWidthMeasure",
    "draftMeasure",
    "manufactureYear",
    "vesselEngineDetails",
    "passengersQuantity",
    "cabinQuantity",
    "descriptionText"
})
public class VesselConstructionDetailsType {

    @XmlElement(name = "VesselBodyId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String vesselBodyId;
    @XmlElement(name = "ManufacturerName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String manufacturerName;
    @XmlElement(name = "UnifiedLengthMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedLengthMeasure;
    @XmlElement(name = "UnifiedWidthMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedWidthMeasure;
    @XmlElement(name = "DraftMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType draftMeasure;
    @XmlElement(name = "ManufactureYear", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar manufactureYear;
    @XmlElement(name = "VesselEngineDetails")
    protected List<VesselEngineDetailsType> vesselEngineDetails;
    @XmlElement(name = "PassengersQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger passengersQuantity;
    @XmlElement(name = "CabinQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cabinQuantity;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;

    /**
     * Gets the value of the vesselBodyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVesselBodyId() {
        return vesselBodyId;
    }

    /**
     * Sets the value of the vesselBodyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVesselBodyId(String value) {
        this.vesselBodyId = value;
    }

    /**
     * Название верфи
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * Sets the value of the manufacturerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturerName(String value) {
        this.manufacturerName = value;
    }

    /**
     * Gets the value of the unifiedLengthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getUnifiedLengthMeasure() {
        return unifiedLengthMeasure;
    }

    /**
     * Sets the value of the unifiedLengthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setUnifiedLengthMeasure(UnifiedPhysicalMeasureType value) {
        this.unifiedLengthMeasure = value;
    }

    /**
     * Gets the value of the unifiedWidthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getUnifiedWidthMeasure() {
        return unifiedWidthMeasure;
    }

    /**
     * Sets the value of the unifiedWidthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setUnifiedWidthMeasure(UnifiedPhysicalMeasureType value) {
        this.unifiedWidthMeasure = value;
    }

    /**
     * Gets the value of the draftMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getDraftMeasure() {
        return draftMeasure;
    }

    /**
     * Sets the value of the draftMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setDraftMeasure(UnifiedPhysicalMeasureType value) {
        this.draftMeasure = value;
    }

    /**
     * Год постройки
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getManufactureYear() {
        return manufactureYear;
    }

    /**
     * Sets the value of the manufactureYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setManufactureYear(XMLGregorianCalendar value) {
        this.manufactureYear = value;
    }

    /**
     * Gets the value of the vesselEngineDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vesselEngineDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVesselEngineDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VesselEngineDetailsType }
     * 
     * 
     */
    public List<VesselEngineDetailsType> getVesselEngineDetails() {
        if (vesselEngineDetails == null) {
            vesselEngineDetails = new ArrayList<VesselEngineDetailsType>();
        }
        return this.vesselEngineDetails;
    }

    /**
     * Количество пассажиров (вместимость)
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
     * Gets the value of the cabinQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCabinQuantity() {
        return cabinQuantity;
    }

    /**
     * Sets the value of the cabinQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCabinQuantity(BigInteger value) {
        this.cabinQuantity = value;
    }

    /**
     * Описание технического оснащения судна и дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

}
