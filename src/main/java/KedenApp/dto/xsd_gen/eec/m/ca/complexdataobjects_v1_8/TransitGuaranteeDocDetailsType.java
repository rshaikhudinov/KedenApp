
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentGuaranteeMethodCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о документе, подтверждающем применение или неприменение обеспечения
 * 
 * <p>Java class for TransitGuaranteeDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransitGuaranteeDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GuaranteeCertificateIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GuaranteeCustomsDocIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocCreationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GuaranteeAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PaymentGuaranteeMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReferenceConsignmentItemOrdinal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ReferenceConsignmentItemRangeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitGuaranteeDocDetailsType", propOrder = {
    "docKindCode",
    "docName",
    "guaranteeCertificateIdDetails",
    "guaranteeCustomsDocIdDetails",
    "docId",
    "docCreationDate",
    "guaranteeAmount",
    "paymentGuaranteeMethodCode",
    "referenceConsignmentItemOrdinal",
    "referenceConsignmentItemRangeDetails"
})
public class TransitGuaranteeDocDetailsType {

    @XmlElement(name = "DocKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type docKindCode;
    @XmlElement(name = "DocName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docName;
    @XmlElement(name = "GuaranteeCertificateIdDetails")
    protected GuaranteeCertificateIdDetailsType guaranteeCertificateIdDetails;
    @XmlElement(name = "GuaranteeCustomsDocIdDetails")
    protected CustomsDocumentIdDetailsType guaranteeCustomsDocIdDetails;
    @XmlElement(name = "DocId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docId;
    @XmlElement(name = "DocCreationDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docCreationDate;
    @XmlElement(name = "GuaranteeAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType guaranteeAmount;
    @XmlElement(name = "PaymentGuaranteeMethodCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentGuaranteeMethodCodeType paymentGuaranteeMethodCode;
    @XmlElement(name = "ReferenceConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> referenceConsignmentItemOrdinal;
    @XmlElement(name = "ReferenceConsignmentItemRangeDetails")
    protected List<OrdinalRangeDetailsType> referenceConsignmentItemRangeDetails;

    /**
     * Gets the value of the docKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getDocKindCode() {
        return docKindCode;
    }

    /**
     * Sets the value of the docKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setDocKindCode(UnifiedCode20Type value) {
        this.docKindCode = value;
    }

    /**
     * Gets the value of the docName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocName() {
        return docName;
    }

    /**
     * Sets the value of the docName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocName(String value) {
        this.docName = value;
    }

    /**
     * сведения о регистрационном номере сертификата обеспечения исполнения обязанности по уплате таможенных пошлин, налогов
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeCertificateIdDetailsType }
     *     
     */
    public GuaranteeCertificateIdDetailsType getGuaranteeCertificateIdDetails() {
        return guaranteeCertificateIdDetails;
    }

    /**
     * Sets the value of the guaranteeCertificateIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeCertificateIdDetailsType }
     *     
     */
    public void setGuaranteeCertificateIdDetails(GuaranteeCertificateIdDetailsType value) {
        this.guaranteeCertificateIdDetails = value;
    }

    /**
     * Gets the value of the guaranteeCustomsDocIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public CustomsDocumentIdDetailsType getGuaranteeCustomsDocIdDetails() {
        return guaranteeCustomsDocIdDetails;
    }

    /**
     * Sets the value of the guaranteeCustomsDocIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public void setGuaranteeCustomsDocIdDetails(CustomsDocumentIdDetailsType value) {
        this.guaranteeCustomsDocIdDetails = value;
    }

    /**
     * номер (регистрационный номер) иного документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
    }

    /**
     * дата выдачи, подписания, утверждения или регистрации документа
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocCreationDate() {
        return docCreationDate;
    }

    /**
     * Sets the value of the docCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocCreationDate(XMLGregorianCalendar value) {
        this.docCreationDate = value;
    }

    /**
     * сумма (размер) предоставленного обеспечения исполнения обязанности по уплате таможенных и иных платежей, которая используется в отношении товаров транзитной декларации
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getGuaranteeAmount() {
        return guaranteeAmount;
    }

    /**
     * Sets the value of the guaranteeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setGuaranteeAmount(PaymentAmountWithCurrencyType value) {
        this.guaranteeAmount = value;
    }

    /**
     * Gets the value of the paymentGuaranteeMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentGuaranteeMethodCodeType }
     *     
     */
    public PaymentGuaranteeMethodCodeType getPaymentGuaranteeMethodCode() {
        return paymentGuaranteeMethodCode;
    }

    /**
     * Sets the value of the paymentGuaranteeMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentGuaranteeMethodCodeType }
     *     
     */
    public void setPaymentGuaranteeMethodCode(PaymentGuaranteeMethodCodeType value) {
        this.paymentGuaranteeMethodCode = value;
    }

    /**
     * порядковый номер товара, в отношении которого используется генеральное обеспечение исполнения обязанности по уплате таможенных и иных платежей Gets the value of the referenceConsignmentItemOrdinal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the referenceConsignmentItemOrdinal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceConsignmentItemOrdinal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getReferenceConsignmentItemOrdinal() {
        if (referenceConsignmentItemOrdinal == null) {
            referenceConsignmentItemOrdinal = new ArrayList<BigInteger>();
        }
        return this.referenceConsignmentItemOrdinal;
    }

    /**
     * сведения о диапазоне порядковых номеров товаров, в отношении которых используется генеральное обеспечение исполнения обязанности по уплате таможенных и иных платежей Gets the value of the referenceConsignmentItemRangeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the referenceConsignmentItemRangeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceConsignmentItemRangeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrdinalRangeDetailsType }
     * 
     * 
     */
    public List<OrdinalRangeDetailsType> getReferenceConsignmentItemRangeDetails() {
        if (referenceConsignmentItemRangeDetails == null) {
            referenceConsignmentItemRangeDetails = new ArrayList<OrdinalRangeDetailsType>();
        }
        return this.referenceConsignmentItemRangeDetails;
    }

}
