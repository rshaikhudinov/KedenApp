
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.OffenceCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Сведения о результатах проведения таможенного контроля
 * 
 * <p>Java class for ATDResultsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATDResultsDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OffenceCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CALegalActDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}OffenceDesctiptionText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATDResultsDetailsType", propOrder = {
    "descriptionText",
    "offenceCode",
    "caLegalActDetails",
    "offenceDesctiptionText"
})
public class ATDResultsDetailsType {

    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> descriptionText;
    @XmlElement(name = "OffenceCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<OffenceCodeType> offenceCode;
    @XmlElement(name = "CALegalActDetails")
    protected List<CALegalActDetailsType> caLegalActDetails;
    @XmlElement(name = "OffenceDesctiptionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected List<String> offenceDesctiptionText;

    /**
     * Описание результатов проведения таможенного контроля Gets the value of the descriptionText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescriptionText() {
        if (descriptionText == null) {
            descriptionText = new ArrayList<String>();
        }
        return this.descriptionText;
    }

    /**
     * Gets the value of the offenceCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the offenceCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffenceCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OffenceCodeType }
     * 
     * 
     */
    public List<OffenceCodeType> getOffenceCode() {
        if (offenceCode == null) {
            offenceCode = new ArrayList<OffenceCodeType>();
        }
        return this.offenceCode;
    }

    /**
     * Gets the value of the caLegalActDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the caLegalActDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCALegalActDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CALegalActDetailsType }
     * 
     * 
     */
    public List<CALegalActDetailsType> getCALegalActDetails() {
        if (caLegalActDetails == null) {
            caLegalActDetails = new ArrayList<CALegalActDetailsType>();
        }
        return this.caLegalActDetails;
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

}
