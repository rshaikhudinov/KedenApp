
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию об образовании (квалификации, обучении)
 * 
 * <p>Java class for EducationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EducationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EducationLevelCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}QualificationDegreeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}QualificationDegreeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}SpecialityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}SpecialityName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}StartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EndDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}AcademicCertificateDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationDetailsType", propOrder = {
    "educationLevelCode",
    "qualificationDegreeCode",
    "qualificationDegreeName",
    "specialityCode",
    "specialityName",
    "startDate",
    "endDate",
    "academicCertificateDetails"
})
public class EducationDetailsType {

    @XmlElement(name = "EducationLevelCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String educationLevelCode;
    @XmlElement(name = "QualificationDegreeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String qualificationDegreeCode;
    @XmlElement(name = "QualificationDegreeName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String qualificationDegreeName;
    @XmlElement(name = "SpecialityCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String specialityCode;
    @XmlElement(name = "SpecialityName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String specialityName;
    @XmlElement(name = "StartDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "AcademicCertificateDetails")
    protected AcademicCertificateDetailsType academicCertificateDetails;

    /**
     * Gets the value of the educationLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationLevelCode() {
        return educationLevelCode;
    }

    /**
     * Sets the value of the educationLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationLevelCode(String value) {
        this.educationLevelCode = value;
    }

    /**
     * Gets the value of the qualificationDegreeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationDegreeCode() {
        return qualificationDegreeCode;
    }

    /**
     * Sets the value of the qualificationDegreeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationDegreeCode(String value) {
        this.qualificationDegreeCode = value;
    }

    /**
     * Gets the value of the qualificationDegreeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualificationDegreeName() {
        return qualificationDegreeName;
    }

    /**
     * Sets the value of the qualificationDegreeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualificationDegreeName(String value) {
        this.qualificationDegreeName = value;
    }

    /**
     * кодовое обозначение специальности в соответствии с дипломом об образовании
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityCode() {
        return specialityCode;
    }

    /**
     * Sets the value of the specialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityCode(String value) {
        this.specialityCode = value;
    }

    /**
     * наименование специальности в соответствии с дипломом об образовании
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityName() {
        return specialityName;
    }

    /**
     * Sets the value of the specialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityName(String value) {
        this.specialityName = value;
    }

    /**
     * дата начала обучения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * дата окончания обучения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the academicCertificateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicCertificateDetailsType }
     *     
     */
    public AcademicCertificateDetailsType getAcademicCertificateDetails() {
        return academicCertificateDetails;
    }

    /**
     * Sets the value of the academicCertificateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicCertificateDetailsType }
     *     
     */
    public void setAcademicCertificateDetails(AcademicCertificateDetailsType value) {
        this.academicCertificateDetails = value;
    }

}
