
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
 * Компоненты, представляющие сведения о таможенных операциях, сопершаемых в ходе таможенной процедуры таможенного транзита
 * 
 * <p>Java class for TDMovementOperationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDMovementOperationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsOperationCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OperationDateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitLimitDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitTerminationLimitDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ItineraryPointDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDTranshipmentOperationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDEmergencyOperationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocV4Details" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDTerminationOperationDetails" minOccurs="0"/&gt;
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
@XmlType(name = "TDMovementOperationDetailsType", propOrder = {
    "customsOperationCode",
    "customsOfficeCode",
    "operationDateTime",
    "transitLimitDate",
    "transitTerminationLimitDate",
    "itineraryPointDetails",
    "tdTranshipmentOperationDetails",
    "tdEmergencyOperationDetails",
    "docV4Details",
    "tdTerminationOperationDetails",
    "customsPersonDetails"
})
public class TDMovementOperationDetailsType {

    @XmlElement(name = "CustomsOperationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOperationCode;
    @XmlElement(name = "CustomsOfficeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeCode;
    @XmlElement(name = "OperationDateTime", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operationDateTime;
    @XmlElement(name = "TransitLimitDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transitLimitDate;
    @XmlElement(name = "TransitTerminationLimitDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transitTerminationLimitDate;
    @XmlElement(name = "ItineraryPointDetails")
    protected List<ItineraryPointDetailsType> itineraryPointDetails;
    @XmlElement(name = "TDTranshipmentOperationDetails")
    protected TDTranshipmentOperationDetailsType tdTranshipmentOperationDetails;
    @XmlElement(name = "TDEmergencyOperationDetails")
    protected TDEmergencyOperationDetailsType tdEmergencyOperationDetails;
    @XmlElement(name = "DocV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected DocDetailsV4Type docV4Details;
    @XmlElement(name = "TDTerminationOperationDetails")
    protected TDTerminationOperationDetailsType tdTerminationOperationDetails;
    @XmlElement(name = "CustomsPersonDetails")
    protected CustomsPersonDetailsType customsPersonDetails;

    /**
     * Gets the value of the customsOperationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOperationCode() {
        return customsOperationCode;
    }

    /**
     * Sets the value of the customsOperationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOperationCode(String value) {
        this.customsOperationCode = value;
    }

    /**
     * Gets the value of the customsOfficeCode property.
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
     * дата и время совершения операции или принятия решения таможенным органом
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDateTime() {
        return operationDateTime;
    }

    /**
     * Sets the value of the operationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDateTime(XMLGregorianCalendar value) {
        this.operationDateTime = value;
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
     * Gets the value of the transitTerminationLimitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransitTerminationLimitDate() {
        return transitTerminationLimitDate;
    }

    /**
     * Sets the value of the transitTerminationLimitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransitTerminationLimitDate(XMLGregorianCalendar value) {
        this.transitTerminationLimitDate = value;
    }

    /**
     * Gets the value of the itineraryPointDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryPointDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryPointDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryPointDetailsType }
     * 
     * 
     */
    public List<ItineraryPointDetailsType> getItineraryPointDetails() {
        if (itineraryPointDetails == null) {
            itineraryPointDetails = new ArrayList<ItineraryPointDetailsType>();
        }
        return this.itineraryPointDetails;
    }

    /**
     * Gets the value of the tdTranshipmentOperationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TDTranshipmentOperationDetailsType }
     *     
     */
    public TDTranshipmentOperationDetailsType getTDTranshipmentOperationDetails() {
        return tdTranshipmentOperationDetails;
    }

    /**
     * Sets the value of the tdTranshipmentOperationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDTranshipmentOperationDetailsType }
     *     
     */
    public void setTDTranshipmentOperationDetails(TDTranshipmentOperationDetailsType value) {
        this.tdTranshipmentOperationDetails = value;
    }

    /**
     * Gets the value of the tdEmergencyOperationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TDEmergencyOperationDetailsType }
     *     
     */
    public TDEmergencyOperationDetailsType getTDEmergencyOperationDetails() {
        return tdEmergencyOperationDetails;
    }

    /**
     * Sets the value of the tdEmergencyOperationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDEmergencyOperationDetailsType }
     *     
     */
    public void setTDEmergencyOperationDetails(TDEmergencyOperationDetailsType value) {
        this.tdEmergencyOperationDetails = value;
    }

    /**
     * Сведения о номере регистрации подачи документов
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
     * Gets the value of the tdTerminationOperationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TDTerminationOperationDetailsType }
     *     
     */
    public TDTerminationOperationDetailsType getTDTerminationOperationDetails() {
        return tdTerminationOperationDetails;
    }

    /**
     * Sets the value of the tdTerminationOperationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDTerminationOperationDetailsType }
     *     
     */
    public void setTDTerminationOperationDetails(TDTerminationOperationDetailsType value) {
        this.tdTerminationOperationDetails = value;
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
