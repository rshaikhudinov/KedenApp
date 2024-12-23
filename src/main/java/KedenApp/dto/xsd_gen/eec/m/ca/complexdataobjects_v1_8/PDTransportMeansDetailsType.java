
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
 * Компоненты, представляющие детализированные сведения о транспортном средстве, декларируемом с использованием пассажирской таможенной декларации
 * 
 * <p>Java class for PDTransportMeansDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDTransportMeansDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PDTransferPurposeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TaxFreeIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDTransportMeansItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDSharePartItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDTransportMeansDetailsType", propOrder = {
    "pdTransferPurposeCode",
    "taxFreeIndicator",
    "pdTransportMeansItemDetails",
    "pdSharePartItemDetails"
})
public class PDTransportMeansDetailsType {

    @XmlElement(name = "PDTransferPurposeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pdTransferPurposeCode;
    @XmlElement(name = "TaxFreeIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean taxFreeIndicator;
    @XmlElement(name = "PDTransportMeansItemDetails")
    protected List<PDTransportMeansItemDetailsType> pdTransportMeansItemDetails;
    @XmlElement(name = "PDSharePartItemDetails")
    protected List<PDSharePartItemDetailsType> pdSharePartItemDetails;

    /**
     * Кодовое обозначение цели ввоза, вывоза или нахождения транспортных средств на таможенной территории Евразийского экономического союза
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDTransferPurposeCode() {
        return pdTransferPurposeCode;
    }

    /**
     * Sets the value of the pdTransferPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDTransferPurposeCode(String value) {
        this.pdTransferPurposeCode = value;
    }

    /**
     * Признак декларирования транспортных средств, ввозимых с освобождением от уплаты таможенных пошлин, налогов (ввоз со льготой)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxFreeIndicator() {
        return taxFreeIndicator;
    }

    /**
     * Sets the value of the taxFreeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxFreeIndicator(Boolean value) {
        this.taxFreeIndicator = value;
    }

    /**
     * Сведения о транспортном средстве Gets the value of the pdTransportMeansItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pdTransportMeansItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDTransportMeansItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDTransportMeansItemDetailsType }
     * 
     * 
     */
    public List<PDTransportMeansItemDetailsType> getPDTransportMeansItemDetails() {
        if (pdTransportMeansItemDetails == null) {
            pdTransportMeansItemDetails = new ArrayList<PDTransportMeansItemDetailsType>();
        }
        return this.pdTransportMeansItemDetails;
    }

    /**
     * Сведения о части транспортного средства, замененной в государстве, не являющемся членом Евразийского экономического союза Gets the value of the pdSharePartItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pdSharePartItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDSharePartItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDSharePartItemDetailsType }
     * 
     * 
     */
    public List<PDSharePartItemDetailsType> getPDSharePartItemDetails() {
        if (pdSharePartItemDetails == null) {
            pdSharePartItemDetails = new ArrayList<PDSharePartItemDetailsType>();
        }
        return this.pdSharePartItemDetails;
    }

}
