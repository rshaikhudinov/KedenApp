
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * сведения об обстоятельствах проведения таможенного контроля или совершения иных действий в отношении объектов контроля
 * 
 * <p>Java class for ATDInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDInformationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsignorV2Details" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsigneeV2Details" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DestinationCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DepartureCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportMeansIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsInspectionIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}InternationalMailId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDLocationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDCustomsToolsDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDGoodsDetentionReasonDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDInformationSamplesSelectionDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDGoodsDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDInformationTransportMeansDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDSealDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDRadiationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDResultsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SeizureIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDSamplesSelectionDocIdDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsPersonIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDAttachmentsDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDStatementDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDInformationDetailsType", propOrder = {
    "consignorV2Details",
    "consigneeV2Details",
    "destinationCountryCode",
    "departureCountryCode",
    "transportMeansIndicator",
    "goodsInspectionIndicator",
    "internationalMailId",
    "atdDocDetails",
    "atdLocationDetails",
    "atdCustomsToolsDetails",
    "atdGoodsDetentionReasonDetails",
    "atdInformationSamplesSelectionDetails",
    "atdGoodsDetails",
    "atdInformationTransportMeansDetails",
    "atdSealDetails",
    "atdRadiationDetails",
    "totalAmount",
    "atdResultsDetails",
    "seizureIndicator",
    "atdSamplesSelectionDocIdDetails",
    "customsPersonIndicator",
    "atdAttachmentsDetails",
    "atdStatementDetails"
})
public class ATDInformationDetailsType {

