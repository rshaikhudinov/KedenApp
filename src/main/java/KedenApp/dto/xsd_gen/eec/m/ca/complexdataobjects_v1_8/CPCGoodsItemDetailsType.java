
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
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
 * <p>Java class for CPCGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPCGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADTGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PageOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsFeatureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AddGoodsMeasureDetails" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsItemGroupDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTAutomobileDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ExciseStampDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PipelineGoodsDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OriginCountryDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PrecedingDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CPCPresentedDocDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPaymentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPCGoodsItemDetailsType", propOrder = {
    "pageOrdinal",
    "goodsFeatureCode",
    "addGoodsMeasureDetails",
    "goodsItemGroupDetails",
    "dtAutomobileDetails",
    "exciseStampDetails",
    "pipelineGoodsDetails",
    "originCountryDetails",
    "customsValueAmount",
    "precedingDocDetails",
    "cpcPresentedDocDetails",
    "customsPaymentDetails"
})
public class CPCGoodsItemDetailsType
    extends CADTGoodsBaseDetailsType
{

    @XmlElement(name = "PageOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pageOrdinal;
    @XmlElement(name = "GoodsFeatureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String goodsFeatureCode;
    @XmlElement(name = "AddGoodsMeasureDetails")
    protected List<GoodsMeasureDetailsType> addGoodsMeasureDetails;
    @XmlElement(name = "GoodsItemGroupDetails")
    protected List<GoodsItemGroupDetailsType> goodsItemGroupDetails;
    @XmlElement(name = "DTAutomobileDetails")
    protected List<DTAutomobileDetailsType> dtAutomobileDetails;
    @XmlElement(name = "ExciseStampDetails")
    protected List<ExciseStampDetailsType> exciseStampDetails;
    @XmlElement(name = "PipelineGoodsDetails")
    protected List<PipelineDetailsType> pipelineGoodsDetails;
    @XmlElement(name = "OriginCountryDetails", required = true)
    protected CACountryDetailsType originCountryDetails;
    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType customsValueAmount;
    @XmlElement(name = "PrecedingDocDetails")
    protected List<PrecedingDocDetailsType> precedingDocDetails;
    @XmlElement(name = "CPCPresentedDocDetails", required = true)
    protected List<CPCPresentedDocDetailsType> cpcPresentedDocDetails;
    @XmlElement(name = "CustomsPaymentDetails")
    protected List<GoodsItemPaymentDetailsType> customsPaymentDetails;

    /**
     * Порядковый номер листа (дополнительного листа)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageOrdinal() {
        return pageOrdinal;
    }

    /**
     * Sets the value of the pageOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageOrdinal(BigInteger value) {
        this.pageOrdinal = value;
    }

    /**
     * Gets the value of the goodsFeatureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsFeatureCode() {
        return goodsFeatureCode;
    }

    /**
     * Sets the value of the goodsFeatureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsFeatureCode(String value) {
        this.goodsFeatureCode = value;
    }

    /**
     * Gets the value of the addGoodsMeasureDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addGoodsMeasureDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddGoodsMeasureDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsMeasureDetailsType }
     * 
     * 
     */
    public List<GoodsMeasureDetailsType> getAddGoodsMeasureDetails() {
        if (addGoodsMeasureDetails == null) {
            addGoodsMeasureDetails = new ArrayList<GoodsMeasureDetailsType>();
        }
        return this.addGoodsMeasureDetails;
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
     * Gets the value of the dtAutomobileDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtAutomobileDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTAutomobileDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTAutomobileDetailsType }
     * 
     * 
     */
    public List<DTAutomobileDetailsType> getDTAutomobileDetails() {
        if (dtAutomobileDetails == null) {
            dtAutomobileDetails = new ArrayList<DTAutomobileDetailsType>();
        }
        return this.dtAutomobileDetails;
    }

    /**
     * Gets the value of the exciseStampDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the exciseStampDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExciseStampDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExciseStampDetailsType }
     * 
     * 
     */
    public List<ExciseStampDetailsType> getExciseStampDetails() {
        if (exciseStampDetails == null) {
            exciseStampDetails = new ArrayList<ExciseStampDetailsType>();
        }
        return this.exciseStampDetails;
    }

    /**
     * Gets the value of the pipelineGoodsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pipelineGoodsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPipelineGoodsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PipelineDetailsType }
     * 
     * 
     */
    public List<PipelineDetailsType> getPipelineGoodsDetails() {
        if (pipelineGoodsDetails == null) {
            pipelineGoodsDetails = new ArrayList<PipelineDetailsType>();
        }
        return this.pipelineGoodsDetails;
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
     * Таможенная стоимость товара
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getCustomsValueAmount() {
        return customsValueAmount;
    }

    /**
     * Sets the value of the customsValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setCustomsValueAmount(PaymentAmountWithCurrencyType value) {
        this.customsValueAmount = value;
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
     * Gets the value of the cpcPresentedDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cpcPresentedDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCPCPresentedDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CPCPresentedDocDetailsType }
     * 
     * 
     */
    public List<CPCPresentedDocDetailsType> getCPCPresentedDocDetails() {
        if (cpcPresentedDocDetails == null) {
            cpcPresentedDocDetails = new ArrayList<CPCPresentedDocDetailsType>();
        }
        return this.cpcPresentedDocDetails;
    }

    /**
     * Gets the value of the customsPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customsPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsItemPaymentDetailsType }
     * 
     * 
     */
    public List<GoodsItemPaymentDetailsType> getCustomsPaymentDetails() {
        if (customsPaymentDetails == null) {
            customsPaymentDetails = new ArrayList<GoodsItemPaymentDetailsType>();
        }
        return this.customsPaymentDetails;
    }

}
