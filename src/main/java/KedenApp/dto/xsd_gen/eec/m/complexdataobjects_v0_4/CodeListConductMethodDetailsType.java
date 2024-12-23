
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию о методике ведения справочника (классификатора)
 * 
 * <p>Java class for CodeListConductMethodDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeListConductMethodDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CodeListConductMethodCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}LegalActDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeListConductMethodDetailsType", propOrder = {
    "codeListConductMethodCode",
    "descriptionText",
    "legalActDetails"
})
public class CodeListConductMethodDetailsType {

    @XmlElement(name = "CodeListConductMethodCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String codeListConductMethodCode;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;
    @XmlElement(name = "LegalActDetails")
    protected LegalActReferenceDetailsType legalActDetails;

    /**
     * Gets the value of the codeListConductMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListConductMethodCode() {
        return codeListConductMethodCode;
    }

    /**
     * Sets the value of the codeListConductMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListConductMethodCode(String value) {
        this.codeListConductMethodCode = value;
    }

    /**
     * Описание методики ведения справочника (классификатора)
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

    /**
     * Сведения о нормативном правовом акте, регламентирующем ведение справочника (классификатора)
     * 
     * @return
     *     possible object is
     *     {@link LegalActReferenceDetailsType }
     *     
     */
    public LegalActReferenceDetailsType getLegalActDetails() {
        return legalActDetails;
    }

    /**
     * Sets the value of the legalActDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LegalActReferenceDetailsType }
     *     
     */
    public void setLegalActDetails(LegalActReferenceDetailsType value) {
        this.legalActDetails = value;
    }

}
