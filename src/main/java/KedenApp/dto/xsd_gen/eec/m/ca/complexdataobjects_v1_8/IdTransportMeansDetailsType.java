
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о регистрационных и идентификационных номерах активного и прицепного транспортных средств
 * 
 * <p>Java class for IdTransportMeansDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdTransportMeansDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransportMeansIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DependTransportMeansIdDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdTransportMeansDetailsType", propOrder = {
    "transportMeansIdDetails",
    "dependTransportMeansIdDetails"
})
public class IdTransportMeansDetailsType {

    @XmlElement(name = "TransportMeansIdDetails", required = true)
    protected TransportMeansIDDetailsType transportMeansIdDetails;
    @XmlElement(name = "DependTransportMeansIdDetails")
    protected List<TransportMeansIDDetailsType> dependTransportMeansIdDetails;

    /**
     * Gets the value of the transportMeansIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansIDDetailsType }
     *     
     */
    public TransportMeansIDDetailsType getTransportMeansIdDetails() {
        return transportMeansIdDetails;
    }

    /**
     * Sets the value of the transportMeansIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansIDDetailsType }
     *     
     */
    public void setTransportMeansIdDetails(TransportMeansIDDetailsType value) {
        this.transportMeansIdDetails = value;
    }

    /**
     * Gets the value of the dependTransportMeansIdDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dependTransportMeansIdDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependTransportMeansIdDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportMeansIDDetailsType }
     * 
     * 
     */
    public List<TransportMeansIDDetailsType> getDependTransportMeansIdDetails() {
        if (dependTransportMeansIdDetails == null) {
            dependTransportMeansIdDetails = new ArrayList<TransportMeansIDDetailsType>();
        }
        return this.dependTransportMeansIdDetails;
    }

}
