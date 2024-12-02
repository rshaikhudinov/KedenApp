
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * сведения о лицензионных отношениях и отчислениях продавцу
 * 
 * <p>Java class for BuyerSellerRoyaltyFeeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuyerSellerRoyaltyFeeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RoyaltyContractIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RoyaltyFeeIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SubsequentResaleIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyerSellerRoyaltyFeeDetailsType", propOrder = {
    "royaltyContractIndicator",
    "royaltyFeeIndicator",
    "subsequentResaleIndicator"
})
public class BuyerSellerRoyaltyFeeDetailsType {

    @XmlElement(name = "RoyaltyContractIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean royaltyContractIndicator;
    @XmlElement(name = "RoyaltyFeeIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean royaltyFeeIndicator;
    @XmlElement(name = "SubsequentResaleIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean subsequentResaleIndicator;

    /**
     * Gets the value of the royaltyContractIndicator property.
     * 
     */
    public Boolean isRoyaltyContractIndicator() {
        return royaltyContractIndicator;
    }

    /**
     * Sets the value of the royaltyContractIndicator property.
     * 
     */
    public void setRoyaltyContractIndicator(Boolean value) {
        this.royaltyContractIndicator = value;
    }

    /**
     * Gets the value of the royaltyFeeIndicator property.
     * 
     */
    public Boolean isRoyaltyFeeIndicator() {
        return royaltyFeeIndicator;
    }

    /**
     * Sets the value of the royaltyFeeIndicator property.
     * 
     */
    public void setRoyaltyFeeIndicator(Boolean value) {
        this.royaltyFeeIndicator = value;
    }

    /**
     * признак наличия условий, в соответствии с которыми часть дохода (выручки), полученного в результате последующей продажи, распоряжения иным способом или использования ввозимых товаров, прямо или косвенно причитается продавцу
     * 
     */
    public Boolean isSubsequentResaleIndicator() {
        return subsequentResaleIndicator;
    }

    /**
     * Sets the value of the subsequentResaleIndicator property.
     * 
     */
    public void setSubsequentResaleIndicator(Boolean value) {
        this.subsequentResaleIndicator = value;
    }

}
