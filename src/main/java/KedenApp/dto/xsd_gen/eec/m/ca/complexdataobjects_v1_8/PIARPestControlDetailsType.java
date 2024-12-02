
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о проведении дезинсекции на борту судна
 * 
 * <p>Java class for PIARPestControlDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIARPestControlDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DisinfestationIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIARDisinfestationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIARPestControlDetailsType", propOrder = {
    "disinfestationIndicator",
    "piarDisinfestationDetails"
})
public class PIARPestControlDetailsType {

    @XmlElement(name = "DisinfestationIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean disinfestationIndicator;
    @XmlElement(name = "PIARDisinfestationDetails")
    protected List<PIARDisinfestationDetailsType> piarDisinfestationDetails;

    /**
     * Gets the value of the disinfestationIndicator property.
     * 
     */
    public Boolean isDisinfestationIndicator() {
        return disinfestationIndicator;
    }

    /**
     * Sets the value of the disinfestationIndicator property.
     * 
     */
    public void setDisinfestationIndicator(Boolean value) {
        this.disinfestationIndicator = value;
    }

    /**
     * Gets the value of the piarDisinfestationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piarDisinfestationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIARDisinfestationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIARDisinfestationDetailsType }
     * 
     * 
     */
    public List<PIARDisinfestationDetailsType> getPIARDisinfestationDetails() {
        if (piarDisinfestationDetails == null) {
            piarDisinfestationDetails = new ArrayList<PIARDisinfestationDetailsType>();
        }
        return this.piarDisinfestationDetails;
    }

}
