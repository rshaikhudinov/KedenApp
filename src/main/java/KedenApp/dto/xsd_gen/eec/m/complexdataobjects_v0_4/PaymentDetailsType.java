
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
 * Совокупность реквизитов для осуществления платежа либо сведения о совершенном платеже
 * 
 * <p>Java class for PaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}BankingDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PaymentSystemName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PaymentSystemAccountId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PayeeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PaymentKindName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PaymentBudgetCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PaymentPurposeText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PaymentAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PaymentId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetailsType", propOrder = {
    "bankingDetails",
    "paymentSystemName",
    "paymentSystemAccountId",
    "payeeName",
    "paymentKindName",
    "paymentBudgetCode",
    "paymentPurposeText",
    "paymentAmount",
    "paymentId",
    "eventDateTime"
})
public class PaymentDetailsType {

    @XmlElement(name = "BankingDetails")
    protected BankingDetailsType bankingDetails;
    @XmlElement(name = "PaymentSystemName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentSystemName;
    @XmlElement(name = "PaymentSystemAccountId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentSystemAccountId;
    @XmlElement(name = "PayeeName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String payeeName;
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
    @XmlElement(name = "PaymentId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentId;
    @XmlElement(name = "EventDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;

    /**
     * Совокупность банковских реквизитов получателя платежа
     * 
     * @return
     *     possible object is
     *     {@link BankingDetailsType }
     *     
     */
    public BankingDetailsType getBankingDetails() {
        return bankingDetails;
    }

    /**
     * Sets the value of the bankingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankingDetailsType }
     *     
     */
    public void setBankingDetails(BankingDetailsType value) {
        this.bankingDetails = value;
    }

    /**
     * Gets the value of the paymentSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSystemName() {
        return paymentSystemName;
    }

    /**
     * Sets the value of the paymentSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSystemName(String value) {
        this.paymentSystemName = value;
    }

    /**
     * Gets the value of the paymentSystemAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentSystemAccountId() {
        return paymentSystemAccountId;
    }

    /**
     * Sets the value of the paymentSystemAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentSystemAccountId(String value) {
        this.paymentSystemAccountId = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
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
     * Величина денежной суммы, перечисляемой получателю платежа
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
     * Gets the value of the paymentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the value of the paymentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * Дата и время перечисления денежной суммы получателю платежа
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

}
