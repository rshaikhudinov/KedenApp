
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.ResourceItemStatusDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.StatusDetailsV2Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения об учетной единице реестра уполномоченных экономических операторов
 * 
 * <p>Java class for RegisterAEODetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterAEODetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterDocumentIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ActivityStartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ActivityEndDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}StatusV2Details"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterOrganizationDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AEOStorageFacilityDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ResourceItemStatusDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterAEODetailsType", propOrder = {
    "unifiedCountryCode",
    "eventDate",
    "registerDocumentIdDetails",
    "activityStartDate",
    "activityEndDate",
    "statusV2Details",
    "registerOrganizationDetails",
    "aeoStorageFacilityDetails",
    "resourceItemStatusDetails"
})
public class RegisterAEODetailsType {

    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "RegisterDocumentIdDetails", required = true)
    protected RegisterDocumentIdDetailsType registerDocumentIdDetails;
    @XmlElement(name = "ActivityStartDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityStartDate;
    @XmlElement(name = "ActivityEndDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityEndDate;
    @XmlElement(name = "StatusV2Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected StatusDetailsV2Type statusV2Details;
    @XmlElement(name = "RegisterOrganizationDetails", required = true)
    protected List<RegisterOrganizationDetailsType> registerOrganizationDetails;
    @XmlElement(name = "AEOStorageFacilityDetails")
    protected List<AEOStorageFacilityDetailsType> aeoStorageFacilityDetails;
    @XmlElement(name = "ResourceItemStatusDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected ResourceItemStatusDetailsType resourceItemStatusDetails;

    /**
     * кодовое обозначение страны, представившей информацию
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
     * дата включения юридического лица в реестр государства-члена Союза
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
     * сведения о документе, подтверждающем включение юридического лица в реестр
     * 
     * @return
     *     possible object is
     *     {@link RegisterDocumentIdDetailsType }
     *     
     */
    public RegisterDocumentIdDetailsType getRegisterDocumentIdDetails() {
        return registerDocumentIdDetails;
    }

    /**
     * Sets the value of the registerDocumentIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterDocumentIdDetailsType }
     *     
     */
    public void setRegisterDocumentIdDetails(RegisterDocumentIdDetailsType value) {
        this.registerDocumentIdDetails = value;
    }

    /**
     * дата вступления в силу свидетельства уполномоченного экономического оператора
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityStartDate() {
        return activityStartDate;
    }

    /**
     * Sets the value of the activityStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityStartDate(XMLGregorianCalendar value) {
        this.activityStartDate = value;
    }

    /**
     * дата исключения уполномоченного экономического оператора из реестра
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityEndDate() {
        return activityEndDate;
    }

    /**
     * Sets the value of the activityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityEndDate(XMLGregorianCalendar value) {
        this.activityEndDate = value;
    }

    /**
     * Сведения об изменении статуса свидетельства уполномоченного экономического оператора
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailsV2Type }
     *     
     */
    public StatusDetailsV2Type getStatusV2Details() {
        return statusV2Details;
    }

    /**
     * Sets the value of the statusV2Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailsV2Type }
     *     
     */
    public void setStatusV2Details(StatusDetailsV2Type value) {
        this.statusV2Details = value;
    }

    /**
     * Сведения об уполномоченном экономическом операторе (юридическом лице) и его обособленных структурных подразделениях (филиалах) Gets the value of the registerOrganizationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the registerOrganizationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegisterOrganizationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterOrganizationDetailsType }
     * 
     * 
     */
    public List<RegisterOrganizationDetailsType> getRegisterOrganizationDetails() {
        if (registerOrganizationDetails == null) {
            registerOrganizationDetails = new ArrayList<RegisterOrganizationDetailsType>();
        }
        return this.registerOrganizationDetails;
    }

    /**
     * Gets the value of the aeoStorageFacilityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the aeoStorageFacilityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAEOStorageFacilityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AEOStorageFacilityDetailsType }
     * 
     * 
     */
    public List<AEOStorageFacilityDetailsType> getAEOStorageFacilityDetails() {
        if (aeoStorageFacilityDetails == null) {
            aeoStorageFacilityDetails = new ArrayList<AEOStorageFacilityDetailsType>();
        }
        return this.aeoStorageFacilityDetails;
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
