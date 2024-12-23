
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Строка символов, идентифицирующая хозяйствующего субъекта
 * 
 * <p>Java class for BusinessEntityIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessEntityIdType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:SimpleDataObjects:v0.4.14&gt;Id20Type"&gt;
 *       &lt;attribute name="kindId" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}BusinessEntityIdKindIdType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessEntityIdType", propOrder = {
    "value"
})
public class BusinessEntityIdType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "kindId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String kindId;

    /**
     * Строка символов, идентифицирующая объект, содержащая не более 20 символов
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
     * Gets the value of the kindId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindId() {
        return kindId;
    }

    /**
     * Sets the value of the kindId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKindId(String value) {
        this.kindId = value;
    }

}
