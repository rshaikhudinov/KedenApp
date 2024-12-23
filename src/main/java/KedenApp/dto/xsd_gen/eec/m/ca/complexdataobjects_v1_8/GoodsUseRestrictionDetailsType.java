
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения об ограничениях в отношении прав покупателя на пользование и распоряжение товарами
 * 
 * <p>Java class for GoodsUseRestrictionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsUseRestrictionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RestrictionIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ValueConditionIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsUseRestrictionDetailsType", propOrder = {
    "restrictionIndicator",
    "valueConditionIndicator"
})
public class GoodsUseRestrictionDetailsType {

    @XmlElement(name = "RestrictionIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean restrictionIndicator;
    @XmlElement(name = "ValueConditionIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean valueConditionIndicator;

    /**
     * признак наличия ограничений в отношении прав покупателя на пользование и распоряжение ввозимыми товарами
     * 
     */
    public Boolean isRestrictionIndicator() {
        return restrictionIndicator;
    }

    /**
     * Sets the value of the restrictionIndicator property.
     * 
     */
    public void setRestrictionIndicator(Boolean value) {
        this.restrictionIndicator = value;
    }

    /**
     * Признак наличия условий или обстоятельств, оказывающих влияние на цену ввозимых товаров
     * 
     */
    public Boolean isValueConditionIndicator() {
        return valueConditionIndicator;
    }

    /**
     * Sets the value of the valueConditionIndicator property.
     * 
     */
    public void setValueConditionIndicator(Boolean value) {
        this.valueConditionIndicator = value;
    }

}
