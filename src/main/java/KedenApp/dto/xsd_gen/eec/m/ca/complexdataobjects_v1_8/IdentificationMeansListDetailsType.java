
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о перечне средств идентификации, нанесенных на товар, подлежащий маркировке средствами идентификации
 * 
 * <p>Java class for IdentificationMeansListDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationMeansListDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}IdentificationMeansItemDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationMeansListDetailsType", propOrder = {
    "identificationMeansItemDetails"
})
public class IdentificationMeansListDetailsType {

    @XmlElement(name = "IdentificationMeansItemDetails", required = true)
    protected List<IdentificationMeansItemDetailsType> identificationMeansItemDetails;

    /**
     * сведения об идентификационном номере (идентификаторе) или коде идентификации Gets the value of the identificationMeansItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the identificationMeansItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificationMeansItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationMeansItemDetailsType }
     * 
     * 
     */
    public List<IdentificationMeansItemDetailsType> getIdentificationMeansItemDetails() {
        if (identificationMeansItemDetails == null) {
            identificationMeansItemDetails = new ArrayList<IdentificationMeansItemDetailsType>();
        }
        return this.identificationMeansItemDetails;
    }

}
