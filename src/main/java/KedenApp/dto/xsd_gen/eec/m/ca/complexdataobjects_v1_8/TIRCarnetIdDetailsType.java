
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие информацию о книжке международной дорожной перевозки
 * 
 * <p>Java class for TIRCarnetIdDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIRCarnetIdDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIRBaseIdDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TIRPageOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TIRHolderId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIRCarnetIdDetailsType", propOrder = {
    "tirPageOrdinal",
    "tirHolderId"
})
@XmlSeeAlso({
    TDTIRCarnetDetailsType.class
})
public class TIRCarnetIdDetailsType
    extends TIRBaseIdDetailsType
{

    @XmlElement(name = "TIRPageOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tirPageOrdinal;
    @XmlElement(name = "TIRHolderId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tirHolderId;

    /**
     * Gets the value of the tirPageOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTIRPageOrdinal() {
        return tirPageOrdinal;
    }

    /**
     * Sets the value of the tirPageOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTIRPageOrdinal(BigInteger value) {
        this.tirPageOrdinal = value;
    }

    /**
     * Gets the value of the tirHolderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIRHolderId() {
        return tirHolderId;
    }

    /**
     * Sets the value of the tirHolderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIRHolderId(String value) {
        this.tirHolderId = value;
    }

}
