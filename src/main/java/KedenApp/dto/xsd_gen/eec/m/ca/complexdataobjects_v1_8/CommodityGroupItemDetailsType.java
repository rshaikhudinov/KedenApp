
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.UnifiedOverallDimensionDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие описание дополнительной характеристики товара
 * 
 * <p>Java class for CommodityGroupItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityGroupItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LineId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CommodityDescriptionDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ManufacturerDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedOverallDimensionDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}WoodDescriptionDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsMeasureDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityGroupItemDetailsType", propOrder = {
    "lineId",
    "commodityDescriptionDetails",
    "manufacturerDetails",
    "unifiedOverallDimensionDetails",
    "woodDescriptionDetails",
    "goodsMeasureDetails"
})
public class CommodityGroupItemDetailsType {

    @XmlElement(name = "LineId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lineId;
    @XmlElement(name = "CommodityDescriptionDetails")
    protected CACommodityDescriptionDetailsType commodityDescriptionDetails;
    @XmlElement(name = "ManufacturerDetails")
    protected CASubjectDetailsV2Type manufacturerDetails;
    @XmlElement(name = "UnifiedOverallDimensionDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected UnifiedOverallDimensionDetailsType unifiedOverallDimensionDetails;
    @XmlElement(name = "WoodDescriptionDetails")
    protected WoodDescriptionDetailsType woodDescriptionDetails;
    @XmlElement(name = "GoodsMeasureDetails")
    protected GoodsMeasureDetailsType goodsMeasureDetails;

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Gets the value of the commodityDescriptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CACommodityDescriptionDetailsType }
     *     
     */
    public CACommodityDescriptionDetailsType getCommodityDescriptionDetails() {
        return commodityDescriptionDetails;
    }

    /**
     * Sets the value of the commodityDescriptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACommodityDescriptionDetailsType }
     *     
     */
    public void setCommodityDescriptionDetails(CACommodityDescriptionDetailsType value) {
        this.commodityDescriptionDetails = value;
    }

    /**
     * Gets the value of the manufacturerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CASubjectDetailsV2Type }
     *     
     */
    public CASubjectDetailsV2Type getManufacturerDetails() {
        return manufacturerDetails;
    }

    /**
     * Sets the value of the manufacturerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASubjectDetailsV2Type }
     *     
     */
    public void setManufacturerDetails(CASubjectDetailsV2Type value) {
        this.manufacturerDetails = value;
    }

    /**
     * Gets the value of the unifiedOverallDimensionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedOverallDimensionDetailsType }
     *     
     */
    public UnifiedOverallDimensionDetailsType getUnifiedOverallDimensionDetails() {
        return unifiedOverallDimensionDetails;
    }

    /**
     * Sets the value of the unifiedOverallDimensionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedOverallDimensionDetailsType }
     *     
     */
    public void setUnifiedOverallDimensionDetails(UnifiedOverallDimensionDetailsType value) {
        this.unifiedOverallDimensionDetails = value;
    }

    /**
     * Gets the value of the woodDescriptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WoodDescriptionDetailsType }
     *     
     */
    public WoodDescriptionDetailsType getWoodDescriptionDetails() {
        return woodDescriptionDetails;
    }

    /**
     * Sets the value of the woodDescriptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WoodDescriptionDetailsType }
     *     
     */
    public void setWoodDescriptionDetails(WoodDescriptionDetailsType value) {
        this.woodDescriptionDetails = value;
    }

    /**
     * Gets the value of the goodsMeasureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public GoodsMeasureDetailsType getGoodsMeasureDetails() {
        return goodsMeasureDetails;
    }

    /**
     * Sets the value of the goodsMeasureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public void setGoodsMeasureDetails(GoodsMeasureDetailsType value) {
        this.goodsMeasureDetails = value;
    }

}
