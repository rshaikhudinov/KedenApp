
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.TransportMeansRegIdType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о товаре
 * 
 * <p>Java class for TMPAGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMPAGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CAGoodsBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AddGoodsMeasureDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TMPATransportMeansDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTAutomobileDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TransportMeansRegId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ProcessingDescriptionDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PrecedingDocDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TMPAPresentedDocDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPaymentDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMPAGoodsItemDetailsType", propOrder = {
    "addGoodsMeasureDetails",
    "tmpaTransportMeansDetails",
    "dtAutomobileDetails",
    "transportMeansRegId",
    "processingDescriptionDetails",
    "caValueAmount",
    "customsValueAmount",
    "precedingDocDetails",
    "tmpaPresentedDocDetails",
    "customsPaymentDetails"
})
public class TMPAGoodsItemDetailsType
    extends CAGoodsBaseType
{

    @XmlElement(name = "AddGoodsMeasureDetails")
    protected List<GoodsMeasureDetailsType> addGoodsMeasureDetails;
    @XmlElement(name = "TMPATransportMeansDetails")
    protected TMPATransportMeansDetailsType tmpaTransportMeansDetails;
    @XmlElement(name = "DTAutomobileDetails")
    protected DTAutomobileDetailsType dtAutomobileDetails;
    @XmlElement(name = "TransportMeansRegId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected TransportMeansRegIdType transportMeansRegId;
    @XmlElement(name = "ProcessingDescriptionDetails", required = true)
    protected ProcessingDescriptionDetailsType processingDescriptionDetails;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType caValueAmount;
    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType customsValueAmount;
    @XmlElement(name = "PrecedingDocDetails", required = true)
    protected PrecedingDocDetailsType precedingDocDetails;
    @XmlElement(name = "TMPAPresentedDocDetails", required = true)
    protected List<SimplePresentedDocDetailsType> tmpaPresentedDocDetails;
    @XmlElement(name = "CustomsPaymentDetails", required = true)
    protected List<GoodsItemPaymentDetailsType> customsPaymentDetails;

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
     * Gets the value of the tmpaTransportMeansDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TMPATransportMeansDetailsType }
     *     
     */
    public TMPATransportMeansDetailsType getTMPATransportMeansDetails() {
        return tmpaTransportMeansDetails;
    }

    /**
     * Sets the value of the tmpaTransportMeansDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TMPATransportMeansDetailsType }
     *     
     */
    public void setTMPATransportMeansDetails(TMPATransportMeansDetailsType value) {
        this.tmpaTransportMeansDetails = value;
    }

    /**
     * сведения об автомобильном транспортном средстве международной перевозки, с которым совершаются операции
     * 
     * @return
     *     possible object is
     *     {@link DTAutomobileDetailsType }
     *     
     */
    public DTAutomobileDetailsType getDTAutomobileDetails() {
        return dtAutomobileDetails;
    }

    /**
     * Sets the value of the dtAutomobileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTAutomobileDetailsType }
     *     
     */
    public void setDTAutomobileDetails(DTAutomobileDetailsType value) {
        this.dtAutomobileDetails = value;
    }

    /**
     * регистрационный номер (государственный регистрационный номер) транспортного средства международной перевозки, название морского (речного) судна, номер железнодорожного вагона, номер контейнера, бортовой номер воздушного транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansRegIdType }
     *     
     */
    public TransportMeansRegIdType getTransportMeansRegId() {
        return transportMeansRegId;
    }

    /**
     * Sets the value of the transportMeansRegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansRegIdType }
     *     
     */
    public void setTransportMeansRegId(TransportMeansRegIdType value) {
        this.transportMeansRegId = value;
    }

    /**
     * Сведения о совершаемых операциях
     * 
     * @return
     *     possible object is
     *     {@link ProcessingDescriptionDetailsType }
     *     
     */
    public ProcessingDescriptionDetailsType getProcessingDescriptionDetails() {
        return processingDescriptionDetails;
    }

    /**
     * Sets the value of the processingDescriptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingDescriptionDetailsType }
     *     
     */
    public void setProcessingDescriptionDetails(ProcessingDescriptionDetailsType value) {
        this.processingDescriptionDetails = value;
    }

    /**
     * Стоимость операций
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
     * Gets the value of the precedingDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PrecedingDocDetailsType }
     *     
     */
    public PrecedingDocDetailsType getPrecedingDocDetails() {
        return precedingDocDetails;
    }

    /**
     * Sets the value of the precedingDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecedingDocDetailsType }
     *     
     */
    public void setPrecedingDocDetails(PrecedingDocDetailsType value) {
        this.precedingDocDetails = value;
    }

    /**
     * Gets the value of the tmpaPresentedDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tmpaPresentedDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTMPAPresentedDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplePresentedDocDetailsType }
     * 
     * 
     */
    public List<SimplePresentedDocDetailsType> getTMPAPresentedDocDetails() {
        if (tmpaPresentedDocDetails == null) {
            tmpaPresentedDocDetails = new ArrayList<SimplePresentedDocDetailsType>();
        }
        return this.tmpaPresentedDocDetails;
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

}
