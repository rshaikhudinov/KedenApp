
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
 * Компоненты, представляющие сведения о представителе перевозчика
 * 
 * <p>Java class for CarrierRepresentativeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierRepresentativeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}FullNameDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RoleCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierRepresentativeDetailsType", propOrder = {
    "fullNameDetails",
    "roleCode"
})
public class CarrierRepresentativeDetailsType {

    @XmlElement(name = "FullNameDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected FullNameDetailsType fullNameDetails;
    @XmlElement(name = "RoleCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String roleCode;

    /**
     * Gets the value of the fullNameDetails property.
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
     * Gets the value of the roleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * Sets the value of the roleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleCode(String value) {
        this.roleCode = value;
    }

}
