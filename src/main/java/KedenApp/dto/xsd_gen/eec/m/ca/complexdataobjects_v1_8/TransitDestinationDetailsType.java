
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.SubjectAddressDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, предназначенные для указания сведений о предполагаемом таможенном органе и пункте назначения
 * 
 * <p>Java class for TransitDestinationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransitDestinationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CustomsOfficeDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsControlZoneId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterDocumentIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RailwayStationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}SubjectAddressDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitDestinationDetailsType", propOrder = {
    "customsOfficeDetails",
    "customsControlZoneId",
    "registerDocumentIdDetails",
    "railwayStationCode",
    "subjectAddressDetails"
})
public class TransitDestinationDetailsType {

    @XmlElement(name = "CustomsOfficeDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected CustomsOfficeDetailsType customsOfficeDetails;
    @XmlElement(name = "CustomsControlZoneId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsControlZoneId;
    @XmlElement(name = "RegisterDocumentIdDetails")
    protected RegisterDocumentIdDetailsType registerDocumentIdDetails;
    @XmlElement(name = "RailwayStationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String railwayStationCode;
    @XmlElement(name = "SubjectAddressDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected SubjectAddressDetailsType subjectAddressDetails;

    /**
     * Gets the value of the customsOfficeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsOfficeDetailsType }
     *     
     */
    public CustomsOfficeDetailsType getCustomsOfficeDetails() {
        return customsOfficeDetails;
    }

    /**
     * Sets the value of the customsOfficeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsOfficeDetailsType }
     *     
     */
    public void setCustomsOfficeDetails(CustomsOfficeDetailsType value) {
        this.customsOfficeDetails = value;
    }

    /**
     * Номер (регистрационный номер) зоны таможенного контроля
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsControlZoneId() {
        return customsControlZoneId;
    }

    /**
     * Sets the value of the customsControlZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsControlZoneId(String value) {
        this.customsControlZoneId = value;
    }

    /**
     * Свидетельство о включении в реестр уполномоченных экономических операторов
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
     * Gets the value of the railwayStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRailwayStationCode() {
        return railwayStationCode;
    }

    /**
     * Sets the value of the railwayStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRailwayStationCode(String value) {
        this.railwayStationCode = value;
    }

    /**
     * Адрес помещений, открытых площадок или иных территорий уполномоченного экономического оператора
     * 
     * @return
     *     possible object is
     *     {@link SubjectAddressDetailsType }
     *     
     */
    public SubjectAddressDetailsType getSubjectAddressDetails() {
        return subjectAddressDetails;
    }

    /**
     * Sets the value of the subjectAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAddressDetailsType }
     *     
     */
    public void setSubjectAddressDetails(SubjectAddressDetailsType value) {
        this.subjectAddressDetails = value;
    }

}
