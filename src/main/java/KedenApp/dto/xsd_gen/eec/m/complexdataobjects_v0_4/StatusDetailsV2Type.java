
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.StatusCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие детализированную информацию о статусном состоянии чего-либо (объекта, явления, документа, процесса и т.п.)
 * 
 * <p>Java class for StatusDetailsV2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusDetailsV2Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EventDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}StatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}NoteText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocReferenceDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusDetailsV2Type", propOrder = {
    "eventDate",
    "statusCode",
    "noteText",
    "docReferenceDetails"
})
public class StatusDetailsV2Type {

    @XmlElement(name = "EventDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "StatusCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected StatusCodeType statusCode;
    @XmlElement(name = "NoteText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected List<String> noteText;
    @XmlElement(name = "DocReferenceDetails")
    protected DocReferenceDetailsType docReferenceDetails;

    /**
     * Дата установки статусного состояния
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Кодовое обозначение статусного состояния
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeType }
     *     
     */
    public StatusCodeType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeType }
     *     
     */
    public void setStatusCode(StatusCodeType value) {
        this.statusCode = value;
    }

    /**
     * Примечание к статусному состоянию Gets the value of the noteText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the noteText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoteText() {
        if (noteText == null) {
            noteText = new ArrayList<String>();
        }
        return this.noteText;
    }

    /**
     * Документ, устанавливающий статусное состояние
     * 
     * @return
     *     possible object is
     *     {@link DocReferenceDetailsType }
     *     
     */
    public DocReferenceDetailsType getDocReferenceDetails() {
        return docReferenceDetails;
    }

    /**
     * Sets the value of the docReferenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocReferenceDetailsType }
     *     
     */
    public void setDocReferenceDetails(DocReferenceDetailsType value) {
        this.docReferenceDetails = value;
    }

}
