
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.ResourceItemStatusDetailsType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о временно ввезенном и не вывезенном ТСЛП
 * 
 * <p>Java class for TIEDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIEDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIERegistrationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDTransportMeansItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DriverDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIEOperationsDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TIEStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TempImportLimitDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ResourceItemStatusDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIEDetailsType", propOrder = {
    "unifiedCountryCode",
    "tieRegistrationDetails",
    "pdTransportMeansItemDetails",
    "driverDetails",
    "tieOperationsDetails",
    "tieStatusCode",
    "tempImportLimitDate",
    "eventDate",
    "resourceItemStatusDetails"
})
public class TIEDetailsType {

    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "TIERegistrationDetails")
    protected TIERegistrationDetalsType tieRegistrationDetails;
    @XmlElement(name = "PDTransportMeansItemDetails")
    protected List<PDTransportMeansItemDetailsType> pdTransportMeansItemDetails;
    @XmlElement(name = "DriverDetails")
    protected DriverDetailsType driverDetails;
    @XmlElement(name = "TIEOperationsDetails")
    protected List<TIEOperationsDetailsType> tieOperationsDetails;
    @XmlElement(name = "TIEStatusCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tieStatusCode;
    @XmlElement(name = "TempImportLimitDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar tempImportLimitDate;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "ResourceItemStatusDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected ResourceItemStatusDetailsType resourceItemStatusDetails;

    /**
     * Кодовое обозначение страны, предоставившей сведения
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
     * Gets the value of the tieRegistrationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TIERegistrationDetalsType }
     *     
     */
    public TIERegistrationDetalsType getTIERegistrationDetails() {
        return tieRegistrationDetails;
    }

    /**
     * Sets the value of the tieRegistrationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIERegistrationDetalsType }
     *     
     */
    public void setTIERegistrationDetails(TIERegistrationDetalsType value) {
        this.tieRegistrationDetails = value;
    }

    /**
     * Gets the value of the pdTransportMeansItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pdTransportMeansItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDTransportMeansItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDTransportMeansItemDetailsType }
     * 
     * 
     */
    public List<PDTransportMeansItemDetailsType> getPDTransportMeansItemDetails() {
        if (pdTransportMeansItemDetails == null) {
            pdTransportMeansItemDetails = new ArrayList<PDTransportMeansItemDetailsType>();
        }
        return this.pdTransportMeansItemDetails;
    }

    /**
     * Gets the value of the driverDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DriverDetailsType }
     *     
     */
    public DriverDetailsType getDriverDetails() {
        return driverDetails;
    }

    /**
     * Sets the value of the driverDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverDetailsType }
     *     
     */
    public void setDriverDetails(DriverDetailsType value) {
        this.driverDetails = value;
    }

    /**
     * Gets the value of the tieOperationsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tieOperationsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIEOperationsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIEOperationsDetailsType }
     * 
     * 
     */
    public List<TIEOperationsDetailsType> getTIEOperationsDetails() {
        if (tieOperationsDetails == null) {
            tieOperationsDetails = new ArrayList<TIEOperationsDetailsType>();
        }
        return this.tieOperationsDetails;
    }

    /**
     * Gets the value of the tieStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIEStatusCode() {
        return tieStatusCode;
    }

    /**
     * Sets the value of the tieStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIEStatusCode(String value) {
        this.tieStatusCode = value;
    }

    /**
     * Gets the value of the tempImportLimitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempImportLimitDate() {
        return tempImportLimitDate;
    }

    /**
     * Sets the value of the tempImportLimitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempImportLimitDate(XMLGregorianCalendar value) {
        this.tempImportLimitDate = value;
    }

    /**
     * Дата предоставления сведений
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the resourceItemStatusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceItemStatusDetailsType }
     *     
     */
    public ResourceItemStatusDetailsType getResourceItemStatusDetails() {
        return resourceItemStatusDetails;
    }

    /**
     * Sets the value of the resourceItemStatusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceItemStatusDetailsType }
     *     
     */
    public void setResourceItemStatusDetails(ResourceItemStatusDetailsType value) {
        this.resourceItemStatusDetails = value;
    }

}
