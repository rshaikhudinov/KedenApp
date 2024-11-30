
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие в символьном виде значение блока данных, размещенных в средстве идентификации
 * 
 * <p>Java class for IdentificationMeansDataUnitDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentificationMeansDataUnitDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}AIId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}IdentifacationMeansUnitCharacterValueId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentificationMeansDataUnitDetailsType", propOrder = {
    "aiId",
    "identifacationMeansUnitCharacterValueId"
})
public class IdentificationMeansDataUnitDetailsType {

    @XmlElement(name = "AIId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String aiId;
    @XmlElement(name = "IdentifacationMeansUnitCharacterValueId", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identifacationMeansUnitCharacterValueId;

    /**
     * Цифровой идентификатор блока информации, содержащейся в коде идентификации
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAIId() {
        return aiId;
    }

    /**
     * Sets the value of the aiId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAIId(String value) {
        this.aiId = value;
    }

    /**
     * значение идентификационного номера (идентификатора) или блока информации, содержащейся в коде идентификации, представленное в виде последовательности символов
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifacationMeansUnitCharacterValueId() {
        return identifacationMeansUnitCharacterValueId;
    }

    /**
     * Sets the value of the identifacationMeansUnitCharacterValueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifacationMeansUnitCharacterValueId(String value) {
        this.identifacationMeansUnitCharacterValueId = value;
    }

}
