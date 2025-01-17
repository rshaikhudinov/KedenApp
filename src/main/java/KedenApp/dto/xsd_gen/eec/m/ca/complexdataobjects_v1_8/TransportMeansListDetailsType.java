
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.TransportMeansRegIdType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о перечне транспортных средств
 * 
 * <p>Java class for TransportMeansListDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportMeansListDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedTransportModeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TransportMeansRegId" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportMeansListDetailsType", propOrder = {
    "unifiedTransportModeCode",
    "transportMeansRegId"
})
public class TransportMeansListDetailsType {

    @XmlElement(name = "UnifiedTransportModeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCode20Type unifiedTransportModeCode;
    @XmlElement(name = "TransportMeansRegId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected List<TransportMeansRegIdType> transportMeansRegId;

    /**
     * Gets the value of the unifiedTransportModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getUnifiedTransportModeCode() {
        return unifiedTransportModeCode;
    }

    /**
     * Sets the value of the unifiedTransportModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setUnifiedTransportModeCode(UnifiedCode20Type value) {
        this.unifiedTransportModeCode = value;
    }

    /**
     * Gets the value of the transportMeansRegId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transportMeansRegId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportMeansRegId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportMeansRegIdType }
     * 
     * 
     */
    public List<TransportMeansRegIdType> getTransportMeansRegId() {
        if (transportMeansRegId == null) {
            transportMeansRegId = new ArrayList<TransportMeansRegIdType>();
        }
        return this.transportMeansRegId;
    }

}
