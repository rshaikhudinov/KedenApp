
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxModeCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Базовые сведения о представленном документе
 * 
 * <p>Java class for PresentedDocBaseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentedDocBaseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADocDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}InformationSourceDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LineId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsTaxModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TemporaryImportKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DocAddInfoCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsControlZoneId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SupplyStatusIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DocumentQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CAValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}LicensedGoodsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ConsignmentItemOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EDocCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DocArchIdDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentedDocBaseDetailsType", propOrder = {
    "informationSourceDetails",
    "lineId",
    "customsTaxModeCode",
    "eventDate",
    "temporaryImportKindCode",
    "docAddInfoCode",
    "customsOfficeCode",
    "customsControlZoneId",
    "supplyStatusIndicator",
    "documentQuantity",
    "caValueAmount",
    "licensedGoodsDetails",
    "consignmentItemOrdinal",
    "eDocCode",
    "docArchIdDetails"
})
@XmlSeeAlso({
    PresentedDocDetailsType.class
})
public class PresentedDocBaseDetailsType
    extends CADocDetailsType
{

    @XmlElement(name = "InformationSourceDetails")
    protected InformationSourceDetailsType informationSourceDetails;
    @XmlElement(name = "LineId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lineId;
    @XmlElement(name = "CustomsTaxModeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CustomsTaxModeCodeType customsTaxModeCode;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "TemporaryImportKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String temporaryImportKindCode;
    @XmlElement(name = "DocAddInfoCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docAddInfoCode;
    @XmlElement(name = "CustomsOfficeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeCode;
    @XmlElement(name = "CustomsControlZoneId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsControlZoneId;
    @XmlElement(name = "SupplyStatusIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean supplyStatusIndicator;
    @XmlElement(name = "DocumentQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger documentQuantity;
    @XmlElement(name = "CAValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType caValueAmount;
    @XmlElement(name = "LicensedGoodsDetails")
    protected LicensedGoodsDetailsType licensedGoodsDetails;
    @XmlElement(name = "ConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger consignmentItemOrdinal;
    @XmlElement(name = "EDocCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eDocCode;
    @XmlElement(name = "DocArchIdDetails")
    protected DocArchIdDetailsType docArchIdDetails;

    /**
     * Сведения об информационном ресурсе в информационно-телекоммуникационной сети «Интернет»
     * 
     * @return
     *     possible object is
     *     {@link InformationSourceDetailsType }
     *     
     */
    public InformationSourceDetailsType getInformationSourceDetails() {
        return informationSourceDetails;
    }

    /**
     * Sets the value of the informationSourceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformationSourceDetailsType }
     *     
     */
    public void setInformationSourceDetails(InformationSourceDetailsType value) {
        this.informationSourceDetails = value;
    }

    /**
     * Уникальный идентификатор, используемый для целей однозначной ссылки на запись, или порядковый номер записи
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
     * Gets the value of the customsTaxModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTaxModeCodeType }
     *     
     */
    public CustomsTaxModeCodeType getCustomsTaxModeCode() {
        return customsTaxModeCode;
    }

    /**
     * Sets the value of the customsTaxModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTaxModeCodeType }
     *     
     */
    public void setCustomsTaxModeCode(CustomsTaxModeCodeType value) {
        this.customsTaxModeCode = value;
    }

    /**
     * Заявляемый срок совершения таможенной операции (процедуры) или ее окончания (срок временного ввоза (вывоза), хранения товаров, переработки, действия специальной таможенной процедуры и т.д.)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the temporaryImportKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemporaryImportKindCode() {
        return temporaryImportKindCode;
    }

    /**
     * Sets the value of the temporaryImportKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemporaryImportKindCode(String value) {
        this.temporaryImportKindCode = value;
    }

    /**
     * Gets the value of the docAddInfoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocAddInfoCode() {
        return docAddInfoCode;
    }

    /**
     * Sets the value of the docAddInfoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocAddInfoCode(String value) {
        this.docAddInfoCode = value;
    }

    /**
     * Код таможенного органа, зарегистрировавшего документ или в регионе деятельности которого будут храниться товары
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
     * Gets the value of the supplyStatusIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupplyStatusIndicator() {
        return supplyStatusIndicator;
    }

    /**
     * Sets the value of the supplyStatusIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupplyStatusIndicator(Boolean value) {
        this.supplyStatusIndicator = value;
    }

    /**
     * Общее количество документов, в соответствии с которыми перемещаются товары, согласно списку договоров (контрактов)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentQuantity() {
        return documentQuantity;
    }

    /**
     * Sets the value of the documentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentQuantity(BigInteger value) {
        this.documentQuantity = value;
    }

    /**
     * Стоимость операций по переработке
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
     * Gets the value of the licensedGoodsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LicensedGoodsDetailsType }
     *     
     */
    public LicensedGoodsDetailsType getLicensedGoodsDetails() {
        return licensedGoodsDetails;
    }

    /**
     * Sets the value of the licensedGoodsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicensedGoodsDetailsType }
     *     
     */
    public void setLicensedGoodsDetails(LicensedGoodsDetailsType value) {
        this.licensedGoodsDetails = value;
    }

    /**
     * Порядковый номер товара в представленном документе (сведениях)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsignmentItemOrdinal() {
        return consignmentItemOrdinal;
    }

    /**
     * Sets the value of the consignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsignmentItemOrdinal(BigInteger value) {
        this.consignmentItemOrdinal = value;
    }

    /**
     * Gets the value of the eDocCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocCode() {
        return eDocCode;
    }

    /**
     * Sets the value of the eDocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocCode(String value) {
        this.eDocCode = value;
    }

    /**
     * Gets the value of the docArchIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocArchIdDetailsType }
     *     
     */
    public DocArchIdDetailsType getDocArchIdDetails() {
        return docArchIdDetails;
    }

    /**
     * Sets the value of the docArchIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocArchIdDetailsType }
     *     
     */
    public void setDocArchIdDetails(DocArchIdDetailsType value) {
        this.docArchIdDetails = value;
    }

}
