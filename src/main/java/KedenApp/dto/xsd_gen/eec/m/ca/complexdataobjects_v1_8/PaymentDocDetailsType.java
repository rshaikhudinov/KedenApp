
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CAUniqueCustomsNumberIdType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.IdentityDocDetailsV3Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения об уплате таможенного платежа и платежном документе
 * 
 * <p>Java class for PaymentDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocDetailsV4Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TaxpayerId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TaxRegistrationReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PersonId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAUniqueCustomsNumberId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}IdentityDocV3Details" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDocDetailsType", propOrder = {
    "taxpayerId",
    "taxRegistrationReasonCode",
    "personId",
    "caUniqueCustomsNumberId",
    "identityDocV3Details"
})
@XmlSeeAlso({
    GDPaymentDocDetailsType.class
})
public class PaymentDocDetailsType
    extends DocDetailsV4Type
{

    @XmlElement(name = "TaxpayerId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxpayerId;
    @XmlElement(name = "TaxRegistrationReasonCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxRegistrationReasonCode;
    @XmlElement(name = "PersonId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String personId;
    @XmlElement(name = "CAUniqueCustomsNumberId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CAUniqueCustomsNumberIdType caUniqueCustomsNumberId;
    @XmlElement(name = "IdentityDocV3Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected IdentityDocDetailsV3Type identityDocV3Details;

    /**
     * Gets the value of the taxpayerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxpayerId() {
        return taxpayerId;
    }

    /**
     * Sets the value of the taxpayerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxpayerId(String value) {
        this.taxpayerId = value;
    }

    /**
     * Gets the value of the taxRegistrationReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegistrationReasonCode() {
        return taxRegistrationReasonCode;
    }

    /**
     * Sets the value of the taxRegistrationReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegistrationReasonCode(String value) {
        this.taxRegistrationReasonCode = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the caUniqueCustomsNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link CAUniqueCustomsNumberIdType }
     *     
     */
    public CAUniqueCustomsNumberIdType getCAUniqueCustomsNumberId() {
        return caUniqueCustomsNumberId;
    }

    /**
     * Sets the value of the caUniqueCustomsNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAUniqueCustomsNumberIdType }
     *     
     */
    public void setCAUniqueCustomsNumberId(CAUniqueCustomsNumberIdType value) {
        this.caUniqueCustomsNumberId = value;
    }

    /**
     * Сведения о документе, удостоверяющем личность плательщика
     * 
     * @return
     *     possible object is
     *     {@link IdentityDocDetailsV3Type }
     *     
     */
    public IdentityDocDetailsV3Type getIdentityDocV3Details() {
        return identityDocV3Details;
    }

    /**
     * Sets the value of the identityDocV3Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDocDetailsV3Type }
     *     
     */
    public void setIdentityDocV3Details(IdentityDocDetailsV3Type value) {
        this.identityDocV3Details = value;
    }

}
