
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.OfficerDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о получателе второго экземпляра документа
 * 
 * <p>Java class for ATDSecondCopyRecipientDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDSecondCopyRecipientDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OfficerDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}JobName"/&gt;
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
@XmlType(name = "ATDSecondCopyRecipientDetailsType", propOrder = {
    "officerDetails",
    "jobName",
    "signIndicator",
    "signingDate"
})
public class ATDSecondCopyRecipientDetailsType {

    @XmlElement(name = "OfficerDetails", required = true)
    protected OfficerDetailsType officerDetails;
    @XmlElement(name = "JobName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String jobName;
    @XmlElement(name = "SignIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean signIndicator;
    @XmlElement(name = "SigningDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar signingDate;

    /**
     * Сведения о лице, получившем второй экземпляр документа
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
     * Gets the value of the jobName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobName() {
        return jobName;
    }

    /**
     * Sets the value of the jobName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobName(String value) {
        this.jobName = value;
    }

    /**
     * Признак наличия подписи за получение второго экземпляра
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
