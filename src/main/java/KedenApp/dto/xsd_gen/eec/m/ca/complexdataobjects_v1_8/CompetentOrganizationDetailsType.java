
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.BusinessEntityDetailsV2Type;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CommunicationDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.SubjectAddressDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о компетентном органе, удостоверяющем сертификаты о происхождении товаров
 * 
 * <p>Java class for CompetentOrganizationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompetentOrganizationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:ComplexDataObjects:v0.4.14}BusinessEntityDetailsV2Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}SubjectAddressDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CommunicationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CAStampDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CASignatureDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetentOrganizationDetailsType", propOrder = {
    "subjectAddressDetails",
    "communicationDetails",
    "caStampDetails",
    "caSignatureDetails"
})
public class CompetentOrganizationDetailsType
    extends BusinessEntityDetailsV2Type
{

    @XmlElement(name = "SubjectAddressDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected SubjectAddressDetailsType subjectAddressDetails;
    @XmlElement(name = "CommunicationDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected CommunicationDetailsType communicationDetails;
    @XmlElement(name = "CAStampDetails", required = true)
    protected List<CAStampDetailsType> caStampDetails;
    @XmlElement(name = "CASignatureDetails")
    protected List<CASignatureDetailsType> caSignatureDetails;

    /**
     * Gets the value of the subjectAddressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAddressDetailsType }
     *     
     */
    public SubjectAddressDetailsType getSubjectAddressDetails() {
        return subjectAddressDetails;
    }

    /**
     * Sets the value of the subjectAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAddressDetailsType }
     *     
     */
    public void setSubjectAddressDetails(SubjectAddressDetailsType value) {
        this.subjectAddressDetails = value;
    }

    /**
     * Gets the value of the communicationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationDetailsType }
     *     
     */
    public CommunicationDetailsType getCommunicationDetails() {
        return communicationDetails;
    }

    /**
     * Sets the value of the communicationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationDetailsType }
     *     
     */
    public void setCommunicationDetails(CommunicationDetailsType value) {
        this.communicationDetails = value;
    }

    /**
     * Gets the value of the caStampDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the caStampDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCAStampDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CAStampDetailsType }
     * 
     * 
     */
    public List<CAStampDetailsType> getCAStampDetails() {
        if (caStampDetails == null) {
            caStampDetails = new ArrayList<CAStampDetailsType>();
        }
        return this.caStampDetails;
    }

    /**
     * Gets the value of the caSignatureDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the caSignatureDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCASignatureDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CASignatureDetailsType }
     * 
     * 
     */
    public List<CASignatureDetailsType> getCASignatureDetails() {
        if (caSignatureDetails == null) {
            caSignatureDetails = new ArrayList<CASignatureDetailsType>();
        }
        return this.caSignatureDetails;
    }

}
