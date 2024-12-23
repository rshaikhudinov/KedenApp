
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Представленный документ (сведения)
 * 
 * <p>Java class for CPCPresentedDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPCPresentedDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SimplePresentedDocDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PaymentDutyTerminationEventCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PaymentDutyTerminationDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPCPresentedDocDetailsType", propOrder = {
    "paymentDutyTerminationEventCode",
    "paymentDutyTerminationDetails"
})
public class CPCPresentedDocDetailsType
    extends SimplePresentedDocDetailsType
{

    @XmlElement(name = "PaymentDutyTerminationEventCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentDutyTerminationEventCode;
    @XmlElement(name = "PaymentDutyTerminationDetails")
    protected PaymentDutyTerminationDetailsType paymentDutyTerminationDetails;

    /**
     * Gets the value of the paymentDutyTerminationEventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDutyTerminationEventCode() {
        return paymentDutyTerminationEventCode;
    }

    /**
     * Sets the value of the paymentDutyTerminationEventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDutyTerminationEventCode(String value) {
        this.paymentDutyTerminationEventCode = value;
    }

    /**
     * Gets the value of the paymentDutyTerminationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDutyTerminationDetailsType }
     *     
     */
    public PaymentDutyTerminationDetailsType getPaymentDutyTerminationDetails() {
        return paymentDutyTerminationDetails;
    }

    /**
     * Sets the value of the paymentDutyTerminationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDutyTerminationDetailsType }
     *     
     */
    public void setPaymentDutyTerminationDetails(PaymentDutyTerminationDetailsType value) {
        this.paymentDutyTerminationDetails = value;
    }

}
