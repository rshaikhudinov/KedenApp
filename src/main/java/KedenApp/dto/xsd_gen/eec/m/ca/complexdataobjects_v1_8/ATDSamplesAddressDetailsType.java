
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.SubjectAddressDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения об адресе (месте) отбора проб и (или) образцов
 * 
 * <p>Java class for ATDSamplesAddressDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDSamplesAddressDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}SubjectAddressDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsControlZoneId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterDocumentIdDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDSamplesAddressDetailsType", propOrder = {
    "subjectAddressDetails",
    "customsControlZoneId",
    "registerDocumentIdDetails"
})
public class ATDSamplesAddressDetailsType {

    @XmlElement(name = "SubjectAddressDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected SubjectAddressDetailsType subjectAddressDetails;
    @XmlElement(name = "CustomsControlZoneId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsControlZoneId;
    @XmlElement(name = "RegisterDocumentIdDetails")
    protected RegisterDocumentIdDetailsType registerDocumentIdDetails;

    /**
     * Сведения об адресе
     * 
     * @return
     *     possible object is
     *     {@link SubjectAddressDetailsType }
     *     
     */
    public SubjectAddressDetailsType getSubjectAddressDetails() {
        return subjectAddressDetails;
    }

    /**
     * Sets the value of the subjectAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAddressDetailsType }
     *     
     */
    public void setSubjectAddressDetails(SubjectAddressDetailsType value) {
        this.subjectAddressDetails = value;
    }

    /**
     * Регистрационный номер зоны таможенного контроля
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsControlZoneId() {
        return customsControlZoneId;
    }

    /**
     * Sets the value of the customsControlZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsControlZoneId(String value) {
        this.customsControlZoneId = value;
    }

    /**
     * Свидетельство о включении в реестр владельцев складов временного хранения, таможенных (свободных) складов, реестр владельцев магазинов беспошлинной торговли
     * 
     * @return
     *     possible object is
     *     {@link RegisterDocumentIdDetailsType }
     *     
     */
    public RegisterDocumentIdDetailsType getRegisterDocumentIdDetails() {
        return registerDocumentIdDetails;
    }

    /**
     * Sets the value of the registerDocumentIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterDocumentIdDetailsType }
     *     
     */
    public void setRegisterDocumentIdDetails(RegisterDocumentIdDetailsType value) {
        this.registerDocumentIdDetails = value;
    }

}
