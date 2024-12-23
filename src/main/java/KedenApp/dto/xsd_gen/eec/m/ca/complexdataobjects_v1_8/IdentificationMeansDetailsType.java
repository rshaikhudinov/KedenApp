
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
 * Компоненты, представляющие сведения о средствах идентификации, нанесенных на товар, подлежащий маркировке средствами идентификации
 * 
 * <p>Java class for IdentificationMeansDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationMeansDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}AggregationKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}IdentificationMeansListDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}IdentificationMeansRangeDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}IdentifacationMeansCustomsId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationMeansDetailsType", propOrder = {
    "aggregationKindCode",
    "identificationMeansListDetails",
    "identificationMeansRangeDetails",
    "identifacationMeansCustomsId"
})
public class IdentificationMeansDetailsType {

    @XmlElement(name = "AggregationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String aggregationKindCode;
    @XmlElement(name = "IdentificationMeansListDetails")
    protected IdentificationMeansListDetailsType identificationMeansListDetails;
    @XmlElement(name = "IdentificationMeansRangeDetails")
    protected List<IdentificationMeansRangeDetailsType> identificationMeansRangeDetails;
    @XmlElement(name = "IdentifacationMeansCustomsId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> identifacationMeansCustomsId;

    /**
     * кодовое обозначение уровня маркировки товаров средствами идентификации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregationKindCode() {
        return aggregationKindCode;
    }

    /**
     * Sets the value of the aggregationKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregationKindCode(String value) {
        this.aggregationKindCode = value;
    }

    /**
     * перечень идентификационных номеров (идентификаторов) или кодов идентификации
     * 
     * @return
     *     possible object is
     *     {@link IdentificationMeansListDetailsType }
     *     
     */
    public IdentificationMeansListDetailsType getIdentificationMeansListDetails() {
        return identificationMeansListDetails;
    }

    /**
     * Sets the value of the identificationMeansListDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationMeansListDetailsType }
     *     
     */
    public void setIdentificationMeansListDetails(IdentificationMeansListDetailsType value) {
        this.identificationMeansListDetails = value;
    }

    /**
     * сведения о диапазоне значений идентификационных номеров (идентификаторов) или кодов идентификации Gets the value of the identificationMeansRangeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the identificationMeansRangeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificationMeansRangeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationMeansRangeDetailsType }
     * 
     * 
     */
    public List<IdentificationMeansRangeDetailsType> getIdentificationMeansRangeDetails() {
        if (identificationMeansRangeDetails == null) {
            identificationMeansRangeDetails = new ArrayList<IdentificationMeansRangeDetailsType>();
        }
        return this.identificationMeansRangeDetails;
    }

    /**
     * Gets the value of the identifacationMeansCustomsId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the identifacationMeansCustomsId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifacationMeansCustomsId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentifacationMeansCustomsId() {
        if (identifacationMeansCustomsId == null) {
            identifacationMeansCustomsId = new ArrayList<String>();
        }
        return this.identifacationMeansCustomsId;
    }

}
