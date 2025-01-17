
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о дополнительном документе
 * 
 * <p>Java class for TDCADocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDCADocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADocDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ReferenceTDConsignmentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDCADocDetailsType", propOrder = {
    "referenceTDConsignmentDetails"
})
public class TDCADocDetailsType
    extends CADocDetailsType
{

    @XmlElement(name = "ReferenceTDConsignmentDetails")
    protected List<ReferenceTDConsignmentDetailsType> referenceTDConsignmentDetails;

    /**
     * Gets the value of the referenceTDConsignmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the referenceTDConsignmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceTDConsignmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceTDConsignmentDetailsType }
     * 
     * 
     */
    public List<ReferenceTDConsignmentDetailsType> getReferenceTDConsignmentDetails() {
        if (referenceTDConsignmentDetails == null) {
            referenceTDConsignmentDetails = new ArrayList<ReferenceTDConsignmentDetailsType>();
        }
        return this.referenceTDConsignmentDetails;
    }

}
