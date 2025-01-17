
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithNCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о фактическом платеже
 * 
 * <p>Java class for GDFactPaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDFactPaymentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FactPaymentBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreviousCAPaymentNAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DifferenceCAPaymentNAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GDPaymentDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDFactPaymentDetailsType", propOrder = {
    "previousCAPaymentNAmount",
    "differenceCAPaymentNAmount",
    "gdPaymentDocDetails"
})
public class GDFactPaymentDetailsType
    extends FactPaymentBaseDetailsType
{

    @XmlElement(name = "PreviousCAPaymentNAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithNCurrencyType previousCAPaymentNAmount;
    @XmlElement(name = "DifferenceCAPaymentNAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithNCurrencyType differenceCAPaymentNAmount;
    @XmlElement(name = "GDPaymentDocDetails")
    protected List<GDPaymentDocDetailsType> gdPaymentDocDetails;

    /**
     * Предыдущая сумма платежа
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public PaymentAmountWithNCurrencyType getPreviousCAPaymentNAmount() {
        return previousCAPaymentNAmount;
    }

    /**
     * Sets the value of the previousCAPaymentNAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public void setPreviousCAPaymentNAmount(PaymentAmountWithNCurrencyType value) {
        this.previousCAPaymentNAmount = value;
    }

    /**
     * Gets the value of the differenceCAPaymentNAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public PaymentAmountWithNCurrencyType getDifferenceCAPaymentNAmount() {
        return differenceCAPaymentNAmount;
    }

    /**
     * Sets the value of the differenceCAPaymentNAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithNCurrencyType }
     *     
     */
    public void setDifferenceCAPaymentNAmount(PaymentAmountWithNCurrencyType value) {
        this.differenceCAPaymentNAmount = value;
    }

    /**
     * Gets the value of the gdPaymentDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the gdPaymentDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGDPaymentDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GDPaymentDocDetailsType }
     * 
     * 
     */
    public List<GDPaymentDocDetailsType> getGDPaymentDocDetails() {
        if (gdPaymentDocDetails == null) {
            gdPaymentDocDetails = new ArrayList<GDPaymentDocDetailsType>();
        }
        return this.gdPaymentDocDetails;
    }

}
