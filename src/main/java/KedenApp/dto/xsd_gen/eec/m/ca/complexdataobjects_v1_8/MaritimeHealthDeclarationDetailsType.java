
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения из морской медико-санитарной декларации
 * 
 * <p>Java class for MaritimeHealthDeclarationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaritimeHealthDeclarationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SanitaryControlFreeIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SanitaryControlDocDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReInspectionIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}AffectedAreaVisitIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AffectedPortDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DeadIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DeadQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}AbnormalDiseasePersonIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OnBoardDiseasePersonIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DiseasePersonQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}MedicalConsultationIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DiseaseSpreadIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DiseaseSpreadText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SanitaryMeasureIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SanitaryMeasureDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}StowawaysIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EmbarkationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SickAnimalIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaritimeHealthDeclarationDetailsType", propOrder = {
    "sanitaryControlFreeIndicator",
    "sanitaryControlDocDetails",
    "reInspectionIndicator",
    "affectedAreaVisitIndicator",
    "affectedPortDetails",
    "deadIndicator",
    "deadQuantity",
    "abnormalDiseasePersonIndicator",
    "onBoardDiseasePersonIndicator",
    "diseasePersonQuantity",
    "medicalConsultationIndicator",
    "diseaseSpreadIndicator",
    "diseaseSpreadText",
    "sanitaryMeasureIndicator",
    "sanitaryMeasureDetails",
    "stowawaysIndicator",
    "embarkationDate",
    "sickAnimalIndicator"
})
public class MaritimeHealthDeclarationDetailsType {

