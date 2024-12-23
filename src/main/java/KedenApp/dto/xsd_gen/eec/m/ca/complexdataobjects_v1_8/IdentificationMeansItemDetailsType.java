
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
 * Компоненты, представляющие сведения, размещенные на средстве идентификации
 * 
 * <p>Java class for IdentificationMeansItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationMeansItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}IdentificationMeansKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}IdentificationMeansDataUnitDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationMeansItemDetailsType", propOrder = {
    "identificationMeansKindCode",
    "identificationMeansDataUnitDetails"
})
public class IdentificationMeansItemDetailsType {

    @XmlElement(name = "IdentificationMeansKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identificationMeansKindCode;
    @XmlElement(name = "IdentificationMeansDataUnitDetails", required = true)
    protected List<IdentificationMeansDataUnitDetailsType> identificationMeansDataUnitDetails;

    /**
     * Кодовое обозначение вида средства идентификации, содержащего код идентификации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationMeansKindCode() {
        return identificationMeansKindCode;
    }

    /**
     * Sets the value of the identificationMeansKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationMeansKindCode(String value) {
        this.identificationMeansKindCode = value;
    }

    /**
     * символьное представление идентификационного номера (идентификатора) или блока информации, содержащейся в коде идентификации Gets the value of the identificationMeansDataUnitDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the identificationMeansDataUnitDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificationMeansDataUnitDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationMeansDataUnitDetailsType }
     * 
     * 
     */
    public List<IdentificationMeansDataUnitDetailsType> getIdentificationMeansDataUnitDetails() {
        if (identificationMeansDataUnitDetails == null) {
            identificationMeansDataUnitDetails = new ArrayList<IdentificationMeansDataUnitDetailsType>();
        }
        return this.identificationMeansDataUnitDetails;
    }

}
