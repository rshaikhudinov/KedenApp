
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * сведения об операции по переработке товаров и способе ее совершения
 * 
 * <p>Java class for ProcessingOperationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingOperationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ProcessingOperationName"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ProcessingOperationMethodText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingOperationDetailsType", propOrder = {
    "processingOperationName",
    "processingOperationMethodText"
})
public class ProcessingOperationDetailsType {

    @XmlElement(name = "ProcessingOperationName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String processingOperationName;
    @XmlElement(name = "ProcessingOperationMethodText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected String processingOperationMethodText;

    /**
     * Gets the value of the processingOperationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingOperationName() {
        return processingOperationName;
    }

    /**
     * Sets the value of the processingOperationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingOperationName(String value) {
        this.processingOperationName = value;
    }

    /**
     * Gets the value of the processingOperationMethodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingOperationMethodText() {
        return processingOperationMethodText;
    }

    /**
     * Sets the value of the processingOperationMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingOperationMethodText(String value) {
        this.processingOperationMethodText = value;
    }

}
