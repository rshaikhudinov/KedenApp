
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsProcedureCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Статистические сведения из декларации на товары
 * 
 * <p>Java class for DTStatDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTStatDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDeclarationIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DeclarationKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsProcedureCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DepartureCountryDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TradeCountryDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTStatGoodsDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTStatDetailsType", propOrder = {
    "customsDeclarationIdDetails",
    "declarationKindCode",
    "customsProcedureCode",
    "departureCountryDetails",
    "tradeCountryDetails",
    "dtStatGoodsDetails"
})
public class DTStatDetailsType {

    @XmlElement(name = "CustomsDeclarationIdDetails")
    protected CustomsDocumentIdDetailsType customsDeclarationIdDetails;
    @XmlElement(name = "DeclarationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String declarationKindCode;
    @XmlElement(name = "CustomsProcedureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsProcedureCodeType customsProcedureCode;
    @XmlElement(name = "DepartureCountryDetails", required = true)
    protected CACountryDetailsType departureCountryDetails;
    @XmlElement(name = "TradeCountryDetails", required = true)
    protected TradeCountryDetailsType tradeCountryDetails;
    @XmlElement(name = "DTStatGoodsDetails", required = true)
    protected List<DTStatGoodsDetailsType> dtStatGoodsDetails;

    /**
     * Gets the value of the customsDeclarationIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public CustomsDocumentIdDetailsType getCustomsDeclarationIdDetails() {
        return customsDeclarationIdDetails;
    }

    /**
     * Sets the value of the customsDeclarationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public void setCustomsDeclarationIdDetails(CustomsDocumentIdDetailsType value) {
        this.customsDeclarationIdDetails = value;
    }

    /**
     * Gets the value of the declarationKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarationKindCode() {
        return declarationKindCode;
    }

    /**
     * Sets the value of the declarationKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarationKindCode(String value) {
        this.declarationKindCode = value;
    }

    /**
     * Gets the value of the customsProcedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsProcedureCodeType }
     *     
     */
    public CustomsProcedureCodeType getCustomsProcedureCode() {
        return customsProcedureCode;
    }

    /**
     * Sets the value of the customsProcedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsProcedureCodeType }
     *     
     */
    public void setCustomsProcedureCode(CustomsProcedureCodeType value) {
        this.customsProcedureCode = value;
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
     * Gets the value of the tradeCountryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCountryDetailsType }
     *     
     */
    public TradeCountryDetailsType getTradeCountryDetails() {
        return tradeCountryDetails;
    }

    /**
     * Sets the value of the tradeCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCountryDetailsType }
     *     
     */
    public void setTradeCountryDetails(TradeCountryDetailsType value) {
        this.tradeCountryDetails = value;
    }

    /**
     * Gets the value of the dtStatGoodsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dtStatGoodsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDTStatGoodsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DTStatGoodsDetailsType }
     * 
     * 
     */
    public List<DTStatGoodsDetailsType> getDTStatGoodsDetails() {
        if (dtStatGoodsDetails == null) {
            dtStatGoodsDetails = new ArrayList<DTStatGoodsDetailsType>();
        }
        return this.dtStatGoodsDetails;
    }

}
