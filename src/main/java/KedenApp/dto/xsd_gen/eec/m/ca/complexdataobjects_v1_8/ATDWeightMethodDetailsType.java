
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о способе определения веса
 * 
 * <p>Java class for ATDWeightMethodDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDWeightMethodDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}FactGrossMassMeasure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedNetMassMeasure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDWeightMethodDetailsType", propOrder = {
    "cargoQuantity",
    "factGrossMassMeasure",
    "unifiedNetMassMeasure",
    "descriptionText"
})
public class ATDWeightMethodDetailsType {

    @XmlElement(name = "CargoQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cargoQuantity;
    @XmlElement(name = "FactGrossMassMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<UnifiedPhysicalMeasureType> factGrossMassMeasure;
    @XmlElement(name = "UnifiedNetMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<UnifiedPhysicalMeasureType> unifiedNetMassMeasure;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;

    /**
     * Количество взвешиваемых грузовых мест
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCargoQuantity() {
        return cargoQuantity;
    }

    /**
     * Sets the value of the cargoQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCargoQuantity(BigInteger value) {
        this.cargoQuantity = value;
    }

    /**
     * фактический вес брутто одного грузового места или нескольких грузовых мест при их одновременном взвешивании, при способе определения фактического веса товара путем вычисления среднего веса одного грузового места Gets the value of the factGrossMassMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the factGrossMassMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactGrossMassMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnifiedPhysicalMeasureType }
     * 
     * 
     */
    public List<UnifiedPhysicalMeasureType> getFactGrossMassMeasure() {
        if (factGrossMassMeasure == null) {
            factGrossMassMeasure = new ArrayList<UnifiedPhysicalMeasureType>();
        }
        return this.factGrossMassMeasure;
    }

    /**
     * фактический вес нетто одного грузового места или нескольких грузовых мест при их совместном взвешивании, при способе определения фактического веса товара путем вычисления среднего веса одного грузового места Gets the value of the unifiedNetMassMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the unifiedNetMassMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnifiedNetMassMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnifiedPhysicalMeasureType }
     * 
     * 
     */
    public List<UnifiedPhysicalMeasureType> getUnifiedNetMassMeasure() {
        if (unifiedNetMassMeasure == null) {
            unifiedNetMassMeasure = new ArrayList<UnifiedPhysicalMeasureType>();
        }
        return this.unifiedNetMassMeasure;
    }

    /**
     * Иные сведения о способе определения веса
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

}
