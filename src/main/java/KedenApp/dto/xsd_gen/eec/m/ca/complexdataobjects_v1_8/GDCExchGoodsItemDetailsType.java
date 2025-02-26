
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxPrefCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о товаре в корректировке декларации на товары
 * 
 * <p>Java class for GDCExchGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDCExchGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADTGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GDCConsignmentItemOrdinal"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ListItemOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsClassificationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CIMSignCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CargoPackagePalletDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ContainerInformationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CleanNetMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AddGoodsMeasureDetails" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CIMDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OriginCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsDutyPrefCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsProcedureDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}StatisticValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueCorrectCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}QuotaDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTExchPresentedDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTExchPrecedingDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTExchGoodsPaymentsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTExchAutoDetails" minOccurs="0"/&gt;
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
@XmlType(name = "GDCExchGoodsItemDetailsType", propOrder = {
    "gdcConsignmentItemOrdinal",
    "listItemOrdinal",
    "goodsClassificationCode",
    "cimSignCode",
    "cargoPackagePalletDetails",
    "containerInformationDetails",
    "cleanNetMassMeasure",
    "addGoodsMeasureDetails",
    "cimDetails",
    "originCountryDetails",
    "customsDutyPrefCode",
    "customsProcedureDetails",
    "caValueAmount",
    "customsValueAmount",
    "statisticValueAmount",
    "customsValueCorrectCode",
    "quotaDetails",
    "dtExchPresentedDocDetails",
    "dtExchPrecedingDocDetails",
    "dtExchGoodsPaymentsDetails",
    "dtExchAutoDetails",
    "gdcChangeDetails"
})
public class GDCExchGoodsItemDetailsType
    extends CADTGoodsBaseDetailsType
{

    @XmlElement(name = "GDCConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger gdcConsignmentItemOrdinal;
    @XmlElement(name = "ListItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger listItemOrdinal;
    @XmlElement(name = "GoodsClassificationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String goodsClassificationCode;
    @XmlElement(name = "CIMSignCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cimSignCode;
    @XmlElement(name = "CargoPackagePalletDetails")
    protected CargoPackagePalletDetailsType cargoPackagePalletDetails;
    @XmlElement(name = "ContainerInformationDetails")
    protected ContainerInformationDetailsType containerInformationDetails;
    @XmlElement(name = "CleanNetMassMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType cleanNetMassMeasure;
    @XmlElement(name = "AddGoodsMeasureDetails")
    protected List<GoodsMeasureDetailsType> addGoodsMeasureDetails;
    @XmlElement(name = "CIMDetails")
    protected CIMDetailsType cimDetails;
    @XmlElement(name = "OriginCountryDetails")
    protected CACountryDetailsType originCountryDetails;
    @XmlElement(name = "CustomsDutyPrefCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CustomsTaxPrefCodeType customsDutyPrefCode;
    @XmlElement(name = "CustomsProcedureDetails")
    protected CustomsProcedureDetailsType customsProcedureDetails;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType caValueAmount;
    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType customsValueAmount;
    @XmlElement(name = "StatisticValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType statisticValueAmount;
    @XmlElement(name = "CustomsValueCorrectCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsValueCorrectCode;
    @XmlElement(name = "QuotaDetails")
    protected QuotaDetailsType quotaDetails;
    @XmlElement(name = "DTExchPresentedDocDetails")
    protected List<DTExchPresentedDocDetailsType> dtExchPresentedDocDetails;
    @XmlElement(name = "DTExchPrecedingDocDetails")
    protected List<PrecedingDocsDetailsType> dtExchPrecedingDocDetails;
    @XmlElement(name = "DTExchGoodsPaymentsDetails")
    protected DTExchGoodsPaymentsDetailsType dtExchGoodsPaymentsDetails;
    @XmlElement(name = "DTExchAutoDetails")
    protected DTExchAutoDetailsType dtExchAutoDetails;
    @XmlElement(name = "GDCChangeDetails")
    protected GDCChangeDetailsType gdcChangeDetails;

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
     * Gets the value of the containerInformationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerInformationDetailsType }
     *     
     */
    public ContainerInformationDetailsType getContainerInformationDetails() {
        return containerInformationDetails;
    }

    /**
     * Sets the value of the containerInformationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerInformationDetailsType }
     *     
     */
    public void setContainerInformationDetails(ContainerInformationDetailsType value) {
        this.containerInformationDetails = value;
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
     * Gets the value of the cimDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CIMDetailsType }
     *     
     */
    public CIMDetailsType getCIMDetails() {
        return cimDetails;
    }

    /**
     * Sets the value of the cimDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIMDetailsType }
     *     
     */
    public void setCIMDetails(CIMDetailsType value) {
        this.cimDetails = value;
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
     * Gets the value of the customsDutyPrefCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTaxPrefCodeType }
     *     
     */
    public CustomsTaxPrefCodeType getCustomsDutyPrefCode() {
        return customsDutyPrefCode;
    }

    /**
     * Sets the value of the customsDutyPrefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTaxPrefCodeType }
     *     
     */
    public void setCustomsDutyPrefCode(CustomsTaxPrefCodeType value) {
        this.customsDutyPrefCode = value;
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
     * Gets the value of the caValueAmount property.
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
     * Gets the value of the customsValueAmount property.
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
     * Gets the value of the statisticValueAmount property.
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
     * Gets the value of the customsValueCorrectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsValueCorrectCode() {
        return customsValueCorrectCode;
    }

    /**
     * Sets the value of the customsValueCorrectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsValueCorrectCode(String value) {
        this.customsValueCorrectCode = value;
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
     * Gets the value of the dtExchPresentedDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtExchPresentedDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTExchPresentedDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTExchPresentedDocDetailsType }
     * 
     * 
     */
    public List<DTExchPresentedDocDetailsType> getDTExchPresentedDocDetails() {
        if (dtExchPresentedDocDetails == null) {
            dtExchPresentedDocDetails = new ArrayList<DTExchPresentedDocDetailsType>();
        }
        return this.dtExchPresentedDocDetails;
    }

    /**
     * Gets the value of the dtExchPrecedingDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtExchPrecedingDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTExchPrecedingDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrecedingDocsDetailsType }
     * 
     * 
     */
    public List<PrecedingDocsDetailsType> getDTExchPrecedingDocDetails() {
        if (dtExchPrecedingDocDetails == null) {
            dtExchPrecedingDocDetails = new ArrayList<PrecedingDocsDetailsType>();
        }
        return this.dtExchPrecedingDocDetails;
    }

    /**
     * Gets the value of the dtExchGoodsPaymentsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DTExchGoodsPaymentsDetailsType }
     *     
     */
    public DTExchGoodsPaymentsDetailsType getDTExchGoodsPaymentsDetails() {
        return dtExchGoodsPaymentsDetails;
    }

    /**
     * Sets the value of the dtExchGoodsPaymentsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTExchGoodsPaymentsDetailsType }
     *     
     */
    public void setDTExchGoodsPaymentsDetails(DTExchGoodsPaymentsDetailsType value) {
        this.dtExchGoodsPaymentsDetails = value;
    }

    /**
     * Gets the value of the dtExchAutoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DTExchAutoDetailsType }
     *     
     */
    public DTExchAutoDetailsType getDTExchAutoDetails() {
        return dtExchAutoDetails;
    }

    /**
     * Sets the value of the dtExchAutoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTExchAutoDetailsType }
     *     
     */
    public void setDTExchAutoDetails(DTExchAutoDetailsType value) {
        this.dtExchAutoDetails = value;
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
