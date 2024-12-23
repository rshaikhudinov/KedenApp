
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.AddressDetailsV4Type;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CodeListItemDetailsV2Type;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CommunicationDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.ResourceItemStatusDetailsType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения классификатора таможенного органа
 * 
 * <p>Java class for CustomsOfficeClassifierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsOfficeClassifierDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsOfficeFullName"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}AddressV4Details" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CommunicationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsOfficeRevisedCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsOfficePreviousCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsOfficeIndicatorDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CodeListItemV2Details"/&gt;
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
@XmlType(name = "CustomsOfficeClassifierDetailsType", propOrder = {
    "unifiedCountryCode",
    "customsOfficeCode",
    "customsOfficeName",
    "customsOfficeFullName",
    "addressV4Details",
    "communicationDetails",
    "customsOfficeRevisedCode",
    "customsOfficePreviousCode",
    "customsOfficeIndicatorDetails",
    "codeListItemV2Details",
    "resourceItemStatusDetails"
})
public class CustomsOfficeClassifierDetailsType {

    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "CustomsOfficeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeCode;
    @XmlElement(name = "CustomsOfficeName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeName;
    @XmlElement(name = "CustomsOfficeFullName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeFullName;
    @XmlElement(name = "AddressV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected AddressDetailsV4Type addressV4Details;
    @XmlElement(name = "CommunicationDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected List<CommunicationDetailsType> communicationDetails;
    @XmlElement(name = "CustomsOfficeRevisedCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> customsOfficeRevisedCode;
    @XmlElement(name = "CustomsOfficePreviousCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> customsOfficePreviousCode;
    @XmlElement(name = "CustomsOfficeIndicatorDetails")
    protected CustomsOfficeIndicatorDetailsType customsOfficeIndicatorDetails;
    @XmlElement(name = "CodeListItemV2Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected CodeListItemDetailsV2Type codeListItemV2Details;
    @XmlElement(name = "ResourceItemStatusDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected ResourceItemStatusDetailsType resourceItemStatusDetails;

    /**
     * Gets the value of the unifiedCountryCode property.
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
     *  8-значный код таможенного органа государства – члена Евразийского экономического союза
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
     * Краткое наименование таможенного органа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOfficeName() {
        return customsOfficeName;
    }

    /**
     * Sets the value of the customsOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOfficeName(String value) {
        this.customsOfficeName = value;
    }

    /**
     * Gets the value of the customsOfficeFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOfficeFullName() {
        return customsOfficeFullName;
    }

    /**
     * Sets the value of the customsOfficeFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOfficeFullName(String value) {
        this.customsOfficeFullName = value;
    }

    /**
     * Адрес таможенного органа
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailsV4Type }
     *     
     */
    public AddressDetailsV4Type getAddressV4Details() {
        return addressV4Details;
    }

    /**
     * Sets the value of the addressV4Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailsV4Type }
     *     
     */
    public void setAddressV4Details(AddressDetailsV4Type value) {
        this.addressV4Details = value;
    }

    /**
     * Контактный реквизит таможенного органа Gets the value of the communicationDetails property.
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

    /**
     * Gets the value of the customsOfficeRevisedCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customsOfficeRevisedCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsOfficeRevisedCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomsOfficeRevisedCode() {
        if (customsOfficeRevisedCode == null) {
            customsOfficeRevisedCode = new ArrayList<String>();
        }
        return this.customsOfficeRevisedCode;
    }

    /**
     * Gets the value of the customsOfficePreviousCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customsOfficePreviousCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsOfficePreviousCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomsOfficePreviousCode() {
        if (customsOfficePreviousCode == null) {
            customsOfficePreviousCode = new ArrayList<String>();
        }
        return this.customsOfficePreviousCode;
    }

    /**
     * Признак таможенного органа
     * 
     * @return
     *     possible object is
     *     {@link CustomsOfficeIndicatorDetailsType }
     *     
     */
    public CustomsOfficeIndicatorDetailsType getCustomsOfficeIndicatorDetails() {
        return customsOfficeIndicatorDetails;
    }

    /**
     * Sets the value of the customsOfficeIndicatorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsOfficeIndicatorDetailsType }
     *     
     */
    public void setCustomsOfficeIndicatorDetails(CustomsOfficeIndicatorDetailsType value) {
        this.customsOfficeIndicatorDetails = value;
    }

    /**
     * Gets the value of the codeListItemV2Details property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListItemDetailsV2Type }
     *     
     */
    public CodeListItemDetailsV2Type getCodeListItemV2Details() {
        return codeListItemV2Details;
    }

    /**
     * Sets the value of the codeListItemV2Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListItemDetailsV2Type }
     *     
     */
    public void setCodeListItemV2Details(CodeListItemDetailsV2Type value) {
        this.codeListItemV2Details = value;
    }

    /**
     * Совокупность технологических сведений о записи классификатора таможенных органов
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
