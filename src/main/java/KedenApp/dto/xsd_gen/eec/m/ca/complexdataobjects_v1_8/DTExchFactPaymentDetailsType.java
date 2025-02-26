
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения об уплате таможенного платежа
 * 
 * <p>Java class for DTExchFactPaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DTExchFactPaymentDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}FactPaymentBaseDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DTPaymentDocDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ListItemOrdinal"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DTExchFactPaymentDetailsType", propOrder = {
    "dtPaymentDocDetails",
    "listItemOrdinal"
})
public class DTExchFactPaymentDetailsType
    extends FactPaymentBaseDetailsType
{

    @XmlElement(name = "DTPaymentDocDetails")
    protected DocDetailsV4Type dtPaymentDocDetails;
    @XmlElement(name = "ListItemOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger listItemOrdinal;

    /**
     * Gets the value of the dtPaymentDocDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getDTPaymentDocDetails() {
        return dtPaymentDocDetails;
    }

    /**
     * Sets the value of the dtPaymentDocDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setDTPaymentDocDetails(DocDetailsV4Type value) {
        this.dtPaymentDocDetails = value;
    }

    /**
     * Порядковый номер записи по виду платежа
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getListItemOrdinal() {
        return listItemOrdinal;
    }

    /**
     * Sets the value of the listItemOrdinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setListItemOrdinal(BigInteger value) {
        this.listItemOrdinal = value;
    }

}
