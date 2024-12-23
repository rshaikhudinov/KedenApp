
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.NoGuaranteeCauseCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения об обеспечении исполнения обязанности по уплате таможенных пошлин, налогов при таможенной процедуре таможенного транзита
 * 
 * <p>Java class for TransitGuaranteeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransitGuaranteeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GuaranteePresentCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}NoGuaranteeCauseCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitGuaranteeDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitGuaranteeDetailsType", propOrder = {
    "guaranteePresentCode",
    "noGuaranteeCauseCode",
    "transitGuaranteeDocDetails"
})
public class TransitGuaranteeDetailsType {

    @XmlElement(name = "GuaranteePresentCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String guaranteePresentCode;
    @XmlElement(name = "NoGuaranteeCauseCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected NoGuaranteeCauseCodeType noGuaranteeCauseCode;
    @XmlElement(name = "TransitGuaranteeDocDetails")
    protected List<TransitGuaranteeDocDetailsType> transitGuaranteeDocDetails;

    /**
     * Gets the value of the guaranteePresentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteePresentCode() {
        return guaranteePresentCode;
    }

    /**
     * Sets the value of the guaranteePresentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteePresentCode(String value) {
        this.guaranteePresentCode = value;
    }

    /**
     * Gets the value of the noGuaranteeCauseCode property.
     * 
     * @return
     *     possible object is
     *     {@link NoGuaranteeCauseCodeType }
     *     
     */
    public NoGuaranteeCauseCodeType getNoGuaranteeCauseCode() {
        return noGuaranteeCauseCode;
    }

    /**
     * Sets the value of the noGuaranteeCauseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoGuaranteeCauseCodeType }
     *     
     */
    public void setNoGuaranteeCauseCode(NoGuaranteeCauseCodeType value) {
        this.noGuaranteeCauseCode = value;
    }

    /**
     * Gets the value of the transitGuaranteeDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transitGuaranteeDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitGuaranteeDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitGuaranteeDocDetailsType }
     * 
     * 
     */
    public List<TransitGuaranteeDocDetailsType> getTransitGuaranteeDocDetails() {
        if (transitGuaranteeDocDetails == null) {
            transitGuaranteeDocDetails = new ArrayList<TransitGuaranteeDocDetailsType>();
        }
        return this.transitGuaranteeDocDetails;
    }

}
