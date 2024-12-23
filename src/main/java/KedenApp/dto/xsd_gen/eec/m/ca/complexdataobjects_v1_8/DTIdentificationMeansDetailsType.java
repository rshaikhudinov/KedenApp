
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о средствах идентификации, нанесенных на товар, подлежащий маркировке средствами идентификации, и указываемые в декларации на товары
 * 
 * <p>Java class for DTIdentificationMeansDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTIdentificationMeansDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}InformationKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CIMMarkingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CIMQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}IdentificationMeansDetails" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTIdentificationMeansDetailsType", propOrder = {
    "informationKindCode",
    "cimMarkingCode",
    "cimQuantity",
    "identificationMeansDetails"
})
public class DTIdentificationMeansDetailsType {

    @XmlElement(name = "InformationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String informationKindCode;
    @XmlElement(name = "CIMMarkingCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cimMarkingCode;
    @XmlElement(name = "CIMQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cimQuantity;
    @XmlElement(name = "IdentificationMeansDetails")
    protected List<IdentificationMeansDetailsType> identificationMeansDetails;

    /**
     * Кодовое обозначение вида информации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationKindCode() {
        return informationKindCode;
    }

    /**
     * Sets the value of the informationKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationKindCode(String value) {
        this.informationKindCode = value;
    }

    /**
     * признак нанесения контрольных (идентификационных) знаков или средств идентификации после выпуска товаров
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIMMarkingCode() {
        return cimMarkingCode;
    }

    /**
     * Sets the value of the cimMarkingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIMMarkingCode(String value) {
        this.cimMarkingCode = value;
    }

    /**
     * общее количество контрольных (идентификационных) знаков или кодов идентификации
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCIMQuantity() {
        return cimQuantity;
    }

    /**
     * Sets the value of the cimQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCIMQuantity(BigInteger value) {
        this.cimQuantity = value;
    }

    /**
     * Сведения об идентификации маркированного товара Gets the value of the identificationMeansDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the identificationMeansDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificationMeansDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationMeansDetailsType }
     * 
     * 
     */
    public List<IdentificationMeansDetailsType> getIdentificationMeansDetails() {
        if (identificationMeansDetails == null) {
            identificationMeansDetails = new ArrayList<IdentificationMeansDetailsType>();
        }
        return this.identificationMeansDetails;
    }

}
