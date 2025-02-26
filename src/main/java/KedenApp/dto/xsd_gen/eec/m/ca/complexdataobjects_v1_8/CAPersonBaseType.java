
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.IdentityDocDetailsV3Type;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.OfficerDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о базовых реквизитах физического лица
 * 
 * <p>Java class for CAPersonBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAPersonBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:ComplexDataObjects:v0.4.14}OfficerDetailsType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "CAPersonBaseType", propOrder = {
    "identityDocV3Details"
})
@XmlSeeAlso({
    DriverDetailsType.class,
    SubjectRepresentativeBaseDetailsType.class
})
public class CAPersonBaseType
    extends OfficerDetailsType
{

    @XmlElement(name = "IdentityDocV3Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected IdentityDocDetailsV3Type identityDocV3Details;

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
