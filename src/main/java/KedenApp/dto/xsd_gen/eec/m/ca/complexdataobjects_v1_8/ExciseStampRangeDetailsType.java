
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие информацию о диапазоне номеров акцизных или специальных марок
 * 
 * <p>Java class for ExciseStampRangeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExciseStampRangeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExciseFirstStampId"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExciseLastStampId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExciseStampRangeDetailsType", propOrder = {
    "exciseFirstStampId",
    "exciseLastStampId"
})
public class ExciseStampRangeDetailsType {

    @XmlElement(name = "ExciseFirstStampId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String exciseFirstStampId;
    @XmlElement(name = "ExciseLastStampId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String exciseLastStampId;

    /**
     * Gets the value of the exciseFirstStampId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExciseFirstStampId() {
        return exciseFirstStampId;
    }

    /**
     * Sets the value of the exciseFirstStampId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExciseFirstStampId(String value) {
        this.exciseFirstStampId = value;
    }

    /**
     * Gets the value of the exciseLastStampId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExciseLastStampId() {
        return exciseLastStampId;
    }

    /**
     * Sets the value of the exciseLastStampId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExciseLastStampId(String value) {
        this.exciseLastStampId = value;
    }

}
