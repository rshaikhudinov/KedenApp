
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
 * Визуальное статическое представление объекта или явления с указанием кода формата данных
 * 
 * <p>Java class for PictureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:BaseDataTypes:v0.4.14&gt;PictureType"&gt;
 *       &lt;attribute name="mediaTypeCode" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}MediaTypeCodeType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictureType", propOrder = {
    "value"
})
@XmlSeeAlso({
    Picture10MbType.class,
    Picture1536KbType.class,
    Picture1MbType.class
})
public class PictureType {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "mediaTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mediaTypeCode;

    /**
     * Визуальное статическое представление объекта или явления в двоичной нотации (октеты)
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = value;
    }

    /**
     * Gets the value of the mediaTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTypeCode() {
        return mediaTypeCode;
    }

    /**
     * Sets the value of the mediaTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTypeCode(String value) {
        this.mediaTypeCode = value;
    }

}
