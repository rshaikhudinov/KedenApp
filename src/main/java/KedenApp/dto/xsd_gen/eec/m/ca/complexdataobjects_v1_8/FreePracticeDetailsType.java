
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения об ограничении свободной практики в порту
 * 
 * <p>Java class for FreePracticeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreePracticeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}FreePracticeRestrictionIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocV4Details" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreePracticeDetailsType", propOrder = {
    "freePracticeRestrictionIndicator",
    "docV4Details"
})
public class FreePracticeDetailsType {

    @XmlElement(name = "FreePracticeRestrictionIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean freePracticeRestrictionIndicator;
    @XmlElement(name = "DocV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected DocDetailsV4Type docV4Details;

    /**
     * Gets the value of the freePracticeRestrictionIndicator property.
     * 
     */
    public Boolean isFreePracticeRestrictionIndicator() {
        return freePracticeRestrictionIndicator;
    }

    /**
     * Sets the value of the freePracticeRestrictionIndicator property.
     * 
     */
    public void setFreePracticeRestrictionIndicator(Boolean value) {
        this.freePracticeRestrictionIndicator = value;
    }

    /**
     * Сведения о документе, подтверждающем разрешение (ограничение) свободной практики в порту в отношении пассажиров и членов экипажа
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getDocV4Details() {
        return docV4Details;
    }

    /**
     * Sets the value of the docV4Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setDocV4Details(DocDetailsV4Type value) {
        this.docV4Details = value;
    }

}
