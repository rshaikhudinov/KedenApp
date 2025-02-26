
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения об обращении о корректировке пассажирской таможенной декларации
 * 
 * <p>Java class for PDCorrectionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDCorrectionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RefPassengerDeclarationIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDCorrectionDetailsType", propOrder = {
    "refPassengerDeclarationIdDetails",
    "descriptionText"
})
public class PDCorrectionDetailsType {

    @XmlElement(name = "RefPassengerDeclarationIdDetails", required = true)
    protected PassengerDeclarationIdDetailsType refPassengerDeclarationIdDetails;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected List<String> descriptionText;

    /**
     * Регистрационный номер пассажирской таможенной декларации, в которую вносятся изменения (дополнения)
     * 
     * @return
     *     possible object is
     *     {@link PassengerDeclarationIdDetailsType }
     *     
     */
    public PassengerDeclarationIdDetailsType getRefPassengerDeclarationIdDetails() {
        return refPassengerDeclarationIdDetails;
    }

    /**
     * Sets the value of the refPassengerDeclarationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerDeclarationIdDetailsType }
     *     
     */
    public void setRefPassengerDeclarationIdDetails(PassengerDeclarationIdDetailsType value) {
        this.refPassengerDeclarationIdDetails = value;
    }

    /**
     * Обоснование необходимости внесения изменений (дополнений) в пассажирскую таможенную декларацию Gets the value of the descriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescriptionText() {
        if (descriptionText == null) {
            descriptionText = new ArrayList<String>();
        }
        return this.descriptionText;
    }

}
