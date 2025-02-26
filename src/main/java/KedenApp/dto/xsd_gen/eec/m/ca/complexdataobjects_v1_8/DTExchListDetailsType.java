
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
 * Сведения о регистрационном номере декларации на товары
 * 
 * <p>Java class for DTExchListDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTExchListDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTExchDeclarationIdDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProcessingResultV2Code" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTExchListDetailsType", propOrder = {
    "dtExchDeclarationIdDetails",
    "processingResultV2Code",
    "descriptionText"
})
public class DTExchListDetailsType {

    @XmlElement(name = "DTExchDeclarationIdDetails", required = true)
    protected DTExchDeclarationIdDetailsType dtExchDeclarationIdDetails;
    @XmlElement(name = "ProcessingResultV2Code", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String processingResultV2Code;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> descriptionText;

    /**
     * Регистрационный номер декларации на товары
     * 
     * @return
     *     possible object is
     *     {@link DTExchDeclarationIdDetailsType }
     *     
     */
    public DTExchDeclarationIdDetailsType getDTExchDeclarationIdDetails() {
        return dtExchDeclarationIdDetails;
    }

    /**
     * Sets the value of the dtExchDeclarationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DTExchDeclarationIdDetailsType }
     *     
     */
    public void setDTExchDeclarationIdDetails(DTExchDeclarationIdDetailsType value) {
        this.dtExchDeclarationIdDetails = value;
    }

    /**
     * Кодовое обозначение результата обработки сведений
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingResultV2Code() {
        return processingResultV2Code;
    }

    /**
     * Sets the value of the processingResultV2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingResultV2Code(String value) {
        this.processingResultV2Code = value;
    }

    /**
     * Описание результата обработки сведений в произвольной форме Gets the value of the descriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescriptionText() {
        if (descriptionText == null) {
            descriptionText = new ArrayList<String>();
        }
        return this.descriptionText;
    }

}
