
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о диапазоне значений средств идентификации, нанесенных на товар, подлежащий маркировке средствами идентификации
 * 
 * <p>Java class for IdentificationMeansRangeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationMeansRangeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FirstIdentificationMeansItemDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}LastIdentificationMeansItemDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationMeansRangeDetailsType", propOrder = {
    "firstIdentificationMeansItemDetails",
    "lastIdentificationMeansItemDetails"
})
public class IdentificationMeansRangeDetailsType {

    @XmlElement(name = "FirstIdentificationMeansItemDetails", required = true)
    protected IdentificationMeansItemDetailsType firstIdentificationMeansItemDetails;
    @XmlElement(name = "LastIdentificationMeansItemDetails", required = true)
    protected IdentificationMeansItemDetailsType lastIdentificationMeansItemDetails;

    /**
     * первый номер диапазона значений идентификационных номеров (идентификаторов) или кодов идентификации
     * 
     * @return
     *     possible object is
     *     {@link IdentificationMeansItemDetailsType }
     *     
     */
    public IdentificationMeansItemDetailsType getFirstIdentificationMeansItemDetails() {
        return firstIdentificationMeansItemDetails;
    }

    /**
     * Sets the value of the firstIdentificationMeansItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationMeansItemDetailsType }
     *     
     */
    public void setFirstIdentificationMeansItemDetails(IdentificationMeansItemDetailsType value) {
        this.firstIdentificationMeansItemDetails = value;
    }

    /**
     * последний номер диапазона значений идентификационных номеров (идентификаторов) или кодов идентификации
     * 
     * @return
     *     possible object is
     *     {@link IdentificationMeansItemDetailsType }
     *     
     */
    public IdentificationMeansItemDetailsType getLastIdentificationMeansItemDetails() {
        return lastIdentificationMeansItemDetails;
    }

    /**
     * Sets the value of the lastIdentificationMeansItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationMeansItemDetailsType }
     *     
     */
    public void setLastIdentificationMeansItemDetails(IdentificationMeansItemDetailsType value) {
        this.lastIdentificationMeansItemDetails = value;
    }

}
