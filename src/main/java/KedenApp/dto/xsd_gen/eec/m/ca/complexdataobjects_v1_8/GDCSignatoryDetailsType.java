
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о лице, заполнившем корректировку декларации на товары
 * 
 * <p>Java class for GDCSignatoryDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDCSignatoryDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SignatoryRepresentativeDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SignatoryPersonDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SecurityLabelId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDCSignatoryDetailsType", propOrder = {
    "signatoryRepresentativeDetails",
    "signatoryPersonDetails",
    "securityLabelId"
})
public class GDCSignatoryDetailsType {

    @XmlElement(name = "SignatoryRepresentativeDetails")
    protected SignatoryRepresentativeDetailsType signatoryRepresentativeDetails;
    @XmlElement(name = "SignatoryPersonDetails", required = true)
    protected SignatoryPersonDetailsType signatoryPersonDetails;
    @XmlElement(name = "SecurityLabelId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String securityLabelId;

    /**
     * Gets the value of the signatoryRepresentativeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SignatoryRepresentativeDetailsType }
     *     
     */
    public SignatoryRepresentativeDetailsType getSignatoryRepresentativeDetails() {
        return signatoryRepresentativeDetails;
    }

    /**
     * Sets the value of the signatoryRepresentativeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatoryRepresentativeDetailsType }
     *     
     */
    public void setSignatoryRepresentativeDetails(SignatoryRepresentativeDetailsType value) {
        this.signatoryRepresentativeDetails = value;
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

    /**
     * Код защитной наклейки, указанный при подаче КДТ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityLabelId() {
        return securityLabelId;
    }

    /**
     * Sets the value of the securityLabelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityLabelId(String value) {
        this.securityLabelId = value;
    }

}
