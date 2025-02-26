
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransitGuaranteeMeasureCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие информацию из сертификата обеспечения уплаты
 * 
 * <p>Java class for CertificateDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitGuaranteeMeasureCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GuaranteeAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedTransportModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AdditionalInfoText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateDetailsType", propOrder = {
    "transitGuaranteeMeasureCode",
    "guaranteeAmount",
    "unifiedTransportModeCode",
    "additionalInfoText"
})
public class CertificateDetailsType {

    @XmlElement(name = "TransitGuaranteeMeasureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected TransitGuaranteeMeasureCodeType transitGuaranteeMeasureCode;
    @XmlElement(name = "GuaranteeAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType guaranteeAmount;
    @XmlElement(name = "UnifiedTransportModeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type unifiedTransportModeCode;
    @XmlElement(name = "AdditionalInfoText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String additionalInfoText;

    /**
     * Gets the value of the transitGuaranteeMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransitGuaranteeMeasureCodeType }
     *     
     */
    public TransitGuaranteeMeasureCodeType getTransitGuaranteeMeasureCode() {
        return transitGuaranteeMeasureCode;
    }

    /**
     * Sets the value of the transitGuaranteeMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitGuaranteeMeasureCodeType }
     *     
     */
    public void setTransitGuaranteeMeasureCode(TransitGuaranteeMeasureCodeType value) {
        this.transitGuaranteeMeasureCode = value;
    }

    /**
     * Gets the value of the guaranteeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /**
     * Sets the value of the guaranteeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setGuaranteeAmount(PaymentAmountWithCurrencyType value) {
        this.guaranteeAmount = value;
    }

    /**
     * Код вида транспорта при отправлении
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getUnifiedTransportModeCode() {
        return unifiedTransportModeCode;
    }

    /**
     * Sets the value of the unifiedTransportModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setUnifiedTransportModeCode(UnifiedCode20Type value) {
        this.unifiedTransportModeCode = value;
    }

    /**
     * Дополнительная информация
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfoText() {
        return additionalInfoText;
    }

    /**
     * Sets the value of the additionalInfoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfoText(String value) {
        this.additionalInfoText = value;
    }

}
