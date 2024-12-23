
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты таможенного приходного ордера, представляющие дополнительную информацию
 * 
 * <p>Java class for CRAdditionalInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRAdditionalInformationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CRTaxAllowanceCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CRPresentedDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CRPreviosDocDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreviousMovingDate" minOccurs="0"/&gt;
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
@XmlType(name = "CRAdditionalInformationDetailsType", propOrder = {
    "crTaxAllowanceCode",
    "crPresentedDocDetails",
    "crPreviosDocDocDetails",
    "previousMovingDate",
    "additionalInfoText"
})
public class CRAdditionalInformationDetailsType {

    @XmlElement(name = "CRTaxAllowanceCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String crTaxAllowanceCode;
    @XmlElement(name = "CRPresentedDocDetails")
    protected List<CADocDetailsType> crPresentedDocDetails;
    @XmlElement(name = "CRPreviosDocDocDetails")
    protected List<CRPreviosDocDetailsType> crPreviosDocDocDetails;
    @XmlElement(name = "PreviousMovingDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar previousMovingDate;
    @XmlElement(name = "AdditionalInfoText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> additionalInfoText;

    /**
     * Признак наличия льготы (для Российской Федерации)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRTaxAllowanceCode() {
        return crTaxAllowanceCode;
    }

    /**
     * Sets the value of the crTaxAllowanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRTaxAllowanceCode(String value) {
        this.crTaxAllowanceCode = value;
    }

    /**
     * Gets the value of the crPresentedDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the crPresentedDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRPresentedDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CADocDetailsType }
     * 
     * 
     */
    public List<CADocDetailsType> getCRPresentedDocDetails() {
        if (crPresentedDocDetails == null) {
            crPresentedDocDetails = new ArrayList<CADocDetailsType>();
        }
        return this.crPresentedDocDetails;
    }

    /**
     * Gets the value of the crPreviosDocDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the crPreviosDocDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRPreviosDocDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRPreviosDocDetailsType }
     * 
     * 
     */
    public List<CRPreviosDocDetailsType> getCRPreviosDocDocDetails() {
        if (crPreviosDocDocDetails == null) {
            crPreviosDocDocDetails = new ArrayList<CRPreviosDocDetailsType>();
        }
        return this.crPreviosDocDocDetails;
    }

    /**
     * Дата предыдущего ввоза товаров
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPreviousMovingDate() {
        return previousMovingDate;
    }

    /**
     * Sets the value of the previousMovingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPreviousMovingDate(XMLGregorianCalendar value) {
        this.previousMovingDate = value;
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
