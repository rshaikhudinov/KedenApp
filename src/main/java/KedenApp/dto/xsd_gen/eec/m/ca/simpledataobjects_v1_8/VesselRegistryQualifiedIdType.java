
package KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Строка символов, представляющая уникальный регистрационный номер, присвоенный водному судну при включении в реестр
 * 
 * <p>Java class for VesselRegistryQualifiedIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VesselRegistryQualifiedIdType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:BaseDataTypes:v0.4.14&gt;IdentifierType"&gt;
 *       &lt;attribute name="registryListId" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataIdType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VesselRegistryQualifiedIdType", propOrder = {
    "value"
})
@XmlSeeAlso({
    VesselRegistryIdType.class
})
public class VesselRegistryQualifiedIdType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "registryListId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String registryListId;

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
     * Gets the value of the registryListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryListId() {
        return registryListId;
    }

    /**
     * Sets the value of the registryListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryListId(String value) {
        this.registryListId = value;
    }

}
