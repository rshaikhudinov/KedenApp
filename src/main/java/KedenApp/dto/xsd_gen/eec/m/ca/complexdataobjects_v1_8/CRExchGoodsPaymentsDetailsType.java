
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxPaymentMethodCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о начисленном платеже
 * 
 * <p>Java class for CRExchGoodsPaymentsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRExchGoodsPaymentsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPaymentBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsTaxPaymentMethodCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRExchGoodsPaymentsDetailsType", propOrder = {
    "customsTaxPaymentMethodCode"
})
public class CRExchGoodsPaymentsDetailsType
    extends CustomsPaymentBaseDetailsType
{

    @XmlElement(name = "CustomsTaxPaymentMethodCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsTaxPaymentMethodCodeType customsTaxPaymentMethodCode;

    /**
     * Gets the value of the customsTaxPaymentMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsTaxPaymentMethodCodeType }
     *     
     */
    public CustomsTaxPaymentMethodCodeType getCustomsTaxPaymentMethodCode() {
        return customsTaxPaymentMethodCode;
    }

    /**
     * Sets the value of the customsTaxPaymentMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsTaxPaymentMethodCodeType }
     *     
     */
    public void setCustomsTaxPaymentMethodCode(CustomsTaxPaymentMethodCodeType value) {
        this.customsTaxPaymentMethodCode = value;
    }

}
