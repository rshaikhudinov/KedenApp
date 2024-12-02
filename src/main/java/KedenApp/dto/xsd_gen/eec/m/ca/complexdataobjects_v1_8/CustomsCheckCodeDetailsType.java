
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о коде проверки таможенных, иных документов и (или) сведений
 * 
 * <p>Java class for CustomsCheckCodeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsCheckCodeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WeightCheckIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OriginalCheckIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CommodityCheckIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueCheckIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DutyTaxFeeCheckIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}FactPaymentCheckIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsCheckCodeDetailsType", propOrder = {
    "weightCheckIndicator",
    "originalCheckIndicator",
    "commodityCheckIndicator",
    "customsValueCheckIndicator",
    "dutyTaxFeeCheckIndicator",
    "factPaymentCheckIndicator"
})
public class CustomsCheckCodeDetailsType {

    @XmlElement(name = "WeightCheckIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean weightCheckIndicator;
    @XmlElement(name = "OriginalCheckIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean originalCheckIndicator;
    @XmlElement(name = "CommodityCheckIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean commodityCheckIndicator;
    @XmlElement(name = "CustomsValueCheckIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean customsValueCheckIndicator;
    @XmlElement(name = "DutyTaxFeeCheckIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean dutyTaxFeeCheckIndicator;
    @XmlElement(name = "FactPaymentCheckIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean factPaymentCheckIndicator;

    /**
     * Gets the value of the weightCheckIndicator property.
     * 
     */
    public Boolean isWeightCheckIndicator() {
        return weightCheckIndicator;
    }

    /**
     * Sets the value of the weightCheckIndicator property.
     * 
     */
    public void setWeightCheckIndicator(Boolean value) {
        this.weightCheckIndicator = value;
    }

    /**
     * Gets the value of the originalCheckIndicator property.
     * 
     */
    public Boolean isOriginalCheckIndicator() {
        return originalCheckIndicator;
    }

    /**
     * Sets the value of the originalCheckIndicator property.
     * 
     */
    public void setOriginalCheckIndicator(Boolean value) {
        this.originalCheckIndicator = value;
    }

    /**
     * Gets the value of the commodityCheckIndicator property.
     * 
     */
    public Boolean isCommodityCheckIndicator() {
        return commodityCheckIndicator;
    }

    /**
     * Sets the value of the commodityCheckIndicator property.
     * 
     */
    public void setCommodityCheckIndicator(Boolean value) {
        this.commodityCheckIndicator = value;
    }

    /**
     * Gets the value of the customsValueCheckIndicator property.
     * 
     */
    public Boolean isCustomsValueCheckIndicator() {
        return customsValueCheckIndicator;
    }

    /**
     * Sets the value of the customsValueCheckIndicator property.
     * 
     */
    public void setCustomsValueCheckIndicator(Boolean value) {
        this.customsValueCheckIndicator = value;
    }

    /**
     * Gets the value of the dutyTaxFeeCheckIndicator property.
     * 
     */
    public Boolean isDutyTaxFeeCheckIndicator() {
        return dutyTaxFeeCheckIndicator;
    }

    /**
     * Sets the value of the dutyTaxFeeCheckIndicator property.
     * 
     */
    public void setDutyTaxFeeCheckIndicator(Boolean value) {
        this.dutyTaxFeeCheckIndicator = value;
    }

    /**
     * Gets the value of the factPaymentCheckIndicator property.
     * 
     */
    public Boolean isFactPaymentCheckIndicator() {
        return factPaymentCheckIndicator;
    }

    /**
     * Sets the value of the factPaymentCheckIndicator property.
     * 
     */
    public void setFactPaymentCheckIndicator(Boolean value) {
        this.factPaymentCheckIndicator = value;
    }

}
