
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения об отметках таможенного органа при завершении таможенной процедуры таможенного транзита
 * 
 * <p>Java class for TDCloseOperationCustomsMarkDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDCloseOperationCustomsMarkDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DefectCustomsIdentificationMeansIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DamagedCargoAreaIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OffenceIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OffenceDesctiptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransitReservationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsIdentificationDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDCloseOperationCustomsMarkDetailsType", propOrder = {
    "defectCustomsIdentificationMeansIndicator",
    "damagedCargoAreaIndicator",
    "offenceIndicator",
    "offenceDesctiptionText",
    "transitReservationDetails",
    "customsIdentificationDetails"
})
public class TDCloseOperationCustomsMarkDetailsType {

    @XmlElement(name = "DefectCustomsIdentificationMeansIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean defectCustomsIdentificationMeansIndicator;
    @XmlElement(name = "DamagedCargoAreaIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean damagedCargoAreaIndicator;
    @XmlElement(name = "OffenceIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean offenceIndicator;
    @XmlElement(name = "OffenceDesctiptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> offenceDesctiptionText;
    @XmlElement(name = "TransitReservationDetails")
    protected List<TransitReservationDetailsType> transitReservationDetails;
    @XmlElement(name = "CustomsIdentificationDetails")
    protected List<CustomsIdentificationDetailsType> customsIdentificationDetails;

    /**
     * Gets the value of the defectCustomsIdentificationMeansIndicator property.
     * 
     */
    public Boolean isDefectCustomsIdentificationMeansIndicator() {
        return defectCustomsIdentificationMeansIndicator;
    }

    /**
     * Sets the value of the defectCustomsIdentificationMeansIndicator property.
     * 
     */
    public void setDefectCustomsIdentificationMeansIndicator(Boolean value) {
        this.defectCustomsIdentificationMeansIndicator = value;
    }

    /**
     * Gets the value of the damagedCargoAreaIndicator property.
     * 
     */
    public Boolean isDamagedCargoAreaIndicator() {
        return damagedCargoAreaIndicator;
    }

    /**
     * Sets the value of the damagedCargoAreaIndicator property.
     * 
     */
    public void setDamagedCargoAreaIndicator(Boolean value) {
        this.damagedCargoAreaIndicator = value;
    }

    /**
     * Gets the value of the offenceIndicator property.
     * 
     */
    public Boolean isOffenceIndicator() {
        return offenceIndicator;
    }

    /**
     * Sets the value of the offenceIndicator property.
     * 
     */
    public void setOffenceIndicator(Boolean value) {
        this.offenceIndicator = value;
    }

    /**
     * Gets the value of the offenceDesctiptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the offenceDesctiptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffenceDesctiptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOffenceDesctiptionText() {
        if (offenceDesctiptionText == null) {
            offenceDesctiptionText = new ArrayList<String>();
        }
        return this.offenceDesctiptionText;
    }

    /**
     * Gets the value of the transitReservationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transitReservationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransitReservationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransitReservationDetailsType }
     * 
     * 
     */
    public List<TransitReservationDetailsType> getTransitReservationDetails() {
        if (transitReservationDetails == null) {
            transitReservationDetails = new ArrayList<TransitReservationDetailsType>();
        }
        return this.transitReservationDetails;
    }

    /**
     * Сведения о средствах идентификации при прибытии в место доставки Gets the value of the customsIdentificationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customsIdentificationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsIdentificationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsIdentificationDetailsType }
     * 
     * 
     */
    public List<CustomsIdentificationDetailsType> getCustomsIdentificationDetails() {
        if (customsIdentificationDetails == null) {
            customsIdentificationDetails = new ArrayList<CustomsIdentificationDetailsType>();
        }
        return this.customsIdentificationDetails;
    }

}
