
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о средствах идентификации и операциях с ними
 * 
 * <p>Java class for ATDSealDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDSealDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDLocationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SealIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DefectCustomsIdentificationMeansIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDFactSealDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDChangeSealDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDNewSealDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDSealDetailsType", propOrder = {
    "atdLocationDetails",
    "sealIndicator",
    "defectCustomsIdentificationMeansIndicator",
    "atdFactSealDetails",
    "atdChangeSealDetails",
    "atdNewSealDetails",
    "descriptionText"
})
public class ATDSealDetailsType {

    @XmlElement(name = "ATDLocationDetails")
    protected ATDLocationDetailsType atdLocationDetails;
    @XmlElement(name = "SealIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean sealIndicator;
    @XmlElement(name = "DefectCustomsIdentificationMeansIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean defectCustomsIdentificationMeansIndicator;
    @XmlElement(name = "ATDFactSealDetails")
    protected List<CustomsIdentificationDetailsType> atdFactSealDetails;
    @XmlElement(name = "ATDChangeSealDetails")
    protected List<ATDChangeSealDetailsType> atdChangeSealDetails;
    @XmlElement(name = "ATDNewSealDetails")
    protected List<ATDNewSealDetailsType> atdNewSealDetails;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> descriptionText;

    /**
     * сведения о месте проведения операций по изменению, удалению, уничтожению или замене средств идентификации
     * 
     * @return
     *     possible object is
     *     {@link ATDLocationDetailsType }
     *     
     */
    public ATDLocationDetailsType getATDLocationDetails() {
        return atdLocationDetails;
    }

    /**
     * Sets the value of the atdLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDLocationDetailsType }
     *     
     */
    public void setATDLocationDetails(ATDLocationDetailsType value) {
        this.atdLocationDetails = value;
    }

    /**
     * Gets the value of the sealIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSealIndicator() {
        return sealIndicator;
    }

    /**
     * Sets the value of the sealIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSealIndicator(Boolean value) {
        this.sealIndicator = value;
    }

    /**
     * Gets the value of the defectCustomsIdentificationMeansIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefectCustomsIdentificationMeansIndicator() {
        return defectCustomsIdentificationMeansIndicator;
    }

    /**
     * Sets the value of the defectCustomsIdentificationMeansIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefectCustomsIdentificationMeansIndicator(Boolean value) {
        this.defectCustomsIdentificationMeansIndicator = value;
    }

    /**
     * Gets the value of the atdFactSealDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdFactSealDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDFactSealDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsIdentificationDetailsType }
     * 
     * 
     */
    public List<CustomsIdentificationDetailsType> getATDFactSealDetails() {
        if (atdFactSealDetails == null) {
            atdFactSealDetails = new ArrayList<CustomsIdentificationDetailsType>();
        }
        return this.atdFactSealDetails;
    }

    /**
     * Gets the value of the atdChangeSealDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdChangeSealDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDChangeSealDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATDChangeSealDetailsType }
     * 
     * 
     */
    public List<ATDChangeSealDetailsType> getATDChangeSealDetails() {
        if (atdChangeSealDetails == null) {
            atdChangeSealDetails = new ArrayList<ATDChangeSealDetailsType>();
        }
        return this.atdChangeSealDetails;
    }

    /**
     * Gets the value of the atdNewSealDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdNewSealDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDNewSealDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATDNewSealDetailsType }
     * 
     * 
     */
    public List<ATDNewSealDetailsType> getATDNewSealDetails() {
        if (atdNewSealDetails == null) {
            atdNewSealDetails = new ArrayList<ATDNewSealDetailsType>();
        }
        return this.atdNewSealDetails;
    }

    /**
     * Сведения об обстоятельствах, при которых проводились операции, в отношении средств идентификации Gets the value of the descriptionText property.
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

}
