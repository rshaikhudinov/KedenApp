
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о регистрационном номере акта отбора проб и (или) образцов товара, в соответствии с которым проведены изъятия
 * 
 * <p>Java class for ATDSamplesSelectionDocIdDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDSamplesSelectionDocIdDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}InspectionDocIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocCreationDate"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDSamplesSelectionDocIdDetailsType", propOrder = {
    "inspectionDocIdDetails",
    "docCreationDate"
})
public class ATDSamplesSelectionDocIdDetailsType {

    @XmlElement(name = "InspectionDocIdDetails", required = true)
    protected InspectionDocIdDetailsType inspectionDocIdDetails;
    @XmlElement(name = "DocCreationDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar docCreationDate;

    /**
     * Gets the value of the inspectionDocIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InspectionDocIdDetailsType }
     *     
     */
    public InspectionDocIdDetailsType getInspectionDocIdDetails() {
        return inspectionDocIdDetails;
    }

    /**
     * Sets the value of the inspectionDocIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InspectionDocIdDetailsType }
     *     
     */
    public void setInspectionDocIdDetails(InspectionDocIdDetailsType value) {
        this.inspectionDocIdDetails = value;
    }

    /**
     * Gets the value of the docCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDocCreationDate() {
        return docCreationDate;
    }

    /**
     * Sets the value of the docCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDocCreationDate(XMLGregorianCalendar value) {
        this.docCreationDate = value;
    }

}
