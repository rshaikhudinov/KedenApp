
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransportTypeCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.TransportMeansRegIdType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представдяющие сведения о транспортном средстве, на котором размещена навигационная пломба
 * 
 * <p>Java class for NSTransportMeansDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NSTransportMeansDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportTypeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}TransportMeansRegId"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SealIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NSTransportMeansDetailsType", propOrder = {
    "transportTypeCode",
    "transportMeansRegId",
    "sealIndicator"
})
public class NSTransportMeansDetailsType {

    @XmlElement(name = "TransportTypeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected TransportTypeCodeType transportTypeCode;
    @XmlElement(name = "TransportMeansRegId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected TransportMeansRegIdType transportMeansRegId;
    @XmlElement(name = "SealIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean sealIndicator;

    /**
     * кодовое обозначение типа транспортного средства
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
     * Регистрационный номер транспортного средства
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
     * признак размещения навигационной пломбы на транспортном средстве
     * 
     */
    public Boolean isSealIndicator() {
        return sealIndicator;
    }

    /**
     * Sets the value of the sealIndicator property.
     * 
     */
    public void setSealIndicator(Boolean value) {
        this.sealIndicator = value;
    }

}
