
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.FullNameDetailsType;
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
 * компоненты, представляющие сведения о базовых реквизитах физического лица
 * 
 * <p>Java class for CAPersonBaseDetailsV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAPersonBaseDetailsV2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:ComplexDataObjects:v0.4.14}FullNameDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TaxpayerId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PersonId" minOccurs="0"/&gt;
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
@XmlType(name = "CAPersonBaseDetailsV2Type", propOrder = {
    "taxpayerId",
    "personId",
    "identityDocV3Details"
})
@XmlSeeAlso({
    CAPersonDetailsType.class
})
public class CAPersonBaseDetailsV2Type
    extends FullNameDetailsType
{

    @XmlElement(name = "TaxpayerId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxpayerId;
    @XmlElement(name = "PersonId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String personId;
    @XmlElement(name = "IdentityDocV3Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected IdentityDocDetailsV3Type identityDocV3Details;

    /**
     * Идентификатор субъекта в реестре налогоплательщиков страны регистрации налогоплательщика
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
     * Gets the value of the identityDocV3Details property.
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
