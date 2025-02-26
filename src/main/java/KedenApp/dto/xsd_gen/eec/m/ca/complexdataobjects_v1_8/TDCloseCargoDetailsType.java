
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие информацию о грузе при завершении таможенной процедуры таможенного транзита
 * 
 * <p>Java class for TDCloseCargoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDCloseCargoDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransportDocumentDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDDeliveryGoodsItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDLostGoodsItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDCloseCargoDetailsType", propOrder = {
    "transportDocumentDetails",
    "tdDeliveryGoodsItemDetails",
    "tdLostGoodsItemDetails"
})
public class TDCloseCargoDetailsType {

    @XmlElement(name = "TransportDocumentDetails")
    protected DocDetailsV4Type transportDocumentDetails;
    @XmlElement(name = "TDDeliveryGoodsItemDetails")
    protected List<TDGoodsItemInfoDetailsType> tdDeliveryGoodsItemDetails;
    @XmlElement(name = "TDLostGoodsItemDetails")
    protected List<TDGoodsItemInfoDetailsType> tdLostGoodsItemDetails;

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

    /**
     * Gets the value of the tdDeliveryGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tdDeliveryGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDDeliveryGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDGoodsItemInfoDetailsType }
     * 
     * 
     */
    public List<TDGoodsItemInfoDetailsType> getTDDeliveryGoodsItemDetails() {
        if (tdDeliveryGoodsItemDetails == null) {
            tdDeliveryGoodsItemDetails = new ArrayList<TDGoodsItemInfoDetailsType>();
        }
        return this.tdDeliveryGoodsItemDetails;
    }

    /**
     * Gets the value of the tdLostGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tdLostGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDLostGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDGoodsItemInfoDetailsType }
     * 
     * 
     */
    public List<TDGoodsItemInfoDetailsType> getTDLostGoodsItemDetails() {
        if (tdLostGoodsItemDetails == null) {
            tdLostGoodsItemDetails = new ArrayList<TDGoodsItemInfoDetailsType>();
        }
        return this.tdLostGoodsItemDetails;
    }

}
