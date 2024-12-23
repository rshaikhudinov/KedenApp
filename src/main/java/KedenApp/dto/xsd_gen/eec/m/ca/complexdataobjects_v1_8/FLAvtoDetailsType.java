
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения об автотранспортном средстве, выпущенном для внутреннего потребления (в свободное обращение)
 * 
 * <p>Java class for FLAvtoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FLAvtoDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTExchAutomobileDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CommodityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}VehicleDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsIssueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AdditionalInfoText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FLAvtoPaymentRateDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FLAvtoDetailsType", propOrder = {
    "dtExchAutomobileDetails",
    "commodityCode",
    "vehicleDescriptionText",
    "customsValueAmount",
    "goodsIssueDate",
    "additionalInfoText",
    "flAvtoPaymentRateDetails"
})
public class FLAvtoDetailsType {

    @XmlElement(name = "DTExchAutomobileDetails", required = true)
    protected DTExchAutomobileDetailsType dtExchAutomobileDetails;
    @XmlElement(name = "CommodityCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commodityCode;
    @XmlElement(name = "VehicleDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> vehicleDescriptionText;
    @XmlElement(name = "CustomsValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType customsValueAmount;
    @XmlElement(name = "GoodsIssueDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar goodsIssueDate;
    @XmlElement(name = "AdditionalInfoText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String additionalInfoText;
    @XmlElement(name = "FLAvtoPaymentRateDetails")
    protected List<FLAvtoPaymentRateDetailsType> flAvtoPaymentRateDetails;

    /**
     * Gets the value of the dtExchAutomobileDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DTExchAutomobileDetailsType }
     *     
     */
    public DTExchAutomobileDetailsType getDTExchAutomobileDetails() {
        return dtExchAutomobileDetails;
    }

    /**
     * Sets the value of the dtExchAutomobileDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTExchAutomobileDetailsType }
     *     
     */
    public void setDTExchAutomobileDetails(DTExchAutomobileDetailsType value) {
        this.dtExchAutomobileDetails = value;
    }

    /**
     * кодовое обозначение группы (класса) товаров в соответствии с ТН ВЭД ЕАЭС
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
     * Gets the value of the vehicleDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getVehicleDescriptionText() {
        if (vehicleDescriptionText == null) {
            vehicleDescriptionText = new ArrayList<String>();
        }
        return this.vehicleDescriptionText;
    }

    /**
     * Таможенная стоимость (стоимость) декларируемого транспортного средства
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
     * Gets the value of the goodsIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGoodsIssueDate() {
        return goodsIssueDate;
    }

    /**
     * Sets the value of the goodsIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGoodsIssueDate(XMLGregorianCalendar value) {
        this.goodsIssueDate = value;
    }

    /**
     * Сведения о выпущенном автомобиле
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
     * Gets the value of the flAvtoPaymentRateDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the flAvtoPaymentRateDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFLAvtoPaymentRateDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FLAvtoPaymentRateDetailsType }
     * 
     * 
     */
    public List<FLAvtoPaymentRateDetailsType> getFLAvtoPaymentRateDetails() {
        if (flAvtoPaymentRateDetails == null) {
            flAvtoPaymentRateDetails = new ArrayList<FLAvtoPaymentRateDetailsType>();
        }
        return this.flAvtoPaymentRateDetails;
    }

}
