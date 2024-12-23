
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о юридическом лице, включенном в реестр таможенных представителей
 * 
 * <p>Java class for CustomsBrokerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsBrokerDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BrokerParentDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BrokerBranchDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsBrokerDetailsType", propOrder = {
    "brokerParentDetails",
    "brokerBranchDetails"
})
public class CustomsBrokerDetailsType {

    @XmlElement(name = "BrokerParentDetails", required = true)
    protected RegisterOrganizationDetailsType brokerParentDetails;
    @XmlElement(name = "BrokerBranchDetails")
    protected List<RegisterOrganizationDetailsType> brokerBranchDetails;

    /**
     * Gets the value of the brokerParentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterOrganizationDetailsType }
     *     
     */
    public RegisterOrganizationDetailsType getBrokerParentDetails() {
        return brokerParentDetails;
    }

    /**
     * Sets the value of the brokerParentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterOrganizationDetailsType }
     *     
     */
    public void setBrokerParentDetails(RegisterOrganizationDetailsType value) {
        this.brokerParentDetails = value;
    }

    /**
     * Gets the value of the brokerBranchDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the brokerBranchDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrokerBranchDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegisterOrganizationDetailsType }
     * 
     * 
     */
    public List<RegisterOrganizationDetailsType> getBrokerBranchDetails() {
        if (brokerBranchDetails == null) {
            brokerBranchDetails = new ArrayList<RegisterOrganizationDetailsType>();
        }
        return this.brokerBranchDetails;
    }

}
