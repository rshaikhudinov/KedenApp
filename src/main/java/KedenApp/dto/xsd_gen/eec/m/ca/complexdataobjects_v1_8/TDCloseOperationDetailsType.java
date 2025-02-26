
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о завершении таможенной процедуры таможенного транзита
 * 
 * <p>Java class for TDCloseOperationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDCloseOperationDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitDestinationDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDCloseOperationCustomsMarkDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TDCloseCargoDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CarrierDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}NoteText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransportMeansItemDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocV4Details" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDCloseOperationDetailsType", propOrder = {
    "descriptionText",
    "transitDestinationDetails",
    "tdCloseOperationCustomsMarkDetails",
    "tdCloseCargoDetails",
    "carrierDetails",
    "noteText",
    "transportMeansItemDetails",
    "docV4Details"
})
public class TDCloseOperationDetailsType {

    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;
    @XmlElement(name = "TransitDestinationDetails", required = true)
    protected TransitDestinationDetailsType transitDestinationDetails;
    @XmlElement(name = "TDCloseOperationCustomsMarkDetails", required = true)
    protected TDCloseOperationCustomsMarkDetailsType tdCloseOperationCustomsMarkDetails;
    @XmlElement(name = "TDCloseCargoDetails", required = true)
    protected TDCloseCargoDetailsType tdCloseCargoDetails;
    @XmlElement(name = "CarrierDetails")
    protected CarrierDetailsType carrierDetails;
    @XmlElement(name = "NoteText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> noteText;
    @XmlElement(name = "TransportMeansItemDetails")
    protected List<TransportMeansItemDetailsType> transportMeansItemDetails;
    @XmlElement(name = "DocV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected DocDetailsV4Type docV4Details;

    /**
     * Сведения об обстоятельствах, обусловивших изменение места доставки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

    /**
     * сведения о месте завершения таможенной процедуры таможенного транзита
     * 
     * @return
     *     possible object is
     *     {@link TransitDestinationDetailsType }
     *     
     */
    public TransitDestinationDetailsType getTransitDestinationDetails() {
        return transitDestinationDetails;
    }

    /**
     * Sets the value of the transitDestinationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitDestinationDetailsType }
     *     
     */
    public void setTransitDestinationDetails(TransitDestinationDetailsType value) {
        this.transitDestinationDetails = value;
    }

    /**
     * Gets the value of the tdCloseOperationCustomsMarkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TDCloseOperationCustomsMarkDetailsType }
     *     
     */
    public TDCloseOperationCustomsMarkDetailsType getTDCloseOperationCustomsMarkDetails() {
        return tdCloseOperationCustomsMarkDetails;
    }

    /**
     * Sets the value of the tdCloseOperationCustomsMarkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDCloseOperationCustomsMarkDetailsType }
     *     
     */
    public void setTDCloseOperationCustomsMarkDetails(TDCloseOperationCustomsMarkDetailsType value) {
        this.tdCloseOperationCustomsMarkDetails = value;
    }

    /**
     * Gets the value of the tdCloseCargoDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TDCloseCargoDetailsType }
     *     
     */
    public TDCloseCargoDetailsType getTDCloseCargoDetails() {
        return tdCloseCargoDetails;
    }

    /**
     * Sets the value of the tdCloseCargoDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TDCloseCargoDetailsType }
     *     
     */
    public void setTDCloseCargoDetails(TDCloseCargoDetailsType value) {
        this.tdCloseCargoDetails = value;
    }

    /**
     * сведения о перевозчике, завершающем перевозку товаров в случае частичной доставки
     * 
     * @return
     *     possible object is
     *     {@link CarrierDetailsType }
     *     
     */
    public CarrierDetailsType getCarrierDetails() {
        return carrierDetails;
    }

    /**
     * Sets the value of the carrierDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierDetailsType }
     *     
     */
    public void setCarrierDetails(CarrierDetailsType value) {
        this.carrierDetails = value;
    }

    /**
     * Иные сведения, имеющие значения для таможенных целей Gets the value of the noteText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the noteText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoteText() {
        if (noteText == null) {
            noteText = new ArrayList<String>();
        }
        return this.noteText;
    }

    /**
     * Gets the value of the transportMeansItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transportMeansItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportMeansItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportMeansItemDetailsType }
     * 
     * 
     */
    public List<TransportMeansItemDetailsType> getTransportMeansItemDetails() {
        if (transportMeansItemDetails == null) {
            transportMeansItemDetails = new ArrayList<TransportMeansItemDetailsType>();
        }
        return this.transportMeansItemDetails;
    }

    /**
     * Регистрационный номер в журнале завершения таможенной процедуры таможенного транзита
     * 
     * @return
     *     possible object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public DocDetailsV4Type getDocV4Details() {
        return docV4Details;
    }

    /**
     * Sets the value of the docV4Details property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocDetailsV4Type }
     *     
     */
    public void setDocV4Details(DocDetailsV4Type value) {
        this.docV4Details = value;
    }

}
