
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения для указания диапазона порядковых номеров
 * 
 * <p>Java class for OrdinalRangeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdinalRangeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}FirstReferenceOrdinal"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LastReferenceOrdinal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdinalRangeDetailsType", propOrder = {
    "firstReferenceOrdinal",
    "lastReferenceOrdinal"
})
public class OrdinalRangeDetailsType {

    @XmlElement(name = "FirstReferenceOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger firstReferenceOrdinal;
    @XmlElement(name = "LastReferenceOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger lastReferenceOrdinal;

    /**
     * Gets the value of the firstReferenceOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstReferenceOrdinal() {
        return firstReferenceOrdinal;
    }

    /**
     * Sets the value of the firstReferenceOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstReferenceOrdinal(BigInteger value) {
        this.firstReferenceOrdinal = value;
    }

    /**
     * Gets the value of the lastReferenceOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastReferenceOrdinal() {
        return lastReferenceOrdinal;
    }

    /**
     * Sets the value of the lastReferenceOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastReferenceOrdinal(BigInteger value) {
        this.lastReferenceOrdinal = value;
    }

}
