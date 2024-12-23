
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsDecisionCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Строка символов, представляющая кодовое обозначение объекта, с указанием справочника (классификатора)
 * 
 * <p>Java class for QualifiedOptionalCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualifiedOptionalCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:BaseDataTypes:v0.4.14&gt;CodeType"&gt;
 *       &lt;attribute name="codeListId" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataIdType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedOptionalCodeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    CustomsDecisionCodeType.class,
    StatusCodeType.class,
    IdentificationMeansKindCodeType.class,
    UnifiedOptionalCode20Type.class
})
public class QualifiedOptionalCodeType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "codeListId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String codeListId;

    /**
     * Точное значение, метод или описание свойства в краткой и независимой от естественного языка форме, которая является частью конечного списка допустимых значений
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
     * Gets the value of the codeListId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListId() {
        return codeListId;
    }

    /**
     * Sets the value of the codeListId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListId(String value) {
        this.codeListId = value;
    }

}
