
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о регистрационном (справочном) номере таможенного документа
 * 
 * <p>Java class for CustomsDocumentIdWOrdinalDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsDocumentIdWOrdinalDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDocumentIdDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsDocumentOrdinalId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomsDocumentIdWOrdinalDetailsType", propOrder = {
    "customsDocumentOrdinalId"
})
public class CustomsDocumentIdWOrdinalDetailsType
    extends CustomsDocumentIdDetailsType
{

    @XmlElement(name = "CustomsDocumentOrdinalId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsDocumentOrdinalId;

    /**
     * Gets the value of the customsDocumentOrdinalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsDocumentOrdinalId() {
        return customsDocumentOrdinalId;
    }

    /**
     * Sets the value of the customsDocumentOrdinalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsDocumentOrdinalId(String value) {
        this.customsDocumentOrdinalId = value;
    }

}
