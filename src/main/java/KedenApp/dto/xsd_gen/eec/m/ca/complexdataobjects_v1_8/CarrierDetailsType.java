
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие реквизиты перевозчика товаров
 * 
 * <p>Java class for CarrierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CASubjectDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterDocumentIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CarrierRepresentativeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CarrierOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReferenceCarrierOrdinal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierDetailsType", propOrder = {
    "registerDocumentIdDetails",
    "carrierRepresentativeDetails",
    "carrierOrdinal",
    "referenceCarrierOrdinal"
})
public class CarrierDetailsType
    extends CASubjectDetailsType
{

    @XmlElement(name = "RegisterDocumentIdDetails")
    protected RegisterDocumentIdDetailsType registerDocumentIdDetails;
    @XmlElement(name = "CarrierRepresentativeDetails")
    protected List<CarrierRepresentativeDetailsType> carrierRepresentativeDetails;
    @XmlElement(name = "CarrierOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger carrierOrdinal;
    @XmlElement(name = "ReferenceCarrierOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger referenceCarrierOrdinal;

    /**
     * свидетельство о включении в реестр таможенных перевозчиков
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
     * Gets the value of the carrierRepresentativeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the carrierRepresentativeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierRepresentativeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierRepresentativeDetailsType }
     * 
     * 
     */
    public List<CarrierRepresentativeDetailsType> getCarrierRepresentativeDetails() {
        if (carrierRepresentativeDetails == null) {
            carrierRepresentativeDetails = new ArrayList<CarrierRepresentativeDetailsType>();
        }
        return this.carrierRepresentativeDetails;
    }

    /**
     * Порядковый номер перевозчика
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarrierOrdinal() {
        return carrierOrdinal;
    }

    /**
     * Sets the value of the carrierOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarrierOrdinal(BigInteger value) {
        this.carrierOrdinal = value;
    }

    /**
     * Gets the value of the referenceCarrierOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferenceCarrierOrdinal() {
        return referenceCarrierOrdinal;
    }

    /**
     * Sets the value of the referenceCarrierOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferenceCarrierOrdinal(BigInteger value) {
        this.referenceCarrierOrdinal = value;
    }

}
