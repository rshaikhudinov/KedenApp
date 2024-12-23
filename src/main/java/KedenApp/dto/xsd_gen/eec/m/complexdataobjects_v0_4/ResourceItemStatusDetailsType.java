
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие детализированную информацию о технологических характеристиках записи общего ресурса
 * 
 * <p>Java class for ResourceItemStatusDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceItemStatusDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}ValidityPeriodDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UpdateDateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceItemStatusDetailsType", propOrder = {
    "validityPeriodDetails",
    "updateDateTime"
})
public class ResourceItemStatusDetailsType {

    @XmlElement(name = "ValidityPeriodDetails")
    protected PeriodDetailsType validityPeriodDetails;
    @XmlElement(name = "UpdateDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updateDateTime;

    /**
     * Период действия записи общего ресурса (реестра, перечня, базы данных)
     * 
     * @return
     *     possible object is
     *     {@link PeriodDetailsType }
     *     
     */
    public PeriodDetailsType getValidityPeriodDetails() {
        return validityPeriodDetails;
    }

    /**
     * Sets the value of the validityPeriodDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDetailsType }
     *     
     */
    public void setValidityPeriodDetails(PeriodDetailsType value) {
        this.validityPeriodDetails = value;
    }

    /**
     * Дата и время обновления записи общего ресурса (реестра, перечня, базы данных)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * Sets the value of the updateDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDateTime(XMLGregorianCalendar value) {
        this.updateDateTime = value;
    }

}
