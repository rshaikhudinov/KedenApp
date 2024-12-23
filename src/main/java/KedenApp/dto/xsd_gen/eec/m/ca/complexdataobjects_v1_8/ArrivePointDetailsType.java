
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о месте прибытия (убытия) товаров
 * 
 * <p>Java class for ArrivePointDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrivePointDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ArrivePointPADCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProvidedInformationCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ArrivePointName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}BorderCheckPointCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}BorderCheckPointName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ArriveCustomsDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivePointDetailsType", propOrder = {
    "arrivePointPADCode",
    "providedInformationCountryCode",
    "arrivePointName",
    "borderCheckPointCode",
    "borderCheckPointName",
    "arriveCustomsDetails"
})
public class ArrivePointDetailsType {

    @XmlElement(name = "ArrivePointPADCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String arrivePointPADCode;
    @XmlElement(name = "ProvidedInformationCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String providedInformationCountryCode;
    @XmlElement(name = "ArrivePointName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String arrivePointName;
    @XmlElement(name = "BorderCheckPointCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String borderCheckPointCode;
    @XmlElement(name = "BorderCheckPointName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String borderCheckPointName;
    @XmlElement(name = "ArriveCustomsDetails", required = true)
    protected ArriveCustomsDetailsType arriveCustomsDetails;

    /**
     * Gets the value of the arrivePointPADCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivePointPADCode() {
        return arrivePointPADCode;
    }

    /**
     * Sets the value of the arrivePointPADCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivePointPADCode(String value) {
        this.arrivePointPADCode = value;
    }

    /**
     * Кодовое обозначение страны, предоставившей информацию (второй элемент кодового обозначения места прибытия (убытия) товаров)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvidedInformationCountryCode() {
        return providedInformationCountryCode;
    }

    /**
     * Sets the value of the providedInformationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvidedInformationCountryCode(String value) {
        this.providedInformationCountryCode = value;
    }

    /**
     * Gets the value of the arrivePointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivePointName() {
        return arrivePointName;
    }

    /**
     * Sets the value of the arrivePointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivePointName(String value) {
        this.arrivePointName = value;
    }

    /**
     * Gets the value of the borderCheckPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderCheckPointCode() {
        return borderCheckPointCode;
    }

    /**
     * Sets the value of the borderCheckPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderCheckPointCode(String value) {
        this.borderCheckPointCode = value;
    }

    /**
     * Gets the value of the borderCheckPointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderCheckPointName() {
        return borderCheckPointName;
    }

    /**
     * Sets the value of the borderCheckPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderCheckPointName(String value) {
        this.borderCheckPointName = value;
    }

    /**
     * Gets the value of the arriveCustomsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArriveCustomsDetailsType }
     *     
     */
    public ArriveCustomsDetailsType getArriveCustomsDetails() {
        return arriveCustomsDetails;
    }

    /**
     * Sets the value of the arriveCustomsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArriveCustomsDetailsType }
     *     
     */
    public void setArriveCustomsDetails(ArriveCustomsDetailsType value) {
        this.arriveCustomsDetails = value;
    }

}
