
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о перевозке товаров
 * 
 * <p>Java class for GDConsignmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GDConsignmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ContainerIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BorderTransportDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ArrivalDepartureTransportDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BorderCustomsOfficeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GDConsignmentDetailsType", propOrder = {
    "containerIndicator",
    "borderTransportDetails",
    "arrivalDepartureTransportDetails",
    "borderCustomsOfficeDetails"
})
public class GDConsignmentDetailsType {

    @XmlElement(name = "ContainerIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean containerIndicator;
    @XmlElement(name = "BorderTransportDetails")
    protected DeclarationTransportMeansDetailsType borderTransportDetails;
    @XmlElement(name = "ArrivalDepartureTransportDetails")
    protected DeclarationTransportMeansDetailsType arrivalDepartureTransportDetails;
    @XmlElement(name = "BorderCustomsOfficeDetails")
    protected List<CustomsOfficeDetailsType> borderCustomsOfficeDetails;

    /**
     * Gets the value of the containerIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainerIndicator() {
        return containerIndicator;
    }

    /**
     * Sets the value of the containerIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainerIndicator(Boolean value) {
        this.containerIndicator = value;
    }

    /**
     * Gets the value of the borderTransportDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationTransportMeansDetailsType }
     *     
     */
    public DeclarationTransportMeansDetailsType getBorderTransportDetails() {
        return borderTransportDetails;
    }

    /**
     * Sets the value of the borderTransportDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationTransportMeansDetailsType }
     *     
     */
    public void setBorderTransportDetails(DeclarationTransportMeansDetailsType value) {
        this.borderTransportDetails = value;
    }

    /**
     * Gets the value of the arrivalDepartureTransportDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationTransportMeansDetailsType }
     *     
     */
    public DeclarationTransportMeansDetailsType getArrivalDepartureTransportDetails() {
        return arrivalDepartureTransportDetails;
    }

    /**
     * Sets the value of the arrivalDepartureTransportDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationTransportMeansDetailsType }
     *     
     */
    public void setArrivalDepartureTransportDetails(DeclarationTransportMeansDetailsType value) {
        this.arrivalDepartureTransportDetails = value;
    }

    /**
     * Таможенный орган въезда или выезда Gets the value of the borderCustomsOfficeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the borderCustomsOfficeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBorderCustomsOfficeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsOfficeDetailsType }
     * 
     * 
     */
    public List<CustomsOfficeDetailsType> getBorderCustomsOfficeDetails() {
        if (borderCustomsOfficeDetails == null) {
            borderCustomsOfficeDetails = new ArrayList<CustomsOfficeDetailsType>();
        }
        return this.borderCustomsOfficeDetails;
    }

}
