
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentGuaranteeMethodCodeType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.FullNameDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.IdentityDocDetailsV3Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения об отметках таможенного органа в пассажирской таможенной декларации
 * 
 * <p>Java class for PDMarkDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDMarkDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsOperationCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsMarkCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDateTime"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ActInspectionDocIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocV4Details" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsReceiptIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDTransportMeansIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ConsignmentItemOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PaymentGuaranteeMethodCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GuaranteeAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReleaseProlongationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsControlFormCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsControlMeasureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}FullNameDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}IdentityDocV3Details" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsIdentificationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPersonDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDMarkDetailsType", propOrder = {
    "customsOperationCode",
    "customsMarkCode",
    "eventDateTime",
    "customsOfficeCode",
    "descriptionText",
    "actInspectionDocIdDetails",
    "docV4Details",
    "customsReceiptIdDetails",
    "pdTransportMeansIdDetails",
    "eventDate",
    "consignmentItemOrdinal",
    "paymentGuaranteeMethodCode",
    "guaranteeAmount",
    "releaseProlongationCode",
    "customsControlFormCode",
    "customsControlMeasureCode",
    "fullNameDetails",
    "identityDocV3Details",
    "customsIdentificationDetails",
    "customsPersonDetails"
})
public class PDMarkDetailsType {

