
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о системе телевизионного (видео) наблюдения пункта пропуска
 * 
 * <p>Java class for CheckPointTVSystemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPointTVSystemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CheckPointSystemObjectQuantity"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CheckPointTVLocationCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CheckPointTVLocationText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPointTVSystemDetailsType", propOrder = {
    "checkPointSystemObjectQuantity",
    "checkPointTVLocationCode",
    "checkPointTVLocationText"
})
public class CheckPointTVSystemDetailsType {

    @XmlElement(name = "CheckPointSystemObjectQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger checkPointSystemObjectQuantity;
    @XmlElement(name = "CheckPointTVLocationCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String checkPointTVLocationCode;
    @XmlElement(name = "CheckPointTVLocationText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String checkPointTVLocationText;

    /**
     * Gets the value of the checkPointSystemObjectQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCheckPointSystemObjectQuantity() {
        return checkPointSystemObjectQuantity;
    }

    /**
     * Sets the value of the checkPointSystemObjectQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCheckPointSystemObjectQuantity(BigInteger value) {
        this.checkPointSystemObjectQuantity = value;
    }

    /**
     * Gets the value of the checkPointTVLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPointTVLocationCode() {
        return checkPointTVLocationCode;
    }

    /**
     * Sets the value of the checkPointTVLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPointTVLocationCode(String value) {
        this.checkPointTVLocationCode = value;
    }

    /**
     * Gets the value of the checkPointTVLocationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPointTVLocationText() {
        return checkPointTVLocationText;
    }

    /**
     * Sets the value of the checkPointTVLocationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPointTVLocationText(String value) {
        this.checkPointTVLocationText = value;
    }

}
