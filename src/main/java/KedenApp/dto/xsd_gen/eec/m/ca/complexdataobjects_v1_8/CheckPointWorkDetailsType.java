
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

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
 * компоненты, представляющие сведения о режиме работы пункта пропуска
 * 
 * <p>Java class for CheckPointWorkDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPointWorkDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}WorkScheduleDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WorkTimeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WorkTimeDescriptionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPointWorkDetailsType", propOrder = {
    "workScheduleDetails",
    "workTimeCode",
    "workTimeDescriptionText"
})
public class CheckPointWorkDetailsType {

    @XmlElement(name = "WorkScheduleDetails")
    protected List<WorkScheduleDetailsType> workScheduleDetails;
    @XmlElement(name = "WorkTimeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String workTimeCode;
    @XmlElement(name = "WorkTimeDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String workTimeDescriptionText;

    /**
     * Gets the value of the workScheduleDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the workScheduleDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkScheduleDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkScheduleDetailsType }
     * 
     * 
     */
    public List<WorkScheduleDetailsType> getWorkScheduleDetails() {
        if (workScheduleDetails == null) {
            workScheduleDetails = new ArrayList<WorkScheduleDetailsType>();
        }
        return this.workScheduleDetails;
    }

    /**
     * Gets the value of the workTimeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkTimeCode() {
        return workTimeCode;
    }

    /**
     * Sets the value of the workTimeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkTimeCode(String value) {
        this.workTimeCode = value;
    }

    /**
     * Gets the value of the workTimeDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkTimeDescriptionText() {
        return workTimeDescriptionText;
    }

    /**
     * Sets the value of the workTimeDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkTimeDescriptionText(String value) {
        this.workTimeDescriptionText = value;
    }

}
