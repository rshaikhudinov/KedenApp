
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о грузовых местах, поддонах и упаковке товаров
 * 
 * <p>Java class for CargoPackagePalletDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CargoPackagePalletDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PackageAvailabilityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoPartQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoKindName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PackagePalletDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CargoPackagePalletDetailsType", propOrder = {
    "packageAvailabilityCode",
    "cargoQuantity",
    "cargoPartQuantity",
    "cargoKindName",
    "packagePalletDetails"
})
@XmlSeeAlso({
    PIVCargoPackagePalletDetailsType.class
})
public class CargoPackagePalletDetailsType {

    @XmlElement(name = "PackageAvailabilityCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String packageAvailabilityCode;
    @XmlElement(name = "CargoQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cargoQuantity;
    @XmlElement(name = "CargoPartQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cargoPartQuantity;
    @XmlElement(name = "CargoKindName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cargoKindName;
    @XmlElement(name = "PackagePalletDetails")
    protected List<PackagePalletDetailsType> packagePalletDetails;

    /**
     * Кодовое обозначение вида информации об упаковке товара
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageAvailabilityCode() {
        return packageAvailabilityCode;
    }

    /**
     * Sets the value of the packageAvailabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageAvailabilityCode(String value) {
        this.packageAvailabilityCode = value;
    }

    /**
     * общее количество грузовых мест, занятых товаром
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCargoQuantity() {
        return cargoQuantity;
    }

    /**
     * Sets the value of the cargoQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCargoQuantity(BigInteger value) {
        this.cargoQuantity = value;
    }

    /**
     * Gets the value of the cargoPartQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCargoPartQuantity() {
        return cargoPartQuantity;
    }

    /**
     * Sets the value of the cargoPartQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCargoPartQuantity(BigInteger value) {
        this.cargoPartQuantity = value;
    }

    /**
     * Gets the value of the cargoKindName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoKindName() {
        return cargoKindName;
    }

    /**
     * Sets the value of the cargoKindName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoKindName(String value) {
        this.cargoKindName = value;
    }

    /**
     * Gets the value of the packagePalletDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the packagePalletDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackagePalletDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackagePalletDetailsType }
     * 
     * 
     */
    public List<PackagePalletDetailsType> getPackagePalletDetails() {
        if (packagePalletDetails == null) {
            packagePalletDetails = new ArrayList<PackagePalletDetailsType>();
        }
        return this.packagePalletDetails;
    }

}
