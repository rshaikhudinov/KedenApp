
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Кодовое обозначение сведений об изменениях
 * 
 * <p>Java class for ECChangeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECChangeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}StageChangeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReasonChangeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}QuantityChangeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TNVEDChangeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsCostChangeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsPaymentChangeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OtherChangeCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ECChangeDetailsType", propOrder = {
    "stageChangeCode",
    "reasonChangeCode",
    "quantityChangeCode",
    "tnvedChangeCode",
    "customsCostChangeCode",
    "customsPaymentChangeCode",
    "otherChangeCode"
})
public class ECChangeDetailsType {

    @XmlElement(name = "StageChangeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String stageChangeCode;
    @XmlElement(name = "ReasonChangeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reasonChangeCode;
    @XmlElement(name = "QuantityChangeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String quantityChangeCode;
    @XmlElement(name = "TNVEDChangeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tnvedChangeCode;
    @XmlElement(name = "CustomsCostChangeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsCostChangeCode;
    @XmlElement(name = "CustomsPaymentChangeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsPaymentChangeCode;
    @XmlElement(name = "OtherChangeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String otherChangeCode;

    /**
     * Кодовое обозначение этапа внесения изменений (дополнений)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStageChangeCode() {
        return stageChangeCode;
    }

    /**
     * Sets the value of the stageChangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStageChangeCode(String value) {
        this.stageChangeCode = value;
    }

    /**
     * Кодовое обозначение обстоятельств, послуживших основанием для внесения изменений (дополнений)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonChangeCode() {
        return reasonChangeCode;
    }

    /**
     * Sets the value of the reasonChangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonChangeCode(String value) {
        this.reasonChangeCode = value;
    }

    /**
     * Кодовое обозначение изменений (дополнений) сведений о количестве (весе) товаров
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityChangeCode() {
        return quantityChangeCode;
    }

    /**
     * Sets the value of the quantityChangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityChangeCode(String value) {
        this.quantityChangeCode = value;
    }

    /**
     * Кодовое обозначение изменений кода товара в соответствии c ТН ВЭД ЕАЭС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNVEDChangeCode() {
        return tnvedChangeCode;
    }

    /**
     * Sets the value of the tnvedChangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNVEDChangeCode(String value) {
        this.tnvedChangeCode = value;
    }

    /**
     * Кодовое обозначение изменений (дополнений) сведений о стоимости (таможенной стоимости) товаров
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsCostChangeCode() {
        return customsCostChangeCode;
    }

    /**
     * Sets the value of the customsCostChangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsCostChangeCode(String value) {
        this.customsCostChangeCode = value;
    }

    /**
     * Кодовое обозначение изменений (дополнений) сведений об исчислении и (или) влекущих за собой изменение (дополнение) сведений об исчислении таможенных и иных платежей
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsPaymentChangeCode() {
        return customsPaymentChangeCode;
    }

    /**
     * Sets the value of the customsPaymentChangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsPaymentChangeCode(String value) {
        this.customsPaymentChangeCode = value;
    }

    /**
     * Кодовое обозначение изменений (дополнений) иных сведений
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherChangeCode() {
        return otherChangeCode;
    }

    /**
     * Sets the value of the otherChangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherChangeCode(String value) {
        this.otherChangeCode = value;
    }

}
