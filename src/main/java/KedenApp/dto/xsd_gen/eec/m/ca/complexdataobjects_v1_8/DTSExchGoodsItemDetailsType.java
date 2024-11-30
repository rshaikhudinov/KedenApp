
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о товаре
 * 
 * <p>Java class for DTSExchGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTSExchGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ConsignmentItemOrdinal"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsValueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CVDMethod1CalculationDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTSExchGoodsItemDetailsType", propOrder = {
    "consignmentItemOrdinal",
    "customsValueDate",
    "cvdMethod1CalculationDetails"
})
public class DTSExchGoodsItemDetailsType {

    @XmlElement(name = "ConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger consignmentItemOrdinal;
    @XmlElement(name = "CustomsValueDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar customsValueDate;
    @XmlElement(name = "CVDMethod1CalculationDetails", required = true)
    protected CVDMethod1CalculationDetailsType cvdMethod1CalculationDetails;

    /**
     * номер товара по декларации на товары (списку)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsignmentItemOrdinal() {
        return consignmentItemOrdinal;
    }

    /**
     * Sets the value of the consignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsignmentItemOrdinal(BigInteger value) {
        this.consignmentItemOrdinal = value;
    }

    /**
     * Gets the value of the customsValueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomsValueDate() {
        return customsValueDate;
    }

    /**
     * Sets the value of the customsValueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomsValueDate(XMLGregorianCalendar value) {
        this.customsValueDate = value;
    }

    /**
     * Gets the value of the cvdMethod1CalculationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CVDMethod1CalculationDetailsType }
     *     
     */
    public CVDMethod1CalculationDetailsType getCVDMethod1CalculationDetails() {
        return cvdMethod1CalculationDetails;
    }

    /**
     * Sets the value of the cvdMethod1CalculationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CVDMethod1CalculationDetailsType }
     *     
     */
    public void setCVDMethod1CalculationDetails(CVDMethod1CalculationDetailsType value) {
        this.cvdMethod1CalculationDetails = value;
    }

}
