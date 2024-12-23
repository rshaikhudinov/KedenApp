
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
 * Описание товара (услуги)
 * 
 * <p>Java class for CRGoodsInfoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRGoodsInfoDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CACRGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PageOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CRGoodsKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CRPaymentDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AdditionalInfoText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CommodityDescriptionDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CRAutomobileDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRGoodsInfoDetailsType", propOrder = {
    "pageOrdinal",
    "crGoodsKindCode",
    "caValueAmount",
    "crPaymentDetails",
    "additionalInfoText",
    "commodityDescriptionDetails",
    "crAutomobileDetails"
})
public class CRGoodsInfoDetailsType
    extends CACRGoodsBaseDetailsType
{

    @XmlElement(name = "PageOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger pageOrdinal;
    @XmlElement(name = "CRGoodsKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String crGoodsKindCode;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<PaymentAmountWithCurrencyType> caValueAmount;
    @XmlElement(name = "CRPaymentDetails")
    protected CRPaymentDetailsType crPaymentDetails;
    @XmlElement(name = "AdditionalInfoText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String additionalInfoText;
    @XmlElement(name = "CommodityDescriptionDetails")
    protected List<CACommodityDescriptionDetailsType> commodityDescriptionDetails;
    @XmlElement(name = "CRAutomobileDetails")
    protected CRAutomobileDetailsType crAutomobileDetails;

    /**
     * Gets the value of the pageOrdinal property.
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
     * признак товара или услуг, заявляемых в таможенном приходном ордере (для Российской Федерации)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRGoodsKindCode() {
        return crGoodsKindCode;
    }

    /**
     * Sets the value of the crGoodsKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRGoodsKindCode(String value) {
        this.crGoodsKindCode = value;
    }

    /**
     * Стоимость товаров (для Российской Федерации – стоимость товаров или услуг) Gets the value of the caValueAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the caValueAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCAValueAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentAmountWithCurrencyType }
     * 
     * 
     */
    public List<PaymentAmountWithCurrencyType> getCAValueAmount() {
        if (caValueAmount == null) {
            caValueAmount = new ArrayList<PaymentAmountWithCurrencyType>();
        }
        return this.caValueAmount;
    }

    /**
     * Gets the value of the crPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CRPaymentDetailsType }
     *     
     */
    public CRPaymentDetailsType getCRPaymentDetails() {
        return crPaymentDetails;
    }

    /**
     * Sets the value of the crPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRPaymentDetailsType }
     *     
     */
    public void setCRPaymentDetails(CRPaymentDetailsType value) {
        this.crPaymentDetails = value;
    }

    /**
     * Gets the value of the additionalInfoText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfoText() {
        return additionalInfoText;
    }

    /**
     * Sets the value of the additionalInfoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfoText(String value) {
        this.additionalInfoText = value;
    }

    /**
     * Gets the value of the commodityDescriptionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the commodityDescriptionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommodityDescriptionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CACommodityDescriptionDetailsType }
     * 
     * 
     */
    public List<CACommodityDescriptionDetailsType> getCommodityDescriptionDetails() {
        if (commodityDescriptionDetails == null) {
            commodityDescriptionDetails = new ArrayList<CACommodityDescriptionDetailsType>();
        }
        return this.commodityDescriptionDetails;
    }

    /**
     * Gets the value of the crAutomobileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CRAutomobileDetailsType }
     *     
     */
    public CRAutomobileDetailsType getCRAutomobileDetails() {
        return crAutomobileDetails;
    }

    /**
     * Sets the value of the crAutomobileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRAutomobileDetailsType }
     *     
     */
    public void setCRAutomobileDetails(CRAutomobileDetailsType value) {
        this.crAutomobileDetails = value;
    }

}
