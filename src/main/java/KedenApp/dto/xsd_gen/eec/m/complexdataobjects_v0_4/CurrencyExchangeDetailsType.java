
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCurrencyCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию о курсе валюты
 * 
 * <p>Java class for CurrencyExchangeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyExchangeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}SourceCurrencyCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}SourceCurrencyUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TargetCurrencyCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TargetCurrencyUnitQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}MarketId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CurrencyConversionRate"/&gt;
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
@XmlType(name = "CurrencyExchangeDetailsType", propOrder = {
    "sourceCurrencyCode",
    "sourceCurrencyUnitQuantity",
    "targetCurrencyCode",
    "targetCurrencyUnitQuantity",
    "marketId",
    "currencyConversionRate",
    "eventDateTime"
})
public class CurrencyExchangeDetailsType {

    @XmlElement(name = "SourceCurrencyCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCurrencyCodeType sourceCurrencyCode;
    @XmlElement(name = "SourceCurrencyUnitQuantity", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sourceCurrencyUnitQuantity;
    @XmlElement(name = "TargetCurrencyCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCurrencyCodeType targetCurrencyCode;
    @XmlElement(name = "TargetCurrencyUnitQuantity", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger targetCurrencyUnitQuantity;
    @XmlElement(name = "MarketId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String marketId;
    @XmlElement(name = "CurrencyConversionRate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected BigDecimal currencyConversionRate;
    @XmlElement(name = "EventDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;

    /**
     * Gets the value of the sourceCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCurrencyCodeType }
     *     
     */
    public UnifiedCurrencyCodeType getSourceCurrencyCode() {
        return sourceCurrencyCode;
    }

    /**
     * Sets the value of the sourceCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCurrencyCodeType }
     *     
     */
    public void setSourceCurrencyCode(UnifiedCurrencyCodeType value) {
        this.sourceCurrencyCode = value;
    }

    /**
     * Gets the value of the sourceCurrencyUnitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceCurrencyUnitQuantity() {
        return sourceCurrencyUnitQuantity;
    }

    /**
     * Sets the value of the sourceCurrencyUnitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceCurrencyUnitQuantity(BigInteger value) {
        this.sourceCurrencyUnitQuantity = value;
    }

    /**
     * Gets the value of the targetCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCurrencyCodeType }
     *     
     */
    public UnifiedCurrencyCodeType getTargetCurrencyCode() {
        return targetCurrencyCode;
    }

    /**
     * Sets the value of the targetCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCurrencyCodeType }
     *     
     */
    public void setTargetCurrencyCode(UnifiedCurrencyCodeType value) {
        this.targetCurrencyCode = value;
    }

    /**
     * Gets the value of the targetCurrencyUnitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTargetCurrencyUnitQuantity() {
        return targetCurrencyUnitQuantity;
    }

    /**
     * Sets the value of the targetCurrencyUnitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTargetCurrencyUnitQuantity(BigInteger value) {
        this.targetCurrencyUnitQuantity = value;
    }

    /**
     * Gets the value of the marketId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketId() {
        return marketId;
    }

    /**
     * Sets the value of the marketId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketId(String value) {
        this.marketId = value;
    }

    /**
     * Gets the value of the currencyConversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCurrencyConversionRate() {
        return currencyConversionRate;
    }

    /**
     * Sets the value of the currencyConversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCurrencyConversionRate(BigDecimal value) {
        this.currencyConversionRate = value;
    }

    /**
     * Дата и время, на которые установлен курс валюты
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
