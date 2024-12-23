
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие детализированную информацию о должностном лице уполномоченного органа (территориальном структурном подразделении уполномоченного органа)
 * 
 * <p>Java class for UnifiedAuthorityOfficerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnifiedAuthorityOfficerDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:ComplexDataObjects:v0.4.14}OfficerDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedAuthorityUnitDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnifiedAuthorityOfficerDetailsType", propOrder = {
    "unifiedAuthorityUnitDetails"
})
public class UnifiedAuthorityOfficerDetailsType
    extends OfficerDetailsType
{

    @XmlElement(name = "UnifiedAuthorityUnitDetails")
    protected UnifiedAuthorityUnitDetailsType unifiedAuthorityUnitDetails;

    /**
     * Gets the value of the unifiedAuthorityUnitDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedAuthorityUnitDetailsType }
     *     
     */
    public UnifiedAuthorityUnitDetailsType getUnifiedAuthorityUnitDetails() {
        return unifiedAuthorityUnitDetails;
    }

    /**
     * Sets the value of the unifiedAuthorityUnitDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedAuthorityUnitDetailsType }
     *     
     */
    public void setUnifiedAuthorityUnitDetails(UnifiedAuthorityUnitDetailsType value) {
        this.unifiedAuthorityUnitDetails = value;
    }

}
