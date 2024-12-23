
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о представленном документе
 * 
 * <p>Java class for TMPAPresentedDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TMPAPresentedDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADocDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DocPresentKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EDocCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LineId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDeclarationIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DocArchIdDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TMPAPresentedDocDetailsType", propOrder = {
    "docPresentKindCode",
    "eDocCode",
    "lineId",
    "customsDeclarationIdDetails",
    "docArchIdDetails"
})
public class TMPAPresentedDocDetailsType
    extends CADocDetailsType
{

    @XmlElement(name = "DocPresentKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docPresentKindCode;
    @XmlElement(name = "EDocCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eDocCode;
    @XmlElement(name = "LineId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lineId;
    @XmlElement(name = "CustomsDeclarationIdDetails")
    protected CustomsDocumentIdDetailsType customsDeclarationIdDetails;
    @XmlElement(name = "DocArchIdDetails")
    protected DocArchIdDetailsType docArchIdDetails;

    /**
     * Gets the value of the docPresentKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocPresentKindCode() {
        return docPresentKindCode;
    }

    /**
     * Sets the value of the docPresentKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocPresentKindCode(String value) {
        this.docPresentKindCode = value;
    }

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
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Регистрационный номер таможенной декларации к которой был приложен представляемый документ
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

}
