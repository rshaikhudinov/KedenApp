
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о получении и отправке второго экземпляра документа
 * 
 * <p>Java class for ATDSecondCopyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDSecondCopyDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDSecondCopyRecipientDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDSecondCopySenderDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDSecondCopyDetailsType", propOrder = {
    "atdSecondCopyRecipientDetails",
    "atdSecondCopySenderDetails"
})
public class ATDSecondCopyDetailsType {

    @XmlElement(name = "ATDSecondCopyRecipientDetails")
    protected ATDSecondCopyRecipientDetailsType atdSecondCopyRecipientDetails;
    @XmlElement(name = "ATDSecondCopySenderDetails")
    protected ATDSecondCopySenderDetailsType atdSecondCopySenderDetails;

    /**
     * Gets the value of the atdSecondCopyRecipientDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDSecondCopyRecipientDetailsType }
     *     
     */
    public ATDSecondCopyRecipientDetailsType getATDSecondCopyRecipientDetails() {
        return atdSecondCopyRecipientDetails;
    }

    /**
     * Sets the value of the atdSecondCopyRecipientDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDSecondCopyRecipientDetailsType }
     *     
     */
    public void setATDSecondCopyRecipientDetails(ATDSecondCopyRecipientDetailsType value) {
        this.atdSecondCopyRecipientDetails = value;
    }

    /**
     * Gets the value of the atdSecondCopySenderDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDSecondCopySenderDetailsType }
     *     
     */
    public ATDSecondCopySenderDetailsType getATDSecondCopySenderDetails() {
        return atdSecondCopySenderDetails;
    }

    /**
     * Sets the value of the atdSecondCopySenderDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDSecondCopySenderDetailsType }
     *     
     */
    public void setATDSecondCopySenderDetails(ATDSecondCopySenderDetailsType value) {
        this.atdSecondCopySenderDetails = value;
    }

}
