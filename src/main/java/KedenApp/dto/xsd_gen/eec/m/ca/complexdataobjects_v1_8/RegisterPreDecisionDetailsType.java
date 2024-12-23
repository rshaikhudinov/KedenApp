
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.PeriodDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * сведения о предварительном решении, предназначенные для публикации в общем информационном ресурсе
 * 
 * <p>Java class for RegisterPreDecisionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterPreDecisionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PreDecisionBaseDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ValidityPeriodDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PreDecisionCancelDocDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreDecisionCancelReasonText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UpdateDateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterPreDecisionDetailsType", propOrder = {
    "preDecisionBaseDetails",
    "validityPeriodDetails",
    "preDecisionCancelDocDetails",
    "preDecisionCancelReasonText",
    "updateDateTime"
})
public class RegisterPreDecisionDetailsType {

    @XmlElement(name = "PreDecisionBaseDetails", required = true)
    protected PreDecisionBaseDetailsType preDecisionBaseDetails;
    @XmlElement(name = "ValidityPeriodDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected PeriodDetailsType validityPeriodDetails;
    @XmlElement(name = "PreDecisionCancelDocDetails")
    protected CADocBaseType preDecisionCancelDocDetails;
    @XmlElement(name = "PreDecisionCancelReasonText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String preDecisionCancelReasonText;
    @XmlElement(name = "UpdateDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDateTime;

    /**
     * сведения о предварительном решении, предназначенные для публикации в общем информационном ресурсе
     * 
     * @return
     *     possible object is
     *     {@link PreDecisionBaseDetailsType }
     *     
     */
    public PreDecisionBaseDetailsType getPreDecisionBaseDetails() {
        return preDecisionBaseDetails;
    }

    /**
     * Sets the value of the preDecisionBaseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreDecisionBaseDetailsType }
     *     
     */
    public void setPreDecisionBaseDetails(PreDecisionBaseDetailsType value) {
        this.preDecisionBaseDetails = value;
    }

    /**
     * Gets the value of the validityPeriodDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodDetailsType }
     *     
     */
    public PeriodDetailsType getValidityPeriodDetails() {
        return validityPeriodDetails;
    }

    /**
     * Sets the value of the validityPeriodDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDetailsType }
     *     
     */
    public void setValidityPeriodDetails(PeriodDetailsType value) {
        this.validityPeriodDetails = value;
    }

    /**
     * Gets the value of the preDecisionCancelDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CADocBaseType }
     *     
     */
    public CADocBaseType getPreDecisionCancelDocDetails() {
        return preDecisionCancelDocDetails;
    }

    /**
     * Sets the value of the preDecisionCancelDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CADocBaseType }
     *     
     */
    public void setPreDecisionCancelDocDetails(CADocBaseType value) {
        this.preDecisionCancelDocDetails = value;
    }

    /**
     * Gets the value of the preDecisionCancelReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreDecisionCancelReasonText() {
        return preDecisionCancelReasonText;
    }

    /**
     * Sets the value of the preDecisionCancelReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreDecisionCancelReasonText(String value) {
        this.preDecisionCancelReasonText = value;
    }

    /**
     * Gets the value of the updateDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Sets the value of the updateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDateTime(XMLGregorianCalendar value) {
        this.updateDateTime = value;
    }

}
