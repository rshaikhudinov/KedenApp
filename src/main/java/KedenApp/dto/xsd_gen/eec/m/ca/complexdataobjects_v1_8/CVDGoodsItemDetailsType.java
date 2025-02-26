
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.ExchangeRateType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.ValuationMethodCodeType;
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
 * <p>Java class for CVDGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVDGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ConsignmentItemOrdinal"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CDVConsignmentItemOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PageConsignmentItemOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PageOrdinal"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CommodityCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ValuationMethodCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}BaseValuationMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount" maxOccurs="2" minOccurs="2"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExchangeRate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CVDMethod1CalculationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CVDMethod236CalculationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CVDMethod46CalculationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CVDMethod56CalculationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CVDCurrencyExchangeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CVDAdditionalInformationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVDGoodsItemDetailsType", propOrder = {
    "consignmentItemOrdinal",
    "cdvConsignmentItemOrdinal",
    "pageConsignmentItemOrdinal",
    "pageOrdinal",
    "commodityCode",
    "valuationMethodCode",
    "baseValuationMethodCode",
    "customsValueAmount",
    "exchangeRate",
    "cvdMethod1CalculationDetails",
    "cvdMethod236CalculationDetails",
    "cvdMethod46CalculationDetails",
    "cvdMethod56CalculationDetails",
    "customsValueDate",
    "cvdCurrencyExchangeDetails",
    "cvdAdditionalInformationDetails"
})
public class CVDGoodsItemDetailsType {

