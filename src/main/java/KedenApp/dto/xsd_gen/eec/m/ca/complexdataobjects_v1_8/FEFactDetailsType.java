
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о фактическом вывозе товаров
 * 
 * <p>Java class for FEFactDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEFactDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDeclarationIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FERegistrationIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDateTime"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPersonDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BorderTransportsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FEGoodsDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AdditionalInfoText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FEFactDetailsType", propOrder = {
    "customsDeclarationIdDetails",
    "feRegistrationIdDetails",
    "eventDateTime",
    "customsPersonDetails",
    "borderTransportsDetails",
    "feGoodsDetails",
    "additionalInfoText"
})
public class FEFactDetailsType {

    @XmlElement(name = "CustomsDeclarationIdDetails", required = true)
    protected CustomsDocumentIdDetailsType customsDeclarationIdDetails;
    @XmlElement(name = "FERegistrationIdDetails", required = true)
    protected FERegistrationIdDetailsType feRegistrationIdDetails;
    @XmlElement(name = "EventDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;
    @XmlElement(name = "CustomsPersonDetails", required = true)
    protected CustomsPersonDetailsType customsPersonDetails;
    @XmlElement(name = "BorderTransportsDetails")
    protected CATransportMeansDetailsType borderTransportsDetails;
    @XmlElement(name = "FEGoodsDetails", required = true)
    protected List<FEGoodsDetailsType> feGoodsDetails;
    @XmlElement(name = "AdditionalInfoText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> additionalInfoText;

    /**
     * Регистрационный номер декларации на товары
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public CustomsDocumentIdDetailsType getCustomsDeclarationIdDetails() {
        return customsDeclarationIdDetails;
    }

    /**
     * Sets the value of the customsDeclarationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public void setCustomsDeclarationIdDetails(CustomsDocumentIdDetailsType value) {
        this.customsDeclarationIdDetails = value;
    }

    /**
     * Gets the value of the feRegistrationIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FERegistrationIdDetailsType }
     *     
     */
    public FERegistrationIdDetailsType getFERegistrationIdDetails() {
        return feRegistrationIdDetails;
    }

    /**
     * Sets the value of the feRegistrationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FERegistrationIdDetailsType }
     *     
     */
    public void setFERegistrationIdDetails(FERegistrationIdDetailsType value) {
        this.feRegistrationIdDetails = value;
    }

    /**
     * дата и время убытия товаров
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Sets the value of the eventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDateTime(XMLGregorianCalendar value) {
        this.eventDateTime = value;
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

    /**
     * Gets the value of the borderTransportsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CATransportMeansDetailsType }
     *     
     */
    public CATransportMeansDetailsType getBorderTransportsDetails() {
        return borderTransportsDetails;
    }

    /**
     * Sets the value of the borderTransportsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATransportMeansDetailsType }
     *     
     */
    public void setBorderTransportsDetails(CATransportMeansDetailsType value) {
        this.borderTransportsDetails = value;
    }

    /**
     * Gets the value of the feGoodsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the feGoodsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEGoodsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEGoodsDetailsType }
     * 
     * 
     */
    public List<FEGoodsDetailsType> getFEGoodsDetails() {
        if (feGoodsDetails == null) {
            feGoodsDetails = new ArrayList<FEGoodsDetailsType>();
        }
        return this.feGoodsDetails;
    }

    /**
     * Gets the value of the additionalInfoText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfoText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfoText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalInfoText() {
        if (additionalInfoText == null) {
            additionalInfoText = new ArrayList<String>();
        }
        return this.additionalInfoText;
    }

}
