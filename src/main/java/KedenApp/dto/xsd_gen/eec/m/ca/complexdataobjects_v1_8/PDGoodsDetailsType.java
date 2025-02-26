
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
 * Компоненты, представляющие дополнительные сведения о товарах, указанных в пассажирской таможенной декларации
 * 
 * <p>Java class for PDGoodsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDGoodsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PDTransferPurposeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDDeclaredGoodsInfoDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDGoodsListDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDGoodsDetailsType", propOrder = {
    "pdTransferPurposeCode",
    "pdDeclaredGoodsInfoDetails",
    "pdGoodsListDetails"
})
public class PDGoodsDetailsType {

    @XmlElement(name = "PDTransferPurposeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String pdTransferPurposeCode;
    @XmlElement(name = "PDDeclaredGoodsInfoDetails")
    protected PDDeclaredGoodsCategoryDetailsType pdDeclaredGoodsInfoDetails;
    @XmlElement(name = "PDGoodsListDetails")
    protected List<PDGoodsListDetailsType> pdGoodsListDetails;

    /**
     * кодовое обозначение цели ввоза, вывоза или нахождения товаров на таможенной территории Евразийского экономического союза
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDTransferPurposeCode() {
        return pdTransferPurposeCode;
    }

    /**
     * Sets the value of the pdTransferPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDTransferPurposeCode(String value) {
        this.pdTransferPurposeCode = value;
    }

    /**
     * Gets the value of the pdDeclaredGoodsInfoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PDDeclaredGoodsCategoryDetailsType }
     *     
     */
    public PDDeclaredGoodsCategoryDetailsType getPDDeclaredGoodsInfoDetails() {
        return pdDeclaredGoodsInfoDetails;
    }

    /**
     * Sets the value of the pdDeclaredGoodsInfoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDDeclaredGoodsCategoryDetailsType }
     *     
     */
    public void setPDDeclaredGoodsInfoDetails(PDDeclaredGoodsCategoryDetailsType value) {
        this.pdDeclaredGoodsInfoDetails = value;
    }

    /**
     * Дополнительные сведения о товарах Gets the value of the pdGoodsListDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pdGoodsListDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDGoodsListDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDGoodsListDetailsType }
     * 
     * 
     */
    public List<PDGoodsListDetailsType> getPDGoodsListDetails() {
        if (pdGoodsListDetails == null) {
            pdGoodsListDetails = new ArrayList<PDGoodsListDetailsType>();
        }
        return this.pdGoodsListDetails;
    }

}
