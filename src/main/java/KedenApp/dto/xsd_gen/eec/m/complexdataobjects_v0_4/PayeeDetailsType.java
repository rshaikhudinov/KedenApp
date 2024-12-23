
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию о получателе платежа
 * 
 * <p>Java class for PayeeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BusinessEntityName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}BankAccountDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}PaymentSystemAccountDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayeeDetailsType", propOrder = {
    "businessEntityName",
    "bankAccountDetails",
    "paymentSystemAccountDetails"
})
public class PayeeDetailsType {

    @XmlElement(name = "BusinessEntityName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessEntityName;
    @XmlElement(name = "BankAccountDetails")
    protected BankAccountDetailsType bankAccountDetails;
    @XmlElement(name = "PaymentSystemAccountDetails")
    protected PaymentSystemAccountDetailsType paymentSystemAccountDetails;

    /**
     * Наименование получателя платежа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEntityName() {
        return businessEntityName;
    }

    /**
     * Sets the value of the businessEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEntityName(String value) {
        this.businessEntityName = value;
    }

    /**
     * Gets the value of the bankAccountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountDetailsType }
     *     
     */
    public BankAccountDetailsType getBankAccountDetails() {
        return bankAccountDetails;
    }

    /**
     * Sets the value of the bankAccountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountDetailsType }
     *     
     */
    public void setBankAccountDetails(BankAccountDetailsType value) {
        this.bankAccountDetails = value;
    }

    /**
     * Gets the value of the paymentSystemAccountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentSystemAccountDetailsType }
     *     
     */
    public PaymentSystemAccountDetailsType getPaymentSystemAccountDetails() {
        return paymentSystemAccountDetails;
    }

    /**
     * Sets the value of the paymentSystemAccountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentSystemAccountDetailsType }
     *     
     */
    public void setPaymentSystemAccountDetails(PaymentSystemAccountDetailsType value) {
        this.paymentSystemAccountDetails = value;
    }

}
