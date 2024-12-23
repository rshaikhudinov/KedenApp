
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.UnifiedOverallDimensionDetailsType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о лесоматериалах
 * 
 * <p>Java class for WoodDescriptionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WoodDescriptionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WoodSortimentName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WoodKindName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProductSortName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AllowanceDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DeviationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DiameterRangeDetails" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}FactVolumeMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WoodDescriptionDetailsType", propOrder = {
    "woodSortimentName",
    "woodKindName",
    "productSortName",
    "allowanceDetails",
    "deviationDetails",
    "diameterRangeDetails",
    "volumeMeasure",
    "factVolumeMeasure"
})
public class WoodDescriptionDetailsType {

    @XmlElement(name = "WoodSortimentName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String woodSortimentName;
    @XmlElement(name = "WoodKindName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String woodKindName;
    @XmlElement(name = "ProductSortName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productSortName;
    @XmlElement(name = "AllowanceDetails")
    protected UnifiedOverallDimensionDetailsType allowanceDetails;
    @XmlElement(name = "DeviationDetails")
    protected UnifiedOverallDimensionDetailsType deviationDetails;
    @XmlElement(name = "DiameterRangeDetails")
    protected List<RangeDetailsType> diameterRangeDetails;
    @XmlElement(name = "VolumeMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType volumeMeasure;
    @XmlElement(name = "FactVolumeMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType factVolumeMeasure;

    /**
     * Gets the value of the woodSortimentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoodSortimentName() {
        return woodSortimentName;
    }

    /**
     * Sets the value of the woodSortimentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoodSortimentName(String value) {
        this.woodSortimentName = value;
    }

    /**
     * Gets the value of the woodKindName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWoodKindName() {
        return woodKindName;
    }

    /**
     * Sets the value of the woodKindName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWoodKindName(String value) {
        this.woodKindName = value;
    }

    /**
     * наименование сорта (группы сортов) продукта (товара)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSortName() {
        return productSortName;
    }

    /**
     * Sets the value of the productSortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSortName(String value) {
        this.productSortName = value;
    }

    /**
     * Gets the value of the allowanceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedOverallDimensionDetailsType }
     *     
     */
    public UnifiedOverallDimensionDetailsType getAllowanceDetails() {
        return allowanceDetails;
    }

    /**
     * Sets the value of the allowanceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedOverallDimensionDetailsType }
     *     
     */
    public void setAllowanceDetails(UnifiedOverallDimensionDetailsType value) {
        this.allowanceDetails = value;
    }

    /**
     * Gets the value of the deviationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedOverallDimensionDetailsType }
     *     
     */
    public UnifiedOverallDimensionDetailsType getDeviationDetails() {
        return deviationDetails;
    }

    /**
     * Sets the value of the deviationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedOverallDimensionDetailsType }
     *     
     */
    public void setDeviationDetails(UnifiedOverallDimensionDetailsType value) {
        this.deviationDetails = value;
    }

    /**
     * Gets the value of the diameterRangeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the diameterRangeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiameterRangeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RangeDetailsType }
     * 
     * 
     */
    public List<RangeDetailsType> getDiameterRangeDetails() {
        if (diameterRangeDetails == null) {
            diameterRangeDetails = new ArrayList<RangeDetailsType>();
        }
        return this.diameterRangeDetails;
    }

    /**
     * Номинальный объем товара (в соответствии с договором (контрактом), без учета коры, припусков и др.)
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getVolumeMeasure() {
        return volumeMeasure;
    }

    /**
     * Sets the value of the volumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setVolumeMeasure(UnifiedPhysicalMeasureType value) {
        this.volumeMeasure = value;
    }

    /**
     * Фактический объем товара (c учетом коры, отклонений, припусков и др.)
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getFactVolumeMeasure() {
        return factVolumeMeasure;
    }

    /**
     * Sets the value of the factVolumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setFactVolumeMeasure(UnifiedPhysicalMeasureType value) {
        this.factVolumeMeasure = value;
    }

}
