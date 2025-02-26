
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.ObsComponentTextType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию об отчетном показателе
 * 
 * <p>Java class for ObsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObsValue"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObsKeyText" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObsAttributeText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObsDetailsType", propOrder = {
    "obsValue",
    "obsKeyText",
    "obsAttributeText"
})
public class ObsDetailsType {

    @XmlElement(name = "ObsValue", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String obsValue;
    @XmlElement(name = "ObsKeyText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected List<ObsComponentTextType> obsKeyText;
    @XmlElement(name = "ObsAttributeText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<ObsComponentTextType> obsAttributeText;

    /**
     * Gets the value of the obsValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObsValue() {
        return obsValue;
    }

    /**
     * Sets the value of the obsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObsValue(String value) {
        this.obsValue = value;
    }

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

}
