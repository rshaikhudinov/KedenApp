
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.ResourceItemStatusDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения об объекте учета реестра таможенных перевозчиков
 * 
 * <p>Java class for RegisterCustomsCarrierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterCustomsCarrierDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProvidedInformationCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterDocumentDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterOrganizationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GuaranteeDocDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AdditionalInfoText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ActivityStartDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ActivityEndDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ResourceItemStatusDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterCustomsCarrierDetailsType", propOrder = {
    "providedInformationCountryCode",
    "registerDocumentDetails",
    "registerOrganizationDetails",
    "guaranteeDocDetails",
    "customsOfficeCode",
    "additionalInfoText",
    "activityStartDate",
    "activityEndDate",
    "resourceItemStatusDetails"
})
public class RegisterCustomsCarrierDetailsType {

    @XmlElement(name = "ProvidedInformationCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String providedInformationCountryCode;
    @XmlElement(name = "RegisterDocumentDetails", required = true)
    protected RegisterDocumentDetailsType registerDocumentDetails;
    @XmlElement(name = "RegisterOrganizationDetails", required = true)
    protected RegisterOrganizationDetailsType registerOrganizationDetails;
    @XmlElement(name = "GuaranteeDocDetails", required = true)
    protected CADocBaseType guaranteeDocDetails;
    @XmlElement(name = "CustomsOfficeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeCode;
    @XmlElement(name = "AdditionalInfoText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String additionalInfoText;
    @XmlElement(name = "ActivityStartDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityStartDate;
    @XmlElement(name = "ActivityEndDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityEndDate;
    @XmlElement(name = "ResourceItemStatusDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected ResourceItemStatusDetailsType resourceItemStatusDetails;

    /**
     * Gets the value of the providedInformationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvidedInformationCountryCode() {
        return providedInformationCountryCode;
    }

    /**
     * Sets the value of the providedInformationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvidedInformationCountryCode(String value) {
        this.providedInformationCountryCode = value;
    }

    /**
     * Gets the value of the registerDocumentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterDocumentDetailsType }
     *     
     */
    public RegisterDocumentDetailsType getRegisterDocumentDetails() {
        return registerDocumentDetails;
    }

    /**
     * Sets the value of the registerDocumentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterDocumentDetailsType }
     *     
     */
    public void setRegisterDocumentDetails(RegisterDocumentDetailsType value) {
        this.registerDocumentDetails = value;
    }

    /**
     * Gets the value of the registerOrganizationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterOrganizationDetailsType }
     *     
     */
    public RegisterOrganizationDetailsType getRegisterOrganizationDetails() {
        return registerOrganizationDetails;
    }

    /**
     * Sets the value of the registerOrganizationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterOrganizationDetailsType }
     *     
     */
    public void setRegisterOrganizationDetails(RegisterOrganizationDetailsType value) {
        this.registerOrganizationDetails = value;
    }

    /**
     * Gets the value of the guaranteeDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CADocBaseType }
     *     
     */
    public CADocBaseType getGuaranteeDocDetails() {
        return guaranteeDocDetails;
    }

    /**
     * Sets the value of the guaranteeDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CADocBaseType }
     *     
     */
    public void setGuaranteeDocDetails(CADocBaseType value) {
        this.guaranteeDocDetails = value;
    }

    /**
     * Gets the value of the customsOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOfficeCode() {
        return customsOfficeCode;
    }

    /**
     * Sets the value of the customsOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOfficeCode(String value) {
        this.customsOfficeCode = value;
    }

    /**
     * Gets the value of the additionalInfoText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfoText() {
        return additionalInfoText;
    }

    /**
     * Sets the value of the additionalInfoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfoText(String value) {
        this.additionalInfoText = value;
    }

    /**
     * Gets the value of the activityStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityStartDate() {
        return activityStartDate;
    }

    /**
     * Sets the value of the activityStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityStartDate(XMLGregorianCalendar value) {
        this.activityStartDate = value;
    }

    /**
     * Gets the value of the activityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityEndDate() {
        return activityEndDate;
    }

    /**
     * Sets the value of the activityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityEndDate(XMLGregorianCalendar value) {
        this.activityEndDate = value;
    }

    /**
     * Gets the value of the resourceItemStatusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceItemStatusDetailsType }
     *     
     */
    public ResourceItemStatusDetailsType getResourceItemStatusDetails() {
        return resourceItemStatusDetails;
    }

    /**
     * Sets the value of the resourceItemStatusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceItemStatusDetailsType }
     *     
     */
    public void setResourceItemStatusDetails(ResourceItemStatusDetailsType value) {
        this.resourceItemStatusDetails = value;
    }

}
