
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о решении таможенного органа, принятого в отношении пассажирской декларации и отметках таможенного органа
 * 
 * <p>Java class for PDCustomsDecisionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDCustomsDecisionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDDecisionDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDMarkDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDTransitMarkDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDCustomsDecisionDetailsType", propOrder = {
    "pdDecisionDetails",
    "pdMarkDetails",
    "pdTransitMarkDetails"
})
public class PDCustomsDecisionDetailsType {

    @XmlElement(name = "PDDecisionDetails")
    protected List<PDDecisionDetailsType> pdDecisionDetails;
    @XmlElement(name = "PDMarkDetails")
    protected List<PDMarkDetailsType> pdMarkDetails;
    @XmlElement(name = "PDTransitMarkDetails")
    protected List<PDTransitMarkDetailsType> pdTransitMarkDetails;

    /**
     * Gets the value of the pdDecisionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pdDecisionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDDecisionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDDecisionDetailsType }
     * 
     * 
     */
    public List<PDDecisionDetailsType> getPDDecisionDetails() {
        if (pdDecisionDetails == null) {
            pdDecisionDetails = new ArrayList<PDDecisionDetailsType>();
        }
        return this.pdDecisionDetails;
    }

    /**
     * Сведения об отметке таможенного органа Gets the value of the pdMarkDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pdMarkDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDMarkDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDMarkDetailsType }
     * 
     * 
     */
    public List<PDMarkDetailsType> getPDMarkDetails() {
        if (pdMarkDetails == null) {
            pdMarkDetails = new ArrayList<PDMarkDetailsType>();
        }
        return this.pdMarkDetails;
    }

    /**
     * Gets the value of the pdTransitMarkDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pdTransitMarkDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDTransitMarkDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDTransitMarkDetailsType }
     * 
     * 
     */
    public List<PDTransitMarkDetailsType> getPDTransitMarkDetails() {
        if (pdTransitMarkDetails == null) {
            pdTransitMarkDetails = new ArrayList<PDTransitMarkDetailsType>();
        }
        return this.pdTransitMarkDetails;
    }

}
