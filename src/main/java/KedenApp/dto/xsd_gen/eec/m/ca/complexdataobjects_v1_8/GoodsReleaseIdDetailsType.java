
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о выпуске товаров
 * 
 * <p>Java class for GoodsReleaseIdDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsReleaseIdDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ReleaseIdDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsReleaseIdDetailsType", propOrder = {
    "eventDate",
    "releaseIdDetails"
})
public class GoodsReleaseIdDetailsType {

    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "ReleaseIdDetails", required = true)
    protected ReleaseIdDetailsType releaseIdDetails;

    /**
     * Дата выпуска товаров
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the releaseIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReleaseIdDetailsType }
     *     
     */
    public ReleaseIdDetailsType getReleaseIdDetails() {
        return releaseIdDetails;
    }

    /**
     * Sets the value of the releaseIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReleaseIdDetailsType }
     *     
     */
    public void setReleaseIdDetails(ReleaseIdDetailsType value) {
        this.releaseIdDetails = value;
    }

}
