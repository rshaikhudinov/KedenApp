
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения об автомобилях
 * 
 * <p>Java class for DTExchAutoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTExchAutoDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTExchAutomobileDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTExchAutoDetailsType", propOrder = {
    "dtExchAutomobileDetails"
})
public class DTExchAutoDetailsType {

    @XmlElement(name = "DTExchAutomobileDetails", required = true)
    protected List<DTExchAutomobileDetailsType> dtExchAutomobileDetails;

    /**
     * Gets the value of the dtExchAutomobileDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtExchAutomobileDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTExchAutomobileDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTExchAutomobileDetailsType }
     * 
     * 
     */
    public List<DTExchAutomobileDetailsType> getDTExchAutomobileDetails() {
        if (dtExchAutomobileDetails == null) {
            dtExchAutomobileDetails = new ArrayList<DTExchAutomobileDetailsType>();
        }
        return this.dtExchAutomobileDetails;
    }

}
