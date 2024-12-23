
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.PackageKindCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие информацию о перечне контейнеров
 * 
 * <p>Java class for ContainerListDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContainerListDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PackageKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ContainerDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ContainerQuantity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContainerListDetailsType", propOrder = {
    "packageKindCode",
    "containerDetails",
    "containerQuantity"
})
public class ContainerListDetailsType {

    @XmlElement(name = "PackageKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected PackageKindCodeType packageKindCode;
    @XmlElement(name = "ContainerDetails", required = true)
    protected List<ContainerDetailsType> containerDetails;
    @XmlElement(name = "ContainerQuantity", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger containerQuantity;

    /**
     * Кодовое обозначение вида контейнера
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
     * Gets the value of the containerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the containerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContainerDetailsType }
     * 
     * 
     */
    public List<ContainerDetailsType> getContainerDetails() {
        if (containerDetails == null) {
            containerDetails = new ArrayList<ContainerDetailsType>();
        }
        return this.containerDetails;
    }

    /**
     * количество контейнеров одного вида
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContainerQuantity() {
        return containerQuantity;
    }

    /**
     * Sets the value of the containerQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContainerQuantity(BigInteger value) {
        this.containerQuantity = value;
    }

}
