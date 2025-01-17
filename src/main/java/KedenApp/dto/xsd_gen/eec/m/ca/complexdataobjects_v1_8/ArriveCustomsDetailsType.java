
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о таможенном органе, совершающем таможенные операции, в месте прибытия (убытия) товаров
 * 
 * <p>Java class for ArriveCustomsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArriveCustomsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TransportModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportModeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ArrivePointLocationDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArriveCustomsDetailsType", propOrder = {
    "customsOfficeCode",
    "customsOfficeName",
    "transportModeCode",
    "transportModeName",
    "arrivePointLocationDetails"
})
public class ArriveCustomsDetailsType {

    @XmlElement(name = "CustomsOfficeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeCode;
    @XmlElement(name = "CustomsOfficeName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeName;
    @XmlElement(name = "TransportModeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportModeCode;
    @XmlElement(name = "TransportModeName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportModeName;
    @XmlElement(name = "ArrivePointLocationDetails", required = true)
    protected ArrivePointLocationDetailsType arrivePointLocationDetails;

    /**
     * Код таможенного органа в соответствии с классификаторами таможенных органов, применяемыми в государствах-членах (третий элемент кодового обозначения места прибытия (убытия) товаров)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOfficeCode() {
        return customsOfficeCode;
    }

    /**
     * Sets the value of the customsOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOfficeCode(String value) {
        this.customsOfficeCode = value;
    }

    /**
     * Gets the value of the customsOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOfficeName() {
        return customsOfficeName;
    }

    /**
     * Sets the value of the customsOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOfficeName(String value) {
        this.customsOfficeName = value;
    }

    /**
     * Gets the value of the transportModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /**
     * Sets the value of the transportModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportModeCode(String value) {
        this.transportModeCode = value;
    }

    /**
     * Gets the value of the transportModeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportModeName() {
        return transportModeName;
    }

    /**
     * Sets the value of the transportModeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportModeName(String value) {
        this.transportModeName = value;
    }

    /**
     * Gets the value of the arrivePointLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivePointLocationDetailsType }
     *     
     */
    public ArrivePointLocationDetailsType getArrivePointLocationDetails() {
        return arrivePointLocationDetails;
    }

    /**
     * Sets the value of the arrivePointLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivePointLocationDetailsType }
     *     
     */
    public void setArrivePointLocationDetails(ArrivePointLocationDetailsType value) {
        this.arrivePointLocationDetails = value;
    }

}
