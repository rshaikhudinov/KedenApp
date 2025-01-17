
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о представленном документе
 * 
 * <p>Java class for TDPresentedDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDPresentedDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADocDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LineId"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ConsignmentItemOrdinal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EDocCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DocArchIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DocumentPresentingDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDPresentedDocDetailsType", propOrder = {
    "lineId",
    "consignmentItemOrdinal",
    "eDocCode",
    "docArchIdDetails",
    "documentPresentingDetails"
})
public class TDPresentedDocDetailsType
    extends CADocDetailsType
{

    @XmlElement(name = "LineId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lineId;
    @XmlElement(name = "ConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> consignmentItemOrdinal;
    @XmlElement(name = "EDocCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eDocCode;
    @XmlElement(name = "DocArchIdDetails")
    protected DocArchIdDetailsType docArchIdDetails;
    @XmlElement(name = "DocumentPresentingDetails", required = true)
    protected DocumentPresentingDetailsType documentPresentingDetails;

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
     * порядковый номер товара Gets the value of the consignmentItemOrdinal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the consignmentItemOrdinal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsignmentItemOrdinal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getConsignmentItemOrdinal() {
        if (consignmentItemOrdinal == null) {
            consignmentItemOrdinal = new ArrayList<BigInteger>();
        }
        return this.consignmentItemOrdinal;
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

    /**
     * Gets the value of the documentPresentingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentPresentingDetailsType }
     *     
     */
    public DocumentPresentingDetailsType getDocumentPresentingDetails() {
        return documentPresentingDetails;
    }

    /**
     * Sets the value of the documentPresentingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentPresentingDetailsType }
     *     
     */
    public void setDocumentPresentingDetails(DocumentPresentingDetailsType value) {
        this.documentPresentingDetails = value;
    }

}
