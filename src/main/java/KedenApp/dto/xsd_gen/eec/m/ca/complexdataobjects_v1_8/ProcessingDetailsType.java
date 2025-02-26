
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, содержащие сведения о процедуре переработки товаров
 * 
 * <p>Java class for ProcessingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RateOfYieldText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsIdentificationMethodText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsSubstituteText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ProcessingOperationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ProcessingDocumentDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ProcessingSubjectDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ProcessingPlaceDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ProcessingProductDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingDetailsType", propOrder = {
    "rateOfYieldText",
    "goodsIdentificationMethodText",
    "goodsSubstituteText",
    "processingOperationDetails",
    "processingDocumentDetails",
    "processingSubjectDetails",
    "processingPlaceDetails",
    "processingProductDetails"
})
public class ProcessingDetailsType {

    @XmlElement(name = "RateOfYieldText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String rateOfYieldText;
    @XmlElement(name = "GoodsIdentificationMethodText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String goodsIdentificationMethodText;
    @XmlElement(name = "GoodsSubstituteText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String goodsSubstituteText;
    @XmlElement(name = "ProcessingOperationDetails")
    protected List<ProcessingOperationDetailsType> processingOperationDetails;
    @XmlElement(name = "ProcessingDocumentDetails")
    protected CADocBaseType processingDocumentDetails;
    @XmlElement(name = "ProcessingSubjectDetails")
    protected List<CASubjectDetailsType> processingSubjectDetails;
    @XmlElement(name = "ProcessingPlaceDetails")
    protected List<ProcessingPlaceDetailsType> processingPlaceDetails;
    @XmlElement(name = "ProcessingProductDetails")
    protected List<ProcessingProductDetailsType> processingProductDetails;

    /**
     * Gets the value of the rateOfYieldText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateOfYieldText() {
        return rateOfYieldText;
    }

    /**
     * Sets the value of the rateOfYieldText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateOfYieldText(String value) {
        this.rateOfYieldText = value;
    }

    /**
     * Gets the value of the goodsIdentificationMethodText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsIdentificationMethodText() {
        return goodsIdentificationMethodText;
    }

    /**
     * Sets the value of the goodsIdentificationMethodText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsIdentificationMethodText(String value) {
        this.goodsIdentificationMethodText = value;
    }

    /**
     * Gets the value of the goodsSubstituteText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodsSubstituteText() {
        return goodsSubstituteText;
    }

    /**
     * Sets the value of the goodsSubstituteText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodsSubstituteText(String value) {
        this.goodsSubstituteText = value;
    }

    /**
     * Gets the value of the processingOperationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the processingOperationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingOperationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingOperationDetailsType }
     * 
     * 
     */
    public List<ProcessingOperationDetailsType> getProcessingOperationDetails() {
        if (processingOperationDetails == null) {
            processingOperationDetails = new ArrayList<ProcessingOperationDetailsType>();
        }
        return this.processingOperationDetails;
    }

    /**
     * Сведения о предыдущем документе об условиях переработки
     * 
     * @return
     *     possible object is
     *     {@link CADocBaseType }
     *     
     */
    public CADocBaseType getProcessingDocumentDetails() {
        return processingDocumentDetails;
    }

    /**
     * Sets the value of the processingDocumentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CADocBaseType }
     *     
     */
    public void setProcessingDocumentDetails(CADocBaseType value) {
        this.processingDocumentDetails = value;
    }

    /**
     * Gets the value of the processingSubjectDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the processingSubjectDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingSubjectDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CASubjectDetailsType }
     * 
     * 
     */
    public List<CASubjectDetailsType> getProcessingSubjectDetails() {
        if (processingSubjectDetails == null) {
            processingSubjectDetails = new ArrayList<CASubjectDetailsType>();
        }
        return this.processingSubjectDetails;
    }

    /**
     * Gets the value of the processingPlaceDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the processingPlaceDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingPlaceDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingPlaceDetailsType }
     * 
     * 
     */
    public List<ProcessingPlaceDetailsType> getProcessingPlaceDetails() {
        if (processingPlaceDetails == null) {
            processingPlaceDetails = new ArrayList<ProcessingPlaceDetailsType>();
        }
        return this.processingPlaceDetails;
    }

    /**
     * Gets the value of the processingProductDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the processingProductDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessingProductDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessingProductDetailsType }
     * 
     * 
     */
    public List<ProcessingProductDetailsType> getProcessingProductDetails() {
        if (processingProductDetails == null) {
            processingProductDetails = new ArrayList<ProcessingProductDetailsType>();
        }
        return this.processingProductDetails;
    }

}
