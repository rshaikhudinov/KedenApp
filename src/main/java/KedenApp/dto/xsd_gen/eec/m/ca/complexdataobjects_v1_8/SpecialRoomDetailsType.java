
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
 * сведения о специальном помещении (сооружении) в пункте пропуска
 * 
 * <p>Java class for SpecialRoomDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRoomDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SpecialRoomTypeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SpecialRoomTypeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SpecialRoomQuantity"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRoomDetailsType", propOrder = {
    "specialRoomTypeCode",
    "specialRoomTypeName",
    "specialRoomQuantity"
})
public class SpecialRoomDetailsType {

    @XmlElement(name = "SpecialRoomTypeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String specialRoomTypeCode;
    @XmlElement(name = "SpecialRoomTypeName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String specialRoomTypeName;
    @XmlElement(name = "SpecialRoomQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger specialRoomQuantity;

    /**
     * Gets the value of the specialRoomTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRoomTypeCode() {
        return specialRoomTypeCode;
    }

    /**
     * Sets the value of the specialRoomTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRoomTypeCode(String value) {
        this.specialRoomTypeCode = value;
    }

    /**
     * Gets the value of the specialRoomTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRoomTypeName() {
        return specialRoomTypeName;
    }

    /**
     * Sets the value of the specialRoomTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRoomTypeName(String value) {
        this.specialRoomTypeName = value;
    }

    /**
     * Gets the value of the specialRoomQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSpecialRoomQuantity() {
        return specialRoomQuantity;
    }

    /**
     * Sets the value of the specialRoomQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSpecialRoomQuantity(BigInteger value) {
        this.specialRoomQuantity = value;
    }

}
