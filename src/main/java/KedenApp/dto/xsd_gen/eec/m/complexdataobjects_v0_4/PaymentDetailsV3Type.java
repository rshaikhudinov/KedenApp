
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.AccountingAmountType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию о совершенном или планируемом платеже
 * 
 * <p>Java class for PaymentDetailsV3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsV3Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PaymentKindName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PaymentBudgetCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PaymentPurposeText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PaymentAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}PayeeDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ReasonDocDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ProofDocDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsV3Type", propOrder = {
    "eventDateTime",
    "paymentKindName",
    "paymentBudgetCode",
    "paymentPurposeText",
    "paymentAmount",
    "payeeDetails",
    "reasonDocDetails",
    "proofDocDetails"
})
public class PaymentDetailsV3Type {

    @XmlElement(name = "EventDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;
    @XmlElement(name = "PaymentKindName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentKindName;
    @XmlElement(name = "PaymentBudgetCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentBudgetCode;
    @XmlElement(name = "PaymentPurposeText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String paymentPurposeText;
    @XmlElement(name = "PaymentAmount", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected AccountingAmountType paymentAmount;
    @XmlElement(name = "PayeeDetails")
    protected PayeeDetailsType payeeDetails;
    @XmlElement(name = "ReasonDocDetails")
    protected DocContentDetailsType reasonDocDetails;
    @XmlElement(name = "ProofDocDetails")
    protected DocContentDetailsType proofDocDetails;

    /**
     * Дата и время перечисления денежной суммы плательщиком получателю платежа
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Sets the value of the eventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDateTime(XMLGregorianCalendar value) {
        this.eventDateTime = value;
    }

    /**
     * Gets the value of the paymentKindName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentKindName() {
        return paymentKindName;
    }

    /**
     * Sets the value of the paymentKindName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentKindName(String value) {
        this.paymentKindName = value;
    }

    /**
     * Gets the value of the paymentBudgetCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentBudgetCode() {
        return paymentBudgetCode;
    }

    /**
     * Sets the value of the paymentBudgetCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentBudgetCode(String value) {
        this.paymentBudgetCode = value;
    }

    /**
     * Gets the value of the paymentPurposeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPurposeText() {
        return paymentPurposeText;
    }

    /**
     * Sets the value of the paymentPurposeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPurposeText(String value) {
        this.paymentPurposeText = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingAmountType }
     *     
     */
    public AccountingAmountType getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingAmountType }
     *     
     */
    public void setPaymentAmount(AccountingAmountType value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the payeeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PayeeDetailsType }
     *     
     */
    public PayeeDetailsType getPayeeDetails() {
        return payeeDetails;
    }

    /**
     * Sets the value of the payeeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayeeDetailsType }
     *     
     */
    public void setPayeeDetails(PayeeDetailsType value) {
        this.payeeDetails = value;
    }

    /**
     * Сведения о документе, который является основанием для совершения платежа
     * 
     * @return
     *     possible object is
     *     {@link DocContentDetailsType }
     *     
     */
    public DocContentDetailsType getReasonDocDetails() {
        return reasonDocDetails;
    }

    /**
     * Sets the value of the reasonDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocContentDetailsType }
     *     
     */
    public void setReasonDocDetails(DocContentDetailsType value) {
        this.reasonDocDetails = value;
    }

    /**
     * Сведения о документе, который подтверждает совершение платежа
     * 
     * @return
     *     possible object is
     *     {@link DocContentDetailsType }
     *     
     */
    public DocContentDetailsType getProofDocDetails() {
        return proofDocDetails;
    }

    /**
     * Sets the value of the proofDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocContentDetailsType }
     *     
     */
    public void setProofDocDetails(DocContentDetailsType value) {
        this.proofDocDetails = value;
    }

}
