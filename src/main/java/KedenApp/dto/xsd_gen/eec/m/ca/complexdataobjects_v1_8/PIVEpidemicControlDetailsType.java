
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения, представленные в целях осуществления санитарно-эпидемиологического надзора
 * 
 * <p>Java class for PIVEpidemicControlDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIVEpidemicControlDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}MaritimeHealthDeclarationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SanitaryRoadsteadIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FreePracticeDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIVEpidemicControlDetailsType", propOrder = {
    "maritimeHealthDeclarationDetails",
    "sanitaryRoadsteadIndicator",
    "freePracticeDetails"
})
public class PIVEpidemicControlDetailsType {

    @XmlElement(name = "MaritimeHealthDeclarationDetails")
    protected MaritimeHealthDeclarationDetailsType maritimeHealthDeclarationDetails;
    @XmlElement(name = "SanitaryRoadsteadIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean sanitaryRoadsteadIndicator;
    @XmlElement(name = "FreePracticeDetails")
    protected FreePracticeDetailsType freePracticeDetails;

    /**
     * Gets the value of the maritimeHealthDeclarationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MaritimeHealthDeclarationDetailsType }
     *     
     */
    public MaritimeHealthDeclarationDetailsType getMaritimeHealthDeclarationDetails() {
        return maritimeHealthDeclarationDetails;
    }

    /**
     * Sets the value of the maritimeHealthDeclarationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritimeHealthDeclarationDetailsType }
     *     
     */
    public void setMaritimeHealthDeclarationDetails(MaritimeHealthDeclarationDetailsType value) {
        this.maritimeHealthDeclarationDetails = value;
    }

    /**
     * Gets the value of the sanitaryRoadsteadIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSanitaryRoadsteadIndicator() {
        return sanitaryRoadsteadIndicator;
    }

    /**
     * Sets the value of the sanitaryRoadsteadIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSanitaryRoadsteadIndicator(Boolean value) {
        this.sanitaryRoadsteadIndicator = value;
    }

    /**
     * Gets the value of the freePracticeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FreePracticeDetailsType }
     *     
     */
    public FreePracticeDetailsType getFreePracticeDetails() {
        return freePracticeDetails;
    }

    /**
     * Sets the value of the freePracticeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreePracticeDetailsType }
     *     
     */
    public void setFreePracticeDetails(FreePracticeDetailsType value) {
        this.freePracticeDetails = value;
    }

}
