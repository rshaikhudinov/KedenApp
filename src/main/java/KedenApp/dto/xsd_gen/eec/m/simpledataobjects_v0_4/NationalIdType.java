
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Строка символов, идентифицирующая объект, с указанием кода страны
 * 
 * <p>Java class for NationalIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NationalIdType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:BaseDataTypes:v0.4.14&gt;IdentifierType"&gt;
 *       &lt;attribute name="countryCode" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnqualifiedCountryCodeType" /&gt;
 *       &lt;attribute name="countryCodeListId" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataIdType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NationalIdType", propOrder = {
    "value"
})
@XmlSeeAlso({
    UnifiedOrganizationIdType.class,
    UnifiedTaxpayerIdType.class
})
public class NationalIdType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "countryCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String countryCode;
    @XmlAttribute(name = "countryCodeListId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String countryCodeListId;

    /**
     * Строка символов для уникальной идентификации объекта в соответствии с общей идентификационной схемой
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
