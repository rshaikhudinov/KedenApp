
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Строка символов, сформированная по правилам идентификации счета, открываемого банком юридическому или физическому лицу
 * 
 * <p>Java class for BankAccountIdV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankAccountIdV2Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:SimpleDataObjects:v0.4.14&gt;BankAccountIdType"&gt;
 *       &lt;attribute name="kindCode" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}BankAccountKindCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankAccountIdV2Type", propOrder = {
    "value"
})
public class BankAccountIdV2Type {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "kindCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String kindCode;

    /**
     * Строка символов, сформированная по правилам идентификации счета, открываемого банком юридическому или физическому лицу
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
