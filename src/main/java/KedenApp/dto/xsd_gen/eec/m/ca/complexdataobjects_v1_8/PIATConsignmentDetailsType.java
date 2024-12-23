
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о товарной партии
 * 
 * <p>Java class for PIATConsignmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIATConsignmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIATTransportDocumentDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDocIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DepartureCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DestinationCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedGrossMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIATConsignorDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIATConsigneeDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PISellerDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIBuyerDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIATLoadingLocationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIATUnloadingLocationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDestinationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIContainerDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}UnloadWarehouseDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIATConsignmentItemDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIATConsignmentDetailsType", propOrder = {
    "piatTransportDocumentDetails",
    "customsDocIdDetails",
    "cargoQuantity",
    "departureCountryCode",
    "destinationCountryCode",
    "totalAmount",
    "unifiedGrossMassMeasure",
    "piatConsignorDetails",
    "piatConsigneeDetails",
    "piSellerDetails",
    "piBuyerDetails",
    "piatLoadingLocationDetails",
    "piatUnloadingLocationDetails",
    "atDestinationDetails",
    "piContainerDetails",
    "unloadWarehouseDetails",
    "piatConsignmentItemDetails"
})
public class PIATConsignmentDetailsType {

    @XmlElement(name = "PIATTransportDocumentDetails")
    protected PIATTransportDocumentDetailsType piatTransportDocumentDetails;
    @XmlElement(name = "CustomsDocIdDetails")
    protected CustomsDocumentIdWOrdinalDetailsType customsDocIdDetails;
    @XmlElement(name = "CargoQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cargoQuantity;
    @XmlElement(name = "DepartureCountryCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedCountryCodeType departureCountryCode;
    @XmlElement(name = "DestinationCountryCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedCountryCodeType destinationCountryCode;
    @XmlElement(name = "TotalAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType totalAmount;
    @XmlElement(name = "UnifiedGrossMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedGrossMassMeasure;
    @XmlElement(name = "PIATConsignorDetails")
    protected PIATSubjectDetailsType piatConsignorDetails;
    @XmlElement(name = "PIATConsigneeDetails")
    protected PIATSubjectDetailsType piatConsigneeDetails;
    @XmlElement(name = "PISellerDetails")
    protected CASubjectDetailsV2Type piSellerDetails;
    @XmlElement(name = "PIBuyerDetails")
    protected CASubjectDetailsV2Type piBuyerDetails;
    @XmlElement(name = "PIATLoadingLocationDetails")
    protected PIATCargoLocationDetailsType piatLoadingLocationDetails;
    @XmlElement(name = "PIATUnloadingLocationDetails")
    protected PIATCargoLocationDetailsType piatUnloadingLocationDetails;
    @XmlElement(name = "ATDestinationDetails")
    protected PIATDestinationDetailsType atDestinationDetails;
    @XmlElement(name = "PIContainerDetails")
    protected List<PIContainerDetailsType> piContainerDetails;
    @XmlElement(name = "UnloadWarehouseDetails")
    protected UnloadWarehouseDetailsType unloadWarehouseDetails;
    @XmlElement(name = "PIATConsignmentItemDetails", required = true)
    protected List<PIATConsignmentItemDetailsType> piatConsignmentItemDetails;

    /**
     * Gets the value of the piatTransportDocumentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PIATTransportDocumentDetailsType }
     *     
     */
    public PIATTransportDocumentDetailsType getPIATTransportDocumentDetails() {
        return piatTransportDocumentDetails;
    }

    /**
     * Sets the value of the piatTransportDocumentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIATTransportDocumentDetailsType }
     *     
     */
    public void setPIATTransportDocumentDetails(PIATTransportDocumentDetailsType value) {
        this.piatTransportDocumentDetails = value;
    }

    /**
     * Регистрационный номер таможенной декларации, в соответствии с которой осуществлено предварительное таможенное декларирование
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdWOrdinalDetailsType }
     *     
     */
    public CustomsDocumentIdWOrdinalDetailsType getCustomsDocIdDetails() {
        return customsDocIdDetails;
    }

    /**
     * Sets the value of the customsDocIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdWOrdinalDetailsType }
     *     
     */
    public void setCustomsDocIdDetails(CustomsDocumentIdWOrdinalDetailsType value) {
        this.customsDocIdDetails = value;
    }

    /**
     * Общее количество грузовых мест
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCargoQuantity() {
        return cargoQuantity;
    }

    /**
     * Sets the value of the cargoQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCargoQuantity(BigInteger value) {
        this.cargoQuantity = value;
    }

    /**
     * Gets the value of the departureCountryCode property.
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
     * Gets the value of the destinationCountryCode property.
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
     * Общая стоимость товаров
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
     * Общий вес брутто товаров в товарной партии
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getUnifiedGrossMassMeasure() {
        return unifiedGrossMassMeasure;
    }

    /**
     * Sets the value of the unifiedGrossMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setUnifiedGrossMassMeasure(UnifiedPhysicalMeasureType value) {
        this.unifiedGrossMassMeasure = value;
    }

    /**
     * Gets the value of the piatConsignorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PIATSubjectDetailsType }
     *     
     */
    public PIATSubjectDetailsType getPIATConsignorDetails() {
        return piatConsignorDetails;
    }

    /**
     * Sets the value of the piatConsignorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIATSubjectDetailsType }
     *     
     */
    public void setPIATConsignorDetails(PIATSubjectDetailsType value) {
        this.piatConsignorDetails = value;
    }

    /**
     * Gets the value of the piatConsigneeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PIATSubjectDetailsType }
     *     
     */
    public PIATSubjectDetailsType getPIATConsigneeDetails() {
        return piatConsigneeDetails;
    }

    /**
     * Sets the value of the piatConsigneeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIATSubjectDetailsType }
     *     
     */
    public void setPIATConsigneeDetails(PIATSubjectDetailsType value) {
        this.piatConsigneeDetails = value;
    }

    /**
     * Gets the value of the piSellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CASubjectDetailsV2Type }
     *     
     */
    public CASubjectDetailsV2Type getPISellerDetails() {
        return piSellerDetails;
    }

    /**
     * Sets the value of the piSellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASubjectDetailsV2Type }
     *     
     */
    public void setPISellerDetails(CASubjectDetailsV2Type value) {
        this.piSellerDetails = value;
    }

    /**
     * Gets the value of the piBuyerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CASubjectDetailsV2Type }
     *     
     */
    public CASubjectDetailsV2Type getPIBuyerDetails() {
        return piBuyerDetails;
    }

    /**
     * Sets the value of the piBuyerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASubjectDetailsV2Type }
     *     
     */
    public void setPIBuyerDetails(CASubjectDetailsV2Type value) {
        this.piBuyerDetails = value;
    }

    /**
     * Gets the value of the piatLoadingLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PIATCargoLocationDetailsType }
     *     
     */
    public PIATCargoLocationDetailsType getPIATLoadingLocationDetails() {
        return piatLoadingLocationDetails;
    }

    /**
     * Sets the value of the piatLoadingLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIATCargoLocationDetailsType }
     *     
     */
    public void setPIATLoadingLocationDetails(PIATCargoLocationDetailsType value) {
        this.piatLoadingLocationDetails = value;
    }

    /**
     * Gets the value of the piatUnloadingLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PIATCargoLocationDetailsType }
     *     
     */
    public PIATCargoLocationDetailsType getPIATUnloadingLocationDetails() {
        return piatUnloadingLocationDetails;
    }

    /**
     * Sets the value of the piatUnloadingLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIATCargoLocationDetailsType }
     *     
     */
    public void setPIATUnloadingLocationDetails(PIATCargoLocationDetailsType value) {
        this.piatUnloadingLocationDetails = value;
    }

    /**
     * Gets the value of the atDestinationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PIATDestinationDetailsType }
     *     
     */
    public PIATDestinationDetailsType getATDestinationDetails() {
        return atDestinationDetails;
    }

    /**
     * Sets the value of the atDestinationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIATDestinationDetailsType }
     *     
     */
    public void setATDestinationDetails(PIATDestinationDetailsType value) {
        this.atDestinationDetails = value;
    }

    /**
     * Gets the value of the piContainerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piContainerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIContainerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIContainerDetailsType }
     * 
     * 
     */
    public List<PIContainerDetailsType> getPIContainerDetails() {
        if (piContainerDetails == null) {
            piContainerDetails = new ArrayList<PIContainerDetailsType>();
        }
        return this.piContainerDetails;
    }

    /**
     * Gets the value of the unloadWarehouseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UnloadWarehouseDetailsType }
     *     
     */
    public UnloadWarehouseDetailsType getUnloadWarehouseDetails() {
        return unloadWarehouseDetails;
    }

    /**
     * Sets the value of the unloadWarehouseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnloadWarehouseDetailsType }
     *     
     */
    public void setUnloadWarehouseDetails(UnloadWarehouseDetailsType value) {
        this.unloadWarehouseDetails = value;
    }

    /**
     * Gets the value of the piatConsignmentItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piatConsignmentItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIATConsignmentItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIATConsignmentItemDetailsType }
     * 
     * 
     */
    public List<PIATConsignmentItemDetailsType> getPIATConsignmentItemDetails() {
        if (piatConsignmentItemDetails == null) {
            piatConsignmentItemDetails = new ArrayList<PIATConsignmentItemDetailsType>();
        }
        return this.piatConsignmentItemDetails;
    }

}
