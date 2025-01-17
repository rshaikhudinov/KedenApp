
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о таможенном представителе, заполнившем (подписавшем) таможенный документ
 * 
 * <p>Java class for SignatoryRepresentativeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatoryRepresentativeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterDocumentIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RepresentativeContractDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatoryRepresentativeDetailsType", propOrder = {
    "registerDocumentIdDetails",
    "representativeContractDetails"
})
public class SignatoryRepresentativeDetailsType {

    @XmlElement(name = "RegisterDocumentIdDetails", required = true)
    protected RegisterDocumentIdDetailsType registerDocumentIdDetails;
    @XmlElement(name = "RepresentativeContractDetails", required = true)
    protected CADocBaseType representativeContractDetails;

    /**
     * сведения о включении лица в реестр таможенных представителей
     * 
     * @return
     *     possible object is
     *     {@link RegisterDocumentIdDetailsType }
     *     
     */
    public RegisterDocumentIdDetailsType getRegisterDocumentIdDetails() {
        return registerDocumentIdDetails;
    }

    /**
     * Sets the value of the registerDocumentIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterDocumentIdDetailsType }
     *     
     */
    public void setRegisterDocumentIdDetails(RegisterDocumentIdDetailsType value) {
        this.registerDocumentIdDetails = value;
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

}
