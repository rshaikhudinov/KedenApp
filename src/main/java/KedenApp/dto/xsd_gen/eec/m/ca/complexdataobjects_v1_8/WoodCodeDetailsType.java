
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
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие кодовое обозначение сведений о лесоматериалах
 * 
 * <p>Java class for WoodCodeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WoodCodeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}NationalCommodityCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VolumeMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}FactVolumeMeasure"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}HumidityMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ItemQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LabelId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}LabelRangeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WoodCodeDetailsType", propOrder = {
    "nationalCommodityCode",
    "volumeMeasure",
    "factVolumeMeasure",
    "humidityMeasure",
    "itemQuantity",
    "labelId",
    "labelRangeDetails"
})
public class WoodCodeDetailsType {

    @XmlElement(name = "NationalCommodityCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nationalCommodityCode;
    @XmlElement(name = "VolumeMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType volumeMeasure;
    @XmlElement(name = "FactVolumeMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected UnifiedPhysicalMeasureType factVolumeMeasure;
    @XmlElement(name = "HumidityMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType humidityMeasure;
    @XmlElement(name = "ItemQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger itemQuantity;
    @XmlElement(name = "LabelId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> labelId;
    @XmlElement(name = "LabelRangeDetails")
    protected List<LabelRangeDetailsType> labelRangeDetails;

    /**
     * кодовое обозначение продукции в соответствии с классификатором государства-члена
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalCommodityCode() {
        return nationalCommodityCode;
    }

    /**
     * Sets the value of the nationalCommodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalCommodityCode(String value) {
        this.nationalCommodityCode = value;
    }

    /**
     * объем товара без учета коры и припусков
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
     * объем товара c учетом коры и припусков
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

    /**
     * Gets the value of the humidityMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getHumidityMeasure() {
        return humidityMeasure;
    }

    /**
     * Sets the value of the humidityMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setHumidityMeasure(UnifiedPhysicalMeasureType value) {
        this.humidityMeasure = value;
    }

    /**
     * количество бирок
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemQuantity() {
        return itemQuantity;
    }

    /**
     * Sets the value of the itemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemQuantity(BigInteger value) {
        this.itemQuantity = value;
    }

    /**
     * номер бирки Gets the value of the labelId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the labelId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLabelId() {
        if (labelId == null) {
            labelId = new ArrayList<String>();
        }
        return this.labelId;
    }

    /**
     * диапазон номеров бирок Gets the value of the labelRangeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the labelRangeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelRangeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LabelRangeDetailsType }
     * 
     * 
     */
    public List<LabelRangeDetailsType> getLabelRangeDetails() {
        if (labelRangeDetails == null) {
            labelRangeDetails = new ArrayList<LabelRangeDetailsType>();
        }
        return this.labelRangeDetails;
    }

}
