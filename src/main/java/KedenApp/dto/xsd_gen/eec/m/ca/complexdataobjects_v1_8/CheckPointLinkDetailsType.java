
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.FractionNumber24MeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о наличии специальной, телефонной, радио- или иной связи в пункте пропуска
 * 
 * <p>Java class for CheckPointLinkDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckPointLinkDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CheckPointLinkKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CheckPointLinkName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CheckPointLinkFunctionText"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CheckPointBandwidthMeasure" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckPointLinkDetailsType", propOrder = {
    "checkPointLinkKindCode",
    "checkPointLinkName",
    "checkPointLinkFunctionText",
    "checkPointBandwidthMeasure"
})
public class CheckPointLinkDetailsType {

    @XmlElement(name = "CheckPointLinkKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String checkPointLinkKindCode;
    @XmlElement(name = "CheckPointLinkName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String checkPointLinkName;
    @XmlElement(name = "CheckPointLinkFunctionText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected String checkPointLinkFunctionText;
    @XmlElement(name = "CheckPointBandwidthMeasure", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected FractionNumber24MeasureType checkPointBandwidthMeasure;

    /**
     * Gets the value of the checkPointLinkKindCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPointLinkKindCode() {
        return checkPointLinkKindCode;
    }

    /**
     * Sets the value of the checkPointLinkKindCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPointLinkKindCode(String value) {
        this.checkPointLinkKindCode = value;
    }

    /**
     * Gets the value of the checkPointLinkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPointLinkName() {
        return checkPointLinkName;
    }

    /**
     * Sets the value of the checkPointLinkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPointLinkName(String value) {
        this.checkPointLinkName = value;
    }

    /**
     * Gets the value of the checkPointLinkFunctionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckPointLinkFunctionText() {
        return checkPointLinkFunctionText;
    }

    /**
     * Sets the value of the checkPointLinkFunctionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckPointLinkFunctionText(String value) {
        this.checkPointLinkFunctionText = value;
    }

    /**
     * Gets the value of the checkPointBandwidthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link FractionNumber24MeasureType }
     *     
     */
    public FractionNumber24MeasureType getCheckPointBandwidthMeasure() {
        return checkPointBandwidthMeasure;
    }

    /**
     * Sets the value of the checkPointBandwidthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link FractionNumber24MeasureType }
     *     
     */
    public void setCheckPointBandwidthMeasure(FractionNumber24MeasureType value) {
        this.checkPointBandwidthMeasure = value;
    }

}
