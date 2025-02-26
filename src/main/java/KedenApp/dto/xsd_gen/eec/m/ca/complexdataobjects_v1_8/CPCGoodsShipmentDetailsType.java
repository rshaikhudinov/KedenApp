
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о товарной партии
 * 
 * <p>Java class for CPCGoodsShipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPCGoodsShipmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OriginCountryDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CPCGoodsItemDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CPCFactPaymentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CPCPaymentAmountDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPCGoodsShipmentDetailsType", propOrder = {
    "customsValueAmount",
    "originCountryDetails",
    "cpcGoodsItemDetails",
    "cpcFactPaymentDetails",
    "cpcPaymentAmountDetails"
})
public class CPCGoodsShipmentDetailsType {

    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType customsValueAmount;
    @XmlElement(name = "OriginCountryDetails", required = true)
    protected CACountryDetailsType originCountryDetails;
    @XmlElement(name = "CPCGoodsItemDetails", required = true)
    protected List<CPCGoodsItemDetailsType> cpcGoodsItemDetails;
    @XmlElement(name = "CPCFactPaymentDetails")
    protected List<CPCFactPaymentDetailsType> cpcFactPaymentDetails;
    @XmlElement(name = "CPCPaymentAmountDetails")
    protected List<CPCPaymentAmountDetailsType> cpcPaymentAmountDetails;

    /**
     * Общая таможенная стоимость
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
     * Gets the value of the cpcGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cpcGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCPCGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CPCGoodsItemDetailsType }
     * 
     * 
     */
    public List<CPCGoodsItemDetailsType> getCPCGoodsItemDetails() {
        if (cpcGoodsItemDetails == null) {
            cpcGoodsItemDetails = new ArrayList<CPCGoodsItemDetailsType>();
        }
        return this.cpcGoodsItemDetails;
    }

    /**
     * Сведения о фактически уплаченных (взысканных) суммах таможенных и иных платежей и (или) о сумме платежа, пеней, процентов, в отношении которой меры по взысканию не применяются Gets the value of the cpcFactPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cpcFactPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCPCFactPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CPCFactPaymentDetailsType }
     * 
     * 
     */
    public List<CPCFactPaymentDetailsType> getCPCFactPaymentDetails() {
        if (cpcFactPaymentDetails == null) {
            cpcFactPaymentDetails = new ArrayList<CPCFactPaymentDetailsType>();
        }
        return this.cpcFactPaymentDetails;
    }

    /**
     * Gets the value of the cpcPaymentAmountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cpcPaymentAmountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCPCPaymentAmountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CPCPaymentAmountDetailsType }
     * 
     * 
     */
    public List<CPCPaymentAmountDetailsType> getCPCPaymentAmountDetails() {
        if (cpcPaymentAmountDetails == null) {
            cpcPaymentAmountDetails = new ArrayList<CPCPaymentAmountDetailsType>();
        }
        return this.cpcPaymentAmountDetails;
    }

}
