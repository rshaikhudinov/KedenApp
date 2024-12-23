
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.ObsComponentTextType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие детализированную информацию о совокупности отчетных показателей, которые сгруппированы по одному или нескольким параметрам
 * 
 * <p>Java class for ObsSeriesDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObsSeriesDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObsKeyText" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObsAttributeText" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ObsSeriesDetailsType", propOrder = {
    "obsKeyText",
    "obsAttributeText",
    "obsDetails"
})
public class ObsSeriesDetailsType {

    @XmlElement(name = "ObsKeyText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected List<ObsComponentTextType> obsKeyText;
    @XmlElement(name = "ObsAttributeText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<ObsComponentTextType> obsAttributeText;
    @XmlElement(name = "ObsDetails", required = true)
    protected List<ObsDetailsType> obsDetails;

    /**
     * Gets the value of the obsKeyText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the obsKeyText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObsKeyText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObsComponentTextType }
     * 
     * 
     */
    public List<ObsComponentTextType> getObsKeyText() {
        if (obsKeyText == null) {
            obsKeyText = new ArrayList<ObsComponentTextType>();
        }
        return this.obsKeyText;
    }

    /**
     * Gets the value of the obsAttributeText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the obsAttributeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObsAttributeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObsComponentTextType }
     * 
     * 
     */
    public List<ObsComponentTextType> getObsAttributeText() {
        if (obsAttributeText == null) {
            obsAttributeText = new ArrayList<ObsComponentTextType>();
        }
        return this.obsAttributeText;
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
