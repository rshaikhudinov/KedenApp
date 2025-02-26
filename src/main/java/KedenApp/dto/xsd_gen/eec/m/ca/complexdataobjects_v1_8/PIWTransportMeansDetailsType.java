
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransportTypeCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.TransportMeansRegIdType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о железнодорожном транспортном средстве, прибывающем на таможенную территорию Евразийского экономического союза
 * 
 * <p>Java class for PIWTransportMeansDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIWTransportMeansDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObjectOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TransportMeansRegId"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}FullItemCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReturnIndicator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIWTransportMeansDetailsType", propOrder = {
    "objectOrdinal",
    "transportMeansRegId",
    "transportTypeCode",
    "fullItemCode",
    "returnIndicator"
})
public class PIWTransportMeansDetailsType {

    @XmlElement(name = "ObjectOrdinal", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger objectOrdinal;
    @XmlElement(name = "TransportMeansRegId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected TransportMeansRegIdType transportMeansRegId;
    @XmlElement(name = "TransportTypeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected TransportTypeCodeType transportTypeCode;
    @XmlElement(name = "FullItemCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String fullItemCode;
    @XmlElement(name = "ReturnIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean returnIndicator;

    /**
     * порядковый номер транспортного средства
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
     * Идентификационный номер железнодорожного вагона или контейнера
     * 
     * @return
     *     possible object is
     *     {@link TransportMeansRegIdType }
     *     
     */
    public TransportMeansRegIdType getTransportMeansRegId() {
        return transportMeansRegId;
    }

    /**
     * Sets the value of the transportMeansRegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportMeansRegIdType }
     *     
     */
    public void setTransportMeansRegId(TransportMeansRegIdType value) {
        this.transportMeansRegId = value;
    }

    /**
     * Gets the value of the transportTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransportTypeCodeType }
     *     
     */
    public TransportTypeCodeType getTransportTypeCode() {
        return transportTypeCode;
    }

    /**
     * Sets the value of the transportTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportTypeCodeType }
     *     
     */
    public void setTransportTypeCode(TransportTypeCodeType value) {
        this.transportTypeCode = value;
    }

    /**
     * Признак порожнего транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullItemCode() {
        return fullItemCode;
    }

    /**
     * Sets the value of the fullItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullItemCode(String value) {
        this.fullItemCode = value;
    }

    /**
     * Признак возврата вагона
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnIndicator() {
        return returnIndicator;
    }

    /**
     * Sets the value of the returnIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnIndicator(Boolean value) {
        this.returnIndicator = value;
    }

}
