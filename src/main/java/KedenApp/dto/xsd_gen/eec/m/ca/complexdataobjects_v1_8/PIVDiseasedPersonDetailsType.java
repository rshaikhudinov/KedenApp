
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.FullNameDetailsType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о заболевшем лице
 * 
 * <p>Java class for PIVDiseasedPersonDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIVDiseasedPersonDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}FullNameDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RoleCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}NationalityCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}EmbarkationPlaceDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DisembarkationPlaceDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AgeDuration" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}SexCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DiseaseConfirmCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DiseaseDescriptionText"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DiseaseDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TreatmentDescriptionText"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}InformationIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DiseaseOutcomeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DiseasedPersonLocationCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIVDiseasedPersonDetailsType", propOrder = {
    "fullNameDetails",
    "roleCode",
    "nationalityCountryCode",
    "embarkationPlaceDetails",
    "disembarkationPlaceDetails",
    "ageDuration",
    "sexCode",
    "diseaseConfirmCode",
    "diseaseDescriptionText",
    "diseaseDate",
    "treatmentDescriptionText",
    "informationIndicator",
    "diseaseOutcomeCode",
    "diseasedPersonLocationCode"
})
public class PIVDiseasedPersonDetailsType {

    @XmlElement(name = "FullNameDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected FullNameDetailsType fullNameDetails;
    @XmlElement(name = "RoleCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String roleCode;
    @XmlElement(name = "NationalityCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCountryCodeType nationalityCountryCode;
    @XmlElement(name = "EmbarkationPlaceDetails", required = true)
    protected EmbarkationPlaceDetailsType embarkationPlaceDetails;
    @XmlElement(name = "DisembarkationPlaceDetails")
    protected EmbarkationPlaceDetailsType disembarkationPlaceDetails;
    @XmlElement(name = "AgeDuration", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected Duration ageDuration;
    @XmlElement(name = "SexCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sexCode;
    @XmlElement(name = "DiseaseConfirmCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String diseaseConfirmCode;
    @XmlElement(name = "DiseaseDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected String diseaseDescriptionText;
    @XmlElement(name = "DiseaseDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar diseaseDate;
    @XmlElement(name = "TreatmentDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected String treatmentDescriptionText;
    @XmlElement(name = "InformationIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean informationIndicator;
    @XmlElement(name = "DiseaseOutcomeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String diseaseOutcomeCode;
    @XmlElement(name = "DiseasedPersonLocationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String diseasedPersonLocationCode;

    /**
     * Gets the value of the fullNameDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FullNameDetailsType }
     *     
     */
    public FullNameDetailsType getFullNameDetails() {
        return fullNameDetails;
    }

    /**
     * Sets the value of the fullNameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullNameDetailsType }
     *     
     */
    public void setFullNameDetails(FullNameDetailsType value) {
        this.fullNameDetails = value;
    }

    /**
     * Кодовое обозначение роли лица на борту судна
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * Sets the value of the roleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleCode(String value) {
        this.roleCode = value;
    }

    /**
     * Gets the value of the nationalityCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public UnifiedCountryCodeType getNationalityCountryCode() {
        return nationalityCountryCode;
    }

    /**
     * Sets the value of the nationalityCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public void setNationalityCountryCode(UnifiedCountryCodeType value) {
        this.nationalityCountryCode = value;
    }

    /**
     * Gets the value of the embarkationPlaceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EmbarkationPlaceDetailsType }
     *     
     */
    public EmbarkationPlaceDetailsType getEmbarkationPlaceDetails() {
        return embarkationPlaceDetails;
    }

    /**
     * Sets the value of the embarkationPlaceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbarkationPlaceDetailsType }
     *     
     */
    public void setEmbarkationPlaceDetails(EmbarkationPlaceDetailsType value) {
        this.embarkationPlaceDetails = value;
    }

    /**
     * Gets the value of the disembarkationPlaceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EmbarkationPlaceDetailsType }
     *     
     */
    public EmbarkationPlaceDetailsType getDisembarkationPlaceDetails() {
        return disembarkationPlaceDetails;
    }

    /**
     * Sets the value of the disembarkationPlaceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbarkationPlaceDetailsType }
     *     
     */
    public void setDisembarkationPlaceDetails(EmbarkationPlaceDetailsType value) {
        this.disembarkationPlaceDetails = value;
    }

    /**
     * Возраст
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAgeDuration() {
        return ageDuration;
    }

    /**
     * Sets the value of the ageDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAgeDuration(Duration value) {
        this.ageDuration = value;
    }

    /**
     * Пол
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * Sets the value of the sexCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexCode(String value) {
        this.sexCode = value;
    }

    /**
     * Gets the value of the diseaseConfirmCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiseaseConfirmCode() {
        return diseaseConfirmCode;
    }

    /**
     * Sets the value of the diseaseConfirmCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiseaseConfirmCode(String value) {
        this.diseaseConfirmCode = value;
    }

    /**
     * Gets the value of the diseaseDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiseaseDescriptionText() {
        return diseaseDescriptionText;
    }

    /**
     * Sets the value of the diseaseDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiseaseDescriptionText(String value) {
        this.diseaseDescriptionText = value;
    }

    /**
     * Gets the value of the diseaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDiseaseDate() {
        return diseaseDate;
    }

    /**
     * Sets the value of the diseaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDiseaseDate(XMLGregorianCalendar value) {
        this.diseaseDate = value;
    }

    /**
     * Gets the value of the treatmentDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatmentDescriptionText() {
        return treatmentDescriptionText;
    }

    /**
     * Sets the value of the treatmentDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatmentDescriptionText(String value) {
        this.treatmentDescriptionText = value;
    }

    /**
     * Признак информирования врача в порту
     * 
     */
    public Boolean isInformationIndicator() {
        return informationIndicator;
    }

    /**
     * Sets the value of the informationIndicator property.
     * 
     */
    public void setInformationIndicator(Boolean value) {
        this.informationIndicator = value;
    }

    /**
     * Gets the value of the diseaseOutcomeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiseaseOutcomeCode() {
        return diseaseOutcomeCode;
    }

    /**
     * Sets the value of the diseaseOutcomeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiseaseOutcomeCode(String value) {
        this.diseaseOutcomeCode = value;
    }

    /**
     * Gets the value of the diseasedPersonLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiseasedPersonLocationCode() {
        return diseasedPersonLocationCode;
    }

    /**
     * Sets the value of the diseasedPersonLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiseasedPersonLocationCode(String value) {
        this.diseasedPersonLocationCode = value;
    }

}
