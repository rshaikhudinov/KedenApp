
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithNCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о размере обеспечения при расчете размера обеспечения обязанностей по уплате
 * 
 * <p>Java class for PGCGuaranteeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PGCGuaranteeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PGCGuaranteeAmountDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalGuaranteeNAmount" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PGCGuaranteeDetailsType", propOrder = {
    "pgcGuaranteeAmountDetails",
    "totalGuaranteeNAmount"
})
public class PGCGuaranteeDetailsType {

    @XmlElement(name = "PGCGuaranteeAmountDetails", required = true)
    protected List<PGCGuaranteeAmountDetailsType> pgcGuaranteeAmountDetails;
    @XmlElement(name = "TotalGuaranteeNAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected List<PaymentAmountWithNCurrencyType> totalGuaranteeNAmount;

    /**
     * Gets the value of the pgcGuaranteeAmountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pgcGuaranteeAmountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPGCGuaranteeAmountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PGCGuaranteeAmountDetailsType }
     * 
     * 
     */
    public List<PGCGuaranteeAmountDetailsType> getPGCGuaranteeAmountDetails() {
        if (pgcGuaranteeAmountDetails == null) {
            pgcGuaranteeAmountDetails = new ArrayList<PGCGuaranteeAmountDetailsType>();
        }
        return this.pgcGuaranteeAmountDetails;
    }

    /**
     * Общая сумма (размер) обеспечения Gets the value of the totalGuaranteeNAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the totalGuaranteeNAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalGuaranteeNAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentAmountWithNCurrencyType }
     * 
     * 
     */
    public List<PaymentAmountWithNCurrencyType> getTotalGuaranteeNAmount() {
        if (totalGuaranteeNAmount == null) {
            totalGuaranteeNAmount = new ArrayList<PaymentAmountWithNCurrencyType>();
        }
        return this.totalGuaranteeNAmount;
    }

}
