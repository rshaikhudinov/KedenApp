
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о противоэпидемическом имуществе на борту судна
 * 
 * <p>Java class for AntiepidemicEquipmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AntiepidemicEquipmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}AntiepidemicEquipmentIndicator"/&gt;
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
@XmlType(name = "AntiepidemicEquipmentDetailsType", propOrder = {
    "antiepidemicEquipmentIndicator",
    "descriptionText"
})
public class AntiepidemicEquipmentDetailsType {

    @XmlElement(name = "AntiepidemicEquipmentIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean antiepidemicEquipmentIndicator;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;

    /**
     * Gets the value of the antiepidemicEquipmentIndicator property.
     * 
     */
    public Boolean isAntiepidemicEquipmentIndicator() {
        return antiepidemicEquipmentIndicator;
    }

    /**
     * Sets the value of the antiepidemicEquipmentIndicator property.
     * 
     */
    public void setAntiepidemicEquipmentIndicator(Boolean value) {
        this.antiepidemicEquipmentIndicator = value;
    }

    /**
     * Описание противоэпидемического имущества
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
