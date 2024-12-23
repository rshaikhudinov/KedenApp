
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.FullNameDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.IdentityDocDetailsV3Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о перечне товаров, заявляемых в пассажирской таможенной декларации
 * 
 * <p>Java class for PDGoodsListDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDGoodsListDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDGoodsItemDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalNetMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsMeasureDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}FullNameDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}IdentityDocV3Details" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDGoodsListDetailsType", propOrder = {
    "pdGoodsItemDetails",
    "totalNetMassMeasure",
    "goodsMeasureDetails",
    "totalAmount",
    "fullNameDetails",
    "identityDocV3Details"
})
public class PDGoodsListDetailsType {

    @XmlElement(name = "PDGoodsItemDetails", required = true)
    protected List<PDGoodsItemDetailsType> pdGoodsItemDetails;
    @XmlElement(name = "TotalNetMassMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType totalNetMassMeasure;
    @XmlElement(name = "GoodsMeasureDetails")
    protected GoodsMeasureDetailsType goodsMeasureDetails;
    @XmlElement(name = "TotalAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType totalAmount;
    @XmlElement(name = "FullNameDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected FullNameDetailsType fullNameDetails;
    @XmlElement(name = "IdentityDocV3Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected IdentityDocDetailsV3Type identityDocV3Details;

    /**
     * Сведения о товаре Gets the value of the pdGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pdGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDGoodsItemDetailsType }
     * 
     * 
     */
    public List<PDGoodsItemDetailsType> getPDGoodsItemDetails() {
        if (pdGoodsItemDetails == null) {
            pdGoodsItemDetails = new ArrayList<PDGoodsItemDetailsType>();
        }
        return this.pdGoodsItemDetails;
    }

    /**
     * Общий вес товаров
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
     * Общее количество товаров в дополнительных единицах измерения
     * 
     * @return
     *     possible object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public GoodsMeasureDetailsType getGoodsMeasureDetails() {
        return goodsMeasureDetails;
    }

    /**
     * Sets the value of the goodsMeasureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public void setGoodsMeasureDetails(GoodsMeasureDetailsType value) {
        this.goodsMeasureDetails = value;
    }

    /**
     * Общая стоимость товаров
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setTotalAmount(PaymentAmountWithCurrencyType value) {
        this.totalAmount = value;
    }

    /**
     * ФИО лица, не достигшего 16-летнего возраста, совместно следующего с декларантом
     * 
     * @return
     *     possible object is
     *     {@link FullNameDetailsType }
     *     
     */
    public FullNameDetailsType getFullNameDetails() {
        return fullNameDetails;
    }

    /**
     * Sets the value of the fullNameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullNameDetailsType }
     *     
     */
    public void setFullNameDetails(FullNameDetailsType value) {
        this.fullNameDetails = value;
    }

    /**
     * сведения о документе, удостоверяющем личность лица, не достигшего 16-летнего возраста, совместно следующего с декларантом
     * 
     * @return
     *     possible object is
     *     {@link IdentityDocDetailsV3Type }
     *     
     */
    public IdentityDocDetailsV3Type getIdentityDocV3Details() {
        return identityDocV3Details;
    }

    /**
     * Sets the value of the identityDocV3Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDocDetailsV3Type }
     *     
     */
    public void setIdentityDocV3Details(IdentityDocDetailsV3Type value) {
        this.identityDocV3Details = value;
    }

}
