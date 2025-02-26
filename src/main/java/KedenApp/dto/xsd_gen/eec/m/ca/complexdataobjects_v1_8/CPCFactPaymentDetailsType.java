
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxPaymentMethodCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения об уплате или неприменению мер по взысканию платежа
 * 
 * <p>Java class for CPCFactPaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPCFactPaymentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FactPaymentBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsTaxPaymentMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsTaxPaymentNoApplyCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PaymentDocDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PaymentDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPCFactPaymentDetailsType", propOrder = {
    "customsTaxPaymentMethodCode",
    "customsTaxPaymentNoApplyCode",
    "paymentDocDetails",
    "paymentDate"
})
public class CPCFactPaymentDetailsType
    extends FactPaymentBaseDetailsType
{

    @XmlElement(name = "CustomsTaxPaymentMethodCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CustomsTaxPaymentMethodCodeType customsTaxPaymentMethodCode;
    @XmlElement(name = "CustomsTaxPaymentNoApplyCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsTaxPaymentNoApplyCode;
    @XmlElement(name = "PaymentDocDetails")
    protected PaymentDocDetailsType paymentDocDetails;
    @XmlElement(name = "PaymentDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDate;

    /**
     * Кодовое обозначение способа уплаты таможенных или иных платежей
     * 
     * @return
     *     possible object is
     *     {@link CustomsTaxPaymentMethodCodeType }
     *     
     */
    public CustomsTaxPaymentMethodCodeType getCustomsTaxPaymentMethodCode() {
        return customsTaxPaymentMethodCode;
    }

    /**
     * Sets the value of the customsTaxPaymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTaxPaymentMethodCodeType }
     *     
     */
    public void setCustomsTaxPaymentMethodCode(CustomsTaxPaymentMethodCodeType value) {
        this.customsTaxPaymentMethodCode = value;
    }

    /**
     * Кодовое обозначение случая, когда меры по взысканию таможенных пошлин, налогов, специальных, антидемпинговых, компенсационных пошлин не принимаются
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsTaxPaymentNoApplyCode() {
        return customsTaxPaymentNoApplyCode;
    }

    /**
     * Sets the value of the customsTaxPaymentNoApplyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsTaxPaymentNoApplyCode(String value) {
        this.customsTaxPaymentNoApplyCode = value;
    }

    /**
     * сведения о документе, подтверждающем уплату (взыскание) таможенного и иного платежа и (или) на основании которого меры по взысканию не принимаются
     * 
     * @return
     *     possible object is
     *     {@link PaymentDocDetailsType }
     *     
     */
    public PaymentDocDetailsType getPaymentDocDetails() {
        return paymentDocDetails;
    }

    /**
     * Sets the value of the paymentDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDocDetailsType }
     *     
     */
    public void setPaymentDocDetails(PaymentDocDetailsType value) {
        this.paymentDocDetails = value;
    }

    /**
     * дата уплаты или взыскания (дата исполнения обязанности по уплате таможенных и иных платежей)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDate(XMLGregorianCalendar value) {
        this.paymentDate = value;
    }

}
