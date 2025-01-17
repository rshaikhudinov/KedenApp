
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocReferenceDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие номер зоны таможенного контроля либо номер и дата документа, утверждающего ее создание
 * 
 * <p>Java class for CustomsControlZoneIdDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsControlZoneIdDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsControlZoneId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocReferenceDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsControlZoneIdDetailsType", propOrder = {
    "customsControlZoneId",
    "docReferenceDetails"
})
public class CustomsControlZoneIdDetailsType {

    @XmlElement(name = "CustomsControlZoneId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsControlZoneId;
    @XmlElement(name = "DocReferenceDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected DocReferenceDetailsType docReferenceDetails;

    /**
     * Идентификатор (номер, регистрационный номер) зоны таможенного контроля
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsControlZoneId() {
        return customsControlZoneId;
    }

    /**
     * Sets the value of the customsControlZoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsControlZoneId(String value) {
        this.customsControlZoneId = value;
    }

    /**
     * номер и дата документа, утверждающего создание зоны таможенного контроля
     * 
     * @return
     *     possible object is
     *     {@link DocReferenceDetailsType }
     *     
     */
    public DocReferenceDetailsType getDocReferenceDetails() {
        return docReferenceDetails;
    }

    /**
     * Sets the value of the docReferenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocReferenceDetailsType }
     *     
     */
    public void setDocReferenceDetails(DocReferenceDetailsType value) {
        this.docReferenceDetails = value;
    }

}
