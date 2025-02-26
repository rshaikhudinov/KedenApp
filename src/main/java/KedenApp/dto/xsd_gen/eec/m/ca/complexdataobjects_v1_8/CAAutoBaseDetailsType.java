
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.VehicleIdDetailsType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие базовые сведения о выпускаемом автомобиле
 * 
 * <p>Java class for CAAutoBaseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAAutoBaseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:ComplexDataObjects:v0.4.14}VehicleIdDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}VehicleModelDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ManufactureDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAAutoBaseDetailsType", propOrder = {
    "vehicleModelDetails",
    "manufactureDate"
})
@XmlSeeAlso({
    CRAutomobileDetailsType.class,
    DTAutomobileDetailsType.class,
    DTExchAutomobileDetailsType.class,
    TMPAAutomobileDetailsType.class,
    DTAutomobileDetailsV2Type.class
})
public class CAAutoBaseDetailsType
    extends VehicleIdDetailsType
{

    @XmlElement(name = "VehicleModelDetails")
    protected VehicleModelDetailsType vehicleModelDetails;
    @XmlElement(name = "ManufactureDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar manufactureDate;

    /**
     * Gets the value of the vehicleModelDetails property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleModelDetailsType }
     *     
     */
    public VehicleModelDetailsType getVehicleModelDetails() {
        return vehicleModelDetails;
    }

    /**
     * Sets the value of the vehicleModelDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleModelDetailsType }
     *     
     */
    public void setVehicleModelDetails(VehicleModelDetailsType value) {
        this.vehicleModelDetails = value;
    }

    /**
     * Дата изготовления (момент выпуска) транспортного средства
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Sets the value of the manufactureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setManufactureDate(XMLGregorianCalendar value) {
        this.manufactureDate = value;
    }

}
