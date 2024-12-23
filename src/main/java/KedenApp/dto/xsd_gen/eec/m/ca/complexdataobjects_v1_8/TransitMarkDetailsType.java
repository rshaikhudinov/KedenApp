
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения об отметках таможенного органа в транзитной декларации
 * 
 * <p>Java class for TransitMarkDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransitMarkDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsMarkCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDateTime"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OneTimePermissionIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ActInspectionDocIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DepartureCustomsOfficeDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitRoutePointDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitDestinationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitLimitDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SealDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SafePackageId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ArrivalDateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DamagedSealIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OffenceIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ArrivalDocumentIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocV4Details" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}NoteText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EndDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPersonDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitMarkDetailsType", propOrder = {
    "customsMarkCode",
    "eventDateTime",
    "customsOfficeCode",
    "oneTimePermissionIndicator",
    "actInspectionDocIdDetails",
    "departureCustomsOfficeDetails",
    "transitRoutePointDetails",
    "transitDestinationDetails",
    "transitLimitDate",
    "sealDetails",
    "eventDate",
    "safePackageId",
    "arrivalDateTime",
    "damagedSealIndicator",
    "offenceIndicator",
    "arrivalDocumentIdDetails",
    "docV4Details",
    "noteText",
    "endDate",
    "customsPersonDetails"
})
public class TransitMarkDetailsType {

