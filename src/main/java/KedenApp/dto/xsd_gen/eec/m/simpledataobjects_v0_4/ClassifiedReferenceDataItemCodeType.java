
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Строка символов, представляющая краткое условное обозначение объекта систематизации (классификации) с указанием вида кодового обозначения объекта
 * 
 * <p>Java class for ClassifiedReferenceDataItemCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClassifiedReferenceDataItemCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:SimpleDataObjects:v0.4.14&gt;ReferenceDataItemCodeType"&gt;
 *       &lt;attribute name="kindCode" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataKindCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClassifiedReferenceDataItemCodeType", propOrder = {
    "value"
})
public class ClassifiedReferenceDataItemCodeType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "kindCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String kindCode;

    /**
     * Кодовое обозначение группы объектов систематизации (классификации), представленной, например, разделом классификатора
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
     * Gets the value of the kindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindCode() {
        return kindCode;
    }

    /**
     * Sets the value of the kindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKindCode(String value) {
        this.kindCode = value;
    }

}
