
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о радиационном фоне товаров
 * 
 * <p>Java class for ATDRadiationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDRadiationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RadiationMeasure"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsToolDetails"/&gt;
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
@XmlType(name = "ATDRadiationDetailsType", propOrder = {
    "radiationMeasure",
    "customsToolDetails",
    "descriptionText"
})
public class ATDRadiationDetailsType {

    @XmlElement(name = "RadiationMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected UnifiedPhysicalMeasureType radiationMeasure;
    @XmlElement(name = "CustomsToolDetails", required = true)
    protected CustomsToolDetailsType customsToolDetails;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;

    /**
     * Gets the value of the radiationMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getRadiationMeasure() {
        return radiationMeasure;
    }

    /**
     * Sets the value of the radiationMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setRadiationMeasure(UnifiedPhysicalMeasureType value) {
        this.radiationMeasure = value;
    }

    /**
     * Сведения о приборе, которым производилось измерение радиационного фона
     * 
     * @return
     *     possible object is
     *     {@link CustomsToolDetailsType }
     *     
     */
    public CustomsToolDetailsType getCustomsToolDetails() {
        return customsToolDetails;
    }

    /**
     * Sets the value of the customsToolDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsToolDetailsType }
     *     
     */
    public void setCustomsToolDetails(CustomsToolDetailsType value) {
        this.customsToolDetails = value;
    }

    /**
     * Иные сведения об уровне радиационного фона
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
