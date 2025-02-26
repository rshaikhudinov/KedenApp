
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о товарной партии в транзитной декларации
 * 
 * <p>Java class for TDGoodsShipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDGoodsShipmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObjectOrdinal"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransportDocumentDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DepartureCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DestinationCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalGrossMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsignorDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsigneeDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitDestinationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitGoodsItemDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDGoodsShipmentDetailsType", propOrder = {
    "objectOrdinal",
    "transportDocumentDetails",
    "goodsQuantity",
    "cargoQuantity",
    "departureCountryCode",
    "destinationCountryCode",
    "totalGrossMassMeasure",
    "totalAmount",
    "consignorDetails",
    "consigneeDetails",
    "transitDestinationDetails",
    "transitGoodsItemDetails"
})
public class TDGoodsShipmentDetailsType {

    @XmlElement(name = "ObjectOrdinal", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger objectOrdinal;
    @XmlElement(name = "TransportDocumentDetails")
    protected DocDetailsV4Type transportDocumentDetails;
    @XmlElement(name = "GoodsQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger goodsQuantity;
    @XmlElement(name = "CargoQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cargoQuantity;
    @XmlElement(name = "DepartureCountryCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected UnifiedCountryCodeType departureCountryCode;
    @XmlElement(name = "DestinationCountryCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected UnifiedCountryCodeType destinationCountryCode;
    @XmlElement(name = "TotalGrossMassMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType totalGrossMassMeasure;
    @XmlElement(name = "TotalAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType totalAmount;
    @XmlElement(name = "ConsignorDetails", required = true)
    protected GoodsShipmentSubjectDetailsType consignorDetails;
    @XmlElement(name = "ConsigneeDetails", required = true)
    protected GoodsShipmentSubjectDetailsType consigneeDetails;
    @XmlElement(name = "TransitDestinationDetails", required = true)
    protected TransitDestinationDetailsType transitDestinationDetails;
    @XmlElement(name = "TransitGoodsItemDetails", required = true)
    protected List<TransitGoodsItemDetailsType> transitGoodsItemDetails;

    /**
     * Порядковый номер товарной партии
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectOrdinal() {
        return objectOrdinal;
    }

    /**
     * Sets the value of the objectOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectOrdinal(BigInteger value) {
        this.objectOrdinal = value;
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
     * Общее количество (число) товаров в товарной партии
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
     * Общее количество грузовых мест в товарной партии
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
     * Общий вес брутто товаров в товарной партии
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getTotalGrossMassMeasure() {
        return totalGrossMassMeasure;
    }

    /**
     * Sets the value of the totalGrossMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setTotalGrossMassMeasure(UnifiedPhysicalMeasureType value) {
        this.totalGrossMassMeasure = value;
    }

    /**
     * Общая стоимость товаров в товарной партии
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
     * Gets the value of the consignorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public GoodsShipmentSubjectDetailsType getConsignorDetails() {
        return consignorDetails;
    }

    /**
     * Sets the value of the consignorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public void setConsignorDetails(GoodsShipmentSubjectDetailsType value) {
        this.consignorDetails = value;
    }

    /**
     * Gets the value of the consigneeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public GoodsShipmentSubjectDetailsType getConsigneeDetails() {
        return consigneeDetails;
    }

    /**
     * Sets the value of the consigneeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public void setConsigneeDetails(GoodsShipmentSubjectDetailsType value) {
        this.consigneeDetails = value;
    }

    /**
     * Gets the value of the transitDestinationDetails property.
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
     * Gets the value of the transitGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transitGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitGoodsItemDetailsType }
     * 
     * 
     */
    public List<TransitGoodsItemDetailsType> getTransitGoodsItemDetails() {
        if (transitGoodsItemDetails == null) {
            transitGoodsItemDetails = new ArrayList<TransitGoodsItemDetailsType>();
        }
        return this.transitGoodsItemDetails;
    }

}
