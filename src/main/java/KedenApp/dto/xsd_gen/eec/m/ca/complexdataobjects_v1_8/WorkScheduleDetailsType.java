
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.PeriodDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о графике работы организации (подразделения)
 * 
 * <p>Java class for WorkScheduleDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkScheduleDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WorkSheduleKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WorkSheduleDescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}PeriodDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}WorkTimeDetails" maxOccurs="7" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkScheduleDetailsType", propOrder = {
    "workSheduleKindCode",
    "workSheduleDescriptionText",
    "periodDetails",
    "workTimeDetails"
})
public class WorkScheduleDetailsType {

    @XmlElement(name = "WorkSheduleKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String workSheduleKindCode;
    @XmlElement(name = "WorkSheduleDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String workSheduleDescriptionText;
    @XmlElement(name = "PeriodDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected PeriodDetailsType periodDetails;
    @XmlElement(name = "WorkTimeDetails")
    protected List<WorkTimeDetailsType> workTimeDetails;

    /**
     * Gets the value of the workSheduleKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkSheduleKindCode() {
        return workSheduleKindCode;
    }

    /**
     * Sets the value of the workSheduleKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkSheduleKindCode(String value) {
        this.workSheduleKindCode = value;
    }

    /**
     * Gets the value of the workSheduleDescriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkSheduleDescriptionText() {
        return workSheduleDescriptionText;
    }

    /**
     * Sets the value of the workSheduleDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkSheduleDescriptionText(String value) {
        this.workSheduleDescriptionText = value;
    }

    /**
     * Gets the value of the periodDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodDetailsType }
     *     
     */
    public PeriodDetailsType getPeriodDetails() {
        return periodDetails;
    }

    /**
     * Sets the value of the periodDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDetailsType }
     *     
     */
    public void setPeriodDetails(PeriodDetailsType value) {
        this.periodDetails = value;
    }

    /**
     * Gets the value of the workTimeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the workTimeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkTimeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkTimeDetailsType }
     * 
     * 
     */
    public List<WorkTimeDetailsType> getWorkTimeDetails() {
        if (workTimeDetails == null) {
            workTimeDetails = new ArrayList<WorkTimeDetailsType>();
        }
        return this.workTimeDetails;
    }

}
