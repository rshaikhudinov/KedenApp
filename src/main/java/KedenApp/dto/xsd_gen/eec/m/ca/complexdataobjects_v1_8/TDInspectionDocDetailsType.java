
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о документе, подтверждающем проведение таможенного досмотра (осмотра) при транзитной перевозке
 * 
 * <p>Java class for TDInspectionDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDInspectionDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ActInspectionDocIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPersonDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDInspectionDocDetailsType", propOrder = {
    "actInspectionDocIdDetails",
    "customsPersonDetails"
})
public class TDInspectionDocDetailsType {

    @XmlElement(name = "ActInspectionDocIdDetails", required = true)
    protected InspectionDocIdDetailsType actInspectionDocIdDetails;
    @XmlElement(name = "CustomsPersonDetails")
    protected CustomsPersonDetailsType customsPersonDetails;

    /**
     * Регистрационный номер документа
     * 
     * @return
     *     possible object is
     *     {@link InspectionDocIdDetailsType }
     *     
     */
    public InspectionDocIdDetailsType getActInspectionDocIdDetails() {
        return actInspectionDocIdDetails;
    }

    /**
     * Sets the value of the actInspectionDocIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionDocIdDetailsType }
     *     
     */
    public void setActInspectionDocIdDetails(InspectionDocIdDetailsType value) {
        this.actInspectionDocIdDetails = value;
    }

    /**
     * Gets the value of the customsPersonDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsPersonDetailsType }
     *     
     */
    public CustomsPersonDetailsType getCustomsPersonDetails() {
        return customsPersonDetails;
    }

    /**
     * Sets the value of the customsPersonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsPersonDetailsType }
     *     
     */
    public void setCustomsPersonDetails(CustomsPersonDetailsType value) {
        this.customsPersonDetails = value;
    }

}
