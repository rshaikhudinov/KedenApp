
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.OfficerDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о лице, принявшем товары на отвественное хранение
 * 
 * <p>Java class for ATDAcceptOfficerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDAcceptOfficerDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OfficerDetails"/&gt;
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
@XmlType(name = "ATDAcceptOfficerDetailsType", propOrder = {
    "officerDetails",
    "signIndicator",
    "signingDate"
})
public class ATDAcceptOfficerDetailsType {

    @XmlElement(name = "OfficerDetails", required = true)
    protected OfficerDetailsType officerDetails;
    @XmlElement(name = "SignIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean signIndicator;
    @XmlElement(name = "SigningDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signingDate;

    /**
     * Gets the value of the officerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OfficerDetailsType }
     *     
     */
    public OfficerDetailsType getOfficerDetails() {
        return officerDetails;
    }

    /**
     * Sets the value of the officerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficerDetailsType }
     *     
     */
    public void setOfficerDetails(OfficerDetailsType value) {
        this.officerDetails = value;
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
