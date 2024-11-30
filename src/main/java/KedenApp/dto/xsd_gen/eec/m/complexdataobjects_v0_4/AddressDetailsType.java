
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие детализированную информацию об адресе
 * 
 * <p>Java class for AddressDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:ComplexDataObjects:v0.4.14}AddressBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AddressText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressDetailsType", propOrder = {
    "addressText"
})
public class AddressDetailsType
    extends AddressBaseDetailsType
{

    @XmlElement(name = "AddressText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String addressText;

    /**
     * Gets the value of the addressText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressText() {
        return addressText;
    }

    /**
     * Sets the value of the addressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressText(String value) {
        this.addressText = value;
    }

}
