
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о товаре в лицензии
 * 
 * <p>Java class for LicensedGoodsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LicensedGoodsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ConsignmentItemOrdinal"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LicenseAnnexOrdinal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicensedGoodsDetailsType", propOrder = {
    "consignmentItemOrdinal",
    "licenseAnnexOrdinal"
})
public class LicensedGoodsDetailsType {

    @XmlElement(name = "ConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger consignmentItemOrdinal;
    @XmlElement(name = "LicenseAnnexOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger licenseAnnexOrdinal;

    /**
     * Gets the value of the consignmentItemOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConsignmentItemOrdinal() {
        return consignmentItemOrdinal;
    }

    /**
     * Sets the value of the consignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConsignmentItemOrdinal(BigInteger value) {
        this.consignmentItemOrdinal = value;
    }

    /**
     * Gets the value of the licenseAnnexOrdinal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLicenseAnnexOrdinal() {
        return licenseAnnexOrdinal;
    }

    /**
     * Sets the value of the licenseAnnexOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLicenseAnnexOrdinal(BigInteger value) {
        this.licenseAnnexOrdinal = value;
    }

}
