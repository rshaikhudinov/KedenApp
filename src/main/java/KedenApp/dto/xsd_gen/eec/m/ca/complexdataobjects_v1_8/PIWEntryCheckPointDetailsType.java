
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о месте прибытия на таможенную территорию Евразийского экономического союза
 * 
 * <p>Java class for PIWEntryCheckPointDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIWEntryCheckPointDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RailwayStationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PlaceName" minOccurs="0"/&gt;
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
@XmlType(name = "PIWEntryCheckPointDetailsType", propOrder = {
    "customsOfficeCode",
    "railwayStationCode",
    "placeName",
    "borderCheckpointCode",
    "borderCheckpointName"
})
public class PIWEntryCheckPointDetailsType {

    @XmlElement(name = "CustomsOfficeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeCode;
    @XmlElement(name = "RailwayStationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String railwayStationCode;
    @XmlElement(name = "PlaceName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String placeName;
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
     * Наименование железнодорожной станции
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
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
