
package KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4;

import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.CADocBaseType;
import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.GoodsDeclarationChangeDetailsType;
import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.PIATTransportDocumentDetailsType;
import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.PaymentDocDetailsType;
import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.RefLicenseIdDetailsType;
import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.SanitaryControlDocDetailsType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * Компоненты, представляющие детализированную информацию о документе
 * 
 * <p>Java class for DocDetailsV4Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocDetailsV4Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DocCreationDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocDetailsV4Type", propOrder = {
    "docKindCode",
    "docName",
    "docId",
    "docCreationDate"
})
@XmlSeeAlso({
    GoodsDeclarationChangeDetailsType.class,
    PIATTransportDocumentDetailsType.class,
    PaymentDocDetailsType.class,
    RefLicenseIdDetailsType.class,
    SanitaryControlDocDetailsType.class,
    CADocBaseType.class
})
@Data
@Accessors(chain = true)
public class DocDetailsV4Type {

    @XmlElement(name = "DocKindCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedCode20Type docKindCode;
    @XmlElement(name = "DocName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docName;
    @XmlElement(name = "DocId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String docId;
    @XmlElement(name = "DocCreationDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected String docCreationDate;
}
