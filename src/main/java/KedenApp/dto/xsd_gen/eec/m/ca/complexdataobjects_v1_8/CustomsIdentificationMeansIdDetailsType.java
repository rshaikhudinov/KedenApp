
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, предсталяющие сведения о средстве таможенной идентификации
 * 
 * <p>Java class for CustomsIdentificationMeansIdDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsIdentificationMeansIdDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsIdentificationMeansId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ForeignCustomsIdentificationMeansIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsIdentificationMeansIdDetailsType", propOrder = {
    "customsIdentificationMeansId",
    "descriptionText",
    "foreignCustomsIdentificationMeansIndicator"
})
public class CustomsIdentificationMeansIdDetailsType {

    @XmlElement(name = "CustomsIdentificationMeansId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsIdentificationMeansId;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;
    @XmlElement(name = "ForeignCustomsIdentificationMeansIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean foreignCustomsIdentificationMeansIndicator;

    /**
     * Уникальный идентификатор (номер) средства идентификации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsIdentificationMeansId() {
        return customsIdentificationMeansId;
    }

    /**
     * Sets the value of the customsIdentificationMeansId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsIdentificationMeansId(String value) {
        this.customsIdentificationMeansId = value;
    }

    /**
     * Описание отличительных признаков
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

    /**
     * признак признания таможенным органом средства идентификации
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForeignCustomsIdentificationMeansIndicator() {
        return foreignCustomsIdentificationMeansIndicator;
    }

    /**
     * Sets the value of the foreignCustomsIdentificationMeansIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForeignCustomsIdentificationMeansIndicator(Boolean value) {
        this.foreignCustomsIdentificationMeansIndicator = value;
    }

}
