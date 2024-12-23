
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentGuaranteeMethodCodeType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения, заполняемые лицом, представившим сертификат обеспечения исполнения обязанности по уплате таможенных пошлин, налогов
 * 
 * <p>Java class for GuaranteeCertificateInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuaranteeCertificateInformationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RefGuaranteeCertificateIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SuretySubjectDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PaymentGuaranteeMethodCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GCGuaranteeConfirmDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GuaranteeAmount"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitDeclarantDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocV4Details" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DepartureCountryDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GuaranteeCertificateAgentDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SignatoryPersonV2Details" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeCertificateInformationDetailsType", propOrder = {
    "refGuaranteeCertificateIdDetails",
    "suretySubjectDetails",
    "paymentGuaranteeMethodCode",
    "gcGuaranteeConfirmDocDetails",
    "guaranteeAmount",
    "transitDeclarantDetails",
    "docV4Details",
    "departureCountryDetails",
    "guaranteeCertificateAgentDetails",
    "signatoryPersonV2Details"
})
public class GuaranteeCertificateInformationDetailsType {

    @XmlElement(name = "RefGuaranteeCertificateIdDetails")
    protected CustomsDocumentIdDetailsType refGuaranteeCertificateIdDetails;
    @XmlElement(name = "SuretySubjectDetails")
    protected CASubjectDetailsType suretySubjectDetails;
    @XmlElement(name = "PaymentGuaranteeMethodCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentGuaranteeMethodCodeType paymentGuaranteeMethodCode;
    @XmlElement(name = "GCGuaranteeConfirmDocDetails")
    protected List<GCGuaranteeConfirmDocDetailsType> gcGuaranteeConfirmDocDetails;
    @XmlElement(name = "GuaranteeAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType guaranteeAmount;
    @XmlElement(name = "TransitDeclarantDetails", required = true)
    protected CASubjectDetailsType transitDeclarantDetails;
    @XmlElement(name = "DocV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected List<DocDetailsV4Type> docV4Details;
    @XmlElement(name = "DepartureCountryDetails", required = true)
    protected CACountryDetailsType departureCountryDetails;
    @XmlElement(name = "GuaranteeCertificateAgentDetails")
    protected GuaranteeCertificateAgentDetailsType guaranteeCertificateAgentDetails;
    @XmlElement(name = "SignatoryPersonV2Details")
    protected SignatoryPersonDetailsV2Type signatoryPersonV2Details;

    /**
     * Регистрационный номер предшествующего сертификата обеспечения исполнения обязанности по уплате таможенных пошлин, налогов
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public CustomsDocumentIdDetailsType getRefGuaranteeCertificateIdDetails() {
        return refGuaranteeCertificateIdDetails;
    }

    /**
     * Sets the value of the refGuaranteeCertificateIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public void setRefGuaranteeCertificateIdDetails(CustomsDocumentIdDetailsType value) {
        this.refGuaranteeCertificateIdDetails = value;
    }

    /**
     * Gets the value of the suretySubjectDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CASubjectDetailsType }
     *     
     */
    public CASubjectDetailsType getSuretySubjectDetails() {
        return suretySubjectDetails;
    }

    /**
     * Sets the value of the suretySubjectDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASubjectDetailsType }
     *     
     */
    public void setSuretySubjectDetails(CASubjectDetailsType value) {
        this.suretySubjectDetails = value;
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
     * Gets the value of the gcGuaranteeConfirmDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the gcGuaranteeConfirmDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGCGuaranteeConfirmDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GCGuaranteeConfirmDocDetailsType }
     * 
     * 
     */
    public List<GCGuaranteeConfirmDocDetailsType> getGCGuaranteeConfirmDocDetails() {
        if (gcGuaranteeConfirmDocDetails == null) {
            gcGuaranteeConfirmDocDetails = new ArrayList<GCGuaranteeConfirmDocDetailsType>();
        }
        return this.gcGuaranteeConfirmDocDetails;
    }

    /**
     * Сумма сертификата обеспечения исполнения обязанности по уплате таможенных пошлин, налогов
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
     * сведения о декларанте товаров, помещаемых под таможенную процедуру таможенного транзита
     * 
     * @return
     *     possible object is
     *     {@link CASubjectDetailsType }
     *     
     */
    public CASubjectDetailsType getTransitDeclarantDetails() {
        return transitDeclarantDetails;
    }

    /**
     * Sets the value of the transitDeclarantDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASubjectDetailsType }
     *     
     */
    public void setTransitDeclarantDetails(CASubjectDetailsType value) {
        this.transitDeclarantDetails = value;
    }

    /**
     * сведения о коммерческих и транспортных (перевозочных) документах Gets the value of the docV4Details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the docV4Details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocV4Details().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocDetailsV4Type }
     * 
     * 
     */
    public List<DocDetailsV4Type> getDocV4Details() {
        if (docV4Details == null) {
            docV4Details = new ArrayList<DocDetailsV4Type>();
        }
        return this.docV4Details;
    }

    /**
     * Сведения о государстве таможенного органа отправления
     * 
     * @return
     *     possible object is
     *     {@link CACountryDetailsType }
     *     
     */
    public CACountryDetailsType getDepartureCountryDetails() {
        return departureCountryDetails;
    }

    /**
     * Sets the value of the departureCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryDetailsType }
     *     
     */
    public void setDepartureCountryDetails(CACountryDetailsType value) {
        this.departureCountryDetails = value;
    }

    /**
     * Gets the value of the guaranteeCertificateAgentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeCertificateAgentDetailsType }
     *     
     */
    public GuaranteeCertificateAgentDetailsType getGuaranteeCertificateAgentDetails() {
        return guaranteeCertificateAgentDetails;
    }

    /**
     * Sets the value of the guaranteeCertificateAgentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeCertificateAgentDetailsType }
     *     
     */
    public void setGuaranteeCertificateAgentDetails(GuaranteeCertificateAgentDetailsType value) {
        this.guaranteeCertificateAgentDetails = value;
    }

    /**
     * Сведения о физическом лице, заполнившем сертификат обеспечения исполнения обязанности по уплате таможенных пошлин, налогов
     * 
     * @return
     *     possible object is
     *     {@link SignatoryPersonDetailsV2Type }
     *     
     */
    public SignatoryPersonDetailsV2Type getSignatoryPersonV2Details() {
        return signatoryPersonV2Details;
    }

    /**
     * Sets the value of the signatoryPersonV2Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatoryPersonDetailsV2Type }
     *     
     */
    public void setSignatoryPersonV2Details(SignatoryPersonDetailsV2Type value) {
        this.signatoryPersonV2Details = value;
    }

}
