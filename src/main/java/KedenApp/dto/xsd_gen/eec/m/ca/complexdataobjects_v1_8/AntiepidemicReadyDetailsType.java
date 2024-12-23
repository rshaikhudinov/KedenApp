
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о противоэпидемической готовности транспортного средства
 * 
 * <p>Java class for AntiepidemicReadyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AntiepidemicReadyDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AntiepidemicEquipmentDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CrewTrainingDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntiepidemicReadyDetailsType", propOrder = {
    "antiepidemicEquipmentDetails",
    "crewTrainingDetails"
})
public class AntiepidemicReadyDetailsType {

    @XmlElement(name = "AntiepidemicEquipmentDetails", required = true)
    protected AntiepidemicEquipmentDetailsType antiepidemicEquipmentDetails;
    @XmlElement(name = "CrewTrainingDetails", required = true)
    protected CrewTrainingDetailsType crewTrainingDetails;

    /**
     * Gets the value of the antiepidemicEquipmentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AntiepidemicEquipmentDetailsType }
     *     
     */
    public AntiepidemicEquipmentDetailsType getAntiepidemicEquipmentDetails() {
        return antiepidemicEquipmentDetails;
    }

    /**
     * Sets the value of the antiepidemicEquipmentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AntiepidemicEquipmentDetailsType }
     *     
     */
    public void setAntiepidemicEquipmentDetails(AntiepidemicEquipmentDetailsType value) {
        this.antiepidemicEquipmentDetails = value;
    }

    /**
     * Сведения противоэпидемической подготовке экипажа
     * 
     * @return
     *     possible object is
     *     {@link CrewTrainingDetailsType }
     *     
     */
    public CrewTrainingDetailsType getCrewTrainingDetails() {
        return crewTrainingDetails;
    }

    /**
     * Sets the value of the crewTrainingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrewTrainingDetailsType }
     *     
     */
    public void setCrewTrainingDetails(CrewTrainingDetailsType value) {
        this.crewTrainingDetails = value;
    }

}
