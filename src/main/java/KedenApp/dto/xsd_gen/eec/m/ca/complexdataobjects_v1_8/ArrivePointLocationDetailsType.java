
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.ResourceItemStatusDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о местах совершения таможенных операций в месте прибытия (убытия) товаров
 * 
 * <p>Java class for ArrivePointLocationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrivePointLocationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsOperationText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ArrivePointSequenceCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PointLocationAddressDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ArrivePointLocationWorkDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ResourceItemStatusDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ActivityStartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ActivityEndDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivePointLocationDetailsType", propOrder = {
    "customsOperationText",
    "arrivePointSequenceCode",
    "pointLocationAddressDetails",
    "arrivePointLocationWorkDetails",
    "resourceItemStatusDetails",
    "activityStartDate",
    "activityEndDate"
})
public class ArrivePointLocationDetailsType {

    @XmlElement(name = "CustomsOperationText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> customsOperationText;
    @XmlElement(name = "ArrivePointSequenceCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String arrivePointSequenceCode;
    @XmlElement(name = "PointLocationAddressDetails", required = true)
    protected PointAddressDetailsType pointLocationAddressDetails;
    @XmlElement(name = "ArrivePointLocationWorkDetails", required = true)
    protected ArrivePointLocationWorkDetailsType arrivePointLocationWorkDetails;
    @XmlElement(name = "ResourceItemStatusDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected ResourceItemStatusDetailsType resourceItemStatusDetails;
    @XmlElement(name = "ActivityStartDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityStartDate;
    @XmlElement(name = "ActivityEndDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar activityEndDate;

    /**
     * Gets the value of the customsOperationText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customsOperationText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsOperationText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomsOperationText() {
        if (customsOperationText == null) {
            customsOperationText = new ArrayList<String>();
        }
        return this.customsOperationText;
    }

    /**
     * Gets the value of the arrivePointSequenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivePointSequenceCode() {
        return arrivePointSequenceCode;
    }

    /**
     * Sets the value of the arrivePointSequenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivePointSequenceCode(String value) {
        this.arrivePointSequenceCode = value;
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
     * Gets the value of the arrivePointLocationWorkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivePointLocationWorkDetailsType }
     *     
     */
    public ArrivePointLocationWorkDetailsType getArrivePointLocationWorkDetails() {
        return arrivePointLocationWorkDetails;
    }

    /**
     * Sets the value of the arrivePointLocationWorkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivePointLocationWorkDetailsType }
     *     
     */
    public void setArrivePointLocationWorkDetails(ArrivePointLocationWorkDetailsType value) {
        this.arrivePointLocationWorkDetails = value;
    }

    /**
     * Gets the value of the resourceItemStatusDetails property.
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

}
