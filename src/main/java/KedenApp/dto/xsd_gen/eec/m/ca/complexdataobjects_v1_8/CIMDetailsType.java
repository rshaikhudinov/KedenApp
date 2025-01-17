
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
 * Компоненты, представляющие сведения о контрольных (идентификационных) знаках
 * 
 * <p>Java class for CIMDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIMDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CIMMarkingCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CIMQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CIMListDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CIMRangeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIMDetailsType", propOrder = {
    "cimMarkingCode",
    "cimQuantity",
    "cimListDetails",
    "cimRangeDetails"
})
public class CIMDetailsType {

    @XmlElement(name = "CIMMarkingCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cimMarkingCode;
    @XmlElement(name = "CIMQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cimQuantity;
    @XmlElement(name = "CIMListDetails")
    protected CIMListDetailsType cimListDetails;
    @XmlElement(name = "CIMRangeDetails")
    protected List<CIMRangeDetailsType> cimRangeDetails;

    /**
     * Gets the value of the cimMarkingCode property.
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
     * Количество контрольных (идентификационных) знаков
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
     * Gets the value of the cimListDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CIMListDetailsType }
     *     
     */
    public CIMListDetailsType getCIMListDetails() {
        return cimListDetails;
    }

    /**
     * Sets the value of the cimListDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CIMListDetailsType }
     *     
     */
    public void setCIMListDetails(CIMListDetailsType value) {
        this.cimListDetails = value;
    }

    /**
     * Gets the value of the cimRangeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cimRangeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCIMRangeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CIMRangeDetailsType }
     * 
     * 
     */
    public List<CIMRangeDetailsType> getCIMRangeDetails() {
        if (cimRangeDetails == null) {
            cimRangeDetails = new ArrayList<CIMRangeDetailsType>();
        }
        return this.cimRangeDetails;
    }

}
