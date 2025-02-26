
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о таможенном платеже
 * 
 * <p>Java class for CPCGoodsItemPaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CPCGoodsItemPaymentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPaymentBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReferenceLineId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPCGoodsItemPaymentDetailsType", propOrder = {
    "referenceLineId"
})
public class CPCGoodsItemPaymentDetailsType
    extends CustomsPaymentBaseDetailsType
{

    @XmlElement(name = "ReferenceLineId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceLineId;

    /**
     * идентификатор записи (номер строки) о предшествующем документе в котором указаны сведения о предшествующей декларации на товары
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceLineId() {
        return referenceLineId;
    }

    /**
     * Sets the value of the referenceLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceLineId(String value) {
        this.referenceLineId = value;
    }

}
