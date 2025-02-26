
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о декларанте товаров при заполнении пассажирской таможенной декларации
 * 
 * <p>Java class for PDDeclarantDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDDeclarantDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CAPersonDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BirthDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADocDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DepartureCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DestinationCountryDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDDeclarantDetailsType", propOrder = {
    "birthDate",
    "caDocDetails",
    "departureCountryDetails",
    "destinationCountryDetails"
})
public class PDDeclarantDetailsType
    extends CAPersonDetailsType
{

    @XmlElement(name = "BirthDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "CADocDetails")
    protected CADocDetailsType caDocDetails;
    @XmlElement(name = "DepartureCountryDetails")
    protected CACountryDetailsType departureCountryDetails;
    @XmlElement(name = "DestinationCountryDetails")
    protected CACountryDetailsType destinationCountryDetails;

    /**
     * Дата рождения
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Сведения о визе (документе, подтверждающем право лица на пребывание (проживание) на территории государства-члена)
     * 
     * @return
     *     possible object is
     *     {@link CADocDetailsType }
     *     
     */
    public CADocDetailsType getCADocDetails() {
        return caDocDetails;
    }

    /**
     * Sets the value of the caDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CADocDetailsType }
     *     
     */
    public void setCADocDetails(CADocDetailsType value) {
        this.caDocDetails = value;
    }

    /**
     * Gets the value of the departureCountryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryDetailsType }
     *     
     */
    public CACountryDetailsType getDepartureCountryDetails() {
        return departureCountryDetails;
    }

    /**
     * Sets the value of the departureCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryDetailsType }
     *     
     */
    public void setDepartureCountryDetails(CACountryDetailsType value) {
        this.departureCountryDetails = value;
    }

    /**
     * Gets the value of the destinationCountryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryDetailsType }
     *     
     */
    public CACountryDetailsType getDestinationCountryDetails() {
        return destinationCountryDetails;
    }

    /**
     * Sets the value of the destinationCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryDetailsType }
     *     
     */
    public void setDestinationCountryDetails(CACountryDetailsType value) {
        this.destinationCountryDetails = value;
    }

}
