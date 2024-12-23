
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие информацию о дополнительных сведений по внешнеторговым контрактам
 * 
 * <p>Java class for ForeignTradeContractDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeignTradeContractDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ForeignTradeConsigneeDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransactionPassportId"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ForeignMainContractDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ForeignAddContractDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DeliveryTermsDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OriginCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsMeasureDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignTradeContractDetailsType", propOrder = {
    "foreignTradeConsigneeDetails",
    "transactionPassportId",
    "foreignMainContractDetails",
    "foreignAddContractDetails",
    "deliveryTermsDetails",
    "originCountryDetails",
    "customsValueAmount",
    "goodsMeasureDetails"
})
public class ForeignTradeContractDetailsType {

    @XmlElement(name = "ForeignTradeConsigneeDetails", required = true)
    protected CASubjectBaseDetailsType foreignTradeConsigneeDetails;
    @XmlElement(name = "TransactionPassportId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transactionPassportId;
    @XmlElement(name = "ForeignMainContractDetails")
    protected DocDetailsV4Type foreignMainContractDetails;
    @XmlElement(name = "ForeignAddContractDetails")
    protected List<DocDetailsV4Type> foreignAddContractDetails;
    @XmlElement(name = "DeliveryTermsDetails", required = true)
    protected DeliveryTermsDetailsType deliveryTermsDetails;
    @XmlElement(name = "OriginCountryDetails")
    protected CACountryDetailsType originCountryDetails;
    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType customsValueAmount;
    @XmlElement(name = "GoodsMeasureDetails", required = true)
    protected List<GoodsMeasureDetailsType> goodsMeasureDetails;

    /**
     * Gets the value of the foreignTradeConsigneeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CASubjectBaseDetailsType }
     *     
     */
    public CASubjectBaseDetailsType getForeignTradeConsigneeDetails() {
        return foreignTradeConsigneeDetails;
    }

    /**
     * Sets the value of the foreignTradeConsigneeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASubjectBaseDetailsType }
     *     
     */
    public void setForeignTradeConsigneeDetails(CASubjectBaseDetailsType value) {
        this.foreignTradeConsigneeDetails = value;
    }

    /**
     * Gets the value of the transactionPassportId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionPassportId() {
        return transactionPassportId;
    }

    /**
     * Sets the value of the transactionPassportId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionPassportId(String value) {
        this.transactionPassportId = value;
    }

    /**
     * Gets the value of the foreignMainContractDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getForeignMainContractDetails() {
        return foreignMainContractDetails;
    }

    /**
     * Sets the value of the foreignMainContractDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setForeignMainContractDetails(DocDetailsV4Type value) {
        this.foreignMainContractDetails = value;
    }

    /**
     * Gets the value of the foreignAddContractDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the foreignAddContractDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForeignAddContractDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocDetailsV4Type }
     * 
     * 
     */
    public List<DocDetailsV4Type> getForeignAddContractDetails() {
        if (foreignAddContractDetails == null) {
            foreignAddContractDetails = new ArrayList<DocDetailsV4Type>();
        }
        return this.foreignAddContractDetails;
    }

    /**
     * Gets the value of the deliveryTermsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTermsDetailsType }
     *     
     */
    public DeliveryTermsDetailsType getDeliveryTermsDetails() {
        return deliveryTermsDetails;
    }

    /**
     * Sets the value of the deliveryTermsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTermsDetailsType }
     *     
     */
    public void setDeliveryTermsDetails(DeliveryTermsDetailsType value) {
        this.deliveryTermsDetails = value;
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
     * Условная таможенная стоимость
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
     * Количество товара с указанием дополнительной единицы измерения Gets the value of the goodsMeasureDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the goodsMeasureDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGoodsMeasureDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsMeasureDetailsType }
     * 
     * 
     */
    public List<GoodsMeasureDetailsType> getGoodsMeasureDetails() {
        if (goodsMeasureDetails == null) {
            goodsMeasureDetails = new ArrayList<GoodsMeasureDetailsType>();
        }
        return this.goodsMeasureDetails;
    }

}
