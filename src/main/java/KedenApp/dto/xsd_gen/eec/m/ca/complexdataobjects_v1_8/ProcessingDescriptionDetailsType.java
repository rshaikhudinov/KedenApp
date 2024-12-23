
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о совершаемой (совершенной) операции
 * 
 * <p>Java class for ProcessingDescriptionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingDescriptionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ProcessingDescriptionText" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PeriodDateDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingDescriptionDetailsType", propOrder = {
    "processingDescriptionText",
    "periodDateDetails"
})
public class ProcessingDescriptionDetailsType {

    @XmlElement(name = "ProcessingDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected List<String> processingDescriptionText;
    @XmlElement(name = "PeriodDateDetails", required = true)
    protected PeriodDateDetailsType periodDateDetails;

    /**
     * Описание операций Gets the value of the processingDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the processingDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProcessingDescriptionText() {
        if (processingDescriptionText == null) {
            processingDescriptionText = new ArrayList<String>();
        }
        return this.processingDescriptionText;
    }

    /**
     * Период совершения операций с транспортным средством
     * 
     * @return
     *     possible object is
     *     {@link PeriodDateDetailsType }
     *     
     */
    public PeriodDateDetailsType getPeriodDateDetails() {
        return periodDateDetails;
    }

    /**
     * Sets the value of the periodDateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDateDetailsType }
     *     
     */
    public void setPeriodDateDetails(PeriodDateDetailsType value) {
        this.periodDateDetails = value;
    }

}
