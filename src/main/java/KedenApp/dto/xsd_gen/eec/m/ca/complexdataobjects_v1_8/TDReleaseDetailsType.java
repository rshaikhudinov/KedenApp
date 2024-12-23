
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о выпуске товаров в соответствии с таможенной процедурой таможенного транзита
 * 
 * <p>Java class for TDReleaseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDReleaseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DepartureCustomsOfficeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ReleaseDecisionDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDReleaseCustomsMarkDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDReleaseDetailsType", propOrder = {
    "departureCustomsOfficeCode",
    "releaseDecisionDetails",
    "tdReleaseCustomsMarkDetails"
})
public class TDReleaseDetailsType {

    @XmlElement(name = "DepartureCustomsOfficeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String departureCustomsOfficeCode;
    @XmlElement(name = "ReleaseDecisionDetails", required = true)
    protected GoodsReleaseDetailsType releaseDecisionDetails;
    @XmlElement(name = "TDReleaseCustomsMarkDetails", required = true)
    protected TDReleaseCustomsMarkDetailsType tdReleaseCustomsMarkDetails;

    /**
     * Gets the value of the departureCustomsOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCustomsOfficeCode() {
        return departureCustomsOfficeCode;
    }

    /**
     * Sets the value of the departureCustomsOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCustomsOfficeCode(String value) {
        this.departureCustomsOfficeCode = value;
    }

    /**
     * Сведения о решении о выпуске товаров
     * 
     * @return
     *     possible object is
     *     {@link GoodsReleaseDetailsType }
     *     
     */
    public GoodsReleaseDetailsType getReleaseDecisionDetails() {
        return releaseDecisionDetails;
    }

    /**
     * Sets the value of the releaseDecisionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsReleaseDetailsType }
     *     
     */
    public void setReleaseDecisionDetails(GoodsReleaseDetailsType value) {
        this.releaseDecisionDetails = value;
    }

    /**
     * Gets the value of the tdReleaseCustomsMarkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TDReleaseCustomsMarkDetailsType }
     *     
     */
    public TDReleaseCustomsMarkDetailsType getTDReleaseCustomsMarkDetails() {
        return tdReleaseCustomsMarkDetails;
    }

    /**
     * Sets the value of the tdReleaseCustomsMarkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDReleaseCustomsMarkDetailsType }
     *     
     */
    public void setTDReleaseCustomsMarkDetails(TDReleaseCustomsMarkDetailsType value) {
        this.tdReleaseCustomsMarkDetails = value;
    }

}
