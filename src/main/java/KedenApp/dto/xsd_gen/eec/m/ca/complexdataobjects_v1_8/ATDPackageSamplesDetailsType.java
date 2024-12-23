
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.PackageKindCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения об упаковке, пояснениях и пломбах упаковки проб и (или) образцов товаров
 * 
 * <p>Java class for ATDPackageSamplesDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDPackageSamplesDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PackageKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PackageKindName" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}SealId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDPackageSamplesDetailsType", propOrder = {
    "packageKindCode",
    "packageKindName",
    "sealId",
    "descriptionText"
})
public class ATDPackageSamplesDetailsType {

    @XmlElement(name = "PackageKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected PackageKindCodeType packageKindCode;
    @XmlElement(name = "PackageKindName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> packageKindName;
    @XmlElement(name = "SealId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> sealId;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;

    /**
     * кодовое обозначение вида упаковки или упаковочного материала проб (образцов)
     * 
     * @return
     *     possible object is
     *     {@link PackageKindCodeType }
     *     
     */
    public PackageKindCodeType getPackageKindCode() {
        return packageKindCode;
    }

    /**
     * Sets the value of the packageKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageKindCodeType }
     *     
     */
    public void setPackageKindCode(PackageKindCodeType value) {
        this.packageKindCode = value;
    }

    /**
     * Gets the value of the packageKindName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the packageKindName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageKindName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackageKindName() {
        if (packageKindName == null) {
            packageKindName = new ArrayList<String>();
        }
        return this.packageKindName;
    }

    /**
     * Gets the value of the sealId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sealId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSealId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSealId() {
        if (sealId == null) {
            sealId = new ArrayList<String>();
        }
        return this.sealId;
    }

    /**
     * Сведения о пояснительных надписях, заверенных декларантом, иным лицом, обладающим полномочиями в отношении товаров
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

}
