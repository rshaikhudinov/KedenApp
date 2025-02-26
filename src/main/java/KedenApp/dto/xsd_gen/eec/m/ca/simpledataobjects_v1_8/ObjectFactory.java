
package KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.AmountWithCurrencyV3Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.FractionNumber10MeasureType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.Picture10MbType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.TransportMeansRegIdType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedAmountWithCurrencyType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCode20Type;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedCountryCodeType;
import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.UnifiedPhysicalMeasureType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eec.m.ca.simpledataobjects.v1_8 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AEORegistryKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AEORegistryKindCode");
    private final static QName _AIId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AIId");
    private final static QName _ATACarnetAuthorityCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ATACarnetAuthorityCode");
    private final static QName _ATAConsignmentItemOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ATAConsignmentItemOrdinal");
    private final static QName _ATAPageOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ATAPageOrdinal");
    private final static QName _AbnormalDiseasePersonIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AbnormalDiseasePersonIndicator");
    private final static QName _ActionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ActionCode");
    private final static QName _AddPageQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AddPageQuantity");
    private final static QName _AddProductionValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AddProductionValueAmount");
    private final static QName _AffectedAreaVisitIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AffectedAreaVisitIndicator");
    private final static QName _AggregationKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AggregationKindCode");
    private final static QName _AirlineId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AirlineId");
    private final static QName _AntiepidemicEquipmentIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AntiepidemicEquipmentIndicator");
    private final static QName _AppointmentCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AppointmentCode");
    private final static QName _ApproximateValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ApproximateValueAmount");
    private final static QName _ApproximateValueIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ApproximateValueIndicator");
    private final static QName _ArrivalDateTime_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ArrivalDateTime");
    private final static QName _ArrivePointName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ArrivePointName");
    private final static QName _ArrivePointPADCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ArrivePointPADCode");
    private final static QName _ArrivePointSequenceCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ArrivePointSequenceCode");
    private final static QName _AssemblyValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AssemblyValueAmount");
    private final static QName _AttachmentCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AttachmentCode");
    private final static QName _AutoRegionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AutoRegionCode");
    private final static QName _AutomaticDecisionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "AutomaticDecisionCode");
    private final static QName _BYCurrencyQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "BYCurrencyQuantity");
    private final static QName _BYIndirectCurrencyQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "BYIndirectCurrencyQuantity");
    private final static QName _BaseValuationMethodCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "BaseValuationMethodCode");
    private final static QName _BillOfLandingOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "BillOfLandingOrdinal");
    private final static QName _BinaryFileName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "BinaryFileName");
    private final static QName _BorderCheckPointCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "BorderCheckPointCode");
    private final static QName _BorderCheckPointName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "BorderCheckPointName");
    private final static QName _BorderCustomsOfficeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "BorderCustomsOfficeCode");
    private final static QName _BorderDistanceMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "BorderDistanceMeasure");
    private final static QName _BranchFlagCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "BranchFlagCode");
    private final static QName _BrokerageAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "BrokerageAmount");
    private final static QName _CACountryCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CACountryCode");
    private final static QName _CAInvoiceValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CAInvoiceValueAmount");
    private final static QName _CAPaymentAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CAPaymentAmount");
    private final static QName _CAPaymentNAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CAPaymentNAmount");
    private final static QName _CAProductCostAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CAProductCostAmount");
    private final static QName _CAShipmentValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CAShipmentValueAmount");
    private final static QName _CAUniqueCustomsNumberId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CAUniqueCustomsNumberId");
    private final static QName _CAValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CAValueAmount");
    private final static QName _CDVConsignmentItemOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CDVConsignmentItemOrdinal");
    private final static QName _CIMMarkingCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CIMMarkingCode");
    private final static QName _CIMQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CIMQuantity");
    private final static QName _CIMSignCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CIMSignCode");
    private final static QName _CRCommodityKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CRCommodityKindCode");
    private final static QName _CRFactPayerIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CRFactPayerIndicator");
    private final static QName _CRGoodsKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CRGoodsKindCode");
    private final static QName _CRObjectCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CRObjectCode");
    private final static QName _CRPaymentsKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CRPaymentsKindCode");
    private final static QName _CRPreviosCustomsDocKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CRPreviosCustomsDocKindCode");
    private final static QName _CRPurposeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CRPurposeCode");
    private final static QName _CRRFObjectKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CRRFObjectKindCode");
    private final static QName _CRRFPurposeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CRRFPurposeCode");
    private final static QName _CRTaxAllowanceCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CRTaxAllowanceCode");
    private final static QName _CVDAdditionalInformationKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CVDAdditionalInformationKindCode");
    private final static QName _CVDFormCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CVDFormCode");
    private final static QName _CabinQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CabinQuantity");
    private final static QName _CapacityMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CapacityMeasure");
    private final static QName _CapacityQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CapacityQuantity");
    private final static QName _CargoDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CargoDescriptionText");
    private final static QName _CargoKindName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CargoKindName");
    private final static QName _CargoLabelDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CargoLabelDescriptionText");
    private final static QName _CargoOperationKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CargoOperationKindCode");
    private final static QName _CargoPackageInfoKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CargoPackageInfoKindCode");
    private final static QName _CargoPackageKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CargoPackageKindCode");
    private final static QName _CargoPartQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CargoPartQuantity");
    private final static QName _CargoQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CargoQuantity");
    private final static QName _CarrierOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CarrierOrdinal");
    private final static QName _CarrierReplacementIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CarrierReplacementIndicator");
    private final static QName _ChangeIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ChangeIndicator");
    private final static QName _CheckPointBandwidthMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointBandwidthMeasure");
    private final static QName _CheckPointCapacityInformationIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointCapacityInformationIndicator");
    private final static QName _CheckPointCharacterCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointCharacterCode");
    private final static QName _CheckPointFunctionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointFunctionCode");
    private final static QName _CheckPointFunctionName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointFunctionName");
    private final static QName _CheckPointLinkFunctionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointLinkFunctionText");
    private final static QName _CheckPointLinkKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointLinkKindCode");
    private final static QName _CheckPointLinkName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointLinkName");
    private final static QName _CheckPointStatusCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointStatusCode");
    private final static QName _CheckPointStatusName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointStatusName");
    private final static QName _CheckPointSystemObjectQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointSystemObjectQuantity");
    private final static QName _CheckPointTVLocationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointTVLocationCode");
    private final static QName _CheckPointTVLocationText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointTVLocationText");
    private final static QName _CheckPointTrafficKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointTrafficKindCode");
    private final static QName _CheckPointTrafficObjectCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CheckPointTrafficObjectCode");
    private final static QName _ChemicalName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ChemicalName");
    private final static QName _CleanNetMassMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CleanNetMassMeasure");
    private final static QName _ClosedReasonCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ClosedReasonCode");
    private final static QName _CommercialLevelAdjustmentAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CommercialLevelAdjustmentAmount");
    private final static QName _CommodityAddCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CommodityAddCode");
    private final static QName _CommodityCheckIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CommodityCheckIndicator");
    private final static QName _CommodityCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CommodityCode");
    private final static QName _CompareOperationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CompareOperationCode");
    private final static QName _CompareOperationIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CompareOperationIndicator");
    private final static QName _CompatibleProgramName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CompatibleProgramName");
    private final static QName _ConcentrationMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ConcentrationMeasure");
    private final static QName _ConditionArrivalCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ConditionArrivalCode");
    private final static QName _ConsignmentItemOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ConsignmentItemOrdinal");
    private final static QName _ContainerDeclarationKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ContainerDeclarationKindCode");
    private final static QName _ContainerId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ContainerId");
    private final static QName _ContainerIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ContainerIndicator");
    private final static QName _ContainerQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ContainerQuantity");
    private final static QName _ControlSystemKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ControlSystemKindCode");
    private final static QName _ConveyanceMethodCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ConveyanceMethodCode");
    private final static QName _CountGreenLinesQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CountGreenLinesQuantity");
    private final static QName _CountRedLinesQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CountRedLinesQuantity");
    private final static QName _CountryChangeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CountryChangeCode");
    private final static QName _CountryN3Code_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CountryN3Code");
    private final static QName _CrewDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CrewDescriptionText");
    private final static QName _CrewIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CrewIndicator");
    private final static QName _CrewQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CrewQuantity");
    private final static QName _CryptoIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CryptoIndicator");
    private final static QName _CubageMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CubageMeasure");
    private final static QName _CurrencyCostAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CurrencyCostAmount");
    private final static QName _CurrencyName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CurrencyName");
    private final static QName _CustomsClearanceChargesPrefCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsClearanceChargesPrefCode");
    private final static QName _CustomsControlFormCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsControlFormCode");
    private final static QName _CustomsControlFormDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsControlFormDescriptionText");
    private final static QName _CustomsControlMeasureCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsControlMeasureCode");
    private final static QName _CustomsControlZoneId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsControlZoneId");
    private final static QName _CustomsCostChangeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsCostChangeCode");
    private final static QName _CustomsDecisionModeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsDecisionModeCode");
    private final static QName _CustomsDocumentId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsDocumentId");
    private final static QName _CustomsDocumentKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsDocumentKindCode");
    private final static QName _CustomsDocumentOrdinalId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsDocumentOrdinalId");
    private final static QName _CustomsDutyPrefCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsDutyPrefCode");
    private final static QName _CustomsEscortIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsEscortIndicator");
    private final static QName _CustomsIdentificationMeansId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsIdentificationMeansId");
    private final static QName _CustomsIdentificationMeansKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsIdentificationMeansKindCode");
    private final static QName _CustomsIdentificationMethodCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsIdentificationMethodCode");
    private final static QName _CustomsMarkCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsMarkCode");
    private final static QName _CustomsOfficeChangeKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsOfficeChangeKindCode");
    private final static QName _CustomsOfficeFullName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsOfficeFullName");
    private final static QName _CustomsOfficeIndicatorCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsOfficeIndicatorCode");
    private final static QName _CustomsOfficeOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsOfficeOrdinal");
    private final static QName _CustomsOfficePreviousCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsOfficePreviousCode");
    private final static QName _CustomsOfficeRevisedCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsOfficeRevisedCode");
    private final static QName _CustomsOperationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsOperationCode");
    private final static QName _CustomsOperationRestrictionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsOperationRestrictionText");
    private final static QName _CustomsOperationText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsOperationText");
    private final static QName _CustomsPaymentChangeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsPaymentChangeCode");
    private final static QName _CustomsPersonIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsPersonIndicator");
    private final static QName _CustomsProcedureCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsProcedureCode");
    private final static QName _CustomsProcedureTerminationDateTime_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsProcedureTerminationDateTime");
    private final static QName _CustomsReceiptDocId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsReceiptDocId");
    private final static QName _CustomsTaxModeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsTaxModeCode");
    private final static QName _CustomsTaxModeName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsTaxModeName");
    private final static QName _CustomsTaxPaymentFeatureCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsTaxPaymentFeatureCode");
    private final static QName _CustomsTaxPaymentMethodCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsTaxPaymentMethodCode");
    private final static QName _CustomsTaxPaymentNoApplyCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsTaxPaymentNoApplyCode");
    private final static QName _CustomsValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsValueAmount");
    private final static QName _CustomsValueCheckIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsValueCheckIndicator");
    private final static QName _CustomsValueCorrectCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsValueCorrectCode");
    private final static QName _CustomsValueDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsValueDate");
    private final static QName _CustomsValueDecisionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsValueDecisionCode");
    private final static QName _CustomsValuePreviousAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "CustomsValuePreviousAmount");
    private final static QName _DTConsignmentItemOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DTConsignmentItemOrdinal");
    private final static QName _DamagedCargoAreaIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DamagedCargoAreaIndicator");
    private final static QName _DamagedSealIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DamagedSealIndicator");
    private final static QName _DangerIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DangerIndicator");
    private final static QName _DangerousGoodsIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DangerousGoodsIndicator");
    private final static QName _DataReasonCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DataReasonCode");
    private final static QName _DeadIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeadIndicator");
    private final static QName _DeadQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeadQuantity");
    private final static QName _DecisionReasonText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DecisionReasonText");
    private final static QName _DeclRegistrationDecisionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeclRegistrationDecisionCode");
    private final static QName _DeclarationChangeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeclarationChangeCode");
    private final static QName _DeclarationFeatureCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeclarationFeatureCode");
    private final static QName _DeclarationId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeclarationId");
    private final static QName _DeclarationKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeclarationKindCode");
    private final static QName _DeclarationRegistryAuthorityCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeclarationRegistryAuthorityCode");
    private final static QName _DefectCustomsIdentificationMeansIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DefectCustomsIdentificationMeansIndicator");
    private final static QName _DeliveryExtensionReasonText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeliveryExtensionReasonText");
    private final static QName _DeliveryKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeliveryKindCode");
    private final static QName _DeliveryPlaceName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeliveryPlaceName");
    private final static QName _DeliveryTermsCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeliveryTermsCode");
    private final static QName _DepartureCountryCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DepartureCountryCode");
    private final static QName _DepartureCustomsOfficeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DepartureCustomsOfficeCode");
    private final static QName _DepartureDateTime_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DepartureDateTime");
    private final static QName _DesignUnionValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DesignUnionValueAmount");
    private final static QName _DesignValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DesignValueAmount");
    private final static QName _DespatchId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DespatchId");
    private final static QName _DestinationCountryCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DestinationCountryCode");
    private final static QName _DestinationCustomsOfficeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DestinationCustomsOfficeCode");
    private final static QName _DestinationPlaceName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DestinationPlaceName");
    private final static QName _DeviceId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DeviceId");
    private final static QName _DiffPaymentNumericAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DiffPaymentNumericAmount");
    private final static QName _DifferenceCAPaymentAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DifferenceCAPaymentAmount");
    private final static QName _DifferenceCAPaymentNAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DifferenceCAPaymentNAmount");
    private final static QName _DischargeIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DischargeIndicator");
    private final static QName _DiseaseConfirmCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DiseaseConfirmCode");
    private final static QName _DiseaseDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DiseaseDate");
    private final static QName _DiseaseDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DiseaseDescriptionText");
    private final static QName _DiseaseOutcomeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DiseaseOutcomeCode");
    private final static QName _DiseasePersonQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DiseasePersonQuantity");
    private final static QName _DiseaseSpreadIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DiseaseSpreadIndicator");
    private final static QName _DiseaseSpreadText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DiseaseSpreadText");
    private final static QName _DiseasedPersonLocationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DiseasedPersonLocationCode");
    private final static QName _DisinfectionIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DisinfectionIndicator");
    private final static QName _DisinfectionMethodName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DisinfectionMethodName");
    private final static QName _DisinfestationIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DisinfestationIndicator");
    private final static QName _DisinfestationKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DisinfestationKindCode");
    private final static QName _DisinfestationMethodText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DisinfestationMethodText");
    private final static QName _DisinfestationPlaceText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DisinfestationPlaceText");
    private final static QName _DocAddInfoCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DocAddInfoCode");
    private final static QName _DocEffectiveDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DocEffectiveDate");
    private final static QName _DocPresentDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DocPresentDate");
    private final static QName _DocPresentKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DocPresentKindCode");
    private final static QName _DocUsageCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DocUsageCode");
    private final static QName _DocumentBoxId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DocumentBoxId");
    private final static QName _DocumentQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DocumentQuantity");
    private final static QName _DoseMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DoseMeasure");
    private final static QName _DoubleCorridorExistenceIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DoubleCorridorExistenceIndicator");
    private final static QName _DraftMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DraftMeasure");
    private final static QName _DrugsIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DrugsIndicator");
    private final static QName _DutyTaxFeeCheckIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DutyTaxFeeCheckIndicator");
    private final static QName _DutyTaxFeeRateDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DutyTaxFeeRateDate");
    private final static QName _DutyTaxFeeRateKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DutyTaxFeeRateKindCode");
    private final static QName _DutyTaxFeeRateValue_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "DutyTaxFeeRateValue");
    private final static QName _EArchId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EArchId");
    private final static QName _ECOClassCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ECOClassCode");
    private final static QName _EDeclarationCustomsOfficeListCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EDeclarationCustomsOfficeListCode");
    private final static QName _EDocArchId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EDocArchId");
    private final static QName _EDocCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EDocCode");
    private final static QName _EDocIndicatorCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EDocIndicatorCode");
    private final static QName _EmbarkationDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EmbarkationDate");
    private final static QName _EmergencyDeviceId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EmergencyDeviceId");
    private final static QName _EngineKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EngineKindCode");
    private final static QName _EngineModelCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EngineModelCode");
    private final static QName _EngineVolumeMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EngineVolumeMeasure");
    private final static QName _EqualIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EqualIndicator");
    private final static QName _EquipmentErrorText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EquipmentErrorText");
    private final static QName _EquipmentModelName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EquipmentModelName");
    private final static QName _EquipmentQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EquipmentQuantity");
    private final static QName _EquipmentTypeName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "EquipmentTypeName");
    private final static QName _ExchangePostOfficeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExchangePostOfficeCode");
    private final static QName _ExchangeRate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExchangeRate");
    private final static QName _ExchangeRateDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExchangeRateDate");
    private final static QName _ExciseFirstStampId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExciseFirstStampId");
    private final static QName _ExciseLastStampId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExciseLastStampId");
    private final static QName _ExcisePrefCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExcisePrefCode");
    private final static QName _ExciseStampId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExciseStampId");
    private final static QName _ExciseStampQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExciseStampQuantity");
    private final static QName _ExciseStampSeriesId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExciseStampSeriesId");
    private final static QName _ExploitationDuration_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExploitationDuration");
    private final static QName _ExportCancelDateTime_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExportCancelDateTime");
    private final static QName _ExportCancellationReasonCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExportCancellationReasonCode");
    private final static QName _ExportCancellationReasonName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExportCancellationReasonName");
    private final static QName _ExportDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExportDate");
    private final static QName _ExportDateTime_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExportDateTime");
    private final static QName _ExportElectricPowerMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExportElectricPowerMeasure");
    private final static QName _ExpositionDuration_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExpositionDuration");
    private final static QName _ExpressRegistryKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ExpressRegistryKindCode");
    private final static QName _FECustomsOfficeListCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FECustomsOfficeListCode");
    private final static QName _FactGrossMassMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FactGrossMassMeasure");
    private final static QName _FactPaidAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FactPaidAmount");
    private final static QName _FactPaymentCheckIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FactPaymentCheckIndicator");
    private final static QName _FactVolumeMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FactVolumeMeasure");
    private final static QName _FieldName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FieldName");
    private final static QName _FirstLabelId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FirstLabelId");
    private final static QName _FirstReferenceOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FirstReferenceOrdinal");
    private final static QName _FirstTrailerRegId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FirstTrailerRegId");
    private final static QName _FirstVisualIdentifierCIMId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FirstVisualIdentifierCIMId");
    private final static QName _FlightId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FlightId");
    private final static QName _ForeignCustomsIdentificationMeansIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ForeignCustomsIdentificationMeansIndicator");
    private final static QName _FreePracticeRestrictionIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FreePracticeRestrictionIndicator");
    private final static QName _FullItemCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "FullItemCode");
    private final static QName _GCAcceptCancellationReasonCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GCAcceptCancellationReasonCode");
    private final static QName _GCCancellationReasonCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GCCancellationReasonCode");
    private final static QName _GCChangeRejectReasonCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GCChangeRejectReasonCode");
    private final static QName _GCRegistrationCancelReasonCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GCRegistrationCancelReasonCode");
    private final static QName _GCRejectReasonCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GCRejectReasonCode");
    private final static QName _GDCConsignmentItemOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GDCConsignmentItemOrdinal");
    private final static QName _GDCGoodsQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GDCGoodsQuantity");
    private final static QName _GDCSecurityLabelId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GDCSecurityLabelId");
    private final static QName _GoodsArticleName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsArticleName");
    private final static QName _GoodsCategoryCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsCategoryCode");
    private final static QName _GoodsClassificationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsClassificationCode");
    private final static QName _GoodsComponentCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsComponentCode");
    private final static QName _GoodsDangerText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsDangerText");
    private final static QName _GoodsDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsDescriptionText");
    private final static QName _GoodsDetentionReasonText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsDetentionReasonText");
    private final static QName _GoodsDisassembledCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsDisassembledCode");
    private final static QName _GoodsFeatureCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsFeatureCode");
    private final static QName _GoodsFullyExportedIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsFullyExportedIndicator");
    private final static QName _GoodsIdentificationMethodText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsIdentificationMethodText");
    private final static QName _GoodsInspectionIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsInspectionIndicator");
    private final static QName _GoodsIssueDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsIssueDate");
    private final static QName _GoodsLabelDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsLabelDescriptionText");
    private final static QName _GoodsLocationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsLocationCode");
    private final static QName _GoodsLocationName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsLocationName");
    private final static QName _GoodsMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsMeasure");
    private final static QName _GoodsMilitaryIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsMilitaryIndicator");
    private final static QName _GoodsMoveFeatureCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsMoveFeatureCode");
    private final static QName _GoodsProhibitionFreeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsProhibitionFreeCode");
    private final static QName _GoodsQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsQuantity");
    private final static QName _GoodsQuotaMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsQuotaMeasure");
    private final static QName _GoodsRestrictionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsRestrictionText");
    private final static QName _GoodsSubstituteText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsSubstituteText");
    private final static QName _GoodsTraceabilityCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsTraceabilityCode");
    private final static QName _GoodsTranshsipmentIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsTranshsipmentIndicator");
    private final static QName _GoodsUnitPriceAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsUnitPriceAmount");
    private final static QName _GoodsUsageDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GoodsUsageDescriptionText");
    private final static QName _GovControlKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GovControlKindCode");
    private final static QName _GovControlKindName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GovControlKindName");
    private final static QName _GrossTonnageMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GrossTonnageMeasure");
    private final static QName _GuaranteeAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GuaranteeAmount");
    private final static QName _GuaranteeCauseCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GuaranteeCauseCode");
    private final static QName _GuaranteeCertificateRegId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GuaranteeCertificateRegId");
    private final static QName _GuaranteeCertificateValidityDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GuaranteeCertificateValidityDate");
    private final static QName _GuaranteeIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GuaranteeIndicator");
    private final static QName _GuaranteeNAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GuaranteeNAmount");
    private final static QName _GuaranteePresentCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "GuaranteePresentCode");
    private final static QName _HMConsignmentItemNumber_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "HMConsignmentItemNumber");
    private final static QName _HumidityMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "HumidityMeasure");
    private final static QName _IPOCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "IPOCode");
    private final static QName _IPObjectId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "IPObjectId");
    private final static QName _IdenticalGoodsValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "IdenticalGoodsValueAmount");
    private final static QName _IdentifacationMeansCustomsId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "IdentifacationMeansCustomsId");
    private final static QName _IdentifacationMeansUnitCharacterValueId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "IdentifacationMeansUnitCharacterValueId");
    private final static QName _IdentificationMeansKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "IdentificationMeansKindCode");
    private final static QName _ImportElectricPowerMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ImportElectricPowerMeasure");
    private final static QName _IncidentPlaceName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "IncidentPlaceName");
    private final static QName _IndirectPaymentCurrencyRate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "IndirectPaymentCurrencyRate");
    private final static QName _InformationIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InformationIndicator");
    private final static QName _InformationKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InformationKindCode");
    private final static QName _InformationSourceName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InformationSourceName");
    private final static QName _InformationUnknownIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InformationUnknownIndicator");
    private final static QName _InspectionDocId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InspectionDocId");
    private final static QName _InspectionObjectCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InspectionObjectCode");
    private final static QName _InsuranceAdjustmentAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InsuranceAdjustmentAmount");
    private final static QName _InsuranceValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InsuranceValueAmount");
    private final static QName _IntegrationProgramName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "IntegrationProgramName");
    private final static QName _InternalDocId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InternalDocId");
    private final static QName _InternationalMailCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InternationalMailCode");
    private final static QName _InternationalMailId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InternationalMailId");
    private final static QName _InternationalMailKindName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InternationalMailKindName");
    private final static QName _InterpretationRuleCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InterpretationRuleCode");
    private final static QName _InvestmentGoodsListKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InvestmentGoodsListKindCode");
    private final static QName _InvestmentProjectGoodsSeqId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InvestmentProjectGoodsSeqId");
    private final static QName _InvestmentProjectSeqId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InvestmentProjectSeqId");
    private final static QName _InvestmentProjectYear_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InvestmentProjectYear");
    private final static QName _InvoicePriceAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "InvoicePriceAmount");
    private final static QName _ItemQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ItemQuantity");
    private final static QName _ItineraryPointCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ItineraryPointCode");
    private final static QName _JobName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "JobName");
    private final static QName _LNPId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LNPId");
    private final static QName _LabelId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LabelId");
    private final static QName _LastLabelId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LastLabelId");
    private final static QName _LastReferenceOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LastReferenceOrdinal");
    private final static QName _LastVisualIdentifierCIMId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LastVisualIdentifierCIMId");
    private final static QName _LegalActArticleId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LegalActArticleId");
    private final static QName _LegalActPositionId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LegalActPositionId");
    private final static QName _LegalActSubPositionId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LegalActSubPositionId");
    private final static QName _LicenseAnnexOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LicenseAnnexOrdinal");
    private final static QName _LicenseGoodsKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LicenseGoodsKindCode");
    private final static QName _LightCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LightCode");
    private final static QName _LineId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LineId");
    private final static QName _ListItemOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ListItemOrdinal");
    private final static QName _LoadingAdjustmentAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LoadingAdjustmentAmount");
    private final static QName _LoadingId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LoadingId");
    private final static QName _LoadingIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LoadingIndicator");
    private final static QName _LoadingListsPageQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LoadingListsPageQuantity");
    private final static QName _LoadingListsQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LoadingListsQuantity");
    private final static QName _LoadingValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LoadingValueAmount");
    private final static QName _LocationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LocationCode");
    private final static QName _LossKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "LossKindCode");
    private final static QName _MaintenanceSystemCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MaintenanceSystemCode");
    private final static QName _ManufacturerName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ManufacturerName");
    private final static QName _MaterialsValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MaterialsValueAmount");
    private final static QName _MaxRangeMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MaxRangeMeasure");
    private final static QName _MeasureUnitAbbreviationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MeasureUnitAbbreviationCode");
    private final static QName _MediaTypeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MediaTypeCode");
    private final static QName _MedicalConsultationIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MedicalConsultationIndicator");
    private final static QName _MethodReasonText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MethodReasonText");
    private final static QName _MinRangeMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MinRangeMeasure");
    private final static QName _MinorPersonQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MinorPersonQuantity");
    private final static QName _MoneySourceCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MoneySourceCode");
    private final static QName _MoneyUsageCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MoneyUsageCode");
    private final static QName _MoveDirectCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MoveDirectCode");
    private final static QName _MovementId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "MovementId");
    private final static QName _NationalCommodityCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "NationalCommodityCode");
    private final static QName _NationalGuaranteeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "NationalGuaranteeCode");
    private final static QName _NationalIndirectPaymentAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "NationalIndirectPaymentAmount");
    private final static QName _NationalInvoicePriceAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "NationalInvoicePriceAmount");
    private final static QName _NavigationSealId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "NavigationSealId");
    private final static QName _NegotiableInstrumentId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "NegotiableInstrumentId");
    private final static QName _NegotiableInstrumentName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "NegotiableInstrumentName");
    private final static QName _NoGuaranteeCauseCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "NoGuaranteeCauseCode");
    private final static QName _NonGuaranteeCountryCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "NonGuaranteeCountryCode");
    private final static QName _ObjectDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ObjectDescriptionText");
    private final static QName _OffenceCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OffenceCode");
    private final static QName _OffenceDesctiptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OffenceDesctiptionText");
    private final static QName _OffenceIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OffenceIndicator");
    private final static QName _OilTransferMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OilTransferMeasure");
    private final static QName _OnBoardDiseasePersonIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OnBoardDiseasePersonIndicator");
    private final static QName _OneTimePermissionIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OneTimePermissionIndicator");
    private final static QName _OperabilityIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OperabilityIndicator");
    private final static QName _OperationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OperationCode");
    private final static QName _OperationDateTime_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OperationDateTime");
    private final static QName _OperationId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OperationId");
    private final static QName _OperationSignCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OperationSignCode");
    private final static QName _Ordinal3Ordinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "Ordinal3Ordinal");
    private final static QName _OriginDecisionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OriginDecisionCode");
    private final static QName _OriginalCheckIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OriginalCheckIndicator");
    private final static QName _OtherChangeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OtherChangeCode");
    private final static QName _OverloadIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OverloadIndicator");
    private final static QName _OwnerPresenceCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "OwnerPresenceCode");
    private final static QName _PDAddRegistrationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PDAddRegistrationCode");
    private final static QName _PDGoodsCategoryCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PDGoodsCategoryCode");
    private final static QName _PDMovingMethodCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PDMovingMethodCode");
    private final static QName _PDTransferPurposeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PDTransferPurposeCode");
    private final static QName _PackageAvailabilityCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PackageAvailabilityCode");
    private final static QName _PackageKindName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PackageKindName");
    private final static QName _PackageOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PackageOrdinal");
    private final static QName _PackageValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PackageValueAmount");
    private final static QName _PageConsignmentItemOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PageConsignmentItemOrdinal");
    private final static QName _PageOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PageOrdinal");
    private final static QName _PartialDeliveryIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PartialDeliveryIndicator");
    private final static QName _PartialTerminationIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PartialTerminationIndicator");
    private final static QName _PassengersIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PassengersIndicator");
    private final static QName _PassengersQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PassengersQuantity");
    private final static QName _PaymentCalculationEventCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PaymentCalculationEventCode");
    private final static QName _PaymentDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PaymentDate");
    private final static QName _PaymentDutyTerminationEventCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PaymentDutyTerminationEventCode");
    private final static QName _PaymentGuaranteeMethodCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PaymentGuaranteeMethodCode");
    private final static QName _PeriodDuration_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PeriodDuration");
    private final static QName _PerishableIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PerishableIndicator");
    private final static QName _PersonId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PersonId");
    private final static QName _PersonIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PersonIndicator");
    private final static QName _PlaceCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PlaceCode");
    private final static QName _PlaceName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PlaceName");
    private final static QName _PlatformLengthMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PlatformLengthMeasure");
    private final static QName _PreDecisionCancelReasonText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreDecisionCancelReasonText");
    private final static QName _PreDecisionCountryId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreDecisionCountryId");
    private final static QName _PreDecisionGoodsName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreDecisionGoodsName");
    private final static QName _PreDecisionKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreDecisionKindCode");
    private final static QName _PreDecisionTNVEDCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreDecisionTNVEDCode");
    private final static QName _PreDeclarationNetMassMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreDeclarationNetMassMeasure");
    private final static QName _PrecedingDocId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PrecedingDocId");
    private final static QName _PreferenceDecisionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreferenceDecisionCode");
    private final static QName _PreferencesAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreferencesAmount");
    private final static QName _PreliminaryInformationId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreliminaryInformationId");
    private final static QName _PreliminaryInformationSeqId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreliminaryInformationSeqId");
    private final static QName _PreliminaryInformationUsageCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreliminaryInformationUsageCode");
    private final static QName _PresenceIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PresenceIndicator");
    private final static QName _PreviousCAPaymentAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreviousCAPaymentAmount");
    private final static QName _PreviousCAPaymentNAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreviousCAPaymentNAmount");
    private final static QName _PreviousCustomsProcedureModeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreviousCustomsProcedureModeCode");
    private final static QName _PreviousMovingDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreviousMovingDate");
    private final static QName _PreviousPaymentNumericAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PreviousPaymentNumericAmount");
    private final static QName _PriceCurrencyRate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PriceCurrencyRate");
    private final static QName _PriceInfluenceIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "PriceInfluenceIndicator");
    private final static QName _ProcessingDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ProcessingDescriptionText");
    private final static QName _ProcessingDuration_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ProcessingDuration");
    private final static QName _ProcessingOperationMethodText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ProcessingOperationMethodText");
    private final static QName _ProcessingOperationName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ProcessingOperationName");
    private final static QName _ProcessingProductKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ProcessingProductKindCode");
    private final static QName _ProcessingValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ProcessingValueAmount");
    private final static QName _ProductMarkName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ProductMarkName");
    private final static QName _ProductTypeName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ProductTypeName");
    private final static QName _ProductionPlaceName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ProductionPlaceName");
    private final static QName _ProductionValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ProductionValueAmount");
    private final static QName _ProfitAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ProfitAmount");
    private final static QName _ProhibitionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ProhibitionCode");
    private final static QName _QualificationCertificateId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "QualificationCertificateId");
    private final static QName _QuantityAdjustmentAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "QuantityAdjustmentAmount");
    private final static QName _QuantityChangeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "QuantityChangeCode");
    private final static QName _QueryKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "QueryKindCode");
    private final static QName _QuotaRemainderAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "QuotaRemainderAmount");
    private final static QName _RadiationMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RadiationMeasure");
    private final static QName _RailwayStatementIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RailwayStatementIndicator");
    private final static QName _RailwayStationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RailwayStationCode");
    private final static QName _RateOfYieldText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RateOfYieldText");
    private final static QName _ReInspectionIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReInspectionIndicator");
    private final static QName _ReasonChangeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReasonChangeCode");
    private final static QName _RecommendationText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RecommendationText");
    private final static QName _RefReferenceLineId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RefReferenceLineId");
    private final static QName _ReferenceCarrierOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReferenceCarrierOrdinal");
    private final static QName _ReferenceConsignmentItemOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReferenceConsignmentItemOrdinal");
    private final static QName _ReferenceDocumentId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReferenceDocumentId");
    private final static QName _ReferenceLineId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReferenceLineId");
    private final static QName _ReferenceObjectOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReferenceObjectOrdinal");
    private final static QName _RefinanceRate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RefinanceRate");
    private final static QName _RefundAmountCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RefundAmountCode");
    private final static QName _RegTIRDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RegTIRDate");
    private final static QName _RegionRestrictionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RegionRestrictionText");
    private final static QName _RegisterDocumentKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RegisterDocumentKindCode");
    private final static QName _RegistrationNationalityCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RegistrationNationalityCode");
    private final static QName _RegistrationNumberId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RegistrationNumberId");
    private final static QName _RegistrationRemovalIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RegistrationRemovalIndicator");
    private final static QName _RegistrationSeriesId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RegistrationSeriesId");
    private final static QName _RegistryDocCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RegistryDocCode");
    private final static QName _RegistryOwnerCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RegistryOwnerCode");
    private final static QName _RelationIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RelationIndicator");
    private final static QName _ReleaseId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReleaseId");
    private final static QName _ReleaseProlongationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReleaseProlongationCode");
    private final static QName _RemainGrossWeightMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RemainGrossWeightMeasure");
    private final static QName _ReregistrationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReregistrationCode");
    private final static QName _ReservationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReservationCode");
    private final static QName _ReservedCustomsOfficeIndicatorCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReservedCustomsOfficeIndicatorCode");
    private final static QName _ResourceValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ResourceValueAmount");
    private final static QName _RestrictionIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RestrictionIndicator");
    private final static QName _ResultColumnAAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ResultColumnAAmount");
    private final static QName _ResultColumnBAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ResultColumnBAmount");
    private final static QName _ResultColumnCAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ResultColumnCAmount");
    private final static QName _ReturnIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReturnIndicator");
    private final static QName _ReusableContainerIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ReusableContainerIndicator");
    private final static QName _RoleCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RoleCode");
    private final static QName _RoutePointOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RoutePointOrdinal");
    private final static QName _RoyaltyAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RoyaltyAmount");
    private final static QName _RoyaltyContractIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RoyaltyContractIndicator");
    private final static QName _RoyaltyFeeDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RoyaltyFeeDescriptionText");
    private final static QName _RoyaltyFeeIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "RoyaltyFeeIndicator");
    private final static QName _SEZOwnerName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SEZOwnerName");
    private final static QName _SEZProjectName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SEZProjectName");
    private final static QName _SEZStatusDeprivationDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SEZStatusDeprivationDate");
    private final static QName _SafePackageId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SafePackageId");
    private final static QName _SamplesSelectionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SamplesSelectionCode");
    private final static QName _SanitaryControlFreeIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SanitaryControlFreeIndicator");
    private final static QName _SanitaryMeasureCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SanitaryMeasureCode");
    private final static QName _SanitaryMeasureIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SanitaryMeasureIndicator");
    private final static QName _SanitaryRoadsteadIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SanitaryRoadsteadIndicator");
    private final static QName _SealDeviceId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SealDeviceId");
    private final static QName _SealIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SealIndicator");
    private final static QName _SealKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SealKindCode");
    private final static QName _SealQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SealQuantity");
    private final static QName _SealStateCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SealStateCode");
    private final static QName _SeatQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SeatQuantity");
    private final static QName _SecondTrailerRegId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SecondTrailerRegId");
    private final static QName _SecurityLabelId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SecurityLabelId");
    private final static QName _SeizureIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SeizureIndicator");
    private final static QName _ServiceMarkText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ServiceMarkText");
    private final static QName _ShippingOrderId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ShippingOrderId");
    private final static QName _ShortCountryName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ShortCountryName");
    private final static QName _SickAnimalIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SickAnimalIndicator");
    private final static QName _SignIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SignIndicator");
    private final static QName _SignatureImagePicture_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SignatureImagePicture");
    private final static QName _SigningDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SigningDate");
    private final static QName _SigningDateTime_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SigningDateTime");
    private final static QName _SimplificationCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SimplificationCode");
    private final static QName _SparePartsIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SparePartsIndicator");
    private final static QName _SpecialEconomicZoneName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SpecialEconomicZoneName");
    private final static QName _SpecialRoomQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SpecialRoomQuantity");
    private final static QName _SpecialRoomTypeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SpecialRoomTypeCode");
    private final static QName _SpecialRoomTypeName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SpecialRoomTypeName");
    private final static QName _SpecialStorageRequirementIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SpecialStorageRequirementIndicator");
    private final static QName _StageChangeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "StageChangeCode");
    private final static QName _StageQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "StageQuantity");
    private final static QName _StampImagePicture_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "StampImagePicture");
    private final static QName _StandardName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "StandardName");
    private final static QName _StatementCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "StatementCode");
    private final static QName _StationaryIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "StationaryIndicator");
    private final static QName _StatisticValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "StatisticValueAmount");
    private final static QName _StoreIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "StoreIndicator");
    private final static QName _StowawaysIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "StowawaysIndicator");
    private final static QName _SubjectAdditionalCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SubjectAdditionalCode");
    private final static QName _SubjectTradeName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SubjectTradeName");
    private final static QName _SubsequentResaleAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SubsequentResaleAmount");
    private final static QName _SubsequentResaleDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SubsequentResaleDescriptionText");
    private final static QName _SubsequentResaleIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SubsequentResaleIndicator");
    private final static QName _SubsoilUserCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SubsoilUserCode");
    private final static QName _SupplyStatusIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "SupplyStatusIndicator");
    private final static QName _TDCancelKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TDCancelKindCode");
    private final static QName _TDDeclarationKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TDDeclarationKindCode");
    private final static QName _TDInformationKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TDInformationKindCode");
    private final static QName _TIEStatusCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TIEStatusCode");
    private final static QName _TIRCarnetIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TIRCarnetIndicator");
    private final static QName _TIRHolderId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TIRHolderId");
    private final static QName _TIRId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TIRId");
    private final static QName _TIRPageOrdinal_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TIRPageOrdinal");
    private final static QName _TIRSeriesId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TIRSeriesId");
    private final static QName _TNVDCISSubPositionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TNVDCISSubPositionCode");
    private final static QName _TNVDEUSubPositionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TNVDEUSubPositionCode");
    private final static QName _TNVDGSSubPositionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TNVDGSSubPositionCode");
    private final static QName _TNVDGroupCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TNVDGroupCode");
    private final static QName _TNVDNationalSubPositionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TNVDNationalSubPositionCode");
    private final static QName _TNVDPositionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TNVDPositionCode");
    private final static QName _TNVDSectionCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TNVDSectionCode");
    private final static QName _TNVEDChangeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TNVEDChangeCode");
    private final static QName _TNVEDExplanationKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TNVEDExplanationKindCode");
    private final static QName _TNVEDExplanationText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TNVEDExplanationText");
    private final static QName _TNVEDNoteId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TNVEDNoteId");
    private final static QName _TaxBaseMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TaxBaseMeasure");
    private final static QName _TaxFreeIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TaxFreeIndicator");
    private final static QName _TaxPaySignCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TaxPaySignCode");
    private final static QName _TempImportLimitDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TempImportLimitDate");
    private final static QName _TemperatureMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TemperatureMeasure");
    private final static QName _TemporaryImportDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TemporaryImportDate");
    private final static QName _TemporaryImportKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TemporaryImportKindCode");
    private final static QName _ToolsValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ToolsValueAmount");
    private final static QName _TotalAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TotalAmount");
    private final static QName _TotalAreaMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TotalAreaMeasure");
    private final static QName _TotalCustomsValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TotalCustomsValueAmount");
    private final static QName _TotalGrossMassMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TotalGrossMassMeasure");
    private final static QName _TotalGuaranteeAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TotalGuaranteeAmount");
    private final static QName _TotalGuaranteeNAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TotalGuaranteeNAmount");
    private final static QName _TotalMassMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TotalMassMeasure");
    private final static QName _TotalNetMassMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TotalNetMassMeasure");
    private final static QName _TotalPagesQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TotalPagesQuantity");
    private final static QName _TotalStatisticValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TotalStatisticValueAmount");
    private final static QName _TradeMarkName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TradeMarkName");
    private final static QName _TrailerIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TrailerIndicator");
    private final static QName _TrainingIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TrainingIndicator");
    private final static QName _TransactionFeatureCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransactionFeatureCode");
    private final static QName _TransactionNatureCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransactionNatureCode");
    private final static QName _TransactionPassportId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransactionPassportId");
    private final static QName _TranshipmentCustomsOfficeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TranshipmentCustomsOfficeCode");
    private final static QName _TransitFeatureCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransitFeatureCode");
    private final static QName _TransitGuaranteeMeasureCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransitGuaranteeMeasureCode");
    private final static QName _TransitLimitDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransitLimitDate");
    private final static QName _TransitProcedureCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransitProcedureCode");
    private final static QName _TransitStatusCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransitStatusCode");
    private final static QName _TransitTerminationLimitDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransitTerminationLimitDate");
    private final static QName _TransportAdjustmentAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportAdjustmentAmount");
    private final static QName _TransportCarryingCapacityMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportCarryingCapacityMeasure");
    private final static QName _TransportCategoryCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportCategoryCode");
    private final static QName _TransportColorCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportColorCode");
    private final static QName _TransportMeansEntryPurposeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportMeansEntryPurposeCode");
    private final static QName _TransportMeansGrossMassMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportMeansGrossMassMeasure");
    private final static QName _TransportMeansIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportMeansIndicator");
    private final static QName _TransportMeansQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportMeansQuantity");
    private final static QName _TransportModeName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportModeName");
    private final static QName _TransportRestrictionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportRestrictionText");
    private final static QName _TransportTypeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportTypeCode");
    private final static QName _TransportTypeName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportTypeName");
    private final static QName _TransportValueAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TransportValueAmount");
    private final static QName _TreatmentDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "TreatmentDescriptionText");
    private final static QName _UCRId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "UCRId");
    private final static QName _UNDGClassId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "UNDGClassId");
    private final static QName _UNDGNumberId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "UNDGNumberId");
    private final static QName _UnionTaxPaymentAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "UnionTaxPaymentAmount");
    private final static QName _UnionTransportCostAmount_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "UnionTransportCostAmount");
    private final static QName _UnloadingIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "UnloadingIndicator");
    private final static QName _VATPrefCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VATPrefCode");
    private final static QName _ValuationMethodCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ValuationMethodCode");
    private final static QName _ValueConditionIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "ValueConditionIndicator");
    private final static QName _VehicleAxleQuantity_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VehicleAxleQuantity");
    private final static QName _VehicleDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VehicleDescriptionText");
    private final static QName _VehicleDocSeriesId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VehicleDocSeriesId");
    private final static QName _VehicleMakeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VehicleMakeCode");
    private final static QName _VehicleMassKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VehicleMassKindCode");
    private final static QName _VehicleMileageMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VehicleMileageMeasure");
    private final static QName _VehicleModelName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VehicleModelName");
    private final static QName _VehicleRegistrationId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VehicleRegistrationId");
    private final static QName _VehicleWheelbaseMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VehicleWheelbaseMeasure");
    private final static QName _VesselBodyId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VesselBodyId");
    private final static QName _VesselIMOId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VesselIMOId");
    private final static QName _VesselRegistryId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VesselRegistryId");
    private final static QName _VesselTypeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VesselTypeCode");
    private final static QName _VesselTypeName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VesselTypeName");
    private final static QName _VeterinaryOrganizationId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VeterinaryOrganizationId");
    private final static QName _VisualIdentifierCIMId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VisualIdentifierCIMId");
    private final static QName _VolumeMeasure_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VolumeMeasure");
    private final static QName _VoyageId_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "VoyageId");
    private final static QName _WarehouseActivityDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WarehouseActivityDescriptionText");
    private final static QName _WarehouseDate_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WarehouseDate");
    private final static QName _WarehouseKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WarehouseKindCode");
    private final static QName _WarehouseTypeIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WarehouseTypeIndicator");
    private final static QName _WeaponIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WeaponIndicator");
    private final static QName _WeatherText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WeatherText");
    private final static QName _WeightCheckIndicator_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WeightCheckIndicator");
    private final static QName _WeightMethodCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WeightMethodCode");
    private final static QName _WeightRatioNumber_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WeightRatioNumber");
    private final static QName _WoodKindName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WoodKindName");
    private final static QName _WoodSortimentName_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WoodSortimentName");
    private final static QName _WorkSheduleDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WorkSheduleDescriptionText");
    private final static QName _WorkSheduleKindCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WorkSheduleKindCode");
    private final static QName _WorkTimeCode_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WorkTimeCode");
    private final static QName _WorkTimeDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WorkTimeDescriptionText");
    private final static QName _WorkTimeHourDescriptionText_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "WorkTimeHourDescriptionText");
    private final static QName _YearMonth_QNAME = new QName("urn:EEC:M:CA:SimpleDataObjects:v1.8.1", "YearMonth");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eec.m.ca.simpledataobjects.v1_8
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentAmountWithCurrencyType }
     * 
     */
    public PaymentAmountWithCurrencyType createPaymentAmountWithCurrencyType() {
        return new PaymentAmountWithCurrencyType();
    }

    /**
     * Create an instance of {@link ValuationMethodCodeType }
     * 
     */
    public ValuationMethodCodeType createValuationMethodCodeType() {
        return new ValuationMethodCodeType();
    }

    /**
     * Create an instance of {@link FractionNumber24MeasureType }
     * 
     */
    public FractionNumber24MeasureType createFractionNumber24MeasureType() {
        return new FractionNumber24MeasureType();
    }

    /**
     * Create an instance of {@link CACountryCodeType }
     * 
     */
    public CACountryCodeType createCACountryCodeType() {
        return new CACountryCodeType();
    }

    /**
     * Create an instance of {@link CAAmountWithCurrencyType }
     * 
     */
    public CAAmountWithCurrencyType createCAAmountWithCurrencyType() {
        return new CAAmountWithCurrencyType();
    }

    /**
     * Create an instance of {@link PaymentAmountWithNCurrencyType }
     * 
     */
    public PaymentAmountWithNCurrencyType createPaymentAmountWithNCurrencyType() {
        return new PaymentAmountWithNCurrencyType();
    }

    /**
     * Create an instance of {@link CAUniqueCustomsNumberIdType }
     * 
     */
    public CAUniqueCustomsNumberIdType createCAUniqueCustomsNumberIdType() {
        return new CAUniqueCustomsNumberIdType();
    }

    /**
     * Create an instance of {@link CheckPointCapacityMeasureType }
     * 
     */
    public CheckPointCapacityMeasureType createCheckPointCapacityMeasureType() {
        return new CheckPointCapacityMeasureType();
    }

    /**
     * Create an instance of {@link CargoPackageModeKindCodeType }
     * 
     */
    public CargoPackageModeKindCodeType createCargoPackageModeKindCodeType() {
        return new CargoPackageModeKindCodeType();
    }

    /**
     * Create an instance of {@link CountryNumber3CodeType }
     * 
     */
    public CountryNumber3CodeType createCountryNumber3CodeType() {
        return new CountryNumber3CodeType();
    }

    /**
     * Create an instance of {@link CustomsTaxPrefCodeType }
     * 
     */
    public CustomsTaxPrefCodeType createCustomsTaxPrefCodeType() {
        return new CustomsTaxPrefCodeType();
    }

    /**
     * Create an instance of {@link CustomsDecisionCodeType }
     * 
     */
    public CustomsDecisionCodeType createCustomsDecisionCodeType() {
        return new CustomsDecisionCodeType();
    }

    /**
     * Create an instance of {@link CustomsProcedureCodeType }
     * 
     */
    public CustomsProcedureCodeType createCustomsProcedureCodeType() {
        return new CustomsProcedureCodeType();
    }

    /**
     * Create an instance of {@link CustomsTaxModeCodeType }
     * 
     */
    public CustomsTaxModeCodeType createCustomsTaxModeCodeType() {
        return new CustomsTaxModeCodeType();
    }

    /**
     * Create an instance of {@link CustomsTaxPaymentFeatureCodeType }
     * 
     */
    public CustomsTaxPaymentFeatureCodeType createCustomsTaxPaymentFeatureCodeType() {
        return new CustomsTaxPaymentFeatureCodeType();
    }

    /**
     * Create an instance of {@link CustomsTaxPaymentMethodCodeType }
     * 
     */
    public CustomsTaxPaymentMethodCodeType createCustomsTaxPaymentMethodCodeType() {
        return new CustomsTaxPaymentMethodCodeType();
    }

    /**
     * Create an instance of {@link DeclarationFeatureCodeType }
     * 
     */
    public DeclarationFeatureCodeType createDeclarationFeatureCodeType() {
        return new DeclarationFeatureCodeType();
    }

    /**
     * Create an instance of {@link DeliveryTermsCodeType }
     * 
     */
    public DeliveryTermsCodeType createDeliveryTermsCodeType() {
        return new DeliveryTermsCodeType();
    }

    /**
     * Create an instance of {@link ExchangeRateType }
     * 
     */
    public ExchangeRateType createExchangeRateType() {
        return new ExchangeRateType();
    }

    /**
     * Create an instance of {@link GoodsLocationCodeType }
     * 
     */
    public GoodsLocationCodeType createGoodsLocationCodeType() {
        return new GoodsLocationCodeType();
    }

    /**
     * Create an instance of {@link GoodsMoveFeatureCodeType }
     * 
     */
    public GoodsMoveFeatureCodeType createGoodsMoveFeatureCodeType() {
        return new GoodsMoveFeatureCodeType();
    }

    /**
     * Create an instance of {@link UnifiedFractionNumber246MeasureType }
     * 
     */
    public UnifiedFractionNumber246MeasureType createUnifiedFractionNumber246MeasureType() {
        return new UnifiedFractionNumber246MeasureType();
    }

    /**
     * Create an instance of {@link LocationCodeType }
     * 
     */
    public LocationCodeType createLocationCodeType() {
        return new LocationCodeType();
    }

    /**
     * Create an instance of {@link NoGuaranteeCauseCodeType }
     * 
     */
    public NoGuaranteeCauseCodeType createNoGuaranteeCauseCodeType() {
        return new NoGuaranteeCauseCodeType();
    }

    /**
     * Create an instance of {@link OffenceCodeType }
     * 
     */
    public OffenceCodeType createOffenceCodeType() {
        return new OffenceCodeType();
    }

    /**
     * Create an instance of {@link PaymentGuaranteeMethodCodeType }
     * 
     */
    public PaymentGuaranteeMethodCodeType createPaymentGuaranteeMethodCodeType() {
        return new PaymentGuaranteeMethodCodeType();
    }

    /**
     * Create an instance of {@link SimplificationCodeType }
     * 
     */
    public SimplificationCodeType createSimplificationCodeType() {
        return new SimplificationCodeType();
    }

    /**
     * Create an instance of {@link TNVEDNoteKindCodeType }
     * 
     */
    public TNVEDNoteKindCodeType createTNVEDNoteKindCodeType() {
        return new TNVEDNoteKindCodeType();
    }

    /**
     * Create an instance of {@link FractionNumber102MeasureType }
     * 
     */
    public FractionNumber102MeasureType createFractionNumber102MeasureType() {
        return new FractionNumber102MeasureType();
    }

    /**
     * Create an instance of {@link TransitGuaranteeMeasureCodeType }
     * 
     */
    public TransitGuaranteeMeasureCodeType createTransitGuaranteeMeasureCodeType() {
        return new TransitGuaranteeMeasureCodeType();
    }

    /**
     * Create an instance of {@link TransitProcedureCodeType }
     * 
     */
    public TransitProcedureCodeType createTransitProcedureCodeType() {
        return new TransitProcedureCodeType();
    }

    /**
     * Create an instance of {@link TransportTypeCodeType }
     * 
     */
    public TransportTypeCodeType createTransportTypeCodeType() {
        return new TransportTypeCodeType();
    }

    /**
     * Create an instance of {@link VehcicleMakeCodeType }
     * 
     */
    public VehcicleMakeCodeType createVehcicleMakeCodeType() {
        return new VehcicleMakeCodeType();
    }

    /**
     * Create an instance of {@link VesselRegistryIdType }
     * 
     */
    public VesselRegistryIdType createVesselRegistryIdType() {
        return new VesselRegistryIdType();
    }

    /**
     * Create an instance of {@link AmountCurrencyType }
     * 
     */
    public AmountCurrencyType createAmountCurrencyType() {
        return new AmountCurrencyType();
    }

    /**
     * Create an instance of {@link CAQualifiedCodeType }
     * 
     */
    public CAQualifiedCodeType createCAQualifiedCodeType() {
        return new CAQualifiedCodeType();
    }

    /**
     * Create an instance of {@link CapacityType }
     * 
     */
    public CapacityType createCapacityType() {
        return new CapacityType();
    }

    /**
     * Create an instance of {@link CodedNameType }
     * 
     */
    public CodedNameType createCodedNameType() {
        return new CodedNameType();
    }

    /**
     * Create an instance of {@link ExchRateType }
     * 
     */
    public ExchRateType createExchRateType() {
        return new ExchRateType();
    }

    /**
     * Create an instance of {@link FractionNumber12MeasureType }
     * 
     */
    public FractionNumber12MeasureType createFractionNumber12MeasureType() {
        return new FractionNumber12MeasureType();
    }

    /**
     * Create an instance of {@link FractionNumber24AmountType }
     * 
     */
    public FractionNumber24AmountType createFractionNumber24AmountType() {
        return new FractionNumber24AmountType();
    }

    /**
     * Create an instance of {@link FractionNumber9MeasureType }
     * 
     */
    public FractionNumber9MeasureType createFractionNumber9MeasureType() {
        return new FractionNumber9MeasureType();
    }

    /**
     * Create an instance of {@link PositionCodeType }
     * 
     */
    public PositionCodeType createPositionCodeType() {
        return new PositionCodeType();
    }

    /**
     * Create an instance of {@link ShortCountryNameType }
     * 
     */
    public ShortCountryNameType createShortCountryNameType() {
        return new ShortCountryNameType();
    }

    /**
     * Create an instance of {@link VesselRegistryQualifiedIdType }
     * 
     */
    public VesselRegistryQualifiedIdType createVesselRegistryQualifiedIdType() {
        return new VesselRegistryQualifiedIdType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AEORegistryKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAEORegistryKindCode(String value) {
        return new JAXBElement<String>(_AEORegistryKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AIId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAIId(String value) {
        return new JAXBElement<String>(_AIId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ATACarnetAuthorityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createATACarnetAuthorityCode(String value) {
        return new JAXBElement<String>(_ATACarnetAuthorityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ATAConsignmentItemOrdinal")
    public JAXBElement<BigInteger> createATAConsignmentItemOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_ATAConsignmentItemOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ATAPageOrdinal")
    public JAXBElement<BigInteger> createATAPageOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_ATAPageOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AbnormalDiseasePersonIndicator")
    public JAXBElement<Boolean> createAbnormalDiseasePersonIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_AbnormalDiseasePersonIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ActionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createActionCode(String value) {
        return new JAXBElement<String>(_ActionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AddPageQuantity")
    public JAXBElement<BigInteger> createAddPageQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_AddPageQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AddProductionValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createAddProductionValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_AddProductionValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AffectedAreaVisitIndicator")
    public JAXBElement<Boolean> createAffectedAreaVisitIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_AffectedAreaVisitIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AggregationKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAggregationKindCode(String value) {
        return new JAXBElement<String>(_AggregationKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AirlineId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAirlineId(String value) {
        return new JAXBElement<String>(_AirlineId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AntiepidemicEquipmentIndicator")
    public JAXBElement<Boolean> createAntiepidemicEquipmentIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_AntiepidemicEquipmentIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AppointmentCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAppointmentCode(String value) {
        return new JAXBElement<String>(_AppointmentCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ApproximateValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createApproximateValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_ApproximateValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ApproximateValueIndicator")
    public JAXBElement<Boolean> createApproximateValueIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ApproximateValueIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ArrivalDateTime")
    public JAXBElement<XMLGregorianCalendar> createArrivalDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ArrivalDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ArrivePointName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArrivePointName(String value) {
        return new JAXBElement<String>(_ArrivePointName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ArrivePointPADCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArrivePointPADCode(String value) {
        return new JAXBElement<String>(_ArrivePointPADCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ArrivePointSequenceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createArrivePointSequenceCode(String value) {
        return new JAXBElement<String>(_ArrivePointSequenceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AssemblyValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createAssemblyValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_AssemblyValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AttachmentCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAttachmentCode(String value) {
        return new JAXBElement<String>(_AttachmentCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AutoRegionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAutoRegionCode(String value) {
        return new JAXBElement<String>(_AutoRegionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "AutomaticDecisionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAutomaticDecisionCode(String value) {
        return new JAXBElement<String>(_AutomaticDecisionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "BYCurrencyQuantity")
    public JAXBElement<BigInteger> createBYCurrencyQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_BYCurrencyQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "BYIndirectCurrencyQuantity")
    public JAXBElement<BigInteger> createBYIndirectCurrencyQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_BYIndirectCurrencyQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValuationMethodCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValuationMethodCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "BaseValuationMethodCode")
    public JAXBElement<ValuationMethodCodeType> createBaseValuationMethodCode(ValuationMethodCodeType value) {
        return new JAXBElement<ValuationMethodCodeType>(_BaseValuationMethodCode_QNAME, ValuationMethodCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "BillOfLandingOrdinal")
    public JAXBElement<BigInteger> createBillOfLandingOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_BillOfLandingOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "BinaryFileName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBinaryFileName(String value) {
        return new JAXBElement<String>(_BinaryFileName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "BorderCheckPointCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBorderCheckPointCode(String value) {
        return new JAXBElement<String>(_BorderCheckPointCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "BorderCheckPointName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBorderCheckPointName(String value) {
        return new JAXBElement<String>(_BorderCheckPointName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "BorderCustomsOfficeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBorderCustomsOfficeCode(String value) {
        return new JAXBElement<String>(_BorderCustomsOfficeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FractionNumber24MeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FractionNumber24MeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "BorderDistanceMeasure")
    public JAXBElement<FractionNumber24MeasureType> createBorderDistanceMeasure(FractionNumber24MeasureType value) {
        return new JAXBElement<FractionNumber24MeasureType>(_BorderDistanceMeasure_QNAME, FractionNumber24MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "BranchFlagCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBranchFlagCode(String value) {
        return new JAXBElement<String>(_BranchFlagCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "BrokerageAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createBrokerageAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_BrokerageAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CACountryCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CACountryCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CACountryCode")
    public JAXBElement<CACountryCodeType> createCACountryCode(CACountryCodeType value) {
        return new JAXBElement<CACountryCodeType>(_CACountryCode_QNAME, CACountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CAAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CAInvoiceValueAmount")
    public JAXBElement<CAAmountWithCurrencyType> createCAInvoiceValueAmount(CAAmountWithCurrencyType value) {
        return new JAXBElement<CAAmountWithCurrencyType>(_CAInvoiceValueAmount_QNAME, CAAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CAPaymentAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createCAPaymentAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_CAPaymentAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CAPaymentNAmount")
    public JAXBElement<PaymentAmountWithNCurrencyType> createCAPaymentNAmount(PaymentAmountWithNCurrencyType value) {
        return new JAXBElement<PaymentAmountWithNCurrencyType>(_CAPaymentNAmount_QNAME, PaymentAmountWithNCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CAAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CAProductCostAmount")
    public JAXBElement<CAAmountWithCurrencyType> createCAProductCostAmount(CAAmountWithCurrencyType value) {
        return new JAXBElement<CAAmountWithCurrencyType>(_CAProductCostAmount_QNAME, CAAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CAShipmentValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createCAShipmentValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_CAShipmentValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAUniqueCustomsNumberIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CAUniqueCustomsNumberIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CAUniqueCustomsNumberId")
    public JAXBElement<CAUniqueCustomsNumberIdType> createCAUniqueCustomsNumberId(CAUniqueCustomsNumberIdType value) {
        return new JAXBElement<CAUniqueCustomsNumberIdType>(_CAUniqueCustomsNumberId_QNAME, CAUniqueCustomsNumberIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CAValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createCAValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_CAValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CDVConsignmentItemOrdinal")
    public JAXBElement<BigInteger> createCDVConsignmentItemOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_CDVConsignmentItemOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CIMMarkingCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCIMMarkingCode(String value) {
        return new JAXBElement<String>(_CIMMarkingCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CIMQuantity")
    public JAXBElement<BigInteger> createCIMQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_CIMQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CIMSignCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCIMSignCode(String value) {
        return new JAXBElement<String>(_CIMSignCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CRCommodityKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCRCommodityKindCode(String value) {
        return new JAXBElement<String>(_CRCommodityKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CRFactPayerIndicator")
    public JAXBElement<Boolean> createCRFactPayerIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_CRFactPayerIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CRGoodsKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCRGoodsKindCode(String value) {
        return new JAXBElement<String>(_CRGoodsKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CRObjectCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCRObjectCode(String value) {
        return new JAXBElement<String>(_CRObjectCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CRPaymentsKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCRPaymentsKindCode(String value) {
        return new JAXBElement<String>(_CRPaymentsKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CRPreviosCustomsDocKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCRPreviosCustomsDocKindCode(String value) {
        return new JAXBElement<String>(_CRPreviosCustomsDocKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CRPurposeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCRPurposeCode(String value) {
        return new JAXBElement<String>(_CRPurposeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CRRFObjectKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCRRFObjectKindCode(String value) {
        return new JAXBElement<String>(_CRRFObjectKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CRRFPurposeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCRRFPurposeCode(String value) {
        return new JAXBElement<String>(_CRRFPurposeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CRTaxAllowanceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCRTaxAllowanceCode(String value) {
        return new JAXBElement<String>(_CRTaxAllowanceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CVDAdditionalInformationKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCVDAdditionalInformationKindCode(String value) {
        return new JAXBElement<String>(_CVDAdditionalInformationKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CVDFormCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCVDFormCode(String value) {
        return new JAXBElement<String>(_CVDFormCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CabinQuantity")
    public JAXBElement<BigInteger> createCabinQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_CabinQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointCapacityMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointCapacityMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CapacityMeasure")
    public JAXBElement<CheckPointCapacityMeasureType> createCapacityMeasure(CheckPointCapacityMeasureType value) {
        return new JAXBElement<CheckPointCapacityMeasureType>(_CapacityMeasure_QNAME, CheckPointCapacityMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CapacityQuantity")
    public JAXBElement<BigInteger> createCapacityQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_CapacityQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CargoDescriptionText")
    public JAXBElement<String> createCargoDescriptionText(String value) {
        return new JAXBElement<String>(_CargoDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CargoKindName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCargoKindName(String value) {
        return new JAXBElement<String>(_CargoKindName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CargoLabelDescriptionText")
    public JAXBElement<String> createCargoLabelDescriptionText(String value) {
        return new JAXBElement<String>(_CargoLabelDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CargoOperationKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCargoOperationKindCode(String value) {
        return new JAXBElement<String>(_CargoOperationKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CargoPackageInfoKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCargoPackageInfoKindCode(String value) {
        return new JAXBElement<String>(_CargoPackageInfoKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoPackageModeKindCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CargoPackageModeKindCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CargoPackageKindCode")
    public JAXBElement<CargoPackageModeKindCodeType> createCargoPackageKindCode(CargoPackageModeKindCodeType value) {
        return new JAXBElement<CargoPackageModeKindCodeType>(_CargoPackageKindCode_QNAME, CargoPackageModeKindCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CargoPartQuantity")
    public JAXBElement<BigInteger> createCargoPartQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_CargoPartQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CargoQuantity")
    public JAXBElement<BigInteger> createCargoQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_CargoQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CarrierOrdinal")
    public JAXBElement<BigInteger> createCarrierOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_CarrierOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CarrierReplacementIndicator")
    public JAXBElement<Boolean> createCarrierReplacementIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_CarrierReplacementIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ChangeIndicator")
    public JAXBElement<Boolean> createChangeIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ChangeIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FractionNumber24MeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FractionNumber24MeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointBandwidthMeasure")
    public JAXBElement<FractionNumber24MeasureType> createCheckPointBandwidthMeasure(FractionNumber24MeasureType value) {
        return new JAXBElement<FractionNumber24MeasureType>(_CheckPointBandwidthMeasure_QNAME, FractionNumber24MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointCapacityInformationIndicator")
    public JAXBElement<Boolean> createCheckPointCapacityInformationIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_CheckPointCapacityInformationIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointCharacterCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCheckPointCharacterCode(String value) {
        return new JAXBElement<String>(_CheckPointCharacterCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointFunctionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCheckPointFunctionCode(String value) {
        return new JAXBElement<String>(_CheckPointFunctionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointFunctionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCheckPointFunctionName(String value) {
        return new JAXBElement<String>(_CheckPointFunctionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointLinkFunctionText")
    public JAXBElement<String> createCheckPointLinkFunctionText(String value) {
        return new JAXBElement<String>(_CheckPointLinkFunctionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointLinkKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCheckPointLinkKindCode(String value) {
        return new JAXBElement<String>(_CheckPointLinkKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointLinkName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCheckPointLinkName(String value) {
        return new JAXBElement<String>(_CheckPointLinkName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCheckPointStatusCode(String value) {
        return new JAXBElement<String>(_CheckPointStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointStatusName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCheckPointStatusName(String value) {
        return new JAXBElement<String>(_CheckPointStatusName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointSystemObjectQuantity")
    public JAXBElement<BigInteger> createCheckPointSystemObjectQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_CheckPointSystemObjectQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointTVLocationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCheckPointTVLocationCode(String value) {
        return new JAXBElement<String>(_CheckPointTVLocationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointTVLocationText")
    public JAXBElement<String> createCheckPointTVLocationText(String value) {
        return new JAXBElement<String>(_CheckPointTVLocationText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointTrafficKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCheckPointTrafficKindCode(String value) {
        return new JAXBElement<String>(_CheckPointTrafficKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CheckPointTrafficObjectCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCheckPointTrafficObjectCode(String value) {
        return new JAXBElement<String>(_CheckPointTrafficObjectCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ChemicalName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createChemicalName(String value) {
        return new JAXBElement<String>(_ChemicalName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CleanNetMassMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createCleanNetMassMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_CleanNetMassMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ClosedReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createClosedReasonCode(String value) {
        return new JAXBElement<String>(_ClosedReasonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CommercialLevelAdjustmentAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createCommercialLevelAdjustmentAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_CommercialLevelAdjustmentAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CommodityAddCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCommodityAddCode(String value) {
        return new JAXBElement<String>(_CommodityAddCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CommodityCheckIndicator")
    public JAXBElement<Boolean> createCommodityCheckIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_CommodityCheckIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CommodityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCommodityCode(String value) {
        return new JAXBElement<String>(_CommodityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CompareOperationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCompareOperationCode(String value) {
        return new JAXBElement<String>(_CompareOperationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CompareOperationIndicator")
    public JAXBElement<Boolean> createCompareOperationIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_CompareOperationIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CompatibleProgramName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCompatibleProgramName(String value) {
        return new JAXBElement<String>(_CompatibleProgramName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ConcentrationMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createConcentrationMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_ConcentrationMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ConditionArrivalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createConditionArrivalCode(String value) {
        return new JAXBElement<String>(_ConditionArrivalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ConsignmentItemOrdinal")
    public JAXBElement<BigInteger> createConsignmentItemOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_ConsignmentItemOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ContainerDeclarationKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createContainerDeclarationKindCode(String value) {
        return new JAXBElement<String>(_ContainerDeclarationKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ContainerId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createContainerId(String value) {
        return new JAXBElement<String>(_ContainerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ContainerIndicator")
    public JAXBElement<Boolean> createContainerIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ContainerIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ContainerQuantity")
    public JAXBElement<BigInteger> createContainerQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_ContainerQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ControlSystemKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createControlSystemKindCode(String value) {
        return new JAXBElement<String>(_ControlSystemKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ConveyanceMethodCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createConveyanceMethodCode(String value) {
        return new JAXBElement<String>(_ConveyanceMethodCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CountGreenLinesQuantity")
    public JAXBElement<BigInteger> createCountGreenLinesQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_CountGreenLinesQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CountRedLinesQuantity")
    public JAXBElement<BigInteger> createCountRedLinesQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_CountRedLinesQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CountryChangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCountryChangeCode(String value) {
        return new JAXBElement<String>(_CountryChangeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryNumber3CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountryNumber3CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CountryN3Code")
    public JAXBElement<CountryNumber3CodeType> createCountryN3Code(CountryNumber3CodeType value) {
        return new JAXBElement<CountryNumber3CodeType>(_CountryN3Code_QNAME, CountryNumber3CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CrewDescriptionText")
    public JAXBElement<String> createCrewDescriptionText(String value) {
        return new JAXBElement<String>(_CrewDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CrewIndicator")
    public JAXBElement<Boolean> createCrewIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_CrewIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CrewQuantity")
    public JAXBElement<BigInteger> createCrewQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_CrewQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CryptoIndicator")
    public JAXBElement<Boolean> createCryptoIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_CryptoIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FractionNumber10MeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FractionNumber10MeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CubageMeasure")
    public JAXBElement<FractionNumber10MeasureType> createCubageMeasure(FractionNumber10MeasureType value) {
        return new JAXBElement<FractionNumber10MeasureType>(_CubageMeasure_QNAME, FractionNumber10MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CurrencyCostAmount")
    public JAXBElement<UnifiedAmountWithCurrencyType> createCurrencyCostAmount(UnifiedAmountWithCurrencyType value) {
        return new JAXBElement<UnifiedAmountWithCurrencyType>(_CurrencyCostAmount_QNAME, UnifiedAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CurrencyName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCurrencyName(String value) {
        return new JAXBElement<String>(_CurrencyName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsTaxPrefCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsTaxPrefCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsClearanceChargesPrefCode")
    public JAXBElement<CustomsTaxPrefCodeType> createCustomsClearanceChargesPrefCode(CustomsTaxPrefCodeType value) {
        return new JAXBElement<CustomsTaxPrefCodeType>(_CustomsClearanceChargesPrefCode_QNAME, CustomsTaxPrefCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsControlFormCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsControlFormCode(String value) {
        return new JAXBElement<String>(_CustomsControlFormCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsControlFormDescriptionText")
    public JAXBElement<String> createCustomsControlFormDescriptionText(String value) {
        return new JAXBElement<String>(_CustomsControlFormDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsControlMeasureCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsControlMeasureCode(String value) {
        return new JAXBElement<String>(_CustomsControlMeasureCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsControlZoneId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsControlZoneId(String value) {
        return new JAXBElement<String>(_CustomsControlZoneId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsCostChangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsCostChangeCode(String value) {
        return new JAXBElement<String>(_CustomsCostChangeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDecisionCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsDecisionCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsDecisionModeCode")
    public JAXBElement<CustomsDecisionCodeType> createCustomsDecisionModeCode(CustomsDecisionCodeType value) {
        return new JAXBElement<CustomsDecisionCodeType>(_CustomsDecisionModeCode_QNAME, CustomsDecisionCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsDocumentId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsDocumentId(String value) {
        return new JAXBElement<String>(_CustomsDocumentId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsDocumentKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsDocumentKindCode(String value) {
        return new JAXBElement<String>(_CustomsDocumentKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsDocumentOrdinalId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsDocumentOrdinalId(String value) {
        return new JAXBElement<String>(_CustomsDocumentOrdinalId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsTaxPrefCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsTaxPrefCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsDutyPrefCode")
    public JAXBElement<CustomsTaxPrefCodeType> createCustomsDutyPrefCode(CustomsTaxPrefCodeType value) {
        return new JAXBElement<CustomsTaxPrefCodeType>(_CustomsDutyPrefCode_QNAME, CustomsTaxPrefCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsEscortIndicator")
    public JAXBElement<Boolean> createCustomsEscortIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_CustomsEscortIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsIdentificationMeansId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsIdentificationMeansId(String value) {
        return new JAXBElement<String>(_CustomsIdentificationMeansId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsIdentificationMeansKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsIdentificationMeansKindCode(String value) {
        return new JAXBElement<String>(_CustomsIdentificationMeansKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsIdentificationMethodCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsIdentificationMethodCode(String value) {
        return new JAXBElement<String>(_CustomsIdentificationMethodCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsMarkCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsMarkCode(String value) {
        return new JAXBElement<String>(_CustomsMarkCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsOfficeChangeKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsOfficeChangeKindCode(String value) {
        return new JAXBElement<String>(_CustomsOfficeChangeKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsOfficeFullName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsOfficeFullName(String value) {
        return new JAXBElement<String>(_CustomsOfficeFullName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsOfficeIndicatorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsOfficeIndicatorCode(String value) {
        return new JAXBElement<String>(_CustomsOfficeIndicatorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsOfficeOrdinal")
    public JAXBElement<BigInteger> createCustomsOfficeOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_CustomsOfficeOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsOfficePreviousCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsOfficePreviousCode(String value) {
        return new JAXBElement<String>(_CustomsOfficePreviousCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsOfficeRevisedCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsOfficeRevisedCode(String value) {
        return new JAXBElement<String>(_CustomsOfficeRevisedCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsOperationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsOperationCode(String value) {
        return new JAXBElement<String>(_CustomsOperationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsOperationRestrictionText")
    public JAXBElement<String> createCustomsOperationRestrictionText(String value) {
        return new JAXBElement<String>(_CustomsOperationRestrictionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsOperationText")
    public JAXBElement<String> createCustomsOperationText(String value) {
        return new JAXBElement<String>(_CustomsOperationText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsPaymentChangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsPaymentChangeCode(String value) {
        return new JAXBElement<String>(_CustomsPaymentChangeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsPersonIndicator")
    public JAXBElement<Boolean> createCustomsPersonIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_CustomsPersonIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsProcedureCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsProcedureCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsProcedureCode")
    public JAXBElement<CustomsProcedureCodeType> createCustomsProcedureCode(CustomsProcedureCodeType value) {
        return new JAXBElement<CustomsProcedureCodeType>(_CustomsProcedureCode_QNAME, CustomsProcedureCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsProcedureTerminationDateTime")
    public JAXBElement<XMLGregorianCalendar> createCustomsProcedureTerminationDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CustomsProcedureTerminationDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsReceiptDocId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsReceiptDocId(String value) {
        return new JAXBElement<String>(_CustomsReceiptDocId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsTaxModeCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsTaxModeCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsTaxModeCode")
    public JAXBElement<CustomsTaxModeCodeType> createCustomsTaxModeCode(CustomsTaxModeCodeType value) {
        return new JAXBElement<CustomsTaxModeCodeType>(_CustomsTaxModeCode_QNAME, CustomsTaxModeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsTaxModeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsTaxModeName(String value) {
        return new JAXBElement<String>(_CustomsTaxModeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsTaxPaymentFeatureCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsTaxPaymentFeatureCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsTaxPaymentFeatureCode")
    public JAXBElement<CustomsTaxPaymentFeatureCodeType> createCustomsTaxPaymentFeatureCode(CustomsTaxPaymentFeatureCodeType value) {
        return new JAXBElement<CustomsTaxPaymentFeatureCodeType>(_CustomsTaxPaymentFeatureCode_QNAME, CustomsTaxPaymentFeatureCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsTaxPaymentMethodCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsTaxPaymentMethodCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsTaxPaymentMethodCode")
    public JAXBElement<CustomsTaxPaymentMethodCodeType> createCustomsTaxPaymentMethodCode(CustomsTaxPaymentMethodCodeType value) {
        return new JAXBElement<CustomsTaxPaymentMethodCodeType>(_CustomsTaxPaymentMethodCode_QNAME, CustomsTaxPaymentMethodCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsTaxPaymentNoApplyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsTaxPaymentNoApplyCode(String value) {
        return new JAXBElement<String>(_CustomsTaxPaymentNoApplyCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createCustomsValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_CustomsValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsValueCheckIndicator")
    public JAXBElement<Boolean> createCustomsValueCheckIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_CustomsValueCheckIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsValueCorrectCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsValueCorrectCode(String value) {
        return new JAXBElement<String>(_CustomsValueCorrectCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsValueDate")
    public JAXBElement<XMLGregorianCalendar> createCustomsValueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CustomsValueDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsValueDecisionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsValueDecisionCode(String value) {
        return new JAXBElement<String>(_CustomsValueDecisionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "CustomsValuePreviousAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createCustomsValuePreviousAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_CustomsValuePreviousAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DTConsignmentItemOrdinal")
    public JAXBElement<BigInteger> createDTConsignmentItemOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_DTConsignmentItemOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DamagedCargoAreaIndicator")
    public JAXBElement<Boolean> createDamagedCargoAreaIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DamagedCargoAreaIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DamagedSealIndicator")
    public JAXBElement<Boolean> createDamagedSealIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DamagedSealIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DangerIndicator")
    public JAXBElement<Boolean> createDangerIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DangerIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DangerousGoodsIndicator")
    public JAXBElement<Boolean> createDangerousGoodsIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DangerousGoodsIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DataReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDataReasonCode(String value) {
        return new JAXBElement<String>(_DataReasonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeadIndicator")
    public JAXBElement<Boolean> createDeadIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DeadIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeadQuantity")
    public JAXBElement<BigInteger> createDeadQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_DeadQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DecisionReasonText")
    public JAXBElement<String> createDecisionReasonText(String value) {
        return new JAXBElement<String>(_DecisionReasonText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeclRegistrationDecisionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeclRegistrationDecisionCode(String value) {
        return new JAXBElement<String>(_DeclRegistrationDecisionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeclarationChangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeclarationChangeCode(String value) {
        return new JAXBElement<String>(_DeclarationChangeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclarationFeatureCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeclarationFeatureCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeclarationFeatureCode")
    public JAXBElement<DeclarationFeatureCodeType> createDeclarationFeatureCode(DeclarationFeatureCodeType value) {
        return new JAXBElement<DeclarationFeatureCodeType>(_DeclarationFeatureCode_QNAME, DeclarationFeatureCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeclarationId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeclarationId(String value) {
        return new JAXBElement<String>(_DeclarationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeclarationKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeclarationKindCode(String value) {
        return new JAXBElement<String>(_DeclarationKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeclarationRegistryAuthorityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeclarationRegistryAuthorityCode(String value) {
        return new JAXBElement<String>(_DeclarationRegistryAuthorityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DefectCustomsIdentificationMeansIndicator")
    public JAXBElement<Boolean> createDefectCustomsIdentificationMeansIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DefectCustomsIdentificationMeansIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeliveryExtensionReasonText")
    public JAXBElement<String> createDeliveryExtensionReasonText(String value) {
        return new JAXBElement<String>(_DeliveryExtensionReasonText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeliveryKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeliveryKindCode(String value) {
        return new JAXBElement<String>(_DeliveryKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeliveryPlaceName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeliveryPlaceName(String value) {
        return new JAXBElement<String>(_DeliveryPlaceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryTermsCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeliveryTermsCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeliveryTermsCode")
    public JAXBElement<DeliveryTermsCodeType> createDeliveryTermsCode(DeliveryTermsCodeType value) {
        return new JAXBElement<DeliveryTermsCodeType>(_DeliveryTermsCode_QNAME, DeliveryTermsCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCountryCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCountryCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DepartureCountryCode")
    public JAXBElement<UnifiedCountryCodeType> createDepartureCountryCode(UnifiedCountryCodeType value) {
        return new JAXBElement<UnifiedCountryCodeType>(_DepartureCountryCode_QNAME, UnifiedCountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DepartureCustomsOfficeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDepartureCustomsOfficeCode(String value) {
        return new JAXBElement<String>(_DepartureCustomsOfficeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DepartureDateTime")
    public JAXBElement<XMLGregorianCalendar> createDepartureDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DepartureDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DesignUnionValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createDesignUnionValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_DesignUnionValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DesignValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createDesignValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_DesignValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DespatchId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDespatchId(String value) {
        return new JAXBElement<String>(_DespatchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCountryCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCountryCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DestinationCountryCode")
    public JAXBElement<UnifiedCountryCodeType> createDestinationCountryCode(UnifiedCountryCodeType value) {
        return new JAXBElement<UnifiedCountryCodeType>(_DestinationCountryCode_QNAME, UnifiedCountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DestinationCustomsOfficeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDestinationCustomsOfficeCode(String value) {
        return new JAXBElement<String>(_DestinationCustomsOfficeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DestinationPlaceName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDestinationPlaceName(String value) {
        return new JAXBElement<String>(_DestinationPlaceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DeviceId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDeviceId(String value) {
        return new JAXBElement<String>(_DeviceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DiffPaymentNumericAmount")
    public JAXBElement<PaymentAmountWithNCurrencyType> createDiffPaymentNumericAmount(PaymentAmountWithNCurrencyType value) {
        return new JAXBElement<PaymentAmountWithNCurrencyType>(_DiffPaymentNumericAmount_QNAME, PaymentAmountWithNCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DifferenceCAPaymentAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createDifferenceCAPaymentAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_DifferenceCAPaymentAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DifferenceCAPaymentNAmount")
    public JAXBElement<PaymentAmountWithNCurrencyType> createDifferenceCAPaymentNAmount(PaymentAmountWithNCurrencyType value) {
        return new JAXBElement<PaymentAmountWithNCurrencyType>(_DifferenceCAPaymentNAmount_QNAME, PaymentAmountWithNCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DischargeIndicator")
    public JAXBElement<Boolean> createDischargeIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DischargeIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DiseaseConfirmCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDiseaseConfirmCode(String value) {
        return new JAXBElement<String>(_DiseaseConfirmCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DiseaseDate")
    public JAXBElement<XMLGregorianCalendar> createDiseaseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DiseaseDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DiseaseDescriptionText")
    public JAXBElement<String> createDiseaseDescriptionText(String value) {
        return new JAXBElement<String>(_DiseaseDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DiseaseOutcomeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDiseaseOutcomeCode(String value) {
        return new JAXBElement<String>(_DiseaseOutcomeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DiseasePersonQuantity")
    public JAXBElement<BigInteger> createDiseasePersonQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_DiseasePersonQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DiseaseSpreadIndicator")
    public JAXBElement<Boolean> createDiseaseSpreadIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DiseaseSpreadIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DiseaseSpreadText")
    public JAXBElement<String> createDiseaseSpreadText(String value) {
        return new JAXBElement<String>(_DiseaseSpreadText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DiseasedPersonLocationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDiseasedPersonLocationCode(String value) {
        return new JAXBElement<String>(_DiseasedPersonLocationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DisinfectionIndicator")
    public JAXBElement<Boolean> createDisinfectionIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DisinfectionIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DisinfectionMethodName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDisinfectionMethodName(String value) {
        return new JAXBElement<String>(_DisinfectionMethodName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DisinfestationIndicator")
    public JAXBElement<Boolean> createDisinfestationIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DisinfestationIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DisinfestationKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDisinfestationKindCode(String value) {
        return new JAXBElement<String>(_DisinfestationKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DisinfestationMethodText")
    public JAXBElement<String> createDisinfestationMethodText(String value) {
        return new JAXBElement<String>(_DisinfestationMethodText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DisinfestationPlaceText")
    public JAXBElement<String> createDisinfestationPlaceText(String value) {
        return new JAXBElement<String>(_DisinfestationPlaceText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DocAddInfoCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocAddInfoCode(String value) {
        return new JAXBElement<String>(_DocAddInfoCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DocEffectiveDate")
    public JAXBElement<XMLGregorianCalendar> createDocEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocEffectiveDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DocPresentDate")
    public JAXBElement<XMLGregorianCalendar> createDocPresentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocPresentDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DocPresentKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocPresentKindCode(String value) {
        return new JAXBElement<String>(_DocPresentKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DocUsageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocUsageCode(String value) {
        return new JAXBElement<String>(_DocUsageCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DocumentBoxId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocumentBoxId(String value) {
        return new JAXBElement<String>(_DocumentBoxId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DocumentQuantity")
    public JAXBElement<BigInteger> createDocumentQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_DocumentQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DoseMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createDoseMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_DoseMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DoubleCorridorExistenceIndicator")
    public JAXBElement<Boolean> createDoubleCorridorExistenceIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DoubleCorridorExistenceIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DraftMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createDraftMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_DraftMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DrugsIndicator")
    public JAXBElement<Boolean> createDrugsIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DrugsIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DutyTaxFeeCheckIndicator")
    public JAXBElement<Boolean> createDutyTaxFeeCheckIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_DutyTaxFeeCheckIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DutyTaxFeeRateDate")
    public JAXBElement<XMLGregorianCalendar> createDutyTaxFeeRateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DutyTaxFeeRateDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DutyTaxFeeRateKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDutyTaxFeeRateKindCode(String value) {
        return new JAXBElement<String>(_DutyTaxFeeRateKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "DutyTaxFeeRateValue")
    public JAXBElement<BigDecimal> createDutyTaxFeeRateValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DutyTaxFeeRateValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EArchId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEArchId(String value) {
        return new JAXBElement<String>(_EArchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ECOClassCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createECOClassCode(String value) {
        return new JAXBElement<String>(_ECOClassCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EDeclarationCustomsOfficeListCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEDeclarationCustomsOfficeListCode(String value) {
        return new JAXBElement<String>(_EDeclarationCustomsOfficeListCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EDocArchId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEDocArchId(String value) {
        return new JAXBElement<String>(_EDocArchId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EDocCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEDocCode(String value) {
        return new JAXBElement<String>(_EDocCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EDocIndicatorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEDocIndicatorCode(String value) {
        return new JAXBElement<String>(_EDocIndicatorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EmbarkationDate")
    public JAXBElement<XMLGregorianCalendar> createEmbarkationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmbarkationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EmergencyDeviceId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEmergencyDeviceId(String value) {
        return new JAXBElement<String>(_EmergencyDeviceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EngineKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEngineKindCode(String value) {
        return new JAXBElement<String>(_EngineKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EngineModelCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEngineModelCode(String value) {
        return new JAXBElement<String>(_EngineModelCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EngineVolumeMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createEngineVolumeMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_EngineVolumeMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EqualIndicator")
    public JAXBElement<Boolean> createEqualIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_EqualIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EquipmentErrorText")
    public JAXBElement<String> createEquipmentErrorText(String value) {
        return new JAXBElement<String>(_EquipmentErrorText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EquipmentModelName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEquipmentModelName(String value) {
        return new JAXBElement<String>(_EquipmentModelName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EquipmentQuantity")
    public JAXBElement<BigInteger> createEquipmentQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_EquipmentQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "EquipmentTypeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEquipmentTypeName(String value) {
        return new JAXBElement<String>(_EquipmentTypeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExchangePostOfficeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExchangePostOfficeCode(String value) {
        return new JAXBElement<String>(_ExchangePostOfficeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExchangeRate")
    public JAXBElement<ExchangeRateType> createExchangeRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_ExchangeRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExchangeRateDate")
    public JAXBElement<XMLGregorianCalendar> createExchangeRateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExchangeRateDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExciseFirstStampId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExciseFirstStampId(String value) {
        return new JAXBElement<String>(_ExciseFirstStampId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExciseLastStampId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExciseLastStampId(String value) {
        return new JAXBElement<String>(_ExciseLastStampId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsTaxPrefCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsTaxPrefCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExcisePrefCode")
    public JAXBElement<CustomsTaxPrefCodeType> createExcisePrefCode(CustomsTaxPrefCodeType value) {
        return new JAXBElement<CustomsTaxPrefCodeType>(_ExcisePrefCode_QNAME, CustomsTaxPrefCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExciseStampId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExciseStampId(String value) {
        return new JAXBElement<String>(_ExciseStampId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExciseStampQuantity")
    public JAXBElement<BigInteger> createExciseStampQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_ExciseStampQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExciseStampSeriesId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExciseStampSeriesId(String value) {
        return new JAXBElement<String>(_ExciseStampSeriesId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExploitationDuration")
    public JAXBElement<Duration> createExploitationDuration(Duration value) {
        return new JAXBElement<Duration>(_ExploitationDuration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExportCancelDateTime")
    public JAXBElement<XMLGregorianCalendar> createExportCancelDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExportCancelDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExportCancellationReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExportCancellationReasonCode(String value) {
        return new JAXBElement<String>(_ExportCancellationReasonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExportCancellationReasonName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExportCancellationReasonName(String value) {
        return new JAXBElement<String>(_ExportCancellationReasonName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExportDate")
    public JAXBElement<XMLGregorianCalendar> createExportDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExportDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExportDateTime")
    public JAXBElement<XMLGregorianCalendar> createExportDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ExportDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExportElectricPowerMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createExportElectricPowerMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_ExportElectricPowerMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExpositionDuration")
    public JAXBElement<Duration> createExpositionDuration(Duration value) {
        return new JAXBElement<Duration>(_ExpositionDuration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ExpressRegistryKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createExpressRegistryKindCode(String value) {
        return new JAXBElement<String>(_ExpressRegistryKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FECustomsOfficeListCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFECustomsOfficeListCode(String value) {
        return new JAXBElement<String>(_FECustomsOfficeListCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FactGrossMassMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createFactGrossMassMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_FactGrossMassMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FactPaidAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createFactPaidAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_FactPaidAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FactPaymentCheckIndicator")
    public JAXBElement<Boolean> createFactPaymentCheckIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_FactPaymentCheckIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FactVolumeMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createFactVolumeMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_FactVolumeMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FieldName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFieldName(String value) {
        return new JAXBElement<String>(_FieldName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FirstLabelId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFirstLabelId(String value) {
        return new JAXBElement<String>(_FirstLabelId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FirstReferenceOrdinal")
    public JAXBElement<BigInteger> createFirstReferenceOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_FirstReferenceOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMeansRegIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransportMeansRegIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FirstTrailerRegId")
    public JAXBElement<TransportMeansRegIdType> createFirstTrailerRegId(TransportMeansRegIdType value) {
        return new JAXBElement<TransportMeansRegIdType>(_FirstTrailerRegId_QNAME, TransportMeansRegIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FirstVisualIdentifierCIMId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFirstVisualIdentifierCIMId(String value) {
        return new JAXBElement<String>(_FirstVisualIdentifierCIMId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FlightId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFlightId(String value) {
        return new JAXBElement<String>(_FlightId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ForeignCustomsIdentificationMeansIndicator")
    public JAXBElement<Boolean> createForeignCustomsIdentificationMeansIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ForeignCustomsIdentificationMeansIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FreePracticeRestrictionIndicator")
    public JAXBElement<Boolean> createFreePracticeRestrictionIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_FreePracticeRestrictionIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "FullItemCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFullItemCode(String value) {
        return new JAXBElement<String>(_FullItemCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GCAcceptCancellationReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGCAcceptCancellationReasonCode(String value) {
        return new JAXBElement<String>(_GCAcceptCancellationReasonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GCCancellationReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGCCancellationReasonCode(String value) {
        return new JAXBElement<String>(_GCCancellationReasonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GCChangeRejectReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGCChangeRejectReasonCode(String value) {
        return new JAXBElement<String>(_GCChangeRejectReasonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GCRegistrationCancelReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGCRegistrationCancelReasonCode(String value) {
        return new JAXBElement<String>(_GCRegistrationCancelReasonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GCRejectReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGCRejectReasonCode(String value) {
        return new JAXBElement<String>(_GCRejectReasonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GDCConsignmentItemOrdinal")
    public JAXBElement<BigInteger> createGDCConsignmentItemOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_GDCConsignmentItemOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GDCGoodsQuantity")
    public JAXBElement<BigInteger> createGDCGoodsQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_GDCGoodsQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GDCSecurityLabelId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGDCSecurityLabelId(String value) {
        return new JAXBElement<String>(_GDCSecurityLabelId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsArticleName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGoodsArticleName(String value) {
        return new JAXBElement<String>(_GoodsArticleName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsCategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGoodsCategoryCode(String value) {
        return new JAXBElement<String>(_GoodsCategoryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsClassificationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGoodsClassificationCode(String value) {
        return new JAXBElement<String>(_GoodsClassificationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsComponentCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGoodsComponentCode(String value) {
        return new JAXBElement<String>(_GoodsComponentCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsDangerText")
    public JAXBElement<String> createGoodsDangerText(String value) {
        return new JAXBElement<String>(_GoodsDangerText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsDescriptionText")
    public JAXBElement<String> createGoodsDescriptionText(String value) {
        return new JAXBElement<String>(_GoodsDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsDetentionReasonText")
    public JAXBElement<String> createGoodsDetentionReasonText(String value) {
        return new JAXBElement<String>(_GoodsDetentionReasonText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsDisassembledCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGoodsDisassembledCode(String value) {
        return new JAXBElement<String>(_GoodsDisassembledCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsFeatureCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGoodsFeatureCode(String value) {
        return new JAXBElement<String>(_GoodsFeatureCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsFullyExportedIndicator")
    public JAXBElement<Boolean> createGoodsFullyExportedIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_GoodsFullyExportedIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsIdentificationMethodText")
    public JAXBElement<String> createGoodsIdentificationMethodText(String value) {
        return new JAXBElement<String>(_GoodsIdentificationMethodText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsInspectionIndicator")
    public JAXBElement<Boolean> createGoodsInspectionIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_GoodsInspectionIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsIssueDate")
    public JAXBElement<XMLGregorianCalendar> createGoodsIssueDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GoodsIssueDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsLabelDescriptionText")
    public JAXBElement<String> createGoodsLabelDescriptionText(String value) {
        return new JAXBElement<String>(_GoodsLabelDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsLocationCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsLocationCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsLocationCode")
    public JAXBElement<GoodsLocationCodeType> createGoodsLocationCode(GoodsLocationCodeType value) {
        return new JAXBElement<GoodsLocationCodeType>(_GoodsLocationCode_QNAME, GoodsLocationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsLocationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGoodsLocationName(String value) {
        return new JAXBElement<String>(_GoodsLocationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createGoodsMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_GoodsMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsMilitaryIndicator")
    public JAXBElement<Boolean> createGoodsMilitaryIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_GoodsMilitaryIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsMoveFeatureCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsMoveFeatureCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsMoveFeatureCode")
    public JAXBElement<GoodsMoveFeatureCodeType> createGoodsMoveFeatureCode(GoodsMoveFeatureCodeType value) {
        return new JAXBElement<GoodsMoveFeatureCodeType>(_GoodsMoveFeatureCode_QNAME, GoodsMoveFeatureCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsProhibitionFreeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGoodsProhibitionFreeCode(String value) {
        return new JAXBElement<String>(_GoodsProhibitionFreeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsQuantity")
    public JAXBElement<BigInteger> createGoodsQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_GoodsQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedFractionNumber246MeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedFractionNumber246MeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsQuotaMeasure")
    public JAXBElement<UnifiedFractionNumber246MeasureType> createGoodsQuotaMeasure(UnifiedFractionNumber246MeasureType value) {
        return new JAXBElement<UnifiedFractionNumber246MeasureType>(_GoodsQuotaMeasure_QNAME, UnifiedFractionNumber246MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsRestrictionText")
    public JAXBElement<String> createGoodsRestrictionText(String value) {
        return new JAXBElement<String>(_GoodsRestrictionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsSubstituteText")
    public JAXBElement<String> createGoodsSubstituteText(String value) {
        return new JAXBElement<String>(_GoodsSubstituteText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsTraceabilityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGoodsTraceabilityCode(String value) {
        return new JAXBElement<String>(_GoodsTraceabilityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsTranshsipmentIndicator")
    public JAXBElement<Boolean> createGoodsTranshsipmentIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_GoodsTranshsipmentIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsUnitPriceAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createGoodsUnitPriceAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_GoodsUnitPriceAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GoodsUsageDescriptionText")
    public JAXBElement<String> createGoodsUsageDescriptionText(String value) {
        return new JAXBElement<String>(_GoodsUsageDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GovControlKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGovControlKindCode(String value) {
        return new JAXBElement<String>(_GovControlKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GovControlKindName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGovControlKindName(String value) {
        return new JAXBElement<String>(_GovControlKindName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GrossTonnageMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createGrossTonnageMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_GrossTonnageMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GuaranteeAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createGuaranteeAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_GuaranteeAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GuaranteeCauseCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGuaranteeCauseCode(String value) {
        return new JAXBElement<String>(_GuaranteeCauseCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GuaranteeCertificateRegId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGuaranteeCertificateRegId(String value) {
        return new JAXBElement<String>(_GuaranteeCertificateRegId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GuaranteeCertificateValidityDate")
    public JAXBElement<XMLGregorianCalendar> createGuaranteeCertificateValidityDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GuaranteeCertificateValidityDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GuaranteeIndicator")
    public JAXBElement<Boolean> createGuaranteeIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_GuaranteeIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GuaranteeNAmount")
    public JAXBElement<PaymentAmountWithNCurrencyType> createGuaranteeNAmount(PaymentAmountWithNCurrencyType value) {
        return new JAXBElement<PaymentAmountWithNCurrencyType>(_GuaranteeNAmount_QNAME, PaymentAmountWithNCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "GuaranteePresentCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGuaranteePresentCode(String value) {
        return new JAXBElement<String>(_GuaranteePresentCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "HMConsignmentItemNumber")
    public JAXBElement<BigDecimal> createHMConsignmentItemNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HMConsignmentItemNumber_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "HumidityMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createHumidityMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_HumidityMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "IPOCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIPOCode(String value) {
        return new JAXBElement<String>(_IPOCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "IPObjectId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIPObjectId(String value) {
        return new JAXBElement<String>(_IPObjectId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "IdenticalGoodsValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createIdenticalGoodsValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_IdenticalGoodsValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "IdentifacationMeansCustomsId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIdentifacationMeansCustomsId(String value) {
        return new JAXBElement<String>(_IdentifacationMeansCustomsId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "IdentifacationMeansUnitCharacterValueId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIdentifacationMeansUnitCharacterValueId(String value) {
        return new JAXBElement<String>(_IdentifacationMeansUnitCharacterValueId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "IdentificationMeansKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIdentificationMeansKindCode(String value) {
        return new JAXBElement<String>(_IdentificationMeansKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ImportElectricPowerMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createImportElectricPowerMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_ImportElectricPowerMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "IncidentPlaceName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIncidentPlaceName(String value) {
        return new JAXBElement<String>(_IncidentPlaceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "IndirectPaymentCurrencyRate")
    public JAXBElement<ExchangeRateType> createIndirectPaymentCurrencyRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_IndirectPaymentCurrencyRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InformationIndicator")
    public JAXBElement<Boolean> createInformationIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_InformationIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InformationKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInformationKindCode(String value) {
        return new JAXBElement<String>(_InformationKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InformationSourceName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInformationSourceName(String value) {
        return new JAXBElement<String>(_InformationSourceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InformationUnknownIndicator")
    public JAXBElement<Boolean> createInformationUnknownIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_InformationUnknownIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InspectionDocId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInspectionDocId(String value) {
        return new JAXBElement<String>(_InspectionDocId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InspectionObjectCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInspectionObjectCode(String value) {
        return new JAXBElement<String>(_InspectionObjectCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InsuranceAdjustmentAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createInsuranceAdjustmentAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_InsuranceAdjustmentAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InsuranceValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createInsuranceValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_InsuranceValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "IntegrationProgramName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIntegrationProgramName(String value) {
        return new JAXBElement<String>(_IntegrationProgramName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InternalDocId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInternalDocId(String value) {
        return new JAXBElement<String>(_InternalDocId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InternationalMailCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInternationalMailCode(String value) {
        return new JAXBElement<String>(_InternationalMailCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InternationalMailId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInternationalMailId(String value) {
        return new JAXBElement<String>(_InternationalMailId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InternationalMailKindName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInternationalMailKindName(String value) {
        return new JAXBElement<String>(_InternationalMailKindName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InterpretationRuleCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInterpretationRuleCode(String value) {
        return new JAXBElement<String>(_InterpretationRuleCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InvestmentGoodsListKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInvestmentGoodsListKindCode(String value) {
        return new JAXBElement<String>(_InvestmentGoodsListKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InvestmentProjectGoodsSeqId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInvestmentProjectGoodsSeqId(String value) {
        return new JAXBElement<String>(_InvestmentProjectGoodsSeqId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InvestmentProjectSeqId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInvestmentProjectSeqId(String value) {
        return new JAXBElement<String>(_InvestmentProjectSeqId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InvestmentProjectYear")
    public JAXBElement<XMLGregorianCalendar> createInvestmentProjectYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_InvestmentProjectYear_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "InvoicePriceAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createInvoicePriceAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_InvoicePriceAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ItemQuantity")
    public JAXBElement<BigInteger> createItemQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_ItemQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ItineraryPointCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createItineraryPointCode(String value) {
        return new JAXBElement<String>(_ItineraryPointCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "JobName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createJobName(String value) {
        return new JAXBElement<String>(_JobName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LNPId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLNPId(String value) {
        return new JAXBElement<String>(_LNPId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LabelId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLabelId(String value) {
        return new JAXBElement<String>(_LabelId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LastLabelId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLastLabelId(String value) {
        return new JAXBElement<String>(_LastLabelId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LastReferenceOrdinal")
    public JAXBElement<BigInteger> createLastReferenceOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_LastReferenceOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LastVisualIdentifierCIMId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLastVisualIdentifierCIMId(String value) {
        return new JAXBElement<String>(_LastVisualIdentifierCIMId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LegalActArticleId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLegalActArticleId(String value) {
        return new JAXBElement<String>(_LegalActArticleId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LegalActPositionId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLegalActPositionId(String value) {
        return new JAXBElement<String>(_LegalActPositionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LegalActSubPositionId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLegalActSubPositionId(String value) {
        return new JAXBElement<String>(_LegalActSubPositionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LicenseAnnexOrdinal")
    public JAXBElement<BigInteger> createLicenseAnnexOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_LicenseAnnexOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LicenseGoodsKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLicenseGoodsKindCode(String value) {
        return new JAXBElement<String>(_LicenseGoodsKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LightCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLightCode(String value) {
        return new JAXBElement<String>(_LightCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LineId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLineId(String value) {
        return new JAXBElement<String>(_LineId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ListItemOrdinal")
    public JAXBElement<BigInteger> createListItemOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_ListItemOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LoadingAdjustmentAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createLoadingAdjustmentAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_LoadingAdjustmentAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LoadingId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLoadingId(String value) {
        return new JAXBElement<String>(_LoadingId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LoadingIndicator")
    public JAXBElement<Boolean> createLoadingIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_LoadingIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LoadingListsPageQuantity")
    public JAXBElement<BigInteger> createLoadingListsPageQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_LoadingListsPageQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LoadingListsQuantity")
    public JAXBElement<BigInteger> createLoadingListsQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_LoadingListsQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LoadingValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createLoadingValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_LoadingValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocationCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LocationCode")
    public JAXBElement<LocationCodeType> createLocationCode(LocationCodeType value) {
        return new JAXBElement<LocationCodeType>(_LocationCode_QNAME, LocationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "LossKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLossKindCode(String value) {
        return new JAXBElement<String>(_LossKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MaintenanceSystemCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMaintenanceSystemCode(String value) {
        return new JAXBElement<String>(_MaintenanceSystemCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ManufacturerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createManufacturerName(String value) {
        return new JAXBElement<String>(_ManufacturerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MaterialsValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createMaterialsValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_MaterialsValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MaxRangeMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createMaxRangeMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_MaxRangeMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MeasureUnitAbbreviationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMeasureUnitAbbreviationCode(String value) {
        return new JAXBElement<String>(_MeasureUnitAbbreviationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MediaTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMediaTypeCode(String value) {
        return new JAXBElement<String>(_MediaTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MedicalConsultationIndicator")
    public JAXBElement<Boolean> createMedicalConsultationIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_MedicalConsultationIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MethodReasonText")
    public JAXBElement<String> createMethodReasonText(String value) {
        return new JAXBElement<String>(_MethodReasonText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MinRangeMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createMinRangeMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_MinRangeMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MinorPersonQuantity")
    public JAXBElement<BigInteger> createMinorPersonQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_MinorPersonQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MoneySourceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMoneySourceCode(String value) {
        return new JAXBElement<String>(_MoneySourceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MoneyUsageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMoneyUsageCode(String value) {
        return new JAXBElement<String>(_MoneyUsageCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MoveDirectCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMoveDirectCode(String value) {
        return new JAXBElement<String>(_MoveDirectCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "MovementId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMovementId(String value) {
        return new JAXBElement<String>(_MovementId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "NationalCommodityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNationalCommodityCode(String value) {
        return new JAXBElement<String>(_NationalCommodityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "NationalGuaranteeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNationalGuaranteeCode(String value) {
        return new JAXBElement<String>(_NationalGuaranteeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "NationalIndirectPaymentAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createNationalIndirectPaymentAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_NationalIndirectPaymentAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "NationalInvoicePriceAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createNationalInvoicePriceAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_NationalInvoicePriceAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "NavigationSealId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNavigationSealId(String value) {
        return new JAXBElement<String>(_NavigationSealId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "NegotiableInstrumentId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNegotiableInstrumentId(String value) {
        return new JAXBElement<String>(_NegotiableInstrumentId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "NegotiableInstrumentName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createNegotiableInstrumentName(String value) {
        return new JAXBElement<String>(_NegotiableInstrumentName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoGuaranteeCauseCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NoGuaranteeCauseCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "NoGuaranteeCauseCode")
    public JAXBElement<NoGuaranteeCauseCodeType> createNoGuaranteeCauseCode(NoGuaranteeCauseCodeType value) {
        return new JAXBElement<NoGuaranteeCauseCodeType>(_NoGuaranteeCauseCode_QNAME, NoGuaranteeCauseCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CACountryCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CACountryCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "NonGuaranteeCountryCode")
    public JAXBElement<CACountryCodeType> createNonGuaranteeCountryCode(CACountryCodeType value) {
        return new JAXBElement<CACountryCodeType>(_NonGuaranteeCountryCode_QNAME, CACountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ObjectDescriptionText")
    public JAXBElement<String> createObjectDescriptionText(String value) {
        return new JAXBElement<String>(_ObjectDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffenceCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OffenceCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OffenceCode")
    public JAXBElement<OffenceCodeType> createOffenceCode(OffenceCodeType value) {
        return new JAXBElement<OffenceCodeType>(_OffenceCode_QNAME, OffenceCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OffenceDesctiptionText")
    public JAXBElement<String> createOffenceDesctiptionText(String value) {
        return new JAXBElement<String>(_OffenceDesctiptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OffenceIndicator")
    public JAXBElement<Boolean> createOffenceIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_OffenceIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OilTransferMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createOilTransferMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_OilTransferMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OnBoardDiseasePersonIndicator")
    public JAXBElement<Boolean> createOnBoardDiseasePersonIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_OnBoardDiseasePersonIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OneTimePermissionIndicator")
    public JAXBElement<Boolean> createOneTimePermissionIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_OneTimePermissionIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OperabilityIndicator")
    public JAXBElement<Boolean> createOperabilityIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_OperabilityIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OperationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOperationCode(String value) {
        return new JAXBElement<String>(_OperationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OperationDateTime")
    public JAXBElement<XMLGregorianCalendar> createOperationDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OperationDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OperationId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOperationId(String value) {
        return new JAXBElement<String>(_OperationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OperationSignCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOperationSignCode(String value) {
        return new JAXBElement<String>(_OperationSignCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "Ordinal3Ordinal")
    public JAXBElement<BigInteger> createOrdinal3Ordinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_Ordinal3Ordinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OriginDecisionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOriginDecisionCode(String value) {
        return new JAXBElement<String>(_OriginDecisionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OriginalCheckIndicator")
    public JAXBElement<Boolean> createOriginalCheckIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_OriginalCheckIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OtherChangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOtherChangeCode(String value) {
        return new JAXBElement<String>(_OtherChangeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OverloadIndicator")
    public JAXBElement<Boolean> createOverloadIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_OverloadIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "OwnerPresenceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOwnerPresenceCode(String value) {
        return new JAXBElement<String>(_OwnerPresenceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PDAddRegistrationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPDAddRegistrationCode(String value) {
        return new JAXBElement<String>(_PDAddRegistrationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PDGoodsCategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPDGoodsCategoryCode(String value) {
        return new JAXBElement<String>(_PDGoodsCategoryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PDMovingMethodCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPDMovingMethodCode(String value) {
        return new JAXBElement<String>(_PDMovingMethodCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PDTransferPurposeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPDTransferPurposeCode(String value) {
        return new JAXBElement<String>(_PDTransferPurposeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PackageAvailabilityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPackageAvailabilityCode(String value) {
        return new JAXBElement<String>(_PackageAvailabilityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PackageKindName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPackageKindName(String value) {
        return new JAXBElement<String>(_PackageKindName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PackageOrdinal")
    public JAXBElement<BigInteger> createPackageOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_PackageOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PackageValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createPackageValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_PackageValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PageConsignmentItemOrdinal")
    public JAXBElement<BigInteger> createPageConsignmentItemOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_PageConsignmentItemOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PageOrdinal")
    public JAXBElement<BigInteger> createPageOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_PageOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PartialDeliveryIndicator")
    public JAXBElement<Boolean> createPartialDeliveryIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_PartialDeliveryIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PartialTerminationIndicator")
    public JAXBElement<Boolean> createPartialTerminationIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_PartialTerminationIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PassengersIndicator")
    public JAXBElement<Boolean> createPassengersIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_PassengersIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PassengersQuantity")
    public JAXBElement<BigInteger> createPassengersQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_PassengersQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PaymentCalculationEventCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentCalculationEventCode(String value) {
        return new JAXBElement<String>(_PaymentCalculationEventCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PaymentDate")
    public JAXBElement<XMLGregorianCalendar> createPaymentDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PaymentDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PaymentDutyTerminationEventCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentDutyTerminationEventCode(String value) {
        return new JAXBElement<String>(_PaymentDutyTerminationEventCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentGuaranteeMethodCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentGuaranteeMethodCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PaymentGuaranteeMethodCode")
    public JAXBElement<PaymentGuaranteeMethodCodeType> createPaymentGuaranteeMethodCode(PaymentGuaranteeMethodCodeType value) {
        return new JAXBElement<PaymentGuaranteeMethodCodeType>(_PaymentGuaranteeMethodCode_QNAME, PaymentGuaranteeMethodCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PeriodDuration")
    public JAXBElement<Duration> createPeriodDuration(Duration value) {
        return new JAXBElement<Duration>(_PeriodDuration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PerishableIndicator")
    public JAXBElement<Boolean> createPerishableIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_PerishableIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PersonId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPersonId(String value) {
        return new JAXBElement<String>(_PersonId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PersonIndicator")
    public JAXBElement<Boolean> createPersonIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_PersonIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PlaceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPlaceCode(String value) {
        return new JAXBElement<String>(_PlaceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PlaceName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPlaceName(String value) {
        return new JAXBElement<String>(_PlaceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PlatformLengthMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createPlatformLengthMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_PlatformLengthMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreDecisionCancelReasonText")
    public JAXBElement<String> createPreDecisionCancelReasonText(String value) {
        return new JAXBElement<String>(_PreDecisionCancelReasonText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreDecisionCountryId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPreDecisionCountryId(String value) {
        return new JAXBElement<String>(_PreDecisionCountryId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreDecisionGoodsName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPreDecisionGoodsName(String value) {
        return new JAXBElement<String>(_PreDecisionGoodsName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreDecisionKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPreDecisionKindCode(String value) {
        return new JAXBElement<String>(_PreDecisionKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreDecisionTNVEDCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPreDecisionTNVEDCode(String value) {
        return new JAXBElement<String>(_PreDecisionTNVEDCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreDeclarationNetMassMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createPreDeclarationNetMassMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_PreDeclarationNetMassMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PrecedingDocId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPrecedingDocId(String value) {
        return new JAXBElement<String>(_PrecedingDocId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreferenceDecisionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPreferenceDecisionCode(String value) {
        return new JAXBElement<String>(_PreferenceDecisionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountWithCurrencyV3Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AmountWithCurrencyV3Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreferencesAmount")
    public JAXBElement<AmountWithCurrencyV3Type> createPreferencesAmount(AmountWithCurrencyV3Type value) {
        return new JAXBElement<AmountWithCurrencyV3Type>(_PreferencesAmount_QNAME, AmountWithCurrencyV3Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreliminaryInformationId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPreliminaryInformationId(String value) {
        return new JAXBElement<String>(_PreliminaryInformationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreliminaryInformationSeqId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPreliminaryInformationSeqId(String value) {
        return new JAXBElement<String>(_PreliminaryInformationSeqId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreliminaryInformationUsageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPreliminaryInformationUsageCode(String value) {
        return new JAXBElement<String>(_PreliminaryInformationUsageCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PresenceIndicator")
    public JAXBElement<Boolean> createPresenceIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_PresenceIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreviousCAPaymentAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createPreviousCAPaymentAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_PreviousCAPaymentAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreviousCAPaymentNAmount")
    public JAXBElement<PaymentAmountWithNCurrencyType> createPreviousCAPaymentNAmount(PaymentAmountWithNCurrencyType value) {
        return new JAXBElement<PaymentAmountWithNCurrencyType>(_PreviousCAPaymentNAmount_QNAME, PaymentAmountWithNCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsProcedureCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsProcedureCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreviousCustomsProcedureModeCode")
    public JAXBElement<CustomsProcedureCodeType> createPreviousCustomsProcedureModeCode(CustomsProcedureCodeType value) {
        return new JAXBElement<CustomsProcedureCodeType>(_PreviousCustomsProcedureModeCode_QNAME, CustomsProcedureCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreviousMovingDate")
    public JAXBElement<XMLGregorianCalendar> createPreviousMovingDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PreviousMovingDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PreviousPaymentNumericAmount")
    public JAXBElement<PaymentAmountWithNCurrencyType> createPreviousPaymentNumericAmount(PaymentAmountWithNCurrencyType value) {
        return new JAXBElement<PaymentAmountWithNCurrencyType>(_PreviousPaymentNumericAmount_QNAME, PaymentAmountWithNCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeRateType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PriceCurrencyRate")
    public JAXBElement<ExchangeRateType> createPriceCurrencyRate(ExchangeRateType value) {
        return new JAXBElement<ExchangeRateType>(_PriceCurrencyRate_QNAME, ExchangeRateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "PriceInfluenceIndicator")
    public JAXBElement<Boolean> createPriceInfluenceIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_PriceInfluenceIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ProcessingDescriptionText")
    public JAXBElement<String> createProcessingDescriptionText(String value) {
        return new JAXBElement<String>(_ProcessingDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ProcessingDuration")
    public JAXBElement<Duration> createProcessingDuration(Duration value) {
        return new JAXBElement<Duration>(_ProcessingDuration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ProcessingOperationMethodText")
    public JAXBElement<String> createProcessingOperationMethodText(String value) {
        return new JAXBElement<String>(_ProcessingOperationMethodText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ProcessingOperationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProcessingOperationName(String value) {
        return new JAXBElement<String>(_ProcessingOperationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ProcessingProductKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProcessingProductKindCode(String value) {
        return new JAXBElement<String>(_ProcessingProductKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ProcessingValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createProcessingValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_ProcessingValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ProductMarkName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductMarkName(String value) {
        return new JAXBElement<String>(_ProductMarkName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ProductTypeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductTypeName(String value) {
        return new JAXBElement<String>(_ProductTypeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ProductionPlaceName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductionPlaceName(String value) {
        return new JAXBElement<String>(_ProductionPlaceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ProductionValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createProductionValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_ProductionValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ProfitAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createProfitAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_ProfitAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ProhibitionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProhibitionCode(String value) {
        return new JAXBElement<String>(_ProhibitionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "QualificationCertificateId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createQualificationCertificateId(String value) {
        return new JAXBElement<String>(_QualificationCertificateId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "QuantityAdjustmentAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createQuantityAdjustmentAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_QuantityAdjustmentAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "QuantityChangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createQuantityChangeCode(String value) {
        return new JAXBElement<String>(_QuantityChangeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "QueryKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createQueryKindCode(String value) {
        return new JAXBElement<String>(_QueryKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "QuotaRemainderAmount")
    public JAXBElement<PaymentAmountWithNCurrencyType> createQuotaRemainderAmount(PaymentAmountWithNCurrencyType value) {
        return new JAXBElement<PaymentAmountWithNCurrencyType>(_QuotaRemainderAmount_QNAME, PaymentAmountWithNCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RadiationMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createRadiationMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_RadiationMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RailwayStatementIndicator")
    public JAXBElement<Boolean> createRailwayStatementIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_RailwayStatementIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RailwayStationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRailwayStationCode(String value) {
        return new JAXBElement<String>(_RailwayStationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RateOfYieldText")
    public JAXBElement<String> createRateOfYieldText(String value) {
        return new JAXBElement<String>(_RateOfYieldText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReInspectionIndicator")
    public JAXBElement<Boolean> createReInspectionIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ReInspectionIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReasonChangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReasonChangeCode(String value) {
        return new JAXBElement<String>(_ReasonChangeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RecommendationText")
    public JAXBElement<String> createRecommendationText(String value) {
        return new JAXBElement<String>(_RecommendationText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RefReferenceLineId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRefReferenceLineId(String value) {
        return new JAXBElement<String>(_RefReferenceLineId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReferenceCarrierOrdinal")
    public JAXBElement<BigInteger> createReferenceCarrierOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_ReferenceCarrierOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReferenceConsignmentItemOrdinal")
    public JAXBElement<BigInteger> createReferenceConsignmentItemOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_ReferenceConsignmentItemOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReferenceDocumentId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReferenceDocumentId(String value) {
        return new JAXBElement<String>(_ReferenceDocumentId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReferenceLineId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReferenceLineId(String value) {
        return new JAXBElement<String>(_ReferenceLineId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReferenceObjectOrdinal")
    public JAXBElement<BigInteger> createReferenceObjectOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_ReferenceObjectOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RefinanceRate")
    public JAXBElement<BigDecimal> createRefinanceRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RefinanceRate_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RefundAmountCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRefundAmountCode(String value) {
        return new JAXBElement<String>(_RefundAmountCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RegTIRDate")
    public JAXBElement<XMLGregorianCalendar> createRegTIRDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RegTIRDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RegionRestrictionText")
    public JAXBElement<String> createRegionRestrictionText(String value) {
        return new JAXBElement<String>(_RegionRestrictionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RegisterDocumentKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRegisterDocumentKindCode(String value) {
        return new JAXBElement<String>(_RegisterDocumentKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CACountryCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CACountryCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RegistrationNationalityCode")
    public JAXBElement<CACountryCodeType> createRegistrationNationalityCode(CACountryCodeType value) {
        return new JAXBElement<CACountryCodeType>(_RegistrationNationalityCode_QNAME, CACountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RegistrationNumberId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRegistrationNumberId(String value) {
        return new JAXBElement<String>(_RegistrationNumberId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RegistrationRemovalIndicator")
    public JAXBElement<Boolean> createRegistrationRemovalIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_RegistrationRemovalIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RegistrationSeriesId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRegistrationSeriesId(String value) {
        return new JAXBElement<String>(_RegistrationSeriesId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RegistryDocCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRegistryDocCode(String value) {
        return new JAXBElement<String>(_RegistryDocCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RegistryOwnerCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRegistryOwnerCode(String value) {
        return new JAXBElement<String>(_RegistryOwnerCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RelationIndicator")
    public JAXBElement<Boolean> createRelationIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_RelationIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReleaseId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReleaseId(String value) {
        return new JAXBElement<String>(_ReleaseId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReleaseProlongationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReleaseProlongationCode(String value) {
        return new JAXBElement<String>(_ReleaseProlongationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedFractionNumber246MeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedFractionNumber246MeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RemainGrossWeightMeasure")
    public JAXBElement<UnifiedFractionNumber246MeasureType> createRemainGrossWeightMeasure(UnifiedFractionNumber246MeasureType value) {
        return new JAXBElement<UnifiedFractionNumber246MeasureType>(_RemainGrossWeightMeasure_QNAME, UnifiedFractionNumber246MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReregistrationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReregistrationCode(String value) {
        return new JAXBElement<String>(_ReregistrationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReservationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReservationCode(String value) {
        return new JAXBElement<String>(_ReservationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReservedCustomsOfficeIndicatorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReservedCustomsOfficeIndicatorCode(String value) {
        return new JAXBElement<String>(_ReservedCustomsOfficeIndicatorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ResourceValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createResourceValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_ResourceValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RestrictionIndicator")
    public JAXBElement<Boolean> createRestrictionIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_RestrictionIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ResultColumnAAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createResultColumnAAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_ResultColumnAAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ResultColumnBAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createResultColumnBAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_ResultColumnBAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ResultColumnCAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createResultColumnCAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_ResultColumnCAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReturnIndicator")
    public JAXBElement<Boolean> createReturnIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ReturnIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ReusableContainerIndicator")
    public JAXBElement<Boolean> createReusableContainerIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ReusableContainerIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RoleCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRoleCode(String value) {
        return new JAXBElement<String>(_RoleCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RoutePointOrdinal")
    public JAXBElement<BigInteger> createRoutePointOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_RoutePointOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RoyaltyAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createRoyaltyAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_RoyaltyAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RoyaltyContractIndicator")
    public JAXBElement<Boolean> createRoyaltyContractIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_RoyaltyContractIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RoyaltyFeeDescriptionText")
    public JAXBElement<String> createRoyaltyFeeDescriptionText(String value) {
        return new JAXBElement<String>(_RoyaltyFeeDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "RoyaltyFeeIndicator")
    public JAXBElement<Boolean> createRoyaltyFeeIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_RoyaltyFeeIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SEZOwnerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSEZOwnerName(String value) {
        return new JAXBElement<String>(_SEZOwnerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SEZProjectName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSEZProjectName(String value) {
        return new JAXBElement<String>(_SEZProjectName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SEZStatusDeprivationDate")
    public JAXBElement<XMLGregorianCalendar> createSEZStatusDeprivationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SEZStatusDeprivationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SafePackageId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSafePackageId(String value) {
        return new JAXBElement<String>(_SafePackageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SamplesSelectionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSamplesSelectionCode(String value) {
        return new JAXBElement<String>(_SamplesSelectionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SanitaryControlFreeIndicator")
    public JAXBElement<Boolean> createSanitaryControlFreeIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_SanitaryControlFreeIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SanitaryMeasureCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSanitaryMeasureCode(String value) {
        return new JAXBElement<String>(_SanitaryMeasureCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SanitaryMeasureIndicator")
    public JAXBElement<Boolean> createSanitaryMeasureIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_SanitaryMeasureIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SanitaryRoadsteadIndicator")
    public JAXBElement<Boolean> createSanitaryRoadsteadIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_SanitaryRoadsteadIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SealDeviceId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSealDeviceId(String value) {
        return new JAXBElement<String>(_SealDeviceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SealIndicator")
    public JAXBElement<Boolean> createSealIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_SealIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SealKindCode")
    public JAXBElement<UnifiedCode20Type> createSealKindCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_SealKindCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SealQuantity")
    public JAXBElement<BigInteger> createSealQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_SealQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SealStateCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSealStateCode(String value) {
        return new JAXBElement<String>(_SealStateCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SeatQuantity")
    public JAXBElement<BigInteger> createSeatQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_SeatQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMeansRegIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransportMeansRegIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SecondTrailerRegId")
    public JAXBElement<TransportMeansRegIdType> createSecondTrailerRegId(TransportMeansRegIdType value) {
        return new JAXBElement<TransportMeansRegIdType>(_SecondTrailerRegId_QNAME, TransportMeansRegIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SecurityLabelId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSecurityLabelId(String value) {
        return new JAXBElement<String>(_SecurityLabelId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SeizureIndicator")
    public JAXBElement<Boolean> createSeizureIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_SeizureIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ServiceMarkText")
    public JAXBElement<String> createServiceMarkText(String value) {
        return new JAXBElement<String>(_ServiceMarkText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ShippingOrderId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createShippingOrderId(String value) {
        return new JAXBElement<String>(_ShippingOrderId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ShortCountryName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createShortCountryName(String value) {
        return new JAXBElement<String>(_ShortCountryName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SickAnimalIndicator")
    public JAXBElement<Boolean> createSickAnimalIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_SickAnimalIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SignIndicator")
    public JAXBElement<Boolean> createSignIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_SignIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Picture10MbType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Picture10MbType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SignatureImagePicture")
    public JAXBElement<Picture10MbType> createSignatureImagePicture(Picture10MbType value) {
        return new JAXBElement<Picture10MbType>(_SignatureImagePicture_QNAME, Picture10MbType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SigningDate")
    public JAXBElement<XMLGregorianCalendar> createSigningDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SigningDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SigningDateTime")
    public JAXBElement<XMLGregorianCalendar> createSigningDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SigningDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimplificationCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SimplificationCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SimplificationCode")
    public JAXBElement<SimplificationCodeType> createSimplificationCode(SimplificationCodeType value) {
        return new JAXBElement<SimplificationCodeType>(_SimplificationCode_QNAME, SimplificationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SparePartsIndicator")
    public JAXBElement<Boolean> createSparePartsIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_SparePartsIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SpecialEconomicZoneName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpecialEconomicZoneName(String value) {
        return new JAXBElement<String>(_SpecialEconomicZoneName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SpecialRoomQuantity")
    public JAXBElement<BigInteger> createSpecialRoomQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_SpecialRoomQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SpecialRoomTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpecialRoomTypeCode(String value) {
        return new JAXBElement<String>(_SpecialRoomTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SpecialRoomTypeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpecialRoomTypeName(String value) {
        return new JAXBElement<String>(_SpecialRoomTypeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SpecialStorageRequirementIndicator")
    public JAXBElement<Boolean> createSpecialStorageRequirementIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_SpecialStorageRequirementIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "StageChangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStageChangeCode(String value) {
        return new JAXBElement<String>(_StageChangeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "StageQuantity")
    public JAXBElement<BigInteger> createStageQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_StageQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Picture10MbType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Picture10MbType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "StampImagePicture")
    public JAXBElement<Picture10MbType> createStampImagePicture(Picture10MbType value) {
        return new JAXBElement<Picture10MbType>(_StampImagePicture_QNAME, Picture10MbType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "StandardName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStandardName(String value) {
        return new JAXBElement<String>(_StandardName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "StatementCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStatementCode(String value) {
        return new JAXBElement<String>(_StatementCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "StationaryIndicator")
    public JAXBElement<Boolean> createStationaryIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_StationaryIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "StatisticValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createStatisticValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_StatisticValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "StoreIndicator")
    public JAXBElement<Boolean> createStoreIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_StoreIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "StowawaysIndicator")
    public JAXBElement<Boolean> createStowawaysIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_StowawaysIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SubjectAdditionalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSubjectAdditionalCode(String value) {
        return new JAXBElement<String>(_SubjectAdditionalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SubjectTradeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSubjectTradeName(String value) {
        return new JAXBElement<String>(_SubjectTradeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SubsequentResaleAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createSubsequentResaleAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_SubsequentResaleAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SubsequentResaleDescriptionText")
    public JAXBElement<String> createSubsequentResaleDescriptionText(String value) {
        return new JAXBElement<String>(_SubsequentResaleDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SubsequentResaleIndicator")
    public JAXBElement<Boolean> createSubsequentResaleIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_SubsequentResaleIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SubsoilUserCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSubsoilUserCode(String value) {
        return new JAXBElement<String>(_SubsoilUserCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "SupplyStatusIndicator")
    public JAXBElement<Boolean> createSupplyStatusIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_SupplyStatusIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TDCancelKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTDCancelKindCode(String value) {
        return new JAXBElement<String>(_TDCancelKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TDDeclarationKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTDDeclarationKindCode(String value) {
        return new JAXBElement<String>(_TDDeclarationKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TDInformationKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTDInformationKindCode(String value) {
        return new JAXBElement<String>(_TDInformationKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TIEStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTIEStatusCode(String value) {
        return new JAXBElement<String>(_TIEStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TIRCarnetIndicator")
    public JAXBElement<Boolean> createTIRCarnetIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_TIRCarnetIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TIRHolderId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTIRHolderId(String value) {
        return new JAXBElement<String>(_TIRHolderId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TIRId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTIRId(String value) {
        return new JAXBElement<String>(_TIRId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TIRPageOrdinal")
    public JAXBElement<BigInteger> createTIRPageOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_TIRPageOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TIRSeriesId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTIRSeriesId(String value) {
        return new JAXBElement<String>(_TIRSeriesId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TNVDCISSubPositionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTNVDCISSubPositionCode(String value) {
        return new JAXBElement<String>(_TNVDCISSubPositionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TNVDEUSubPositionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTNVDEUSubPositionCode(String value) {
        return new JAXBElement<String>(_TNVDEUSubPositionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TNVDGSSubPositionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTNVDGSSubPositionCode(String value) {
        return new JAXBElement<String>(_TNVDGSSubPositionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TNVDGroupCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTNVDGroupCode(String value) {
        return new JAXBElement<String>(_TNVDGroupCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TNVDNationalSubPositionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTNVDNationalSubPositionCode(String value) {
        return new JAXBElement<String>(_TNVDNationalSubPositionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TNVDPositionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTNVDPositionCode(String value) {
        return new JAXBElement<String>(_TNVDPositionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TNVDSectionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTNVDSectionCode(String value) {
        return new JAXBElement<String>(_TNVDSectionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TNVEDChangeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTNVEDChangeCode(String value) {
        return new JAXBElement<String>(_TNVEDChangeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TNVEDNoteKindCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TNVEDNoteKindCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TNVEDExplanationKindCode")
    public JAXBElement<TNVEDNoteKindCodeType> createTNVEDExplanationKindCode(TNVEDNoteKindCodeType value) {
        return new JAXBElement<TNVEDNoteKindCodeType>(_TNVEDExplanationKindCode_QNAME, TNVEDNoteKindCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TNVEDExplanationText")
    public JAXBElement<String> createTNVEDExplanationText(String value) {
        return new JAXBElement<String>(_TNVEDExplanationText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TNVEDNoteId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTNVEDNoteId(String value) {
        return new JAXBElement<String>(_TNVEDNoteId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TaxBaseMeasure")
    public JAXBElement<BigDecimal> createTaxBaseMeasure(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TaxBaseMeasure_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TaxFreeIndicator")
    public JAXBElement<Boolean> createTaxFreeIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_TaxFreeIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TaxPaySignCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTaxPaySignCode(String value) {
        return new JAXBElement<String>(_TaxPaySignCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TempImportLimitDate")
    public JAXBElement<XMLGregorianCalendar> createTempImportLimitDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TempImportLimitDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TemperatureMeasure")
    public JAXBElement<BigDecimal> createTemperatureMeasure(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TemperatureMeasure_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TemporaryImportDate")
    public JAXBElement<XMLGregorianCalendar> createTemporaryImportDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TemporaryImportDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TemporaryImportKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTemporaryImportKindCode(String value) {
        return new JAXBElement<String>(_TemporaryImportKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ToolsValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createToolsValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_ToolsValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TotalAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createTotalAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_TotalAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FractionNumber102MeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FractionNumber102MeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TotalAreaMeasure")
    public JAXBElement<FractionNumber102MeasureType> createTotalAreaMeasure(FractionNumber102MeasureType value) {
        return new JAXBElement<FractionNumber102MeasureType>(_TotalAreaMeasure_QNAME, FractionNumber102MeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TotalCustomsValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createTotalCustomsValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_TotalCustomsValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TotalGrossMassMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createTotalGrossMassMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_TotalGrossMassMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TotalGuaranteeAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createTotalGuaranteeAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_TotalGuaranteeAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithNCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TotalGuaranteeNAmount")
    public JAXBElement<PaymentAmountWithNCurrencyType> createTotalGuaranteeNAmount(PaymentAmountWithNCurrencyType value) {
        return new JAXBElement<PaymentAmountWithNCurrencyType>(_TotalGuaranteeNAmount_QNAME, PaymentAmountWithNCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TotalMassMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createTotalMassMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_TotalMassMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TotalNetMassMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createTotalNetMassMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_TotalNetMassMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TotalPagesQuantity")
    public JAXBElement<BigInteger> createTotalPagesQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalPagesQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TotalStatisticValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createTotalStatisticValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_TotalStatisticValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TradeMarkName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTradeMarkName(String value) {
        return new JAXBElement<String>(_TradeMarkName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TrailerIndicator")
    public JAXBElement<Boolean> createTrailerIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_TrailerIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TrainingIndicator")
    public JAXBElement<Boolean> createTrainingIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_TrainingIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransactionFeatureCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransactionFeatureCode(String value) {
        return new JAXBElement<String>(_TransactionFeatureCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransactionNatureCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransactionNatureCode(String value) {
        return new JAXBElement<String>(_TransactionNatureCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransactionPassportId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransactionPassportId(String value) {
        return new JAXBElement<String>(_TransactionPassportId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TranshipmentCustomsOfficeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTranshipmentCustomsOfficeCode(String value) {
        return new JAXBElement<String>(_TranshipmentCustomsOfficeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransitFeatureCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransitFeatureCode(String value) {
        return new JAXBElement<String>(_TransitFeatureCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitGuaranteeMeasureCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransitGuaranteeMeasureCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransitGuaranteeMeasureCode")
    public JAXBElement<TransitGuaranteeMeasureCodeType> createTransitGuaranteeMeasureCode(TransitGuaranteeMeasureCodeType value) {
        return new JAXBElement<TransitGuaranteeMeasureCodeType>(_TransitGuaranteeMeasureCode_QNAME, TransitGuaranteeMeasureCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransitLimitDate")
    public JAXBElement<XMLGregorianCalendar> createTransitLimitDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransitLimitDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitProcedureCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransitProcedureCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransitProcedureCode")
    public JAXBElement<TransitProcedureCodeType> createTransitProcedureCode(TransitProcedureCodeType value) {
        return new JAXBElement<TransitProcedureCodeType>(_TransitProcedureCode_QNAME, TransitProcedureCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransitStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransitStatusCode(String value) {
        return new JAXBElement<String>(_TransitStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransitTerminationLimitDate")
    public JAXBElement<XMLGregorianCalendar> createTransitTerminationLimitDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransitTerminationLimitDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportAdjustmentAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createTransportAdjustmentAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_TransportAdjustmentAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportCarryingCapacityMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createTransportCarryingCapacityMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_TransportCarryingCapacityMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportCategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransportCategoryCode(String value) {
        return new JAXBElement<String>(_TransportCategoryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportColorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransportColorCode(String value) {
        return new JAXBElement<String>(_TransportColorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportMeansEntryPurposeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransportMeansEntryPurposeCode(String value) {
        return new JAXBElement<String>(_TransportMeansEntryPurposeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportMeansGrossMassMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createTransportMeansGrossMassMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_TransportMeansGrossMassMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportMeansIndicator")
    public JAXBElement<Boolean> createTransportMeansIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_TransportMeansIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportMeansQuantity")
    public JAXBElement<BigInteger> createTransportMeansQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransportMeansQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportModeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransportModeName(String value) {
        return new JAXBElement<String>(_TransportModeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportRestrictionText")
    public JAXBElement<String> createTransportRestrictionText(String value) {
        return new JAXBElement<String>(_TransportRestrictionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportTypeCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransportTypeCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportTypeCode")
    public JAXBElement<TransportTypeCodeType> createTransportTypeCode(TransportTypeCodeType value) {
        return new JAXBElement<TransportTypeCodeType>(_TransportTypeCode_QNAME, TransportTypeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportTypeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransportTypeName(String value) {
        return new JAXBElement<String>(_TransportTypeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TransportValueAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createTransportValueAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_TransportValueAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "TreatmentDescriptionText")
    public JAXBElement<String> createTreatmentDescriptionText(String value) {
        return new JAXBElement<String>(_TreatmentDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "UCRId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUCRId(String value) {
        return new JAXBElement<String>(_UCRId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "UNDGClassId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUNDGClassId(String value) {
        return new JAXBElement<String>(_UNDGClassId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "UNDGNumberId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUNDGNumberId(String value) {
        return new JAXBElement<String>(_UNDGNumberId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "UnionTaxPaymentAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createUnionTaxPaymentAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_UnionTaxPaymentAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAmountWithCurrencyType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "UnionTransportCostAmount")
    public JAXBElement<PaymentAmountWithCurrencyType> createUnionTransportCostAmount(PaymentAmountWithCurrencyType value) {
        return new JAXBElement<PaymentAmountWithCurrencyType>(_UnionTransportCostAmount_QNAME, PaymentAmountWithCurrencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "UnloadingIndicator")
    public JAXBElement<Boolean> createUnloadingIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_UnloadingIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsTaxPrefCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsTaxPrefCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VATPrefCode")
    public JAXBElement<CustomsTaxPrefCodeType> createVATPrefCode(CustomsTaxPrefCodeType value) {
        return new JAXBElement<CustomsTaxPrefCodeType>(_VATPrefCode_QNAME, CustomsTaxPrefCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValuationMethodCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValuationMethodCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ValuationMethodCode")
    public JAXBElement<ValuationMethodCodeType> createValuationMethodCode(ValuationMethodCodeType value) {
        return new JAXBElement<ValuationMethodCodeType>(_ValuationMethodCode_QNAME, ValuationMethodCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "ValueConditionIndicator")
    public JAXBElement<Boolean> createValueConditionIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_ValueConditionIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VehicleAxleQuantity")
    public JAXBElement<BigInteger> createVehicleAxleQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_VehicleAxleQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VehicleDescriptionText")
    public JAXBElement<String> createVehicleDescriptionText(String value) {
        return new JAXBElement<String>(_VehicleDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VehicleDocSeriesId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleDocSeriesId(String value) {
        return new JAXBElement<String>(_VehicleDocSeriesId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehcicleMakeCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehcicleMakeCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VehicleMakeCode")
    public JAXBElement<VehcicleMakeCodeType> createVehicleMakeCode(VehcicleMakeCodeType value) {
        return new JAXBElement<VehcicleMakeCodeType>(_VehicleMakeCode_QNAME, VehcicleMakeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VehicleMassKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleMassKindCode(String value) {
        return new JAXBElement<String>(_VehicleMassKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VehicleMileageMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createVehicleMileageMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_VehicleMileageMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VehicleModelName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleModelName(String value) {
        return new JAXBElement<String>(_VehicleModelName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VehicleRegistrationId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleRegistrationId(String value) {
        return new JAXBElement<String>(_VehicleRegistrationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VehicleWheelbaseMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createVehicleWheelbaseMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_VehicleWheelbaseMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VesselBodyId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVesselBodyId(String value) {
        return new JAXBElement<String>(_VesselBodyId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VesselIMOId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVesselIMOId(String value) {
        return new JAXBElement<String>(_VesselIMOId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VesselRegistryIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VesselRegistryIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VesselRegistryId")
    public JAXBElement<VesselRegistryIdType> createVesselRegistryId(VesselRegistryIdType value) {
        return new JAXBElement<VesselRegistryIdType>(_VesselRegistryId_QNAME, VesselRegistryIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VesselTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVesselTypeCode(String value) {
        return new JAXBElement<String>(_VesselTypeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VesselTypeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVesselTypeName(String value) {
        return new JAXBElement<String>(_VesselTypeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VeterinaryOrganizationId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVeterinaryOrganizationId(String value) {
        return new JAXBElement<String>(_VeterinaryOrganizationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VisualIdentifierCIMId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVisualIdentifierCIMId(String value) {
        return new JAXBElement<String>(_VisualIdentifierCIMId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VolumeMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createVolumeMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_VolumeMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "VoyageId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVoyageId(String value) {
        return new JAXBElement<String>(_VoyageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WarehouseActivityDescriptionText")
    public JAXBElement<String> createWarehouseActivityDescriptionText(String value) {
        return new JAXBElement<String>(_WarehouseActivityDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WarehouseDate")
    public JAXBElement<XMLGregorianCalendar> createWarehouseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_WarehouseDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WarehouseKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWarehouseKindCode(String value) {
        return new JAXBElement<String>(_WarehouseKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WarehouseTypeIndicator")
    public JAXBElement<Boolean> createWarehouseTypeIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_WarehouseTypeIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WeaponIndicator")
    public JAXBElement<Boolean> createWeaponIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_WeaponIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WeatherText")
    public JAXBElement<String> createWeatherText(String value) {
        return new JAXBElement<String>(_WeatherText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WeightCheckIndicator")
    public JAXBElement<Boolean> createWeightCheckIndicator(Boolean value) {
        return new JAXBElement<Boolean>(_WeightCheckIndicator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WeightMethodCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWeightMethodCode(String value) {
        return new JAXBElement<String>(_WeightMethodCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WeightRatioNumber")
    public JAXBElement<BigDecimal> createWeightRatioNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_WeightRatioNumber_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WoodKindName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWoodKindName(String value) {
        return new JAXBElement<String>(_WoodKindName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WoodSortimentName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWoodSortimentName(String value) {
        return new JAXBElement<String>(_WoodSortimentName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WorkSheduleDescriptionText")
    public JAXBElement<String> createWorkSheduleDescriptionText(String value) {
        return new JAXBElement<String>(_WorkSheduleDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WorkSheduleKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWorkSheduleKindCode(String value) {
        return new JAXBElement<String>(_WorkSheduleKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WorkTimeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWorkTimeCode(String value) {
        return new JAXBElement<String>(_WorkTimeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WorkTimeDescriptionText")
    public JAXBElement<String> createWorkTimeDescriptionText(String value) {
        return new JAXBElement<String>(_WorkTimeDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "WorkTimeHourDescriptionText")
    public JAXBElement<String> createWorkTimeHourDescriptionText(String value) {
        return new JAXBElement<String>(_WorkTimeHourDescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1", name = "YearMonth")
    public JAXBElement<XMLGregorianCalendar> createYearMonth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_YearMonth_QNAME, XMLGregorianCalendar.class, null, value);
    }

}
