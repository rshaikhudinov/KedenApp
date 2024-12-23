
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.LocationCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о месте прибытия на территорию Евразийского экономического союза
 * 
 * <p>Java class for PIAREntryCheckPointDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIAREntryCheckPointDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LocationCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BorderCheckpointCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BorderCheckpointName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIAREntryCheckPointDetailsType", propOrder = {
    "customsOfficeCode",
    "locationCode",
    "borderCheckpointCode",
    "borderCheckpointName"
})
public class PIAREntryCheckPointDetailsType {

    @XmlElement(name = "CustomsOfficeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeCode;
    @XmlElement(name = "LocationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected LocationCodeType locationCode;
    @XmlElement(name = "BorderCheckpointCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String borderCheckpointCode;
    @XmlElement(name = "BorderCheckpointName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String borderCheckpointName;

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
     * Кодовое обозначение аэропорта
     * 
     * @return
     *     possible object is
     *     {@link LocationCodeType }
     *     
     */
    public LocationCodeType getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCodeType }
     *     
     */
    public void setLocationCode(LocationCodeType value) {
        this.locationCode = value;
    }

    /**
     * Кодовое обозначение пункта пропуска на таможенной границе Евразийского экономического союза
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderCheckpointCode() {
        return borderCheckpointCode;
    }

    /**
     * Sets the value of the borderCheckpointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderCheckpointCode(String value) {
        this.borderCheckpointCode = value;
    }

    /**
     * наименование пункта пропуска на таможенной границе Евразийского экономического союза
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderCheckpointName() {
        return borderCheckpointName;
    }

    /**
     * Sets the value of the borderCheckpointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderCheckpointName(String value) {
        this.borderCheckpointName = value;
    }

}
