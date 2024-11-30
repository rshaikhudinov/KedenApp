
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о таможенном платеже ТПО
 * 
 * <p>Java class for CRGoodsItemPaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRGoodsItemPaymentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPaymentBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CRPaymentsKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAPaymentAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreviousCAPaymentAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsReceiptIdDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRGoodsItemPaymentDetailsType", propOrder = {
    "crPaymentsKindCode",
    "caPaymentAmount",
    "previousCAPaymentAmount",
    "customsReceiptIdDetails"
})
public class CRGoodsItemPaymentDetailsType
    extends CustomsPaymentBaseDetailsType
{

    @XmlElement(name = "CRPaymentsKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String crPaymentsKindCode;
    @XmlElement(name = "CAPaymentAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType caPaymentAmount;
    @XmlElement(name = "PreviousCAPaymentAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType previousCAPaymentAmount;
    @XmlElement(name = "CustomsReceiptIdDetails")
    protected CustomsReceiptIdDetailsType customsReceiptIdDetails;

    /**
     * Код типа платежа таможенного приходного ордера (для Российской Федерации)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRPaymentsKindCode() {
        return crPaymentsKindCode;
    }

    /**
     * Sets the value of the crPaymentsKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRPaymentsKindCode(String value) {
        this.crPaymentsKindCode = value;
    }

    /**
     * Исчисленная сумма
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getCAPaymentAmount() {
        return caPaymentAmount;
    }

    /**
     * Sets the value of the caPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setCAPaymentAmount(PaymentAmountWithCurrencyType value) {
        this.caPaymentAmount = value;
    }

    /**
     * Сумма ранее уплаченных платежей (для Российской Федерации)
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getPreviousCAPaymentAmount() {
        return previousCAPaymentAmount;
    }

    /**
     * Sets the value of the previousCAPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setPreviousCAPaymentAmount(PaymentAmountWithCurrencyType value) {
        this.previousCAPaymentAmount = value;
    }

    /**
     * Справочный номер таможенного приходного ордера основного платежа
     * 
     * @return
     *     possible object is
     *     {@link CustomsReceiptIdDetailsType }
     *     
     */
    public CustomsReceiptIdDetailsType getCustomsReceiptIdDetails() {
        return customsReceiptIdDetails;
    }

    /**
     * Sets the value of the customsReceiptIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsReceiptIdDetailsType }
     *     
     */
    public void setCustomsReceiptIdDetails(CustomsReceiptIdDetailsType value) {
        this.customsReceiptIdDetails = value;
    }

}
