
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, пердставляющие сведения о товаре при завершении таможенной процедуры таможенного транзита
 * 
 * <p>Java class for TDGoodsItemInfoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDGoodsItemInfoDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CADTGoodsBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PartialDeliveryIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DischargeIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LossKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CargoPackagePalletDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ContainerListDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDGoodsItemInfoDetailsType", propOrder = {
    "partialDeliveryIndicator",
    "dischargeIndicator",
    "lossKindCode",
    "cargoPackagePalletDetails",
    "containerListDetails"
})
public class TDGoodsItemInfoDetailsType
    extends CADTGoodsBaseDetailsType
{

    @XmlElement(name = "PartialDeliveryIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean partialDeliveryIndicator;
    @XmlElement(name = "DischargeIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean dischargeIndicator;
    @XmlElement(name = "LossKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lossKindCode;
    @XmlElement(name = "CargoPackagePalletDetails")
    protected List<CargoPackagePalletDetailsType> cargoPackagePalletDetails;
    @XmlElement(name = "ContainerListDetails")
    protected List<ContainerListDetailsType> containerListDetails;

    /**
     * Gets the value of the partialDeliveryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartialDeliveryIndicator() {
        return partialDeliveryIndicator;
    }

    /**
     * Sets the value of the partialDeliveryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartialDeliveryIndicator(Boolean value) {
        this.partialDeliveryIndicator = value;
    }

    /**
     * Gets the value of the dischargeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDischargeIndicator() {
        return dischargeIndicator;
    }

    /**
     * Sets the value of the dischargeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDischargeIndicator(Boolean value) {
        this.dischargeIndicator = value;
    }

    /**
     * Gets the value of the lossKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLossKindCode() {
        return lossKindCode;
    }

    /**
     * Sets the value of the lossKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLossKindCode(String value) {
        this.lossKindCode = value;
    }

    /**
     * Gets the value of the cargoPackagePalletDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cargoPackagePalletDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCargoPackagePalletDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CargoPackagePalletDetailsType }
     * 
     * 
     */
    public List<CargoPackagePalletDetailsType> getCargoPackagePalletDetails() {
        if (cargoPackagePalletDetails == null) {
            cargoPackagePalletDetails = new ArrayList<CargoPackagePalletDetailsType>();
        }
        return this.cargoPackagePalletDetails;
    }

    /**
     * Gets the value of the containerListDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the containerListDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerListDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerListDetailsType }
     * 
     * 
     */
    public List<ContainerListDetailsType> getContainerListDetails() {
        if (containerListDetails == null) {
            containerListDetails = new ArrayList<ContainerListDetailsType>();
        }
        return this.containerListDetails;
    }

}
