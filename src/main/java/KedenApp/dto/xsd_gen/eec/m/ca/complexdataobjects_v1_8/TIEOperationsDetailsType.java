
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о таможенных операциях, совершенных в ходе временного ввоза (вывоза) транспорного средства
 * 
 * <p>Java class for TIEOperationsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIEOperationsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIEExtensionDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIECloseDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIERemovalInfoDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIEOperationsDetailsType", propOrder = {
    "tieExtensionDetails",
    "tieCloseDetails",
    "tieRemovalInfoDetails"
})
public class TIEOperationsDetailsType {

    @XmlElement(name = "TIEExtensionDetails")
    protected TIEExtensionDetailsType tieExtensionDetails;
    @XmlElement(name = "TIECloseDetails")
    protected TIECloseDetailsType tieCloseDetails;
    @XmlElement(name = "TIERemovalInfoDetails")
    protected TIERemovalInfoDetailsType tieRemovalInfoDetails;

    /**
     * Сведения об операции продления срока временного ввоза ТСЛП (ТСМП)
     * 
     * @return
     *     possible object is
     *     {@link TIEExtensionDetailsType }
     *     
     */
    public TIEExtensionDetailsType getTIEExtensionDetails() {
        return tieExtensionDetails;
    }

    /**
     * Sets the value of the tieExtensionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIEExtensionDetailsType }
     *     
     */
    public void setTIEExtensionDetails(TIEExtensionDetailsType value) {
        this.tieExtensionDetails = value;
    }

    /**
     * Gets the value of the tieCloseDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TIECloseDetailsType }
     *     
     */
    public TIECloseDetailsType getTIECloseDetails() {
        return tieCloseDetails;
    }

    /**
     * Sets the value of the tieCloseDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIECloseDetailsType }
     *     
     */
    public void setTIECloseDetails(TIECloseDetailsType value) {
        this.tieCloseDetails = value;
    }

    /**
     * Gets the value of the tieRemovalInfoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TIERemovalInfoDetailsType }
     *     
     */
    public TIERemovalInfoDetailsType getTIERemovalInfoDetails() {
        return tieRemovalInfoDetails;
    }

    /**
     * Sets the value of the tieRemovalInfoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIERemovalInfoDetailsType }
     *     
     */
    public void setTIERemovalInfoDetails(TIERemovalInfoDetailsType value) {
        this.tieRemovalInfoDetails = value;
    }

}
