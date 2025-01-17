
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения об обстоятельствах, препятствующих выполнению обязаннстей перевозчика
 * 
 * <p>Java class for TDEmergencyOperationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDEmergencyOperationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PlaceName"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocV4Details"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDEmergencyCargoDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsIdentificationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDEmergencyOperationDetailsType", propOrder = {
    "unifiedCountryCode",
    "placeName",
    "docV4Details",
    "eventDate",
    "eventDateTime",
    "tdEmergencyCargoDetails",
    "customsIdentificationDetails"
})
public class TDEmergencyOperationDetailsType {

    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "PlaceName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String placeName;
    @XmlElement(name = "DocV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected DocDetailsV4Type docV4Details;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "EventDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;
    @XmlElement(name = "TDEmergencyCargoDetails")
    protected List<TDEmergencyCargoDetailsType> tdEmergencyCargoDetails;
    @XmlElement(name = "CustomsIdentificationDetails")
    protected List<CustomsIdentificationDetailsType> customsIdentificationDetails;

    /**
     * Кодовое обозначение страны, в которой возникли обстоятельства, препятствующие выполнению обязаннстей перевозчика
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
     * Наименование места в котором возникли обстоятельства, препятствующие выполнению обязаннстей перевозчика
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * Сведения об акте об аварии или действии непреодолимой силы
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getDocV4Details() {
        return docV4Details;
    }

    /**
     * Sets the value of the docV4Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setDocV4Details(DocDetailsV4Type value) {
        this.docV4Details = value;
    }

    /**
     * Дата возникновения обстоятельств
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
     * Дата и время фиксации результатов таможенного контроля
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Sets the value of the eventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDateTime(XMLGregorianCalendar value) {
        this.eventDateTime = value;
    }

    /**
     * Gets the value of the tdEmergencyCargoDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tdEmergencyCargoDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDEmergencyCargoDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDEmergencyCargoDetailsType }
     * 
     * 
     */
    public List<TDEmergencyCargoDetailsType> getTDEmergencyCargoDetails() {
        if (tdEmergencyCargoDetails == null) {
            tdEmergencyCargoDetails = new ArrayList<TDEmergencyCargoDetailsType>();
        }
        return this.tdEmergencyCargoDetails;
    }

    /**
     * Сведения о поврежденных средствах идентификации Gets the value of the customsIdentificationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customsIdentificationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsIdentificationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsIdentificationDetailsType }
     * 
     * 
     */
    public List<CustomsIdentificationDetailsType> getCustomsIdentificationDetails() {
        if (customsIdentificationDetails == null) {
            customsIdentificationDetails = new ArrayList<CustomsIdentificationDetailsType>();
        }
        return this.customsIdentificationDetails;
    }

}
