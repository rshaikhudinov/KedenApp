
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о товарной партии в декларации на товары и транзитной декларации
 * 
 * <p>Java class for DeclarationGoodsShipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeclarationGoodsShipmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTGoodsShipmentBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsignorDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsigneeDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FinancialSettlementSubjectDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalCustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OriginCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransactionNatureDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DeclarationConsignmentDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsLocationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DeclarationGoodsItemDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FactPaymentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DefferedPaymentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PaymentGuaranteeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitGuaranteeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationGoodsShipmentDetailsType", propOrder = {
    "consignorDetails",
    "consigneeDetails",
    "financialSettlementSubjectDetails",
    "customsValueAmount",
    "totalCustomsValueAmount",
    "originCountryDetails",
    "transactionNatureDetails",
    "declarationConsignmentDetails",
    "goodsLocationDetails",
    "declarationGoodsItemDetails",
    "factPaymentDetails",
    "defferedPaymentDetails",
    "paymentGuaranteeDetails",
    "transitGuaranteeDetails"
})
public class DeclarationGoodsShipmentDetailsType
    extends DTGoodsShipmentBaseType
{

    @XmlElement(name = "ConsignorDetails")
    protected GoodsShipmentSubjectDetailsType consignorDetails;
    @XmlElement(name = "ConsigneeDetails")
    protected GoodsShipmentSubjectDetailsType consigneeDetails;
    @XmlElement(name = "FinancialSettlementSubjectDetails")
    protected CustomsDocumentSubjectDetailsType financialSettlementSubjectDetails;
    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType customsValueAmount;
    @XmlElement(name = "TotalCustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType totalCustomsValueAmount;
    @XmlElement(name = "OriginCountryDetails")
    protected CACountryDetailsType originCountryDetails;
    @XmlElement(name = "TransactionNatureDetails")
    protected TransactionNatureDetailsType transactionNatureDetails;
    @XmlElement(name = "DeclarationConsignmentDetails")
    protected DeclarationConsignmentDetailsType declarationConsignmentDetails;
    @XmlElement(name = "GoodsLocationDetails")
    protected GoodsLocationDetailsType goodsLocationDetails;
    @XmlElement(name = "DeclarationGoodsItemDetails", required = true)
    protected List<DeclarationGoodsItemDetailsType> declarationGoodsItemDetails;
    @XmlElement(name = "FactPaymentDetails")
    protected List<FactPaymentDetailsType> factPaymentDetails;
    @XmlElement(name = "DefferedPaymentDetails")
    protected List<DefferedPaymentDetailsType> defferedPaymentDetails;
    @XmlElement(name = "PaymentGuaranteeDetails")
    protected List<PaymentGuaranteeDetailsType> paymentGuaranteeDetails;
    @XmlElement(name = "TransitGuaranteeDetails")
    protected List<TransitGuaranteeDetailsType> transitGuaranteeDetails;

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
     * Gets the value of the financialSettlementSubjectDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentSubjectDetailsType }
     *     
     */
    public CustomsDocumentSubjectDetailsType getFinancialSettlementSubjectDetails() {
        return financialSettlementSubjectDetails;
    }

    /**
     * Sets the value of the financialSettlementSubjectDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentSubjectDetailsType }
     *     
     */
    public void setFinancialSettlementSubjectDetails(CustomsDocumentSubjectDetailsType value) {
        this.financialSettlementSubjectDetails = value;
    }

    /**
     * общая таможенная стоимость декларируемых товаров
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
     * Общая таможенная стоимость товара, перемещаемого через таможенную границу Евразийского экономического союза в несобранном или разобранном виде, в том числе некомплектном или незавершенном виде
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getTotalCustomsValueAmount() {
        return totalCustomsValueAmount;
    }

    /**
     * Sets the value of the totalCustomsValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setTotalCustomsValueAmount(PaymentAmountWithCurrencyType value) {
        this.totalCustomsValueAmount = value;
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
     * Gets the value of the transactionNatureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionNatureDetailsType }
     *     
     */
    public TransactionNatureDetailsType getTransactionNatureDetails() {
        return transactionNatureDetails;
    }

    /**
     * Sets the value of the transactionNatureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionNatureDetailsType }
     *     
     */
    public void setTransactionNatureDetails(TransactionNatureDetailsType value) {
        this.transactionNatureDetails = value;
    }

    /**
     * Gets the value of the declarationConsignmentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationConsignmentDetailsType }
     *     
     */
    public DeclarationConsignmentDetailsType getDeclarationConsignmentDetails() {
        return declarationConsignmentDetails;
    }

    /**
     * Sets the value of the declarationConsignmentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationConsignmentDetailsType }
     *     
     */
    public void setDeclarationConsignmentDetails(DeclarationConsignmentDetailsType value) {
        this.declarationConsignmentDetails = value;
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
     * Gets the value of the declarationGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the declarationGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclarationGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeclarationGoodsItemDetailsType }
     * 
     * 
     */
    public List<DeclarationGoodsItemDetailsType> getDeclarationGoodsItemDetails() {
        if (declarationGoodsItemDetails == null) {
            declarationGoodsItemDetails = new ArrayList<DeclarationGoodsItemDetailsType>();
        }
        return this.declarationGoodsItemDetails;
    }

    /**
     * Gets the value of the factPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the factPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFactPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FactPaymentDetailsType }
     * 
     * 
     */
    public List<FactPaymentDetailsType> getFactPaymentDetails() {
        if (factPaymentDetails == null) {
            factPaymentDetails = new ArrayList<FactPaymentDetailsType>();
        }
        return this.factPaymentDetails;
    }

    /**
     * Gets the value of the defferedPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the defferedPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefferedPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DefferedPaymentDetailsType }
     * 
     * 
     */
    public List<DefferedPaymentDetailsType> getDefferedPaymentDetails() {
        if (defferedPaymentDetails == null) {
            defferedPaymentDetails = new ArrayList<DefferedPaymentDetailsType>();
        }
        return this.defferedPaymentDetails;
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

    /**
     * Gets the value of the transitGuaranteeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transitGuaranteeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitGuaranteeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitGuaranteeDetailsType }
     * 
     * 
     */
    public List<TransitGuaranteeDetailsType> getTransitGuaranteeDetails() {
        if (transitGuaranteeDetails == null) {
            transitGuaranteeDetails = new ArrayList<TransitGuaranteeDetailsType>();
        }
        return this.transitGuaranteeDetails;
    }

}
