
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о грузе при прекращении таможенной процедуры таможенного транзита
 * 
 * <p>Java class for TDTerminationCargoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDTerminationCargoDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDocIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PartialTerminationIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDTerminationGoodsItemDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransportDocumentDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDTerminationCargoDetailsType", propOrder = {
    "customsDocIdDetails",
    "descriptionText",
    "partialTerminationIndicator",
    "tdTerminationGoodsItemDetails",
    "transportDocumentDetails"
})
public class TDTerminationCargoDetailsType {

    @XmlElement(name = "CustomsDocIdDetails")
    protected CustomsDocumentIdWOrdinalDetailsType customsDocIdDetails;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected String descriptionText;
    @XmlElement(name = "PartialTerminationIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean partialTerminationIndicator;
    @XmlElement(name = "TDTerminationGoodsItemDetails", required = true)
    protected List<TDGoodsItemInfoDetailsType> tdTerminationGoodsItemDetails;
    @XmlElement(name = "TransportDocumentDetails")
    protected DocDetailsV4Type transportDocumentDetails;

    /**
     * Регистрационный номер декларации на товары
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
     * Причина прекращения действия таможенной процедуры таможенного транзита
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

    /**
     * Признак частичного прекращения таможенной процедуры таможенного транзита
     * 
     */
    public Boolean isPartialTerminationIndicator() {
        return partialTerminationIndicator;
    }

    /**
     * Sets the value of the partialTerminationIndicator property.
     * 
     */
    public void setPartialTerminationIndicator(Boolean value) {
        this.partialTerminationIndicator = value;
    }

    /**
     * Gets the value of the tdTerminationGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tdTerminationGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDTerminationGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDGoodsItemInfoDetailsType }
     * 
     * 
     */
    public List<TDGoodsItemInfoDetailsType> getTDTerminationGoodsItemDetails() {
        if (tdTerminationGoodsItemDetails == null) {
            tdTerminationGoodsItemDetails = new ArrayList<TDGoodsItemInfoDetailsType>();
        }
        return this.tdTerminationGoodsItemDetails;
    }

    /**
     * Gets the value of the transportDocumentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getTransportDocumentDetails() {
        return transportDocumentDetails;
    }

    /**
     * Sets the value of the transportDocumentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setTransportDocumentDetails(DocDetailsV4Type value) {
        this.transportDocumentDetails = value;
    }

}
