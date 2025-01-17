
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CACountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о стране
 * 
 * <p>Java class for CACountryDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CACountryDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CACountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ShortCountryName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TerritoryCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CACountryDetailsType", propOrder = {
    "caCountryCode",
    "shortCountryName",
    "territoryCode"
})
public class CACountryDetailsType {

    @XmlElement(name = "CACountryCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CACountryCodeType caCountryCode;
    @XmlElement(name = "ShortCountryName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shortCountryName;
    @XmlElement(name = "TerritoryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String territoryCode;

    /**
     * Кодовое обозначение страны
     * 
     * @return
     *     possible object is
     *     {@link CACountryCodeType }
     *     
     */
    public CACountryCodeType getCACountryCode() {
        return caCountryCode;
    }

    /**
     * Sets the value of the caCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryCodeType }
     *     
     */
    public void setCACountryCode(CACountryCodeType value) {
        this.caCountryCode = value;
    }

    /**
     * Gets the value of the shortCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortCountryName() {
        return shortCountryName;
    }

    /**
     * Sets the value of the shortCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortCountryName(String value) {
        this.shortCountryName = value;
    }

    /**
     * Кодовое обозначение единицы административно-территориального деления
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerritoryCode() {
        return territoryCode;
    }

    /**
     * Sets the value of the territoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerritoryCode(String value) {
        this.territoryCode = value;
    }

}
