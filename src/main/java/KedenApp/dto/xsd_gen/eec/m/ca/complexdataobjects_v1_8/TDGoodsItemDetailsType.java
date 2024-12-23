
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.AccountingAmountType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о товаре в транзитной декларации при взаимодействии между государствами-членами в рамках общего процесса
 * 
 * <p>Java class for TDGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADTGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProductCostAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDPackageDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ContainerListDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDGoodsItemDetailsType", propOrder = {
    "productCostAmount",
    "tdPackageDetails",
    "containerListDetails"
})
public class TDGoodsItemDetailsType
    extends CADTGoodsBaseDetailsType
{

    @XmlElement(name = "ProductCostAmount", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected AccountingAmountType productCostAmount;
    @XmlElement(name = "TDPackageDetails")
    protected List<TDPackageDetailsType> tdPackageDetails;
    @XmlElement(name = "ContainerListDetails")
    protected ContainerListDetailsType containerListDetails;

    /**
     * Стоимость товаров
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
     * Gets the value of the tdPackageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tdPackageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDPackageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDPackageDetailsType }
     * 
     * 
     */
    public List<TDPackageDetailsType> getTDPackageDetails() {
        if (tdPackageDetails == null) {
            tdPackageDetails = new ArrayList<TDPackageDetailsType>();
        }
        return this.tdPackageDetails;
    }

    /**
     * Gets the value of the containerListDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerListDetailsType }
     *     
     */
    public ContainerListDetailsType getContainerListDetails() {
        return containerListDetails;
    }

    /**
     * Sets the value of the containerListDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerListDetailsType }
     *     
     */
    public void setContainerListDetails(ContainerListDetailsType value) {
        this.containerListDetails = value;
    }

}
