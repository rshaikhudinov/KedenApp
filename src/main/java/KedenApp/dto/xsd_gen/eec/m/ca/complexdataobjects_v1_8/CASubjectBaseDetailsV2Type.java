
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CAUniqueCustomsNumberIdType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию о субъекте
 * 
 * <p>Java class for CASubjectBaseDetailsV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CASubjectBaseDetailsV2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}SubjectName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}SubjectBriefName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAUniqueCustomsNumberId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TaxpayerId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TaxRegistrationReasonCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PersonId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CASubjectBaseDetailsV2Type", propOrder = {
    "subjectName",
    "subjectBriefName",
    "caUniqueCustomsNumberId",
    "taxpayerId",
    "taxRegistrationReasonCode",
    "personId"
})
@XmlSeeAlso({
    CASubjectDetailsV2Type.class
})
public class CASubjectBaseDetailsV2Type {

    @XmlElement(name = "SubjectName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String subjectName;
    @XmlElement(name = "SubjectBriefName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String subjectBriefName;
    @XmlElement(name = "CAUniqueCustomsNumberId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CAUniqueCustomsNumberIdType caUniqueCustomsNumberId;
    @XmlElement(name = "TaxpayerId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxpayerId;
    @XmlElement(name = "TaxRegistrationReasonCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxRegistrationReasonCode;
    @XmlElement(name = "PersonId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String personId;

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the subjectBriefName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectBriefName() {
        return subjectBriefName;
    }

    /**
     * Sets the value of the subjectBriefName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectBriefName(String value) {
        this.subjectBriefName = value;
    }

    /**
     * Gets the value of the caUniqueCustomsNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link CAUniqueCustomsNumberIdType }
     *     
     */
    public CAUniqueCustomsNumberIdType getCAUniqueCustomsNumberId() {
        return caUniqueCustomsNumberId;
    }

    /**
     * Sets the value of the caUniqueCustomsNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAUniqueCustomsNumberIdType }
     *     
     */
    public void setCAUniqueCustomsNumberId(CAUniqueCustomsNumberIdType value) {
        this.caUniqueCustomsNumberId = value;
    }

    /**
     * Идентификатор субъекта в реестре налогоплательщиков страны регистрации налогоплательщика
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
     * Код, идентифицирующий причину постановки субъекта на налоговый учет в Российской Федерации
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
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

}
