
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения в целях осуществления санитарно-эпидемиологического надзора (контроля) за транспортными средствами
 * 
 * <p>Java class for PIAREpidemicControlDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIAREpidemicControlDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OnBoardDiseasePersonIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DiseasePersonQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIARPestControlDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIAREpidemicControlDetailsType", propOrder = {
    "onBoardDiseasePersonIndicator",
    "diseasePersonQuantity",
    "piarPestControlDetails"
})
public class PIAREpidemicControlDetailsType {

    @XmlElement(name = "OnBoardDiseasePersonIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean onBoardDiseasePersonIndicator;
    @XmlElement(name = "DiseasePersonQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger diseasePersonQuantity;
    @XmlElement(name = "PIARPestControlDetails", required = true)
    protected PIARPestControlDetailsType piarPestControlDetails;

    /**
     * Gets the value of the onBoardDiseasePersonIndicator property.
     * 
     */
    public Boolean isOnBoardDiseasePersonIndicator() {
        return onBoardDiseasePersonIndicator;
    }

    /**
     * Sets the value of the onBoardDiseasePersonIndicator property.
     * 
     */
    public void setOnBoardDiseasePersonIndicator(Boolean value) {
        this.onBoardDiseasePersonIndicator = value;
    }

    /**
     * число заболевших и лиц с подозрением на инфекционные заболевания
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiseasePersonQuantity() {
        return diseasePersonQuantity;
    }

    /**
     * Sets the value of the diseasePersonQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiseasePersonQuantity(BigInteger value) {
        this.diseasePersonQuantity = value;
    }

    /**
     * Gets the value of the piarPestControlDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PIARPestControlDetailsType }
     *     
     */
    public PIARPestControlDetailsType getPIARPestControlDetails() {
        return piarPestControlDetails;
    }

    /**
     * Sets the value of the piarPestControlDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PIARPestControlDetailsType }
     *     
     */
    public void setPIARPestControlDetails(PIARPestControlDetailsType value) {
        this.piarPestControlDetails = value;
    }

}
