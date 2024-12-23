
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
 * Компоненты, представляющие сведения о проведении дезинсекции
 * 
 * <p>Java class for DisinfestationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisinfestationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DisinfestationKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DisinfestationMethodText"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DisinfestationPlaceText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisinfestationDetailsType", propOrder = {
    "disinfestationKindCode",
    "disinfestationMethodText",
    "eventDate",
    "disinfestationPlaceText"
})
public class DisinfestationDetailsType {

    @XmlElement(name = "DisinfestationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String disinfestationKindCode;
    @XmlElement(name = "DisinfestationMethodText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected String disinfestationMethodText;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "DisinfestationPlaceText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected String disinfestationPlaceText;

    /**
     * Gets the value of the disinfestationKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisinfestationKindCode() {
        return disinfestationKindCode;
    }

    /**
     * Sets the value of the disinfestationKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisinfestationKindCode(String value) {
        this.disinfestationKindCode = value;
    }

    /**
     * Gets the value of the disinfestationMethodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisinfestationMethodText() {
        return disinfestationMethodText;
    }

    /**
     * Sets the value of the disinfestationMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisinfestationMethodText(String value) {
        this.disinfestationMethodText = value;
    }

    /**
     * Дата проведения дезинсекции
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
     * Gets the value of the disinfestationPlaceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisinfestationPlaceText() {
        return disinfestationPlaceText;
    }

    /**
     * Sets the value of the disinfestationPlaceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisinfestationPlaceText(String value) {
        this.disinfestationPlaceText = value;
    }

}
