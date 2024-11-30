
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedBankIdType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие детализированную информацию о банке
 * 
 * <p>Java class for BankDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BusinessEntityName"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedBankId"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}BankCorrAccountId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankDetailsType", propOrder = {
    "businessEntityName",
    "unifiedBankId",
    "bankCorrAccountId"
})
public class BankDetailsType {

    @XmlElement(name = "BusinessEntityName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String businessEntityName;
    @XmlElement(name = "UnifiedBankId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedBankIdType unifiedBankId;
    @XmlElement(name = "BankCorrAccountId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bankCorrAccountId;

    /**
     * Полное наименование банка
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

    /**
     * Gets the value of the unifiedBankId property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedBankIdType }
     *     
     */
    public UnifiedBankIdType getUnifiedBankId() {
        return unifiedBankId;
    }

    /**
     * Sets the value of the unifiedBankId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedBankIdType }
     *     
     */
    public void setUnifiedBankId(UnifiedBankIdType value) {
        this.unifiedBankId = value;
    }

    /**
     * Gets the value of the bankCorrAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCorrAccountId() {
        return bankCorrAccountId;
    }

    /**
     * Sets the value of the bankCorrAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCorrAccountId(String value) {
        this.bankCorrAccountId = value;
    }

}
