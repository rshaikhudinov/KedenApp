
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие детализированную информацию об налоговых, адресных, банковских и контактных реквизитах юридического лица
 * 
 * <p>Java class for UnifiedOrganizationBaseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnifiedOrganizationBaseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedOrganizationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedTaxpayerDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedAddressDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedAdditionalAddressDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedBankingDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "UnifiedOrganizationBaseDetailsType", propOrder = {
    "unifiedOrganizationDetails",
    "unifiedTaxpayerDetails",
    "unifiedAddressDetails",
    "unifiedAdditionalAddressDetails",
    "unifiedBankingDetails",
    "communicationDetails"
})
public class UnifiedOrganizationBaseDetailsType {

    @XmlElement(name = "UnifiedOrganizationDetails", required = true)
    protected UnifiedOrganizationDetailsType unifiedOrganizationDetails;
    @XmlElement(name = "UnifiedTaxpayerDetails")
    protected UnifiedTaxpayerDetailsType unifiedTaxpayerDetails;
    @XmlElement(name = "UnifiedAddressDetails")
    protected UnifiedAddressDetailsType unifiedAddressDetails;
    @XmlElement(name = "UnifiedAdditionalAddressDetails")
    protected UnifiedAddressDetailsType unifiedAdditionalAddressDetails;
    @XmlElement(name = "UnifiedBankingDetails")
    protected List<UnifiedBankingDetailsType> unifiedBankingDetails;
    @XmlElement(name = "CommunicationDetails")
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
     * Gets the value of the unifiedTaxpayerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedTaxpayerDetailsType }
     *     
     */
    public UnifiedTaxpayerDetailsType getUnifiedTaxpayerDetails() {
        return unifiedTaxpayerDetails;
    }

    /**
     * Sets the value of the unifiedTaxpayerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedTaxpayerDetailsType }
     *     
     */
    public void setUnifiedTaxpayerDetails(UnifiedTaxpayerDetailsType value) {
        this.unifiedTaxpayerDetails = value;
    }

    /**
     * Юридический адрес
     * 
     * @return
     *     possible object is
     *     {@link UnifiedAddressDetailsType }
     *     
     */
    public UnifiedAddressDetailsType getUnifiedAddressDetails() {
        return unifiedAddressDetails;
    }

    /**
     * Sets the value of the unifiedAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedAddressDetailsType }
     *     
     */
    public void setUnifiedAddressDetails(UnifiedAddressDetailsType value) {
        this.unifiedAddressDetails = value;
    }

    /**
     * Фактический адрес
     * 
     * @return
     *     possible object is
     *     {@link UnifiedAddressDetailsType }
     *     
     */
    public UnifiedAddressDetailsType getUnifiedAdditionalAddressDetails() {
        return unifiedAdditionalAddressDetails;
    }

    /**
     * Sets the value of the unifiedAdditionalAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedAddressDetailsType }
     *     
     */
    public void setUnifiedAdditionalAddressDetails(UnifiedAddressDetailsType value) {
        this.unifiedAdditionalAddressDetails = value;
    }

    /**
     * Gets the value of the unifiedBankingDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the unifiedBankingDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnifiedBankingDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnifiedBankingDetailsType }
     * 
     * 
     */
    public List<UnifiedBankingDetailsType> getUnifiedBankingDetails() {
        if (unifiedBankingDetails == null) {
            unifiedBankingDetails = new ArrayList<UnifiedBankingDetailsType>();
        }
        return this.unifiedBankingDetails;
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
