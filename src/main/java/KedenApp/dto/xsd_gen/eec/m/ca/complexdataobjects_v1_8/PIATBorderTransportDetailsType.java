
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о транспортном средстве, прибывающем на таможенную территорию Евразийского экономического союза
 * 
 * <p>Java class for PIATBorderTransportDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PIATBorderTransportDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedTransportModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ContainerIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PIATTransportMeansItemDetails" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportMeansGrossMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ItineraryPointDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransportMeansEntryPurposeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PermitTranspornationDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PIATBorderTransportDetailsType", propOrder = {
    "unifiedTransportModeCode",
    "containerIndicator",
    "piatTransportMeansItemDetails",
    "transportMeansGrossMassMeasure",
    "itineraryPointDetails",
    "transportMeansEntryPurposeCode",
    "permitTranspornationDocDetails"
})
public class PIATBorderTransportDetailsType {

    @XmlElement(name = "UnifiedTransportModeCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type unifiedTransportModeCode;
    @XmlElement(name = "ContainerIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean containerIndicator;
    @XmlElement(name = "PIATTransportMeansItemDetails")
    protected List<PIATTransportMeansItemDetailsType> piatTransportMeansItemDetails;
    @XmlElement(name = "TransportMeansGrossMassMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected UnifiedPhysicalMeasureType transportMeansGrossMassMeasure;
    @XmlElement(name = "ItineraryPointDetails")
    protected List<ItineraryPointDetailsType> itineraryPointDetails;
    @XmlElement(name = "TransportMeansEntryPurposeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String transportMeansEntryPurposeCode;
    @XmlElement(name = "PermitTranspornationDocDetails")
    protected List<CADocBaseType> permitTranspornationDocDetails;

    /**
     * Gets the value of the unifiedTransportModeCode property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public UnifiedCode20Type getUnifiedTransportModeCode() {
        return unifiedTransportModeCode;
    }

    /**
     * Sets the value of the unifiedTransportModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedCode20Type }
     *     
     */
    public void setUnifiedTransportModeCode(UnifiedCode20Type value) {
        this.unifiedTransportModeCode = value;
    }

    /**
     * Gets the value of the containerIndicator property.
     * 
     */
    public Boolean isContainerIndicator() {
        return containerIndicator;
    }

    /**
     * Sets the value of the containerIndicator property.
     * 
     */
    public void setContainerIndicator(Boolean value) {
        this.containerIndicator = value;
    }

    /**
     * Сведения об идентификации транспортного средства Gets the value of the piatTransportMeansItemDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the piatTransportMeansItemDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPIATTransportMeansItemDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PIATTransportMeansItemDetailsType }
     * 
     * 
     */
    public List<PIATTransportMeansItemDetailsType> getPIATTransportMeansItemDetails() {
        if (piatTransportMeansItemDetails == null) {
            piatTransportMeansItemDetails = new ArrayList<PIATTransportMeansItemDetailsType>();
        }
        return this.piatTransportMeansItemDetails;
    }

    /**
     * Gets the value of the transportMeansGrossMassMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public UnifiedPhysicalMeasureType getTransportMeansGrossMassMeasure() {
        return transportMeansGrossMassMeasure;
    }

    /**
     * Sets the value of the transportMeansGrossMassMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnifiedPhysicalMeasureType }
     *     
     */
    public void setTransportMeansGrossMassMeasure(UnifiedPhysicalMeasureType value) {
        this.transportMeansGrossMassMeasure = value;
    }

    /**
     * Gets the value of the itineraryPointDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryPointDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryPointDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryPointDetailsType }
     * 
     * 
     */
    public List<ItineraryPointDetailsType> getItineraryPointDetails() {
        if (itineraryPointDetails == null) {
            itineraryPointDetails = new ArrayList<ItineraryPointDetailsType>();
        }
        return this.itineraryPointDetails;
    }

    /**
     * Gets the value of the transportMeansEntryPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportMeansEntryPurposeCode() {
        return transportMeansEntryPurposeCode;
    }

    /**
     * Sets the value of the transportMeansEntryPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportMeansEntryPurposeCode(String value) {
        this.transportMeansEntryPurposeCode = value;
    }

    /**
     * Gets the value of the permitTranspornationDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the permitTranspornationDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermitTranspornationDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CADocBaseType }
     * 
     * 
     */
    public List<CADocBaseType> getPermitTranspornationDocDetails() {
        if (permitTranspornationDocDetails == null) {
            permitTranspornationDocDetails = new ArrayList<CADocBaseType>();
        }
        return this.permitTranspornationDocDetails;
    }

}
