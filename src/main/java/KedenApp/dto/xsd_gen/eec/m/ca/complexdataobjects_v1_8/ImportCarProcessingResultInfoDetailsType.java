
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.VehicleIdDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о результате обработки сведений в отношении автомобилей, ввезенных и выпущенных для внутреннего потребления (в свободное обращение)
 * 
 * <p>Java class for ImportCarProcessingResultInfoDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportCarProcessingResultInfoDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsDeclarationIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsReceiptIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PassengerDeclarationIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsReleaseIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}VehicleIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDateTime"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProcessingResultV2Code"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportCarProcessingResultInfoDetailsType", propOrder = {
    "customsDeclarationIdDetails",
    "customsReceiptIdDetails",
    "passengerDeclarationIdDetails",
    "goodsReleaseIdDetails",
    "vehicleIdDetails",
    "eventDateTime",
    "processingResultV2Code",
    "descriptionText"
})
public class ImportCarProcessingResultInfoDetailsType {

    @XmlElement(name = "CustomsDeclarationIdDetails")
    protected CustomsDocumentIdDetailsType customsDeclarationIdDetails;
    @XmlElement(name = "CustomsReceiptIdDetails")
    protected CustomsReceiptIdDetailsType customsReceiptIdDetails;
    @XmlElement(name = "PassengerDeclarationIdDetails")
    protected PassengerDeclarationIdDetailsType passengerDeclarationIdDetails;
    @XmlElement(name = "GoodsReleaseIdDetails")
    protected GoodsReleaseIdDetailsType goodsReleaseIdDetails;
    @XmlElement(name = "VehicleIdDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14")
    protected VehicleIdDetailsType vehicleIdDetails;
    @XmlElement(name = "EventDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;
    @XmlElement(name = "ProcessingResultV2Code", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String processingResultV2Code;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;

    /**
     * Gets the value of the customsDeclarationIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public CustomsDocumentIdDetailsType getCustomsDeclarationIdDetails() {
        return customsDeclarationIdDetails;
    }

    /**
     * Sets the value of the customsDeclarationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDocumentIdDetailsType }
     *     
     */
    public void setCustomsDeclarationIdDetails(CustomsDocumentIdDetailsType value) {
        this.customsDeclarationIdDetails = value;
    }

    /**
     * Gets the value of the customsReceiptIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsReceiptIdDetailsType }
     *     
     */
    public CustomsReceiptIdDetailsType getCustomsReceiptIdDetails() {
        return customsReceiptIdDetails;
    }

    /**
     * Sets the value of the customsReceiptIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsReceiptIdDetailsType }
     *     
     */
    public void setCustomsReceiptIdDetails(CustomsReceiptIdDetailsType value) {
        this.customsReceiptIdDetails = value;
    }

    /**
     * Gets the value of the passengerDeclarationIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerDeclarationIdDetailsType }
     *     
     */
    public PassengerDeclarationIdDetailsType getPassengerDeclarationIdDetails() {
        return passengerDeclarationIdDetails;
    }

    /**
     * Sets the value of the passengerDeclarationIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerDeclarationIdDetailsType }
     *     
     */
    public void setPassengerDeclarationIdDetails(PassengerDeclarationIdDetailsType value) {
        this.passengerDeclarationIdDetails = value;
    }

    /**
     * Gets the value of the goodsReleaseIdDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GoodsReleaseIdDetailsType }
     *     
     */
    public GoodsReleaseIdDetailsType getGoodsReleaseIdDetails() {
        return goodsReleaseIdDetails;
    }

    /**
     * Sets the value of the goodsReleaseIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoodsReleaseIdDetailsType }
     *     
     */
    public void setGoodsReleaseIdDetails(GoodsReleaseIdDetailsType value) {
        this.goodsReleaseIdDetails = value;
    }

    /**
     * совокупность идентификаторов транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link VehicleIdDetailsType }
     *     
     */
    public VehicleIdDetailsType getVehicleIdDetails() {
        return vehicleIdDetails;
    }

    /**
     * Sets the value of the vehicleIdDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleIdDetailsType }
     *     
     */
    public void setVehicleIdDetails(VehicleIdDetailsType value) {
        this.vehicleIdDetails = value;
    }

    /**
     * дата и время окончания обработки сведений
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Sets the value of the eventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDateTime(XMLGregorianCalendar value) {
        this.eventDateTime = value;
    }

    /**
     * Gets the value of the processingResultV2Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingResultV2Code() {
        return processingResultV2Code;
    }

    /**
     * Sets the value of the processingResultV2Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingResultV2Code(String value) {
        this.processingResultV2Code = value;
    }

    /**
     * описание результата обработки полученного электронного документа (сведений) информационной системой участника общего процесса
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

}
