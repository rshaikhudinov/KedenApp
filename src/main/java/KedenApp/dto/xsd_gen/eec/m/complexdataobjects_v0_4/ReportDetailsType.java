
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.ObsComponentTextType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию об отчете
 * 
 * <p>Java class for ReportDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReportKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReportName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}UnifiedAuthorityDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReportAttributeText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ObsDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportDetailsType", propOrder = {
    "reportKindCode",
    "reportName",
    "unifiedAuthorityDetails",
    "eventDateTime",
    "reportAttributeText",
    "obsDetails"
})
public class ReportDetailsType {

    @XmlElement(name = "ReportKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reportKindCode;
    @XmlElement(name = "ReportName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reportName;
    @XmlElement(name = "UnifiedAuthorityDetails")
    protected UnifiedAuthorityDetailsType unifiedAuthorityDetails;
    @XmlElement(name = "EventDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;
    @XmlElement(name = "ReportAttributeText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<ObsComponentTextType> reportAttributeText;
    @XmlElement(name = "ObsDetails", required = true)
    protected List<ObsDetailsType> obsDetails;

    /**
     * Gets the value of the reportKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportKindCode() {
        return reportKindCode;
    }

    /**
     * Sets the value of the reportKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportKindCode(String value) {
        this.reportKindCode = value;
    }

    /**
     * Gets the value of the reportName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * Sets the value of the reportName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportName(String value) {
        this.reportName = value;
    }

    /**
     * Сведения об уполномоченном органе государства-члена, предоставившем отчет
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
     * Дата и время формирования отчета
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Sets the value of the eventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDateTime(XMLGregorianCalendar value) {
        this.eventDateTime = value;
    }

    /**
     * Строка символов, которая содержит сведения об отчете Gets the value of the reportAttributeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the reportAttributeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReportAttributeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObsComponentTextType }
     * 
     * 
     */
    public List<ObsComponentTextType> getReportAttributeText() {
        if (reportAttributeText == null) {
            reportAttributeText = new ArrayList<ObsComponentTextType>();
        }
        return this.reportAttributeText;
    }

    /**
     * Gets the value of the obsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the obsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObsDetailsType }
     * 
     * 
     */
    public List<ObsDetailsType> getObsDetails() {
        if (obsDetails == null) {
            obsDetails = new ArrayList<ObsDetailsType>();
        }
        return this.obsDetails;
    }

}
