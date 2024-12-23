
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CommunicationDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.SubjectAddressDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.UnifiedIdentityDocDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о субъекте внешнеэкономической деятельности
 * 
 * <p>Java class for CABusinessEntityDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CABusinessEntityDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CASubjectBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}SubjectAddressDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CommunicationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedIdentityDocDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CABusinessEntityDetailsType", propOrder = {
    "subjectAddressDetails",
    "communicationDetails",
    "unifiedIdentityDocDetails"
})
@XmlSeeAlso({
    CABusinessEntityBranchDetailsType.class
})
public class CABusinessEntityDetailsType
    extends CASubjectBaseDetailsType
{

    @XmlElement(name = "SubjectAddressDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected List<SubjectAddressDetailsType> subjectAddressDetails;
    @XmlElement(name = "CommunicationDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected List<CommunicationDetailsType> communicationDetails;
    @XmlElement(name = "UnifiedIdentityDocDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected UnifiedIdentityDocDetailsType unifiedIdentityDocDetails;

    /**
     * Gets the value of the subjectAddressDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the subjectAddressDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubjectAddressDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjectAddressDetailsType }
     * 
     * 
     */
    public List<SubjectAddressDetailsType> getSubjectAddressDetails() {
        if (subjectAddressDetails == null) {
            subjectAddressDetails = new ArrayList<SubjectAddressDetailsType>();
        }
        return this.subjectAddressDetails;
    }

    /**
     * Gets the value of the communicationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the communicationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommunicationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommunicationDetailsType }
     * 
     * 
     */
    public List<CommunicationDetailsType> getCommunicationDetails() {
        if (communicationDetails == null) {
            communicationDetails = new ArrayList<CommunicationDetailsType>();
        }
        return this.communicationDetails;
    }

    /**
     * Gets the value of the unifiedIdentityDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedIdentityDocDetailsType }
     *     
     */
    public UnifiedIdentityDocDetailsType getUnifiedIdentityDocDetails() {
        return unifiedIdentityDocDetails;
    }

    /**
     * Sets the value of the unifiedIdentityDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedIdentityDocDetailsType }
     *     
     */
    public void setUnifiedIdentityDocDetails(UnifiedIdentityDocDetailsType value) {
        this.unifiedIdentityDocDetails = value;
    }

}
