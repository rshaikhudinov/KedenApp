
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import java.math.BigDecimal;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.FractionNumber24AmountType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Числовое значение, представляющее количество денежных единиц, дополненное буквенным кодом валюты, указанием на классификатор валют и показателем степени масштабного множителя
 * 
 * <p>Java class for UnifiedAmountWithCurrencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnifiedAmountWithCurrencyType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:BaseDataTypes:v0.4.14&gt;AmountType"&gt;
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
@XmlType(name = "UnifiedAmountWithCurrencyType", propOrder = {
    "value"
})
@XmlSeeAlso({
    FractionNumber24AmountType.class,
    UnifiedAccountingAmountType.class
})
public class UnifiedAmountWithCurrencyType {

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
     * Количество денежных единиц в заданной валюте
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
