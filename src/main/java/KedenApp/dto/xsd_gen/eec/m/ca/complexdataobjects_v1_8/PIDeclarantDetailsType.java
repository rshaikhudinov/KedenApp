
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о лице, представившем предварительную информацию
 * 
 * <p>Java class for PIDeclarantDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIDeclarantDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CASubjectDetailsV2Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterDocumentIdDetails" minOccurs="0"/&gt;
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
@XmlType(name = "PIDeclarantDetailsType", propOrder = {
    "registerDocumentIdDetails",
    "equalIndicator"
})
public class PIDeclarantDetailsType
    extends CASubjectDetailsV2Type
{

    @XmlElement(name = "RegisterDocumentIdDetails")
    protected RegisterDocumentIdDetailsType registerDocumentIdDetails;
    @XmlElement(name = "EqualIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean equalIndicator;

    /**
     * Свидетельство о включении лица в реестр таможенных представителей
     * 
     * @return
     *     possible object is
     *     {@link RegisterDocumentIdDetailsType }
     *     
     */
    public RegisterDocumentIdDetailsType getRegisterDocumentIdDetails() {
        return registerDocumentIdDetails;
    }

    /**
     * Sets the value of the registerDocumentIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterDocumentIdDetailsType }
     *     
     */
    public void setRegisterDocumentIdDetails(RegisterDocumentIdDetailsType value) {
        this.registerDocumentIdDetails = value;
    }

    /**
     * признак совпадения лица, представившего предварительную информацию, с перевозчиком, осуществляющим ввоз товаров на таможенную территорию Евразийского экономического союза
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
