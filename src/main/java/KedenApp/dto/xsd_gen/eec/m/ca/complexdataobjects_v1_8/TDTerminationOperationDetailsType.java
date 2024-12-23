
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о прекращении таможенной процедуры таможенного транзита в рамках общего процесса
 * 
 * <p>Java class for TDTerminationOperationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDTerminationOperationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDTerminationCargoDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDTerminationOperationDetailsType", propOrder = {
    "tdTerminationCargoDetails"
})
public class TDTerminationOperationDetailsType {

    @XmlElement(name = "TDTerminationCargoDetails", required = true)
    protected List<TDTerminationCargoDetailsType> tdTerminationCargoDetails;

    /**
     * Gets the value of the tdTerminationCargoDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tdTerminationCargoDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDTerminationCargoDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDTerminationCargoDetailsType }
     * 
     * 
     */
    public List<TDTerminationCargoDetailsType> getTDTerminationCargoDetails() {
        if (tdTerminationCargoDetails == null) {
            tdTerminationCargoDetails = new ArrayList<TDTerminationCargoDetailsType>();
        }
        return this.tdTerminationCargoDetails;
    }

}
