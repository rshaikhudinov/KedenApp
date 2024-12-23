
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.AccountingAmountType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о компонентах товара при классификации товара в несобранном виде
 * 
 * <p>Java class for GoodsPartViewDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsPartViewDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADTGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProductCostAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GeneralContractDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SpecificationDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsPartViewDetailsType", propOrder = {
    "productCostAmount",
    "generalContractDetails",
    "specificationDetails"
})
public class GoodsPartViewDetailsType
    extends CADTGoodsBaseDetailsType
{

    @XmlElement(name = "ProductCostAmount", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected AccountingAmountType productCostAmount;
    @XmlElement(name = "GeneralContractDetails")
    protected CADocBaseType generalContractDetails;
    @XmlElement(name = "SpecificationDetails")
    protected CADocBaseType specificationDetails;

    /**
     * Gets the value of the productCostAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingAmountType }
     *     
     */
    public AccountingAmountType getProductCostAmount() {
        return productCostAmount;
    }

    /**
     * Sets the value of the productCostAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingAmountType }
     *     
     */
    public void setProductCostAmount(AccountingAmountType value) {
        this.productCostAmount = value;
    }

    /**
     * Реквизиты контракта
     * 
     * @return
     *     possible object is
     *     {@link CADocBaseType }
     *     
     */
    public CADocBaseType getGeneralContractDetails() {
        return generalContractDetails;
    }

    /**
     * Sets the value of the generalContractDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CADocBaseType }
     *     
     */
    public void setGeneralContractDetails(CADocBaseType value) {
        this.generalContractDetails = value;
    }

    /**
     * Gets the value of the specificationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CADocBaseType }
     *     
     */
    public CADocBaseType getSpecificationDetails() {
        return specificationDetails;
    }

    /**
     * Sets the value of the specificationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CADocBaseType }
     *     
     */
    public void setSpecificationDetails(CADocBaseType value) {
        this.specificationDetails = value;
    }

}
