
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения об обеспечивающих системах пункта пропуска
 * 
 * <p>Java class for CheckPointMaintenanceDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPointMaintenanceDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CheckPointLinkDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CheckPointTVSystemDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CheckPointInformationSystemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CheckPointMaintenanceSystemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPointMaintenanceDetailsType", propOrder = {
    "checkPointLinkDetails",
    "checkPointTVSystemDetails",
    "checkPointInformationSystemDetails",
    "checkPointMaintenanceSystemDetails"
})
public class CheckPointMaintenanceDetailsType {

    @XmlElement(name = "CheckPointLinkDetails", required = true)
    protected List<CheckPointLinkDetailsType> checkPointLinkDetails;
    @XmlElement(name = "CheckPointTVSystemDetails", required = true)
    protected List<CheckPointTVSystemDetailsType> checkPointTVSystemDetails;
    @XmlElement(name = "CheckPointInformationSystemDetails")
    protected List<CheckPointInformationSystemDetailsType> checkPointInformationSystemDetails;
    @XmlElement(name = "CheckPointMaintenanceSystemDetails")
    protected List<CheckPointMaintenanceSystemDetailsType> checkPointMaintenanceSystemDetails;

    /**
     * Gets the value of the checkPointLinkDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the checkPointLinkDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckPointLinkDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckPointLinkDetailsType }
     * 
     * 
     */
    public List<CheckPointLinkDetailsType> getCheckPointLinkDetails() {
        if (checkPointLinkDetails == null) {
            checkPointLinkDetails = new ArrayList<CheckPointLinkDetailsType>();
        }
        return this.checkPointLinkDetails;
    }

    /**
     * Gets the value of the checkPointTVSystemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the checkPointTVSystemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckPointTVSystemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckPointTVSystemDetailsType }
     * 
     * 
     */
    public List<CheckPointTVSystemDetailsType> getCheckPointTVSystemDetails() {
        if (checkPointTVSystemDetails == null) {
            checkPointTVSystemDetails = new ArrayList<CheckPointTVSystemDetailsType>();
        }
        return this.checkPointTVSystemDetails;
    }

    /**
     * Gets the value of the checkPointInformationSystemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the checkPointInformationSystemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckPointInformationSystemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckPointInformationSystemDetailsType }
     * 
     * 
     */
    public List<CheckPointInformationSystemDetailsType> getCheckPointInformationSystemDetails() {
        if (checkPointInformationSystemDetails == null) {
            checkPointInformationSystemDetails = new ArrayList<CheckPointInformationSystemDetailsType>();
        }
        return this.checkPointInformationSystemDetails;
    }

    /**
     * Gets the value of the checkPointMaintenanceSystemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the checkPointMaintenanceSystemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckPointMaintenanceSystemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckPointMaintenanceSystemDetailsType }
     * 
     * 
     */
    public List<CheckPointMaintenanceSystemDetailsType> getCheckPointMaintenanceSystemDetails() {
        if (checkPointMaintenanceSystemDetails == null) {
            checkPointMaintenanceSystemDetails = new ArrayList<CheckPointMaintenanceSystemDetailsType>();
        }
        return this.checkPointMaintenanceSystemDetails;
    }

}
