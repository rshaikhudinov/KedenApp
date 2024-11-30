
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransitProcedureCodeType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о товарной партии
 * 
 * <p>Java class for PIVConsignmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIVConsignmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreliminaryInformationUsageCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransportDocumentDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDocIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DeclarationKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitProcedureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitFeatureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DepartureCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DestinationCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedGrossMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIConsignorDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIConsigneeDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIVLoadingLocationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}UnloadingIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIVUnloadingLocationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DestinationCustomsOfficeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FactDepartureLocationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIContainerDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsIdentificationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PITransitTransportMeansDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitDestinationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PITranshipmentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}UnloadWarehouseDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIVConsignmentItemDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitGuaranteeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PITransitDeclarantDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIUnionCarrierDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIVConsignmentDetailsType", propOrder = {
    "preliminaryInformationUsageCode",
    "transportDocumentDetails",
    "customsDocIdDetails",
    "declarationKindCode",
    "transitProcedureCode",
    "transitFeatureCode",
    "goodsQuantity",
    "cargoQuantity",
    "departureCountryCode",
    "destinationCountryCode",
    "totalAmount",
    "unifiedGrossMassMeasure",
    "piConsignorDetails",
    "piConsigneeDetails",
    "pivLoadingLocationDetails",
    "unloadingIndicator",
    "pivUnloadingLocationDetails",
    "destinationCustomsOfficeCode",
    "factDepartureLocationDetails",
    "piContainerDetails",
    "customsIdentificationDetails",
    "piTransitTransportMeansDetails",
    "transitDestinationDetails",
    "piTranshipmentDetails",
    "unloadWarehouseDetails",
    "pivConsignmentItemDetails",
    "transitGuaranteeDetails",
    "piTransitDeclarantDetails",
    "piUnionCarrierDetails"
})
public class PIVConsignmentDetailsType {

