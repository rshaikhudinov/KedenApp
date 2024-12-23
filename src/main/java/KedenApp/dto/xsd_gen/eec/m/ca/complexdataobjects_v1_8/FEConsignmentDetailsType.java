
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о товарной партии, подлежащей вывозу
 * 
 * <p>Java class for FEConsignmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FEConsignmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDeclarationIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CustomsOfficeDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsignorDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DestinationCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}BorderCustomsOfficeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FEGoodsDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}BorderTransportsDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CarrierDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FEConsignmentDetailsType", propOrder = {
    "customsDeclarationIdDetails",
    "customsOfficeDetails",
    "consignorDetails",
    "destinationCountryDetails",
    "borderCustomsOfficeCode",
    "feGoodsDetails",
    "borderTransportsDetails",
    "carrierDetails",
    "additionalInfoText"
})
public class FEConsignmentDetailsType {

    @XmlElement(name = "CustomsDeclarationIdDetails", required = true)
    protected CustomsDocumentIdDetailsType customsDeclarationIdDetails;
    @XmlElement(name = "CustomsOfficeDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected CustomsOfficeDetailsType customsOfficeDetails;
    @XmlElement(name = "ConsignorDetails")
    protected GoodsShipmentSubjectDetailsType consignorDetails;
    @XmlElement(name = "DestinationCountryDetails")
    protected CACountryDetailsType destinationCountryDetails;
    @XmlElement(name = "BorderCustomsOfficeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String borderCustomsOfficeCode;
    @XmlElement(name = "FEGoodsDetails", required = true)
    protected List<FEGoodsDetailsType> feGoodsDetails;
    @XmlElement(name = "BorderTransportsDetails")
    protected CATransportMeansDetailsType borderTransportsDetails;
    @XmlElement(name = "CarrierDetails")
    protected List<CarrierDetailsType> carrierDetails;
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
     * Таможенный орган выпуска товара
     * 
     * @return
     *     possible object is
     *     {@link CustomsOfficeDetailsType }
     *     
     */
    public CustomsOfficeDetailsType getCustomsOfficeDetails() {
        return customsOfficeDetails;
    }

    /**
     * Sets the value of the customsOfficeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsOfficeDetailsType }
     *     
     */
    public void setCustomsOfficeDetails(CustomsOfficeDetailsType value) {
        this.customsOfficeDetails = value;
    }

    /**
     * Gets the value of the consignorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public GoodsShipmentSubjectDetailsType getConsignorDetails() {
        return consignorDetails;
    }

    /**
     * Sets the value of the consignorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsShipmentSubjectDetailsType }
     *     
     */
    public void setConsignorDetails(GoodsShipmentSubjectDetailsType value) {
        this.consignorDetails = value;
    }

    /**
     * Gets the value of the destinationCountryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryDetailsType }
     *     
     */
    public CACountryDetailsType getDestinationCountryDetails() {
        return destinationCountryDetails;
    }

    /**
     * Sets the value of the destinationCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryDetailsType }
     *     
     */
    public void setDestinationCountryDetails(CACountryDetailsType value) {
        this.destinationCountryDetails = value;
    }

    /**
     * код таможенного органа места убытия
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderCustomsOfficeCode() {
        return borderCustomsOfficeCode;
    }

    /**
     * Sets the value of the borderCustomsOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderCustomsOfficeCode(String value) {
        this.borderCustomsOfficeCode = value;
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
     * Gets the value of the carrierDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the carrierDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierDetailsType }
     * 
     * 
     */
    public List<CarrierDetailsType> getCarrierDetails() {
        if (carrierDetails == null) {
            carrierDetails = new ArrayList<CarrierDetailsType>();
        }
        return this.carrierDetails;
    }

    /**
     * Дополнительная информация Gets the value of the additionalInfoText property.
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
