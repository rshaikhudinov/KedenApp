
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о навигационной пломбе
 * 
 * <p>Java class for NSDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NSDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}NavigationSealId"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NSDetailsType", propOrder = {
    "navigationSealId",
    "descriptionText"
})
public class NSDetailsType {

    @XmlElement(name = "NavigationSealId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String navigationSealId;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;

    /**
     * Gets the value of the navigationSealId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavigationSealId() {
        return navigationSealId;
    }

    /**
     * Sets the value of the navigationSealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavigationSealId(String value) {
        this.navigationSealId = value;
    }

    /**
     * Дополнительные сведения о навигационной пломбе
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

}