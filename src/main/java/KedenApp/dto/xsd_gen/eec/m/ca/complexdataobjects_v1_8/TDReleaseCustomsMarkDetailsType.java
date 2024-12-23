
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
 * Компоненты, представляющие сведения об отметках таможенного органа отправления
 * 
 * <p>Java class for TDReleaseCustomsMarkDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDReleaseCustomsMarkDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OneTimePermissionIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}InspectionDocIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ItineraryPointDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsIdentificationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}NSDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitLimitDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DestinationCustomsOfficeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsEscortIndicator" minOccurs="0"/&gt;
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
@XmlType(name = "TDReleaseCustomsMarkDetailsType", propOrder = {
    "oneTimePermissionIndicator",
    "inspectionDocIdDetails",
    "itineraryPointDetails",
    "customsIdentificationDetails",
    "nsDetails",
    "transitLimitDate",
    "destinationCustomsOfficeCode",
    "customsEscortIndicator",
    "descriptionText"
})
public class TDReleaseCustomsMarkDetailsType {

    @XmlElement(name = "OneTimePermissionIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean oneTimePermissionIndicator;
    @XmlElement(name = "InspectionDocIdDetails")
    protected InspectionDocIdDetailsType inspectionDocIdDetails;
    @XmlElement(name = "ItineraryPointDetails")
    protected List<ItineraryPointDetailsType> itineraryPointDetails;
    @XmlElement(name = "CustomsIdentificationDetails")
    protected List<CustomsIdentificationDetailsType> customsIdentificationDetails;
    @XmlElement(name = "NSDetails")
    protected List<NSDetailsType> nsDetails;
    @XmlElement(name = "TransitLimitDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transitLimitDate;
    @XmlElement(name = "DestinationCustomsOfficeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String destinationCustomsOfficeCode;
    @XmlElement(name = "CustomsEscortIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean customsEscortIndicator;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;

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
     * Номер акта таможенного досмотра
     * 
     * @return
     *     possible object is
     *     {@link InspectionDocIdDetailsType }
     *     
     */
    public InspectionDocIdDetailsType getInspectionDocIdDetails() {
        return inspectionDocIdDetails;
    }

    /**
     * Sets the value of the inspectionDocIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionDocIdDetailsType }
     *     
     */
    public void setInspectionDocIdDetails(InspectionDocIdDetailsType value) {
        this.inspectionDocIdDetails = value;
    }

    /**
     * Пункт установленного маршрута перевозки товаров Gets the value of the itineraryPointDetails property.
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
     * Gets the value of the customsIdentificationDetails property.
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
     * Таможенный орган назначения, определенный таможенным органом отправления
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCustomsOfficeCode() {
        return destinationCustomsOfficeCode;
    }

    /**
     * Sets the value of the destinationCustomsOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCustomsOfficeCode(String value) {
        this.destinationCustomsOfficeCode = value;
    }

    /**
     * Gets the value of the customsEscortIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomsEscortIndicator() {
        return customsEscortIndicator;
    }

    /**
     * Sets the value of the customsEscortIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomsEscortIndicator(Boolean value) {
        this.customsEscortIndicator = value;
    }

    /**
     * Иные сведения, имеющие значение для таможенных целей
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
