
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Регистрационный номер книжки МДП
 * 
 * <p>Java class for TIRBaseIdDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIRBaseIdDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TIRSeriesId"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TIRId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIRBaseIdDetailsType", propOrder = {
    "tirSeriesId",
    "tirId"
})
@XmlSeeAlso({
    TIRCarnetIdDetailsType.class
})
public class TIRBaseIdDetailsType {

    @XmlElement(name = "TIRSeriesId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tirSeriesId;
    @XmlElement(name = "TIRId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tirId;

    /**
     * Gets the value of the tirSeriesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIRSeriesId() {
        return tirSeriesId;
    }

    /**
     * Sets the value of the tirSeriesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIRSeriesId(String value) {
        this.tirSeriesId = value;
    }

    /**
     * Gets the value of the tirId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIRId() {
        return tirId;
    }

    /**
     * Sets the value of the tirId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIRId(String value) {
        this.tirId = value;
    }

}
