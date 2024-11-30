
package KedenApp.dto.xsd_gen.eec.r_043_expresscargodeclaration_v2_1;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.CustomsDocumentIdDetailsType;
import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.ECGoodsShipmentDetailsType;
import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.RegisterDocumentIdDetailsType;
import KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8.SignatoryPersonDetailsV2Type;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsProcedureCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.DeclarationFeatureCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * Декларация на товары и пассажирская таможенная декларация для экспресс-грузов
 * 
 * <p>Java class for ExpressCargoDeclarationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpressCargoDeclarationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EDocCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EDocId"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EDocRefId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}EDocDateTime"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ExpressRegistryKindCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ObjectOrdinal" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ExpressCargoDeclarationIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DeclarationKindCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CustomsProcedureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}PreviousCustomsProcedureModeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}DeclarationFeatureCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EDocIndicatorCode"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}PageQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}ECGoodsShipmentDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}RegisterDocumentIdDetails" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}SignatoryPersonV2Details" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpressCargoDeclarationType", propOrder = {
    "eDocCode",
    "eDocId",
    "eDocRefId",
    "eDocDateTime",
    "expressRegistryKindCode",
    "objectOrdinal",
    "expressCargoDeclarationIdDetails",
    "declarationKindCode",
    "customsProcedureCode",
    "previousCustomsProcedureModeCode",
    "declarationFeatureCode",
    "eDocIndicatorCode",
    "pageQuantity",
    "ecGoodsShipmentDetails",
    "registerDocumentIdDetails",
    "signatoryPersonV2Details"
})
@Data
@Accessors(chain = true)
public class ExpressCargoDeclarationType {

    @XmlElement(name = "EDocCode", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eDocCode;
    @XmlElement(name = "EDocId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eDocId;
    @XmlElement(name = "EDocRefId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eDocRefId;
    @XmlElement(name = "EDocDateTime", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eDocDateTime;
    @XmlElement(name = "ExpressRegistryKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String expressRegistryKindCode;
    @XmlElement(name = "ObjectOrdinal", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger objectOrdinal;
    @XmlElement(name = "ExpressCargoDeclarationIdDetails", namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1")
    protected CustomsDocumentIdDetailsType expressCargoDeclarationIdDetails;
    @XmlElement(name = "DeclarationKindCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String declarationKindCode;
    @XmlElement(name = "CustomsProcedureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CustomsProcedureCodeType customsProcedureCode;
    @XmlElement(name = "PreviousCustomsProcedureModeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected CustomsProcedureCodeType previousCustomsProcedureModeCode;
    @XmlElement(name = "DeclarationFeatureCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected DeclarationFeatureCodeType declarationFeatureCode;
    @XmlElement(name = "EDocIndicatorCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String eDocIndicatorCode;
    @XmlElement(name = "PageQuantity", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger pageQuantity;
    @XmlElement(name = "ECGoodsShipmentDetails", namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1")
    protected ECGoodsShipmentDetailsType ecGoodsShipmentDetails;
    @XmlElement(name = "RegisterDocumentIdDetails", namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1")
    protected RegisterDocumentIdDetailsType registerDocumentIdDetails;
    @XmlElement(name = "SignatoryPersonV2Details", namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1")
    protected SignatoryPersonDetailsV2Type signatoryPersonV2Details;
}
