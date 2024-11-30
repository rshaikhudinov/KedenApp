
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о грузе, таре, упаковке, поддоне
 * 
 * <p>Java class for PIVCargoPackagePalletDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIVCargoPackagePalletDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CargoPackagePalletDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoLabelDescriptionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIVCargoPackagePalletDetailsType", propOrder = {
    "cargoLabelDescriptionText"
})
public class PIVCargoPackagePalletDetailsType
    extends CargoPackagePalletDetailsType
{

    @XmlElement(name = "CargoLabelDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String cargoLabelDescriptionText;

    /**
     * Описание маркировки груза
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoLabelDescriptionText() {
        return cargoLabelDescriptionText;
    }

    /**
     * Sets the value of the cargoLabelDescriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoLabelDescriptionText(String value) {
        this.cargoLabelDescriptionText = value;
    }

}
