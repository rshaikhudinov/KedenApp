
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о возврате товаров
 * 
 * <p>Java class for ATDGoodsReturnDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDGoodsReturnDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDCustomsOfficeContactsDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DefectCustomsIdentificationMeansIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDReturnReasonDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDOfficerRecipientDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDGoodsReturnDetailsType", propOrder = {
    "atdCustomsOfficeContactsDetails",
    "defectCustomsIdentificationMeansIndicator",
    "descriptionText",
    "atdReturnReasonDetails",
    "atdOfficerRecipientDetails"
})
public class ATDGoodsReturnDetailsType {

    @XmlElement(name = "ATDCustomsOfficeContactsDetails", required = true)
    protected ATDReturnLocationDetailsType atdCustomsOfficeContactsDetails;
    @XmlElement(name = "DefectCustomsIdentificationMeansIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean defectCustomsIdentificationMeansIndicator;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> descriptionText;
    @XmlElement(name = "ATDReturnReasonDetails")
    protected List<ATDReturnReasonDetailsType> atdReturnReasonDetails;
    @XmlElement(name = "ATDOfficerRecipientDetails")
    protected ATDOfficerRecipientDetailsType atdOfficerRecipientDetails;

    /**
     * сведения о таможенном органе для обращений по вопросам возврата задержанных товаров и документов на них
     * 
     * @return
     *     possible object is
     *     {@link ATDReturnLocationDetailsType }
     *     
     */
    public ATDReturnLocationDetailsType getATDCustomsOfficeContactsDetails() {
        return atdCustomsOfficeContactsDetails;
    }

    /**
     * Sets the value of the atdCustomsOfficeContactsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDReturnLocationDetailsType }
     *     
     */
    public void setATDCustomsOfficeContactsDetails(ATDReturnLocationDetailsType value) {
        this.atdCustomsOfficeContactsDetails = value;
    }

    /**
     * признак повреждения средств идентификации на товарах, подлежащих возврату
     * 
     */
    public Boolean isDefectCustomsIdentificationMeansIndicator() {
        return defectCustomsIdentificationMeansIndicator;
    }

    /**
     * Sets the value of the defectCustomsIdentificationMeansIndicator property.
     * 
     */
    public void setDefectCustomsIdentificationMeansIndicator(Boolean value) {
        this.defectCustomsIdentificationMeansIndicator = value;
    }

    /**
     * Сведения о возмещении расходов по хранению товара Gets the value of the descriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescriptionText() {
        if (descriptionText == null) {
            descriptionText = new ArrayList<String>();
        }
        return this.descriptionText;
    }

    /**
     * Gets the value of the atdReturnReasonDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdReturnReasonDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDReturnReasonDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATDReturnReasonDetailsType }
     * 
     * 
     */
    public List<ATDReturnReasonDetailsType> getATDReturnReasonDetails() {
        if (atdReturnReasonDetails == null) {
            atdReturnReasonDetails = new ArrayList<ATDReturnReasonDetailsType>();
        }
        return this.atdReturnReasonDetails;
    }

    /**
     * Gets the value of the atdOfficerRecipientDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDOfficerRecipientDetailsType }
     *     
     */
    public ATDOfficerRecipientDetailsType getATDOfficerRecipientDetails() {
        return atdOfficerRecipientDetails;
    }

    /**
     * Sets the value of the atdOfficerRecipientDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDOfficerRecipientDetailsType }
     *     
     */
    public void setATDOfficerRecipientDetails(ATDOfficerRecipientDetailsType value) {
        this.atdOfficerRecipientDetails = value;
    }

}
