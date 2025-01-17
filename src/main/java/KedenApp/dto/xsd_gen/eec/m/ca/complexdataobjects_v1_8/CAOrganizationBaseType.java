
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.AddressDetailsV4Type;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CommunicationDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.TaxpayerDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.UnifiedOrganizationDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие базовые реквизиты юридического лица
 * 
 * <p>Java class for CAOrganizationBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAOrganizationBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedOrganizationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}TaxpayerDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}AddressV4Details" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CommunicationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAOrganizationBaseType", propOrder = {
    "unifiedOrganizationDetails",
    "taxpayerDetails",
    "addressV4Details",
    "communicationDetails"
})
@XmlSeeAlso({
    RegisterOrganizationDetailsType.class,
    SEZOrganizationDetailsType.class
})
public class CAOrganizationBaseType {

    @XmlElement(name = "UnifiedOrganizationDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected UnifiedOrganizationDetailsType unifiedOrganizationDetails;
    @XmlElement(name = "TaxpayerDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected TaxpayerDetailsType taxpayerDetails;
    @XmlElement(name = "AddressV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected List<AddressDetailsV4Type> addressV4Details;
    @XmlElement(name = "CommunicationDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected List<CommunicationDetailsType> communicationDetails;

    /**
     * Gets the value of the unifiedOrganizationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedOrganizationDetailsType }
     *     
     */
    public UnifiedOrganizationDetailsType getUnifiedOrganizationDetails() {
        return unifiedOrganizationDetails;
    }

    /**
     * Sets the value of the unifiedOrganizationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedOrganizationDetailsType }
     *     
     */
    public void setUnifiedOrganizationDetails(UnifiedOrganizationDetailsType value) {
        this.unifiedOrganizationDetails = value;
    }

    /**
     * Gets the value of the taxpayerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TaxpayerDetailsType }
     *     
     */
    public TaxpayerDetailsType getTaxpayerDetails() {
        return taxpayerDetails;
    }

    /**
     * Sets the value of the taxpayerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxpayerDetailsType }
     *     
     */
    public void setTaxpayerDetails(TaxpayerDetailsType value) {
        this.taxpayerDetails = value;
    }

    /**
     * адрес места нахождения (фактический адрес) уполномоченного экономического оператора Gets the value of the addressV4Details property.
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

}
