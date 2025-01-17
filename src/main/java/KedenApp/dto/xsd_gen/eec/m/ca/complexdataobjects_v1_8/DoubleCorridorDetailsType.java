
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о технологической системе двойного коридора пункта пропуска
 * 
 * <p>Java class for DoubleCorridorDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DoubleCorridorDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DoubleCorridorExistenceIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CountRedLinesQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CountGreenLinesQuantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoubleCorridorDetailsType", propOrder = {
    "doubleCorridorExistenceIndicator",
    "countRedLinesQuantity",
    "countGreenLinesQuantity"
})
public class DoubleCorridorDetailsType {

    @XmlElement(name = "DoubleCorridorExistenceIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean doubleCorridorExistenceIndicator;
    @XmlElement(name = "CountRedLinesQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger countRedLinesQuantity;
    @XmlElement(name = "CountGreenLinesQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger countGreenLinesQuantity;

    /**
     * Gets the value of the doubleCorridorExistenceIndicator property.
     * 
     */
    public Boolean isDoubleCorridorExistenceIndicator() {
        return doubleCorridorExistenceIndicator;
    }

    /**
     * Sets the value of the doubleCorridorExistenceIndicator property.
     * 
     */
    public void setDoubleCorridorExistenceIndicator(Boolean value) {
        this.doubleCorridorExistenceIndicator = value;
    }

    /**
     * Gets the value of the countRedLinesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountRedLinesQuantity() {
        return countRedLinesQuantity;
    }

    /**
     * Sets the value of the countRedLinesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountRedLinesQuantity(BigInteger value) {
        this.countRedLinesQuantity = value;
    }

    /**
     * Gets the value of the countGreenLinesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountGreenLinesQuantity() {
        return countGreenLinesQuantity;
    }

    /**
     * Sets the value of the countGreenLinesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountGreenLinesQuantity(BigInteger value) {
        this.countGreenLinesQuantity = value;
    }

}
