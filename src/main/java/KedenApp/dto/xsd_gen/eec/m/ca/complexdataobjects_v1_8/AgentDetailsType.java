
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.OfficerDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения об агенте
 * 
 * <p>Java class for AgentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CASubjectDetailsV2Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AgentRepresentativeDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentDetailsType", propOrder = {
    "agentRepresentativeDetails"
})
public class AgentDetailsType
    extends CASubjectDetailsV2Type
{

    @XmlElement(name = "AgentRepresentativeDetails")
    protected OfficerDetailsType agentRepresentativeDetails;

    /**
     * Gets the value of the agentRepresentativeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OfficerDetailsType }
     *     
     */
    public OfficerDetailsType getAgentRepresentativeDetails() {
        return agentRepresentativeDetails;
    }

    /**
     * Sets the value of the agentRepresentativeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficerDetailsType }
     *     
     */
    public void setAgentRepresentativeDetails(OfficerDetailsType value) {
        this.agentRepresentativeDetails = value;
    }

}
