
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.FullNameDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о заявлениях, замечаниях или предложениях лиц, присутствующих при отборе проб и (или) образцов
 * 
 * <p>Java class for ATDStatementDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDStatementDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}FullNameDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}StatementCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDStatementDetailsType", propOrder = {
    "fullNameDetails",
    "statementCode",
    "descriptionText"
})
public class ATDStatementDetailsType {

    @XmlElement(name = "FullNameDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected FullNameDetailsType fullNameDetails;
    @XmlElement(name = "StatementCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String statementCode;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected String descriptionText;

    /**
     * Сведения о лице, сделавшем заявление, замечание или предложения
     * 
     * @return
     *     possible object is
     *     {@link FullNameDetailsType }
     *     
     */
    public FullNameDetailsType getFullNameDetails() {
        return fullNameDetails;
    }

    /**
     * Sets the value of the fullNameDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullNameDetailsType }
     *     
     */
    public void setFullNameDetails(FullNameDetailsType value) {
        this.fullNameDetails = value;
    }

    /**
     * Gets the value of the statementCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementCode() {
        return statementCode;
    }

    /**
     * Sets the value of the statementCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementCode(String value) {
        this.statementCode = value;
    }

    /**
     * Содержание заявления, замечания или предложения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

}
