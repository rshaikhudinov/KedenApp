
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о перевозке товаров
 * 
 * <p>Java class for DTExchGoodsShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTExchGoodsShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTGoodsShipmentBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsQuantity"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ContainerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsLocationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTExhcGoodsItemDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BorderTransportsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DepartureTransportDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DelayPaymentsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTExchFactPaymentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTExchGoodsShipmentType", propOrder = {
    "goodsQuantity",
    "cargoQuantity",
    "containerIndicator",
    "goodsLocationDetails",
    "dtExhcGoodsItemDetails",
    "borderTransportsDetails",
    "departureTransportDetails",
    "delayPaymentsDetails",
    "dtExchFactPaymentDetails"
})
public class DTExchGoodsShipmentType
    extends DTGoodsShipmentBaseType
{

    @XmlElement(name = "GoodsQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger goodsQuantity;
    @XmlElement(name = "CargoQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cargoQuantity;
    @XmlElement(name = "ContainerIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean containerIndicator;
    @XmlElement(name = "GoodsLocationDetails")
    protected GoodsLocationDetailsType goodsLocationDetails;
    @XmlElement(name = "DTExhcGoodsItemDetails", required = true)
    protected List<DTExchGoodsItemDetailsType> dtExhcGoodsItemDetails;
    @XmlElement(name = "BorderTransportsDetails")
    protected CATransportMeansDetailsType borderTransportsDetails;
    @XmlElement(name = "DepartureTransportDetails")
    protected CATransportMeansDetailsType departureTransportDetails;
    @XmlElement(name = "DelayPaymentsDetails")
    protected DelayPaymentsDetailsType delayPaymentsDetails;
    @XmlElement(name = "DTExchFactPaymentDetails")
    protected List<DTExchFactPaymentDetailsType> dtExchFactPaymentDetails;

    /**
     * Gets the value of the goodsQuantity property.
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
     * Gets the value of the containerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainerIndicator() {
        return containerIndicator;
    }

    /**
     * Sets the value of the containerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainerIndicator(Boolean value) {
        this.containerIndicator = value;
    }

    /**
     * Gets the value of the goodsLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsLocationDetailsType }
     *     
     */
    public GoodsLocationDetailsType getGoodsLocationDetails() {
        return goodsLocationDetails;
    }

    /**
     * Sets the value of the goodsLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsLocationDetailsType }
     *     
     */
    public void setGoodsLocationDetails(GoodsLocationDetailsType value) {
        this.goodsLocationDetails = value;
    }

    /**
     * Gets the value of the dtExhcGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtExhcGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTExhcGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTExchGoodsItemDetailsType }
     * 
     * 
     */
    public List<DTExchGoodsItemDetailsType> getDTExhcGoodsItemDetails() {
        if (dtExhcGoodsItemDetails == null) {
            dtExhcGoodsItemDetails = new ArrayList<DTExchGoodsItemDetailsType>();
        }
        return this.dtExhcGoodsItemDetails;
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

    /**
     * Gets the value of the departureTransportDetails property.
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
     * Gets the value of the delayPaymentsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DelayPaymentsDetailsType }
     *     
     */
    public DelayPaymentsDetailsType getDelayPaymentsDetails() {
        return delayPaymentsDetails;
    }

    /**
     * Sets the value of the delayPaymentsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelayPaymentsDetailsType }
     *     
     */
    public void setDelayPaymentsDetails(DelayPaymentsDetailsType value) {
        this.delayPaymentsDetails = value;
    }

    /**
     * Gets the value of the dtExchFactPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtExchFactPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTExchFactPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTExchFactPaymentDetailsType }
     * 
     * 
     */
    public List<DTExchFactPaymentDetailsType> getDTExchFactPaymentDetails() {
        if (dtExchFactPaymentDetails == null) {
            dtExchFactPaymentDetails = new ArrayList<DTExchFactPaymentDetailsType>();
        }
        return this.dtExchFactPaymentDetails;
    }

}
