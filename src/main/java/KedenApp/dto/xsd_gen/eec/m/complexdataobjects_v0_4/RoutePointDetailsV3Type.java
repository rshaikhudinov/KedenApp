
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.math.BigInteger;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие информацию о пункте маршрута движения
 * 
 * <p>Java class for RoutePointDetailsV3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutePointDetailsV3Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObjectOrdinal"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedRoutePointKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ObjectAddressDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutePointDetailsV3Type", propOrder = {
    "objectOrdinal",
    "unifiedRoutePointKindCode",
    "objectAddressDetails"
})
public class RoutePointDetailsV3Type {

    @XmlElement(name = "ObjectOrdinal", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger objectOrdinal;
    @XmlElement(name = "UnifiedRoutePointKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCode20Type unifiedRoutePointKindCode;
    @XmlElement(name = "ObjectAddressDetails", required = true)
    protected ObjectAddressDetailsType objectAddressDetails;

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
     * Gets the value of the unifiedRoutePointKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getUnifiedRoutePointKindCode() {
        return unifiedRoutePointKindCode;
    }

    /**
     * Sets the value of the unifiedRoutePointKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setUnifiedRoutePointKindCode(UnifiedCode20Type value) {
        this.unifiedRoutePointKindCode = value;
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

}
