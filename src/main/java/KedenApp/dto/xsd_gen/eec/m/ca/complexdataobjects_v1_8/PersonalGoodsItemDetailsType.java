
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о личных вещах члена экипажа или пассажира транспортного средства
 * 
 * <p>Java class for PersonalGoodsItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalGoodsItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CashDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalGoodsItemDetailsType", propOrder = {
    "cashDetails",
    "itemDetails"
})
public class PersonalGoodsItemDetailsType {

    @XmlElement(name = "CashDetails")
    protected CashListDetailsType cashDetails;
    @XmlElement(name = "ItemDetails")
    protected List<ItemDetailsType> itemDetails;

    /**
     * Gets the value of the cashDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CashListDetailsType }
     *     
     */
    public CashListDetailsType getCashDetails() {
        return cashDetails;
    }

    /**
     * Sets the value of the cashDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashListDetailsType }
     *     
     */
    public void setCashDetails(CashListDetailsType value) {
        this.cashDetails = value;
    }

    /**
     * Сведения о личных вещах Gets the value of the itemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemDetailsType }
     * 
     * 
     */
    public List<ItemDetailsType> getItemDetails() {
        if (itemDetails == null) {
            itemDetails = new ArrayList<ItemDetailsType>();
        }
        return this.itemDetails;
    }

}
