
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.IdentityDocDetailsV3Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * Компоненты, представляющие сведения о физическом лице, заполнившем (подписавшем) таможенный документ
 * 
 * <p>Java class for SignatoryPersonDetailsV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignatoryPersonDetailsV2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SigningDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}IdentityDocV3Details" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}QualificationCertificateId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PowerOfAttorneyDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatoryPersonDetailsV2Type", propOrder = {
    "signingDetails",
    "identityDocV3Details",
    "qualificationCertificateId",
    "powerOfAttorneyDetails"
})
@Data
@Accessors(chain = true)
public class SignatoryPersonDetailsV2Type {

    @XmlElement(name = "SigningDetails")
    protected SigningDetailsType signingDetails;
    @XmlElement(name = "IdentityDocV3Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected IdentityDocDetailsV3Type identityDocV3Details;
    @XmlElement(name = "QualificationCertificateId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String qualificationCertificateId;
    @XmlElement(name = "PowerOfAttorneyDetails")
    protected CADocBaseType powerOfAttorneyDetails;
}
