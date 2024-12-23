
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
 * Сведения о резиденте (участнике) свободных (специальных, особых) экономических зон
 * 
 * <p>Java class for RegisterSEZResidentsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterSEZResidentsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProvidedInformationCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterDocumentDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SEZOrganizationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SpecialEconomicZoneName"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SEZProjectName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SEZOwnerName"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SEZStatusDeprivationDate" minOccurs="0"/&gt;
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
@XmlType(name = "RegisterSEZResidentsDetailsType", propOrder = {
    "providedInformationCountryCode",
    "registerDocumentDetails",
    "sezOrganizationDetails",
    "specialEconomicZoneName",
    "sezProjectName",
    "sezOwnerName",
    "sezStatusDeprivationDate",
    "activityStartDate",
    "activityEndDate",
    "resourceItemStatusDetails"
})
public class RegisterSEZResidentsDetailsType {

    @XmlElement(name = "ProvidedInformationCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String providedInformationCountryCode;
    @XmlElement(name = "RegisterDocumentDetails", required = true)
    protected RegisterDocumentDetailsType registerDocumentDetails;
    @XmlElement(name = "SEZOrganizationDetails", required = true)
    protected SEZOrganizationDetailsType sezOrganizationDetails;
    @XmlElement(name = "SpecialEconomicZoneName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String specialEconomicZoneName;
    @XmlElement(name = "SEZProjectName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sezProjectName;
    @XmlElement(name = "SEZOwnerName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sezOwnerName;
    @XmlElement(name = "SEZStatusDeprivationDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sezStatusDeprivationDate;
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
     * Gets the value of the sezOrganizationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SEZOrganizationDetailsType }
     *     
     */
    public SEZOrganizationDetailsType getSEZOrganizationDetails() {
        return sezOrganizationDetails;
    }

    /**
     * Sets the value of the sezOrganizationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEZOrganizationDetailsType }
     *     
     */
    public void setSEZOrganizationDetails(SEZOrganizationDetailsType value) {
        this.sezOrganizationDetails = value;
    }

    /**
     * Gets the value of the specialEconomicZoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialEconomicZoneName() {
        return specialEconomicZoneName;
    }

    /**
     * Sets the value of the specialEconomicZoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialEconomicZoneName(String value) {
        this.specialEconomicZoneName = value;
    }

    /**
     * Gets the value of the sezProjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEZProjectName() {
        return sezProjectName;
    }

    /**
     * Sets the value of the sezProjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEZProjectName(String value) {
        this.sezProjectName = value;
    }

    /**
     * Gets the value of the sezOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEZOwnerName() {
        return sezOwnerName;
    }

    /**
     * Sets the value of the sezOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEZOwnerName(String value) {
        this.sezOwnerName = value;
    }

    /**
     * Gets the value of the sezStatusDeprivationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSEZStatusDeprivationDate() {
        return sezStatusDeprivationDate;
    }

    /**
     * Sets the value of the sezStatusDeprivationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSEZStatusDeprivationDate(XMLGregorianCalendar value) {
        this.sezStatusDeprivationDate = value;
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
