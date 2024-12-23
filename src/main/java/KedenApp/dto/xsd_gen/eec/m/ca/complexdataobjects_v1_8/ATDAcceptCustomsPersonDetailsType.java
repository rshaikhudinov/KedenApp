
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о сотруднике таможни, принявшем товары на хранение
 * 
 * <p>Java class for ATDAcceptCustomsPersonDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDAcceptCustomsPersonDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDCustomsPersonDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SignIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SigningDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDAcceptCustomsPersonDetailsType", propOrder = {
    "atdCustomsPersonDetails",
    "signIndicator",
    "signingDate"
})
public class ATDAcceptCustomsPersonDetailsType {

    @XmlElement(name = "ATDCustomsPersonDetails", required = true)
    protected ATDCustomsPersonDetailsType atdCustomsPersonDetails;
    @XmlElement(name = "SignIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean signIndicator;
    @XmlElement(name = "SigningDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signingDate;

    /**
     * Gets the value of the atdCustomsPersonDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDCustomsPersonDetailsType }
     *     
     */
    public ATDCustomsPersonDetailsType getATDCustomsPersonDetails() {
        return atdCustomsPersonDetails;
    }

    /**
     * Sets the value of the atdCustomsPersonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDCustomsPersonDetailsType }
     *     
     */
    public void setATDCustomsPersonDetails(ATDCustomsPersonDetailsType value) {
        this.atdCustomsPersonDetails = value;
    }

    /**
     * Gets the value of the signIndicator property.
     * 
     */
    public Boolean isSignIndicator() {
        return signIndicator;
    }

    /**
     * Sets the value of the signIndicator property.
     * 
     */
    public void setSignIndicator(Boolean value) {
        this.signIndicator = value;
    }

    /**
     * Gets the value of the signingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSigningDate() {
        return signingDate;
    }

    /**
     * Sets the value of the signingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSigningDate(XMLGregorianCalendar value) {
        this.signingDate = value;
    }

}
