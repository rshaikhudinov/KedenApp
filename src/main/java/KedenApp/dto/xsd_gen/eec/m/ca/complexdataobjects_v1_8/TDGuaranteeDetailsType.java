
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransitGuaranteeMeasureCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие сведения о мере обеспечения соблюдения процедуры таможенного транзита
 * 
 * <p>Java class for TDGuaranteeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TDGuaranteeDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TransitGuaranteeMeasureCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocId" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDGuaranteeDetailsType", propOrder = {
    "transitGuaranteeMeasureCode",
    "docId"
})
public class TDGuaranteeDetailsType {

    @XmlElement(name = "TransitGuaranteeMeasureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected TransitGuaranteeMeasureCodeType transitGuaranteeMeasureCode;
    @XmlElement(name = "DocId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docId;

    /**
     * Gets the value of the transitGuaranteeMeasureCode property.
     * 
     * @return
     *     possible object is
     *     {@link TransitGuaranteeMeasureCodeType }
     *     
     */
    public TransitGuaranteeMeasureCodeType getTransitGuaranteeMeasureCode() {
        return transitGuaranteeMeasureCode;
    }

    /**
     * Sets the value of the transitGuaranteeMeasureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransitGuaranteeMeasureCodeType }
     *     
     */
    public void setTransitGuaranteeMeasureCode(TransitGuaranteeMeasureCodeType value) {
        this.transitGuaranteeMeasureCode = value;
    }

    /**
     * Номер сертификата или иного документа, подтверждающего применение мер обеспечения соблюдения таможенного транзита, либо номер свидетельства о включении в реестр таможенных перевозчиков, либо в реестр уполномоченных экономических операторов
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocId() {
        return docId;
    }

    /**
     * Sets the value of the docId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocId(String value) {
        this.docId = value;
    }

}
