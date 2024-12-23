
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigDecimal;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения об обеззараживании (дезинфекции)
 * 
 * <p>Java class for DisinfectionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisinfectionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExpositionDuration" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DisinfectionMethodName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ChemicalName"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TemperatureMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ConcentrationMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DoseMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisinfectionDetailsType", propOrder = {
    "eventDate",
    "expositionDuration",
    "disinfectionMethodName",
    "chemicalName",
    "temperatureMeasure",
    "concentrationMeasure",
    "doseMeasure",
    "descriptionText"
})
public class DisinfectionDetailsType {

    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "ExpositionDuration", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Duration expositionDuration;
    @XmlElement(name = "DisinfectionMethodName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String disinfectionMethodName;
    @XmlElement(name = "ChemicalName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String chemicalName;
    @XmlElement(name = "TemperatureMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected BigDecimal temperatureMeasure;
    @XmlElement(name = "ConcentrationMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType concentrationMeasure;
    @XmlElement(name = "DoseMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType doseMeasure;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;

    /**
     * Дата проведения обеззараживания (дезинфекции)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * продолжительность проведения обеззараживания (экспозиция)
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getExpositionDuration() {
        return expositionDuration;
    }

    /**
     * Sets the value of the expositionDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setExpositionDuration(Duration value) {
        this.expositionDuration = value;
    }

    /**
     * Описание способа обработки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisinfectionMethodName() {
        return disinfectionMethodName;
    }

    /**
     * Sets the value of the disinfectionMethodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisinfectionMethodName(String value) {
        this.disinfectionMethodName = value;
    }

    /**
     * Наименование химиката (действующего вещества)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalName() {
        return chemicalName;
    }

    /**
     * Sets the value of the chemicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalName(String value) {
        this.chemicalName = value;
    }

    /**
     * температура при проведении обеззараживания (дезинфекции)
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTemperatureMeasure() {
        return temperatureMeasure;
    }

    /**
     * Sets the value of the temperatureMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTemperatureMeasure(BigDecimal value) {
        this.temperatureMeasure = value;
    }

    /**
     * Концентрация химиката (действующего вещества), примененного при обеззараживании (дезинфекции)
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getConcentrationMeasure() {
        return concentrationMeasure;
    }

    /**
     * Sets the value of the concentrationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setConcentrationMeasure(UnifiedPhysicalMeasureType value) {
        this.concentrationMeasure = value;
    }

    /**
     * Доза химиката (действующего вещества), примененного при обеззараживании (дезинфекции)
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getDoseMeasure() {
        return doseMeasure;
    }

    /**
     * Sets the value of the doseMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setDoseMeasure(UnifiedPhysicalMeasureType value) {
        this.doseMeasure = value;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

}
