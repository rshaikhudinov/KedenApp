
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Документ, удостоверяющий полномочия
 * 
 * <p>Java class for PowerOfAttorneyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerOfAttorneyDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADocBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EDocCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DocArchIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DocumentPresentingDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerOfAttorneyDetailsType", propOrder = {
    "eDocCode",
    "docArchIdDetails",
    "documentPresentingDetails"
})
public class PowerOfAttorneyDetailsType
    extends CADocBaseType
{

    @XmlElement(name = "EDocCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eDocCode;
    @XmlElement(name = "DocArchIdDetails")
    protected DocArchIdDetailsType docArchIdDetails;
    @XmlElement(name = "DocumentPresentingDetails")
    protected DocumentPresentingDetailsType documentPresentingDetails;

    /**
     * Gets the value of the eDocCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocCode() {
        return eDocCode;
    }

    /**
     * Sets the value of the eDocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocCode(String value) {
        this.eDocCode = value;
    }

    /**
     * Gets the value of the docArchIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocArchIdDetailsType }
     *     
     */
    public DocArchIdDetailsType getDocArchIdDetails() {
        return docArchIdDetails;
    }

    /**
     * Sets the value of the docArchIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocArchIdDetailsType }
     *     
     */
    public void setDocArchIdDetails(DocArchIdDetailsType value) {
        this.docArchIdDetails = value;
    }

    /**
     * Gets the value of the documentPresentingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentPresentingDetailsType }
     *     
     */
    public DocumentPresentingDetailsType getDocumentPresentingDetails() {
        return documentPresentingDetails;
    }

    /**
     * Sets the value of the documentPresentingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentPresentingDetailsType }
     *     
     */
    public void setDocumentPresentingDetails(DocumentPresentingDetailsType value) {
        this.documentPresentingDetails = value;
    }

}
