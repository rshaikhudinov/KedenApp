
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о вычетах, включенных в основу для расчета таможенной стоимости
 * 
 * <p>Java class for Method1DeductionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Method1DeductionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}AssemblyValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportValueAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}UnionTaxPaymentAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalAmount"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Method1DeductionDetailsType", propOrder = {
    "assemblyValueAmount",
    "transportValueAmount",
    "unionTaxPaymentAmount",
    "totalAmount"
})
public class Method1DeductionDetailsType {

    @XmlElement(name = "AssemblyValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType assemblyValueAmount;
    @XmlElement(name = "TransportValueAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType transportValueAmount;
    @XmlElement(name = "UnionTaxPaymentAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected PaymentAmountWithCurrencyType unionTaxPaymentAmount;
    @XmlElement(name = "TotalAmount", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected PaymentAmountWithCurrencyType totalAmount;

    /**
     * величина расходов на производимые после ввоза товаров на таможенную территорию Евразийского экономического союза строительство, возведение, сборку, монтаж, обслуживание или оказание технического содействия в отношении таких товаров, как промышленные установки, машины или оборудование
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getAssemblyValueAmount() {
        return assemblyValueAmount;
    }

    /**
     * Sets the value of the assemblyValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setAssemblyValueAmount(PaymentAmountWithCurrencyType value) {
        this.assemblyValueAmount = value;
    }

    /**
     * Величина расходов на перевозку (транспортировку) ввозимых товаров по таможенной территории Евразийского экономического союза от места прибытия таких товаров на таможенную территорию Евразийского экономического союза или от иного места, определенного Евразийской экономической комиссией
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getTransportValueAmount() {
        return transportValueAmount;
    }

    /**
     * Sets the value of the transportValueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setTransportValueAmount(PaymentAmountWithCurrencyType value) {
        this.transportValueAmount = value;
    }

    /**
     * Сумма пошлин, налогов и сборов, уплачиваемых в связи с ввозом товаров на таможенную территорию Евразийского экономического союза или продажей таких товаров на таможенной территории Евразийского экономического союза
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public PaymentAmountWithCurrencyType getUnionTaxPaymentAmount() {
        return unionTaxPaymentAmount;
    }

    /**
     * Sets the value of the unionTaxPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmountWithCurrencyType }
     *     
     */
    public void setUnionTaxPaymentAmount(PaymentAmountWithCurrencyType value) {
        this.unionTaxPaymentAmount = value;
    }

    /**
     * Величина вычетов в валюте государства-члена
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

}
