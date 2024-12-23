
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о товарных партиях, вывоз по которым был аннулирован
 * 
 * <p>Java class for ConsignmentCancelDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsignmentCancelDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDeclarationIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FERegistrationIdDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsignmentCancelDetailsType", propOrder = {
    "customsDeclarationIdDetails",
    "feRegistrationIdDetails"
})
public class ConsignmentCancelDetailsType {

    @XmlElement(name = "CustomsDeclarationIdDetails", required = true)
    protected CustomsDocumentIdDetailsType customsDeclarationIdDetails;
    @XmlElement(name = "FERegistrationIdDetails", required = true)
    protected FERegistrationIdDetailsType feRegistrationIdDetails;

    /**
     * Регистрационный номер декларации на товары
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
     * Gets the value of the feRegistrationIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FERegistrationIdDetailsType }
     *     
     */
    public FERegistrationIdDetailsType getFERegistrationIdDetails() {
        return feRegistrationIdDetails;
    }

    /**
     * Sets the value of the feRegistrationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FERegistrationIdDetailsType }
     *     
     */
    public void setFERegistrationIdDetails(FERegistrationIdDetailsType value) {
        this.feRegistrationIdDetails = value;
    }

}
