
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Детальная информация о временном ввозе (вывозе) транспортного средства
 * 
 * <p>Java class for TIEProcedureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIEProcedureDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TITransportDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIERegistrationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIECarrierDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DriverDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIEOperationsDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TIEStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TempImportLimitDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIEProcedureDetailsType", propOrder = {
    "tiTransportDetails",
    "tieRegistrationDetails",
    "tieCarrierDetails",
    "driverDetails",
    "tieOperationsDetails",
    "tieStatusCode",
    "tempImportLimitDate"
})
public class TIEProcedureDetailsType {

    @XmlElement(name = "TITransportDetails", required = true)
    protected IdTransportMeansDetailsType tiTransportDetails;
    @XmlElement(name = "TIERegistrationDetails", required = true)
    protected TIERegistrationDetalsType tieRegistrationDetails;
    @XmlElement(name = "TIECarrierDetails")
    protected TIECarrierDetailsType tieCarrierDetails;
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

    /**
     * Gets the value of the tiTransportDetails property.
     * 
     * @return
     *     possible object is
     *     {@link IdTransportMeansDetailsType }
     *     
     */
    public IdTransportMeansDetailsType getTITransportDetails() {
        return tiTransportDetails;
    }

    /**
     * Sets the value of the tiTransportDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdTransportMeansDetailsType }
     *     
     */
    public void setTITransportDetails(IdTransportMeansDetailsType value) {
        this.tiTransportDetails = value;
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
     * Gets the value of the tieCarrierDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TIECarrierDetailsType }
     *     
     */
    public TIECarrierDetailsType getTIECarrierDetails() {
        return tieCarrierDetails;
    }

    /**
     * Sets the value of the tieCarrierDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIECarrierDetailsType }
     *     
     */
    public void setTIECarrierDetails(TIECarrierDetailsType value) {
        this.tieCarrierDetails = value;
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

}
