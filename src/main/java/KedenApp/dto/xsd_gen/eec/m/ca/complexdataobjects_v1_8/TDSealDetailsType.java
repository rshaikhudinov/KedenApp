
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о защитных пломбах в транзитной декларации
 * 
 * <p>Java class for TDSealDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDSealDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}SealId" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ForeignCustomsIdentificationMeansIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDSealDetailsType", propOrder = {
    "sealId",
    "foreignCustomsIdentificationMeansIndicator"
})
public class TDSealDetailsType {

    @XmlElement(name = "SealId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> sealId;
    @XmlElement(name = "ForeignCustomsIdentificationMeansIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean foreignCustomsIdentificationMeansIndicator;

    /**
     * Gets the value of the sealId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sealId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSealId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSealId() {
        if (sealId == null) {
            sealId = new ArrayList<String>();
        }
        return this.sealId;
    }

    /**
     * Gets the value of the foreignCustomsIdentificationMeansIndicator property.
     * 
     */
    public Boolean isForeignCustomsIdentificationMeansIndicator() {
        return foreignCustomsIdentificationMeansIndicator;
    }

    /**
     * Sets the value of the foreignCustomsIdentificationMeansIndicator property.
     * 
     */
    public void setForeignCustomsIdentificationMeansIndicator(Boolean value) {
        this.foreignCustomsIdentificationMeansIndicator = value;
    }

}
