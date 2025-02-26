
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о пассажире транспортного средства
 * 
 * <p>Java class for PIVPassengerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIVPassengerDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIVPersonOnBoardDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}EmbarkationPlaceDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DisembarkationPlaceDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIVPassengerDetailsType", propOrder = {
    "embarkationPlaceDetails",
    "disembarkationPlaceDetails"
})
public class PIVPassengerDetailsType
    extends PIVPersonOnBoardDetailsType
{

    @XmlElement(name = "EmbarkationPlaceDetails", required = true)
    protected EmbarkationPlaceDetailsType embarkationPlaceDetails;
    @XmlElement(name = "DisembarkationPlaceDetails", required = true)
    protected EmbarkationPlaceDetailsType disembarkationPlaceDetails;

    /**
     * Gets the value of the embarkationPlaceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EmbarkationPlaceDetailsType }
     *     
     */
    public EmbarkationPlaceDetailsType getEmbarkationPlaceDetails() {
        return embarkationPlaceDetails;
    }

    /**
     * Sets the value of the embarkationPlaceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbarkationPlaceDetailsType }
     *     
     */
    public void setEmbarkationPlaceDetails(EmbarkationPlaceDetailsType value) {
        this.embarkationPlaceDetails = value;
    }

    /**
     * Gets the value of the disembarkationPlaceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link EmbarkationPlaceDetailsType }
     *     
     */
    public EmbarkationPlaceDetailsType getDisembarkationPlaceDetails() {
        return disembarkationPlaceDetails;
    }

    /**
     * Sets the value of the disembarkationPlaceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmbarkationPlaceDetailsType }
     *     
     */
    public void setDisembarkationPlaceDetails(EmbarkationPlaceDetailsType value) {
        this.disembarkationPlaceDetails = value;
    }

}
