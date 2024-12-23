
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о предоставлении обеспечения уплаты таможенных пошлин, налогов
 * 
 * <p>Java class for GRAGuaranteeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GRAGuaranteeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GuaranteeIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PaymentGuaranteeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AdditionalInfoText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GRAGuaranteeDetailsType", propOrder = {
    "guaranteeIndicator",
    "paymentGuaranteeDetails",
    "additionalInfoText"
})
public class GRAGuaranteeDetailsType {

    @XmlElement(name = "GuaranteeIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean guaranteeIndicator;
    @XmlElement(name = "PaymentGuaranteeDetails")
    protected List<PaymentGuaranteeDetailsType> paymentGuaranteeDetails;
    @XmlElement(name = "AdditionalInfoText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String additionalInfoText;

    /**
     * Gets the value of the guaranteeIndicator property.
     * 
     */
    public Boolean isGuaranteeIndicator() {
        return guaranteeIndicator;
    }

    /**
     * Sets the value of the guaranteeIndicator property.
     * 
     */
    public void setGuaranteeIndicator(Boolean value) {
        this.guaranteeIndicator = value;
    }

    /**
     * Gets the value of the paymentGuaranteeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the paymentGuaranteeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentGuaranteeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentGuaranteeDetailsType }
     * 
     * 
     */
    public List<PaymentGuaranteeDetailsType> getPaymentGuaranteeDetails() {
        if (paymentGuaranteeDetails == null) {
            paymentGuaranteeDetails = new ArrayList<PaymentGuaranteeDetailsType>();
        }
        return this.paymentGuaranteeDetails;
    }

    /**
     * Основание по которым обеспечение не предоставляется
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfoText() {
        return additionalInfoText;
    }

    /**
     * Sets the value of the additionalInfoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfoText(String value) {
        this.additionalInfoText = value;
    }

}
