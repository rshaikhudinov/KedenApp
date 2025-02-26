
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.AddressDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.GeoCoordinateDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения об адресе или географических координатах местонахождения объекта
 * 
 * <p>Java class for ArrivalDepartureAddressDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrivalDepartureAddressDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}AddressDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}GeoCoordinateDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalDepartureAddressDetailsType", propOrder = {
    "addressDetails",
    "geoCoordinateDetails"
})
public class ArrivalDepartureAddressDetailsType {

    @XmlElement(name = "AddressDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected AddressDetailsType addressDetails;
    @XmlElement(name = "GeoCoordinateDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected GeoCoordinateDetailsType geoCoordinateDetails;

    /**
     * Gets the value of the addressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailsType }
     *     
     */
    public AddressDetailsType getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailsType }
     *     
     */
    public void setAddressDetails(AddressDetailsType value) {
        this.addressDetails = value;
    }

    /**
     * Gets the value of the geoCoordinateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GeoCoordinateDetailsType }
     *     
     */
    public GeoCoordinateDetailsType getGeoCoordinateDetails() {
        return geoCoordinateDetails;
    }

    /**
     * Sets the value of the geoCoordinateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeoCoordinateDetailsType }
     *     
     */
    public void setGeoCoordinateDetails(GeoCoordinateDetailsType value) {
        this.geoCoordinateDetails = value;
    }

}
