
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.ClassifiedReferenceDataItemCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.ClassifiedReferenceDataItemNameType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.ClassifiedReferenceDataItemTextType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию об объекте систематизации (классификации)
 * 
 * <p>Java class for ReferenceDataItemDetailsV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceDataItemDetailsV2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataItemCode" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataItemName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataItemText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ParentReferenceDataItemCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ParentReferenceDataSectionCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}CodeListItemV2Details"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceDataItemDetailsV2Type", propOrder = {
    "referenceDataItemCode",
    "referenceDataItemName",
    "referenceDataItemText",
    "parentReferenceDataItemCode",
    "parentReferenceDataSectionCode",
    "codeListItemV2Details",
    "unifiedCountryCode"
})
public class ReferenceDataItemDetailsV2Type {

    @XmlElement(name = "ReferenceDataItemCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected List<ClassifiedReferenceDataItemCodeType> referenceDataItemCode;
    @XmlElement(name = "ReferenceDataItemName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<ClassifiedReferenceDataItemNameType> referenceDataItemName;
    @XmlElement(name = "ReferenceDataItemText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<ClassifiedReferenceDataItemTextType> referenceDataItemText;
    @XmlElement(name = "ParentReferenceDataItemCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected ClassifiedReferenceDataItemCodeType parentReferenceDataItemCode;
    @XmlElement(name = "ParentReferenceDataSectionCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String parentReferenceDataSectionCode;
    @XmlElement(name = "CodeListItemV2Details", required = true)
    protected CodeListItemDetailsV2Type codeListItemV2Details;
    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<UnifiedCountryCodeType> unifiedCountryCode;

    /**
     * Gets the value of the referenceDataItemCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the referenceDataItemCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceDataItemCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassifiedReferenceDataItemCodeType }
     * 
     * 
     */
    public List<ClassifiedReferenceDataItemCodeType> getReferenceDataItemCode() {
        if (referenceDataItemCode == null) {
            referenceDataItemCode = new ArrayList<ClassifiedReferenceDataItemCodeType>();
        }
        return this.referenceDataItemCode;
    }

    /**
     * Gets the value of the referenceDataItemName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the referenceDataItemName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceDataItemName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassifiedReferenceDataItemNameType }
     * 
     * 
     */
    public List<ClassifiedReferenceDataItemNameType> getReferenceDataItemName() {
        if (referenceDataItemName == null) {
            referenceDataItemName = new ArrayList<ClassifiedReferenceDataItemNameType>();
        }
        return this.referenceDataItemName;
    }

    /**
     * Gets the value of the referenceDataItemText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the referenceDataItemText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceDataItemText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassifiedReferenceDataItemTextType }
     * 
     * 
     */
    public List<ClassifiedReferenceDataItemTextType> getReferenceDataItemText() {
        if (referenceDataItemText == null) {
            referenceDataItemText = new ArrayList<ClassifiedReferenceDataItemTextType>();
        }
        return this.referenceDataItemText;
    }

    /**
     * Gets the value of the parentReferenceDataItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedReferenceDataItemCodeType }
     *     
     */
    public ClassifiedReferenceDataItemCodeType getParentReferenceDataItemCode() {
        return parentReferenceDataItemCode;
    }

    /**
     * Sets the value of the parentReferenceDataItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedReferenceDataItemCodeType }
     *     
     */
    public void setParentReferenceDataItemCode(ClassifiedReferenceDataItemCodeType value) {
        this.parentReferenceDataItemCode = value;
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
     * Gets the value of the codeListItemV2Details property.
     * 
     * @return
     *     possible object is
     *     {@link CodeListItemDetailsV2Type }
     *     
     */
    public CodeListItemDetailsV2Type getCodeListItemV2Details() {
        return codeListItemV2Details;
    }

    /**
     * Sets the value of the codeListItemV2Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListItemDetailsV2Type }
     *     
     */
    public void setCodeListItemV2Details(CodeListItemDetailsV2Type value) {
        this.codeListItemV2Details = value;
    }

    /**
     * Кодовое обозначение страны, в которой используется объект систематизации (классификации) Gets the value of the unifiedCountryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the unifiedCountryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnifiedCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnifiedCountryCodeType }
     * 
     * 
     */
    public List<UnifiedCountryCodeType> getUnifiedCountryCode() {
        if (unifiedCountryCode == null) {
            unifiedCountryCode = new ArrayList<UnifiedCountryCodeType>();
        }
        return this.unifiedCountryCode;
    }

}
