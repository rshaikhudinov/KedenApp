
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.LocationCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * сведения о пункте маршрута
 * 
 * <p>Java class for PIARRoutePointDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIARRoutePointDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LocationCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObjectOrdinal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIARRoutePointDetailsType", propOrder = {
    "locationCode",
    "objectOrdinal"
})
public class PIARRoutePointDetailsType {

    @XmlElement(name = "LocationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected LocationCodeType locationCode;
    @XmlElement(name = "ObjectOrdinal", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger objectOrdinal;

    /**
     * Кодовое обозначение пункта маршрута
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
     * Порядковый номер пункта маршрута
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

}
