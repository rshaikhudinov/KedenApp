
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о транспортных средствах, используемых при перевозке в соответствии с таможенной процедурой таможенного транзита
 * 
 * <p>Java class for PITransitTransportMeansDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PITransitTransportMeansDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EqualIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransportMeansItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PITransitTransportMeansDetailsType", propOrder = {
    "equalIndicator",
    "transportMeansItemDetails"
})
public class PITransitTransportMeansDetailsType {

    @XmlElement(name = "EqualIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean equalIndicator;
    @XmlElement(name = "TransportMeansItemDetails")
    protected List<TransportMeansItemDetailsType> transportMeansItemDetails;

    /**
     * признак совпадения транспортных средств, прибывающих на таможенную территорию Евразийского экономического союза, с транспортными средствами, осуществляющими перевозку товаров в соответствии с таможенной процедурой таможенного транзита
     * 
     */
    public Boolean isEqualIndicator() {
        return equalIndicator;
    }

    /**
     * Sets the value of the equalIndicator property.
     * 
     */
    public void setEqualIndicator(Boolean value) {
        this.equalIndicator = value;
    }

    /**
     * Gets the value of the transportMeansItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transportMeansItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportMeansItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportMeansItemDetailsType }
     * 
     * 
     */
    public List<TransportMeansItemDetailsType> getTransportMeansItemDetails() {
        if (transportMeansItemDetails == null) {
            transportMeansItemDetails = new ArrayList<TransportMeansItemDetailsType>();
        }
        return this.transportMeansItemDetails;
    }

}
