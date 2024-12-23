
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.GoodsLocationCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о планируемом месте временного хранения товаров
 * 
 * <p>Java class for UnloadWarehouseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnloadWarehouseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsLocationCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PlaceName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsLocationDocDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterDocumentIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WarehouseDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}StorageRequirementDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnloadWarehouseDetailsType", propOrder = {
    "goodsLocationCode",
    "placeName",
    "goodsLocationDocDetails",
    "registerDocumentIdDetails",
    "warehouseDate",
    "storageRequirementDetails"
})
public class UnloadWarehouseDetailsType {

    @XmlElement(name = "GoodsLocationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected GoodsLocationCodeType goodsLocationCode;
    @XmlElement(name = "PlaceName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String placeName;
    @XmlElement(name = "GoodsLocationDocDetails")
    protected CADocBaseType goodsLocationDocDetails;
    @XmlElement(name = "RegisterDocumentIdDetails")
    protected RegisterDocumentIdDetailsType registerDocumentIdDetails;
    @XmlElement(name = "WarehouseDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar warehouseDate;
    @XmlElement(name = "StorageRequirementDetails", required = true)
    protected StorageRequirementDetailsType storageRequirementDetails;

    /**
     * кодовое обозначение планируемого места хранения товаров
     * 
     * @return
     *     possible object is
     *     {@link GoodsLocationCodeType }
     *     
     */
    public GoodsLocationCodeType getGoodsLocationCode() {
        return goodsLocationCode;
    }

    /**
     * Sets the value of the goodsLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsLocationCodeType }
     *     
     */
    public void setGoodsLocationCode(GoodsLocationCodeType value) {
        this.goodsLocationCode = value;
    }

    /**
     * наименование планируемого места временного хранения товаров (наименование терминала порта)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * Сведения о документе, разрешающем временное хранение товаров, или о разрешении на временное хранение в ином месте
     * 
     * @return
     *     possible object is
     *     {@link CADocBaseType }
     *     
     */
    public CADocBaseType getGoodsLocationDocDetails() {
        return goodsLocationDocDetails;
    }

    /**
     * Sets the value of the goodsLocationDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CADocBaseType }
     *     
     */
    public void setGoodsLocationDocDetails(CADocBaseType value) {
        this.goodsLocationDocDetails = value;
    }

    /**
     * Сведения о документе, подтверждающем включение лица в реестр владельцев складов временного хранения
     * 
     * @return
     *     possible object is
     *     {@link RegisterDocumentIdDetailsType }
     *     
     */
    public RegisterDocumentIdDetailsType getRegisterDocumentIdDetails() {
        return registerDocumentIdDetails;
    }

    /**
     * Sets the value of the registerDocumentIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterDocumentIdDetailsType }
     *     
     */
    public void setRegisterDocumentIdDetails(RegisterDocumentIdDetailsType value) {
        this.registerDocumentIdDetails = value;
    }

    /**
     * Планируемая дата помещения товаров на временное хранение
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWarehouseDate() {
        return warehouseDate;
    }

    /**
     * Sets the value of the warehouseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWarehouseDate(XMLGregorianCalendar value) {
        this.warehouseDate = value;
    }

    /**
     * Сведения об особых условиях хранения товаров
     * 
     * @return
     *     possible object is
     *     {@link StorageRequirementDetailsType }
     *     
     */
    public StorageRequirementDetailsType getStorageRequirementDetails() {
        return storageRequirementDetails;
    }

    /**
     * Sets the value of the storageRequirementDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StorageRequirementDetailsType }
     *     
     */
    public void setStorageRequirementDetails(StorageRequirementDetailsType value) {
        this.storageRequirementDetails = value;
    }

}
