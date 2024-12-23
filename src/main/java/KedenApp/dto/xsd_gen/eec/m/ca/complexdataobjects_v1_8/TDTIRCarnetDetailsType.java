
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие информацию о книжке международных дорожных перевозок при ее использовании в качестве транзитной декларации
 * 
 * <p>Java class for TDTIRCarnetDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDTIRCarnetDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIRCarnetIdDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsDocumentId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RegTIRDate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDTIRCarnetDetailsType", propOrder = {
    "customsDocumentId",
    "regTIRDate"
})
public class TDTIRCarnetDetailsType
    extends TIRCarnetIdDetailsType
{

    @XmlElement(name = "CustomsDocumentId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsDocumentId;
    @XmlElement(name = "RegTIRDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar regTIRDate;

    /**
     * Регистрационный номер книжки МДП в таможенном органе
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsDocumentId() {
        return customsDocumentId;
    }

    /**
     * Sets the value of the customsDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsDocumentId(String value) {
        this.customsDocumentId = value;
    }

    /**
     * Gets the value of the regTIRDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegTIRDate() {
        return regTIRDate;
    }

    /**
     * Sets the value of the regTIRDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegTIRDate(XMLGregorianCalendar value) {
        this.regTIRDate = value;
    }

}