    @XmlElement(name = "ConsignorV2Details")
    protected CASubjectDetailsType consignorV2Details;
    @XmlElement(name = "ConsigneeV2Details")
    protected CASubjectDetailsType consigneeV2Details;
    @XmlElement(name = "DestinationCountryCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedCountryCodeType destinationCountryCode;
    @XmlElement(name = "DepartureCountryCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedCountryCodeType departureCountryCode;
    @XmlElement(name = "TransportMeansIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean transportMeansIndicator;
    @XmlElement(name = "GoodsInspectionIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean goodsInspectionIndicator;
    @XmlElement(name = "InternationalMailId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internationalMailId;
    @XmlElement(name = "ATDDocDetails")
    protected List<ATDDocDetailsType> atdDocDetails;
    @XmlElement(name = "ATDLocationDetails")
    protected ATDLocationDetailsType atdLocationDetails;
    @XmlElement(name = "ATDCustomsToolsDetails")
    protected List<ATDCustomsToolsDetailsType> atdCustomsToolsDetails;
    @XmlElement(name = "ATDGoodsDetentionReasonDetails")
    protected ATDGoodsDetentionReasonDetailsType atdGoodsDetentionReasonDetails;
    @XmlElement(name = "ATDInformationSamplesSelectionDetails")
    protected ATDInformationSamplesSelectionDetailsType atdInformationSamplesSelectionDetails;
    @XmlElement(name = "ATDGoodsDetails")
    protected List<ATDGoodsDetailsType> atdGoodsDetails;
    @XmlElement(name = "ATDInformationTransportMeansDetails")
    protected List<ATDInformationTransportMeansDetailsType> atdInformationTransportMeansDetails;
    @XmlElement(name = "ATDSealDetails")
    protected ATDSealDetailsType atdSealDetails;
    @XmlElement(name = "ATDRadiationDetails")
    protected ATDRadiationDetailsType atdRadiationDetails;
    @XmlElement(name = "TotalAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType totalAmount;
    @XmlElement(name = "ATDResultsDetails")
    protected ATDResultsDetailsType atdResultsDetails;
    @XmlElement(name = "SeizureIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean seizureIndicator;
    @XmlElement(name = "ATDSamplesSelectionDocIdDetails")
    protected List<InspectionDocIdDetailsType> atdSamplesSelectionDocIdDetails;
    @XmlElement(name = "CustomsPersonIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean customsPersonIndicator;
    @XmlElement(name = "ATDAttachmentsDetails")
    protected List<ATDAttachmentsDetailsType> atdAttachmentsDetails;
    @XmlElement(name = "ATDStatementDetails")
    protected List<ATDStatementDetailsType> atdStatementDetails;

    /**
     * Gets the value of the consignorV2Details property.
     * 
     * @return
     *     possible object is
     *     {@link CASubjectDetailsType }
     *     
     */
    public CASubjectDetailsType getConsignorV2Details() {
        return consignorV2Details;
    }

    /**
     * Sets the value of the consignorV2Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASubjectDetailsType }
     *     
     */
    public void setConsignorV2Details(CASubjectDetailsType value) {
        this.consignorV2Details = value;
    }

    /**
     * Gets the value of the consigneeV2Details property.
     * 
     * @return
     *     possible object is
     *     {@link CASubjectDetailsType }
     *     
     */
    public CASubjectDetailsType getConsigneeV2Details() {
        return consigneeV2Details;
    }

    /**
     * Sets the value of the consigneeV2Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASubjectDetailsType }
     *     
     */
    public void setConsigneeV2Details(CASubjectDetailsType value) {
        this.consigneeV2Details = value;
    }

    /**
     * кодовое обозначение страны ввоза (назначения)
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public UnifiedCountryCodeType getDestinationCountryCode() {
        return destinationCountryCode;
    }

    /**
     * Sets the value of the destinationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public void setDestinationCountryCode(UnifiedCountryCodeType value) {
        this.destinationCountryCode = value;
    }

    /**
     * кодовое обозначение страны вывоза (отправления)
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public UnifiedCountryCodeType getDepartureCountryCode() {
        return departureCountryCode;
    }

    /**
     * Sets the value of the departureCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public void setDepartureCountryCode(UnifiedCountryCodeType value) {
        this.departureCountryCode = value;
    }

    /**
     * Gets the value of the transportMeansIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTransportMeansIndicator() {
        return transportMeansIndicator;
    }

    /**
     * Sets the value of the transportMeansIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTransportMeansIndicator(Boolean value) {
        this.transportMeansIndicator = value;
    }

    /**
     * Gets the value of the goodsInspectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoodsInspectionIndicator() {
        return goodsInspectionIndicator;
    }

    /**
     * Sets the value of the goodsInspectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoodsInspectionIndicator(Boolean value) {
        this.goodsInspectionIndicator = value;
    }

    /**
     * Gets the value of the internationalMailId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalMailId() {
        return internationalMailId;
    }

    /**
     * Sets the value of the internationalMailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalMailId(String value) {
        this.internationalMailId = value;
    }

    /**
     * Gets the value of the atdDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATDDocDetailsType }
     * 
     * 
     */
    public List<ATDDocDetailsType> getATDDocDetails() {
        if (atdDocDetails == null) {
            atdDocDetails = new ArrayList<ATDDocDetailsType>();
        }
        return this.atdDocDetails;
    }

    /**
     * Сведения о месте проведения таможенного досмотра (осмотра)
     * 
     * @return
     *     possible object is
     *     {@link ATDLocationDetailsType }
     *     
     */
    public ATDLocationDetailsType getATDLocationDetails() {
        return atdLocationDetails;
    }

    /**
     * Sets the value of the atdLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDLocationDetailsType }
     *     
     */
    public void setATDLocationDetails(ATDLocationDetailsType value) {
        this.atdLocationDetails = value;
    }

    /**
     * Gets the value of the atdCustomsToolsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdCustomsToolsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDCustomsToolsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATDCustomsToolsDetailsType }
     * 
     * 
     */
    public List<ATDCustomsToolsDetailsType> getATDCustomsToolsDetails() {
        if (atdCustomsToolsDetails == null) {
            atdCustomsToolsDetails = new ArrayList<ATDCustomsToolsDetailsType>();
        }
        return this.atdCustomsToolsDetails;
    }

    /**
     * Gets the value of the atdGoodsDetentionReasonDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDGoodsDetentionReasonDetailsType }
     *     
     */
    public ATDGoodsDetentionReasonDetailsType getATDGoodsDetentionReasonDetails() {
        return atdGoodsDetentionReasonDetails;
    }

    /**
     * Sets the value of the atdGoodsDetentionReasonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDGoodsDetentionReasonDetailsType }
     *     
     */
    public void setATDGoodsDetentionReasonDetails(ATDGoodsDetentionReasonDetailsType value) {
        this.atdGoodsDetentionReasonDetails = value;
    }

    /**
     * Gets the value of the atdInformationSamplesSelectionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDInformationSamplesSelectionDetailsType }
     *     
     */
    public ATDInformationSamplesSelectionDetailsType getATDInformationSamplesSelectionDetails() {
        return atdInformationSamplesSelectionDetails;
    }

    /**
     * Sets the value of the atdInformationSamplesSelectionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDInformationSamplesSelectionDetailsType }
     *     
     */
    public void setATDInformationSamplesSelectionDetails(ATDInformationSamplesSelectionDetailsType value) {
        this.atdInformationSamplesSelectionDetails = value;
    }

    /**
     * Gets the value of the atdGoodsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdGoodsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDGoodsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATDGoodsDetailsType }
     * 
     * 
     */
    public List<ATDGoodsDetailsType> getATDGoodsDetails() {
        if (atdGoodsDetails == null) {
            atdGoodsDetails = new ArrayList<ATDGoodsDetailsType>();
        }
        return this.atdGoodsDetails;
    }

    /**
     * Gets the value of the atdInformationTransportMeansDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdInformationTransportMeansDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDInformationTransportMeansDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATDInformationTransportMeansDetailsType }
     * 
     * 
     */
    public List<ATDInformationTransportMeansDetailsType> getATDInformationTransportMeansDetails() {
        if (atdInformationTransportMeansDetails == null) {
            atdInformationTransportMeansDetails = new ArrayList<ATDInformationTransportMeansDetailsType>();
        }
        return this.atdInformationTransportMeansDetails;
    }

    /**
     * Gets the value of the atdSealDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDSealDetailsType }
     *     
     */
    public ATDSealDetailsType getATDSealDetails() {
        return atdSealDetails;
    }

    /**
     * Sets the value of the atdSealDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDSealDetailsType }
     *     
     */
    public void setATDSealDetails(ATDSealDetailsType value) {
        this.atdSealDetails = value;
    }

    /**
     * Gets the value of the atdRadiationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDRadiationDetailsType }
     *     
     */
    public ATDRadiationDetailsType getATDRadiationDetails() {
        return atdRadiationDetails;
    }

    /**
     * Sets the value of the atdRadiationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDRadiationDetailsType }
     *     
     */
    public void setATDRadiationDetails(ATDRadiationDetailsType value) {
        this.atdRadiationDetails = value;
    }

    /**
     * Общая стоимость задержанных товаров
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setTotalAmount(PaymentAmountWithCurrencyType value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the atdResultsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDResultsDetailsType }
     *     
     */
    public ATDResultsDetailsType getATDResultsDetails() {
        return atdResultsDetails;
    }

    /**
     * Sets the value of the atdResultsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDResultsDetailsType }
     *     
     */
    public void setATDResultsDetails(ATDResultsDetailsType value) {
        this.atdResultsDetails = value;
    }

    /**
     * Gets the value of the seizureIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeizureIndicator() {
        return seizureIndicator;
    }

    /**
     * Sets the value of the seizureIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeizureIndicator(Boolean value) {
        this.seizureIndicator = value;
    }

    /**
     * Gets the value of the atdSamplesSelectionDocIdDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdSamplesSelectionDocIdDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDSamplesSelectionDocIdDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InspectionDocIdDetailsType }
     * 
     * 
     */
    public List<InspectionDocIdDetailsType> getATDSamplesSelectionDocIdDetails() {
        if (atdSamplesSelectionDocIdDetails == null) {
            atdSamplesSelectionDocIdDetails = new ArrayList<InspectionDocIdDetailsType>();
        }
        return this.atdSamplesSelectionDocIdDetails;
    }

    /**
     * Gets the value of the customsPersonIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCustomsPersonIndicator() {
        return customsPersonIndicator;
    }

    /**
     * Sets the value of the customsPersonIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCustomsPersonIndicator(Boolean value) {
        this.customsPersonIndicator = value;
    }

    /**
     * Gets the value of the atdAttachmentsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdAttachmentsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDAttachmentsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATDAttachmentsDetailsType }
     * 
     * 
     */
    public List<ATDAttachmentsDetailsType> getATDAttachmentsDetails() {
        if (atdAttachmentsDetails == null) {
            atdAttachmentsDetails = new ArrayList<ATDAttachmentsDetailsType>();
        }
        return this.atdAttachmentsDetails;
    }

    /**
     * Gets the value of the atdStatementDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdStatementDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDStatementDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATDStatementDetailsType }
     * 
     * 
     */
    public List<ATDStatementDetailsType> getATDStatementDetails() {
        if (atdStatementDetails == null) {
            atdStatementDetails = new ArrayList<ATDStatementDetailsType>();
        }
        return this.atdStatementDetails;
    }

}
