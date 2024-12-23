
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о предшествующих документах
 * 
 * <p>Java class for PrecedingDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrecedingDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LineId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDocIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTMDocDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PreliminaryInformationIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIRIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocCreationDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ConsignmentItemOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PrecedingGoodsDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrecedingDocDetailsType", propOrder = {
    "lineId",
    "docKindCode",
    "docName",
    "customsDocIdDetails",
    "dtmDocDetails",
    "preliminaryInformationIdDetails",
    "tirIdDetails",
    "docId",
    "docCreationDate",
    "consignmentItemOrdinal",
    "precedingGoodsDetails"
})
public class PrecedingDocDetailsType {

    @XmlElement(name = "LineId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lineId;
    @XmlElement(name = "DocKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type docKindCode;
    @XmlElement(name = "DocName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docName;
    @XmlElement(name = "CustomsDocIdDetails")
    protected CustomsDocumentIdWOrdinalDetailsType customsDocIdDetails;
    @XmlElement(name = "DTMDocDetails")
    protected DTMDocDetailsType dtmDocDetails;
    @XmlElement(name = "PreliminaryInformationIdDetails")
    protected PreliminaryInformationIdDetailsType preliminaryInformationIdDetails;
    @XmlElement(name = "TIRIdDetails")
    protected TIRBaseIdDetailsType tirIdDetails;
    @XmlElement(name = "DocId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docId;
    @XmlElement(name = "DocCreationDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docCreationDate;
    @XmlElement(name = "ConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger consignmentItemOrdinal;
    @XmlElement(name = "PrecedingGoodsDetails")
    protected PrecedingGoodsDetaisType precedingGoodsDetails;

    /**
     * Идентификатор записи о предшествующем документе
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
     * Gets the value of the docKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getDocKindCode() {
        return docKindCode;
    }

    /**
     * Sets the value of the docKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setDocKindCode(UnifiedCode20Type value) {
        this.docKindCode = value;
    }

    /**
     * Gets the value of the docName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocName() {
        return docName;
    }

    /**
     * Sets the value of the docName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocName(String value) {
        this.docName = value;
    }

    /**
     * Регистрационный номер декларации на товары, транзитной декларации, заявления о выпуске товаров до подачи декларации на товары или заявления о совершении операций в отношении временно вывезенных транспортных средств международной перевозки, являющихся товарами, помещенными под таможенную процедуру временного ввоза (допуска)
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdWOrdinalDetailsType }
     *     
     */
    public CustomsDocumentIdWOrdinalDetailsType getCustomsDocIdDetails() {
        return customsDocIdDetails;
    }

    /**
     * Sets the value of the customsDocIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdWOrdinalDetailsType }
     *     
     */
    public void setCustomsDocIdDetails(CustomsDocumentIdWOrdinalDetailsType value) {
        this.customsDocIdDetails = value;
    }

    /**
     * Gets the value of the dtmDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DTMDocDetailsType }
     *     
     */
    public DTMDocDetailsType getDTMDocDetails() {
        return dtmDocDetails;
    }

    /**
     * Sets the value of the dtmDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTMDocDetailsType }
     *     
     */
    public void setDTMDocDetails(DTMDocDetailsType value) {
        this.dtmDocDetails = value;
    }

    /**
     * Регистрационный номер предварительной информации
     * 
     * @return
     *     possible object is
     *     {@link PreliminaryInformationIdDetailsType }
     *     
     */
    public PreliminaryInformationIdDetailsType getPreliminaryInformationIdDetails() {
        return preliminaryInformationIdDetails;
    }

    /**
     * Sets the value of the preliminaryInformationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreliminaryInformationIdDetailsType }
     *     
     */
    public void setPreliminaryInformationIdDetails(PreliminaryInformationIdDetailsType value) {
        this.preliminaryInformationIdDetails = value;
    }

    /**
     * Gets the value of the tirIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TIRBaseIdDetailsType }
     *     
     */
    public TIRBaseIdDetailsType getTIRIdDetails() {
        return tirIdDetails;
    }

    /**
     * Sets the value of the tirIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIRBaseIdDetailsType }
     *     
     */
    public void setTIRIdDetails(TIRBaseIdDetailsType value) {
        this.tirIdDetails = value;
    }

    /**
     * регистрационный номер иного предшествующего документа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
    }

    /**
     * Дата регистрации иного предшествующего документа
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocCreationDate() {
        return docCreationDate;
    }

    /**
     * Sets the value of the docCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocCreationDate(XMLGregorianCalendar value) {
        this.docCreationDate = value;
    }

    /**
     * Порядковый номер товара в предшествующем документе
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
     * Gets the value of the precedingGoodsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PrecedingGoodsDetaisType }
     *     
     */
    public PrecedingGoodsDetaisType getPrecedingGoodsDetails() {
        return precedingGoodsDetails;
    }

    /**
     * Sets the value of the precedingGoodsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrecedingGoodsDetaisType }
     *     
     */
    public void setPrecedingGoodsDetails(PrecedingGoodsDetaisType value) {
        this.precedingGoodsDetails = value;
    }

}
