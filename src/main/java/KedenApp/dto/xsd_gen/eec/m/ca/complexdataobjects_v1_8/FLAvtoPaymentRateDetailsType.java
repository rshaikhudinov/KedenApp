
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о ставке таможенной пошлины и размере уплаченных сумм таможенных пошлин, налогов в отношении ввезенных транспортных средств
 * 
 * <p>Java class for FLAvtoPaymentRateDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FLAvtoPaymentRateDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}EffectiveCustomsRateDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FactPaymentDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDeclarationIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsReceiptIdDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FLAvtoPaymentRateDetailsType", propOrder = {
    "effectiveCustomsRateDetails",
    "factPaymentDetails",
    "customsDeclarationIdDetails",
    "customsReceiptIdDetails"
})
public class FLAvtoPaymentRateDetailsType {

    @XmlElement(name = "EffectiveCustomsRateDetails")
    protected DutyTaxFeeRateDetailsType effectiveCustomsRateDetails;
    @XmlElement(name = "FactPaymentDetails", required = true)
    protected FactPaymentDetailsType factPaymentDetails;
    @XmlElement(name = "CustomsDeclarationIdDetails")
    protected CustomsDocumentIdDetailsType customsDeclarationIdDetails;
    @XmlElement(name = "CustomsReceiptIdDetails")
    protected CustomsReceiptIdDetailsType customsReceiptIdDetails;

    /**
     * Gets the value of the effectiveCustomsRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DutyTaxFeeRateDetailsType }
     *     
     */
    public DutyTaxFeeRateDetailsType getEffectiveCustomsRateDetails() {
        return effectiveCustomsRateDetails;
    }

    /**
     * Sets the value of the effectiveCustomsRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DutyTaxFeeRateDetailsType }
     *     
     */
    public void setEffectiveCustomsRateDetails(DutyTaxFeeRateDetailsType value) {
        this.effectiveCustomsRateDetails = value;
    }

    /**
     * Gets the value of the factPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FactPaymentDetailsType }
     *     
     */
    public FactPaymentDetailsType getFactPaymentDetails() {
        return factPaymentDetails;
    }

    /**
     * Sets the value of the factPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactPaymentDetailsType }
     *     
     */
    public void setFactPaymentDetails(FactPaymentDetailsType value) {
        this.factPaymentDetails = value;
    }

    /**
     * сведения о регистрационном номере декларации на товары, в которой исчислялись суммы таможенных пошлин, налогов, уплаченные при ввозе транспортного средства в государство-член, присоединившееся к Союзу
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public CustomsDocumentIdDetailsType getCustomsDeclarationIdDetails() {
        return customsDeclarationIdDetails;
    }

    /**
     * Sets the value of the customsDeclarationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public void setCustomsDeclarationIdDetails(CustomsDocumentIdDetailsType value) {
        this.customsDeclarationIdDetails = value;
    }

    /**
     * сведения о справочном номере таможенного приходного ордера, в котором исчислялись суммы таможенных пошлин, налогов, уплаченные при ввозе транспортного средства в государство-член, присоединившееся к Союзу
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
