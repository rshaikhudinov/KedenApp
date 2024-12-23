
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransitProcedureCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о перевозке товаров
 * 
 * <p>Java class for PIATMainConsignmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIATMainConsignmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TIRCarnetIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TIRCarnetIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DeclarationKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitProcedureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitFeatureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsIdentificationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PITransitTransportMeansDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitDestinationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PITranshipmentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIATConsignmentDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitGuaranteeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PITransitDeclarantDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIUnionCarrierDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIATMainConsignmentDetailsType", propOrder = {
    "tirCarnetIndicator",
    "tirCarnetIdDetails",
    "declarationKindCode",
    "transitProcedureCode",
    "transitFeatureCode",
    "goodsQuantity",
    "cargoQuantity",
    "totalAmount",
    "customsIdentificationDetails",
    "piTransitTransportMeansDetails",
    "transitDestinationDetails",
    "piTranshipmentDetails",
    "piatConsignmentDetails",
    "transitGuaranteeDetails",
    "piTransitDeclarantDetails",
    "piUnionCarrierDetails"
})
public class PIATMainConsignmentDetailsType {

    @XmlElement(name = "TIRCarnetIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean tirCarnetIndicator;
    @XmlElement(name = "TIRCarnetIdDetails")
    protected TIRCarnetIdDetailsType tirCarnetIdDetails;
    @XmlElement(name = "DeclarationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String declarationKindCode;
    @XmlElement(name = "TransitProcedureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected TransitProcedureCodeType transitProcedureCode;
    @XmlElement(name = "TransitFeatureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transitFeatureCode;
    @XmlElement(name = "GoodsQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger goodsQuantity;
    @XmlElement(name = "CargoQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cargoQuantity;
    @XmlElement(name = "TotalAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType totalAmount;
    @XmlElement(name = "CustomsIdentificationDetails")
    protected CustomsIdentificationDetailsType customsIdentificationDetails;
    @XmlElement(name = "PITransitTransportMeansDetails")
    protected PITransitTransportMeansDetailsType piTransitTransportMeansDetails;
    @XmlElement(name = "TransitDestinationDetails")
    protected TransitDestinationDetailsType transitDestinationDetails;
    @XmlElement(name = "PITranshipmentDetails")
    protected List<PITranshipmentDetailsType> piTranshipmentDetails;
    @XmlElement(name = "PIATConsignmentDetails", required = true)
    protected List<PIATConsignmentDetailsType> piatConsignmentDetails;
    @XmlElement(name = "TransitGuaranteeDetails")
    protected List<TransitGuaranteeDetailsType> transitGuaranteeDetails;
    @XmlElement(name = "PITransitDeclarantDetails")
    protected PITransitDeclarantDetailsType piTransitDeclarantDetails;
    @XmlElement(name = "PIUnionCarrierDetails")
    protected CarrierDetailsType piUnionCarrierDetails;

    /**
     * Gets the value of the tirCarnetIndicator property.
     * 
     */
    public Boolean isTIRCarnetIndicator() {
        return tirCarnetIndicator;
    }

    /**
     * Sets the value of the tirCarnetIndicator property.
     * 
     */
    public void setTIRCarnetIndicator(Boolean value) {
        this.tirCarnetIndicator = value;
    }

    /**
     * Gets the value of the tirCarnetIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TIRCarnetIdDetailsType }
     *     
     */
    public TIRCarnetIdDetailsType getTIRCarnetIdDetails() {
        return tirCarnetIdDetails;
    }

    /**
     * Sets the value of the tirCarnetIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TIRCarnetIdDetailsType }
     *     
     */
    public void setTIRCarnetIdDetails(TIRCarnetIdDetailsType value) {
        this.tirCarnetIdDetails = value;
    }

    /**
     * код типа таможенной декларации
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
     * Gets the value of the transitFeatureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransitFeatureCode() {
        return transitFeatureCode;
    }

    /**
     * Sets the value of the transitFeatureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransitFeatureCode(String value) {
        this.transitFeatureCode = value;
    }

    /**
     * Общее число товаров по транспортному (перевозочному) документу
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
     * Общее количество грузовых мест
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCargoQuantity() {
        return cargoQuantity;
    }

    /**
     * Sets the value of the cargoQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCargoQuantity(BigInteger value) {
        this.cargoQuantity = value;
    }

    /**
     * Общая стоимость товаров
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setTotalAmount(PaymentAmountWithCurrencyType value) {
        this.totalAmount = value;
    }

    /**
     * Сведения о средствах идентификации
     * 
     * @return
     *     possible object is
     *     {@link CustomsIdentificationDetailsType }
     *     
     */
    public CustomsIdentificationDetailsType getCustomsIdentificationDetails() {
        return customsIdentificationDetails;
    }

    /**
     * Sets the value of the customsIdentificationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsIdentificationDetailsType }
     *     
     */
    public void setCustomsIdentificationDetails(CustomsIdentificationDetailsType value) {
        this.customsIdentificationDetails = value;
    }

    /**
     * Gets the value of the piTransitTransportMeansDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PITransitTransportMeansDetailsType }
     *     
     */
    public PITransitTransportMeansDetailsType getPITransitTransportMeansDetails() {
        return piTransitTransportMeansDetails;
    }

    /**
     * Sets the value of the piTransitTransportMeansDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PITransitTransportMeansDetailsType }
     *     
     */
    public void setPITransitTransportMeansDetails(PITransitTransportMeansDetailsType value) {
        this.piTransitTransportMeansDetails = value;
    }

    /**
     * сведения о предполагаемом таможенном органе и пункте назначения при осуществлении перевозки товаров в соответствии с таможенной процедурой таможенного транзита
     * 
     * @return
     *     possible object is
     *     {@link TransitDestinationDetailsType }
     *     
     */
    public TransitDestinationDetailsType getTransitDestinationDetails() {
        return transitDestinationDetails;
    }

    /**
     * Sets the value of the transitDestinationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitDestinationDetailsType }
     *     
     */
    public void setTransitDestinationDetails(TransitDestinationDetailsType value) {
        this.transitDestinationDetails = value;
    }

    /**
     * сведения о планируемых грузовых операциях Gets the value of the piTranshipmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piTranshipmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPITranshipmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PITranshipmentDetailsType }
     * 
     * 
     */
    public List<PITranshipmentDetailsType> getPITranshipmentDetails() {
        if (piTranshipmentDetails == null) {
            piTranshipmentDetails = new ArrayList<PITranshipmentDetailsType>();
        }
        return this.piTranshipmentDetails;
    }

    /**
     * Gets the value of the piatConsignmentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piatConsignmentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIATConsignmentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIATConsignmentDetailsType }
     * 
     * 
     */
    public List<PIATConsignmentDetailsType> getPIATConsignmentDetails() {
        if (piatConsignmentDetails == null) {
            piatConsignmentDetails = new ArrayList<PIATConsignmentDetailsType>();
        }
        return this.piatConsignmentDetails;
    }

    /**
     * Gets the value of the transitGuaranteeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transitGuaranteeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitGuaranteeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitGuaranteeDetailsType }
     * 
     * 
     */
    public List<TransitGuaranteeDetailsType> getTransitGuaranteeDetails() {
        if (transitGuaranteeDetails == null) {
            transitGuaranteeDetails = new ArrayList<TransitGuaranteeDetailsType>();
        }
        return this.transitGuaranteeDetails;
    }

    /**
     * Gets the value of the piTransitDeclarantDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PITransitDeclarantDetailsType }
     *     
     */
    public PITransitDeclarantDetailsType getPITransitDeclarantDetails() {
        return piTransitDeclarantDetails;
    }

    /**
     * Sets the value of the piTransitDeclarantDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PITransitDeclarantDetailsType }
     *     
     */
    public void setPITransitDeclarantDetails(PITransitDeclarantDetailsType value) {
        this.piTransitDeclarantDetails = value;
    }

    /**
     * Сведения о перевозчике, осуществляющем перевозку товаров по таможенной территории Евразийского экономического союза, в том числе в соответствии с таможенной процедурой таможенного транзита
     * 
     * @return
     *     possible object is
     *     {@link CarrierDetailsType }
     *     
     */
    public CarrierDetailsType getPIUnionCarrierDetails() {
        return piUnionCarrierDetails;
    }

    /**
     * Sets the value of the piUnionCarrierDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierDetailsType }
     *     
     */
    public void setPIUnionCarrierDetails(CarrierDetailsType value) {
        this.piUnionCarrierDetails = value;
    }

}
