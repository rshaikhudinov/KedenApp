
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.BusinessEntityIdType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию о хозяйствующем субъекте
 * 
 * <p>Java class for BusinessEntityDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessEntityDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BusinessEntityName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BusinessEntityBriefName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BusinessEntityTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BusinessEntityTypeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BusinessEntityId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UniqueCustomsNumberId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TaxpayerId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TaxRegistrationReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}SubjectAddressDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "BusinessEntityDetailsType", propOrder = {
    "unifiedCountryCode",
    "businessEntityName",
    "businessEntityBriefName",
    "businessEntityTypeCode",
    "businessEntityTypeName",
    "businessEntityId",
    "uniqueCustomsNumberId",
    "taxpayerId",
    "taxRegistrationReasonCode",
    "subjectAddressDetails",
    "communicationDetails"
})
@XmlSeeAlso({
    SupplyChainPartyDetailsType.class
})
public class BusinessEntityDetailsType {

    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "BusinessEntityName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessEntityName;
    @XmlElement(name = "BusinessEntityBriefName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessEntityBriefName;
    @XmlElement(name = "BusinessEntityTypeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type businessEntityTypeCode;
    @XmlElement(name = "BusinessEntityTypeName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessEntityTypeName;
    @XmlElement(name = "BusinessEntityId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected BusinessEntityIdType businessEntityId;
    @XmlElement(name = "UniqueCustomsNumberId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String uniqueCustomsNumberId;
    @XmlElement(name = "TaxpayerId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxpayerId;
    @XmlElement(name = "TaxRegistrationReasonCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxRegistrationReasonCode;
    @XmlElement(name = "SubjectAddressDetails")
    protected List<SubjectAddressDetailsType> subjectAddressDetails;
    @XmlElement(name = "CommunicationDetails")
    protected List<CommunicationDetailsType> communicationDetails;

    /**
     * Кодовое обозначение страны регистрации хозяйствующего субъекта
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
     * Gets the value of the businessEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEntityName() {
        return businessEntityName;
    }

    /**
     * Sets the value of the businessEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEntityName(String value) {
        this.businessEntityName = value;
    }

    /**
     * Gets the value of the businessEntityBriefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEntityBriefName() {
        return businessEntityBriefName;
    }

    /**
     * Sets the value of the businessEntityBriefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEntityBriefName(String value) {
        this.businessEntityBriefName = value;
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
     * Gets the value of the businessEntityTypeName property.
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
     * Gets the value of the businessEntityId property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntityIdType }
     *     
     */
    public BusinessEntityIdType getBusinessEntityId() {
        return businessEntityId;
    }

    /**
     * Sets the value of the businessEntityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntityIdType }
     *     
     */
    public void setBusinessEntityId(BusinessEntityIdType value) {
        this.businessEntityId = value;
    }

    /**
     * Уникальный идентификационный номер хозяйствующего субъекта, предназначенный для целей таможенного контроля
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueCustomsNumberId() {
        return uniqueCustomsNumberId;
    }

    /**
     * Sets the value of the uniqueCustomsNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueCustomsNumberId(String value) {
        this.uniqueCustomsNumberId = value;
    }

    /**
     * Идентификатор хозяйствующего субъекта в реестре налогоплательщиков страны регистрации налогоплательщика
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxpayerId() {
        return taxpayerId;
    }

    /**
     * Sets the value of the taxpayerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxpayerId(String value) {
        this.taxpayerId = value;
    }

    /**
     * Код, идентифицирующий причину постановки хозяйствующего субъекта на налоговый учет в Российской Федерации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegistrationReasonCode() {
        return taxRegistrationReasonCode;
    }

    /**
     * Sets the value of the taxRegistrationReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegistrationReasonCode(String value) {
        this.taxRegistrationReasonCode = value;
    }

    /**
     * Адрес хозяйствующего субъекта Gets the value of the subjectAddressDetails property.
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
     * Контактный реквизит хозяйствующего субъекта Gets the value of the communicationDetails property.
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
