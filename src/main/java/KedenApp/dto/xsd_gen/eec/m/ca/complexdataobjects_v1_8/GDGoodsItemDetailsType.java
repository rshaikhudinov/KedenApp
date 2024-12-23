
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.ExchangeRateType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.ValuationMethodCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о товаре в корректировке декларации на товары
 * 
 * <p>Java class for GDGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADTGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PageOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GDCConsignmentItemOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsClassificationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CIMSignCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsProhibitionFreeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ProhibitionCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}IPOCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsTraceabilityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsFeatureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CommodityAddCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LicenseGoodsKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AddGoodsMeasureDetails" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalGrossMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalNetMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsItemGroupDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTAutomobileDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}IPObjectRegistryIdDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CargoPackagePalletDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CleanNetMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ContainerListDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ExciseStampDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTIdentificationMeansDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsTraceabilityMeasureDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}WoodCodeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PeriodDateDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PipelineGoodsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ElectricPowerTransferDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}InvestmentGoodsIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DestinationCountryDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}WarehousingGoodsItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsItemProcessingDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ForeignTradeContractDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DeliveryTermsDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OriginCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PrefOriginCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PreferenceDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsProcedureDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValuePreviousAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}StatisticValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalStatisticValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ValuationMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}QuotaDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PrecedingDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PresentedDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPaymentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsControlMeasureDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GDCChangeDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDGoodsItemDetailsType", propOrder = {
    "pageOrdinal",
    "gdcConsignmentItemOrdinal",
    "goodsClassificationCode",
    "cimSignCode",
    "goodsProhibitionFreeCode",
    "prohibitionCode",
    "ipoCode",
    "goodsTraceabilityCode",
    "goodsFeatureCode",
    "commodityAddCode",
    "licenseGoodsKindCode",
    "addGoodsMeasureDetails",
    "totalGrossMassMeasure",
    "totalNetMassMeasure",
    "goodsItemGroupDetails",
    "dtAutomobileDetails",
    "ipObjectRegistryIdDetails",
    "cargoPackagePalletDetails",
    "cleanNetMassMeasure",
    "containerListDetails",
    "exciseStampDetails",
    "dtIdentificationMeansDetails",
    "goodsTraceabilityMeasureDetails",
    "woodCodeDetails",
    "periodDateDetails",
    "pipelineGoodsDetails",
    "electricPowerTransferDetails",
    "investmentGoodsIdDetails",
    "destinationCountryDetails",
    "warehousingGoodsItemDetails",
    "goodsItemProcessingDetails",
    "foreignTradeContractDetails",
    "deliveryTermsDetails",
    "originCountryDetails",
    "prefOriginCountryDetails",
    "preferenceDetails",
    "customsProcedureDetails",
    "caValueAmount",
    "exchangeRate",
    "customsValueAmount",
    "customsValuePreviousAmount",
    "statisticValueAmount",
    "totalStatisticValueAmount",
    "valuationMethodCode",
    "quotaDetails",
    "precedingDocDetails",
    "presentedDocDetails",
    "customsPaymentDetails",
    "goodsControlMeasureDetails",
    "gdcChangeDetails"
})
public class GDGoodsItemDetailsType
    extends CADTGoodsBaseDetailsType
{

    @XmlElement(name = "PageOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pageOrdinal;
    @XmlElement(name = "GDCConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger gdcConsignmentItemOrdinal;
    @XmlElement(name = "GoodsClassificationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String goodsClassificationCode;
    @XmlElement(name = "CIMSignCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cimSignCode;
    @XmlElement(name = "GoodsProhibitionFreeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String goodsProhibitionFreeCode;
    @XmlElement(name = "ProhibitionCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> prohibitionCode;
    @XmlElement(name = "IPOCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ipoCode;
    @XmlElement(name = "GoodsTraceabilityCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String goodsTraceabilityCode;
    @XmlElement(name = "GoodsFeatureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String goodsFeatureCode;
    @XmlElement(name = "CommodityAddCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commodityAddCode;
    @XmlElement(name = "LicenseGoodsKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String licenseGoodsKindCode;
    @XmlElement(name = "AddGoodsMeasureDetails")
    protected List<GoodsMeasureDetailsType> addGoodsMeasureDetails;
    @XmlElement(name = "TotalGrossMassMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType totalGrossMassMeasure;
    @XmlElement(name = "TotalNetMassMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType totalNetMassMeasure;
    @XmlElement(name = "GoodsItemGroupDetails")
    protected List<GoodsItemGroupDetailsType> goodsItemGroupDetails;
    @XmlElement(name = "DTAutomobileDetails")
    protected List<DTAutomobileDetailsType> dtAutomobileDetails;
    @XmlElement(name = "IPObjectRegistryIdDetails")
    protected List<IPObjectRegistryIdDetailsType> ipObjectRegistryIdDetails;
    @XmlElement(name = "CargoPackagePalletDetails")
    protected CargoPackagePalletDetailsType cargoPackagePalletDetails;
    @XmlElement(name = "CleanNetMassMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType cleanNetMassMeasure;
    @XmlElement(name = "ContainerListDetails")
    protected List<ContainerListDetailsType> containerListDetails;
    @XmlElement(name = "ExciseStampDetails")
    protected List<ExciseStampDetailsType> exciseStampDetails;
    @XmlElement(name = "DTIdentificationMeansDetails")
    protected DTIdentificationMeansDetailsType dtIdentificationMeansDetails;
    @XmlElement(name = "GoodsTraceabilityMeasureDetails")
    protected GoodsMeasureDetailsType goodsTraceabilityMeasureDetails;
    @XmlElement(name = "WoodCodeDetails")
    protected List<WoodCodeDetailsType> woodCodeDetails;
    @XmlElement(name = "PeriodDateDetails")
    protected PeriodDateDetailsType periodDateDetails;
    @XmlElement(name = "PipelineGoodsDetails")
    protected PipelineDetailsType pipelineGoodsDetails;
    @XmlElement(name = "ElectricPowerTransferDetails")
    protected ElectricPowerTransferDetailsType electricPowerTransferDetails;
    @XmlElement(name = "InvestmentGoodsIdDetails")
    protected InvestmentGoodsIdDetailsType investmentGoodsIdDetails;
    @XmlElement(name = "DestinationCountryDetails")
    protected List<CACountryDetailsType> destinationCountryDetails;
    @XmlElement(name = "WarehousingGoodsItemDetails")
    protected List<WarehousingGoodsItemDetailsType> warehousingGoodsItemDetails;
    @XmlElement(name = "GoodsItemProcessingDetails")
    protected ProcessingDetailsType goodsItemProcessingDetails;
    @XmlElement(name = "ForeignTradeContractDetails")
    protected List<ForeignTradeContractDetailsType> foreignTradeContractDetails;
    @XmlElement(name = "DeliveryTermsDetails")
    protected List<DeliveryTermsDetailsType> deliveryTermsDetails;
    @XmlElement(name = "OriginCountryDetails")
    protected CACountryDetailsType originCountryDetails;
    @XmlElement(name = "PrefOriginCountryDetails")
    protected CACountryDetailsType prefOriginCountryDetails;
    @XmlElement(name = "PreferenceDetails")
    protected PreferenceDetailsType preferenceDetails;
    @XmlElement(name = "CustomsProcedureDetails")
    protected CustomsProcedureDetailsType customsProcedureDetails;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType caValueAmount;
    @XmlElement(name = "ExchangeRate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected ExchangeRateType exchangeRate;
    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType customsValueAmount;
    @XmlElement(name = "CustomsValuePreviousAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType customsValuePreviousAmount;
    @XmlElement(name = "StatisticValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType statisticValueAmount;
    @XmlElement(name = "TotalStatisticValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType totalStatisticValueAmount;
    @XmlElement(name = "ValuationMethodCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected ValuationMethodCodeType valuationMethodCode;
    @XmlElement(name = "QuotaDetails")
    protected QuotaDetailsType quotaDetails;
    @XmlElement(name = "PrecedingDocDetails")
    protected List<PrecedingDocDetailsType> precedingDocDetails;
    @XmlElement(name = "PresentedDocDetails")
    protected List<PresentedDocDetailsType> presentedDocDetails;
    @XmlElement(name = "CustomsPaymentDetails")
    protected List<GoodsItemPaymentDetailsType> customsPaymentDetails;
    @XmlElement(name = "GoodsControlMeasureDetails")
    protected GoodsMeasureDetailsType goodsControlMeasureDetails;
    @XmlElement(name = "GDCChangeDetails")
    protected GDCChangeDetailsType gdcChangeDetails;

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
     * Gets the value of the gdcConsignmentItemOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGDCConsignmentItemOrdinal() {
        return gdcConsignmentItemOrdinal;
    }

    /**
     * Sets the value of the gdcConsignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGDCConsignmentItemOrdinal(BigInteger value) {
        this.gdcConsignmentItemOrdinal = value;
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
     * Gets the value of the cimSignCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIMSignCode() {
        return cimSignCode;
    }

    /**
     * Sets the value of the cimSignCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIMSignCode(String value) {
        this.cimSignCode = value;
    }

    /**
     * Gets the value of the goodsProhibitionFreeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsProhibitionFreeCode() {
        return goodsProhibitionFreeCode;
    }

    /**
     * Sets the value of the goodsProhibitionFreeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsProhibitionFreeCode(String value) {
        this.goodsProhibitionFreeCode = value;
    }

    /**
     * Gets the value of the prohibitionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the prohibitionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProhibitionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProhibitionCode() {
        if (prohibitionCode == null) {
            prohibitionCode = new ArrayList<String>();
        }
        return this.prohibitionCode;
    }

    /**
     * кодовое обозначение наличия (или отсутствия) объектов (признаков объектов) интеллектуальной собственности
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPOCode() {
        return ipoCode;
    }

    /**
     * Sets the value of the ipoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPOCode(String value) {
        this.ipoCode = value;
    }

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
     * Gets the value of the commodityAddCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityAddCode() {
        return commodityAddCode;
    }

    /**
     * Sets the value of the commodityAddCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityAddCode(String value) {
        this.commodityAddCode = value;
    }

    /**
     * Gets the value of the licenseGoodsKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseGoodsKindCode() {
        return licenseGoodsKindCode;
    }

    /**
     * Sets the value of the licenseGoodsKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseGoodsKindCode(String value) {
        this.licenseGoodsKindCode = value;
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
     * Общая масса брутто товара, перемещаемого через таможенную границу Евразийского экономического союза в несобранном или разобранном виде, в том числе некомплектном или незавершенном виде
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getTotalGrossMassMeasure() {
        return totalGrossMassMeasure;
    }

    /**
     * Sets the value of the totalGrossMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setTotalGrossMassMeasure(UnifiedPhysicalMeasureType value) {
        this.totalGrossMassMeasure = value;
    }

    /**
     * Общая масса нетто товара, перемещаемого через таможенную границу Евразийского экономического союза в несобранном или разобранном виде, в том числе некомплектном или незавершенном виде
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getTotalNetMassMeasure() {
        return totalNetMassMeasure;
    }

    /**
     * Sets the value of the totalNetMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setTotalNetMassMeasure(UnifiedPhysicalMeasureType value) {
        this.totalNetMassMeasure = value;
    }

    /**
     * сведения о группе товаров одного наименования с отличающимися от других групп характеристиками Gets the value of the goodsItemGroupDetails property.
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
     * Gets the value of the cleanNetMassMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getCleanNetMassMeasure() {
        return cleanNetMassMeasure;
    }

    /**
     * Sets the value of the cleanNetMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setCleanNetMassMeasure(UnifiedPhysicalMeasureType value) {
        this.cleanNetMassMeasure = value;
    }

    /**
     * Gets the value of the containerListDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the containerListDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerListDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerListDetailsType }
     * 
     * 
     */
    public List<ContainerListDetailsType> getContainerListDetails() {
        if (containerListDetails == null) {
            containerListDetails = new ArrayList<ContainerListDetailsType>();
        }
        return this.containerListDetails;
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
     * Gets the value of the dtIdentificationMeansDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DTIdentificationMeansDetailsType }
     *     
     */
    public DTIdentificationMeansDetailsType getDTIdentificationMeansDetails() {
        return dtIdentificationMeansDetails;
    }

    /**
     * Sets the value of the dtIdentificationMeansDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTIdentificationMeansDetailsType }
     *     
     */
    public void setDTIdentificationMeansDetails(DTIdentificationMeansDetailsType value) {
        this.dtIdentificationMeansDetails = value;
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
     * Gets the value of the woodCodeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the woodCodeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWoodCodeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WoodCodeDetailsType }
     * 
     * 
     */
    public List<WoodCodeDetailsType> getWoodCodeDetails() {
        if (woodCodeDetails == null) {
            woodCodeDetails = new ArrayList<WoodCodeDetailsType>();
        }
        return this.woodCodeDetails;
    }

    /**
     * Период поставки товаров
     * 
     * @return
     *     possible object is
     *     {@link PeriodDateDetailsType }
     *     
     */
    public PeriodDateDetailsType getPeriodDateDetails() {
        return periodDateDetails;
    }

    /**
     * Sets the value of the periodDateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDateDetailsType }
     *     
     */
    public void setPeriodDateDetails(PeriodDateDetailsType value) {
        this.periodDateDetails = value;
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
     * Gets the value of the investmentGoodsIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentGoodsIdDetailsType }
     *     
     */
    public InvestmentGoodsIdDetailsType getInvestmentGoodsIdDetails() {
        return investmentGoodsIdDetails;
    }

    /**
     * Sets the value of the investmentGoodsIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentGoodsIdDetailsType }
     *     
     */
    public void setInvestmentGoodsIdDetails(InvestmentGoodsIdDetailsType value) {
        this.investmentGoodsIdDetails = value;
    }

    /**
     * Сведения о стране назначения при временном периодическом декларировании Gets the value of the destinationCountryDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the destinationCountryDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationCountryDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CACountryDetailsType }
     * 
     * 
     */
    public List<CACountryDetailsType> getDestinationCountryDetails() {
        if (destinationCountryDetails == null) {
            destinationCountryDetails = new ArrayList<CACountryDetailsType>();
        }
        return this.destinationCountryDetails;
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
     * Сведения, указываемые при использовании декларации на товары в качестве документа об условиях переработки товаров
     * 
     * @return
     *     possible object is
     *     {@link ProcessingDetailsType }
     *     
     */
    public ProcessingDetailsType getGoodsItemProcessingDetails() {
        return goodsItemProcessingDetails;
    }

    /**
     * Sets the value of the goodsItemProcessingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingDetailsType }
     *     
     */
    public void setGoodsItemProcessingDetails(ProcessingDetailsType value) {
        this.goodsItemProcessingDetails = value;
    }

    /**
     * Gets the value of the foreignTradeContractDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the foreignTradeContractDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForeignTradeContractDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignTradeContractDetailsType }
     * 
     * 
     */
    public List<ForeignTradeContractDetailsType> getForeignTradeContractDetails() {
        if (foreignTradeContractDetails == null) {
            foreignTradeContractDetails = new ArrayList<ForeignTradeContractDetailsType>();
        }
        return this.foreignTradeContractDetails;
    }

    /**
     * Gets the value of the deliveryTermsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the deliveryTermsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeliveryTermsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeliveryTermsDetailsType }
     * 
     * 
     */
    public List<DeliveryTermsDetailsType> getDeliveryTermsDetails() {
        if (deliveryTermsDetails == null) {
            deliveryTermsDetails = new ArrayList<DeliveryTermsDetailsType>();
        }
        return this.deliveryTermsDetails;
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
     * Gets the value of the prefOriginCountryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryDetailsType }
     *     
     */
    public CACountryDetailsType getPrefOriginCountryDetails() {
        return prefOriginCountryDetails;
    }

    /**
     * Sets the value of the prefOriginCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryDetailsType }
     *     
     */
    public void setPrefOriginCountryDetails(CACountryDetailsType value) {
        this.prefOriginCountryDetails = value;
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
     * Gets the value of the customsProcedureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsProcedureDetailsType }
     *     
     */
    public CustomsProcedureDetailsType getCustomsProcedureDetails() {
        return customsProcedureDetails;
    }

    /**
     * Sets the value of the customsProcedureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsProcedureDetailsType }
     *     
     */
    public void setCustomsProcedureDetails(CustomsProcedureDetailsType value) {
        this.customsProcedureDetails = value;
    }

    /**
     * Стоимость (цена) товара
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
     * Курс валюты стоимости (цены) товара
     * 
     * @return
     *     possible object is
     *     {@link ExchangeRateType }
     *     
     */
    public ExchangeRateType getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeRateType }
     *     
     */
    public void setExchangeRate(ExchangeRateType value) {
        this.exchangeRate = value;
    }

    /**
     * таможенная стоимость декларируемого товара
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
     * Предыдущее значение таможенной стоимости декларируемого товара
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getCustomsValuePreviousAmount() {
        return customsValuePreviousAmount;
    }

    /**
     * Sets the value of the customsValuePreviousAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setCustomsValuePreviousAmount(PaymentAmountWithCurrencyType value) {
        this.customsValuePreviousAmount = value;
    }

    /**
     * Статистическая стоимость декларируемого товара
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getStatisticValueAmount() {
        return statisticValueAmount;
    }

    /**
     * Sets the value of the statisticValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setStatisticValueAmount(PaymentAmountWithCurrencyType value) {
        this.statisticValueAmount = value;
    }

    /**
     * Общая статистическая стоимость товара, перемещаемого через таможенную границу Евразийского экономического союза в несобранном или разобранном виде, в том числе некомплектном или незавершенном виде
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getTotalStatisticValueAmount() {
        return totalStatisticValueAmount;
    }

    /**
     * Sets the value of the totalStatisticValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setTotalStatisticValueAmount(PaymentAmountWithCurrencyType value) {
        this.totalStatisticValueAmount = value;
    }

    /**
     * Gets the value of the valuationMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationMethodCodeType }
     *     
     */
    public ValuationMethodCodeType getValuationMethodCode() {
        return valuationMethodCode;
    }

    /**
     * Sets the value of the valuationMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationMethodCodeType }
     *     
     */
    public void setValuationMethodCode(ValuationMethodCodeType value) {
        this.valuationMethodCode = value;
    }

    /**
     * Gets the value of the quotaDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QuotaDetailsType }
     *     
     */
    public QuotaDetailsType getQuotaDetails() {
        return quotaDetails;
    }

    /**
     * Sets the value of the quotaDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuotaDetailsType }
     *     
     */
    public void setQuotaDetails(QuotaDetailsType value) {
        this.quotaDetails = value;
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
     * Gets the value of the presentedDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the presentedDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentedDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresentedDocDetailsType }
     * 
     * 
     */
    public List<PresentedDocDetailsType> getPresentedDocDetails() {
        if (presentedDocDetails == null) {
            presentedDocDetails = new ArrayList<PresentedDocDetailsType>();
        }
        return this.presentedDocDetails;
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
     * Gets the value of the goodsControlMeasureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public GoodsMeasureDetailsType getGoodsControlMeasureDetails() {
        return goodsControlMeasureDetails;
    }

    /**
     * Sets the value of the goodsControlMeasureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public void setGoodsControlMeasureDetails(GoodsMeasureDetailsType value) {
        this.goodsControlMeasureDetails = value;
    }

    /**
     * Gets the value of the gdcChangeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GDCChangeDetailsType }
     *     
     */
    public GDCChangeDetailsType getGDCChangeDetails() {
        return gdcChangeDetails;
    }

    /**
     * Sets the value of the gdcChangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDCChangeDetailsType }
     *     
     */
    public void setGDCChangeDetails(GDCChangeDetailsType value) {
        this.gdcChangeDetails = value;
    }

}
