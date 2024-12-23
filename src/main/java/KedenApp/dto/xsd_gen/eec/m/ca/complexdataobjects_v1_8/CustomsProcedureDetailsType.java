
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsProcedureCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.GoodsMoveFeatureCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о таможенной процедуре
 * 
 * <p>Java class for CustomsProcedureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsProcedureDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsProcedureCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreviousCustomsProcedureModeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsMoveFeatureCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsProcedureDetailsType", propOrder = {
    "customsProcedureCode",
    "previousCustomsProcedureModeCode",
    "goodsMoveFeatureCode"
})
public class CustomsProcedureDetailsType {

    @XmlElement(name = "CustomsProcedureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsProcedureCodeType customsProcedureCode;
    @XmlElement(name = "PreviousCustomsProcedureModeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsProcedureCodeType previousCustomsProcedureModeCode;
    @XmlElement(name = "GoodsMoveFeatureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected GoodsMoveFeatureCodeType goodsMoveFeatureCode;

    /**
     * Gets the value of the customsProcedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsProcedureCodeType }
     *     
     */
    public CustomsProcedureCodeType getCustomsProcedureCode() {
        return customsProcedureCode;
    }

    /**
     * Sets the value of the customsProcedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsProcedureCodeType }
     *     
     */
    public void setCustomsProcedureCode(CustomsProcedureCodeType value) {
        this.customsProcedureCode = value;
    }

    /**
     * Gets the value of the previousCustomsProcedureModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsProcedureCodeType }
     *     
     */
    public CustomsProcedureCodeType getPreviousCustomsProcedureModeCode() {
        return previousCustomsProcedureModeCode;
    }

    /**
     * Sets the value of the previousCustomsProcedureModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsProcedureCodeType }
     *     
     */
    public void setPreviousCustomsProcedureModeCode(CustomsProcedureCodeType value) {
        this.previousCustomsProcedureModeCode = value;
    }

    /**
     * Gets the value of the goodsMoveFeatureCode property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsMoveFeatureCodeType }
     *     
     */
    public GoodsMoveFeatureCodeType getGoodsMoveFeatureCode() {
        return goodsMoveFeatureCode;
    }

    /**
     * Sets the value of the goodsMoveFeatureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsMoveFeatureCodeType }
     *     
     */
    public void setGoodsMoveFeatureCode(GoodsMoveFeatureCodeType value) {
        this.goodsMoveFeatureCode = value;
    }

}
