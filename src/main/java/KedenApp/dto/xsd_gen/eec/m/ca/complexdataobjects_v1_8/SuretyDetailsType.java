
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о поручительстве
 * 
 * <p>Java class for SuretyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SuretyDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SuretyMainContractDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SuretyContractDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}AddSuretyContractDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuretyDetailsType", propOrder = {
    "suretyMainContractDetails",
    "suretyContractDetails",
    "addSuretyContractDetails"
})
public class SuretyDetailsType {

    @XmlElement(name = "SuretyMainContractDetails")
    protected DocDetailsV4Type suretyMainContractDetails;
    @XmlElement(name = "SuretyContractDetails")
    protected DocDetailsV4Type suretyContractDetails;
    @XmlElement(name = "AddSuretyContractDetails")
    protected DocDetailsV4Type addSuretyContractDetails;

    /**
     * Gets the value of the suretyMainContractDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getSuretyMainContractDetails() {
        return suretyMainContractDetails;
    }

    /**
     * Sets the value of the suretyMainContractDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setSuretyMainContractDetails(DocDetailsV4Type value) {
        this.suretyMainContractDetails = value;
    }

    /**
     * Gets the value of the suretyContractDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getSuretyContractDetails() {
        return suretyContractDetails;
    }

    /**
     * Sets the value of the suretyContractDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setSuretyContractDetails(DocDetailsV4Type value) {
        this.suretyContractDetails = value;
    }

    /**
     * Gets the value of the addSuretyContractDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getAddSuretyContractDetails() {
        return addSuretyContractDetails;
    }

    /**
     * Sets the value of the addSuretyContractDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setAddSuretyContractDetails(DocDetailsV4Type value) {
        this.addSuretyContractDetails = value;
    }

}
