
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие детализированную информацию о территориальном структурном подразделении уполномоченного органа государства-члена
 * 
 * <p>Java class for UnifiedAuthorityUnitDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnifiedAuthorityUnitDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedAuthorityDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}SubjectAddressDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CommunicationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnifiedAuthorityUnitDetailsType", propOrder = {
    "subjectAddressDetails",
    "communicationDetails"
})
public class UnifiedAuthorityUnitDetailsType
    extends UnifiedAuthorityDetailsType
{

    @XmlElement(name = "SubjectAddressDetails")
    protected List<SubjectAddressDetailsType> subjectAddressDetails;
    @XmlElement(name = "CommunicationDetails")
    protected List<CommunicationDetailsType> communicationDetails;

    /**
     * Адрес уполномоченного органа (структурного подразделения уполномоченного органа) государства-члена Gets the value of the subjectAddressDetails property.
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
     * Контактное данные уполномоченного органа (структурного подразделения уполномоченного органа) Gets the value of the communicationDetails property.
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

}
