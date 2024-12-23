
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о товарной партии в транзитной декларации
 * 
 * <p>Java class for TDConsignmentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDConsignmentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}BillOfLandingOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDConsignmentDocDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ContainerListDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsigneeOrganizationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDGoodsItemDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ConsignorOrganizationDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDConsignmentDetailsType", propOrder = {
    "billOfLandingOrdinal",
    "tdConsignmentDocDetails",
    "containerListDetails",
    "consigneeOrganizationDetails",
    "tdGoodsItemDetails",
    "consignorOrganizationDetails"
})
public class TDConsignmentDetailsType {

    @XmlElement(name = "BillOfLandingOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger billOfLandingOrdinal;
    @XmlElement(name = "TDConsignmentDocDetails", required = true)
    protected DocDetailsV4Type tdConsignmentDocDetails;
    @XmlElement(name = "ContainerListDetails")
    protected List<ContainerListDetailsType> containerListDetails;
    @XmlElement(name = "ConsigneeOrganizationDetails", required = true)
    protected CustomsDocumentSubjectDetailsType consigneeOrganizationDetails;
    @XmlElement(name = "TDGoodsItemDetails", required = true)
    protected List<TDGoodsItemDetailsType> tdGoodsItemDetails;
    @XmlElement(name = "ConsignorOrganizationDetails")
    protected CABusinessEntityBranchDetailsType consignorOrganizationDetails;

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
     * Gets the value of the tdConsignmentDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getTDConsignmentDocDetails() {
        return tdConsignmentDocDetails;
    }

    /**
     * Sets the value of the tdConsignmentDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setTDConsignmentDocDetails(DocDetailsV4Type value) {
        this.tdConsignmentDocDetails = value;
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
     * Gets the value of the consigneeOrganizationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentSubjectDetailsType }
     *     
     */
    public CustomsDocumentSubjectDetailsType getConsigneeOrganizationDetails() {
        return consigneeOrganizationDetails;
    }

    /**
     * Sets the value of the consigneeOrganizationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentSubjectDetailsType }
     *     
     */
    public void setConsigneeOrganizationDetails(CustomsDocumentSubjectDetailsType value) {
        this.consigneeOrganizationDetails = value;
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

    /**
     * Gets the value of the consignorOrganizationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CABusinessEntityBranchDetailsType }
     *     
     */
    public CABusinessEntityBranchDetailsType getConsignorOrganizationDetails() {
        return consignorOrganizationDetails;
    }

    /**
     * Sets the value of the consignorOrganizationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CABusinessEntityBranchDetailsType }
     *     
     */
    public void setConsignorOrganizationDetails(CABusinessEntityBranchDetailsType value) {
        this.consignorOrganizationDetails = value;
    }

}
