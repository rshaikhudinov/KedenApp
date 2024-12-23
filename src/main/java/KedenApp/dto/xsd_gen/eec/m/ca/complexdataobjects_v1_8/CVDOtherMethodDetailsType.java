
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие общие сведения, указываемые при определении таможенной стоимости по методам, отличным от метода 1
 * 
 * <p>Java class for CVDOtherMethodDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CVDOtherMethodDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocV4Details" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CVDDecisionDocDetails" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CVDEvidenceDocumentDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}MethodReasonText" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CVDOtherMethodDetailsType", propOrder = {
    "docV4Details",
    "cvdDecisionDocDetails",
    "cvdEvidenceDocumentDetails",
    "methodReasonText"
})
public class CVDOtherMethodDetailsType {

    @XmlElement(name = "DocV4Details", namespace = "urn:EEC:M:ComplexDataObjects:v0.4.14", required = true)
    protected List<DocDetailsV4Type> docV4Details;
    @XmlElement(name = "CVDDecisionDocDetails")
    protected List<DocDetailsV4Type> cvdDecisionDocDetails;
    @XmlElement(name = "CVDEvidenceDocumentDetails", required = true)
    protected List<CVDEvidenceDocumentDetailsType> cvdEvidenceDocumentDetails;
    @XmlElement(name = "MethodReasonText", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    protected List<String> methodReasonText;

    /**
     * сведения о документе, подтверждающем совершение сделки, а также о приложениях, дополнениях и изменениях к нему, или о документе, подтверждающем право владения, пользования и (или) распоряжения ввозимыми товарами Gets the value of the docV4Details property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the docV4Details property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocV4Details().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocDetailsV4Type }
     * 
     * 
     */
    public List<DocDetailsV4Type> getDocV4Details() {
        if (docV4Details == null) {
            docV4Details = new ArrayList<DocDetailsV4Type>();
        }
        return this.docV4Details;
    }

    /**
     * Сведения о документе с принятыми таможенными органами решениями по результатам таможенного контроля таможенной стоимости ранее ввезенных товаров либо решениями судебных органов в отношении таких товаров Gets the value of the cvdDecisionDocDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cvdDecisionDocDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCVDDecisionDocDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocDetailsV4Type }
     * 
     * 
     */
    public List<DocDetailsV4Type> getCVDDecisionDocDetails() {
        if (cvdDecisionDocDetails == null) {
            cvdDecisionDocDetails = new ArrayList<DocDetailsV4Type>();
        }
        return this.cvdDecisionDocDetails;
    }

    /**
     * Сведения о документе, на основании которого заполнена декларация таможенной стоимости Gets the value of the cvdEvidenceDocumentDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the cvdEvidenceDocumentDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCVDEvidenceDocumentDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CVDEvidenceDocumentDetailsType }
     * 
     * 
     */
    public List<CVDEvidenceDocumentDetailsType> getCVDEvidenceDocumentDetails() {
        if (cvdEvidenceDocumentDetails == null) {
            cvdEvidenceDocumentDetails = new ArrayList<CVDEvidenceDocumentDetailsType>();
        }
        return this.cvdEvidenceDocumentDetails;
    }

    /**
     * Gets the value of the methodReasonText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the methodReasonText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMethodReasonText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMethodReasonText() {
        if (methodReasonText == null) {
            methodReasonText = new ArrayList<String>();
        }
        return this.methodReasonText;
    }

}
