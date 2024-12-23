
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxPrefCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.AmountWithCurrencyV3Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Статистические сведения о товаре
 * 
 * <p>Java class for DTStatGoodsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTStatGoodsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADTGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OriginCountryDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsDutyPrefCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsItemGroupDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}StatisticValueAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreferencesAmount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTStatGoodsDetailsType", propOrder = {
    "originCountryDetails",
    "customsDutyPrefCode",
    "goodsItemGroupDetails",
    "statisticValueAmount",
    "preferencesAmount"
})
public class DTStatGoodsDetailsType
    extends CADTGoodsBaseDetailsType
{

    @XmlElement(name = "OriginCountryDetails", required = true)
    protected CACountryDetailsType originCountryDetails;
    @XmlElement(name = "CustomsDutyPrefCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsTaxPrefCodeType customsDutyPrefCode;
    @XmlElement(name = "GoodsItemGroupDetails")
    protected List<GoodsItemGroupDetailsType> goodsItemGroupDetails;
    @XmlElement(name = "StatisticValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType statisticValueAmount;
    @XmlElement(name = "PreferencesAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected AmountWithCurrencyV3Type preferencesAmount;

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
     * Gets the value of the preferencesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountWithCurrencyV3Type }
     *     
     */
    public AmountWithCurrencyV3Type getPreferencesAmount() {
        return preferencesAmount;
    }

    /**
     * Sets the value of the preferencesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountWithCurrencyV3Type }
     *     
     */
    public void setPreferencesAmount(AmountWithCurrencyV3Type value) {
        this.preferencesAmount = value;
    }

}
