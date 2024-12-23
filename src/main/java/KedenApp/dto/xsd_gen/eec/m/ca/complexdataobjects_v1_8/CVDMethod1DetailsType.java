
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения об определении таможенной стоимости по методу стоимости сделки с ввозимыми товарами
 * 
 * <p>Java class for CVDMethod1DetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVDMethod1DetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PaymentInvoiceDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ContractDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocV4Details" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BuyerSellerRelationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsUseRestrictionDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BuyerSellerRoyaltyFeeDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVDMethod1DetailsType", propOrder = {
    "paymentInvoiceDetails",
    "contractDetails",
    "docV4Details",
    "buyerSellerRelationDetails",
    "goodsUseRestrictionDetails",
    "buyerSellerRoyaltyFeeDetails"
})
public class CVDMethod1DetailsType {

    @XmlElement(name = "PaymentInvoiceDetails", required = true)
    protected List<DocDetailsV4Type> paymentInvoiceDetails;
    @XmlElement(name = "ContractDetails", required = true)
    protected List<DocDetailsV4Type> contractDetails;
    @XmlElement(name = "DocV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected List<DocDetailsV4Type> docV4Details;
    @XmlElement(name = "BuyerSellerRelationDetails", required = true)
    protected BuyerSellerRelationDetailsType buyerSellerRelationDetails;
    @XmlElement(name = "GoodsUseRestrictionDetails", required = true)
    protected GoodsUseRestrictionDetailsType goodsUseRestrictionDetails;
    @XmlElement(name = "BuyerSellerRoyaltyFeeDetails", required = true)
    protected BuyerSellerRoyaltyFeeDetailsType buyerSellerRoyaltyFeeDetails;

    /**
     * сведения о счете на оплату, выставленном продавцом покупателю и содержащем стоимостную оценку ввозимых товаров Gets the value of the paymentInvoiceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInvoiceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInvoiceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocDetailsV4Type }
     * 
     * 
     */
    public List<DocDetailsV4Type> getPaymentInvoiceDetails() {
        if (paymentInvoiceDetails == null) {
            paymentInvoiceDetails = new ArrayList<DocDetailsV4Type>();
        }
        return this.paymentInvoiceDetails;
    }

    /**
     * Сведения о контракте (договоре, соглашении) купли-продажи (поставки) ввозимых товаров, действующих приложениях, дополнениях и изменениях к нему Gets the value of the contractDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contractDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocDetailsV4Type }
     * 
     * 
     */
    public List<DocDetailsV4Type> getContractDetails() {
        if (contractDetails == null) {
            contractDetails = new ArrayList<DocDetailsV4Type>();
        }
        return this.contractDetails;
    }

    /**
     * Сведения о документе, имеющем отношение к сведениям, влияющим на цену ввозимых товаров Gets the value of the docV4Details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the docV4Details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocV4Details().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocDetailsV4Type }
     * 
     * 
     */
    public List<DocDetailsV4Type> getDocV4Details() {
        if (docV4Details == null) {
            docV4Details = new ArrayList<DocDetailsV4Type>();
        }
        return this.docV4Details;
    }

    /**
     * подробные сведения о соответствии стоимости сделки с ввозимыми товарами и проверочной величины
     * 
     * @return
     *     possible object is
     *     {@link BuyerSellerRelationDetailsType }
     *     
     */
    public BuyerSellerRelationDetailsType getBuyerSellerRelationDetails() {
        return buyerSellerRelationDetails;
    }

    /**
     * Sets the value of the buyerSellerRelationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerSellerRelationDetailsType }
     *     
     */
    public void setBuyerSellerRelationDetails(BuyerSellerRelationDetailsType value) {
        this.buyerSellerRelationDetails = value;
    }

    /**
     * сведения об ограничениях в отношении прав покупателя на пользование и распоряжение ввозимыми товарами, условия или обязательства, оказывающие влияние на цену ввозимых товаров
     * 
     * @return
     *     possible object is
     *     {@link GoodsUseRestrictionDetailsType }
     *     
     */
    public GoodsUseRestrictionDetailsType getGoodsUseRestrictionDetails() {
        return goodsUseRestrictionDetails;
    }

    /**
     * Sets the value of the goodsUseRestrictionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsUseRestrictionDetailsType }
     *     
     */
    public void setGoodsUseRestrictionDetails(GoodsUseRestrictionDetailsType value) {
        this.goodsUseRestrictionDetails = value;
    }

    /**
     * Gets the value of the buyerSellerRoyaltyFeeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerSellerRoyaltyFeeDetailsType }
     *     
     */
    public BuyerSellerRoyaltyFeeDetailsType getBuyerSellerRoyaltyFeeDetails() {
        return buyerSellerRoyaltyFeeDetails;
    }

    /**
     * Sets the value of the buyerSellerRoyaltyFeeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerSellerRoyaltyFeeDetailsType }
     *     
     */
    public void setBuyerSellerRoyaltyFeeDetails(BuyerSellerRoyaltyFeeDetailsType value) {
        this.buyerSellerRoyaltyFeeDetails = value;
    }

}
