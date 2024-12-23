
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о проведении медико-санитарных мер на борту судна
 * 
 * <p>Java class for SanitaryMeasureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SanitaryMeasureDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SanitaryMeasureCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SanitaryMeasureLocationDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SanitaryMeasureDetailsType", propOrder = {
    "sanitaryMeasureCode",
    "descriptionText",
    "eventDate",
    "sanitaryMeasureLocationDetails"
})
public class SanitaryMeasureDetailsType {

    @XmlElement(name = "SanitaryMeasureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sanitaryMeasureCode;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "SanitaryMeasureLocationDetails", required = true)
    protected SanitaryMeasureLocationDetailsType sanitaryMeasureLocationDetails;

    /**
     * Gets the value of the sanitaryMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSanitaryMeasureCode() {
        return sanitaryMeasureCode;
    }

    /**
     * Sets the value of the sanitaryMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSanitaryMeasureCode(String value) {
        this.sanitaryMeasureCode = value;
    }

    /**
     * Описание принятой медико-санитарной меры
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

    /**
     * Дата проведения медико-санитарной меры
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
     * Gets the value of the sanitaryMeasureLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SanitaryMeasureLocationDetailsType }
     *     
     */
    public SanitaryMeasureLocationDetailsType getSanitaryMeasureLocationDetails() {
        return sanitaryMeasureLocationDetails;
    }

    /**
     * Sets the value of the sanitaryMeasureLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SanitaryMeasureLocationDetailsType }
     *     
     */
    public void setSanitaryMeasureLocationDetails(SanitaryMeasureLocationDetailsType value) {
        this.sanitaryMeasureLocationDetails = value;
    }

}
