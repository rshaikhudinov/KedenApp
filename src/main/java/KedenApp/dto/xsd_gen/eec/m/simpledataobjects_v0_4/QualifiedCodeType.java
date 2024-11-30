
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CACountryCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CargoPackageModeKindCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CountryNumber3CodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsProcedureCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxModeCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxPaymentFeatureCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxPaymentMethodCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.CustomsTaxPrefCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.DeclarationFeatureCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.DeliveryTermsCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.GoodsLocationCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.GoodsMoveFeatureCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.LocationCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.NoGuaranteeCauseCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.OffenceCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentGuaranteeMethodCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PositionCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.SimplificationCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TNVEDNoteKindCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransitGuaranteeMeasureCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransitProcedureCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.TransportTypeCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.ValuationMethodCodeType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.VehcicleMakeCodeType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * Строка символов, представляющая кодовое обозначение объекта, с указанием справочника (классификатора)
 * 
 * <p>Java class for QualifiedCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualifiedCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:BaseDataTypes:v0.4.14&gt;CodeType"&gt;
 *       &lt;attribute name="codeListId" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataIdType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedCodeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    ValuationMethodCodeType.class,
    CACountryCodeType.class,
    CargoPackageModeKindCodeType.class,
    CountryNumber3CodeType.class,
    CustomsTaxPrefCodeType.class,
    CustomsProcedureCodeType.class,
    CustomsTaxModeCodeType.class,
    CustomsTaxPaymentFeatureCodeType.class,
    CustomsTaxPaymentMethodCodeType.class,
    DeclarationFeatureCodeType.class,
    DeliveryTermsCodeType.class,
    UnifiedCountryCodeType.class,
    GoodsLocationCodeType.class,
    GoodsMoveFeatureCodeType.class,
    LocationCodeType.class,
    NoGuaranteeCauseCodeType.class,
    OffenceCodeType.class,
    PaymentGuaranteeMethodCodeType.class,
    UnifiedCode20Type.class,
    SimplificationCodeType.class,
    TNVEDNoteKindCodeType.class,
    TransitGuaranteeMeasureCodeType.class,
    TransitProcedureCodeType.class,
    TransportTypeCodeType.class,
    VehcicleMakeCodeType.class,
    PositionCodeType.class,
    EAEUDocKindCodeType.class,
    PackageKindCodeType.class,
    UnifiedCurrencyCodeType.class,
    UnifiedCurrencyN3CodeType.class,
    VehicleEcoClassCodeType.class,
    VehicleMakeCodeType.class,
    DocKindCodeType.class,
    UnifiedMeasurementUnitCodeType.class,
    UnifiedPackageKindCodeType.class,
    UnifiedTransportModeCodeType.class
})
@Data
@Accessors(chain = true)
public class QualifiedCodeType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "codeListId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String codeListId;
}
