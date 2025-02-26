
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о маршруте транзитной перевозки
 * 
 * <p>Java class for TDRouteDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDRouteDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DepartureCustomsOfficeDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDDestinationPlaceDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitRoutePointDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDRouteDetailsType", propOrder = {
    "departureCustomsOfficeDetails",
    "tdDestinationPlaceDetails",
    "transitRoutePointDetails"
})
public class TDRouteDetailsType {

    @XmlElement(name = "DepartureCustomsOfficeDetails", required = true)
    protected UnifiedCustomsOfficeDetailsType departureCustomsOfficeDetails;
    @XmlElement(name = "TDDestinationPlaceDetails", required = true)
    protected OperationPlaceDetailsType tdDestinationPlaceDetails;
    @XmlElement(name = "TransitRoutePointDetails")
    protected List<TransitRoutePointDetailsType> transitRoutePointDetails;

    /**
     * Gets the value of the departureCustomsOfficeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCustomsOfficeDetailsType }
     *     
     */
    public UnifiedCustomsOfficeDetailsType getDepartureCustomsOfficeDetails() {
        return departureCustomsOfficeDetails;
    }

    /**
     * Sets the value of the departureCustomsOfficeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCustomsOfficeDetailsType }
     *     
     */
    public void setDepartureCustomsOfficeDetails(UnifiedCustomsOfficeDetailsType value) {
        this.departureCustomsOfficeDetails = value;
    }

    /**
     * Сведения о таможенном органе или месте назначения
     * 
     * @return
     *     possible object is
     *     {@link OperationPlaceDetailsType }
     *     
     */
    public OperationPlaceDetailsType getTDDestinationPlaceDetails() {
        return tdDestinationPlaceDetails;
    }

    /**
     * Sets the value of the tdDestinationPlaceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationPlaceDetailsType }
     *     
     */
    public void setTDDestinationPlaceDetails(OperationPlaceDetailsType value) {
        this.tdDestinationPlaceDetails = value;
    }

    /**
     * Gets the value of the transitRoutePointDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transitRoutePointDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitRoutePointDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitRoutePointDetailsType }
     * 
     * 
     */
    public List<TransitRoutePointDetailsType> getTransitRoutePointDetails() {
        if (transitRoutePointDetails == null) {
            transitRoutePointDetails = new ArrayList<TransitRoutePointDetailsType>();
        }
        return this.transitRoutePointDetails;
    }

}
