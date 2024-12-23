
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.ClassifiedReferenceDataItemCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.ClassifiedReferenceDataItemNameType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие детализированную информацию о записи технологического справочника (классификатора)
 * 
 * <p>Java class for CodifiedListItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodifiedListItemDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CodifiedListItemCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CodifiedListItemName" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ParentCodifiedListItemCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}StartDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EndDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodifiedListItemDetailsType", propOrder = {
    "codifiedListItemCode",
    "codifiedListItemName",
    "parentCodifiedListItemCode",
    "startDate",
    "endDate"
})
public class CodifiedListItemDetailsType {

    @XmlElement(name = "CodifiedListItemCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected ClassifiedReferenceDataItemCodeType codifiedListItemCode;
    @XmlElement(name = "CodifiedListItemName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    protected List<ClassifiedReferenceDataItemNameType> codifiedListItemName;
    @XmlElement(name = "ParentCodifiedListItemCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected ClassifiedReferenceDataItemCodeType parentCodifiedListItemCode;
    @XmlElement(name = "StartDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;

    /**
     * Gets the value of the codifiedListItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedReferenceDataItemCodeType }
     *     
     */
    public ClassifiedReferenceDataItemCodeType getCodifiedListItemCode() {
        return codifiedListItemCode;
    }

    /**
     * Sets the value of the codifiedListItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedReferenceDataItemCodeType }
     *     
     */
    public void setCodifiedListItemCode(ClassifiedReferenceDataItemCodeType value) {
        this.codifiedListItemCode = value;
    }

    /**
     * Gets the value of the codifiedListItemName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the codifiedListItemName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodifiedListItemName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassifiedReferenceDataItemNameType }
     * 
     * 
     */
    public List<ClassifiedReferenceDataItemNameType> getCodifiedListItemName() {
        if (codifiedListItemName == null) {
            codifiedListItemName = new ArrayList<ClassifiedReferenceDataItemNameType>();
        }
        return this.codifiedListItemName;
    }

    /**
     * Gets the value of the parentCodifiedListItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link ClassifiedReferenceDataItemCodeType }
     *     
     */
    public ClassifiedReferenceDataItemCodeType getParentCodifiedListItemCode() {
        return parentCodifiedListItemCode;
    }

    /**
     * Sets the value of the parentCodifiedListItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassifiedReferenceDataItemCodeType }
     *     
     */
    public void setParentCodifiedListItemCode(ClassifiedReferenceDataItemCodeType value) {
        this.parentCodifiedListItemCode = value;
    }

    /**
     * Дата начала действия записи технологического справочника (классификатора)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Дата окончания действия записи технологического справочника (классификатора)
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

}
