
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.FractionNumber102MeasureType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.AddressDetailsType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.FractionNumber10MeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о складе
 * 
 * <p>Java class for WarehouseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarehouseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}AddressDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WarehouseKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WarehouseTypeIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalAreaMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CubageMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TransportModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WarehouseActivityDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AdditionalInfoText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarehouseDetailsType", propOrder = {
    "addressDetails",
    "warehouseKindCode",
    "warehouseTypeIndicator",
    "totalAreaMeasure",
    "cubageMeasure",
    "transportModeCode",
    "warehouseActivityDescriptionText",
    "additionalInfoText"
})
public class WarehouseDetailsType {

    @XmlElement(name = "AddressDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected AddressDetailsType addressDetails;
    @XmlElement(name = "WarehouseKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String warehouseKindCode;
    @XmlElement(name = "WarehouseTypeIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean warehouseTypeIndicator;
    @XmlElement(name = "TotalAreaMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected FractionNumber102MeasureType totalAreaMeasure;
    @XmlElement(name = "CubageMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected FractionNumber10MeasureType cubageMeasure;
    @XmlElement(name = "TransportModeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportModeCode;
    @XmlElement(name = "WarehouseActivityDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> warehouseActivityDescriptionText;
    @XmlElement(name = "AdditionalInfoText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> additionalInfoText;

    /**
     * Gets the value of the addressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailsType }
     *     
     */
    public AddressDetailsType getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailsType }
     *     
     */
    public void setAddressDetails(AddressDetailsType value) {
        this.addressDetails = value;
    }

    /**
     * Gets the value of the warehouseKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarehouseKindCode() {
        return warehouseKindCode;
    }

    /**
     * Sets the value of the warehouseKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarehouseKindCode(String value) {
        this.warehouseKindCode = value;
    }

    /**
     * Gets the value of the warehouseTypeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarehouseTypeIndicator() {
        return warehouseTypeIndicator;
    }

    /**
     * Sets the value of the warehouseTypeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarehouseTypeIndicator(Boolean value) {
        this.warehouseTypeIndicator = value;
    }

    /**
     * Gets the value of the totalAreaMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link FractionNumber102MeasureType }
     *     
     */
    public FractionNumber102MeasureType getTotalAreaMeasure() {
        return totalAreaMeasure;
    }

    /**
     * Sets the value of the totalAreaMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionNumber102MeasureType }
     *     
     */
    public void setTotalAreaMeasure(FractionNumber102MeasureType value) {
        this.totalAreaMeasure = value;
    }

    /**
     * Gets the value of the cubageMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link FractionNumber10MeasureType }
     *     
     */
    public FractionNumber10MeasureType getCubageMeasure() {
        return cubageMeasure;
    }

    /**
     * Sets the value of the cubageMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionNumber10MeasureType }
     *     
     */
    public void setCubageMeasure(FractionNumber10MeasureType value) {
        this.cubageMeasure = value;
    }

    /**
     * Gets the value of the transportModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportModeCode() {
        return transportModeCode;
    }

    /**
     * Sets the value of the transportModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportModeCode(String value) {
        this.transportModeCode = value;
    }

    /**
     * Gets the value of the warehouseActivityDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the warehouseActivityDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarehouseActivityDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWarehouseActivityDescriptionText() {
        if (warehouseActivityDescriptionText == null) {
            warehouseActivityDescriptionText = new ArrayList<String>();
        }
        return this.warehouseActivityDescriptionText;
    }

    /**
     * Gets the value of the additionalInfoText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfoText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfoText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalInfoText() {
        if (additionalInfoText == null) {
            additionalInfoText = new ArrayList<String>();
        }
        return this.additionalInfoText;
    }

}
