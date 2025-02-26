
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие сведения о диапазоне идентификационных номеров (идентификаторов) контрольных (идентификационных) знаков
 * 
 * <p>Java class for CIMRangeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CIMRangeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}FirstVisualIdentifierCIMId"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LastVisualIdentifierCIMId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CIMRangeDetailsType", propOrder = {
    "firstVisualIdentifierCIMId",
    "lastVisualIdentifierCIMId"
})
public class CIMRangeDetailsType {

    @XmlElement(name = "FirstVisualIdentifierCIMId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String firstVisualIdentifierCIMId;
    @XmlElement(name = "LastVisualIdentifierCIMId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String lastVisualIdentifierCIMId;

    /**
     * Gets the value of the firstVisualIdentifierCIMId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstVisualIdentifierCIMId() {
        return firstVisualIdentifierCIMId;
    }

    /**
     * Sets the value of the firstVisualIdentifierCIMId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstVisualIdentifierCIMId(String value) {
        this.firstVisualIdentifierCIMId = value;
    }

    /**
     * Gets the value of the lastVisualIdentifierCIMId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastVisualIdentifierCIMId() {
        return lastVisualIdentifierCIMId;
    }

    /**
     * Sets the value of the lastVisualIdentifierCIMId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastVisualIdentifierCIMId(String value) {
        this.lastVisualIdentifierCIMId = value;
    }

}
