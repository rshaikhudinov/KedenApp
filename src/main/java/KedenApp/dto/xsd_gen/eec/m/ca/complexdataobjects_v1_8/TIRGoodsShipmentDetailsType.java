
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о товарной партии
 * 
 * <p>Java class for TIRGoodsShipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIRGoodsShipmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LineId"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ContainerIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ContainerId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DepartureCountryDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DestinationCountryDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsignorDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsigneeDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIRGoodsItemDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SealDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitDestinationDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIRGoodsShipmentDetailsType", propOrder = {
    "lineId",
    "containerIndicator",
    "containerId",
    "cargoQuantity",
    "departureCountryDetails",
    "destinationCountryDetails",
    "caValueAmount",
    "consignorDetails",
    "consigneeDetails",
    "tirGoodsItemDetails",
    "sealDetails",
    "transitDestinationDetails"
})
public class TIRGoodsShipmentDetailsType {

    @XmlElement(name = "LineId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lineId;
    @XmlElement(name = "ContainerIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean containerIndicator;
    @XmlElement(name = "ContainerId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> containerId;
    @XmlElement(name = "CargoQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cargoQuantity;
    @XmlElement(name = "DepartureCountryDetails", required = true)
    protected CACountryDetailsType departureCountryDetails;
    @XmlElement(name = "DestinationCountryDetails", required = true)
    protected CACountryDetailsType destinationCountryDetails;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType caValueAmount;
    @XmlElement(name = "ConsignorDetails", required = true)
    protected GoodsShipmentSubjectDetailsType consignorDetails;
    @XmlElement(name = "ConsigneeDetails", required = true)
    protected GoodsShipmentSubjectDetailsType consigneeDetails;
    @XmlElement(name = "TIRGoodsItemDetails", required = true)
    protected List<TIRGoodsItemDetailsType> tirGoodsItemDetails;
    @XmlElement(name = "SealDetails")
    protected List<SealDetailsType> sealDetails;
    @XmlElement(name = "TransitDestinationDetails")
    protected TransitDestinationDetailsType transitDestinationDetails;

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Gets the value of the containerIndicator property.
     * 
     */
    public Boolean isContainerIndicator() {
        return containerIndicator;
    }

    /**
     * Sets the value of the containerIndicator property.
     * 
     */
    public void setContainerIndicator(Boolean value) {
        this.containerIndicator = value;
    }

    /**
     * Gets the value of the containerId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the containerId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContainerId() {
        if (containerId == null) {
            containerId = new ArrayList<String>();
        }
        return this.containerId;
    }

    /**
     * Gets the value of the cargoQuantity property.
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
     * Стоимость декларируемых товаров в валюте цены договора (контракта) или в валюте платежа (оценки)
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getCAValueAmount() {
        return caValueAmount;
    }

    /**
     * Sets the value of the caValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setCAValueAmount(PaymentAmountWithCurrencyType value) {
        this.caValueAmount = value;
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
     * Gets the value of the tirGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tirGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIRGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIRGoodsItemDetailsType }
     * 
     * 
     */
    public List<TIRGoodsItemDetailsType> getTIRGoodsItemDetails() {
        if (tirGoodsItemDetails == null) {
            tirGoodsItemDetails = new ArrayList<TIRGoodsItemDetailsType>();
        }
        return this.tirGoodsItemDetails;
    }

    /**
     * Gets the value of the sealDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sealDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSealDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SealDetailsType }
     * 
     * 
     */
    public List<SealDetailsType> getSealDetails() {
        if (sealDetails == null) {
            sealDetails = new ArrayList<SealDetailsType>();
        }
        return this.sealDetails;
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

}
