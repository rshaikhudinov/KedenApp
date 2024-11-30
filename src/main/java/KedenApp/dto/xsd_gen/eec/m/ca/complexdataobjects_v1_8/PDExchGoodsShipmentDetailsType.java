
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о товарной партии в сведениях из пассажирской таможенной декларации
 * 
 * <p>Java class for PDExchGoodsShipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDExchGoodsShipmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDGoodsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDTransportMeansDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDExchGoodsShipmentDetailsType", propOrder = {
    "pdGoodsDetails",
    "pdTransportMeansDetails"
})
public class PDExchGoodsShipmentDetailsType {

    @XmlElement(name = "PDGoodsDetails")
    protected PDGoodsDetailsType pdGoodsDetails;
    @XmlElement(name = "PDTransportMeansDetails")
    protected PDTransportMeansDetailsType pdTransportMeansDetails;

    /**
     * Сведения о товарах
     * 
     * @return
     *     possible object is
     *     {@link PDGoodsDetailsType }
     *     
     */
    public PDGoodsDetailsType getPDGoodsDetails() {
        return pdGoodsDetails;
    }

    /**
     * Sets the value of the pdGoodsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDGoodsDetailsType }
     *     
     */
    public void setPDGoodsDetails(PDGoodsDetailsType value) {
        this.pdGoodsDetails = value;
    }

    /**
     * Gets the value of the pdTransportMeansDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PDTransportMeansDetailsType }
     *     
     */
    public PDTransportMeansDetailsType getPDTransportMeansDetails() {
        return pdTransportMeansDetails;
    }

    /**
     * Sets the value of the pdTransportMeansDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDTransportMeansDetailsType }
     *     
     */
    public void setPDTransportMeansDetails(PDTransportMeansDetailsType value) {
        this.pdTransportMeansDetails = value;
    }

}
