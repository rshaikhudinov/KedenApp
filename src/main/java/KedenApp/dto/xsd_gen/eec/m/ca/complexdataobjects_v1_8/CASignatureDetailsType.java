
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.OfficerDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.PeriodDetailsType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.Picture10MbType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения об образце подписи лица, уполномоченного заверять сертификаты о происхождении товаров
 * 
 * <p>Java class for CASignatureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CASignatureDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SignatureImagePicture"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}OfficerDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}PeriodDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CASignatureDetailsType", propOrder = {
    "signatureImagePicture",
    "officerDetails",
    "periodDetails"
})
public class CASignatureDetailsType {

    @XmlElement(name = "SignatureImagePicture", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected Picture10MbType signatureImagePicture;
    @XmlElement(name = "OfficerDetails", required = true)
    protected OfficerDetailsType officerDetails;
    @XmlElement(name = "PeriodDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected PeriodDetailsType periodDetails;

    /**
     * Изображение подписи лица, уполномоченного заверять сертификаты о происхождении товаров
     * 
     * @return
     *     possible object is
     *     {@link Picture10MbType }
     *     
     */
    public Picture10MbType getSignatureImagePicture() {
        return signatureImagePicture;
    }

    /**
     * Sets the value of the signatureImagePicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Picture10MbType }
     *     
     */
    public void setSignatureImagePicture(Picture10MbType value) {
        this.signatureImagePicture = value;
    }

    /**
     * Структурированные сведения о должностном лице, заверяющем сертификаты о происхождении товаров
     * 
     * @return
     *     possible object is
     *     {@link OfficerDetailsType }
     *     
     */
    public OfficerDetailsType getOfficerDetails() {
        return officerDetails;
    }

    /**
     * Sets the value of the officerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfficerDetailsType }
     *     
     */
    public void setOfficerDetails(OfficerDetailsType value) {
        this.officerDetails = value;
    }

    /**
     * Gets the value of the periodDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodDetailsType }
     *     
     */
    public PeriodDetailsType getPeriodDetails() {
        return periodDetails;
    }

    /**
     * Sets the value of the periodDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodDetailsType }
     *     
     */
    public void setPeriodDetails(PeriodDetailsType value) {
        this.periodDetails = value;
    }

}
