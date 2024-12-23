
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о товаре
 * 
 * <p>Java class for GRAGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GRAGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADTGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsTraceabilityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsItemGroupDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}IPObjectRegistryIdDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsTraceabilityMeasureDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OriginCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PrecedingDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GRAPresentedDocDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRAGoodsItemDetailsType", propOrder = {
    "goodsTraceabilityCode",
    "goodsItemGroupDetails",
    "ipObjectRegistryIdDetails",
    "goodsTraceabilityMeasureDetails",
    "originCountryDetails",
    "caValueAmount",
    "precedingDocDetails",
    "graPresentedDocDetails"
})
public class GRAGoodsItemDetailsType
    extends CADTGoodsBaseDetailsType
{

    @XmlElement(name = "GoodsTraceabilityCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String goodsTraceabilityCode;
    @XmlElement(name = "GoodsItemGroupDetails")
    protected List<GoodsItemGroupDetailsType> goodsItemGroupDetails;
    @XmlElement(name = "IPObjectRegistryIdDetails")
    protected List<IPObjectRegistryIdDetailsType> ipObjectRegistryIdDetails;
    @XmlElement(name = "GoodsTraceabilityMeasureDetails")
    protected GoodsMeasureDetailsType goodsTraceabilityMeasureDetails;
    @XmlElement(name = "OriginCountryDetails")
    protected CACountryDetailsType originCountryDetails;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType caValueAmount;
    @XmlElement(name = "PrecedingDocDetails")
    protected List<PrecedingDocDetailsType> precedingDocDetails;
    @XmlElement(name = "GRAPresentedDocDetails", required = true)
    protected List<GRAPresentedDocDetailsType> graPresentedDocDetails;

    /**
     * Gets the value of the goodsTraceabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsTraceabilityCode() {
        return goodsTraceabilityCode;
    }

    /**
     * Sets the value of the goodsTraceabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsTraceabilityCode(String value) {
        this.goodsTraceabilityCode = value;
    }

    /**
     * Gets the value of the goodsItemGroupDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the goodsItemGroupDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsItemGroupDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemGroupDetailsType }
     * 
     * 
     */
    public List<GoodsItemGroupDetailsType> getGoodsItemGroupDetails() {
        if (goodsItemGroupDetails == null) {
            goodsItemGroupDetails = new ArrayList<GoodsItemGroupDetailsType>();
        }
        return this.goodsItemGroupDetails;
    }

    /**
     * Gets the value of the ipObjectRegistryIdDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the ipObjectRegistryIdDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPObjectRegistryIdDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPObjectRegistryIdDetailsType }
     * 
     * 
     */
    public List<IPObjectRegistryIdDetailsType> getIPObjectRegistryIdDetails() {
        if (ipObjectRegistryIdDetails == null) {
            ipObjectRegistryIdDetails = new ArrayList<IPObjectRegistryIdDetailsType>();
        }
        return this.ipObjectRegistryIdDetails;
    }

    /**
     * Gets the value of the goodsTraceabilityMeasureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public GoodsMeasureDetailsType getGoodsTraceabilityMeasureDetails() {
        return goodsTraceabilityMeasureDetails;
    }

    /**
     * Sets the value of the goodsTraceabilityMeasureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public void setGoodsTraceabilityMeasureDetails(GoodsMeasureDetailsType value) {
        this.goodsTraceabilityMeasureDetails = value;
    }

    /**
     * Gets the value of the originCountryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryDetailsType }
     *     
     */
    public CACountryDetailsType getOriginCountryDetails() {
        return originCountryDetails;
    }

    /**
     * Sets the value of the originCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryDetailsType }
     *     
     */
    public void setOriginCountryDetails(CACountryDetailsType value) {
        this.originCountryDetails = value;
    }

    /**
     * Стоимость товара
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getCAValueAmount() {
        return caValueAmount;
    }

    /**
     * Sets the value of the caValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setCAValueAmount(PaymentAmountWithCurrencyType value) {
        this.caValueAmount = value;
    }

    /**
     * Gets the value of the precedingDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the precedingDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecedingDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrecedingDocDetailsType }
     * 
     * 
     */
    public List<PrecedingDocDetailsType> getPrecedingDocDetails() {
        if (precedingDocDetails == null) {
            precedingDocDetails = new ArrayList<PrecedingDocDetailsType>();
        }
        return this.precedingDocDetails;
    }

    /**
     * Gets the value of the graPresentedDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the graPresentedDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGRAPresentedDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GRAPresentedDocDetailsType }
     * 
     * 
     */
    public List<GRAPresentedDocDetailsType> getGRAPresentedDocDetails() {
        if (graPresentedDocDetails == null) {
            graPresentedDocDetails = new ArrayList<GRAPresentedDocDetailsType>();
        }
        return this.graPresentedDocDetails;
    }

}
