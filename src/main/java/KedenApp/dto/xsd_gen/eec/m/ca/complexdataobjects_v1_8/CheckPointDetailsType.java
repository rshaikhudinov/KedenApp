
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.ResourceItemStatusDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о пункте пропуска
 * 
 * <p>Java class for CheckPointDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPointDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProvidedInformationCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}BorderCheckPointCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}BorderCheckPointName"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}NeighboringCheckPointDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CheckPointTrafficKindCode" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CheckPointCharacterCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CheckPointStatusCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CheckPointFunctionCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PointLocationAddressDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CheckPointWorkDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CheckPointSpecialControlDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ActivityStartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ActivityEndDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ResourceItemStatusDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPointDetailsType", propOrder = {
    "providedInformationCountryCode",
    "borderCheckPointCode",
    "borderCheckPointName",
    "neighboringCheckPointDetails",
    "checkPointTrafficKindCode",
    "checkPointCharacterCode",
    "checkPointStatusCode",
    "checkPointFunctionCode",
    "pointLocationAddressDetails",
    "checkPointWorkDetails",
    "checkPointSpecialControlDetails",
    "activityStartDate",
    "activityEndDate",
    "resourceItemStatusDetails"
})
@XmlSeeAlso({
    CheckPointPassportDetailsType.class
})
public class CheckPointDetailsType {

    @XmlElement(name = "ProvidedInformationCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String providedInformationCountryCode;
    @XmlElement(name = "BorderCheckPointCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String borderCheckPointCode;
    @XmlElement(name = "BorderCheckPointName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String borderCheckPointName;
    @XmlElement(name = "NeighboringCheckPointDetails")
    protected NeighboringCheckPointDetailsType neighboringCheckPointDetails;
    @XmlElement(name = "CheckPointTrafficKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> checkPointTrafficKindCode;
    @XmlElement(name = "CheckPointCharacterCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String checkPointCharacterCode;
    @XmlElement(name = "CheckPointStatusCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String checkPointStatusCode;
    @XmlElement(name = "CheckPointFunctionCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String checkPointFunctionCode;
    @XmlElement(name = "PointLocationAddressDetails", required = true)
    protected PointAddressDetailsType pointLocationAddressDetails;
    @XmlElement(name = "CheckPointWorkDetails", required = true)
    protected CheckPointWorkDetailsType checkPointWorkDetails;
    @XmlElement(name = "CheckPointSpecialControlDetails")
    protected List<CheckPointSpecialControlDetailsType> checkPointSpecialControlDetails;
    @XmlElement(name = "ActivityStartDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityStartDate;
    @XmlElement(name = "ActivityEndDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityEndDate;
    @XmlElement(name = "ResourceItemStatusDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected ResourceItemStatusDetailsType resourceItemStatusDetails;

    /**
     * Gets the value of the providedInformationCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvidedInformationCountryCode() {
        return providedInformationCountryCode;
    }

    /**
     * Sets the value of the providedInformationCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvidedInformationCountryCode(String value) {
        this.providedInformationCountryCode = value;
    }

    /**
     * Gets the value of the borderCheckPointCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderCheckPointCode() {
        return borderCheckPointCode;
    }

    /**
     * Sets the value of the borderCheckPointCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderCheckPointCode(String value) {
        this.borderCheckPointCode = value;
    }

    /**
     * Gets the value of the borderCheckPointName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorderCheckPointName() {
        return borderCheckPointName;
    }

    /**
     * Sets the value of the borderCheckPointName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorderCheckPointName(String value) {
        this.borderCheckPointName = value;
    }

    /**
     * Gets the value of the neighboringCheckPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link NeighboringCheckPointDetailsType }
     *     
     */
    public NeighboringCheckPointDetailsType getNeighboringCheckPointDetails() {
        return neighboringCheckPointDetails;
    }

    /**
     * Sets the value of the neighboringCheckPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeighboringCheckPointDetailsType }
     *     
     */
    public void setNeighboringCheckPointDetails(NeighboringCheckPointDetailsType value) {
        this.neighboringCheckPointDetails = value;
    }

    /**
     * Gets the value of the checkPointTrafficKindCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the checkPointTrafficKindCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckPointTrafficKindCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCheckPointTrafficKindCode() {
        if (checkPointTrafficKindCode == null) {
            checkPointTrafficKindCode = new ArrayList<String>();
        }
        return this.checkPointTrafficKindCode;
    }

    /**
     * Gets the value of the checkPointCharacterCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPointCharacterCode() {
        return checkPointCharacterCode;
    }

    /**
     * Sets the value of the checkPointCharacterCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPointCharacterCode(String value) {
        this.checkPointCharacterCode = value;
    }

    /**
     * Gets the value of the checkPointStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPointStatusCode() {
        return checkPointStatusCode;
    }

    /**
     * Sets the value of the checkPointStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPointStatusCode(String value) {
        this.checkPointStatusCode = value;
    }

    /**
     * Gets the value of the checkPointFunctionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPointFunctionCode() {
        return checkPointFunctionCode;
    }

    /**
     * Sets the value of the checkPointFunctionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPointFunctionCode(String value) {
        this.checkPointFunctionCode = value;
    }

    /**
     * Gets the value of the pointLocationAddressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PointAddressDetailsType }
     *     
     */
    public PointAddressDetailsType getPointLocationAddressDetails() {
        return pointLocationAddressDetails;
    }

    /**
     * Sets the value of the pointLocationAddressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointAddressDetailsType }
     *     
     */
    public void setPointLocationAddressDetails(PointAddressDetailsType value) {
        this.pointLocationAddressDetails = value;
    }

    /**
     * Gets the value of the checkPointWorkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CheckPointWorkDetailsType }
     *     
     */
    public CheckPointWorkDetailsType getCheckPointWorkDetails() {
        return checkPointWorkDetails;
    }

    /**
     * Sets the value of the checkPointWorkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckPointWorkDetailsType }
     *     
     */
    public void setCheckPointWorkDetails(CheckPointWorkDetailsType value) {
        this.checkPointWorkDetails = value;
    }

    /**
     * Gets the value of the checkPointSpecialControlDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the checkPointSpecialControlDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckPointSpecialControlDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckPointSpecialControlDetailsType }
     * 
     * 
     */
    public List<CheckPointSpecialControlDetailsType> getCheckPointSpecialControlDetails() {
        if (checkPointSpecialControlDetails == null) {
            checkPointSpecialControlDetails = new ArrayList<CheckPointSpecialControlDetailsType>();
        }
        return this.checkPointSpecialControlDetails;
    }

    /**
     * Gets the value of the activityStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityStartDate() {
        return activityStartDate;
    }

    /**
     * Sets the value of the activityStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityStartDate(XMLGregorianCalendar value) {
        this.activityStartDate = value;
    }

    /**
     * Gets the value of the activityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivityEndDate() {
        return activityEndDate;
    }

    /**
     * Sets the value of the activityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivityEndDate(XMLGregorianCalendar value) {
        this.activityEndDate = value;
    }

    /**
     * Состояние записи общего ресурса
     * 
     * @return
     *     possible object is
     *     {@link ResourceItemStatusDetailsType }
     *     
     */
    public ResourceItemStatusDetailsType getResourceItemStatusDetails() {
        return resourceItemStatusDetails;
    }

    /**
     * Sets the value of the resourceItemStatusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceItemStatusDetailsType }
     *     
     */
    public void setResourceItemStatusDetails(ResourceItemStatusDetailsType value) {
        this.resourceItemStatusDetails = value;
    }

}
