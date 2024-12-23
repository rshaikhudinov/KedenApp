
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Регистрационный номер разрешения на убытие (проследование) товара, сформированный в соответствии с законодательством государства-члена
 * 
 * <p>Java class for FERegistrationIdDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FERegistrationIdDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDocumentIdDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObjectOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LoadingId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ShippingOrderId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FERegistrationIdDetailsType", propOrder = {
    "objectOrdinal",
    "loadingId",
    "shippingOrderId"
})
public class FERegistrationIdDetailsType
    extends CustomsDocumentIdDetailsType
{

    @XmlElement(name = "ObjectOrdinal", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger objectOrdinal;
    @XmlElement(name = "LoadingId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String loadingId;
    @XmlElement(name = "ShippingOrderId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shippingOrderId;

    /**
     * Порядковый номер накладной на товары, перевозимые на одном транспортном средстве (в составе транспортных средств)
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getObjectOrdinal() {
        return objectOrdinal;
    }

    /**
     * Sets the value of the objectOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setObjectOrdinal(BigInteger value) {
        this.objectOrdinal = value;
    }

    /**
     * Идентификатор морской погрузки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoadingId() {
        return loadingId;
    }

    /**
     * Sets the value of the loadingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoadingId(String value) {
        this.loadingId = value;
    }

    /**
     * Gets the value of the shippingOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingOrderId() {
        return shippingOrderId;
    }

    /**
     * Sets the value of the shippingOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingOrderId(String value) {
        this.shippingOrderId = value;
    }

}