    @XmlElement(name = "SanitaryControlFreeIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean sanitaryControlFreeIndicator;
    @XmlElement(name = "SanitaryControlDocDetails", required = true)
    protected SanitaryControlDocDetailsType sanitaryControlDocDetails;
    @XmlElement(name = "ReInspectionIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean reInspectionIndicator;
    @XmlElement(name = "AffectedAreaVisitIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean affectedAreaVisitIndicator;
    @XmlElement(name = "AffectedPortDetails")
    protected List<PIVPortDetailsType> affectedPortDetails;
    @XmlElement(name = "DeadIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean deadIndicator;
    @XmlElement(name = "DeadQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger deadQuantity;
    @XmlElement(name = "AbnormalDiseasePersonIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean abnormalDiseasePersonIndicator;
    @XmlElement(name = "OnBoardDiseasePersonIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean onBoardDiseasePersonIndicator;
    @XmlElement(name = "DiseasePersonQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger diseasePersonQuantity;
    @XmlElement(name = "MedicalConsultationIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean medicalConsultationIndicator;
    @XmlElement(name = "DiseaseSpreadIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean diseaseSpreadIndicator;
    @XmlElement(name = "DiseaseSpreadText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String diseaseSpreadText;
    @XmlElement(name = "SanitaryMeasureIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean sanitaryMeasureIndicator;
    @XmlElement(name = "SanitaryMeasureDetails")
    protected List<SanitaryMeasureDetailsType> sanitaryMeasureDetails;
    @XmlElement(name = "StowawaysIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean stowawaysIndicator;
    @XmlElement(name = "EmbarkationDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar embarkationDate;
    @XmlElement(name = "SickAnimalIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean sickAnimalIndicator;

    /**
     * Gets the value of the sanitaryControlFreeIndicator property.
     * 
     */
    public Boolean isSanitaryControlFreeIndicator() {
        return sanitaryControlFreeIndicator;
    }

    /**
     * Sets the value of the sanitaryControlFreeIndicator property.
     * 
     */
    public void setSanitaryControlFreeIndicator(Boolean value) {
        this.sanitaryControlFreeIndicator = value;
    }

    /**
     * Gets the value of the sanitaryControlDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SanitaryControlDocDetailsType }
     *     
     */
    public SanitaryControlDocDetailsType getSanitaryControlDocDetails() {
        return sanitaryControlDocDetails;
    }

    /**
     * Sets the value of the sanitaryControlDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SanitaryControlDocDetailsType }
     *     
     */
    public void setSanitaryControlDocDetails(SanitaryControlDocDetailsType value) {
        this.sanitaryControlDocDetails = value;
    }

    /**
     * Gets the value of the reInspectionIndicator property.
     * 
     */
    public Boolean isReInspectionIndicator() {
        return reInspectionIndicator;
    }

    /**
     * Sets the value of the reInspectionIndicator property.
     * 
     */
    public void setReInspectionIndicator(Boolean value) {
        this.reInspectionIndicator = value;
    }

    /**
     * Gets the value of the affectedAreaVisitIndicator property.
     * 
     */
    public Boolean isAffectedAreaVisitIndicator() {
        return affectedAreaVisitIndicator;
    }

    /**
     * Sets the value of the affectedAreaVisitIndicator property.
     * 
     */
    public void setAffectedAreaVisitIndicator(Boolean value) {
        this.affectedAreaVisitIndicator = value;
    }

    /**
     * Gets the value of the affectedPortDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the affectedPortDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffectedPortDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIVPortDetailsType }
     * 
     * 
     */
    public List<PIVPortDetailsType> getAffectedPortDetails() {
        if (affectedPortDetails == null) {
            affectedPortDetails = new ArrayList<PIVPortDetailsType>();
        }
        return this.affectedPortDetails;
    }

    /**
     * Gets the value of the deadIndicator property.
     * 
     */
    public Boolean isDeadIndicator() {
        return deadIndicator;
    }

    /**
     * Sets the value of the deadIndicator property.
     * 
     */
    public void setDeadIndicator(Boolean value) {
        this.deadIndicator = value;
    }

    /**
     * Gets the value of the deadQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeadQuantity() {
        return deadQuantity;
    }

    /**
     * Sets the value of the deadQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeadQuantity(BigInteger value) {
        this.deadQuantity = value;
    }

    /**
     * Gets the value of the abnormalDiseasePersonIndicator property.
     * 
     */
    public Boolean isAbnormalDiseasePersonIndicator() {
        return abnormalDiseasePersonIndicator;
    }

    /**
     * Sets the value of the abnormalDiseasePersonIndicator property.
     * 
     */
    public void setAbnormalDiseasePersonIndicator(Boolean value) {
        this.abnormalDiseasePersonIndicator = value;
    }

    /**
     * Признак наличия случаев заболеваний или лиц с подозрениями на инфекционные заболевания
     * 
     */
    public Boolean isOnBoardDiseasePersonIndicator() {
        return onBoardDiseasePersonIndicator;
    }

    /**
     * Sets the value of the onBoardDiseasePersonIndicator property.
     * 
     */
    public void setOnBoardDiseasePersonIndicator(Boolean value) {
        this.onBoardDiseasePersonIndicator = value;
    }

    /**
     * число заболевших и лиц с подозрением на инфекционные заболевания
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiseasePersonQuantity() {
        return diseasePersonQuantity;
    }

    /**
     * Sets the value of the diseasePersonQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiseasePersonQuantity(BigInteger value) {
        this.diseasePersonQuantity = value;
    }

    /**
     * Gets the value of the medicalConsultationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMedicalConsultationIndicator() {
        return medicalConsultationIndicator;
    }

    /**
     * Sets the value of the medicalConsultationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMedicalConsultationIndicator(Boolean value) {
        this.medicalConsultationIndicator = value;
    }

    /**
     * Gets the value of the diseaseSpreadIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiseaseSpreadIndicator() {
        return diseaseSpreadIndicator;
    }

    /**
     * Sets the value of the diseaseSpreadIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiseaseSpreadIndicator(Boolean value) {
        this.diseaseSpreadIndicator = value;
    }

    /**
     * Gets the value of the diseaseSpreadText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiseaseSpreadText() {
        return diseaseSpreadText;
    }

    /**
     * Sets the value of the diseaseSpreadText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiseaseSpreadText(String value) {
        this.diseaseSpreadText = value;
    }

    /**
     * Gets the value of the sanitaryMeasureIndicator property.
     * 
     */
    public Boolean isSanitaryMeasureIndicator() {
        return sanitaryMeasureIndicator;
    }

    /**
     * Sets the value of the sanitaryMeasureIndicator property.
     * 
     */
    public void setSanitaryMeasureIndicator(Boolean value) {
        this.sanitaryMeasureIndicator = value;
    }

    /**
     * Gets the value of the sanitaryMeasureDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sanitaryMeasureDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSanitaryMeasureDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SanitaryMeasureDetailsType }
     * 
     * 
     */
    public List<SanitaryMeasureDetailsType> getSanitaryMeasureDetails() {
        if (sanitaryMeasureDetails == null) {
            sanitaryMeasureDetails = new ArrayList<SanitaryMeasureDetailsType>();
        }
        return this.sanitaryMeasureDetails;
    }

    /**
     * Gets the value of the stowawaysIndicator property.
     * 
     */
    public Boolean isStowawaysIndicator() {
        return stowawaysIndicator;
    }

    /**
     * Sets the value of the stowawaysIndicator property.
     * 
     */
    public void setStowawaysIndicator(Boolean value) {
        this.stowawaysIndicator = value;
    }

    /**
     * дата появления на судне безбилетных пассажиров
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmbarkationDate() {
        return embarkationDate;
    }

    /**
     * Sets the value of the embarkationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmbarkationDate(XMLGregorianCalendar value) {
        this.embarkationDate = value;
    }

    /**
     * Gets the value of the sickAnimalIndicator property.
     * 
     */
    public Boolean isSickAnimalIndicator() {
        return sickAnimalIndicator;
    }

    /**
     * Sets the value of the sickAnimalIndicator property.
     * 
     */
    public void setSickAnimalIndicator(Boolean value) {
        this.sickAnimalIndicator = value;
    }

}
