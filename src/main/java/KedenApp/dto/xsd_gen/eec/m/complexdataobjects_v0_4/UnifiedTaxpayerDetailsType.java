
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedTaxpayerIdType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Совокупность реквизитов, присвоенных налоговой службой юридическому или физическому лицу
 * 
 * <p>Java class for UnifiedTaxpayerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnifiedTaxpayerDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedTaxpayerId"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TaxRegistrationReasonCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnifiedTaxpayerDetailsType", propOrder = {
    "unifiedTaxpayerId",
    "taxRegistrationReasonCode"
})
public class UnifiedTaxpayerDetailsType {

    @XmlElement(name = "UnifiedTaxpayerId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected UnifiedTaxpayerIdType unifiedTaxpayerId;
    @XmlElement(name = "TaxRegistrationReasonCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String taxRegistrationReasonCode;

    /**
     * Gets the value of the unifiedTaxpayerId property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedTaxpayerIdType }
     *     
     */
    public UnifiedTaxpayerIdType getUnifiedTaxpayerId() {
        return unifiedTaxpayerId;
    }

    /**
     * Sets the value of the unifiedTaxpayerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedTaxpayerIdType }
     *     
     */
    public void setUnifiedTaxpayerId(UnifiedTaxpayerIdType value) {
        this.unifiedTaxpayerId = value;
    }

    /**
     * Gets the value of the taxRegistrationReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxRegistrationReasonCode() {
        return taxRegistrationReasonCode;
    }

    /**
     * Sets the value of the taxRegistrationReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxRegistrationReasonCode(String value) {
        this.taxRegistrationReasonCode = value;
    }

}
