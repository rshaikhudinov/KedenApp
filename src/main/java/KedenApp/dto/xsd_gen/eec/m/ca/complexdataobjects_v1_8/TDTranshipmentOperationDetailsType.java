
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о грузовых операциях, произведенных в процессе перемещения товаров в соответствии с таможенной процедурой таможенного транзита
 * 
 * <p>Java class for TDTranshipmentOperationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDTranshipmentOperationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsIdentificationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}NSDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TranshipmentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CarrierReplacementIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CarrierDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDTranshipmentOperationDetailsType", propOrder = {
    "eventDate",
    "customsIdentificationDetails",
    "nsDetails",
    "transhipmentDetails",
    "carrierReplacementIndicator",
    "carrierDetails"
})
public class TDTranshipmentOperationDetailsType {

    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "CustomsIdentificationDetails")
    protected List<CustomsIdentificationDetailsType> customsIdentificationDetails;
    @XmlElement(name = "NSDetails")
    protected List<NSDetailsType> nsDetails;
    @XmlElement(name = "TranshipmentDetails")
    protected List<TranshipmentDetailsType> transhipmentDetails;
    @XmlElement(name = "CarrierReplacementIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean carrierReplacementIndicator;
    @XmlElement(name = "CarrierDetails")
    protected CarrierDetailsType carrierDetails;

    /**
     * Дата совершения грузовой операций и (или) операции по замене транспортных средств
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
     * Сведения о средствах идентификации, наложенных при совершении операции Gets the value of the customsIdentificationDetails property.
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

    /**
     * Сведения о навигационной пломбе, в случае ее применения не в качестве средства идентификации Gets the value of the nsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the nsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNSDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NSDetailsType }
     * 
     * 
     */
    public List<NSDetailsType> getNSDetails() {
        if (nsDetails == null) {
            nsDetails = new ArrayList<NSDetailsType>();
        }
        return this.nsDetails;
    }

    /**
     * Gets the value of the transhipmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transhipmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranshipmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TranshipmentDetailsType }
     * 
     * 
     */
    public List<TranshipmentDetailsType> getTranshipmentDetails() {
        if (transhipmentDetails == null) {
            transhipmentDetails = new ArrayList<TranshipmentDetailsType>();
        }
        return this.transhipmentDetails;
    }

    /**
     * Gets the value of the carrierReplacementIndicator property.
     * 
     */
    public Boolean isCarrierReplacementIndicator() {
        return carrierReplacementIndicator;
    }

    /**
     * Sets the value of the carrierReplacementIndicator property.
     * 
     */
    public void setCarrierReplacementIndicator(Boolean value) {
        this.carrierReplacementIndicator = value;
    }

    /**
     * Gets the value of the carrierDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierDetailsType }
     *     
     */
    public CarrierDetailsType getCarrierDetails() {
        return carrierDetails;
    }

    /**
     * Sets the value of the carrierDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierDetailsType }
     *     
     */
    public void setCarrierDetails(CarrierDetailsType value) {
        this.carrierDetails = value;
    }

}
