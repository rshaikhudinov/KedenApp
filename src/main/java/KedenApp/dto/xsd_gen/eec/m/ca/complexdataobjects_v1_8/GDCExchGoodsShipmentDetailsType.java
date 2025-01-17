
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
 * Сведения о товарной партии
 * 
 * <p>Java class for GDCExchGoodsShipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDCExchGoodsShipmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTGoodsShipmentBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsQuantity"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ContainerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsLocationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GDCExchGoodsItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BorderTransportsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DepartureTransportDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GDCExchFactPaymentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GDCExchPaymentDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GDCChangeDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDCExchGoodsShipmentDetailsType", propOrder = {
    "goodsQuantity",
    "cargoQuantity",
    "containerIndicator",
    "goodsLocationDetails",
    "gdcExchGoodsItemDetails",
    "borderTransportsDetails",
    "departureTransportDetails",
    "gdcExchFactPaymentDetails",
    "gdcExchPaymentDocDetails",
    "gdcChangeDetails"
})
public class GDCExchGoodsShipmentDetailsType
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
    @XmlElement(name = "GDCExchGoodsItemDetails")
    protected List<GDCExchGoodsItemDetailsType> gdcExchGoodsItemDetails;
    @XmlElement(name = "BorderTransportsDetails")
    protected CATransportMeansDetailsType borderTransportsDetails;
    @XmlElement(name = "DepartureTransportDetails")
    protected CATransportMeansDetailsType departureTransportDetails;
    @XmlElement(name = "GDCExchFactPaymentDetails")
    protected List<GDCExchFactPaymentDetailsType> gdcExchFactPaymentDetails;
    @XmlElement(name = "GDCExchPaymentDocDetails")
    protected List<GDCExchPaymentDocDetailsType> gdcExchPaymentDocDetails;
    @XmlElement(name = "GDCChangeDetails")
    protected GDCChangeDetailsType gdcChangeDetails;

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
     * Gets the value of the gdcExchGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the gdcExchGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGDCExchGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GDCExchGoodsItemDetailsType }
     * 
     * 
     */
    public List<GDCExchGoodsItemDetailsType> getGDCExchGoodsItemDetails() {
        if (gdcExchGoodsItemDetails == null) {
            gdcExchGoodsItemDetails = new ArrayList<GDCExchGoodsItemDetailsType>();
        }
        return this.gdcExchGoodsItemDetails;
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
     * Gets the value of the gdcExchFactPaymentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the gdcExchFactPaymentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGDCExchFactPaymentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GDCExchFactPaymentDetailsType }
     * 
     * 
     */
    public List<GDCExchFactPaymentDetailsType> getGDCExchFactPaymentDetails() {
        if (gdcExchFactPaymentDetails == null) {
            gdcExchFactPaymentDetails = new ArrayList<GDCExchFactPaymentDetailsType>();
        }
        return this.gdcExchFactPaymentDetails;
    }

    /**
     * Gets the value of the gdcExchPaymentDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the gdcExchPaymentDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGDCExchPaymentDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GDCExchPaymentDocDetailsType }
     * 
     * 
     */
    public List<GDCExchPaymentDocDetailsType> getGDCExchPaymentDocDetails() {
        if (gdcExchPaymentDocDetails == null) {
            gdcExchPaymentDocDetails = new ArrayList<GDCExchPaymentDocDetailsType>();
        }
        return this.gdcExchPaymentDocDetails;
    }

    /**
     * Код изменений при отсутствии изменений и (или) дополнении сведений в отношении товаров
     * 
     * @return
     *     possible object is
     *     {@link GDCChangeDetailsType }
     *     
     */
    public GDCChangeDetailsType getGDCChangeDetails() {
        return gdcChangeDetails;
    }

    /**
     * Sets the value of the gdcChangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDCChangeDetailsType }
     *     
     */
    public void setGDCChangeDetails(GDCChangeDetailsType value) {
        this.gdcChangeDetails = value;
    }

}
