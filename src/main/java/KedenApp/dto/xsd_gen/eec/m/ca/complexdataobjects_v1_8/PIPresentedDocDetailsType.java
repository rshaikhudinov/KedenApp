
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, содержащие сведения о представленных документах при представлении предварительной информации
 * 
 * <p>Java class for PIPresentedDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIPresentedDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADocDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}FormNumberId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RegistrationSeriesId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CommodityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsDescriptionText" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsLabelDescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ManufacturerDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsDisinfectionDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIPresentedDocDetailsType", propOrder = {
    "formNumberId",
    "registrationSeriesId",
    "commodityCode",
    "goodsDescriptionText",
    "goodsLabelDescriptionText",
    "manufacturerDetails",
    "goodsDisinfectionDetails"
})
public class PIPresentedDocDetailsType
    extends CADocDetailsType
{

    @XmlElement(name = "FormNumberId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String formNumberId;
    @XmlElement(name = "RegistrationSeriesId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String registrationSeriesId;
    @XmlElement(name = "CommodityCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commodityCode;
    @XmlElement(name = "GoodsDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> goodsDescriptionText;
    @XmlElement(name = "GoodsLabelDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String goodsLabelDescriptionText;
    @XmlElement(name = "ManufacturerDetails")
    protected CASubjectDetailsV2Type manufacturerDetails;
    @XmlElement(name = "GoodsDisinfectionDetails")
    protected GoodsDisinfectionDetailsType goodsDisinfectionDetails;

    /**
     * типографский номер бланка
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormNumberId() {
        return formNumberId;
    }

    /**
     * Sets the value of the formNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormNumberId(String value) {
        this.formNumberId = value;
    }

    /**
     * Gets the value of the registrationSeriesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationSeriesId() {
        return registrationSeriesId;
    }

    /**
     * Sets the value of the registrationSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationSeriesId(String value) {
        this.registrationSeriesId = value;
    }

    /**
     * Кодовое обозначение товара в соответствии с ТН ВЭД ЕАЭС, указанное в разрешительном документе
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * торговое наименование товара, указанное в документе Gets the value of the goodsDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the goodsDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getGoodsDescriptionText() {
        if (goodsDescriptionText == null) {
            goodsDescriptionText = new ArrayList<String>();
        }
        return this.goodsDescriptionText;
    }

    /**
     * Gets the value of the goodsLabelDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsLabelDescriptionText() {
        return goodsLabelDescriptionText;
    }

    /**
     * Sets the value of the goodsLabelDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsLabelDescriptionText(String value) {
        this.goodsLabelDescriptionText = value;
    }

    /**
     * Сведения о производителе (изготовителе) продукции
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
     * Сведения об обеззараживании
     * 
     * @return
     *     possible object is
     *     {@link GoodsDisinfectionDetailsType }
     *     
     */
    public GoodsDisinfectionDetailsType getGoodsDisinfectionDetails() {
        return goodsDisinfectionDetails;
    }

    /**
     * Sets the value of the goodsDisinfectionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsDisinfectionDetailsType }
     *     
     */
    public void setGoodsDisinfectionDetails(GoodsDisinfectionDetailsType value) {
        this.goodsDisinfectionDetails = value;
    }

}
