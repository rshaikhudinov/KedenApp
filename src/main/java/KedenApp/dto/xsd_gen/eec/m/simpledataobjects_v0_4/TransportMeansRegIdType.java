
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Строка символов, идентифицирующая транспортное средство
 * 
 * <p>Java class for TransportMeansRegIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportMeansRegIdType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:SimpleDataObjects:v0.4.14&gt;Id40Type"&gt;
 *       &lt;attribute name="countryCode" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnqualifiedCountryCodeType" /&gt;
 *       &lt;attribute name="countryCodeListId" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataIdType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeansRegIdType", propOrder = {
    "value"
})
public class TransportMeansRegIdType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "countryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String countryCode;
    @XmlAttribute(name = "countryCodeListId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String countryCodeListId;

    /**
     * Строка символов, идентифицирующая объект, содержащая не более 40 символов
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the countryCodeListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCodeListId() {
        return countryCodeListId;
    }

    /**
     * Sets the value of the countryCodeListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCodeListId(String value) {
        this.countryCodeListId = value;
    }

}
