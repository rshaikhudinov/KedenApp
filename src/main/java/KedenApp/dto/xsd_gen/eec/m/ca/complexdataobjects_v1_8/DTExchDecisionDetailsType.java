
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsDecisionCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о решении, принятом таможенным органом
 * 
 * <p>Java class for DTExchDecisionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTExchDecisionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsDecisionModeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTExchDecisionDetailsType", propOrder = {
    "customsDecisionModeCode",
    "eventDate"
})
public class DTExchDecisionDetailsType {

    @XmlElement(name = "CustomsDecisionModeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsDecisionCodeType customsDecisionModeCode;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;

    /**
     * код решения, принятого таможенным органом
     * 
     * @return
     *     possible object is
     *     {@link CustomsDecisionCodeType }
     *     
     */
    public CustomsDecisionCodeType getCustomsDecisionModeCode() {
        return customsDecisionModeCode;
    }

    /**
     * Sets the value of the customsDecisionModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDecisionCodeType }
     *     
     */
    public void setCustomsDecisionModeCode(CustomsDecisionCodeType value) {
        this.customsDecisionModeCode = value;
    }

    /**
     * Дата принятия решения
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

}
