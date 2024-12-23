
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
 * Обоснование принятия предварительного решения
 * 
 * <p>Java class for PreDecisionJustificationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreDecisionJustificationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}InterpretationRuleCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CATNVEDNoteDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DecisionReasonText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDeclarationIdDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreDecisionJustificationDetailsType", propOrder = {
    "interpretationRuleCode",
    "catnvedNoteDetails",
    "decisionReasonText",
    "caDocDetails",
    "customsDeclarationIdDetails"
})
public class PreDecisionJustificationDetailsType {

    @XmlElement(name = "InterpretationRuleCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> interpretationRuleCode;
    @XmlElement(name = "CATNVEDNoteDetails")
    protected List<CATNVEDNoteDetailsType> catnvedNoteDetails;
    @XmlElement(name = "DecisionReasonText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> decisionReasonText;
    @XmlElement(name = "CADocDetails")
    protected List<CADocDetailsType> caDocDetails;
    @XmlElement(name = "CustomsDeclarationIdDetails")
    protected List<CustomsDocumentIdDetailsType> customsDeclarationIdDetails;

    /**
     * Gets the value of the interpretationRuleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the interpretationRuleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInterpretationRuleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInterpretationRuleCode() {
        if (interpretationRuleCode == null) {
            interpretationRuleCode = new ArrayList<String>();
        }
        return this.interpretationRuleCode;
    }

    /**
     * Gets the value of the catnvedNoteDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the catnvedNoteDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCATNVEDNoteDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CATNVEDNoteDetailsType }
     * 
     * 
     */
    public List<CATNVEDNoteDetailsType> getCATNVEDNoteDetails() {
        if (catnvedNoteDetails == null) {
            catnvedNoteDetails = new ArrayList<CATNVEDNoteDetailsType>();
        }
        return this.catnvedNoteDetails;
    }

    /**
     * Gets the value of the decisionReasonText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the decisionReasonText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecisionReasonText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDecisionReasonText() {
        if (decisionReasonText == null) {
            decisionReasonText = new ArrayList<String>();
        }
        return this.decisionReasonText;
    }

    /**
     * Документ, являющийся обоснованием принятия предварительного решения Gets the value of the caDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the caDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCADocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CADocDetailsType }
     * 
     * 
     */
    public List<CADocDetailsType> getCADocDetails() {
        if (caDocDetails == null) {
            caDocDetails = new ArrayList<CADocDetailsType>();
        }
        return this.caDocDetails;
    }

    /**
     * регистрационный номер таможенной декларации (для Республики Казахстан и Российской Федерации) Gets the value of the customsDeclarationIdDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customsDeclarationIdDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsDeclarationIdDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsDocumentIdDetailsType }
     * 
     * 
     */
    public List<CustomsDocumentIdDetailsType> getCustomsDeclarationIdDetails() {
        if (customsDeclarationIdDetails == null) {
            customsDeclarationIdDetails = new ArrayList<CustomsDocumentIdDetailsType>();
        }
        return this.customsDeclarationIdDetails;
    }

}
