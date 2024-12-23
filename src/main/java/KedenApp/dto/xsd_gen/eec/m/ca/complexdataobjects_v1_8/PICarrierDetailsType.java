
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о перевозчике при представлении предварительной информации о товарах, ввозимых на территорию Евразийского экономического союза
 * 
 * <p>Java class for PICarrierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PICarrierDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CASubjectDetailsV2Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CarrierRepresentativeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PICarrierDetailsType", propOrder = {
    "carrierRepresentativeDetails"
})
public class PICarrierDetailsType
    extends CASubjectDetailsV2Type
{

    @XmlElement(name = "CarrierRepresentativeDetails")
    protected List<CarrierRepresentativeDetailsType> carrierRepresentativeDetails;

    /**
     * Gets the value of the carrierRepresentativeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the carrierRepresentativeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierRepresentativeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierRepresentativeDetailsType }
     * 
     * 
     */
    public List<CarrierRepresentativeDetailsType> getCarrierRepresentativeDetails() {
        if (carrierRepresentativeDetails == null) {
            carrierRepresentativeDetails = new ArrayList<CarrierRepresentativeDetailsType>();
        }
        return this.carrierRepresentativeDetails;
    }

}
