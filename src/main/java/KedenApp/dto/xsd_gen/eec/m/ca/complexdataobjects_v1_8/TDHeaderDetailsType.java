
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransitProcedureCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие общие сведения транзитной декларации
 * 
 * <p>Java class for TDHeaderDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDHeaderDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TDDeclarationKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitProcedureCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitFeatureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PageQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalPagesQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RailwayStatementIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsQuantity"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedGrossMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoQuantity"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CurrencyCostAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DepartureCountryDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DestinationCountryDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DepartureTransportDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BorderTransportsDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDHeaderDetailsType", propOrder = {
    "tdDeclarationKindCode",
    "transitProcedureCode",
    "transitFeatureCode",
    "pageQuantity",
    "totalPagesQuantity",
    "railwayStatementIndicator",
    "goodsQuantity",
    "unifiedGrossMassMeasure",
    "cargoQuantity",
    "currencyCostAmount",
    "departureCountryDetails",
    "destinationCountryDetails",
    "departureTransportDetails",
    "borderTransportsDetails"
})
public class TDHeaderDetailsType {

    @XmlElement(name = "TDDeclarationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tdDeclarationKindCode;
    @XmlElement(name = "TransitProcedureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected TransitProcedureCodeType transitProcedureCode;
    @XmlElement(name = "TransitFeatureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transitFeatureCode;
    @XmlElement(name = "PageQuantity", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pageQuantity;
    @XmlElement(name = "TotalPagesQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalPagesQuantity;
    @XmlElement(name = "RailwayStatementIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean railwayStatementIndicator;
    @XmlElement(name = "GoodsQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger goodsQuantity;
    @XmlElement(name = "UnifiedGrossMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedGrossMassMeasure;
    @XmlElement(name = "CargoQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cargoQuantity;
    @XmlElement(name = "CurrencyCostAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedAmountWithCurrencyType currencyCostAmount;
    @XmlElement(name = "DepartureCountryDetails", required = true)
    protected CACountryDetailsType departureCountryDetails;
    @XmlElement(name = "DestinationCountryDetails", required = true)
    protected CACountryDetailsType destinationCountryDetails;
    @XmlElement(name = "DepartureTransportDetails", required = true)
    protected CATransportMeansDetailsType departureTransportDetails;
    @XmlElement(name = "BorderTransportsDetails")
    protected CATransportMeansDetailsType borderTransportsDetails;

    /**
     * Gets the value of the tdDeclarationKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDDeclarationKindCode() {
        return tdDeclarationKindCode;
    }

    /**
     * Sets the value of the tdDeclarationKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDDeclarationKindCode(String value) {
        this.tdDeclarationKindCode = value;
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
     * Количество листов транзитной декларации
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPageQuantity() {
        return pageQuantity;
    }

    /**
     * Sets the value of the pageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPageQuantity(BigInteger value) {
        this.pageQuantity = value;
    }

    /**
     * Общее количество листов всех документов
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPagesQuantity() {
        return totalPagesQuantity;
    }

    /**
     * Sets the value of the totalPagesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPagesQuantity(BigInteger value) {
        this.totalPagesQuantity = value;
    }

    /**
     * Признак железнодорожной ведомости: 0 – железнодорожная ведомость не используется в транзитной декларации; 1 – железнодорожная ведомость используется в транзитной декларации
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRailwayStatementIndicator() {
        return railwayStatementIndicator;
    }

    /**
     * Sets the value of the railwayStatementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRailwayStatementIndicator(Boolean value) {
        this.railwayStatementIndicator = value;
    }

    /**
     * Общее число товаров
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
     * Общий вес брутто
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
     * Общая стоимость товаров
     * 
     * @return
     *     possible object is
     *     {@link UnifiedAmountWithCurrencyType }
     *     
     */
    public UnifiedAmountWithCurrencyType getCurrencyCostAmount() {
        return currencyCostAmount;
    }

    /**
     * Sets the value of the currencyCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedAmountWithCurrencyType }
     *     
     */
    public void setCurrencyCostAmount(UnifiedAmountWithCurrencyType value) {
        this.currencyCostAmount = value;
    }

    /**
     * Gets the value of the departureCountryDetails property.
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
     * Gets the value of the destinationCountryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryDetailsType }
     *     
     */
    public CACountryDetailsType getDestinationCountryDetails() {
        return destinationCountryDetails;
    }

    /**
     * Sets the value of the destinationCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryDetailsType }
     *     
     */
    public void setDestinationCountryDetails(CACountryDetailsType value) {
        this.destinationCountryDetails = value;
    }

    /**
     * Сведения о транспортном средстве при отправлении
     * 
     * @return
     *     possible object is
     *     {@link CATransportMeansDetailsType }
     *     
     */
    public CATransportMeansDetailsType getDepartureTransportDetails() {
        return departureTransportDetails;
    }

    /**
     * Sets the value of the departureTransportDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATransportMeansDetailsType }
     *     
     */
    public void setDepartureTransportDetails(CATransportMeansDetailsType value) {
        this.departureTransportDetails = value;
    }

    /**
     * Gets the value of the borderTransportsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CATransportMeansDetailsType }
     *     
     */
    public CATransportMeansDetailsType getBorderTransportsDetails() {
        return borderTransportsDetails;
    }

    /**
     * Sets the value of the borderTransportsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATransportMeansDetailsType }
     *     
     */
    public void setBorderTransportsDetails(CATransportMeansDetailsType value) {
        this.borderTransportsDetails = value;
    }

}
