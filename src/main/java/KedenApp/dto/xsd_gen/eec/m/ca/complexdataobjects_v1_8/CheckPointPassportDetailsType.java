
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.FractionNumber24MeasureType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.BusinessEntityDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения паспорта пункта пропуска
 * 
 * <p>Java class for CheckPointPassportDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPointPassportDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CheckPointDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SettingReasonDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OpeningReasonDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}BorderDistanceMeasure"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DoubleCorridorDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CheckPointCapacityDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CheckPointCapacityInformationIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CheckPointSystemControlDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CheckPointMaintenanceDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CheckPointOrganizationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ControlAgencyInformationDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPointPassportDetailsType", propOrder = {
    "settingReasonDocDetails",
    "openingReasonDocDetails",
    "borderDistanceMeasure",
    "doubleCorridorDetails",
    "checkPointCapacityDetails",
    "checkPointCapacityInformationIndicator",
    "checkPointSystemControlDetails",
    "checkPointMaintenanceDetails",
    "checkPointOrganizationDetails",
    "controlAgencyInformationDetails"
})
public class CheckPointPassportDetailsType
    extends CheckPointDetailsType
{

    @XmlElement(name = "SettingReasonDocDetails")
    protected List<ReasonDocDetailsType> settingReasonDocDetails;
    @XmlElement(name = "OpeningReasonDocDetails")
    protected List<ReasonDocDetailsType> openingReasonDocDetails;
    @XmlElement(name = "BorderDistanceMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected FractionNumber24MeasureType borderDistanceMeasure;
    @XmlElement(name = "DoubleCorridorDetails", required = true)
    protected DoubleCorridorDetailsType doubleCorridorDetails;
    @XmlElement(name = "CheckPointCapacityDetails", required = true)
    protected List<CheckPointCapacityDetailsType> checkPointCapacityDetails;
    @XmlElement(name = "CheckPointCapacityInformationIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean checkPointCapacityInformationIndicator;
    @XmlElement(name = "CheckPointSystemControlDetails", required = true)
    protected List<CheckPointSystemControlDetailsType> checkPointSystemControlDetails;
    @XmlElement(name = "CheckPointMaintenanceDetails")
    protected List<CheckPointMaintenanceDetailsType> checkPointMaintenanceDetails;
    @XmlElement(name = "CheckPointOrganizationDetails", required = true)
    protected BusinessEntityDetailsType checkPointOrganizationDetails;
    @XmlElement(name = "ControlAgencyInformationDetails", required = true)
    protected List<ControlAgencyInformationType> controlAgencyInformationDetails;

    /**
     * Gets the value of the settingReasonDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the settingReasonDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettingReasonDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReasonDocDetailsType }
     * 
     * 
     */
    public List<ReasonDocDetailsType> getSettingReasonDocDetails() {
        if (settingReasonDocDetails == null) {
            settingReasonDocDetails = new ArrayList<ReasonDocDetailsType>();
        }
        return this.settingReasonDocDetails;
    }

    /**
     * Gets the value of the openingReasonDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the openingReasonDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpeningReasonDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReasonDocDetailsType }
     * 
     * 
     */
    public List<ReasonDocDetailsType> getOpeningReasonDocDetails() {
        if (openingReasonDocDetails == null) {
            openingReasonDocDetails = new ArrayList<ReasonDocDetailsType>();
        }
        return this.openingReasonDocDetails;
    }

    /**
     * Gets the value of the borderDistanceMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link FractionNumber24MeasureType }
     *     
     */
    public FractionNumber24MeasureType getBorderDistanceMeasure() {
        return borderDistanceMeasure;
    }

    /**
     * Sets the value of the borderDistanceMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionNumber24MeasureType }
     *     
     */
    public void setBorderDistanceMeasure(FractionNumber24MeasureType value) {
        this.borderDistanceMeasure = value;
    }

    /**
     * Gets the value of the doubleCorridorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DoubleCorridorDetailsType }
     *     
     */
    public DoubleCorridorDetailsType getDoubleCorridorDetails() {
        return doubleCorridorDetails;
    }

    /**
     * Sets the value of the doubleCorridorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoubleCorridorDetailsType }
     *     
     */
    public void setDoubleCorridorDetails(DoubleCorridorDetailsType value) {
        this.doubleCorridorDetails = value;
    }

    /**
     * Gets the value of the checkPointCapacityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the checkPointCapacityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckPointCapacityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckPointCapacityDetailsType }
     * 
     * 
     */
    public List<CheckPointCapacityDetailsType> getCheckPointCapacityDetails() {
        if (checkPointCapacityDetails == null) {
            checkPointCapacityDetails = new ArrayList<CheckPointCapacityDetailsType>();
        }
        return this.checkPointCapacityDetails;
    }

    /**
     * Gets the value of the checkPointCapacityInformationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckPointCapacityInformationIndicator() {
        return checkPointCapacityInformationIndicator;
    }

    /**
     * Sets the value of the checkPointCapacityInformationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckPointCapacityInformationIndicator(Boolean value) {
        this.checkPointCapacityInformationIndicator = value;
    }

    /**
     * Gets the value of the checkPointSystemControlDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the checkPointSystemControlDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckPointSystemControlDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckPointSystemControlDetailsType }
     * 
     * 
     */
    public List<CheckPointSystemControlDetailsType> getCheckPointSystemControlDetails() {
        if (checkPointSystemControlDetails == null) {
            checkPointSystemControlDetails = new ArrayList<CheckPointSystemControlDetailsType>();
        }
        return this.checkPointSystemControlDetails;
    }

    /**
     * Gets the value of the checkPointMaintenanceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the checkPointMaintenanceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckPointMaintenanceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckPointMaintenanceDetailsType }
     * 
     * 
     */
    public List<CheckPointMaintenanceDetailsType> getCheckPointMaintenanceDetails() {
        if (checkPointMaintenanceDetails == null) {
            checkPointMaintenanceDetails = new ArrayList<CheckPointMaintenanceDetailsType>();
        }
        return this.checkPointMaintenanceDetails;
    }

    /**
     * Gets the value of the checkPointOrganizationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessEntityDetailsType }
     *     
     */
    public BusinessEntityDetailsType getCheckPointOrganizationDetails() {
        return checkPointOrganizationDetails;
    }

    /**
     * Sets the value of the checkPointOrganizationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessEntityDetailsType }
     *     
     */
    public void setCheckPointOrganizationDetails(BusinessEntityDetailsType value) {
        this.checkPointOrganizationDetails = value;
    }

    /**
     * Gets the value of the controlAgencyInformationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the controlAgencyInformationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControlAgencyInformationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ControlAgencyInformationType }
     * 
     * 
     */
    public List<ControlAgencyInformationType> getControlAgencyInformationDetails() {
        if (controlAgencyInformationDetails == null) {
            controlAgencyInformationDetails = new ArrayList<ControlAgencyInformationType>();
        }
        return this.controlAgencyInformationDetails;
    }

}
