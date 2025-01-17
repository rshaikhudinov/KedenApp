
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
 * Сведения об отборе проб и образцов
 * 
 * <p>Java class for ATDInformationSamplesSelectionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDInformationSamplesSelectionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SamplesSelectionCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ObjectDescriptionText"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDGoodsOwnerDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDSamplesLocationDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDTermsThievingSamplingDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDSamplesAddressDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDPackageSamplesDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDInformationSamplesSelectionDetailsType", propOrder = {
    "samplesSelectionCode",
    "objectDescriptionText",
    "atdGoodsOwnerDetails",
    "atdSamplesLocationDetails",
    "eventDate",
    "atdTermsThievingSamplingDetails",
    "atdSamplesAddressDetails",
    "atdPackageSamplesDetails",
    "descriptionText"
})
public class ATDInformationSamplesSelectionDetailsType {

    @XmlElement(name = "SamplesSelectionCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String samplesSelectionCode;
    @XmlElement(name = "ObjectDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected String objectDescriptionText;
    @XmlElement(name = "ATDGoodsOwnerDetails", required = true)
    protected ATDGoodsOwnerDetailsType atdGoodsOwnerDetails;
    @XmlElement(name = "ATDSamplesLocationDetails", required = true)
    protected List<ATDSamplesLocationDetailsType> atdSamplesLocationDetails;
    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "ATDTermsThievingSamplingDetails", required = true)
    protected ATDTermsThievingSamplingDetailsType atdTermsThievingSamplingDetails;
    @XmlElement(name = "ATDSamplesAddressDetails", required = true)
    protected ATDSamplesAddressDetailsType atdSamplesAddressDetails;
    @XmlElement(name = "ATDPackageSamplesDetails")
    protected List<ATDPackageSamplesDetailsType> atdPackageSamplesDetails;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;

    /**
     * Gets the value of the samplesSelectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSamplesSelectionCode() {
        return samplesSelectionCode;
    }

    /**
     * Sets the value of the samplesSelectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSamplesSelectionCode(String value) {
        this.samplesSelectionCode = value;
    }

    /**
     * наименование объектов, из числа которых произведен отбор проб и (или) образцов
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectDescriptionText() {
        return objectDescriptionText;
    }

    /**
     * Sets the value of the objectDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectDescriptionText(String value) {
        this.objectDescriptionText = value;
    }

    /**
     * Gets the value of the atdGoodsOwnerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDGoodsOwnerDetailsType }
     *     
     */
    public ATDGoodsOwnerDetailsType getATDGoodsOwnerDetails() {
        return atdGoodsOwnerDetails;
    }

    /**
     * Sets the value of the atdGoodsOwnerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDGoodsOwnerDetailsType }
     *     
     */
    public void setATDGoodsOwnerDetails(ATDGoodsOwnerDetailsType value) {
        this.atdGoodsOwnerDetails = value;
    }

    /**
     * Сведения о месте нахождения товара, в отношении которого, проведен отбор проб и (или) образцов Gets the value of the atdSamplesLocationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdSamplesLocationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDSamplesLocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATDSamplesLocationDetailsType }
     * 
     * 
     */
    public List<ATDSamplesLocationDetailsType> getATDSamplesLocationDetails() {
        if (atdSamplesLocationDetails == null) {
            atdSamplesLocationDetails = new ArrayList<ATDSamplesLocationDetailsType>();
        }
        return this.atdSamplesLocationDetails;
    }

    /**
     * Дата предоставления товаров к таможенному контролю
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the atdTermsThievingSamplingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDTermsThievingSamplingDetailsType }
     *     
     */
    public ATDTermsThievingSamplingDetailsType getATDTermsThievingSamplingDetails() {
        return atdTermsThievingSamplingDetails;
    }

    /**
     * Sets the value of the atdTermsThievingSamplingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDTermsThievingSamplingDetailsType }
     *     
     */
    public void setATDTermsThievingSamplingDetails(ATDTermsThievingSamplingDetailsType value) {
        this.atdTermsThievingSamplingDetails = value;
    }

    /**
     * Сведения об адресе отбора проб и (или) образцов
     * 
     * @return
     *     possible object is
     *     {@link ATDSamplesAddressDetailsType }
     *     
     */
    public ATDSamplesAddressDetailsType getATDSamplesAddressDetails() {
        return atdSamplesAddressDetails;
    }

    /**
     * Sets the value of the atdSamplesAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDSamplesAddressDetailsType }
     *     
     */
    public void setATDSamplesAddressDetails(ATDSamplesAddressDetailsType value) {
        this.atdSamplesAddressDetails = value;
    }

    /**
     * Gets the value of the atdPackageSamplesDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atdPackageSamplesDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getATDPackageSamplesDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATDPackageSamplesDetailsType }
     * 
     * 
     */
    public List<ATDPackageSamplesDetailsType> getATDPackageSamplesDetails() {
        if (atdPackageSamplesDetails == null) {
            atdPackageSamplesDetails = new ArrayList<ATDPackageSamplesDetailsType>();
        }
        return this.atdPackageSamplesDetails;
    }

    /**
     * Сведения о приложениях к акту отбора проб и (или) образцов товара
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

}
