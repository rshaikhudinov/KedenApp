
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TNVEDNoteKindCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие пояснения к объекту ТН ВЭД ЕАЭС (раздел, группа, позиция, субпозиция, подсубпозиция)
 * 
 * <p>Java class for CATNVEDNoteDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CATNVEDNoteDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TNVEDCodeDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TNVEDExplanationKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TNVEDNoteId"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TNVEDExplanationText" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CATNVEDNoteDetailsType", propOrder = {
    "tnvedCodeDetails",
    "tnvedExplanationKindCode",
    "tnvedNoteId",
    "tnvedExplanationText"
})
public class CATNVEDNoteDetailsType {

    @XmlElement(name = "TNVEDCodeDetails", required = true)
    protected TNVEDCodeDetailsType tnvedCodeDetails;
    @XmlElement(name = "TNVEDExplanationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected TNVEDNoteKindCodeType tnvedExplanationKindCode;
    @XmlElement(name = "TNVEDNoteId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tnvedNoteId;
    @XmlElement(name = "TNVEDExplanationText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected List<String> tnvedExplanationText;

    /**
     * Gets the value of the tnvedCodeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TNVEDCodeDetailsType }
     *     
     */
    public TNVEDCodeDetailsType getTNVEDCodeDetails() {
        return tnvedCodeDetails;
    }

    /**
     * Sets the value of the tnvedCodeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TNVEDCodeDetailsType }
     *     
     */
    public void setTNVEDCodeDetails(TNVEDCodeDetailsType value) {
        this.tnvedCodeDetails = value;
    }

    /**
     * Gets the value of the tnvedExplanationKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link TNVEDNoteKindCodeType }
     *     
     */
    public TNVEDNoteKindCodeType getTNVEDExplanationKindCode() {
        return tnvedExplanationKindCode;
    }

    /**
     * Sets the value of the tnvedExplanationKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TNVEDNoteKindCodeType }
     *     
     */
    public void setTNVEDExplanationKindCode(TNVEDNoteKindCodeType value) {
        this.tnvedExplanationKindCode = value;
    }

    /**
     * Gets the value of the tnvedNoteId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTNVEDNoteId() {
        return tnvedNoteId;
    }

    /**
     * Sets the value of the tnvedNoteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTNVEDNoteId(String value) {
        this.tnvedNoteId = value;
    }

    /**
     * Gets the value of the tnvedExplanationText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tnvedExplanationText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTNVEDExplanationText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTNVEDExplanationText() {
        if (tnvedExplanationText == null) {
            tnvedExplanationText = new ArrayList<String>();
        }
        return this.tnvedExplanationText;
    }

}
