
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.FractionNumber102MeasureType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.AddressDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о сооружениях, помещениях (частях помещений) и (или) открытых площадках (частей открытых площадок) уполномоченного экономического оператора, предназначенных для использования или используемых для временного хранения товаров
 * 
 * <p>Java class for AEOStorageFacilityDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AEOStorageFacilityDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PlaceName"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}AddressDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TotalAreaMeasure"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsControlZoneDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AEOStorageFacilityDetailsType", propOrder = {
    "placeName",
    "addressDetails",
    "totalAreaMeasure",
    "customsControlZoneDetails"
})
public class AEOStorageFacilityDetailsType {

    @XmlElement(name = "PlaceName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String placeName;
    @XmlElement(name = "AddressDetails", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected AddressDetailsType addressDetails;
    @XmlElement(name = "TotalAreaMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected FractionNumber102MeasureType totalAreaMeasure;
    @XmlElement(name = "CustomsControlZoneDetails")
    protected List<CustomsControlZoneDetailsType> customsControlZoneDetails;

    /**
     * наименование места хранения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceName() {
        return placeName;
    }

    /**
     * Sets the value of the placeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceName(String value) {
        this.placeName = value;
    }

    /**
     * фактический адрес места хранения
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailsType }
     *     
     */
    public AddressDetailsType getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailsType }
     *     
     */
    public void setAddressDetails(AddressDetailsType value) {
        this.addressDetails = value;
    }

    /**
     * площадь места хранения
     * 
     * @return
     *     possible object is
     *     {@link FractionNumber102MeasureType }
     *     
     */
    public FractionNumber102MeasureType getTotalAreaMeasure() {
        return totalAreaMeasure;
    }

    /**
     * Sets the value of the totalAreaMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionNumber102MeasureType }
     *     
     */
    public void setTotalAreaMeasure(FractionNumber102MeasureType value) {
        this.totalAreaMeasure = value;
    }

    /**
     * Gets the value of the customsControlZoneDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the customsControlZoneDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsControlZoneDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsControlZoneDetailsType }
     * 
     * 
     */
    public List<CustomsControlZoneDetailsType> getCustomsControlZoneDetails() {
        if (customsControlZoneDetails == null) {
            customsControlZoneDetails = new ArrayList<CustomsControlZoneDetailsType>();
        }
        return this.customsControlZoneDetails;
    }

}