    @XmlElement(name = "CustomsOperationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOperationCode;
    @XmlElement(name = "CustomsMarkCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsMarkCode;
    @XmlElement(name = "EventDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;
    @XmlElement(name = "CustomsOfficeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeCode;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;
    @XmlElement(name = "ActInspectionDocIdDetails")
    protected InspectionDocIdDetailsType actInspectionDocIdDetails;
    @XmlElement(name = "DocV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected DocDetailsV4Type docV4Details;
    @XmlElement(name = "CustomsReceiptIdDetails")
    protected CustomsReceiptIdDetailsType customsReceiptIdDetails;
    @XmlElement(name = "PDTransportMeansIdDetails")
    protected PDTransportMeansIdDetailsType pdTransportMeansIdDetails;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "ConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger consignmentItemOrdinal;
    @XmlElement(name = "PaymentGuaranteeMethodCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentGuaranteeMethodCodeType paymentGuaranteeMethodCode;
    @XmlElement(name = "GuaranteeAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType guaranteeAmount;
    @XmlElement(name = "ReleaseProlongationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String releaseProlongationCode;
    @XmlElement(name = "CustomsControlFormCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsControlFormCode;
    @XmlElement(name = "CustomsControlMeasureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsControlMeasureCode;
    @XmlElement(name = "FullNameDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected FullNameDetailsType fullNameDetails;
    @XmlElement(name = "IdentityDocV3Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected IdentityDocDetailsV3Type identityDocV3Details;
    @XmlElement(name = "CustomsIdentificationDetails")
    protected CustomsIdentificationDetailsType customsIdentificationDetails;
    @XmlElement(name = "CustomsPersonDetails")
    protected CustomsPersonDetailsType customsPersonDetails;

    /**
     * Кодовое обозначение совершаемой таможенной операции
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOperationCode() {
        return customsOperationCode;
    }

    /**
     * Sets the value of the customsOperationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOperationCode(String value) {
        this.customsOperationCode = value;
    }

    /**
     * Gets the value of the customsMarkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsMarkCode() {
        return customsMarkCode;
    }

    /**
     * Sets the value of the customsMarkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsMarkCode(String value) {
        this.customsMarkCode = value;
    }

    /**
     * Дата и время отметки
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Sets the value of the eventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDateTime(XMLGregorianCalendar value) {
        this.eventDateTime = value;
    }

    /**
     * Кодовое обозначение таможенного органа, совершившего таможенную операцию
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOfficeCode() {
        return customsOfficeCode;
    }

    /**
     * Sets the value of the customsOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOfficeCode(String value) {
        this.customsOfficeCode = value;
    }

    /**
     * Описание (текст) отметки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

    /**
     * Сведения о регистрационном номере акта таможенного досмотра (таможенного осмотра)
     * 
     * @return
     *     possible object is
     *     {@link InspectionDocIdDetailsType }
     *     
     */
    public InspectionDocIdDetailsType getActInspectionDocIdDetails() {
        return actInspectionDocIdDetails;
    }

    /**
     * Sets the value of the actInspectionDocIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionDocIdDetailsType }
     *     
     */
    public void setActInspectionDocIdDetails(InspectionDocIdDetailsType value) {
        this.actInspectionDocIdDetails = value;
    }

    /**
     * Сведения о документе
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getDocV4Details() {
        return docV4Details;
    }

    /**
     * Sets the value of the docV4Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setDocV4Details(DocDetailsV4Type value) {
        this.docV4Details = value;
    }

    /**
     * Gets the value of the customsReceiptIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsReceiptIdDetailsType }
     *     
     */
    public CustomsReceiptIdDetailsType getCustomsReceiptIdDetails() {
        return customsReceiptIdDetails;
    }

    /**
     * Sets the value of the customsReceiptIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsReceiptIdDetailsType }
     *     
     */
    public void setCustomsReceiptIdDetails(CustomsReceiptIdDetailsType value) {
        this.customsReceiptIdDetails = value;
    }

    /**
     * Gets the value of the pdTransportMeansIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PDTransportMeansIdDetailsType }
     *     
     */
    public PDTransportMeansIdDetailsType getPDTransportMeansIdDetails() {
        return pdTransportMeansIdDetails;
    }

    /**
     * Sets the value of the pdTransportMeansIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDTransportMeansIdDetailsType }
     *     
     */
    public void setPDTransportMeansIdDetails(PDTransportMeansIdDetailsType value) {
        this.pdTransportMeansIdDetails = value;
    }

    /**
     * Дата
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the consignmentItemOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsignmentItemOrdinal() {
        return consignmentItemOrdinal;
    }

    /**
     * Sets the value of the consignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsignmentItemOrdinal(BigInteger value) {
        this.consignmentItemOrdinal = value;
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
     * Gets the value of the guaranteeAmount property.
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
     * Gets the value of the releaseProlongationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseProlongationCode() {
        return releaseProlongationCode;
    }

    /**
     * Sets the value of the releaseProlongationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseProlongationCode(String value) {
        this.releaseProlongationCode = value;
    }

    /**
     * Gets the value of the customsControlFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsControlFormCode() {
        return customsControlFormCode;
    }

    /**
     * Sets the value of the customsControlFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsControlFormCode(String value) {
        this.customsControlFormCode = value;
    }

    /**
     * Gets the value of the customsControlMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsControlMeasureCode() {
        return customsControlMeasureCode;
    }

    /**
     * Sets the value of the customsControlMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsControlMeasureCode(String value) {
        this.customsControlMeasureCode = value;
    }

    /**
     * Gets the value of the fullNameDetails property.
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
     * Gets the value of the identityDocV3Details property.
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

    /**
     * Gets the value of the customsIdentificationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsIdentificationDetailsType }
     *     
     */
    public CustomsIdentificationDetailsType getCustomsIdentificationDetails() {
        return customsIdentificationDetails;
    }

    /**
     * Sets the value of the customsIdentificationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsIdentificationDetailsType }
     *     
     */
    public void setCustomsIdentificationDetails(CustomsIdentificationDetailsType value) {
        this.customsIdentificationDetails = value;
    }

    /**
     * Gets the value of the customsPersonDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsPersonDetailsType }
     *     
     */
    public CustomsPersonDetailsType getCustomsPersonDetails() {
        return customsPersonDetails;
    }

    /**
     * Sets the value of the customsPersonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsPersonDetailsType }
     *     
     */
    public void setCustomsPersonDetails(CustomsPersonDetailsType value) {
        this.customsPersonDetails = value;
    }

}
