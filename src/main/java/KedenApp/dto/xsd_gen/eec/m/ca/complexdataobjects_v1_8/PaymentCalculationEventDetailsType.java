
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о случае и сроке уплаты таможенных и иных платежей, а также о дате их исчисления
 * 
 * <p>Java class for PaymentCalculationEventDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCalculationEventDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PaymentCalculationEventCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EndDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DutyTaxFeeRateDate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCalculationEventDetailsType", propOrder = {
    "paymentCalculationEventCode",
    "endDate",
    "dutyTaxFeeRateDate"
})
public class PaymentCalculationEventDetailsType {

    @XmlElement(name = "PaymentCalculationEventCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentCalculationEventCode;
    @XmlElement(name = "EndDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "DutyTaxFeeRateDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dutyTaxFeeRateDate;

    /**
     * Gets the value of the paymentCalculationEventCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCalculationEventCode() {
        return paymentCalculationEventCode;
    }

    /**
     * Sets the value of the paymentCalculationEventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCalculationEventCode(String value) {
        this.paymentCalculationEventCode = value;
    }

    /**
     * Срок уплаты таможенных и иных платежей
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the dutyTaxFeeRateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDutyTaxFeeRateDate() {
        return dutyTaxFeeRateDate;
    }

    /**
     * Sets the value of the dutyTaxFeeRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDutyTaxFeeRateDate(XMLGregorianCalendar value) {
        this.dutyTaxFeeRateDate = value;
    }

}