    @XmlElement(name = "CustomsMarkCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsMarkCode;
    @XmlElement(name = "EventDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;
    @XmlElement(name = "CustomsOfficeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeCode;
    @XmlElement(name = "OneTimePermissionIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean oneTimePermissionIndicator;
    @XmlElement(name = "ActInspectionDocIdDetails")
    protected InspectionDocIdDetailsType actInspectionDocIdDetails;
    @XmlElement(name = "DepartureCustomsOfficeDetails")
    protected UnifiedCustomsOfficeDetailsType departureCustomsOfficeDetails;
    @XmlElement(name = "TransitRoutePointDetails")
    protected List<TransitRoutePointDetailsType> transitRoutePointDetails;
    @XmlElement(name = "TransitDestinationDetails")
    protected TransitDestinationDetailsType transitDestinationDetails;
    @XmlElement(name = "TransitLimitDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transitLimitDate;
    @XmlElement(name = "SealDetails")
    protected SealDetailsType sealDetails;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "SafePackageId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String safePackageId;
    @XmlElement(name = "ArrivalDateTime", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlElement(name = "DamagedSealIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean damagedSealIndicator;
    @XmlElement(name = "OffenceIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean offenceIndicator;
    @XmlElement(name = "ArrivalDocumentIdDetails")
    protected CustomsDocumentIdDetailsType arrivalDocumentIdDetails;
    @XmlElement(name = "DocV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected DocDetailsV4Type docV4Details;
    @XmlElement(name = "NoteText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String noteText;
    @XmlElement(name = "EndDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "CustomsPersonDetails")
    protected CustomsPersonDetailsType customsPersonDetails;

    /**
     * Gets the value of the customsMarkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsMarkCode() {
        return customsMarkCode;
    }

    /**
     * Sets the value of the customsMarkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsMarkCode(String value) {
        this.customsMarkCode = value;
    }

    /**
     * Дата и время проставления служебной отметки
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
     * Код таможенного органа, совершающего таможенные операции
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOfficeCode() {
        return customsOfficeCode;
    }

    /**
     * Sets the value of the customsOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOfficeCode(String value) {
        this.customsOfficeCode = value;
    }

    /**
     * Gets the value of the oneTimePermissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOneTimePermissionIndicator() {
        return oneTimePermissionIndicator;
    }

    /**
     * Sets the value of the oneTimePermissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOneTimePermissionIndicator(Boolean value) {
        this.oneTimePermissionIndicator = value;
    }

    /**
     * Gets the value of the actInspectionDocIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InspectionDocIdDetailsType }
     *     
     */
    public InspectionDocIdDetailsType getActInspectionDocIdDetails() {
        return actInspectionDocIdDetails;
    }

    /**
     * Sets the value of the actInspectionDocIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionDocIdDetailsType }
     *     
     */
    public void setActInspectionDocIdDetails(InspectionDocIdDetailsType value) {
        this.actInspectionDocIdDetails = value;
    }

    /**
     * Gets the value of the departureCustomsOfficeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCustomsOfficeDetailsType }
     *     
     */
    public UnifiedCustomsOfficeDetailsType getDepartureCustomsOfficeDetails() {
        return departureCustomsOfficeDetails;
    }

    /**
     * Sets the value of the departureCustomsOfficeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCustomsOfficeDetailsType }
     *     
     */
    public void setDepartureCustomsOfficeDetails(UnifiedCustomsOfficeDetailsType value) {
        this.departureCustomsOfficeDetails = value;
    }

    /**
     * Gets the value of the transitRoutePointDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transitRoutePointDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitRoutePointDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitRoutePointDetailsType }
     * 
     * 
     */
    public List<TransitRoutePointDetailsType> getTransitRoutePointDetails() {
        if (transitRoutePointDetails == null) {
            transitRoutePointDetails = new ArrayList<TransitRoutePointDetailsType>();
        }
        return this.transitRoutePointDetails;
    }

    /**
     * Gets the value of the transitDestinationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransitDestinationDetailsType }
     *     
     */
    public TransitDestinationDetailsType getTransitDestinationDetails() {
        return transitDestinationDetails;
    }

    /**
     * Sets the value of the transitDestinationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitDestinationDetailsType }
     *     
     */
    public void setTransitDestinationDetails(TransitDestinationDetailsType value) {
        this.transitDestinationDetails = value;
    }

    /**
     * Gets the value of the transitLimitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransitLimitDate() {
        return transitLimitDate;
    }

    /**
     * Sets the value of the transitLimitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransitLimitDate(XMLGregorianCalendar value) {
        this.transitLimitDate = value;
    }

    /**
     * Gets the value of the sealDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SealDetailsType }
     *     
     */
    public SealDetailsType getSealDetails() {
        return sealDetails;
    }

    /**
     * Sets the value of the sealDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SealDetailsType }
     *     
     */
    public void setSealDetails(SealDetailsType value) {
        this.sealDetails = value;
    }

    /**
     * Дата выпуска товаров
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
     * Gets the value of the safePackageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSafePackageId() {
        return safePackageId;
    }

    /**
     * Sets the value of the safePackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSafePackageId(String value) {
        this.safePackageId = value;
    }

    /**
     * Дата и время представления в таможенный орган назначения транзитной декларации и других документов
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * Sets the value of the arrivalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

    /**
     * Gets the value of the damagedSealIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDamagedSealIndicator() {
        return damagedSealIndicator;
    }

    /**
     * Sets the value of the damagedSealIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDamagedSealIndicator(Boolean value) {
        this.damagedSealIndicator = value;
    }

    /**
     * Gets the value of the offenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffenceIndicator() {
        return offenceIndicator;
    }

    /**
     * Sets the value of the offenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffenceIndicator(Boolean value) {
        this.offenceIndicator = value;
    }

    /**
     * Gets the value of the arrivalDocumentIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public CustomsDocumentIdDetailsType getArrivalDocumentIdDetails() {
        return arrivalDocumentIdDetails;
    }

    /**
     * Sets the value of the arrivalDocumentIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public void setArrivalDocumentIdDetails(CustomsDocumentIdDetailsType value) {
        this.arrivalDocumentIdDetails = value;
    }

    /**
     * Сведения об акте об аварии или о наступлении обстоятельств непреодолимой силы
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
     * Дополнительная информация, комментарии, иные сведения, имеющие значения для таможенных целей
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * Sets the value of the noteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteText(String value) {
        this.noteText = value;
    }

    /**
     * Дата фактического завершения таможенной процедуры таможенного транзита
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the customsPersonDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsPersonDetailsType }
     *     
     */
    public CustomsPersonDetailsType getCustomsPersonDetails() {
        return customsPersonDetails;
    }

    /**
     * Sets the value of the customsPersonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsPersonDetailsType }
     *     
     */
    public void setCustomsPersonDetails(CustomsPersonDetailsType value) {
        this.customsPersonDetails = value;
    }

}
