
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
 * компоненты, представляющие сведения о времени работы организации (подразделении)
 * 
 * <p>Java class for WorkTimeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkTimeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}WeekDayCode" maxOccurs="7" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}WorkTimeHourDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WorkTimeHourDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkTimeDetailsType", propOrder = {
    "weekDayCode",
    "workTimeHourDetails",
    "workTimeHourDescriptionText"
})
public class WorkTimeDetailsType {

    @XmlElement(name = "WeekDayCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> weekDayCode;
    @XmlElement(name = "WorkTimeHourDetails", required = true)
    protected WorkTimeHourDetailsType workTimeHourDetails;
    @XmlElement(name = "WorkTimeHourDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> workTimeHourDescriptionText;

    /**
     * Gets the value of the weekDayCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the weekDayCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeekDayCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWeekDayCode() {
        if (weekDayCode == null) {
            weekDayCode = new ArrayList<String>();
        }
        return this.weekDayCode;
    }

    /**
     * Gets the value of the workTimeHourDetails property.
     * 
     * @return
     *     possible object is
     *     {@link WorkTimeHourDetailsType }
     *     
     */
    public WorkTimeHourDetailsType getWorkTimeHourDetails() {
        return workTimeHourDetails;
    }

    /**
     * Sets the value of the workTimeHourDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkTimeHourDetailsType }
     *     
     */
    public void setWorkTimeHourDetails(WorkTimeHourDetailsType value) {
        this.workTimeHourDetails = value;
    }

    /**
     * Gets the value of the workTimeHourDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the workTimeHourDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkTimeHourDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWorkTimeHourDescriptionText() {
        if (workTimeHourDescriptionText == null) {
            workTimeHourDescriptionText = new ArrayList<String>();
        }
        return this.workTimeHourDescriptionText;
    }

}
