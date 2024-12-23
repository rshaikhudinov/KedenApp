
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию об организации
 * 
 * <p>Java class for OrganizationDetailsV3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationDetailsV3Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}OrganizationName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}OrganizationBriefName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BusinessEntityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BusinessEntityTypeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}OrganizationId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}OrganizationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedTaxpayerDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedAddressDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CommunicationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationDetailsV3Type", propOrder = {
    "unifiedCountryCode",
    "organizationName",
    "organizationBriefName",
    "businessEntityTypeCode",
    "businessEntityTypeName",
    "organizationId",
    "organizationCode",
    "unifiedTaxpayerDetails",
    "unifiedAddressDetails",
    "communicationDetails"
})
public class OrganizationDetailsV3Type {

    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "OrganizationName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organizationName;
    @XmlElement(name = "OrganizationBriefName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organizationBriefName;
    @XmlElement(name = "BusinessEntityTypeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type businessEntityTypeCode;
    @XmlElement(name = "BusinessEntityTypeName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessEntityTypeName;
    @XmlElement(name = "OrganizationId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organizationId;
    @XmlElement(name = "OrganizationCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organizationCode;
    @XmlElement(name = "UnifiedTaxpayerDetails")
    protected UnifiedTaxpayerDetailsType unifiedTaxpayerDetails;
    @XmlElement(name = "UnifiedAddressDetails")
    protected UnifiedAddressDetailsType unifiedAddressDetails;
    @XmlElement(name = "CommunicationDetails")
    protected List<CommunicationDetailsType> communicationDetails;

    /**
     * Кодовое обозначение страны регистрации организации
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public UnifiedCountryCodeType getUnifiedCountryCode() {
        return unifiedCountryCode;
    }

    /**
     * Sets the value of the unifiedCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public void setUnifiedCountryCode(UnifiedCountryCodeType value) {
        this.unifiedCountryCode = value;
    }

    /**
     * Полное наименование организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Сокращенное наименование организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationBriefName() {
        return organizationBriefName;
    }

    /**
     * Sets the value of the organizationBriefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationBriefName(String value) {
        this.organizationBriefName = value;
    }

    /**
     * Gets the value of the businessEntityTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getBusinessEntityTypeCode() {
        return businessEntityTypeCode;
    }

    /**
     * Sets the value of the businessEntityTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setBusinessEntityTypeCode(UnifiedCode20Type value) {
        this.businessEntityTypeCode = value;
    }

    /**
     * Наименование организационно-правовой формы, в которой организация осуществляет деятельность
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEntityTypeName() {
        return businessEntityTypeName;
    }

    /**
     * Sets the value of the businessEntityTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEntityTypeName(String value) {
        this.businessEntityTypeName = value;
    }

    /**
     * Уникальный идентификатор организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Классификационный код организации, предназначенный для целей статистического учета
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCode() {
        return organizationCode;
    }

    /**
     * Sets the value of the organizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCode(String value) {
        this.organizationCode = value;
    }

    /**
     * Совокупность реквизитов, присвоенных организации налоговой службой
     * 
     * @return
     *     possible object is
     *     {@link UnifiedTaxpayerDetailsType }
     *     
     */
    public UnifiedTaxpayerDetailsType getUnifiedTaxpayerDetails() {
        return unifiedTaxpayerDetails;
    }

    /**
     * Sets the value of the unifiedTaxpayerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedTaxpayerDetailsType }
     *     
     */
    public void setUnifiedTaxpayerDetails(UnifiedTaxpayerDetailsType value) {
        this.unifiedTaxpayerDetails = value;
    }

    /**
     * Адрес организации
     * 
     * @return
     *     possible object is
     *     {@link UnifiedAddressDetailsType }
     *     
     */
    public UnifiedAddressDetailsType getUnifiedAddressDetails() {
        return unifiedAddressDetails;
    }

    /**
     * Sets the value of the unifiedAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedAddressDetailsType }
     *     
     */
    public void setUnifiedAddressDetails(UnifiedAddressDetailsType value) {
        this.unifiedAddressDetails = value;
    }

    /**
     * Контактный реквизит организации Gets the value of the communicationDetails property.
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
