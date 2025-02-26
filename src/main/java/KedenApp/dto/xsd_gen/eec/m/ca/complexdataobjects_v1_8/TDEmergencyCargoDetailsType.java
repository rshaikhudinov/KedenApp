
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляюшие сведения о грузе, пострадавшем при аварии, действиях непреодолимой силы
 * 
 * <p>Java class for TDEmergencyCargoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDEmergencyCargoDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransportDocumentDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DamagedCargoAreaIndicator"/&gt;
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
@XmlType(name = "TDEmergencyCargoDetailsType", propOrder = {
    "transportDocumentDetails",
    "damagedCargoAreaIndicator",
    "tdLostGoodsItemDetails"
})
public class TDEmergencyCargoDetailsType {

    @XmlElement(name = "TransportDocumentDetails")
    protected DocDetailsV4Type transportDocumentDetails;
    @XmlElement(name = "DamagedCargoAreaIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean damagedCargoAreaIndicator;
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
     * Gets the value of the damagedCargoAreaIndicator property.
     * 
     */
    public Boolean isDamagedCargoAreaIndicator() {
        return damagedCargoAreaIndicator;
    }

    /**
     * Sets the value of the damagedCargoAreaIndicator property.
     * 
     */
    public void setDamagedCargoAreaIndicator(Boolean value) {
        this.damagedCargoAreaIndicator = value;
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
