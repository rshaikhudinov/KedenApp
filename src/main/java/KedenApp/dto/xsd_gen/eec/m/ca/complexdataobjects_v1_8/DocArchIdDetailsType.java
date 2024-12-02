
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Идентификаторы, присвоенные документу (сведениям) при размещении в хранилище электронных документов
 * 
 * <p>Java class for DocArchIdDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocArchIdDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EArchId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EDocArchId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocArchIdDetailsType", propOrder = {
    "eArchId",
    "eDocArchId"
})
public class DocArchIdDetailsType {

    @XmlElement(name = "EArchId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eArchId;
    @XmlElement(name = "EDocArchId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eDocArchId;

    /**
     * Gets the value of the eArchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEArchId() {
        return eArchId;
    }

    /**
     * Sets the value of the eArchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEArchId(String value) {
        this.eArchId = value;
    }

    /**
     * Gets the value of the eDocArchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDocArchId() {
        return eDocArchId;
    }

    /**
     * Sets the value of the eDocArchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDocArchId(String value) {
        this.eDocArchId = value;
    }

}