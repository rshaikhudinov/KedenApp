
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.ExchangeRateType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCurrencyCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCurrencyN3CodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о валюте платежа ТПО
 * 
 * <p>Java class for CRCurrencyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRCurrencyDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CurrencyName"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCurrencyCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCurrencyN3Code"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExchangeRate" maxOccurs="2" minOccurs="2"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExchangeRateDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRCurrencyDetailsType", propOrder = {
    "currencyName",
    "unifiedCurrencyCode",
    "unifiedCurrencyN3Code",
    "exchangeRate",
    "exchangeRateDate"
})
public class CRCurrencyDetailsType {

    @XmlElement(name = "CurrencyName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String currencyName;
    @XmlElement(name = "UnifiedCurrencyCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCurrencyCodeType unifiedCurrencyCode;
    @XmlElement(name = "UnifiedCurrencyN3Code", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCurrencyN3CodeType unifiedCurrencyN3Code;
    @XmlElement(name = "ExchangeRate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected List<ExchangeRateType> exchangeRate;
    @XmlElement(name = "ExchangeRateDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exchangeRateDate;

    /**
     * Наименование валюты платежа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyName() {
        return currencyName;
    }

    /**
     * Sets the value of the currencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyName(String value) {
        this.currencyName = value;
    }

    /**
     * Кодовое буквенное обозначение валюты платежа
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCurrencyCodeType }
     *     
     */
    public UnifiedCurrencyCodeType getUnifiedCurrencyCode() {
        return unifiedCurrencyCode;
    }

    /**
     * Sets the value of the unifiedCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCurrencyCodeType }
     *     
     */
    public void setUnifiedCurrencyCode(UnifiedCurrencyCodeType value) {
        this.unifiedCurrencyCode = value;
    }

    /**
     * Кодовое цифровое обозначение валюты платежа
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCurrencyN3CodeType }
     *     
     */
    public UnifiedCurrencyN3CodeType getUnifiedCurrencyN3Code() {
        return unifiedCurrencyN3Code;
    }

    /**
     * Sets the value of the unifiedCurrencyN3Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCurrencyN3CodeType }
     *     
     */
    public void setUnifiedCurrencyN3Code(UnifiedCurrencyN3CodeType value) {
        this.unifiedCurrencyN3Code = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeRateType }
     * 
     * 
     */
    public List<ExchangeRateType> getExchangeRate() {
        if (exchangeRate == null) {
            exchangeRate = new ArrayList<ExchangeRateType>();
        }
        return this.exchangeRate;
    }

    /**
     * Дата применения курса валюты (для Российской Федерации)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExchangeRateDate() {
        return exchangeRateDate;
    }

    /**
     * Sets the value of the exchangeRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExchangeRateDate(XMLGregorianCalendar value) {
        this.exchangeRateDate = value;
    }

}
