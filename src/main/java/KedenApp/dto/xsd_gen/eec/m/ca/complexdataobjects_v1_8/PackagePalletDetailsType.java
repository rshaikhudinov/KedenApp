
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.PackageKindCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Сведения о грузе, таре, упаковке, поддоне
 * 
 * <p>Java class for PackagePalletDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagePalletDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}InformationKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PackageKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PackageQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CargoDescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackagePalletDetailsType", propOrder = {
    "informationKindCode",
    "packageKindCode",
    "packageQuantity",
    "cargoDescriptionText"
})
@XmlSeeAlso({
    TDPackageDetailsType.class
})
public class PackagePalletDetailsType {

    @XmlElement(name = "InformationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String informationKindCode;
    @XmlElement(name = "PackageKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected PackageKindCodeType packageKindCode;
    @XmlElement(name = "PackageQuantity", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger packageQuantity;
    @XmlElement(name = "CargoDescriptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> cargoDescriptionText;

    /**
     * Кодовое обозначение вида информации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationKindCode() {
        return informationKindCode;
    }

    /**
     * Sets the value of the informationKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationKindCode(String value) {
        this.informationKindCode = value;
    }

    /**
     * Gets the value of the packageKindCode property.
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
     * количество упаковок, поддонов
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageQuantity() {
        return packageQuantity;
    }

    /**
     * Sets the value of the packageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageQuantity(BigInteger value) {
        this.packageQuantity = value;
    }

    /**
     * описание груза, поддона, грузового места или маркировки товара Gets the value of the cargoDescriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cargoDescriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCargoDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCargoDescriptionText() {
        if (cargoDescriptionText == null) {
            cargoDescriptionText = new ArrayList<String>();
        }
        return this.cargoDescriptionText;
    }

}
