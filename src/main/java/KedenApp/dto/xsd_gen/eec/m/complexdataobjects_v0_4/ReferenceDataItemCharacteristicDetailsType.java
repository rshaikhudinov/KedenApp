
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию о характеристике объекта систематизации (классификации)
 * 
 * <p>Java class for ReferenceDataItemCharacteristicDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceDataItemCharacteristicDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataItemCharacteristicCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataItemCharacteristicName"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceDataItemCharacteristicDetailsType", propOrder = {
    "referenceDataItemCharacteristicCode",
    "referenceDataItemCharacteristicName"
})
public class ReferenceDataItemCharacteristicDetailsType {

    @XmlElement(name = "ReferenceDataItemCharacteristicCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceDataItemCharacteristicCode;
    @XmlElement(name = "ReferenceDataItemCharacteristicName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceDataItemCharacteristicName;

    /**
     * Gets the value of the referenceDataItemCharacteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDataItemCharacteristicCode() {
        return referenceDataItemCharacteristicCode;
    }

    /**
     * Sets the value of the referenceDataItemCharacteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDataItemCharacteristicCode(String value) {
        this.referenceDataItemCharacteristicCode = value;
    }

    /**
     * Gets the value of the referenceDataItemCharacteristicName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDataItemCharacteristicName() {
        return referenceDataItemCharacteristicName;
    }

    /**
     * Sets the value of the referenceDataItemCharacteristicName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDataItemCharacteristicName(String value) {
        this.referenceDataItemCharacteristicName = value;
    }

}
