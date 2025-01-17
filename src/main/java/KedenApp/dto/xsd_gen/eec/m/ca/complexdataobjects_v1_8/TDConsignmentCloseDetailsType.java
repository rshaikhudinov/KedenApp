
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о товарной партии при закрытии транзита
 * 
 * <p>Java class for TDConsignmentCloseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDConsignmentCloseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}BillOfLandingOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DischargeIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ContainerListDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDGoodsItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDConsignmentCloseDetailsType", propOrder = {
    "billOfLandingOrdinal",
    "dischargeIndicator",
    "containerListDetails",
    "tdGoodsItemDetails"
})
public class TDConsignmentCloseDetailsType {

    @XmlElement(name = "BillOfLandingOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger billOfLandingOrdinal;
    @XmlElement(name = "DischargeIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean dischargeIndicator;
    @XmlElement(name = "ContainerListDetails")
    protected List<ContainerListDetailsType> containerListDetails;
    @XmlElement(name = "TDGoodsItemDetails")
    protected List<TDGoodsItemDetailsType> tdGoodsItemDetails;

    /**
     * Порядковый номер накладной
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBillOfLandingOrdinal() {
        return billOfLandingOrdinal;
    }

    /**
     * Sets the value of the billOfLandingOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBillOfLandingOrdinal(BigInteger value) {
        this.billOfLandingOrdinal = value;
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

    /**
     * Gets the value of the tdGoodsItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tdGoodsItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTDGoodsItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TDGoodsItemDetailsType }
     * 
     * 
     */
    public List<TDGoodsItemDetailsType> getTDGoodsItemDetails() {
        if (tdGoodsItemDetails == null) {
            tdGoodsItemDetails = new ArrayList<TDGoodsItemDetailsType>();
        }
        return this.tdGoodsItemDetails;
    }

}
