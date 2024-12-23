
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие дополнительные сведения в декларации таможенной стоимости
 * 
 * <p>Java class for CVDAdditionalInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVDAdditionalInformationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CVDAdditionalInformationKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDocIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DTConsignmentItemOrdinal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVDAdditionalInformationDetailsType", propOrder = {
    "cvdAdditionalInformationKindCode",
    "descriptionText",
    "customsDocIdDetails",
    "dtConsignmentItemOrdinal"
})
public class CVDAdditionalInformationDetailsType {

    @XmlElement(name = "CVDAdditionalInformationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cvdAdditionalInformationKindCode;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> descriptionText;
    @XmlElement(name = "CustomsDocIdDetails")
    protected CustomsDocumentIdWOrdinalDetailsType customsDocIdDetails;
    @XmlElement(name = "DTConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger dtConsignmentItemOrdinal;

    /**
     * Gets the value of the cvdAdditionalInformationKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVDAdditionalInformationKindCode() {
        return cvdAdditionalInformationKindCode;
    }

    /**
     * Sets the value of the cvdAdditionalInformationKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVDAdditionalInformationKindCode(String value) {
        this.cvdAdditionalInformationKindCode = value;
    }

    /**
     * Дополнительные сведения в текстовом виде Gets the value of the descriptionText property.
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

    /**
     * Регистрационный номер декларации на товары
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdWOrdinalDetailsType }
     *     
     */
    public CustomsDocumentIdWOrdinalDetailsType getCustomsDocIdDetails() {
        return customsDocIdDetails;
    }

    /**
     * Sets the value of the customsDocIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdWOrdinalDetailsType }
     *     
     */
    public void setCustomsDocIdDetails(CustomsDocumentIdWOrdinalDetailsType value) {
        this.customsDocIdDetails = value;
    }

    /**
     * Порядковый номер товара в декларации на товары, регистрационный номер которой указан в графе «Дополнительные данные»
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDTConsignmentItemOrdinal() {
        return dtConsignmentItemOrdinal;
    }

    /**
     * Sets the value of the dtConsignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDTConsignmentItemOrdinal(BigInteger value) {
        this.dtConsignmentItemOrdinal = value;
    }

}