    @XmlElement(name = "ConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger consignmentItemOrdinal;
    @XmlElement(name = "CDVConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cdvConsignmentItemOrdinal;
    @XmlElement(name = "PageConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pageConsignmentItemOrdinal;
    @XmlElement(name = "PageOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pageOrdinal;
    @XmlElement(name = "CommodityCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commodityCode;
    @XmlElement(name = "ValuationMethodCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected ValuationMethodCodeType valuationMethodCode;
    @XmlElement(name = "BaseValuationMethodCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected ValuationMethodCodeType baseValuationMethodCode;
    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected List<PaymentAmountWithCurrencyType> customsValueAmount;
    @XmlElement(name = "ExchangeRate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected ExchangeRateType exchangeRate;
    @XmlElement(name = "CVDMethod1CalculationDetails")
    protected CVDMethod1CalculationDetailsType cvdMethod1CalculationDetails;
    @XmlElement(name = "CVDMethod236CalculationDetails")
    protected CVDMethod236CalculationDetailsType cvdMethod236CalculationDetails;
    @XmlElement(name = "CVDMethod46CalculationDetails")
    protected CVDMethod46CalculationDetailsType cvdMethod46CalculationDetails;
    @XmlElement(name = "CVDMethod56CalculationDetails")
    protected CVDMethod56CalculationDetailsType cvdMethod56CalculationDetails;
    @XmlElement(name = "CustomsValueDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar customsValueDate;
    @XmlElement(name = "CVDCurrencyExchangeDetails")
    protected List<CVDCurrencyExchangeDetailsType> cvdCurrencyExchangeDetails;
    @XmlElement(name = "CVDAdditionalInformationDetails")
    protected List<CVDAdditionalInformationDetailsType> cvdAdditionalInformationDetails;

    /**
     * Порядковый номер товара в декларации на товары
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsignmentItemOrdinal() {
        return consignmentItemOrdinal;
    }

    /**
     * Sets the value of the consignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsignmentItemOrdinal(BigInteger value) {
        this.consignmentItemOrdinal = value;
    }

    /**
     * Gets the value of the cdvConsignmentItemOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCDVConsignmentItemOrdinal() {
        return cdvConsignmentItemOrdinal;
    }

    /**
     * Sets the value of the cdvConsignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCDVConsignmentItemOrdinal(BigInteger value) {
        this.cdvConsignmentItemOrdinal = value;
    }

    /**
     * Gets the value of the pageConsignmentItemOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageConsignmentItemOrdinal() {
        return pageConsignmentItemOrdinal;
    }

    /**
     * Sets the value of the pageConsignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageConsignmentItemOrdinal(BigInteger value) {
        this.pageConsignmentItemOrdinal = value;
    }

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
     * Кодовое обозначение товара в соответствии с ТН ВЭД ЕАЭС
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
     * Gets the value of the baseValuationMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationMethodCodeType }
     *     
     */
    public ValuationMethodCodeType getBaseValuationMethodCode() {
        return baseValuationMethodCode;
    }

    /**
     * Sets the value of the baseValuationMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationMethodCodeType }
     *     
     */
    public void setBaseValuationMethodCode(ValuationMethodCodeType value) {
        this.baseValuationMethodCode = value;
    }

    /**
     * Таможенная стоимость ввозимых товаров Gets the value of the customsValueAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customsValueAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsValueAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentAmountWithCurrencyType }
     * 
     * 
     */
    public List<PaymentAmountWithCurrencyType> getCustomsValueAmount() {
        if (customsValueAmount == null) {
            customsValueAmount = new ArrayList<PaymentAmountWithCurrencyType>();
        }
        return this.customsValueAmount;
    }

    /**
     * Курс пересчета таможенной стоимости
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
     * Gets the value of the cvdMethod1CalculationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CVDMethod1CalculationDetailsType }
     *     
     */
    public CVDMethod1CalculationDetailsType getCVDMethod1CalculationDetails() {
        return cvdMethod1CalculationDetails;
    }

    /**
     * Sets the value of the cvdMethod1CalculationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVDMethod1CalculationDetailsType }
     *     
     */
    public void setCVDMethod1CalculationDetails(CVDMethod1CalculationDetailsType value) {
        this.cvdMethod1CalculationDetails = value;
    }

    /**
     * Gets the value of the cvdMethod236CalculationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CVDMethod236CalculationDetailsType }
     *     
     */
    public CVDMethod236CalculationDetailsType getCVDMethod236CalculationDetails() {
        return cvdMethod236CalculationDetails;
    }

    /**
     * Sets the value of the cvdMethod236CalculationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVDMethod236CalculationDetailsType }
     *     
     */
    public void setCVDMethod236CalculationDetails(CVDMethod236CalculationDetailsType value) {
        this.cvdMethod236CalculationDetails = value;
    }

    /**
     * Gets the value of the cvdMethod46CalculationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CVDMethod46CalculationDetailsType }
     *     
     */
    public CVDMethod46CalculationDetailsType getCVDMethod46CalculationDetails() {
        return cvdMethod46CalculationDetails;
    }

    /**
     * Sets the value of the cvdMethod46CalculationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVDMethod46CalculationDetailsType }
     *     
     */
    public void setCVDMethod46CalculationDetails(CVDMethod46CalculationDetailsType value) {
        this.cvdMethod46CalculationDetails = value;
    }

    /**
     * Gets the value of the cvdMethod56CalculationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CVDMethod56CalculationDetailsType }
     *     
     */
    public CVDMethod56CalculationDetailsType getCVDMethod56CalculationDetails() {
        return cvdMethod56CalculationDetails;
    }

    /**
     * Sets the value of the cvdMethod56CalculationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVDMethod56CalculationDetailsType }
     *     
     */
    public void setCVDMethod56CalculationDetails(CVDMethod56CalculationDetailsType value) {
        this.cvdMethod56CalculationDetails = value;
    }

    /**
     * срок заявления точной величины таможенной стоимости товаров
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomsValueDate() {
        return customsValueDate;
    }

    /**
     * Sets the value of the customsValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomsValueDate(XMLGregorianCalendar value) {
        this.customsValueDate = value;
    }

    /**
     * Gets the value of the cvdCurrencyExchangeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cvdCurrencyExchangeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCVDCurrencyExchangeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CVDCurrencyExchangeDetailsType }
     * 
     * 
     */
    public List<CVDCurrencyExchangeDetailsType> getCVDCurrencyExchangeDetails() {
        if (cvdCurrencyExchangeDetails == null) {
            cvdCurrencyExchangeDetails = new ArrayList<CVDCurrencyExchangeDetailsType>();
        }
        return this.cvdCurrencyExchangeDetails;
    }

    /**
     * Gets the value of the cvdAdditionalInformationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cvdAdditionalInformationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCVDAdditionalInformationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CVDAdditionalInformationDetailsType }
     * 
     * 
     */
    public List<CVDAdditionalInformationDetailsType> getCVDAdditionalInformationDetails() {
        if (cvdAdditionalInformationDetails == null) {
            cvdAdditionalInformationDetails = new ArrayList<CVDAdditionalInformationDetailsType>();
        }
        return this.cvdAdditionalInformationDetails;
    }

}
