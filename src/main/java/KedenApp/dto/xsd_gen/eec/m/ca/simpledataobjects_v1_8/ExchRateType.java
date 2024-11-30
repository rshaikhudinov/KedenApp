
package KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * строка символов, представляющая информацию о курсе валюты
 * 
 * <p>Java class for ExchRateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExchRateType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:BaseDataTypes:v0.4.14&gt;RateType"&gt;
 *       &lt;attribute name="currencyCode" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}CurrencyCodeV3Type" /&gt;
 *       &lt;attribute name="currencyCodeListId" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataIdType" /&gt;
 *       &lt;attribute name="scaleNumber" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}Number2Type" default="0" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExchRateType", propOrder = {
    "value"
})
@XmlSeeAlso({
    ExchangeRateType.class
})
public class ExchRateType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "currencyCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String currencyCode;
    @XmlAttribute(name = "currencyCodeListId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String currencyCodeListId;
    @XmlAttribute(name = "scaleNumber")
    protected BigDecimal scaleNumber;

    /**
     * Числовая величина чего-либо, пропорционально соответствующая определенной величине чего-либо другого
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the currencyCodeListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCodeListId() {
        return currencyCodeListId;
    }

    /**
     * Sets the value of the currencyCodeListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCodeListId(String value) {
        this.currencyCodeListId = value;
    }

    /**
     * Gets the value of the scaleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScaleNumber() {
        if (scaleNumber == null) {
            return new BigDecimal("0");
        } else {
            return scaleNumber;
        }
    }

    /**
     * Sets the value of the scaleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScaleNumber(BigDecimal value) {
        this.scaleNumber = value;
    }

}
