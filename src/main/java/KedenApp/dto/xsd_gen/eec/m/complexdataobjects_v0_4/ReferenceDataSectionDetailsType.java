
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

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
 * Компоненты, представляющие детализированную информацию о группе объектов классификации
 * 
 * <p>Java class for ReferenceDataSectionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceDataSectionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataSectionCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataSectionName"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ParentReferenceDataSectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}StatusDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CountryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceDataSectionDetailsType", propOrder = {
    "referenceDataSectionCode",
    "referenceDataSectionName",
    "parentReferenceDataSectionCode",
    "statusDetails",
    "countryCode"
})
public class ReferenceDataSectionDetailsType {

    @XmlElement(name = "ReferenceDataSectionCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceDataSectionCode;
    @XmlElement(name = "ReferenceDataSectionName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceDataSectionName;
    @XmlElement(name = "ParentReferenceDataSectionCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String parentReferenceDataSectionCode;
    @XmlElement(name = "StatusDetails")
    protected List<StatusDetailsType> statusDetails;
    @XmlElement(name = "CountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> countryCode;

    /**
     * Gets the value of the referenceDataSectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDataSectionCode() {
        return referenceDataSectionCode;
    }

    /**
     * Sets the value of the referenceDataSectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDataSectionCode(String value) {
        this.referenceDataSectionCode = value;
    }

    /**
     * Gets the value of the referenceDataSectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceDataSectionName() {
        return referenceDataSectionName;
    }

    /**
     * Sets the value of the referenceDataSectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceDataSectionName(String value) {
        this.referenceDataSectionName = value;
    }

    /**
     * Gets the value of the parentReferenceDataSectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentReferenceDataSectionCode() {
        return parentReferenceDataSectionCode;
    }

    /**
     * Sets the value of the parentReferenceDataSectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentReferenceDataSectionCode(String value) {
        this.parentReferenceDataSectionCode = value;
    }

    /**
     * Статус сведений о группе объектов классификации Gets the value of the statusDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the statusDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusDetailsType }
     * 
     * 
     */
    public List<StatusDetailsType> getStatusDetails() {
        if (statusDetails == null) {
            statusDetails = new ArrayList<StatusDetailsType>();
        }
        return this.statusDetails;
    }

    /**
     * Кодовое обозначение страны, в которой используется группа объектов классификации Gets the value of the countryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the countryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCountryCode() {
        if (countryCode == null) {
            countryCode = new ArrayList<String>();
        }
        return this.countryCode;
    }

}
