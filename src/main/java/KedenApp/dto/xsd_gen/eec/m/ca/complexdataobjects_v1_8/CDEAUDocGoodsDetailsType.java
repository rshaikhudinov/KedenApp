
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.BinaryTextType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о товаре в Решении Комиссии по классификации товаров по ТН ВЭД ЕАЭС
 * 
 * <p>Java class for CDEAUDocGoodsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDEAUDocGoodsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ConsignmentItemOrdinal"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CommodityCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CDEAUJustificationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocBinaryText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReferenceConsignmentItemOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EAEUDocEffectiveDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EAEUDocValidityDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDEAUDocGoodsDetailsType", propOrder = {
    "consignmentItemOrdinal",
    "commodityCode",
    "cdeauJustificationDetails",
    "descriptionText",
    "docBinaryText",
    "referenceConsignmentItemOrdinal",
    "eaeuDocEffectiveDate",
    "eaeuDocValidityDate"
})
public class CDEAUDocGoodsDetailsType {

    @XmlElement(name = "ConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger consignmentItemOrdinal;
    @XmlElement(name = "CommodityCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commodityCode;
    @XmlElement(name = "CDEAUJustificationDetails", required = true)
    protected CDEAUJustificationDetailsType cdeauJustificationDetails;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> descriptionText;
    @XmlElement(name = "DocBinaryText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected BinaryTextType docBinaryText;
    @XmlElement(name = "ReferenceConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger referenceConsignmentItemOrdinal;
    @XmlElement(name = "EAEUDocEffectiveDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eaeuDocEffectiveDate;
    @XmlElement(name = "EAEUDocValidityDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eaeuDocValidityDate;

    /**
     * номер позиции товара
     * в решении Комиссии по классификации товаров по ТН ВЭД ЕАЭС
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
     * код товара по ТН ВЭД ЕАЭС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * обоснование принятия решения Комиссии по классификации товаров по ТН ВЭД ЕАЭС
     * 
     * @return
     *     possible object is
     *     {@link CDEAUJustificationDetailsType }
     *     
     */
    public CDEAUJustificationDetailsType getCDEAUJustificationDetails() {
        return cdeauJustificationDetails;
    }

    /**
     * Sets the value of the cdeauJustificationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CDEAUJustificationDetailsType }
     *     
     */
    public void setCDEAUJustificationDetails(CDEAUJustificationDetailsType value) {
        this.cdeauJustificationDetails = value;
    }

    /**
     * Текст решения в отношении товара Gets the value of the descriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescriptionText() {
        if (descriptionText == null) {
            descriptionText = new ArrayList<String>();
        }
        return this.descriptionText;
    }

    /**
     * Дополнительная информация в бинарном формате (изображение товара)
     * 
     * @return
     *     possible object is
     *     {@link BinaryTextType }
     *     
     */
    public BinaryTextType getDocBinaryText() {
        return docBinaryText;
    }

    /**
     * Sets the value of the docBinaryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryTextType }
     *     
     */
    public void setDocBinaryText(BinaryTextType value) {
        this.docBinaryText = value;
    }

    /**
     * номер позиции товара в изменяемом решении Комиссии по классификации товаров по ТН ВЭД ЕАЭС
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferenceConsignmentItemOrdinal() {
        return referenceConsignmentItemOrdinal;
    }

    /**
     * Sets the value of the referenceConsignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferenceConsignmentItemOrdinal(BigInteger value) {
        this.referenceConsignmentItemOrdinal = value;
    }

    /**
     * дата вступления в силу решения Комиссии по классификации товаров по ТН ВЭД ЕАЭС
     * в части, относящейся к товару
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEAEUDocEffectiveDate() {
        return eaeuDocEffectiveDate;
    }

    /**
     * Sets the value of the eaeuDocEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEAEUDocEffectiveDate(XMLGregorianCalendar value) {
        this.eaeuDocEffectiveDate = value;
    }

    /**
     * дата окончания срока действия решения Комиссии по классификации товаров по ТН ВЭД ЕАЭС в части, относящейся к товару
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEAEUDocValidityDate() {
        return eaeuDocValidityDate;
    }

    /**
     * Sets the value of the eaeuDocValidityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEAEUDocValidityDate(XMLGregorianCalendar value) {
        this.eaeuDocValidityDate = value;
    }

}
