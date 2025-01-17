
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
 * Компоненты, представляющие сведения об исчислении таможенного платежа
 * 
 * <p>Java class for GoodsItemPaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GoodsItemPaymentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPaymentBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CommodityCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReferenceLineId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RefReferenceLineId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReferenceConsignmentItemOrdinal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GoodsItemPaymentDetailsType", propOrder = {
    "commodityCode",
    "referenceLineId",
    "refReferenceLineId",
    "referenceConsignmentItemOrdinal"
})
public class GoodsItemPaymentDetailsType
    extends CustomsPaymentBaseDetailsType
{

    @XmlElement(name = "CommodityCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commodityCode;
    @XmlElement(name = "ReferenceLineId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceLineId;
    @XmlElement(name = "RefReferenceLineId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String refReferenceLineId;
    @XmlElement(name = "ReferenceConsignmentItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger referenceConsignmentItemOrdinal;

    /**
     * номер группы в соответствии с ТН ВЭД ЕАЭС
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCode() {
        return commodityCode;
    }

    /**
     * Sets the value of the commodityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCode(String value) {
        this.commodityCode = value;
    }

    /**
     * Ссылочный идентификатор записи в сведениях о предшествующем документе
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceLineId() {
        return referenceLineId;
    }

    /**
     * Sets the value of the referenceLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceLineId(String value) {
        this.referenceLineId = value;
    }

    /**
     * Ссылочный идентификатор записи в предшествующем документе или сведениях
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefReferenceLineId() {
        return refReferenceLineId;
    }

    /**
     * Sets the value of the refReferenceLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefReferenceLineId(String value) {
        this.refReferenceLineId = value;
    }

    /**
     * порядковый номер товара в предшествующем документе
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReferenceConsignmentItemOrdinal() {
        return referenceConsignmentItemOrdinal;
    }

    /**
     * Sets the value of the referenceConsignmentItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReferenceConsignmentItemOrdinal(BigInteger value) {
        this.referenceConsignmentItemOrdinal = value;
    }

}
