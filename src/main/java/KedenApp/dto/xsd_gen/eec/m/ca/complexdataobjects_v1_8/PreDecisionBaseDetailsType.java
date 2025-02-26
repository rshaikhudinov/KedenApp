
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsProcedureCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * сведения о предварительном решении, предназначенные для публикации в общем информационном ресурсе
 * 
 * <p>Java class for PreDecisionBaseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreDecisionBaseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CustomsOfficeName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsProcedureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PreDecisionIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CommodityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OriginCountryDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PreDecisionGoodsDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PreDecisionJustificationDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ServiceMarkText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AdditionalInfoText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreDecisionBaseDetailsType", propOrder = {
    "unifiedCountryCode",
    "customsOfficeCode",
    "customsOfficeName",
    "customsProcedureCode",
    "preDecisionIdDetails",
    "commodityCode",
    "originCountryDetails",
    "preDecisionGoodsDetails",
    "preDecisionJustificationDetails",
    "serviceMarkText",
    "additionalInfoText"
})
public class PreDecisionBaseDetailsType {

    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "CustomsOfficeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeCode;
    @XmlElement(name = "CustomsOfficeName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customsOfficeName;
    @XmlElement(name = "CustomsProcedureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CustomsProcedureCodeType customsProcedureCode;
    @XmlElement(name = "PreDecisionIdDetails", required = true)
    protected PreDecisionIdDetailsType preDecisionIdDetails;
    @XmlElement(name = "CommodityCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commodityCode;
    @XmlElement(name = "OriginCountryDetails")
    protected CACountryDetailsType originCountryDetails;
    @XmlElement(name = "PreDecisionGoodsDetails", required = true)
    protected PreDecisionGoodsDetailsType preDecisionGoodsDetails;
    @XmlElement(name = "PreDecisionJustificationDetails")
    protected PreDecisionJustificationDetailsType preDecisionJustificationDetails;
    @XmlElement(name = "ServiceMarkText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> serviceMarkText;
    @XmlElement(name = "AdditionalInfoText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> additionalInfoText;

    /**
     * код страны, в которой принято предварительное решение
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public UnifiedCountryCodeType getUnifiedCountryCode() {
        return unifiedCountryCode;
    }

    /**
     * Sets the value of the unifiedCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCountryCodeType }
     *     
     */
    public void setUnifiedCountryCode(UnifiedCountryCodeType value) {
        this.unifiedCountryCode = value;
    }

    /**
     * Gets the value of the customsOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOfficeCode() {
        return customsOfficeCode;
    }

    /**
     * Sets the value of the customsOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOfficeCode(String value) {
        this.customsOfficeCode = value;
    }

    /**
     * Gets the value of the customsOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsOfficeName() {
        return customsOfficeName;
    }

    /**
     * Sets the value of the customsOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsOfficeName(String value) {
        this.customsOfficeName = value;
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
     * Gets the value of the preDecisionIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PreDecisionIdDetailsType }
     *     
     */
    public PreDecisionIdDetailsType getPreDecisionIdDetails() {
        return preDecisionIdDetails;
    }

    /**
     * Sets the value of the preDecisionIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreDecisionIdDetailsType }
     *     
     */
    public void setPreDecisionIdDetails(PreDecisionIdDetailsType value) {
        this.preDecisionIdDetails = value;
    }

    /**
     * кодовое обозначение группы (класса) товаров в соответствии с ТН ВЭД ЕАЭС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * Gets the value of the originCountryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CACountryDetailsType }
     *     
     */
    public CACountryDetailsType getOriginCountryDetails() {
        return originCountryDetails;
    }

    /**
     * Sets the value of the originCountryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CACountryDetailsType }
     *     
     */
    public void setOriginCountryDetails(CACountryDetailsType value) {
        this.originCountryDetails = value;
    }

    /**
     * сведения о товаре
     * в предварительном решении
     * 
     * @return
     *     possible object is
     *     {@link PreDecisionGoodsDetailsType }
     *     
     */
    public PreDecisionGoodsDetailsType getPreDecisionGoodsDetails() {
        return preDecisionGoodsDetails;
    }

    /**
     * Sets the value of the preDecisionGoodsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreDecisionGoodsDetailsType }
     *     
     */
    public void setPreDecisionGoodsDetails(PreDecisionGoodsDetailsType value) {
        this.preDecisionGoodsDetails = value;
    }

    /**
     * Gets the value of the preDecisionJustificationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PreDecisionJustificationDetailsType }
     *     
     */
    public PreDecisionJustificationDetailsType getPreDecisionJustificationDetails() {
        return preDecisionJustificationDetails;
    }

    /**
     * Sets the value of the preDecisionJustificationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreDecisionJustificationDetailsType }
     *     
     */
    public void setPreDecisionJustificationDetails(PreDecisionJustificationDetailsType value) {
        this.preDecisionJustificationDetails = value;
    }

    /**
     * Gets the value of the serviceMarkText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the serviceMarkText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceMarkText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceMarkText() {
        if (serviceMarkText == null) {
            serviceMarkText = new ArrayList<String>();
        }
        return this.serviceMarkText;
    }

    /**
     * Gets the value of the additionalInfoText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfoText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfoText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalInfoText() {
        if (additionalInfoText == null) {
            additionalInfoText = new ArrayList<String>();
        }
        return this.additionalInfoText;
    }

}
