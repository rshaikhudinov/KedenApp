
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

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
 * Компоненты, представляющие сведения о предоставлении дополнительного документа одновременно с таможенным документом
 * 
 * <p>Java class for DocumentPresentingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentPresentingDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DocPresentKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DocPresentDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDocIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTMDocDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIRIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PrecedingDocId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocCreationDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentPresentingDetailsType", propOrder = {
    "docPresentKindCode",
    "docKindCode",
    "docPresentDate",
    "customsDocIdDetails",
    "dtmDocDetails",
    "tirIdDetails",
    "precedingDocId",
    "docCreationDate"
})
public class DocumentPresentingDetailsType {

    @XmlElement(name = "DocPresentKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docPresentKindCode;
    @XmlElement(name = "DocKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type docKindCode;
    @XmlElement(name = "DocPresentDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docPresentDate;
    @XmlElement(name = "CustomsDocIdDetails")
    protected CustomsDocumentIdWOrdinalDetailsType customsDocIdDetails;
    @XmlElement(name = "DTMDocDetails")
    protected DTMDocDetailsType dtmDocDetails;
    @XmlElement(name = "TIRIdDetails")
    protected TIRBaseIdDetailsType tirIdDetails;
    @XmlElement(name = "PrecedingDocId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String precedingDocId;
    @XmlElement(name = "DocCreationDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docCreationDate;

    /**
     * Gets the value of the docPresentKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocPresentKindCode() {
        return docPresentKindCode;
    }

    /**
     * Sets the value of the docPresentKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocPresentKindCode(String value) {
        this.docPresentKindCode = value;
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
     * Дата, до которой должны быть выполнены обязательства по представлению документа
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocPresentDate() {
        return docPresentDate;
    }

    /**
     * Sets the value of the docPresentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocPresentDate(XMLGregorianCalendar value) {
        this.docPresentDate = value;
    }

    /**
     * Регистрационный номер декларации на товары, транзитной декларации, заявления о выпуске товаров до подачи декларации на товары или заявления о совершении операций в отношении временно вывезенных транспортных средств международной перевозки, являющихся товарами, помещенными под таможенную процедуру временного ввоза (допуска), к которой (которому) был приложен представленный документ
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
     * Регистрационный номер декларации на транспортное средство, к которой был приложен представленный документ
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
     * Номер книжки МДП, которая использовалась в качестве транзитной декларации и к которой был приложен представленный документ
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
     * регистрационный номер иного документа, к которому был приложен представляемый документ
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecedingDocId() {
        return precedingDocId;
    }

    /**
     * Sets the value of the precedingDocId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecedingDocId(String value) {
        this.precedingDocId = value;
    }

    /**
     * дата выдачи, подписания, утверждения или регистрации иного документа, к которому был приложен представляемый документ
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

}
