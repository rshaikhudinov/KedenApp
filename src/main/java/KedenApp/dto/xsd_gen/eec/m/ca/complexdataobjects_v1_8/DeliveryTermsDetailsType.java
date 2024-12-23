
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.DeliveryTermsCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения об условиях поставки
 * 
 * <p>Java class for DeliveryTermsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryTermsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DeliveryTermsCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PlaceName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DeliveryKindCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryTermsDetailsType", propOrder = {
    "deliveryTermsCode",
    "placeName",
    "deliveryKindCode"
})
public class DeliveryTermsDetailsType {

    @XmlElement(name = "DeliveryTermsCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected DeliveryTermsCodeType deliveryTermsCode;
    @XmlElement(name = "PlaceName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String placeName;
    @XmlElement(name = "DeliveryKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deliveryKindCode;

    /**
     * Кодовое обозначение условий поставки (базис поставки)
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTermsCodeType }
     *     
     */
    public DeliveryTermsCodeType getDeliveryTermsCode() {
        return deliveryTermsCode;
    }

    /**
     * Sets the value of the deliveryTermsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTermsCodeType }
     *     
     */
    public void setDeliveryTermsCode(DeliveryTermsCodeType value) {
        this.deliveryTermsCode = value;
    }

    /**
     * Наименование географического пункта (согласованного места поставки)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * Gets the value of the deliveryKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryKindCode() {
        return deliveryKindCode;
    }

    /**
     * Sets the value of the deliveryKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryKindCode(String value) {
        this.deliveryKindCode = value;
    }

}
