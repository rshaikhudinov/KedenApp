
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithNCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о перерасчете уплачиваемого таможенного платежа
 * 
 * <p>Java class for GDCExchFactPaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDCExchFactPaymentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FactPaymentBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RefundAmountCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreviousCAPaymentNAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DifferenceCAPaymentNAmount" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDCExchFactPaymentDetailsType", propOrder = {
    "refundAmountCode",
    "previousCAPaymentNAmount",
    "differenceCAPaymentNAmount"
})
public class GDCExchFactPaymentDetailsType
    extends FactPaymentBaseDetailsType
{

    @XmlElement(name = "RefundAmountCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String refundAmountCode;
    @XmlElement(name = "PreviousCAPaymentNAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithNCurrencyType previousCAPaymentNAmount;
    @XmlElement(name = "DifferenceCAPaymentNAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithNCurrencyType differenceCAPaymentNAmount;

    /**
     * Gets the value of the refundAmountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundAmountCode() {
        return refundAmountCode;
    }

    /**
     * Sets the value of the refundAmountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundAmountCode(String value) {
        this.refundAmountCode = value;
    }

    /**
     * Gets the value of the previousCAPaymentNAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public PaymentAmountWithNCurrencyType getPreviousCAPaymentNAmount() {
        return previousCAPaymentNAmount;
    }

    /**
     * Sets the value of the previousCAPaymentNAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public void setPreviousCAPaymentNAmount(PaymentAmountWithNCurrencyType value) {
        this.previousCAPaymentNAmount = value;
    }

    /**
     * Изменение платежа в национальной валюте
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public PaymentAmountWithNCurrencyType getDifferenceCAPaymentNAmount() {
        return differenceCAPaymentNAmount;
    }

    /**
     * Sets the value of the differenceCAPaymentNAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public void setDifferenceCAPaymentNAmount(PaymentAmountWithNCurrencyType value) {
        this.differenceCAPaymentNAmount = value;
    }

}
