
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о международном почтовом отрпавлении
 * 
 * <p>Java class for TDInternationalMailDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDInternationalMailDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}InternationalMailKindName"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DespatchId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDInternationalMailDetailsType", propOrder = {
    "internationalMailKindName",
    "despatchId"
})
public class TDInternationalMailDetailsType {

    @XmlElement(name = "InternationalMailKindName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internationalMailKindName;
    @XmlElement(name = "DespatchId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String despatchId;

    /**
     * Gets the value of the internationalMailKindName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalMailKindName() {
        return internationalMailKindName;
    }

    /**
     * Sets the value of the internationalMailKindName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalMailKindName(String value) {
        this.internationalMailKindName = value;
    }

    /**
     * Номер депеши, емкости
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDespatchId() {
        return despatchId;
    }

    /**
     * Sets the value of the despatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDespatchId(String value) {
        this.despatchId = value;
    }

}
