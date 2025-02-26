
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsDecisionCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о решении, принятом таможенным органом
 * 
 * <p>Java class for DecisionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DecisionDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsDecisionModeCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDateTime"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DecisionReasonText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}RecommendationText" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}GoodsIssueDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsReleaseIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CustomsPersonDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionDetailsType", propOrder = {
    "customsDecisionModeCode",
    "eventDateTime",
    "descriptionText",
    "decisionReasonText",
    "recommendationText",
    "goodsIssueDate",
    "goodsReleaseIdDetails",
    "customsPersonDetails"
})
@XmlSeeAlso({
    GoodsDecisionDetailsType.class
})
public class DecisionDetailsType {

    @XmlElement(name = "CustomsDecisionModeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected CustomsDecisionCodeType customsDecisionModeCode;
    @XmlElement(name = "EventDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;
    @XmlElement(name = "DecisionReasonText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String decisionReasonText;
    @XmlElement(name = "RecommendationText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected String recommendationText;
    @XmlElement(name = "GoodsIssueDate", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar goodsIssueDate;
    @XmlElement(name = "GoodsReleaseIdDetails")
    protected GoodsReleaseIdDetailsType goodsReleaseIdDetails;
    @XmlElement(name = "CustomsPersonDetails")
    protected CustomsPersonDetailsType customsPersonDetails;

    /**
     * Код решения, принятого таможенным органом
     * 
     * @return
     *     possible object is
     *     {@link CustomsDecisionCodeType }
     *     
     */
    public CustomsDecisionCodeType getCustomsDecisionModeCode() {
        return customsDecisionModeCode;
    }

    /**
     * Sets the value of the customsDecisionModeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsDecisionCodeType }
     *     
     */
    public void setCustomsDecisionModeCode(CustomsDecisionCodeType value) {
        this.customsDecisionModeCode = value;
    }

    /**
     * Дата и время совершения операции или принятия решения
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
     * Описание решения
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
     * Обоснование принятия решения
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionReasonText() {
        return decisionReasonText;
    }

    /**
     * Sets the value of the decisionReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionReasonText(String value) {
        this.decisionReasonText = value;
    }

    /**
     * Рекомендации таможенного органа
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecommendationText() {
        return recommendationText;
    }

    /**
     * Sets the value of the recommendationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecommendationText(String value) {
        this.recommendationText = value;
    }

    /**
     * Gets the value of the goodsIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGoodsIssueDate() {
        return goodsIssueDate;
    }

    /**
     * Sets the value of the goodsIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGoodsIssueDate(XMLGregorianCalendar value) {
        this.goodsIssueDate = value;
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
     * Gets the value of the customsPersonDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsPersonDetailsType }
     *     
     */
    public CustomsPersonDetailsType getCustomsPersonDetails() {
        return customsPersonDetails;
    }

    /**
     * Sets the value of the customsPersonDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsPersonDetailsType }
     *     
     */
    public void setCustomsPersonDetails(CustomsPersonDetailsType value) {
        this.customsPersonDetails = value;
    }

}
