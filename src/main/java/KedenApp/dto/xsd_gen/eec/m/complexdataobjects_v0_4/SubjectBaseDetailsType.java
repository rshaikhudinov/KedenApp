
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Совокупность основных, налоговых, адресных, банковских и контактных реквизитов юридического или физического лица
 * 
 * <p>Java class for SubjectBaseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectBaseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}OrganizationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}FullNameDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}IdentityDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}TaxpayerDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}AddressDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}AdditionalAddressDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}BankingDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SubjectBaseDetailsType", propOrder = {
    "organizationDetails",
    "fullNameDetails",
    "identityDocDetails",
    "taxpayerDetails",
    "addressDetails",
    "additionalAddressDetails",
    "bankingDetails",
    "communicationDetails"
})
public class SubjectBaseDetailsType {

    @XmlElement(name = "OrganizationDetails")
    protected OrganizationDetailsType organizationDetails;
    @XmlElement(name = "FullNameDetails")
    protected FullNameDetailsType fullNameDetails;
    @XmlElement(name = "IdentityDocDetails")
    protected List<IdentityDocDetailsType> identityDocDetails;
    @XmlElement(name = "TaxpayerDetails")
    protected TaxpayerDetailsType taxpayerDetails;
    @XmlElement(name = "AddressDetails")
    protected AddressDetailsType addressDetails;
    @XmlElement(name = "AdditionalAddressDetails")
    protected AddressDetailsType additionalAddressDetails;
    @XmlElement(name = "BankingDetails")
    protected List<BankingDetailsType> bankingDetails;
    @XmlElement(name = "CommunicationDetails")
    protected List<CommunicationDetailsType> communicationDetails;

    /**
     * Gets the value of the organizationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationDetailsType }
     *     
     */
    public OrganizationDetailsType getOrganizationDetails() {
        return organizationDetails;
    }

    /**
     * Sets the value of the organizationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationDetailsType }
     *     
     */
    public void setOrganizationDetails(OrganizationDetailsType value) {
        this.organizationDetails = value;
    }

    /**
     * Gets the value of the fullNameDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FullNameDetailsType }
     *     
     */
    public FullNameDetailsType getFullNameDetails() {
        return fullNameDetails;
    }

    /**
     * Sets the value of the fullNameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullNameDetailsType }
     *     
     */
    public void setFullNameDetails(FullNameDetailsType value) {
        this.fullNameDetails = value;
    }

    /**
     * Gets the value of the identityDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the identityDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityDocDetailsType }
     * 
     * 
     */
    public List<IdentityDocDetailsType> getIdentityDocDetails() {
        if (identityDocDetails == null) {
            identityDocDetails = new ArrayList<IdentityDocDetailsType>();
        }
        return this.identityDocDetails;
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
     * Gets the value of the additionalAddressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailsType }
     *     
     */
    public AddressDetailsType getAdditionalAddressDetails() {
        return additionalAddressDetails;
    }

    /**
     * Sets the value of the additionalAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailsType }
     *     
     */
    public void setAdditionalAddressDetails(AddressDetailsType value) {
        this.additionalAddressDetails = value;
    }

    /**
     * Gets the value of the bankingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the bankingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankingDetailsType }
     * 
     * 
     */
    public List<BankingDetailsType> getBankingDetails() {
        if (bankingDetails == null) {
            bankingDetails = new ArrayList<BankingDetailsType>();
        }
        return this.bankingDetails;
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
