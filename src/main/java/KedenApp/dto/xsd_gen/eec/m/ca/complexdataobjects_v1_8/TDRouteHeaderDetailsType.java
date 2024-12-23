
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransitProcedureCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о перевозке товаров при прохождении маршрутного таможенного органа
 * 
 * <p>Java class for TDRouteHeaderDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDRouteHeaderDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TDDeclarationKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitProcedureCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsQuantity"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedGrossMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RouteTransportDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDRouteHeaderDetailsType", propOrder = {
    "tdDeclarationKindCode",
    "transitProcedureCode",
    "goodsQuantity",
    "unifiedGrossMassMeasure",
    "routeTransportDetails"
})
public class TDRouteHeaderDetailsType {

    @XmlElement(name = "TDDeclarationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tdDeclarationKindCode;
    @XmlElement(name = "TransitProcedureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected TransitProcedureCodeType transitProcedureCode;
    @XmlElement(name = "GoodsQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger goodsQuantity;
    @XmlElement(name = "UnifiedGrossMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedGrossMassMeasure;
    @XmlElement(name = "RouteTransportDetails", required = true)
    protected CATransportMeansDetailsType routeTransportDetails;

    /**
     * Gets the value of the tdDeclarationKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTDDeclarationKindCode() {
        return tdDeclarationKindCode;
    }

    /**
     * Sets the value of the tdDeclarationKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTDDeclarationKindCode(String value) {
        this.tdDeclarationKindCode = value;
    }

    /**
     * Gets the value of the transitProcedureCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransitProcedureCodeType }
     *     
     */
    public TransitProcedureCodeType getTransitProcedureCode() {
        return transitProcedureCode;
    }

    /**
     * Sets the value of the transitProcedureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitProcedureCodeType }
     *     
     */
    public void setTransitProcedureCode(TransitProcedureCodeType value) {
        this.transitProcedureCode = value;
    }

    /**
     * Общее число товаров
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGoodsQuantity() {
        return goodsQuantity;
    }

    /**
     * Sets the value of the goodsQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGoodsQuantity(BigInteger value) {
        this.goodsQuantity = value;
    }

    /**
     * Общий вес брутто
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getUnifiedGrossMassMeasure() {
        return unifiedGrossMassMeasure;
    }

    /**
     * Sets the value of the unifiedGrossMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setUnifiedGrossMassMeasure(UnifiedPhysicalMeasureType value) {
        this.unifiedGrossMassMeasure = value;
    }

    /**
     * Gets the value of the routeTransportDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CATransportMeansDetailsType }
     *     
     */
    public CATransportMeansDetailsType getRouteTransportDetails() {
        return routeTransportDetails;
    }

    /**
     * Sets the value of the routeTransportDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CATransportMeansDetailsType }
     *     
     */
    public void setRouteTransportDetails(CATransportMeansDetailsType value) {
        this.routeTransportDetails = value;
    }

}
