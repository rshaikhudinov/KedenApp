
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.PeriodDetailsType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.Picture10MbType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения об образце оттиска печати компетентного органа, уполномоченного заверять сертификаты о происхождении товаров
 * 
 * <p>Java class for CAStampDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAStampDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}StampImagePicture"/&gt;
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
@XmlType(name = "CAStampDetailsType", propOrder = {
    "stampImagePicture",
    "periodDetails"
})
public class CAStampDetailsType {

    @XmlElement(name = "StampImagePicture", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected Picture10MbType stampImagePicture;
    @XmlElement(name = "PeriodDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected PeriodDetailsType periodDetails;

    /**
     * Изображение оттиска печати компетентного органа, уполномоченного заверять сертификаты о происхождении товаров
     * 
     * @return
     *     possible object is
     *     {@link Picture10MbType }
     *     
     */
    public Picture10MbType getStampImagePicture() {
        return stampImagePicture;
    }

    /**
     * Sets the value of the stampImagePicture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Picture10MbType }
     *     
     */
    public void setStampImagePicture(Picture10MbType value) {
        this.stampImagePicture = value;
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
