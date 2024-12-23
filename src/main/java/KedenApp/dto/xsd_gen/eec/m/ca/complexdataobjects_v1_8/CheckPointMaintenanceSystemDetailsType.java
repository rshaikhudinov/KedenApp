
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
 * компоненты, представляющие сведения об обеспечивающей системе
 * 
 * <p>Java class for CheckPointMaintenanceSystemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPointMaintenanceSystemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}MaintenanceSystemCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OperabilityIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}MainteanceEquipmentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AdditionalInfoText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPointMaintenanceSystemDetailsType", propOrder = {
    "maintenanceSystemCode",
    "operabilityIndicator",
    "mainteanceEquipmentDetails",
    "additionalInfoText"
})
public class CheckPointMaintenanceSystemDetailsType {

    @XmlElement(name = "MaintenanceSystemCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String maintenanceSystemCode;
    @XmlElement(name = "OperabilityIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean operabilityIndicator;
    @XmlElement(name = "MainteanceEquipmentDetails")
    protected List<MainteanceEquipmentDetailsType> mainteanceEquipmentDetails;
    @XmlElement(name = "AdditionalInfoText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String additionalInfoText;

    /**
     * Gets the value of the maintenanceSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaintenanceSystemCode() {
        return maintenanceSystemCode;
    }

    /**
     * Sets the value of the maintenanceSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaintenanceSystemCode(String value) {
        this.maintenanceSystemCode = value;
    }

    /**
     * Gets the value of the operabilityIndicator property.
     * 
     */
    public Boolean isOperabilityIndicator() {
        return operabilityIndicator;
    }

    /**
     * Sets the value of the operabilityIndicator property.
     * 
     */
    public void setOperabilityIndicator(Boolean value) {
        this.operabilityIndicator = value;
    }

    /**
     * Gets the value of the mainteanceEquipmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mainteanceEquipmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMainteanceEquipmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MainteanceEquipmentDetailsType }
     * 
     * 
     */
    public List<MainteanceEquipmentDetailsType> getMainteanceEquipmentDetails() {
        if (mainteanceEquipmentDetails == null) {
            mainteanceEquipmentDetails = new ArrayList<MainteanceEquipmentDetailsType>();
        }
        return this.mainteanceEquipmentDetails;
    }

    /**
     * краткое описание части системы
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfoText() {
        return additionalInfoText;
    }

    /**
     * Sets the value of the additionalInfoText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfoText(String value) {
        this.additionalInfoText = value;
    }

}
