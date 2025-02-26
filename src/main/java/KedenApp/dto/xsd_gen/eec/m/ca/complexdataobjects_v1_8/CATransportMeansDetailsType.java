
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CACountryCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, предоставляющие информацию о транспортном средстве
 * 
 * <p>Java class for CATransportMeansDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CATransportMeansDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedTransportModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RegistrationNationalityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportMeansQuantity" minOccurs="0"/&gt;
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
@XmlType(name = "CATransportMeansDetailsType", propOrder = {
    "unifiedTransportModeCode",
    "registrationNationalityCode",
    "transportMeansQuantity",
    "transportMeansItemDetails"
})
@XmlSeeAlso({
    DeclarationTransportMeansDetailsType.class
})
public class CATransportMeansDetailsType {

    @XmlElement(name = "UnifiedTransportModeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type unifiedTransportModeCode;
    @XmlElement(name = "RegistrationNationalityCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CACountryCodeType registrationNationalityCode;
    @XmlElement(name = "TransportMeansQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger transportMeansQuantity;
    @XmlElement(name = "TransportMeansItemDetails")
    protected List<TransportMeansItemDetailsType> transportMeansItemDetails;

    /**
     * Gets the value of the unifiedTransportModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getUnifiedTransportModeCode() {
        return unifiedTransportModeCode;
    }

    /**
     * Sets the value of the unifiedTransportModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setUnifiedTransportModeCode(UnifiedCode20Type value) {
        this.unifiedTransportModeCode = value;
    }

    /**
     * Gets the value of the registrationNationalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryCodeType }
     *     
     */
    public CACountryCodeType getRegistrationNationalityCode() {
        return registrationNationalityCode;
    }

    /**
     * Sets the value of the registrationNationalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryCodeType }
     *     
     */
    public void setRegistrationNationalityCode(CACountryCodeType value) {
        this.registrationNationalityCode = value;
    }

    /**
     * Gets the value of the transportMeansQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransportMeansQuantity() {
        return transportMeansQuantity;
    }

    /**
     * Sets the value of the transportMeansQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransportMeansQuantity(BigInteger value) {
        this.transportMeansQuantity = value;
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