    @XmlElement(name = "PreliminaryInformationUsageCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> preliminaryInformationUsageCode;
    @XmlElement(name = "TransportDocumentDetails", required = true)
    protected DocDetailsV4Type transportDocumentDetails;
    @XmlElement(name = "CustomsDocIdDetails")
    protected CustomsDocumentIdWOrdinalDetailsType customsDocIdDetails;
    @XmlElement(name = "DeclarationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String declarationKindCode;
    @XmlElement(name = "TransitProcedureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected TransitProcedureCodeType transitProcedureCode;
    @XmlElement(name = "TransitFeatureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transitFeatureCode;
    @XmlElement(name = "GoodsQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger goodsQuantity;
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
    @XmlElement(name = "PIConsignorDetails")
    protected CASubjectDetailsV2Type piConsignorDetails;
    @XmlElement(name = "PIConsigneeDetails")
    protected CASubjectDetailsV2Type piConsigneeDetails;
    @XmlElement(name = "PIVLoadingLocationDetails")
    protected PICargoLocationDetailsType pivLoadingLocationDetails;
    @XmlElement(name = "UnloadingIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean unloadingIndicator;
    @XmlElement(name = "PIVUnloadingLocationDetails")
    protected PICargoLocationDetailsType pivUnloadingLocationDetails;
    @XmlElement(name = "DestinationCustomsOfficeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String destinationCustomsOfficeCode;
    @XmlElement(name = "FactDepartureLocationDetails")
    protected PICargoLocationDetailsType factDepartureLocationDetails;
    @XmlElement(name = "PIContainerDetails")
    protected List<PIContainerDetailsType> piContainerDetails;
    @XmlElement(name = "CustomsIdentificationDetails")
    protected CustomsIdentificationDetailsType customsIdentificationDetails;
    @XmlElement(name = "PITransitTransportMeansDetails")
    protected PITransitTransportMeansDetailsType piTransitTransportMeansDetails;
    @XmlElement(name = "TransitDestinationDetails")
    protected TransitDestinationDetailsType transitDestinationDetails;
    @XmlElement(name = "PITranshipmentDetails")
    protected List<PITranshipmentDetailsType> piTranshipmentDetails;
    @XmlElement(name = "UnloadWarehouseDetails")
    protected UnloadWarehouseDetailsType unloadWarehouseDetails;
    @XmlElement(name = "PIVConsignmentItemDetails", required = true)
    protected List<PIVConsignmentItemDetailsType> pivConsignmentItemDetails;
    @XmlElement(name = "TransitGuaranteeDetails")
    protected List<TransitGuaranteeDetailsType> transitGuaranteeDetails;
    @XmlElement(name = "PITransitDeclarantDetails")
    protected PITransitDeclarantDetailsType piTransitDeclarantDetails;
    @XmlElement(name = "PIUnionCarrierDetails")
    protected CarrierDetailsType piUnionCarrierDetails;

    /**
     * Gets the value of the preliminaryInformationUsageCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the preliminaryInformationUsageCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreliminaryInformationUsageCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPreliminaryInformationUsageCode() {
        if (preliminaryInformationUsageCode == null) {
            preliminaryInformationUsageCode = new ArrayList<String>();
        }
        return this.preliminaryInformationUsageCode;
    }

    /**
     * Gets the value of the transportDocumentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getTransportDocumentDetails() {
        return transportDocumentDetails;
    }

    /**
     * Sets the value of the transportDocumentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setTransportDocumentDetails(DocDetailsV4Type value) {
        this.transportDocumentDetails = value;
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
     * код типа таможенной декларации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarationKindCode() {
        return declarationKindCode;
    }

    /**
     * Sets the value of the declarationKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarationKindCode(String value) {
        this.declarationKindCode = value;
    }

    /**
     * Gets the value of the transitProcedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransitProcedureCodeType }
     *     
     */
    public TransitProcedureCodeType getTransitProcedureCode() {
        return transitProcedureCode;
    }

    /**
     * Sets the value of the transitProcedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitProcedureCodeType }
     *     
     */
    public void setTransitProcedureCode(TransitProcedureCodeType value) {
        this.transitProcedureCode = value;
    }

    /**
     * Gets the value of the transitFeatureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitFeatureCode() {
        return transitFeatureCode;
    }

    /**
     * Sets the value of the transitFeatureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitFeatureCode(String value) {
        this.transitFeatureCode = value;
    }

    /**
     * Общее число товаров по транспортному (перевозочному) документу
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGoodsQuantity() {
        return goodsQuantity;
    }

    /**
     * Sets the value of the goodsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGoodsQuantity(BigInteger value) {
        this.goodsQuantity = value;
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
     * Gets the value of the piConsignorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CASubjectDetailsV2Type }
     *     
     */
    public CASubjectDetailsV2Type getPIConsignorDetails() {
        return piConsignorDetails;
    }

    /**
     * Sets the value of the piConsignorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASubjectDetailsV2Type }
     *     
     */
    public void setPIConsignorDetails(CASubjectDetailsV2Type value) {
        this.piConsignorDetails = value;
    }

    /**
     * Gets the value of the piConsigneeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CASubjectDetailsV2Type }
     *     
     */
    public CASubjectDetailsV2Type getPIConsigneeDetails() {
        return piConsigneeDetails;
    }

    /**
     * Sets the value of the piConsigneeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CASubjectDetailsV2Type }
     *     
     */
    public void setPIConsigneeDetails(CASubjectDetailsV2Type value) {
        this.piConsigneeDetails = value;
    }

    /**
     * Gets the value of the pivLoadingLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PICargoLocationDetailsType }
     *     
     */
    public PICargoLocationDetailsType getPIVLoadingLocationDetails() {
        return pivLoadingLocationDetails;
    }

    /**
     * Sets the value of the pivLoadingLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PICargoLocationDetailsType }
     *     
     */
    public void setPIVLoadingLocationDetails(PICargoLocationDetailsType value) {
        this.pivLoadingLocationDetails = value;
    }

    /**
     * признак выгрузки товаров в портах государства - члена Евразийского экономического союза
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnloadingIndicator() {
        return unloadingIndicator;
    }

    /**
     * Sets the value of the unloadingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnloadingIndicator(Boolean value) {
        this.unloadingIndicator = value;
    }

    /**
     * Gets the value of the pivUnloadingLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PICargoLocationDetailsType }
     *     
     */
    public PICargoLocationDetailsType getPIVUnloadingLocationDetails() {
        return pivUnloadingLocationDetails;
    }

    /**
     * Sets the value of the pivUnloadingLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PICargoLocationDetailsType }
     *     
     */
    public void setPIVUnloadingLocationDetails(PICargoLocationDetailsType value) {
        this.pivUnloadingLocationDetails = value;
    }

    /**
     * сведения о таможенном органе назначения, указываемые при принятии решения в отношении подкарантинной продукции
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCustomsOfficeCode() {
        return destinationCustomsOfficeCode;
    }

    /**
     * Sets the value of the destinationCustomsOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCustomsOfficeCode(String value) {
        this.destinationCustomsOfficeCode = value;
    }

    /**
     * Gets the value of the factDepartureLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PICargoLocationDetailsType }
     *     
     */
    public PICargoLocationDetailsType getFactDepartureLocationDetails() {
        return factDepartureLocationDetails;
    }

    /**
     * Sets the value of the factDepartureLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PICargoLocationDetailsType }
     *     
     */
    public void setFactDepartureLocationDetails(PICargoLocationDetailsType value) {
        this.factDepartureLocationDetails = value;
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
     * Gets the value of the piTransitTransportMeansDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PITransitTransportMeansDetailsType }
     *     
     */
    public PITransitTransportMeansDetailsType getPITransitTransportMeansDetails() {
        return piTransitTransportMeansDetails;
    }

    /**
     * Sets the value of the piTransitTransportMeansDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PITransitTransportMeansDetailsType }
     *     
     */
    public void setPITransitTransportMeansDetails(PITransitTransportMeansDetailsType value) {
        this.piTransitTransportMeansDetails = value;
    }

    /**
     * сведения о предполагаемом таможенном органе и пункте назначения при осуществлении перевозки товаров в соответствии с таможенной процедурой таможенного транзита
     * 
     * @return
     *     possible object is
     *     {@link TransitDestinationDetailsType }
     *     
     */
    public TransitDestinationDetailsType getTransitDestinationDetails() {
        return transitDestinationDetails;
    }

    /**
     * Sets the value of the transitDestinationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitDestinationDetailsType }
     *     
     */
    public void setTransitDestinationDetails(TransitDestinationDetailsType value) {
        this.transitDestinationDetails = value;
    }

    /**
     * сведения о планируемых грузовых операциях Gets the value of the piTranshipmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piTranshipmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPITranshipmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PITranshipmentDetailsType }
     * 
     * 
     */
    public List<PITranshipmentDetailsType> getPITranshipmentDetails() {
        if (piTranshipmentDetails == null) {
            piTranshipmentDetails = new ArrayList<PITranshipmentDetailsType>();
        }
        return this.piTranshipmentDetails;
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
     * Gets the value of the pivConsignmentItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pivConsignmentItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIVConsignmentItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIVConsignmentItemDetailsType }
     * 
     * 
     */
    public List<PIVConsignmentItemDetailsType> getPIVConsignmentItemDetails() {
        if (pivConsignmentItemDetails == null) {
            pivConsignmentItemDetails = new ArrayList<PIVConsignmentItemDetailsType>();
        }
        return this.pivConsignmentItemDetails;
    }

    /**
     * Gets the value of the transitGuaranteeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transitGuaranteeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitGuaranteeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitGuaranteeDetailsType }
     * 
     * 
     */
    public List<TransitGuaranteeDetailsType> getTransitGuaranteeDetails() {
        if (transitGuaranteeDetails == null) {
            transitGuaranteeDetails = new ArrayList<TransitGuaranteeDetailsType>();
        }
        return this.transitGuaranteeDetails;
    }

    /**
     * Gets the value of the piTransitDeclarantDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PITransitDeclarantDetailsType }
     *     
     */
    public PITransitDeclarantDetailsType getPITransitDeclarantDetails() {
        return piTransitDeclarantDetails;
    }

    /**
     * Sets the value of the piTransitDeclarantDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PITransitDeclarantDetailsType }
     *     
     */
    public void setPITransitDeclarantDetails(PITransitDeclarantDetailsType value) {
        this.piTransitDeclarantDetails = value;
    }

    /**
     * Сведения о перевозчике, осуществляющем перевозку товаров по таможенной территории Евразийского экономического союза, в том числе в соответствии с таможенной процедурой таможенного транзита
     * 
     * @return
     *     possible object is
     *     {@link CarrierDetailsType }
     *     
     */
    public CarrierDetailsType getPIUnionCarrierDetails() {
        return piUnionCarrierDetails;
    }

    /**
     * Sets the value of the piUnionCarrierDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierDetailsType }
     *     
     */
    public void setPIUnionCarrierDetails(CarrierDetailsType value) {
        this.piUnionCarrierDetails = value;
    }

}
