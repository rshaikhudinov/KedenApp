
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о субъекте
 * 
 * <p>Java class for CASubjectBranchDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CASubjectBranchDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CASubjectDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SubjectBranchDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CASubjectBranchDetailsType", propOrder = {
    "subjectBranchDetails"
})
@XmlSeeAlso({
    GoodsShipmentSubjectDetailsType.class,
    CustomsDocumentSubjectDetailsType.class,
    DeclarantDetailsType.class
})
public class CASubjectBranchDetailsType
    extends CASubjectDetailsType
{

    @XmlElement(name = "SubjectBranchDetails")
    protected CAOrganizationType subjectBranchDetails;

    /**
     * Gets the value of the subjectBranchDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CAOrganizationType }
     *     
     */
    public CAOrganizationType getSubjectBranchDetails() {
        return subjectBranchDetails;
    }

    /**
     * Sets the value of the subjectBranchDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAOrganizationType }
     *     
     */
    public void setSubjectBranchDetails(CAOrganizationType value) {
        this.subjectBranchDetails = value;
    }

}
