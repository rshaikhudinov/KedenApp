
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о денежных средствах и денежных инструментах, заявленных в пассажирской таможенной декларации
 * 
 * <p>Java class for PDMoneyDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PDMoneyDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CashDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TravelersChequeDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}NegotiableInstrumentDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDMoneyOwnerDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDMoneySourceDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDMoneyUsageDetails"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}PDMoneyTransportationDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PDMoneyDetailsType", propOrder = {
    "cashDetails",
    "travelersChequeDetails",
    "negotiableInstrumentDetails",
    "pdMoneyOwnerDetails",
    "pdMoneySourceDetails",
    "pdMoneyUsageDetails",
    "pdMoneyTransportationDetails"
})
public class PDMoneyDetailsType {

    @XmlElement(name = "CashDetails")
    protected CashListDetailsType cashDetails;
    @XmlElement(name = "TravelersChequeDetails")
    protected CashListDetailsType travelersChequeDetails;
    @XmlElement(name = "NegotiableInstrumentDetails")
    protected List<NegotiableInstrumentDetailsType> negotiableInstrumentDetails;
    @XmlElement(name = "PDMoneyOwnerDetails")
    protected List<PDMoneyOwnerDetailsType> pdMoneyOwnerDetails;
    @XmlElement(name = "PDMoneySourceDetails", required = true)
    protected PDMoneySourceDetailsType pdMoneySourceDetails;
    @XmlElement(name = "PDMoneyUsageDetails", required = true)
    protected PDMoneyUsageDetailsType pdMoneyUsageDetails;
    @XmlElement(name = "PDMoneyTransportationDetails", required = true)
    protected PDMoneyTransportationDetailsType pdMoneyTransportationDetails;

    /**
     * Gets the value of the cashDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CashListDetailsType }
     *     
     */
    public CashListDetailsType getCashDetails() {
        return cashDetails;
    }

    /**
     * Sets the value of the cashDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashListDetailsType }
     *     
     */
    public void setCashDetails(CashListDetailsType value) {
        this.cashDetails = value;
    }

    /**
     * Gets the value of the travelersChequeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CashListDetailsType }
     *     
     */
    public CashListDetailsType getTravelersChequeDetails() {
        return travelersChequeDetails;
    }

    /**
     * Sets the value of the travelersChequeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashListDetailsType }
     *     
     */
    public void setTravelersChequeDetails(CashListDetailsType value) {
        this.travelersChequeDetails = value;
    }

    /**
     * Сведения о денежном инструменте, за исключением дорожных чеков Gets the value of the negotiableInstrumentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the negotiableInstrumentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegotiableInstrumentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NegotiableInstrumentDetailsType }
     * 
     * 
     */
    public List<NegotiableInstrumentDetailsType> getNegotiableInstrumentDetails() {
        if (negotiableInstrumentDetails == null) {
            negotiableInstrumentDetails = new ArrayList<NegotiableInstrumentDetailsType>();
        }
        return this.negotiableInstrumentDetails;
    }

    /**
     * Gets the value of the pdMoneyOwnerDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the pdMoneyOwnerDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDMoneyOwnerDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PDMoneyOwnerDetailsType }
     * 
     * 
     */
    public List<PDMoneyOwnerDetailsType> getPDMoneyOwnerDetails() {
        if (pdMoneyOwnerDetails == null) {
            pdMoneyOwnerDetails = new ArrayList<PDMoneyOwnerDetailsType>();
        }
        return this.pdMoneyOwnerDetails;
    }

    /**
     * Сведения об источнике происхождения наличных денежных средств и (или) денежных инструментов
     * 
     * @return
     *     possible object is
     *     {@link PDMoneySourceDetailsType }
     *     
     */
    public PDMoneySourceDetailsType getPDMoneySourceDetails() {
        return pdMoneySourceDetails;
    }

    /**
     * Sets the value of the pdMoneySourceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDMoneySourceDetailsType }
     *     
     */
    public void setPDMoneySourceDetails(PDMoneySourceDetailsType value) {
        this.pdMoneySourceDetails = value;
    }

    /**
     * Gets the value of the pdMoneyUsageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PDMoneyUsageDetailsType }
     *     
     */
    public PDMoneyUsageDetailsType getPDMoneyUsageDetails() {
        return pdMoneyUsageDetails;
    }

    /**
     * Sets the value of the pdMoneyUsageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDMoneyUsageDetailsType }
     *     
     */
    public void setPDMoneyUsageDetails(PDMoneyUsageDetailsType value) {
        this.pdMoneyUsageDetails = value;
    }

    /**
     * Gets the value of the pdMoneyTransportationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PDMoneyTransportationDetailsType }
     *     
     */
    public PDMoneyTransportationDetailsType getPDMoneyTransportationDetails() {
        return pdMoneyTransportationDetails;
    }

    /**
     * Sets the value of the pdMoneyTransportationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PDMoneyTransportationDetailsType }
     *     
     */
    public void setPDMoneyTransportationDetails(PDMoneyTransportationDetailsType value) {
        this.pdMoneyTransportationDetails = value;
    }

}
