
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Запись реестра сведений о временно ввезенных и не вывезенных ТСЛП
 * 
 * <p>Java class for TIERegistryItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TIERegistryItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDDeclarantDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIEDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TIERegistryItemDetailsType", propOrder = {
    "pdDeclarantDetails",
    "tieDetails"
})
public class TIERegistryItemDetailsType {

    @XmlElement(name = "PDDeclarantDetails")
    protected PDDeclarantDetailsType pdDeclarantDetails;
    @XmlElement(name = "TIEDetails")
    protected List<TIEDetailsType> tieDetails;

    /**
     * Gets the value of the pdDeclarantDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PDDeclarantDetailsType }
     *     
     */
    public PDDeclarantDetailsType getPDDeclarantDetails() {
        return pdDeclarantDetails;
    }

    /**
     * Sets the value of the pdDeclarantDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDDeclarantDetailsType }
     *     
     */
    public void setPDDeclarantDetails(PDDeclarantDetailsType value) {
        this.pdDeclarantDetails = value;
    }

    /**
     * Gets the value of the tieDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tieDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTIEDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TIEDetailsType }
     * 
     * 
     */
    public List<TIEDetailsType> getTIEDetails() {
        if (tieDetails == null) {
            tieDetails = new ArrayList<TIEDetailsType>();
        }
        return this.tieDetails;
    }

}
