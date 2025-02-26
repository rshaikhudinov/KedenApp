
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
 * Компоненты, представляющие сведения о товаре в расчете обеспечения уплаты
 * 
 * <p>Java class for PGCGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PGCGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADTGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PageOrdinal"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DTConsignmentItemOrdinal"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ListItemOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsClassificationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AddGoodsMeasureDetails" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsItemGroupDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTAutomobileDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CargoPackagePalletDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PipelineGoodsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ElectricPowerTransferDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}WarehousingGoodsItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OriginCountryDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PreferenceDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsCheckCodeDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PGCPresentedDocDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPaymentDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PGCGoodsItemGuaranteeDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PGCGoodsItemDetailsType", propOrder = {
    "pageOrdinal",
    "dtConsignmentItemOrdinal",
    "listItemOrdinal",
    "goodsClassificationCode",
    "addGoodsMeasureDetails",
    "goodsItemGroupDetails",
    "dtAutomobileDetails",
    "cargoPackagePalletDetails",
    "pipelineGoodsDetails",
    "electricPowerTransferDetails",
    "warehousingGoodsItemDetails",
    "originCountryDetails",
    "preferenceDetails",
    "customsValueAmount",
    "customsCheckCodeDetails",
    "pgcPresentedDocDetails",
    "customsPaymentDetails",
    "pgcGoodsItemGuaranteeDetails"
})
public class PGCGoodsItemDetailsType
    extends CADTGoodsBaseDetailsType
{

    @XmlElement(name = "PageOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pageOrdinal;
    @XmlElement(name = "DTConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dtConsignmentItemOrdinal;
    @XmlElement(name = "ListItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger listItemOrdinal;
    @XmlElement(name = "GoodsClassificationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String goodsClassificationCode;
    @XmlElement(name = "AddGoodsMeasureDetails")
    protected List<GoodsMeasureDetailsType> addGoodsMeasureDetails;
    @XmlElement(name = "GoodsItemGroupDetails")
    protected List<GoodsItemGroupDetailsType> goodsItemGroupDetails;
    @XmlElement(name = "DTAutomobileDetails")
    protected List<DTAutomobileDetailsType> dtAutomobileDetails;
    @XmlElement(name = "CargoPackagePalletDetails")
    protected CargoPackagePalletDetailsType cargoPackagePalletDetails;
    @XmlElement(name = "PipelineGoodsDetails")
    protected PipelineDetailsType pipelineGoodsDetails;
    @XmlElement(name = "ElectricPowerTransferDetails")
    protected ElectricPowerTransferDetailsType electricPowerTransferDetails;
    @XmlElement(name = "WarehousingGoodsItemDetails")
    protected List<WarehousingGoodsItemDetailsType> warehousingGoodsItemDetails;
    @XmlElement(name = "OriginCountryDetails", required = true)
    protected CACountryDetailsType originCountryDetails;
    @XmlElement(name = "PreferenceDetails", required = true)
    protected PreferenceDetailsType preferenceDetails;
    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType customsValueAmount;
    @XmlElement(name = "CustomsCheckCodeDetails", required = true)
    protected CustomsCheckCodeDetailsType customsCheckCodeDetails;
    @XmlElement(name = "PGCPresentedDocDetails", required = true)
    protected List<SimplePresentedDocDetailsType> pgcPresentedDocDetails;
    @XmlElement(name = "CustomsPaymentDetails", required = true)
    protected List<GoodsItemPaymentDetailsType> customsPaymentDetails;
    @XmlElement(name = "PGCGoodsItemGuaranteeDetails", required = true)
    protected List<PGCGoodsItemGuaranteeDetailsType> pgcGoodsItemGuaranteeDetails;

    /**
     * Порядковый номер листа
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
     * Gets the value of the dtConsignmentItemOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDTConsignmentItemOrdinal() {
        return dtConsignmentItemOrdinal;
    }

    /**
     * Sets the value of the dtConsignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDTConsignmentItemOrdinal(BigInteger value) {
        this.dtConsignmentItemOrdinal = value;
    }

    /**
     * Порядковый номер товара в списке (применяется в Республике Казахстан)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getListItemOrdinal() {
        return listItemOrdinal;
    }

    /**
     * Sets the value of the listItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setListItemOrdinal(BigInteger value) {
        this.listItemOrdinal = value;
    }

    /**
     * Gets the value of the goodsClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsClassificationCode() {
        return goodsClassificationCode;
    }

    /**
     * Sets the value of the goodsClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsClassificationCode(String value) {
        this.goodsClassificationCode = value;
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
     * Gets the value of the cargoPackagePalletDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CargoPackagePalletDetailsType }
     *     
     */
    public CargoPackagePalletDetailsType getCargoPackagePalletDetails() {
        return cargoPackagePalletDetails;
    }

    /**
     * Sets the value of the cargoPackagePalletDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CargoPackagePalletDetailsType }
     *     
     */
    public void setCargoPackagePalletDetails(CargoPackagePalletDetailsType value) {
        this.cargoPackagePalletDetails = value;
    }

    /**
     * Gets the value of the pipelineGoodsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PipelineDetailsType }
     *     
     */
    public PipelineDetailsType getPipelineGoodsDetails() {
        return pipelineGoodsDetails;
    }

    /**
     * Sets the value of the pipelineGoodsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipelineDetailsType }
     *     
     */
    public void setPipelineGoodsDetails(PipelineDetailsType value) {
        this.pipelineGoodsDetails = value;
    }

    /**
     * Gets the value of the electricPowerTransferDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ElectricPowerTransferDetailsType }
     *     
     */
    public ElectricPowerTransferDetailsType getElectricPowerTransferDetails() {
        return electricPowerTransferDetails;
    }

    /**
     * Sets the value of the electricPowerTransferDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectricPowerTransferDetailsType }
     *     
     */
    public void setElectricPowerTransferDetails(ElectricPowerTransferDetailsType value) {
        this.electricPowerTransferDetails = value;
    }

    /**
     * Gets the value of the warehousingGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the warehousingGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarehousingGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarehousingGoodsItemDetailsType }
     * 
     * 
     */
    public List<WarehousingGoodsItemDetailsType> getWarehousingGoodsItemDetails() {
        if (warehousingGoodsItemDetails == null) {
            warehousingGoodsItemDetails = new ArrayList<WarehousingGoodsItemDetailsType>();
        }
        return this.warehousingGoodsItemDetails;
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
     * Gets the value of the preferenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PreferenceDetailsType }
     *     
     */
    public PreferenceDetailsType getPreferenceDetails() {
        return preferenceDetails;
    }

    /**
     * Sets the value of the preferenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferenceDetailsType }
     *     
     */
    public void setPreferenceDetails(PreferenceDetailsType value) {
        this.preferenceDetails = value;
    }

    /**
     * таможенная стоимость товаров (стоимостная основа для расчета)
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
     * Gets the value of the customsCheckCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsCheckCodeDetailsType }
     *     
     */
    public CustomsCheckCodeDetailsType getCustomsCheckCodeDetails() {
        return customsCheckCodeDetails;
    }

    /**
     * Sets the value of the customsCheckCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsCheckCodeDetailsType }
     *     
     */
    public void setCustomsCheckCodeDetails(CustomsCheckCodeDetailsType value) {
        this.customsCheckCodeDetails = value;
    }

    /**
     * Gets the value of the pgcPresentedDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pgcPresentedDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPGCPresentedDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePresentedDocDetailsType }
     * 
     * 
     */
    public List<SimplePresentedDocDetailsType> getPGCPresentedDocDetails() {
        if (pgcPresentedDocDetails == null) {
            pgcPresentedDocDetails = new ArrayList<SimplePresentedDocDetailsType>();
        }
        return this.pgcPresentedDocDetails;
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

    /**
     * Gets the value of the pgcGoodsItemGuaranteeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pgcGoodsItemGuaranteeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPGCGoodsItemGuaranteeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PGCGoodsItemGuaranteeDetailsType }
     * 
     * 
     */
    public List<PGCGoodsItemGuaranteeDetailsType> getPGCGoodsItemGuaranteeDetails() {
        if (pgcGoodsItemGuaranteeDetails == null) {
            pgcGoodsItemGuaranteeDetails = new ArrayList<PGCGoodsItemGuaranteeDetailsType>();
        }
        return this.pgcGoodsItemGuaranteeDetails;
    }

}
