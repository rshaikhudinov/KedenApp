
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения обопасности и особых условиях хранения проб и (или) образцов
 * 
 * <p>Java class for ATDStorageRequirementDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDStorageRequirementDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DangerIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsDangerText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PerishableIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}StorageRequirementDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDStorageRequirementDetailsType", propOrder = {
    "dangerIndicator",
    "goodsDangerText",
    "perishableIndicator",
    "eventDate",
    "storageRequirementDetails"
})
public class ATDStorageRequirementDetailsType {

    @XmlElement(name = "DangerIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean dangerIndicator;
    @XmlElement(name = "GoodsDangerText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String goodsDangerText;
    @XmlElement(name = "PerishableIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean perishableIndicator;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "StorageRequirementDetails", required = true)
    protected StorageRequirementDetailsType storageRequirementDetails;

    /**
     * Gets the value of the dangerIndicator property.
     * 
     */
    public Boolean isDangerIndicator() {
        return dangerIndicator;
    }

    /**
     * Sets the value of the dangerIndicator property.
     * 
     */
    public void setDangerIndicator(Boolean value) {
        this.dangerIndicator = value;
    }

    /**
     * Gets the value of the goodsDangerText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsDangerText() {
        return goodsDangerText;
    }

    /**
     * Sets the value of the goodsDangerText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsDangerText(String value) {
        this.goodsDangerText = value;
    }

    /**
     * Gets the value of the perishableIndicator property.
     * 
     */
    public Boolean isPerishableIndicator() {
        return perishableIndicator;
    }

    /**
     * Sets the value of the perishableIndicator property.
     * 
     */
    public void setPerishableIndicator(Boolean value) {
        this.perishableIndicator = value;
    }

    /**
     * Сведения о дате окончания срока хранения проб и (или) образцов
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
     * Gets the value of the storageRequirementDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StorageRequirementDetailsType }
     *     
     */
    public StorageRequirementDetailsType getStorageRequirementDetails() {
        return storageRequirementDetails;
    }

    /**
     * Sets the value of the storageRequirementDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageRequirementDetailsType }
     *     
     */
    public void setStorageRequirementDetails(StorageRequirementDetailsType value) {
        this.storageRequirementDetails = value;
    }

}
