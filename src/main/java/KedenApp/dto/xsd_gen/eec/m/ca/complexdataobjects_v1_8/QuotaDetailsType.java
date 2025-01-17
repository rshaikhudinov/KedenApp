
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithNCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о квоте
 * 
 * <p>Java class for QuotaDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}QuotaMeasureReminderDetails" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}QuotaRemainderAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}QuotaWriteOffMeasureDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaDetailsType", propOrder = {
    "quotaMeasureReminderDetails",
    "quotaRemainderAmount",
    "quotaWriteOffMeasureDetails"
})
public class QuotaDetailsType {

    @XmlElement(name = "QuotaMeasureReminderDetails")
    protected List<GoodsMeasureDetailsType> quotaMeasureReminderDetails;
    @XmlElement(name = "QuotaRemainderAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithNCurrencyType quotaRemainderAmount;
    @XmlElement(name = "QuotaWriteOffMeasureDetails")
    protected GoodsMeasureDetailsType quotaWriteOffMeasureDetails;

    /**
     * Сведения об остатке квоты в количественном выражении Gets the value of the quotaMeasureReminderDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the quotaMeasureReminderDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuotaMeasureReminderDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsMeasureDetailsType }
     * 
     * 
     */
    public List<GoodsMeasureDetailsType> getQuotaMeasureReminderDetails() {
        if (quotaMeasureReminderDetails == null) {
            quotaMeasureReminderDetails = new ArrayList<GoodsMeasureDetailsType>();
        }
        return this.quotaMeasureReminderDetails;
    }

    /**
     * Gets the value of the quotaRemainderAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public PaymentAmountWithNCurrencyType getQuotaRemainderAmount() {
        return quotaRemainderAmount;
    }

    /**
     * Sets the value of the quotaRemainderAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public void setQuotaRemainderAmount(PaymentAmountWithNCurrencyType value) {
        this.quotaRemainderAmount = value;
    }

    /**
     * Gets the value of the quotaWriteOffMeasureDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public GoodsMeasureDetailsType getQuotaWriteOffMeasureDetails() {
        return quotaWriteOffMeasureDetails;
    }

    /**
     * Sets the value of the quotaWriteOffMeasureDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsMeasureDetailsType }
     *     
     */
    public void setQuotaWriteOffMeasureDetails(GoodsMeasureDetailsType value) {
        this.quotaWriteOffMeasureDetails = value;
    }

}
