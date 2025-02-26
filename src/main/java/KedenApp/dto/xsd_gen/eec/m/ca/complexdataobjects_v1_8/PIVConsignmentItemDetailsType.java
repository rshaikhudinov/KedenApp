
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о товаре
 * 
 * <p>Java class for PIVConsignmentItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIVConsignmentItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADTGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DTConsignmentItemOrdinal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AddGoodsMeasureDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}UNDGClassId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}UNDGNumberId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ProductionPlaceName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsLabelDescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsUsageDescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ManufacturerDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}VetReleaseOrganizationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIVCargoPackagePalletDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIContainerDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OriginCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIPrecedingDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIGoodsDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIShipmentLocationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIVConsignmentItemDetailsType", propOrder = {
    "dtConsignmentItemOrdinal",
    "addGoodsMeasureDetails",
    "undgClassId",
    "undgNumberId",
    "productionPlaceName",
    "goodsLabelDescriptionText",
    "goodsUsageDescriptionText",
    "manufacturerDetails",
    "vetReleaseOrganizationDetails",
    "pivCargoPackagePalletDetails",
    "piContainerDetails",
    "originCountryDetails",
    "caValueAmount",
    "piPrecedingDocDetails",
    "piGoodsDocDetails",
    "piShipmentLocationDetails"
})
public class PIVConsignmentItemDetailsType
    extends CADTGoodsBaseDetailsType
{

    @XmlElement(name = "DTConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> dtConsignmentItemOrdinal;
    @XmlElement(name = "AddGoodsMeasureDetails")
    protected List<GoodsMeasureDetailsType> addGoodsMeasureDetails;
    @XmlElement(name = "UNDGClassId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String undgClassId;
    @XmlElement(name = "UNDGNumberId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String undgNumberId;
    @XmlElement(name = "ProductionPlaceName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> productionPlaceName;
    @XmlElement(name = "GoodsLabelDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String goodsLabelDescriptionText;
    @XmlElement(name = "GoodsUsageDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String goodsUsageDescriptionText;
    @XmlElement(name = "ManufacturerDetails")
    protected List<CASubjectDetailsV2Type> manufacturerDetails;
    @XmlElement(name = "VetReleaseOrganizationDetails")
    protected List<VetReleaseOrganizationDetailsType> vetReleaseOrganizationDetails;
    @XmlElement(name = "PIVCargoPackagePalletDetails")
    protected PIVCargoPackagePalletDetailsType pivCargoPackagePalletDetails;
    @XmlElement(name = "PIContainerDetails")
    protected List<PIContainerDetailsType> piContainerDetails;
    @XmlElement(name = "OriginCountryDetails")
    protected CACountryDetailsType originCountryDetails;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType caValueAmount;
    @XmlElement(name = "PIPrecedingDocDetails")
    protected List<DocDetailsV4Type> piPrecedingDocDetails;
    @XmlElement(name = "PIGoodsDocDetails")
    protected List<PIPresentedDocDetailsType> piGoodsDocDetails;
    @XmlElement(name = "PIShipmentLocationDetails")
    protected List<PIShipmentLocationDetailsType> piShipmentLocationDetails;

    /**
     * Номер товара в таможенной декларации, в соответствии с которой осуществлено предварительное таможенное декларирование Gets the value of the dtConsignmentItemOrdinal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtConsignmentItemOrdinal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTConsignmentItemOrdinal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getDTConsignmentItemOrdinal() {
        if (dtConsignmentItemOrdinal == null) {
            dtConsignmentItemOrdinal = new ArrayList<BigInteger>();
        }
        return this.dtConsignmentItemOrdinal;
    }

    /**
     * Gets the value of the addGoodsMeasureDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the addGoodsMeasureDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddGoodsMeasureDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GoodsMeasureDetailsType }
     * 
     * 
     */
    public List<GoodsMeasureDetailsType> getAddGoodsMeasureDetails() {
        if (addGoodsMeasureDetails == null) {
            addGoodsMeasureDetails = new ArrayList<GoodsMeasureDetailsType>();
        }
        return this.addGoodsMeasureDetails;
    }

    /**
     * Gets the value of the undgClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNDGClassId() {
        return undgClassId;
    }

    /**
     * Sets the value of the undgClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNDGClassId(String value) {
        this.undgClassId = value;
    }

    /**
     * Gets the value of the undgNumberId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNDGNumberId() {
        return undgNumberId;
    }

    /**
     * Sets the value of the undgNumberId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNDGNumberId(String value) {
        this.undgNumberId = value;
    }

    /**
     * Наименование места происхождения товара Gets the value of the productionPlaceName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the productionPlaceName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductionPlaceName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductionPlaceName() {
        if (productionPlaceName == null) {
            productionPlaceName = new ArrayList<String>();
        }
        return this.productionPlaceName;
    }

    /**
     * Gets the value of the goodsLabelDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsLabelDescriptionText() {
        return goodsLabelDescriptionText;
    }

    /**
     * Sets the value of the goodsLabelDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsLabelDescriptionText(String value) {
        this.goodsLabelDescriptionText = value;
    }

    /**
     * Gets the value of the goodsUsageDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsUsageDescriptionText() {
        return goodsUsageDescriptionText;
    }

    /**
     * Sets the value of the goodsUsageDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsUsageDescriptionText(String value) {
        this.goodsUsageDescriptionText = value;
    }

    /**
     * Сведения о производителе (изготовителе) продукции Gets the value of the manufacturerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CASubjectDetailsV2Type }
     * 
     * 
     */
    public List<CASubjectDetailsV2Type> getManufacturerDetails() {
        if (manufacturerDetails == null) {
            manufacturerDetails = new ArrayList<CASubjectDetailsV2Type>();
        }
        return this.manufacturerDetails;
    }

    /**
     * Gets the value of the vetReleaseOrganizationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vetReleaseOrganizationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVetReleaseOrganizationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VetReleaseOrganizationDetailsType }
     * 
     * 
     */
    public List<VetReleaseOrganizationDetailsType> getVetReleaseOrganizationDetails() {
        if (vetReleaseOrganizationDetails == null) {
            vetReleaseOrganizationDetails = new ArrayList<VetReleaseOrganizationDetailsType>();
        }
        return this.vetReleaseOrganizationDetails;
    }

    /**
     * Gets the value of the pivCargoPackagePalletDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PIVCargoPackagePalletDetailsType }
     *     
     */
    public PIVCargoPackagePalletDetailsType getPIVCargoPackagePalletDetails() {
        return pivCargoPackagePalletDetails;
    }

    /**
     * Sets the value of the pivCargoPackagePalletDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIVCargoPackagePalletDetailsType }
     *     
     */
    public void setPIVCargoPackagePalletDetails(PIVCargoPackagePalletDetailsType value) {
        this.pivCargoPackagePalletDetails = value;
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
     * Gets the value of the originCountryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryDetailsType }
     *     
     */
    public CACountryDetailsType getOriginCountryDetails() {
        return originCountryDetails;
    }

    /**
     * Sets the value of the originCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryDetailsType }
     *     
     */
    public void setOriginCountryDetails(CACountryDetailsType value) {
        this.originCountryDetails = value;
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
     * Gets the value of the piPrecedingDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piPrecedingDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIPrecedingDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocDetailsV4Type }
     * 
     * 
     */
    public List<DocDetailsV4Type> getPIPrecedingDocDetails() {
        if (piPrecedingDocDetails == null) {
            piPrecedingDocDetails = new ArrayList<DocDetailsV4Type>();
        }
        return this.piPrecedingDocDetails;
    }

    /**
     * Gets the value of the piGoodsDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piGoodsDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIGoodsDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIPresentedDocDetailsType }
     * 
     * 
     */
    public List<PIPresentedDocDetailsType> getPIGoodsDocDetails() {
        if (piGoodsDocDetails == null) {
            piGoodsDocDetails = new ArrayList<PIPresentedDocDetailsType>();
        }
        return this.piGoodsDocDetails;
    }

    /**
     * Gets the value of the piShipmentLocationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piShipmentLocationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIShipmentLocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIShipmentLocationDetailsType }
     * 
     * 
     */
    public List<PIShipmentLocationDetailsType> getPIShipmentLocationDetails() {
        if (piShipmentLocationDetails == null) {
            piShipmentLocationDetails = new ArrayList<PIShipmentLocationDetailsType>();
        }
        return this.piShipmentLocationDetails;
    }

}
