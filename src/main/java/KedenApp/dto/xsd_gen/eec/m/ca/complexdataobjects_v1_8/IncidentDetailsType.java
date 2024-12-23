
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие информацию о происшествии (об аварии или действии непреодолимой силы во время перевозки)
 * 
 * <p>Java class for IncidentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncidentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}IncidentPlaceName"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AdditionalInfoText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}LostGoodsItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DamagedIndicatorDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncidentDetailsType", propOrder = {
    "eventDate",
    "incidentPlaceName",
    "unifiedCountryCode",
    "additionalInfoText",
    "lostGoodsItemDetails",
    "damagedIndicatorDetails"
})
public class IncidentDetailsType {

    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "IncidentPlaceName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String incidentPlaceName;
    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "AdditionalInfoText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> additionalInfoText;
    @XmlElement(name = "LostGoodsItemDetails")
    protected List<LostGoodsItemDetailsType> lostGoodsItemDetails;
    @XmlElement(name = "DamagedIndicatorDetails")
    protected DamagedIndicatorDetailsType damagedIndicatorDetails;

    /**
     * Дата происшествия
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
     * Gets the value of the incidentPlaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentPlaceName() {
        return incidentPlaceName;
    }

    /**
     * Sets the value of the incidentPlaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentPlaceName(String value) {
        this.incidentPlaceName = value;
    }

    /**
     * Код страны места происшествия
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
     * Описание мер, принятых для продолжения перевозки товаров под таможенным контролем Gets the value of the additionalInfoText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfoText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfoText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalInfoText() {
        if (additionalInfoText == null) {
            additionalInfoText = new ArrayList<String>();
        }
        return this.additionalInfoText;
    }

    /**
     * Gets the value of the lostGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lostGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLostGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LostGoodsItemDetailsType }
     * 
     * 
     */
    public List<LostGoodsItemDetailsType> getLostGoodsItemDetails() {
        if (lostGoodsItemDetails == null) {
            lostGoodsItemDetails = new ArrayList<LostGoodsItemDetailsType>();
        }
        return this.lostGoodsItemDetails;
    }

    /**
     * Gets the value of the damagedIndicatorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DamagedIndicatorDetailsType }
     *     
     */
    public DamagedIndicatorDetailsType getDamagedIndicatorDetails() {
        return damagedIndicatorDetails;
    }

    /**
     * Sets the value of the damagedIndicatorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DamagedIndicatorDetailsType }
     *     
     */
    public void setDamagedIndicatorDetails(DamagedIndicatorDetailsType value) {
        this.damagedIndicatorDetails = value;
    }

}
