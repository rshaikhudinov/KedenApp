
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.EAEUDocDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о решении Комиссии по классификации товаров по ТН ВЭД ЕАЭС
 * 
 * <p>Java class for CDEAUDocDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CDEAUDocDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}EAEUDocDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CDEAUDocGoodsDetails" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CDEAUDocDetailsType", propOrder = {
    "eaeuDocDetails",
    "cdeauDocGoodsDetails"
})
public class CDEAUDocDetailsType {

    @XmlElement(name = "EAEUDocDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected EAEUDocDetailsType eaeuDocDetails;
    @XmlElement(name = "CDEAUDocGoodsDetails", required = true)
    protected List<CDEAUDocGoodsDetailsType> cdeauDocGoodsDetails;

    /**
     * Реквизиты решения Комиссии по классификации товаров по ТН ВЭД ЕАЭС
     * 
     * @return
     *     possible object is
     *     {@link EAEUDocDetailsType }
     *     
     */
    public EAEUDocDetailsType getEAEUDocDetails() {
        return eaeuDocDetails;
    }

    /**
     * Sets the value of the eaeuDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link EAEUDocDetailsType }
     *     
     */
    public void setEAEUDocDetails(EAEUDocDetailsType value) {
        this.eaeuDocDetails = value;
    }

    /**
     * Gets the value of the cdeauDocGoodsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cdeauDocGoodsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCDEAUDocGoodsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CDEAUDocGoodsDetailsType }
     * 
     * 
     */
    public List<CDEAUDocGoodsDetailsType> getCDEAUDocGoodsDetails() {
        if (cdeauDocGoodsDetails == null) {
            cdeauDocGoodsDetails = new ArrayList<CDEAUDocGoodsDetailsType>();
        }
        return this.cdeauDocGoodsDetails;
    }

}
