
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

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
 * Сведения о товаре
 * 
 * <p>Java class for TransitGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransitGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADTGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsProhibitionFreeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsComponentCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CargoPackagePalletDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ContainerListDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDPrecedingDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDPresentedDocDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitGoodsItemDetailsType", propOrder = {
    "goodsProhibitionFreeCode",
    "goodsComponentCode",
    "cargoPackagePalletDetails",
    "containerListDetails",
    "caValueAmount",
    "tdPrecedingDocDetails",
    "tdPresentedDocDetails"
})
public class TransitGoodsItemDetailsType
    extends CADTGoodsBaseDetailsType
{

    @XmlElement(name = "GoodsProhibitionFreeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String goodsProhibitionFreeCode;
    @XmlElement(name = "GoodsComponentCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String goodsComponentCode;
    @XmlElement(name = "CargoPackagePalletDetails")
    protected CargoPackagePalletDetailsType cargoPackagePalletDetails;
    @XmlElement(name = "ContainerListDetails")
    protected List<ContainerListDetailsType> containerListDetails;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType caValueAmount;
    @XmlElement(name = "TDPrecedingDocDetails")
    protected List<TDPrecedingDocDetailsType> tdPrecedingDocDetails;
    @XmlElement(name = "TDPresentedDocDetails", required = true)
    protected List<TDPresentedDocDetailsType> tdPresentedDocDetails;

    /**
     * Gets the value of the goodsProhibitionFreeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsProhibitionFreeCode() {
        return goodsProhibitionFreeCode;
    }

    /**
     * Sets the value of the goodsProhibitionFreeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsProhibitionFreeCode(String value) {
        this.goodsProhibitionFreeCode = value;
    }

    /**
     * Gets the value of the goodsComponentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsComponentCode() {
        return goodsComponentCode;
    }

    /**
     * Sets the value of the goodsComponentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsComponentCode(String value) {
        this.goodsComponentCode = value;
    }

    /**
     * Gets the value of the cargoPackagePalletDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CargoPackagePalletDetailsType }
     *     
     */
    public CargoPackagePalletDetailsType getCargoPackagePalletDetails() {
        return cargoPackagePalletDetails;
    }

    /**
     * Sets the value of the cargoPackagePalletDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CargoPackagePalletDetailsType }
     *     
     */
    public void setCargoPackagePalletDetails(CargoPackagePalletDetailsType value) {
        this.cargoPackagePalletDetails = value;
    }

    /**
     * Gets the value of the containerListDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the containerListDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerListDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerListDetailsType }
     * 
     * 
     */
    public List<ContainerListDetailsType> getContainerListDetails() {
        if (containerListDetails == null) {
            containerListDetails = new ArrayList<ContainerListDetailsType>();
        }
        return this.containerListDetails;
    }

    /**
     * Стоимость (цена) товара
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
     * Gets the value of the tdPrecedingDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tdPrecedingDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDPrecedingDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDPrecedingDocDetailsType }
     * 
     * 
     */
    public List<TDPrecedingDocDetailsType> getTDPrecedingDocDetails() {
        if (tdPrecedingDocDetails == null) {
            tdPrecedingDocDetails = new ArrayList<TDPrecedingDocDetailsType>();
        }
        return this.tdPrecedingDocDetails;
    }

    /**
     * Дополнительная информация и (или) представленный документ (сведения) Gets the value of the tdPresentedDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tdPresentedDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDPresentedDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDPresentedDocDetailsType }
     * 
     * 
     */
    public List<TDPresentedDocDetailsType> getTDPresentedDocDetails() {
        if (tdPresentedDocDetails == null) {
            tdPresentedDocDetails = new ArrayList<TDPresentedDocDetailsType>();
        }
        return this.tdPresentedDocDetails;
    }

}
