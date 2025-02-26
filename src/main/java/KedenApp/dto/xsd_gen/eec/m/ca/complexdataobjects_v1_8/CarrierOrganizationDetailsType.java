
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.AddressDetailsV4Type;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.BusinessEntityDetailsV2Type;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CommunicationDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие реквизиты перевозчика товаров
 * 
 * <p>Java class for CarrierOrganizationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierOrganizationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:ComplexDataObjects:v0.4.14}BusinessEntityDetailsV2Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}AddressV4Details" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CommunicationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DriverBaseDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierOrganizationDetailsType", propOrder = {
    "addressV4Details",
    "communicationDetails",
    "driverBaseDetails"
})
public class CarrierOrganizationDetailsType
    extends BusinessEntityDetailsV2Type
{

    @XmlElement(name = "AddressV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected List<AddressDetailsV4Type> addressV4Details;
    @XmlElement(name = "CommunicationDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected List<CommunicationDetailsType> communicationDetails;
    @XmlElement(name = "DriverBaseDetails")
    protected List<CAPersonBaseType> driverBaseDetails;

    /**
     * Gets the value of the addressV4Details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addressV4Details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressV4Details().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressDetailsV4Type }
     * 
     * 
     */
    public List<AddressDetailsV4Type> getAddressV4Details() {
        if (addressV4Details == null) {
            addressV4Details = new ArrayList<AddressDetailsV4Type>();
        }
        return this.addressV4Details;
    }

    /**
     * Gets the value of the communicationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the communicationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationDetailsType }
     * 
     * 
     */
    public List<CommunicationDetailsType> getCommunicationDetails() {
        if (communicationDetails == null) {
            communicationDetails = new ArrayList<CommunicationDetailsType>();
        }
        return this.communicationDetails;
    }

    /**
     * Gets the value of the driverBaseDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the driverBaseDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDriverBaseDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAPersonBaseType }
     * 
     * 
     */
    public List<CAPersonBaseType> getDriverBaseDetails() {
        if (driverBaseDetails == null) {
            driverBaseDetails = new ArrayList<CAPersonBaseType>();
        }
        return this.driverBaseDetails;
    }

}
