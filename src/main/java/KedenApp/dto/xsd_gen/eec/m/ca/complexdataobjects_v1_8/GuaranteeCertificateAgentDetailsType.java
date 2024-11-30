
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о лице, предоставившем сертификат обеспечения исполнения обязанности по уплате таможенных пошлин, налогов
 * 
 * <p>Java class for GuaranteeCertificateAgentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuaranteeCertificateAgentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CASubjectDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EqualIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeCertificateAgentDetailsType", propOrder = {
    "equalIndicator"
})
public class GuaranteeCertificateAgentDetailsType
    extends CASubjectDetailsType
{

    @XmlElement(name = "EqualIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean equalIndicator;

    /**
     * Признак совпадения (не совпадения) сведений со сведениями о лице, предоставившем обеспечение исполнения обязанности по уплате таможенных и иных платежей
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEqualIndicator() {
        return equalIndicator;
    }

    /**
     * Sets the value of the equalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEqualIndicator(Boolean value) {
        this.equalIndicator = value;
    }

}
