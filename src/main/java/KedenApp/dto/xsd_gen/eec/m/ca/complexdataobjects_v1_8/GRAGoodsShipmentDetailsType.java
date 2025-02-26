
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о товарной партии
 * 
 * <p>Java class for GRAGoodsShipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GRAGoodsShipmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTGoodsShipmentBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedGrossMassMeasure"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsignorDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsigneeDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsLocationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GRAGoodsItemDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PaymentGuaranteeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRAGoodsShipmentDetailsType", propOrder = {
    "unifiedGrossMassMeasure",
    "consignorDetails",
    "consigneeDetails",
    "goodsLocationDetails",
    "graGoodsItemDetails",
    "paymentGuaranteeDetails"
})
public class GRAGoodsShipmentDetailsType
    extends DTGoodsShipmentBaseType
{

    @XmlElement(name = "UnifiedGrossMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedPhysicalMeasureType unifiedGrossMassMeasure;
    @XmlElement(name = "ConsignorDetails")
    protected GoodsShipmentSubjectDetailsType consignorDetails;
    @XmlElement(name = "ConsigneeDetails")
    protected GoodsShipmentSubjectDetailsType consigneeDetails;
    @XmlElement(name = "GoodsLocationDetails")
    protected GoodsLocationDetailsType goodsLocationDetails;
    @XmlElement(name = "GRAGoodsItemDetails", required = true)
    protected List<GRAGoodsItemDetailsType> graGoodsItemDetails;
    @XmlElement(name = "PaymentGuaranteeDetails")
    protected List<PaymentGuaranteeDetailsType> paymentGuaranteeDetails;

    /**
     * Общий вес брутто
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getUnifiedGrossMassMeasure() {
        return unifiedGrossMassMeasure;
    }

    /**
     * Sets the value of the unifiedGrossMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setUnifiedGrossMassMeasure(UnifiedPhysicalMeasureType value) {
        this.unifiedGrossMassMeasure = value;
    }

    /**
     * Gets the value of the consignorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public GoodsShipmentSubjectDetailsType getConsignorDetails() {
        return consignorDetails;
    }

    /**
     * Sets the value of the consignorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public void setConsignorDetails(GoodsShipmentSubjectDetailsType value) {
        this.consignorDetails = value;
    }

    /**
     * Gets the value of the consigneeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public GoodsShipmentSubjectDetailsType getConsigneeDetails() {
        return consigneeDetails;
    }

    /**
     * Sets the value of the consigneeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public void setConsigneeDetails(GoodsShipmentSubjectDetailsType value) {
        this.consigneeDetails = value;
    }

    /**
     * Gets the value of the goodsLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsLocationDetailsType }
     *     
     */
    public GoodsLocationDetailsType getGoodsLocationDetails() {
        return goodsLocationDetails;
    }

    /**
     * Sets the value of the goodsLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsLocationDetailsType }
     *     
     */
    public void setGoodsLocationDetails(GoodsLocationDetailsType value) {
        this.goodsLocationDetails = value;
    }

    /**
     * Gets the value of the graGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the graGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGRAGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GRAGoodsItemDetailsType }
     * 
     * 
     */
    public List<GRAGoodsItemDetailsType> getGRAGoodsItemDetails() {
        if (graGoodsItemDetails == null) {
            graGoodsItemDetails = new ArrayList<GRAGoodsItemDetailsType>();
        }
        return this.graGoodsItemDetails;
    }

    /**
     * Gets the value of the paymentGuaranteeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the paymentGuaranteeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentGuaranteeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentGuaranteeDetailsType }
     * 
     * 
     */
    public List<PaymentGuaranteeDetailsType> getPaymentGuaranteeDetails() {
        if (paymentGuaranteeDetails == null) {
            paymentGuaranteeDetails = new ArrayList<PaymentGuaranteeDetailsType>();
        }
        return this.paymentGuaranteeDetails;
    }

}
