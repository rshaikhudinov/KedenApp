
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * компоненты, представляющие базовые сведения о товаре в таможенной декларации
 * 
 * <p>Java class for CADTGoodsBaseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CADTGoodsBaseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CAGoodsBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedGrossMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}UnifiedNetMassMeasure" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}GoodsMeasureDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CADTGoodsBaseDetailsType", propOrder = {
    "unifiedGrossMassMeasure",
    "unifiedNetMassMeasure",
    "goodsMeasureDetails"
})
@XmlSeeAlso({
    CPCGoodsItemDetailsType.class,
    DTExchGoodsItemDetailsType.class,
    DTStatGoodsDetailsType.class,
    DeclarationGoodsItemDetailsType.class,
    ECGoodsItemDetailsType.class,
    GDCExchGoodsItemDetailsType.class,
    GDGoodsItemDetailsType.class,
    GRAGoodsItemDetailsType.class,
    GoodsPartViewDetailsType.class,
    PDGoodsItemDetailsType.class,
    PGCGoodsItemDetailsType.class,
    PIARConsignmentItemDetailsType.class,
    PIATConsignmentItemDetailsType.class,
    PIVConsignmentItemDetailsType.class,
    PIWConsignmentItemDetailsType.class,
    TDGoodsItemInfoDetailsType.class,
    TDExchGoodsItemDetailsType.class,
    TDGoodsItemDetailsType.class,
    TIRGoodsItemDetailsType.class,
    TransitGoodsItemDetailsType.class
})
@Data
@Accessors(chain = true)
public class CADTGoodsBaseDetailsType
    extends CAGoodsBaseType
{

    @XmlElement(name = "UnifiedGrossMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedGrossMassMeasure;
    @XmlElement(name = "UnifiedNetMassMeasure", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected UnifiedPhysicalMeasureType unifiedNetMassMeasure;
    @XmlElement(name = "GoodsMeasureDetails")
    protected GoodsMeasureDetailsType goodsMeasureDetails;
}
