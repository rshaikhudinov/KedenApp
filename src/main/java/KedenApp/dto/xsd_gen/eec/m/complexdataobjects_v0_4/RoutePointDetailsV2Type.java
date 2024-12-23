
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.math.BigInteger;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие информацию о пункте маршрута движения
 * 
 * <p>Java class for RoutePointDetailsV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePointDetailsV2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObjectOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}RoutePointKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ObjectAddressDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}LocationName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CargoHandlingLocationCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointDetailsV2Type", propOrder = {
    "objectOrdinal",
    "routePointKindCode",
    "objectAddressDetails",
    "locationName",
    "cargoHandlingLocationCode"
})
public class RoutePointDetailsV2Type {

    @XmlElement(name = "ObjectOrdinal", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger objectOrdinal;
    @XmlElement(name = "RoutePointKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String routePointKindCode;
    @XmlElement(name = "ObjectAddressDetails")
    protected ObjectAddressDetailsType objectAddressDetails;
    @XmlElement(name = "LocationName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String locationName;
    @XmlElement(name = "CargoHandlingLocationCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type cargoHandlingLocationCode;

    /**
     * Порядковый номер пункта маршрута движения
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectOrdinal() {
        return objectOrdinal;
    }

    /**
     * Sets the value of the objectOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectOrdinal(BigInteger value) {
        this.objectOrdinal = value;
    }

    /**
     * Gets the value of the routePointKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutePointKindCode() {
        return routePointKindCode;
    }

    /**
     * Sets the value of the routePointKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutePointKindCode(String value) {
        this.routePointKindCode = value;
    }

    /**
     * Адрес пункта маршрута движения
     * 
     * @return
     *     possible object is
     *     {@link ObjectAddressDetailsType }
     *     
     */
    public ObjectAddressDetailsType getObjectAddressDetails() {
        return objectAddressDetails;
    }

    /**
     * Sets the value of the objectAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectAddressDetailsType }
     *     
     */
    public void setObjectAddressDetails(ObjectAddressDetailsType value) {
        this.objectAddressDetails = value;
    }

    /**
     * наименование пункта маршрута (порта, аэропорта, железнодорожной станции, пункта пропуска, географического пункта и т.д.)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * Sets the value of the locationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationName(String value) {
        this.locationName = value;
    }

    /**
     * Gets the value of the cargoHandlingLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getCargoHandlingLocationCode() {
        return cargoHandlingLocationCode;
    }

    /**
     * Sets the value of the cargoHandlingLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setCargoHandlingLocationCode(UnifiedCode20Type value) {
        this.cargoHandlingLocationCode = value;
    }

}
