
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.GoodsLocationCodeType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.SubjectAddressDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о местонахождении товаров
 * 
 * <p>Java class for GoodsLocationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsLocationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsLocationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PlaceName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsControlZoneId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterDocumentIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodLocationTransportMeansDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}SubjectAddressDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsLocationDetailsType", propOrder = {
    "goodsLocationCode",
    "customsOfficeCode",
    "placeName",
    "customsControlZoneId",
    "registerDocumentIdDetails",
    "goodLocationTransportMeansDetails",
    "subjectAddressDetails"
})
public class GoodsLocationDetailsType {

    @XmlElement(name = "GoodsLocationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected GoodsLocationCodeType goodsLocationCode;
    @XmlElement(name = "CustomsOfficeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeCode;
    @XmlElement(name = "PlaceName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String placeName;
    @XmlElement(name = "CustomsControlZoneId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsControlZoneId;
    @XmlElement(name = "RegisterDocumentIdDetails")
    protected RegisterDocumentIdDetailsType registerDocumentIdDetails;
    @XmlElement(name = "GoodLocationTransportMeansDetails")
    protected TransportMeansListDetailsType goodLocationTransportMeansDetails;
    @XmlElement(name = "SubjectAddressDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected SubjectAddressDetailsType subjectAddressDetails;

    /**
     * Gets the value of the goodsLocationCode property.
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
     * Кодовое обозначение таможенного органа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOfficeCode() {
        return customsOfficeCode;
    }

    /**
     * Sets the value of the customsOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOfficeCode(String value) {
        this.customsOfficeCode = value;
    }

    /**
     * наименование места нахождения товаров (железнодорожной станции, морского (речного) порта, воздушного пункта пропуска)
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
     * номер (регистрационный номер) зоны таможенного контроля
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsControlZoneId() {
        return customsControlZoneId;
    }

    /**
     * Sets the value of the customsControlZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsControlZoneId(String value) {
        this.customsControlZoneId = value;
    }

    /**
     * свидетельство о включении в реестр уполномоченных экономических операторов, свидетельство о включении в реестр владельцев складов временного хранения, документ (свидетельство), удостоверяющий регистрацию лица в качестве резидента (участника) свободной (специальной, особой) экономической зоны
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
     * Gets the value of the goodLocationTransportMeansDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansListDetailsType }
     *     
     */
    public TransportMeansListDetailsType getGoodLocationTransportMeansDetails() {
        return goodLocationTransportMeansDetails;
    }

    /**
     * Sets the value of the goodLocationTransportMeansDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansListDetailsType }
     *     
     */
    public void setGoodLocationTransportMeansDetails(TransportMeansListDetailsType value) {
        this.goodLocationTransportMeansDetails = value;
    }

    /**
     * Адрес места нахождения товаров
     * 
     * @return
     *     possible object is
     *     {@link SubjectAddressDetailsType }
     *     
     */
    public SubjectAddressDetailsType getSubjectAddressDetails() {
        return subjectAddressDetails;
    }

    /**
     * Sets the value of the subjectAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAddressDetailsType }
     *     
     */
    public void setSubjectAddressDetails(SubjectAddressDetailsType value) {
        this.subjectAddressDetails = value;
    }

}
