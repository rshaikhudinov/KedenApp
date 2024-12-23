
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.AddressDetailsV4Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, предоставляющие информацию о водителе транспортного средства
 * 
 * <p>Java class for DriverDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DriverDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CAPersonBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}AddressV4Details" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriverDetailsType", propOrder = {
    "addressV4Details",
    "unifiedCountryCode"
})
public class DriverDetailsType
    extends CAPersonBaseType
{

    @XmlElement(name = "AddressV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected AddressDetailsV4Type addressV4Details;
    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCountryCodeType unifiedCountryCode;

    /**
     * Gets the value of the addressV4Details property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailsV4Type }
     *     
     */
    public AddressDetailsV4Type getAddressV4Details() {
        return addressV4Details;
    }

    /**
     * Sets the value of the addressV4Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailsV4Type }
     *     
     */
    public void setAddressV4Details(AddressDetailsV4Type value) {
        this.addressV4Details = value;
    }

    /**
     * гражданство
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

}
