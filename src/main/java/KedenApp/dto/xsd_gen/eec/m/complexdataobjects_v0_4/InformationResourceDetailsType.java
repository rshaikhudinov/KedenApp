
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированные сведения об информационном ресурсе
 * 
 * <p>Java class for InformationResourceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InformationResourceDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}InformationResourceId"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}InformationResourceName"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedAuthorityDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EDocCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EDocVersionId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ResourceId"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}InformationResourceUserDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ValidityPeriodDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UpdateDateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InformationResourceDetailsType", propOrder = {
    "informationResourceId",
    "informationResourceName",
    "unifiedAuthorityDetails",
    "descriptionText",
    "docKindCode",
    "eDocCode",
    "eDocVersionId",
    "resourceId",
    "informationResourceUserDetails",
    "validityPeriodDetails",
    "updateDateTime"
})
public class InformationResourceDetailsType {

    @XmlElement(name = "InformationResourceId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String informationResourceId;
    @XmlElement(name = "InformationResourceName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String informationResourceName;
    @XmlElement(name = "UnifiedAuthorityDetails", required = true)
    protected UnifiedAuthorityDetailsType unifiedAuthorityDetails;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected String descriptionText;
    @XmlElement(name = "DocKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCode20Type docKindCode;
    @XmlElement(name = "EDocCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eDocCode;
    @XmlElement(name = "EDocVersionId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> eDocVersionId;
    @XmlElement(name = "ResourceId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String resourceId;
    @XmlElement(name = "InformationResourceUserDetails")
    protected List<UnifiedAuthorityDetailsType> informationResourceUserDetails;
    @XmlElement(name = "ValidityPeriodDetails", required = true)
    protected PeriodDetailsType validityPeriodDetails;
    @XmlElement(name = "UpdateDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDateTime;

    /**
     * Gets the value of the informationResourceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationResourceId() {
        return informationResourceId;
    }

    /**
     * Sets the value of the informationResourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationResourceId(String value) {
        this.informationResourceId = value;
    }

    /**
     * Gets the value of the informationResourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationResourceName() {
        return informationResourceName;
    }

    /**
     * Sets the value of the informationResourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationResourceName(String value) {
        this.informationResourceName = value;
    }

    /**
     * Сведения об органе государственной власти государства-члена, уполномоченном на ведение информационного ресурса
     * 
     * @return
     *     possible object is
     *     {@link UnifiedAuthorityDetailsType }
     *     
     */
    public UnifiedAuthorityDetailsType getUnifiedAuthorityDetails() {
        return unifiedAuthorityDetails;
    }

    /**
     * Sets the value of the unifiedAuthorityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedAuthorityDetailsType }
     *     
     */
    public void setUnifiedAuthorityDetails(UnifiedAuthorityDetailsType value) {
        this.unifiedAuthorityDetails = value;
    }

    /**
     * Описание содержания информационного ресурса
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

    /**
     * Кодовое обозначение вида документа, сведения о котором содержатся в информационном ресурсе
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getDocKindCode() {
        return docKindCode;
    }

    /**
     * Sets the value of the docKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setDocKindCode(UnifiedCode20Type value) {
        this.docKindCode = value;
    }

    /**
     * Кодовое обозначение структуры электронного документа (сведений) в соответствии с реестром структур электронных документов и сведений
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocCode() {
        return eDocCode;
    }

    /**
     * Sets the value of the eDocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocCode(String value) {
        this.eDocCode = value;
    }

    /**
     * Gets the value of the eDocVersionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the eDocVersionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEDocVersionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEDocVersionId() {
        if (eDocVersionId == null) {
            eDocVersionId = new ArrayList<String>();
        }
        return this.eDocVersionId;
    }

    /**
     * Адрес информационного ресурса в сети Интернет
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Sets the value of the resourceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceId(String value) {
        this.resourceId = value;
    }

    /**
     * Gets the value of the informationResourceUserDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the informationResourceUserDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformationResourceUserDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnifiedAuthorityDetailsType }
     * 
     * 
     */
    public List<UnifiedAuthorityDetailsType> getInformationResourceUserDetails() {
        if (informationResourceUserDetails == null) {
            informationResourceUserDetails = new ArrayList<UnifiedAuthorityDetailsType>();
        }
        return this.informationResourceUserDetails;
    }

    /**
     * Период действия сведений об информационном ресурсе
     * 
     * @return
     *     possible object is
     *     {@link PeriodDetailsType }
     *     
     */
    public PeriodDetailsType getValidityPeriodDetails() {
        return validityPeriodDetails;
    }

    /**
     * Sets the value of the validityPeriodDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDetailsType }
     *     
     */
    public void setValidityPeriodDetails(PeriodDetailsType value) {
        this.validityPeriodDetails = value;
    }

    /**
     * Дата и время актуализации сведений об информационном ресурсе
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Sets the value of the updateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDateTime(XMLGregorianCalendar value) {
        this.updateDateTime = value;
    }

}
