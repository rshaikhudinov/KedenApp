
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию об операторе
 * 
 * <p>Java class for OperatorDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatorDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}OperatorName"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedCountryCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}AuthorityId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BusinessEntityName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatorDetailsType", propOrder = {
    "operatorName",
    "unifiedCountryCode",
    "authorityId",
    "businessEntityName"
})
public class OperatorDetailsType {

    @XmlElement(name = "OperatorName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String operatorName;
    @XmlElement(name = "UnifiedCountryCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCountryCodeType unifiedCountryCode;
    @XmlElement(name = "AuthorityId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String authorityId;
    @XmlElement(name = "BusinessEntityName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessEntityName;

    /**
     * Gets the value of the operatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorName() {
        return operatorName;
    }

    /**
     * Sets the value of the operatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorName(String value) {
        this.operatorName = value;
    }

    /**
     * Кодовое обозначение страны
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
     * Cтрока символов, идентифицирующая уполномоченный орган государства-члена
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorityId() {
        return authorityId;
    }

    /**
     * Sets the value of the authorityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorityId(String value) {
        this.authorityId = value;
    }

    /**
     * Наименование уполномоченной организации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessEntityName() {
        return businessEntityName;
    }

    /**
     * Sets the value of the businessEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessEntityName(String value) {
        this.businessEntityName = value;
    }

}
