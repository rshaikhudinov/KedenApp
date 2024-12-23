
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о физическом лице, заполнившем (подписавшем) таможенный документ
 * 
 * <p>Java class for SignatoryPersonDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatoryPersonDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SigningDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SignatoryPersonIdentityDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}QualificationCertificateId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PowerOfAttorneyV2Details" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatoryPersonDetailsType", propOrder = {
    "signingDetails",
    "signatoryPersonIdentityDetails",
    "qualificationCertificateId",
    "powerOfAttorneyV2Details"
})
public class SignatoryPersonDetailsType {

    @XmlElement(name = "SigningDetails", required = true)
    protected SigningDetailsType signingDetails;
    @XmlElement(name = "SignatoryPersonIdentityDetails")
    protected SignatoryPersonIdentityDetailsType signatoryPersonIdentityDetails;
    @XmlElement(name = "QualificationCertificateId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String qualificationCertificateId;
    @XmlElement(name = "PowerOfAttorneyV2Details")
    protected PowerOfAttorneyDetailsType powerOfAttorneyV2Details;

    /**
     * Gets the value of the signingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SigningDetailsType }
     *     
     */
    public SigningDetailsType getSigningDetails() {
        return signingDetails;
    }

    /**
     * Sets the value of the signingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigningDetailsType }
     *     
     */
    public void setSigningDetails(SigningDetailsType value) {
        this.signingDetails = value;
    }

    /**
     * Gets the value of the signatoryPersonIdentityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SignatoryPersonIdentityDetailsType }
     *     
     */
    public SignatoryPersonIdentityDetailsType getSignatoryPersonIdentityDetails() {
        return signatoryPersonIdentityDetails;
    }

    /**
     * Sets the value of the signatoryPersonIdentityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatoryPersonIdentityDetailsType }
     *     
     */
    public void setSignatoryPersonIdentityDetails(SignatoryPersonIdentityDetailsType value) {
        this.signatoryPersonIdentityDetails = value;
    }

    /**
     * Gets the value of the qualificationCertificateId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationCertificateId() {
        return qualificationCertificateId;
    }

    /**
     * Sets the value of the qualificationCertificateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationCertificateId(String value) {
        this.qualificationCertificateId = value;
    }

    /**
     * Gets the value of the powerOfAttorneyV2Details property.
     * 
     * @return
     *     possible object is
     *     {@link PowerOfAttorneyDetailsType }
     *     
     */
    public PowerOfAttorneyDetailsType getPowerOfAttorneyV2Details() {
        return powerOfAttorneyV2Details;
    }

    /**
     * Sets the value of the powerOfAttorneyV2Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerOfAttorneyDetailsType }
     *     
     */
    public void setPowerOfAttorneyV2Details(PowerOfAttorneyDetailsType value) {
        this.powerOfAttorneyV2Details = value;
    }

}
