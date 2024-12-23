
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
 * Сведения об условиях, при которых проводился отбор проб и (или) образцов товаров
 * 
 * <p>Java class for ATDTermsThievingSamplingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDTermsThievingSamplingDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}WeatherText"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LightCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDTermsThievingSamplingDetailsType", propOrder = {
    "weatherText",
    "lightCode",
    "descriptionText"
})
public class ATDTermsThievingSamplingDetailsType {

    @XmlElement(name = "WeatherText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected String weatherText;
    @XmlElement(name = "LightCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lightCode;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> descriptionText;

    /**
     * Gets the value of the weatherText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeatherText() {
        return weatherText;
    }

    /**
     * Sets the value of the weatherText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeatherText(String value) {
        this.weatherText = value;
    }

    /**
     * Gets the value of the lightCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLightCode() {
        return lightCode;
    }

    /**
     * Sets the value of the lightCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLightCode(String value) {
        this.lightCode = value;
    }

    /**
     * Иные сведения об условиях отбора проб и (или) образцов Gets the value of the descriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescriptionText() {
        if (descriptionText == null) {
            descriptionText = new ArrayList<String>();
        }
        return this.descriptionText;
    }

}
