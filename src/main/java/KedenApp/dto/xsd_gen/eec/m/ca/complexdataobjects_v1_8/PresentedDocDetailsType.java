
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Представленный документ или сведения
 * 
 * <p>Java class for PresentedDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PresentedDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PresentedDocBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DocumentPresentingDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PresentedDocDetailsType", propOrder = {
    "documentPresentingDetails"
})
public class PresentedDocDetailsType
    extends PresentedDocBaseDetailsType
{

    @XmlElement(name = "DocumentPresentingDetails")
    protected DocumentPresentingDetailsType documentPresentingDetails;

    /**
     * Gets the value of the documentPresentingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentPresentingDetailsType }
     *     
     */
    public DocumentPresentingDetailsType getDocumentPresentingDetails() {
        return documentPresentingDetails;
    }

    /**
     * Sets the value of the documentPresentingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentPresentingDetailsType }
     *     
     */
    public void setDocumentPresentingDetails(DocumentPresentingDetailsType value) {
        this.documentPresentingDetails = value;
    }

}
