
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxModeCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithNCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о размере обеспечения по виду таможенного платежа
 * 
 * <p>Java class for PGCGoodsItemGuaranteeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PGCGoodsItemGuaranteeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsTaxModeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAPaymentNAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreviousCAPaymentNAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DifferenceCAPaymentNAmount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PGCGoodsItemGuaranteeDetailsType", propOrder = {
    "customsTaxModeCode",
    "caPaymentNAmount",
    "previousCAPaymentNAmount",
    "differenceCAPaymentNAmount"
})
public class PGCGoodsItemGuaranteeDetailsType {

    @XmlElement(name = "CustomsTaxModeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsTaxModeCodeType customsTaxModeCode;
    @XmlElement(name = "CAPaymentNAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithNCurrencyType caPaymentNAmount;
    @XmlElement(name = "PreviousCAPaymentNAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithNCurrencyType previousCAPaymentNAmount;
    @XmlElement(name = "DifferenceCAPaymentNAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithNCurrencyType differenceCAPaymentNAmount;

    /**
     * Gets the value of the customsTaxModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTaxModeCodeType }
     *     
     */
    public CustomsTaxModeCodeType getCustomsTaxModeCode() {
        return customsTaxModeCode;
    }

    /**
     * Sets the value of the customsTaxModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTaxModeCodeType }
     *     
     */
    public void setCustomsTaxModeCode(CustomsTaxModeCodeType value) {
        this.customsTaxModeCode = value;
    }

    /**
     * Исчисленная сумма платежа
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public PaymentAmountWithNCurrencyType getCAPaymentNAmount() {
        return caPaymentNAmount;
    }

    /**
     * Sets the value of the caPaymentNAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public void setCAPaymentNAmount(PaymentAmountWithNCurrencyType value) {
        this.caPaymentNAmount = value;
    }

    /**
     * Предыдущая сумма платежа
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
     * Gets the value of the differenceCAPaymentNAmount property.
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
