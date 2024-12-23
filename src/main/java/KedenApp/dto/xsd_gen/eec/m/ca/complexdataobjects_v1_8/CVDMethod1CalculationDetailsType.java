
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие информацию о расчете таможенной стоимости по методу 1 или методу 6 на основе метода 1
 * 
 * <p>Java class for CVDMethod1CalculationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVDMethod1CalculationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}Method1BasisCalculationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}Method1AddCostsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}Method1DeductionDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVDMethod1CalculationDetailsType", propOrder = {
    "method1BasisCalculationDetails",
    "method1AddCostsDetails",
    "method1DeductionDetails"
})
public class CVDMethod1CalculationDetailsType {

    @XmlElement(name = "Method1BasisCalculationDetails", required = true)
    protected Method1BasisCalculationDetailsType method1BasisCalculationDetails;
    @XmlElement(name = "Method1AddCostsDetails")
    protected Method1AddSumDetailsType method1AddCostsDetails;
    @XmlElement(name = "Method1DeductionDetails")
    protected Method1DeductionDetailsType method1DeductionDetails;

    /**
     * Gets the value of the method1BasisCalculationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Method1BasisCalculationDetailsType }
     *     
     */
    public Method1BasisCalculationDetailsType getMethod1BasisCalculationDetails() {
        return method1BasisCalculationDetails;
    }

    /**
     * Sets the value of the method1BasisCalculationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Method1BasisCalculationDetailsType }
     *     
     */
    public void setMethod1BasisCalculationDetails(Method1BasisCalculationDetailsType value) {
        this.method1BasisCalculationDetails = value;
    }

    /**
     * Gets the value of the method1AddCostsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Method1AddSumDetailsType }
     *     
     */
    public Method1AddSumDetailsType getMethod1AddCostsDetails() {
        return method1AddCostsDetails;
    }

    /**
     * Sets the value of the method1AddCostsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Method1AddSumDetailsType }
     *     
     */
    public void setMethod1AddCostsDetails(Method1AddSumDetailsType value) {
        this.method1AddCostsDetails = value;
    }

    /**
     * Gets the value of the method1DeductionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Method1DeductionDetailsType }
     *     
     */
    public Method1DeductionDetailsType getMethod1DeductionDetails() {
        return method1DeductionDetails;
    }

    /**
     * Sets the value of the method1DeductionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Method1DeductionDetailsType }
     *     
     */
    public void setMethod1DeductionDetails(Method1DeductionDetailsType value) {
        this.method1DeductionDetails = value;
    }

}
