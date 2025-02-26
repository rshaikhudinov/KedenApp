
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о документе, на основании которого заполнена декларация таможенной стоимости
 * 
 * <p>Java class for CVDEvidenceDocumentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVDEvidenceDocumentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ConsignmentItemOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocV4Details" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDocIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DTConsignmentItemOrdinal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVDEvidenceDocumentDetailsType", propOrder = {
    "consignmentItemOrdinal",
    "docV4Details",
    "customsDocIdDetails",
    "dtConsignmentItemOrdinal"
})
public class CVDEvidenceDocumentDetailsType {

    @XmlElement(name = "ConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger consignmentItemOrdinal;
    @XmlElement(name = "DocV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected DocDetailsV4Type docV4Details;
    @XmlElement(name = "CustomsDocIdDetails")
    protected CustomsDocumentIdWOrdinalDetailsType customsDocIdDetails;
    @XmlElement(name = "DTConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dtConsignmentItemOrdinal;

    /**
     * номер товара в декларации таможенной стоимости
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
     * документ, содержащий сведения о цене ранее ввезенного идентичного, однородного или ввозимого товара или документ, сведения из которого использованы при определении таможенной стоимости ввозимых товаров
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getDocV4Details() {
        return docV4Details;
    }

    /**
     * Sets the value of the docV4Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setDocV4Details(DocDetailsV4Type value) {
        this.docV4Details = value;
    }

    /**
     * Регистрационный номер декларации на товары, в соответствии с которой идентичный или однородный товар был помещен под таможенную процедуру
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
     * Порядковый номер товара в декларации на товары, в соответствии с которой идентичный или однородный товар был помещен под таможенную процедуру
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDTConsignmentItemOrdinal() {
        return dtConsignmentItemOrdinal;
    }

    /**
     * Sets the value of the dtConsignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDTConsignmentItemOrdinal(BigInteger value) {
        this.dtConsignmentItemOrdinal = value;
    }

}
