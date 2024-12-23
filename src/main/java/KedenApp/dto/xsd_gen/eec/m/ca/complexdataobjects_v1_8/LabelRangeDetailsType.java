
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие информацию о диапазоне номеров меток, бирок, наклеек и т.п.
 * 
 * <p>Java class for LabelRangeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LabelRangeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}FirstLabelId"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LastLabelId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LabelRangeDetailsType", propOrder = {
    "firstLabelId",
    "lastLabelId"
})
public class LabelRangeDetailsType {

    @XmlElement(name = "FirstLabelId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstLabelId;
    @XmlElement(name = "LastLabelId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lastLabelId;

    /**
     * Первый номер (идентификатор) диапазона
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstLabelId() {
        return firstLabelId;
    }

    /**
     * Sets the value of the firstLabelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstLabelId(String value) {
        this.firstLabelId = value;
    }

    /**
     * Последний номер (идентификатор) диапазона
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastLabelId() {
        return lastLabelId;
    }

    /**
     * Sets the value of the lastLabelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastLabelId(String value) {
        this.lastLabelId = value;
    }

}
