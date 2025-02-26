
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о принятии и передаче на хранение задержанных товаров
 * 
 * <p>Java class for ATDStorageDetentionsGoodsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDStorageDetentionsGoodsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDCustomsPersonDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDCustodianDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ATDInformationStorageDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDStorageDetentionsGoodsDetailsType", propOrder = {
    "atdCustomsPersonDetails",
    "atdCustodianDetails",
    "atdInformationStorageDetails",
    "descriptionText"
})
public class ATDStorageDetentionsGoodsDetailsType {

    @XmlElement(name = "ATDCustomsPersonDetails", required = true)
    protected ATDCustomsPersonDetailsType atdCustomsPersonDetails;
    @XmlElement(name = "ATDCustodianDetails", required = true)
    protected ATDCustodianDetailsType atdCustodianDetails;
    @XmlElement(name = "ATDInformationStorageDetails")
    protected ATDInformationStorageDetailsType atdInformationStorageDetails;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> descriptionText;

    /**
     * Сведения о сотруднике таможни, принявшем товары на хранение
     * 
     * @return
     *     possible object is
     *     {@link ATDCustomsPersonDetailsType }
     *     
     */
    public ATDCustomsPersonDetailsType getATDCustomsPersonDetails() {
        return atdCustomsPersonDetails;
    }

    /**
     * Sets the value of the atdCustomsPersonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDCustomsPersonDetailsType }
     *     
     */
    public void setATDCustomsPersonDetails(ATDCustomsPersonDetailsType value) {
        this.atdCustomsPersonDetails = value;
    }

    /**
     * Gets the value of the atdCustodianDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDCustodianDetailsType }
     *     
     */
    public ATDCustodianDetailsType getATDCustodianDetails() {
        return atdCustodianDetails;
    }

    /**
     * Sets the value of the atdCustodianDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDCustodianDetailsType }
     *     
     */
    public void setATDCustodianDetails(ATDCustodianDetailsType value) {
        this.atdCustodianDetails = value;
    }

    /**
     * Gets the value of the atdInformationStorageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ATDInformationStorageDetailsType }
     *     
     */
    public ATDInformationStorageDetailsType getATDInformationStorageDetails() {
        return atdInformationStorageDetails;
    }

    /**
     * Sets the value of the atdInformationStorageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ATDInformationStorageDetailsType }
     *     
     */
    public void setATDInformationStorageDetails(ATDInformationStorageDetailsType value) {
        this.atdInformationStorageDetails = value;
    }

    /**
     * Иные отметки о хранении (ответственном хранении) Gets the value of the descriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescriptionText() {
        if (descriptionText == null) {
            descriptionText = new ArrayList<String>();
        }
        return this.descriptionText;
    }

}
