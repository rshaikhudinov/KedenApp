
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о регистрационном номере декларации на товары для обмена в рамках контрольно-аналитических функций
 * 
 * <p>Java class for DTExchDeclarationIdDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTExchDeclarationIdDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDeclarationIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DeclarationKindCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTExchDeclarationIdDetailsType", propOrder = {
    "customsDeclarationIdDetails",
    "declarationKindCode"
})
public class DTExchDeclarationIdDetailsType {

    @XmlElement(name = "CustomsDeclarationIdDetails", required = true)
    protected CustomsDocumentIdDetailsType customsDeclarationIdDetails;
    @XmlElement(name = "DeclarationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String declarationKindCode;

    /**
     * Gets the value of the customsDeclarationIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public CustomsDocumentIdDetailsType getCustomsDeclarationIdDetails() {
        return customsDeclarationIdDetails;
    }

    /**
     * Sets the value of the customsDeclarationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public void setCustomsDeclarationIdDetails(CustomsDocumentIdDetailsType value) {
        this.customsDeclarationIdDetails = value;
    }

    /**
     * Gets the value of the declarationKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarationKindCode() {
        return declarationKindCode;
    }

    /**
     * Sets the value of the declarationKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarationKindCode(String value) {
        this.declarationKindCode = value;
    }

}
