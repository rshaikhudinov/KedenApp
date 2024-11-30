
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о лице, заполнившем таможенную декларацию
 * 
 * <p>Java class for CustomsRepresentativeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsRepresentativeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BrokerRegistryDocDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RepresentativeContractDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SignatoryPersonDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsRepresentativeDetailsType", propOrder = {
    "brokerRegistryDocDetails",
    "representativeContractDetails",
    "signatoryPersonDetails"
})
public class CustomsRepresentativeDetailsType {

    @XmlElement(name = "BrokerRegistryDocDetails")
    protected BrokerRegistryDocDetailsType brokerRegistryDocDetails;
    @XmlElement(name = "RepresentativeContractDetails")
    protected CADocBaseType representativeContractDetails;
    @XmlElement(name = "SignatoryPersonDetails", required = true)
    protected SignatoryPersonDetailsType signatoryPersonDetails;

    /**
     * Gets the value of the brokerRegistryDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BrokerRegistryDocDetailsType }
     *     
     */
    public BrokerRegistryDocDetailsType getBrokerRegistryDocDetails() {
        return brokerRegistryDocDetails;
    }

    /**
     * Sets the value of the brokerRegistryDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrokerRegistryDocDetailsType }
     *     
     */
    public void setBrokerRegistryDocDetails(BrokerRegistryDocDetailsType value) {
        this.brokerRegistryDocDetails = value;
    }

    /**
     * Gets the value of the representativeContractDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CADocBaseType }
     *     
     */
    public CADocBaseType getRepresentativeContractDetails() {
        return representativeContractDetails;
    }

    /**
     * Sets the value of the representativeContractDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CADocBaseType }
     *     
     */
    public void setRepresentativeContractDetails(CADocBaseType value) {
        this.representativeContractDetails = value;
    }

    /**
     * Gets the value of the signatoryPersonDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SignatoryPersonDetailsType }
     *     
     */
    public SignatoryPersonDetailsType getSignatoryPersonDetails() {
        return signatoryPersonDetails;
    }

    /**
     * Sets the value of the signatoryPersonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatoryPersonDetailsType }
     *     
     */
    public void setSignatoryPersonDetails(SignatoryPersonDetailsType value) {
        this.signatoryPersonDetails = value;
    }

}
