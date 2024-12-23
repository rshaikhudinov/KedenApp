
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import javax.xml.namespace.QName;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.AddressDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.BusinessEntityDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.OfficerDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.OverallDimensionDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.PeriodDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.SubjectAddressDetailsType;
import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.UnifiedOverallDimensionDetailsType;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eec.m.ca.complexdataobjects.v1_8 package. 
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

    private final static QName _AEORegistryIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "AEORegistryIdDetails");
    private final static QName _AEOStorageFacilityDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "AEOStorageFacilityDetails");
    private final static QName _ATDAcceptCustomsPersonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDAcceptCustomsPersonDetails");
    private final static QName _ATDAcceptOfficerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDAcceptOfficerDetails");
    private final static QName _ATDArrivalTransportMeansDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDArrivalTransportMeansDetails");
    private final static QName _ATDAttachmentsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDAttachmentsDetails");
    private final static QName _ATDChangeSealDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDChangeSealDetails");
    private final static QName _ATDCustodianDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDCustodianDetails");
    private final static QName _ATDCustomsOfficeContactsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDCustomsOfficeContactsDetails");
    private final static QName _ATDCustomsPersonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDCustomsPersonDetails");
    private final static QName _ATDCustomsToolsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDCustomsToolsDetails");
    private final static QName _ATDDataReasonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDDataReasonDetails");
    private final static QName _ATDDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDDocDetails");
    private final static QName _ATDFactSealDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDFactSealDetails");
    private final static QName _ATDGoodsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDGoodsDetails");
    private final static QName _ATDGoodsDetentionReasonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDGoodsDetentionReasonDetails");
    private final static QName _ATDGoodsOwnerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDGoodsOwnerDetails");
    private final static QName _ATDGoodsReturnDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDGoodsReturnDetails");
    private final static QName _ATDInformationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDInformationDetails");
    private final static QName _ATDInformationSamplesSelectionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDInformationSamplesSelectionDetails");
    private final static QName _ATDInformationStorageDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDInformationStorageDetails");
    private final static QName _ATDInformationTransportMeansDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDInformationTransportMeansDetails");
    private final static QName _ATDLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDLocationDetails");
    private final static QName _ATDNewSealDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDNewSealDetails");
    private final static QName _ATDOfficerRecipientDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDOfficerRecipientDetails");
    private final static QName _ATDPackageSamplesDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDPackageSamplesDetails");
    private final static QName _ATDPersonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDPersonDetails");
    private final static QName _ATDRadiationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDRadiationDetails");
    private final static QName _ATDResultsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDResultsDetails");
    private final static QName _ATDReturnReasonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDReturnReasonDetails");
    private final static QName _ATDSamplesAddressDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDSamplesAddressDetails");
    private final static QName _ATDSamplesLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDSamplesLocationDetails");
    private final static QName _ATDSamplesSelectionDocIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDSamplesSelectionDocIdDetails");
    private final static QName _ATDSealDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDSealDetails");
    private final static QName _ATDSecondCopyDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDSecondCopyDetails");
    private final static QName _ATDSecondCopyRecipientDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDSecondCopyRecipientDetails");
    private final static QName _ATDSecondCopySenderDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDSecondCopySenderDetails");
    private final static QName _ATDServiceInfoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDServiceInfoDetails");
    private final static QName _ATDStatementDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDStatementDetails");
    private final static QName _ATDStorageDetentionsGoodsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDStorageDetentionsGoodsDetails");
    private final static QName _ATDStorageRequirementDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDStorageRequirementDetails");
    private final static QName _ATDTermsThievingSamplingDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDTermsThievingSamplingDetails");
    private final static QName _ATDWeightMethodDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDWeightMethodDetails");
    private final static QName _ATDestinationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ATDestinationDetails");
    private final static QName _ActInspectionDocIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ActInspectionDocIdDetails");
    private final static QName _AddGoodsMeasureDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "AddGoodsMeasureDetails");
    private final static QName _AddSuretyContractDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "AddSuretyContractDetails");
    private final static QName _AdditionsAdjustmentsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "AdditionsAdjustmentsDetails");
    private final static QName _AffectedPortDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "AffectedPortDetails");
    private final static QName _AgentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "AgentDetails");
    private final static QName _AgentRepresentativeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "AgentRepresentativeDetails");
    private final static QName _AllowanceDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "AllowanceDetails");
    private final static QName _AntiepidemicEquipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "AntiepidemicEquipmentDetails");
    private final static QName _AntiepidemicReadyDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "AntiepidemicReadyDetails");
    private final static QName _ApproximateValueDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ApproximateValueDetails");
    private final static QName _ArrivalDepartureAddressDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ArrivalDepartureAddressDetails");
    private final static QName _ArrivalDepartureTransportDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ArrivalDepartureTransportDetails");
    private final static QName _ArrivalDocumentIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ArrivalDocumentIdDetails");
    private final static QName _ArriveCustomsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ArriveCustomsDetails");
    private final static QName _ArrivePointDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ArrivePointDetails");
    private final static QName _ArrivePointLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ArrivePointLocationDetails");
    private final static QName _ArrivePointLocationWorkDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ArrivePointLocationWorkDetails");
    private final static QName _BinaryDataDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "BinaryDataDetails");
    private final static QName _BorderCustomsOfficeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "BorderCustomsOfficeDetails");
    private final static QName _BorderTransportDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "BorderTransportDetails");
    private final static QName _BorderTransportsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "BorderTransportsDetails");
    private final static QName _BranchDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "BranchDetails");
    private final static QName _BrokerBranchDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "BrokerBranchDetails");
    private final static QName _BrokerParentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "BrokerParentDetails");
    private final static QName _BrokerRegistryDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "BrokerRegistryDocDetails");
    private final static QName _BuyerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "BuyerDetails");
    private final static QName _BuyerSellerRelationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "BuyerSellerRelationDetails");
    private final static QName _BuyerSellerRoyaltyFeeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "BuyerSellerRoyaltyFeeDetails");
    private final static QName _CADocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CADocDetails");
    private final static QName _CALegalActDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CALegalActDetails");
    private final static QName _CAPresentedDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CAPresentedDocDetails");
    private final static QName _CASignatureDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CASignatureDetails");
    private final static QName _CAStampDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CAStampDetails");
    private final static QName _CASubjectBaseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CASubjectBaseDetails");
    private final static QName _CATNVEDNoteDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CATNVEDNoteDetails");
    private final static QName _CDEAUDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CDEAUDocDetails");
    private final static QName _CDEAUDocGoodsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CDEAUDocGoodsDetails");
    private final static QName _CDEAUJustificationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CDEAUJustificationDetails");
    private final static QName _CDEAUModifiedDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CDEAUModifiedDocDetails");
    private final static QName _CIMDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CIMDetails");
    private final static QName _CIMListDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CIMListDetails");
    private final static QName _CIMRangeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CIMRangeDetails");
    private final static QName _CPCFactPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CPCFactPaymentDetails");
    private final static QName _CPCGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CPCGoodsItemDetails");
    private final static QName _CPCGoodsItemPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CPCGoodsItemPaymentDetails");
    private final static QName _CPCGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CPCGoodsShipmentDetails");
    private final static QName _CPCIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CPCIdDetails");
    private final static QName _CPCPayerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CPCPayerDetails");
    private final static QName _CPCPaymentAmountDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CPCPaymentAmountDetails");
    private final static QName _CPCPresentedDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CPCPresentedDocDetails");
    private final static QName _CRAdditionalInformationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRAdditionalInformationDetails");
    private final static QName _CRAutomobileDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRAutomobileDetails");
    private final static QName _CRCommonGoodsInfoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRCommonGoodsInfoDetails");
    private final static QName _CRCommonPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRCommonPaymentDetails");
    private final static QName _CRCurrencyDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRCurrencyDetails");
    private final static QName _CRExchDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRExchDetails");
    private final static QName _CRExchGoodsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRExchGoodsDetails");
    private final static QName _CRExchGoodsPaymentsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRExchGoodsPaymentsDetails");
    private final static QName _CRExchListDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRExchListDetails");
    private final static QName _CRExchPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRExchPaymentDetails");
    private final static QName _CRFactPayerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRFactPayerDetails");
    private final static QName _CRGoodsInfoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRGoodsInfoDetails");
    private final static QName _CRGoodsItemPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRGoodsItemPaymentDetails");
    private final static QName _CRPayerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRPayerDetails");
    private final static QName _CRPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRPaymentDetails");
    private final static QName _CRPresentedDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRPresentedDocDetails");
    private final static QName _CRPreviosDocDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRPreviosDocDocDetails");
    private final static QName _CRSubjectAddressDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRSubjectAddressDetails");
    private final static QName _CRTypeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CRTypeDetails");
    private final static QName _CVDAdditionalInformationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CVDAdditionalInformationDetails");
    private final static QName _CVDCurrencyExchangeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CVDCurrencyExchangeDetails");
    private final static QName _CVDDecisionDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CVDDecisionDocDetails");
    private final static QName _CVDEvidenceDocumentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CVDEvidenceDocumentDetails");
    private final static QName _CVDGoodsDocumentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CVDGoodsDocumentDetails");
    private final static QName _CVDGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CVDGoodsItemDetails");
    private final static QName _CVDMethod1CalculationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CVDMethod1CalculationDetails");
    private final static QName _CVDMethod1Details_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CVDMethod1Details");
    private final static QName _CVDMethod236CalculationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CVDMethod236CalculationDetails");
    private final static QName _CVDMethod46CalculationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CVDMethod46CalculationDetails");
    private final static QName _CVDMethod56CalculationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CVDMethod56CalculationDetails");
    private final static QName _CVDOtherMethodDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CVDOtherMethodDetails");
    private final static QName _CargoPackagePalletDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CargoPackagePalletDetails");
    private final static QName _CarrierDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CarrierDetails");
    private final static QName _CarrierOrganizationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CarrierOrganizationDetails");
    private final static QName _CarrierRepresentativeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CarrierRepresentativeDetails");
    private final static QName _CashDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CashDetails");
    private final static QName _CertCADocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CertCADocDetails");
    private final static QName _CertificatePaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CertificatePaymentDetails");
    private final static QName _CheckPointCapacityDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointCapacityDetails");
    private final static QName _CheckPointDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointDetails");
    private final static QName _CheckPointEntryDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointEntryDetails");
    private final static QName _CheckPointInformationSystemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointInformationSystemDetails");
    private final static QName _CheckPointLinkDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointLinkDetails");
    private final static QName _CheckPointMaintenanceDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointMaintenanceDetails");
    private final static QName _CheckPointMaintenanceSystemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointMaintenanceSystemDetails");
    private final static QName _CheckPointOrganizationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointOrganizationDetails");
    private final static QName _CheckPointPassportDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointPassportDetails");
    private final static QName _CheckPointSpecialControlDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointSpecialControlDetails");
    private final static QName _CheckPointSystemControlDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointSystemControlDetails");
    private final static QName _CheckPointTVSystemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointTVSystemDetails");
    private final static QName _CheckPointWorkDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CheckPointWorkDetails");
    private final static QName _CloseOperationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CloseOperationDetails");
    private final static QName _ClosedReasonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ClosedReasonDetails");
    private final static QName _CommodityDescriptionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CommodityDescriptionDetails");
    private final static QName _CommodityGroupItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CommodityGroupItemDetails");
    private final static QName _CompetentOrganizationCertificateDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CompetentOrganizationCertificateDetails");
    private final static QName _ConsigneeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ConsigneeDetails");
    private final static QName _ConsigneeOrganizationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ConsigneeOrganizationDetails");
    private final static QName _ConsigneeV2Details_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ConsigneeV2Details");
    private final static QName _ConsignmentCancelDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ConsignmentCancelDetails");
    private final static QName _ConsignorDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ConsignorDetails");
    private final static QName _ConsignorOrganizationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ConsignorOrganizationDetails");
    private final static QName _ConsignorV2Details_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ConsignorV2Details");
    private final static QName _ContainerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ContainerDetails");
    private final static QName _ContainerInformationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ContainerInformationDetails");
    private final static QName _ContainerListDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ContainerListDetails");
    private final static QName _ContractDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ContractDetails");
    private final static QName _ControlAgencyInformationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ControlAgencyInformationDetails");
    private final static QName _ControlledItemsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ControlledItemsDetails");
    private final static QName _CrewTrainingDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CrewTrainingDetails");
    private final static QName _CustomsBrokerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsBrokerDetails");
    private final static QName _CustomsCheckCodeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsCheckCodeDetails");
    private final static QName _CustomsControlZoneDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsControlZoneDetails");
    private final static QName _CustomsControlZoneIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsControlZoneIdDetails");
    private final static QName _CustomsDecisionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsDecisionDetails");
    private final static QName _CustomsDeclarationIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsDeclarationIdDetails");
    private final static QName _CustomsDocIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsDocIdDetails");
    private final static QName _CustomsIdentificationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsIdentificationDetails");
    private final static QName _CustomsIdentificationMeansIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsIdentificationMeansIdDetails");
    private final static QName _CustomsMarkDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsMarkDetails");
    private final static QName _CustomsOfficeClassifierDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsOfficeClassifierDetails");
    private final static QName _CustomsOfficeFunctionalDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsOfficeFunctionalDetails");
    private final static QName _CustomsOfficeIndicatorDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsOfficeIndicatorDetails");
    private final static QName _CustomsPaymentBaseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsPaymentBaseDetails");
    private final static QName _CustomsPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsPaymentDetails");
    private final static QName _CustomsPersonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsPersonDetails");
    private final static QName _CustomsPersonSignDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsPersonSignDetails");
    private final static QName _CustomsProcedureDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsProcedureDetails");
    private final static QName _CustomsReceiptIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsReceiptIdDetails");
    private final static QName _CustomsRepresentativeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsRepresentativeDetails");
    private final static QName _CustomsTaxModeCodeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsTaxModeCodeDetails");
    private final static QName _CustomsToolDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsToolDetails");
    private final static QName _CustomsValueDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsValueDetails");
    private final static QName _CustomsWarehouseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "CustomsWarehouseDetails");
    private final static QName _DTAutomobileDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTAutomobileDetails");
    private final static QName _DTExchAutoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTExchAutoDetails");
    private final static QName _DTExchAutomobileDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTExchAutomobileDetails");
    private final static QName _DTExchCustomsPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTExchCustomsPaymentDetails");
    private final static QName _DTExchDeclarationIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTExchDeclarationIdDetails");
    private final static QName _DTExchFactPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTExchFactPaymentDetails");
    private final static QName _DTExchGoodsPaymentsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTExchGoodsPaymentsDetails");
    private final static QName _DTExchListDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTExchListDetails");
    private final static QName _DTExchPrecedingDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTExchPrecedingDocDetails");
    private final static QName _DTExchPresentedDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTExchPresentedDocDetails");
    private final static QName _DTExhcGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTExhcGoodsItemDetails");
    private final static QName _DTExhcGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTExhcGoodsShipmentDetails");
    private final static QName _DTIdentificationMeansDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTIdentificationMeansDetails");
    private final static QName _DTMDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTMDocDetails");
    private final static QName _DTPaymentDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTPaymentDocDetails");
    private final static QName _DTSExchGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTSExchGoodsItemDetails");
    private final static QName _DTSExchItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTSExchItemDetails");
    private final static QName _DTStatDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTStatDetails");
    private final static QName _DTStatGoodsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DTStatGoodsDetails");
    private final static QName _DamagedIndicatorDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DamagedIndicatorDetails");
    private final static QName _DecisionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DecisionDetails");
    private final static QName _DeclarantDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DeclarantDetails");
    private final static QName _DeclarantGoodsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DeclarantGoodsDetails");
    private final static QName _DeclarationConsignmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DeclarationConsignmentDetails");
    private final static QName _DeclarationGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DeclarationGoodsItemDetails");
    private final static QName _DeclarationGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DeclarationGoodsShipmentDetails");
    private final static QName _DeductionAdjustmentsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DeductionAdjustmentsDetails");
    private final static QName _DefferedPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DefferedPaymentDetails");
    private final static QName _DefferedPaymentDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DefferedPaymentDocDetails");
    private final static QName _DelayPaymentsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DelayPaymentsDetails");
    private final static QName _DeliveryTermsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DeliveryTermsDetails");
    private final static QName _DepartureCountryDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DepartureCountryDetails");
    private final static QName _DepartureCustomsOfficeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DepartureCustomsOfficeDetails");
    private final static QName _DepartureTransportDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DepartureTransportDetails");
    private final static QName _DependTransportMeansIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DependTransportMeansIdDetails");
    private final static QName _DestinationCountryDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DestinationCountryDetails");
    private final static QName _DestinationCustomsOfficeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DestinationCustomsOfficeDetails");
    private final static QName _DeviationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DeviationDetails");
    private final static QName _DiameterRangeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DiameterRangeDetails");
    private final static QName _DimensionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DimensionDetails");
    private final static QName _DisembarkationPlaceDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DisembarkationPlaceDetails");
    private final static QName _DisinfectionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DisinfectionDetails");
    private final static QName _DisinfestationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DisinfestationDetails");
    private final static QName _DocArchIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DocArchIdDetails");
    private final static QName _DocumentPresentingDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DocumentPresentingDetails");
    private final static QName _DoubleCorridorDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DoubleCorridorDetails");
    private final static QName _DriverBaseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DriverBaseDetails");
    private final static QName _DriverDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "DriverDetails");
    private final static QName _ECChangeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ECChangeDetails");
    private final static QName _ECGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ECGoodsItemDetails");
    private final static QName _ECGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ECGoodsShipmentDetails");
    private final static QName _ECHouseShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ECHouseShipmentDetails");
    private final static QName _ECPaymentAmountDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ECPaymentAmountDetails");
    private final static QName _ECPrecedingDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ECPrecedingDocDetails");
    private final static QName _ECPresentedDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ECPresentedDocDetails");
    private final static QName _EDocCorrectionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "EDocCorrectionDetails");
    private final static QName _EffectiveCustomsRateDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "EffectiveCustomsRateDetails");
    private final static QName _ElectricPowerTransferDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ElectricPowerTransferDetails");
    private final static QName _EmbarkationPlaceDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "EmbarkationPlaceDetails");
    private final static QName _EnsureDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "EnsureDocDetails");
    private final static QName _EquipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "EquipmentDetails");
    private final static QName _ExciseStampDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ExciseStampDetails");
    private final static QName _ExciseStampIdListDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ExciseStampIdListDetails");
    private final static QName _ExciseStampRangeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ExciseStampRangeDetails");
    private final static QName _ExportCancellationReasonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ExportCancellationReasonDetails");
    private final static QName _ExpressCargoDeclarationIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ExpressCargoDeclarationIdDetails");
    private final static QName _ExtensionOperationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ExtensionOperationDetails");
    private final static QName _FEConsignmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FEConsignmentDetails");
    private final static QName _FEFactDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FEFactDetails");
    private final static QName _FEGoodsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FEGoodsDetails");
    private final static QName _FEGoodsInfoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FEGoodsInfoDetails");
    private final static QName _FERegistrationIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FERegistrationIdDetails");
    private final static QName _FLAvtoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FLAvtoDetails");
    private final static QName _FLAvtoPaymentRateDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FLAvtoPaymentRateDetails");
    private final static QName _FactDepartureLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FactDepartureLocationDetails");
    private final static QName _FactPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FactPaymentDetails");
    private final static QName _FactPaymentOldDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FactPaymentOldDetails");
    private final static QName _FinancialSettlementSubjectDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FinancialSettlementSubjectDetails");
    private final static QName _FirstIdentificationMeansItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FirstIdentificationMeansItemDetails");
    private final static QName _FlightDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FlightDetails");
    private final static QName _ForeignAddContractDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ForeignAddContractDetails");
    private final static QName _ForeignMainContractDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ForeignMainContractDetails");
    private final static QName _ForeignTradeConsigneeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ForeignTradeConsigneeDetails");
    private final static QName _ForeignTradeConsignorDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ForeignTradeConsignorDetails");
    private final static QName _ForeignTradeContractDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ForeignTradeContractDetails");
    private final static QName _ForwarderDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ForwarderDetails");
    private final static QName _FreePracticeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FreePracticeDetails");
    private final static QName _FreeWarehouseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "FreeWarehouseDetails");
    private final static QName _GCGuaranteeConfirmDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GCGuaranteeConfirmDocDetails");
    private final static QName _GDCChangeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDCChangeDetails");
    private final static QName _GDCExchFactPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDCExchFactPaymentDetails");
    private final static QName _GDCExchGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDCExchGoodsItemDetails");
    private final static QName _GDCExchGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDCExchGoodsShipmentDetails");
    private final static QName _GDCExchPaymentDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDCExchPaymentDocDetails");
    private final static QName _GDCItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDCItemDetails");
    private final static QName _GDCSignatoryPersonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDCSignatoryPersonDetails");
    private final static QName _GDCSignatoryRepresentativeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDCSignatoryRepresentativeDetails");
    private final static QName _GDConsignmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDConsignmentDetails");
    private final static QName _GDFactPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDFactPaymentDetails");
    private final static QName _GDGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDGoodsItemDetails");
    private final static QName _GDGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDGoodsShipmentDetails");
    private final static QName _GDPaymentDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GDPaymentDocDetails");
    private final static QName _GRAConsigneeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GRAConsigneeDetails");
    private final static QName _GRAGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GRAGoodsItemDetails");
    private final static QName _GRAGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GRAGoodsShipmentDetails");
    private final static QName _GRAGuaranteeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GRAGuaranteeDetails");
    private final static QName _GRAPresentedDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GRAPresentedDocDetails");
    private final static QName _GeneralContractDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GeneralContractDetails");
    private final static QName _GoodLocationTransportMeansDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodLocationTransportMeansDetails");
    private final static QName _GoodsControlMeasureDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsControlMeasureDetails");
    private final static QName _GoodsDecisionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsDecisionDetails");
    private final static QName _GoodsDeclarationChangeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsDeclarationChangeDetails");
    private final static QName _GoodsDisinfectionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsDisinfectionDetails");
    private final static QName _GoodsItemGroupDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsItemGroupDetails");
    private final static QName _GoodsItemProcessingDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsItemProcessingDetails");
    private final static QName _GoodsLocationAddressDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsLocationAddressDetails");
    private final static QName _GoodsLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsLocationDetails");
    private final static QName _GoodsLocationDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsLocationDocDetails");
    private final static QName _GoodsManufacturerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsManufacturerDetails");
    private final static QName _GoodsMarkDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsMarkDetails");
    private final static QName _GoodsMeasureDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsMeasureDetails");
    private final static QName _GoodsPartViewDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsPartViewDetails");
    private final static QName _GoodsReleaseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsReleaseDetails");
    private final static QName _GoodsReleaseIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsReleaseIdDetails");
    private final static QName _GoodsTraceabilityMeasureDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsTraceabilityMeasureDetails");
    private final static QName _GoodsUseRestrictionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GoodsUseRestrictionDetails");
    private final static QName _GuaranteeCertificateAgentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GuaranteeCertificateAgentDetails");
    private final static QName _GuaranteeCertificateDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GuaranteeCertificateDetails");
    private final static QName _GuaranteeCertificateIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GuaranteeCertificateIdDetails");
    private final static QName _GuaranteeCertificateInformationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GuaranteeCertificateInformationDetails");
    private final static QName _GuaranteeCertificateMarkDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GuaranteeCertificateMarkDetails");
    private final static QName _GuaranteeCustomsDocIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GuaranteeCustomsDocIdDetails");
    private final static QName _GuaranteeDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GuaranteeDocDetails");
    private final static QName _GuarantorDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "GuarantorDetails");
    private final static QName _HouseWaybillDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "HouseWaybillDetails");
    private final static QName _IPObjectRegistryIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "IPObjectRegistryIdDetails");
    private final static QName _IdenticalGoodsMeasureDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "IdenticalGoodsMeasureDetails");
    private final static QName _IdentificationMeansDataUnitDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "IdentificationMeansDataUnitDetails");
    private final static QName _IdentificationMeansDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "IdentificationMeansDetails");
    private final static QName _IdentificationMeansItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "IdentificationMeansItemDetails");
    private final static QName _IdentificationMeansListDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "IdentificationMeansListDetails");
    private final static QName _IdentificationMeansRangeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "IdentificationMeansRangeDetails");
    private final static QName _ImportCarInfoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ImportCarInfoDetails");
    private final static QName _ImportCarProcessingResultInfoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ImportCarProcessingResultInfoDetails");
    private final static QName _IncidentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "IncidentDetails");
    private final static QName _IneffectiveTaxRateDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "IneffectiveTaxRateDetails");
    private final static QName _InformationSourceDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "InformationSourceDetails");
    private final static QName _InspectionDocIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "InspectionDocIdDetails");
    private final static QName _InvestmentGoodsIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "InvestmentGoodsIdDetails");
    private final static QName _InvoiceValueDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "InvoiceValueDetails");
    private final static QName _ItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ItemDetails");
    private final static QName _ItineraryPointDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ItineraryPointDetails");
    private final static QName _JointlyLiablePersonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "JointlyLiablePersonDetails");
    private final static QName _KDTSignatoryDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "KDTSignatoryDetails");
    private final static QName _LabelRangeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "LabelRangeDetails");
    private final static QName _LastIdentificationMeansItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "LastIdentificationMeansItemDetails");
    private final static QName _LicensedGoodsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "LicensedGoodsDetails");
    private final static QName _LostGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "LostGoodsItemDetails");
    private final static QName _MainteanceEquipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "MainteanceEquipmentDetails");
    private final static QName _ManufacturerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ManufacturerDetails");
    private final static QName _MaritimeHealthDeclarationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "MaritimeHealthDeclarationDetails");
    private final static QName _MedicineDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "MedicineDetails");
    private final static QName _Method1AddCostsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "Method1AddCostsDetails");
    private final static QName _Method1BasisCalculationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "Method1BasisCalculationDetails");
    private final static QName _Method1DeductionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "Method1DeductionDetails");
    private final static QName _NSDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "NSDetails");
    private final static QName _NSDocumentsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "NSDocumentsDetails");
    private final static QName _NSTransportMeansDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "NSTransportMeansDetails");
    private final static QName _NegotiableInstrumentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "NegotiableInstrumentDetails");
    private final static QName _NeighboringCheckPointDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "NeighboringCheckPointDetails");
    private final static QName _OfficerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "OfficerDetails");
    private final static QName _OpeningReasonDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "OpeningReasonDocDetails");
    private final static QName _OperatorDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "OperatorDetails");
    private final static QName _OriginCountryDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "OriginCountryDetails");
    private final static QName _PDCorrectionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDCorrectionDetails");
    private final static QName _PDCustomsDecisionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDCustomsDecisionDetails");
    private final static QName _PDDecisionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDDecisionDetails");
    private final static QName _PDDeclarantDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDDeclarantDetails");
    private final static QName _PDDeclaredGoodsInfoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDDeclaredGoodsInfoDetails");
    private final static QName _PDExchGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDExchGoodsShipmentDetails");
    private final static QName _PDGoodsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDGoodsDetails");
    private final static QName _PDGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDGoodsItemDetails");
    private final static QName _PDGoodsListDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDGoodsListDetails");
    private final static QName _PDGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDGoodsShipmentDetails");
    private final static QName _PDMarkDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDMarkDetails");
    private final static QName _PDMoneyDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDMoneyDetails");
    private final static QName _PDMoneyOwnerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDMoneyOwnerDetails");
    private final static QName _PDMoneySourceDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDMoneySourceDetails");
    private final static QName _PDMoneyTransportationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDMoneyTransportationDetails");
    private final static QName _PDMoneyUsageDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDMoneyUsageDetails");
    private final static QName _PDSharePartItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDSharePartItemDetails");
    private final static QName _PDTransitMarkDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDTransitMarkDetails");
    private final static QName _PDTransportMeansDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDTransportMeansDetails");
    private final static QName _PDTransportMeansIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDTransportMeansIdDetails");
    private final static QName _PDTransportMeansItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PDTransportMeansItemDetails");
    private final static QName _PGCGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PGCGoodsItemDetails");
    private final static QName _PGCGoodsItemGuaranteeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PGCGoodsItemGuaranteeDetails");
    private final static QName _PGCGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PGCGoodsShipmentDetails");
    private final static QName _PGCGuaranteeAmountDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PGCGuaranteeAmountDetails");
    private final static QName _PGCGuaranteeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PGCGuaranteeDetails");
    private final static QName _PGCPresentedDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PGCPresentedDocDetails");
    private final static QName _PIARBorderTransportDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIARBorderTransportDetails");
    private final static QName _PIARConsignmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIARConsignmentDetails");
    private final static QName _PIARConsignmentItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIARConsignmentItemDetails");
    private final static QName _PIARCrewMemberDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIARCrewMemberDetails");
    private final static QName _PIARDiseasedPersonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIARDiseasedPersonDetails");
    private final static QName _PIARDisinfestationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIARDisinfestationDetails");
    private final static QName _PIAREntryCheckPointDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIAREntryCheckPointDetails");
    private final static QName _PIAREpidemicControlDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIAREpidemicControlDetails");
    private final static QName _PIARLoadingLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIARLoadingLocationDetails");
    private final static QName _PIARMasterDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIARMasterDetails");
    private final static QName _PIARPassengerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIARPassengerDetails");
    private final static QName _PIARPestControlDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIARPestControlDetails");
    private final static QName _PIARUnloadingLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIARUnloadingLocationDetails");
    private final static QName _PIATBorderTransportDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATBorderTransportDetails");
    private final static QName _PIATCarrierDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATCarrierDetails");
    private final static QName _PIATConsigneeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATConsigneeDetails");
    private final static QName _PIATConsignmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATConsignmentDetails");
    private final static QName _PIATConsignmentItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATConsignmentItemDetails");
    private final static QName _PIATConsignorDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATConsignorDetails");
    private final static QName _PIATEntryCheckPointDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATEntryCheckPointDetails");
    private final static QName _PIATItineraryPointDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATItineraryPointDetails");
    private final static QName _PIATLoadingLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATLoadingLocationDetails");
    private final static QName _PIATMainConsignmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATMainConsignmentDetails");
    private final static QName _PIATTransportDocumentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATTransportDocumentDetails");
    private final static QName _PIATTransportMeansItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATTransportMeansItemDetails");
    private final static QName _PIATUnloadingLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIATUnloadingLocationDetails");
    private final static QName _PIBuyerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIBuyerDetails");
    private final static QName _PICarrierDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PICarrierDetails");
    private final static QName _PIConsigneeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIConsigneeDetails");
    private final static QName _PIConsignorDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIConsignorDetails");
    private final static QName _PIContainerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIContainerDetails");
    private final static QName _PIDeclarantDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIDeclarantDetails");
    private final static QName _PIGoodsDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIGoodsDocDetails");
    private final static QName _PIItineraryPointDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIItineraryPointDetails");
    private final static QName _PIPrecedingDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIPrecedingDocDetails");
    private final static QName _PISellerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PISellerDetails");
    private final static QName _PIShipmentLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIShipmentLocationDetails");
    private final static QName _PITranshipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PITranshipmentDetails");
    private final static QName _PITransitDeclarantDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PITransitDeclarantDetails");
    private final static QName _PITransitTransportMeansDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PITransitTransportMeansDetails");
    private final static QName _PIUnionCarrierDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIUnionCarrierDetails");
    private final static QName _PIVBorderTransportDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVBorderTransportDetails");
    private final static QName _PIVCargoPackagePalletDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVCargoPackagePalletDetails");
    private final static QName _PIVConsignmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVConsignmentDetails");
    private final static QName _PIVConsignmentItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVConsignmentItemDetails");
    private final static QName _PIVCrewMemberDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVCrewMemberDetails");
    private final static QName _PIVDiseasedPersonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVDiseasedPersonDetails");
    private final static QName _PIVEntryCheckPointDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVEntryCheckPointDetails");
    private final static QName _PIVEpidemicControlDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVEpidemicControlDetails");
    private final static QName _PIVItineraryPointDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVItineraryPointDetails");
    private final static QName _PIVLoadingLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVLoadingLocationDetails");
    private final static QName _PIVMasterDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVMasterDetails");
    private final static QName _PIVPassengerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVPassengerDetails");
    private final static QName _PIVUnloadingLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIVUnloadingLocationDetails");
    private final static QName _PIWBorderTransportDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIWBorderTransportDetails");
    private final static QName _PIWConsignmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIWConsignmentDetails");
    private final static QName _PIWConsignmentItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIWConsignmentItemDetails");
    private final static QName _PIWEntryCheckPointDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIWEntryCheckPointDetails");
    private final static QName _PIWLoadingLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIWLoadingLocationDetails");
    private final static QName _PIWStoreDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIWStoreDetails");
    private final static QName _PIWTransportMeansDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIWTransportMeansDetails");
    private final static QName _PIWUnloadingLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PIWUnloadingLocationDetails");
    private final static QName _PackagePalletDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PackagePalletDetails");
    private final static QName _PassengerDeclarationIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PassengerDeclarationIdDetails");
    private final static QName _PaymentCalculationEventDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PaymentCalculationEventDetails");
    private final static QName _PaymentDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PaymentDocDetails");
    private final static QName _PaymentDutyTerminationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PaymentDutyTerminationDetails");
    private final static QName _PaymentGuaranteeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PaymentGuaranteeDetails");
    private final static QName _PaymentInvoiceDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PaymentInvoiceDetails");
    private final static QName _PaymentSheduleDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PaymentSheduleDetails");
    private final static QName _PeriodDateDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PeriodDateDetails");
    private final static QName _PeriodDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PeriodDetails");
    private final static QName _PeriodicPaymentsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PeriodicPaymentsDetails");
    private final static QName _PermitGuaranteeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PermitGuaranteeDetails");
    private final static QName _PermitTranspornationDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PermitTranspornationDocDetails");
    private final static QName _PersonalGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PersonalGoodsItemDetails");
    private final static QName _PestControlDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PestControlDetails");
    private final static QName _PipelineGoodsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PipelineGoodsDetails");
    private final static QName _PointLocationAddressDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PointLocationAddressDetails");
    private final static QName _PostalAddressDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PostalAddressDetails");
    private final static QName _PowerOfAttorneyDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PowerOfAttorneyDetails");
    private final static QName _PowerOfAttorneyV2Details_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PowerOfAttorneyV2Details");
    private final static QName _PreDecisionBaseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PreDecisionBaseDetails");
    private final static QName _PreDecisionCancelDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PreDecisionCancelDocDetails");
    private final static QName _PreDecisionGoodsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PreDecisionGoodsDetails");
    private final static QName _PreDecisionIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PreDecisionIdDetails");
    private final static QName _PreDecisionJustificationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PreDecisionJustificationDetails");
    private final static QName _PrecedingDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PrecedingDocDetails");
    private final static QName _PrecedingDocIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PrecedingDocIdDetails");
    private final static QName _PrecedingGoodsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PrecedingGoodsDetails");
    private final static QName _PrefOriginCountryDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PrefOriginCountryDetails");
    private final static QName _PreferenceDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PreferenceDetails");
    private final static QName _PreliminaryInformationIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PreliminaryInformationIdDetails");
    private final static QName _PresentedDocBaseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PresentedDocBaseDetails");
    private final static QName _PresentedDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "PresentedDocDetails");
    private final static QName _ProcedssingReminderDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ProcedssingReminderDetails");
    private final static QName _ProcessingDescriptionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ProcessingDescriptionDetails");
    private final static QName _ProcessingDocumentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ProcessingDocumentDetails");
    private final static QName _ProcessingOperationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ProcessingOperationDetails");
    private final static QName _ProcessingPlaceDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ProcessingPlaceDetails");
    private final static QName _ProcessingProductDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ProcessingProductDetails");
    private final static QName _ProcessingSubjectDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ProcessingSubjectDetails");
    private final static QName _QuotaAmountReminderDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "QuotaAmountReminderDetails");
    private final static QName _QuotaDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "QuotaDetails");
    private final static QName _QuotaMeasureReminderDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "QuotaMeasureReminderDetails");
    private final static QName _QuotaWriteOffMeasureDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "QuotaWriteOffMeasureDetails");
    private final static QName _RailwayStampDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RailwayStampDetails");
    private final static QName _ReasonDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ReasonDocDetails");
    private final static QName _RecoveredDutyDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RecoveredDutyDetails");
    private final static QName _RefGuaranteeCertificateIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RefGuaranteeCertificateIdDetails");
    private final static QName _RefLicenseIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RefLicenseIdDetails");
    private final static QName _RefPassengerDeclarationIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RefPassengerDeclarationIdDetails");
    private final static QName _RefPreliminaryInformationIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RefPreliminaryInformationIdDetails");
    private final static QName _ReferenceConsignmentItemRangeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ReferenceConsignmentItemRangeDetails");
    private final static QName _ReferenceTDConsignmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ReferenceTDConsignmentDetails");
    private final static QName _RegisterAEODetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegisterAEODetails");
    private final static QName _RegisterCustomsBrokerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegisterCustomsBrokerDetails");
    private final static QName _RegisterCustomsCarrierDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegisterCustomsCarrierDetails");
    private final static QName _RegisterCustomsWarehouseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegisterCustomsWarehouseDetails");
    private final static QName _RegisterDocumentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegisterDocumentDetails");
    private final static QName _RegisterDocumentIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegisterDocumentIdDetails");
    private final static QName _RegisterFreeWarehouseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegisterFreeWarehouseDetails");
    private final static QName _RegisterOrganizationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegisterOrganizationDetails");
    private final static QName _RegisterPreDecisionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegisterPreDecisionDetails");
    private final static QName _RegisterStampDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegisterStampDetails");
    private final static QName _RegisterTSWDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegisterTSWDetails");
    private final static QName _RegistrationOperationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegistrationOperationDetails");
    private final static QName _RegistryClassificationDecisionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RegistryClassificationDecisionDetails");
    private final static QName _ReleaseDecisionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ReleaseDecisionDetails");
    private final static QName _ReleaseIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ReleaseIdDetails");
    private final static QName _ReloadPlaceDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "ReloadPlaceDetails");
    private final static QName _RemainGoodsMeasureDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RemainGoodsMeasureDetails");
    private final static QName _RepresentativeContractDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RepresentativeContractDetails");
    private final static QName _RouteCustomsOfficeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RouteCustomsOfficeDetails");
    private final static QName _RouteTransportDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "RouteTransportDetails");
    private final static QName _SEZOrganizationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SEZOrganizationDetails");
    private final static QName _SanitaryControlDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SanitaryControlDocDetails");
    private final static QName _SanitaryMeasureDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SanitaryMeasureDetails");
    private final static QName _SanitaryMeasureLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SanitaryMeasureLocationDetails");
    private final static QName _SealDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SealDetails");
    private final static QName _SellerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SellerDetails");
    private final static QName _SettingReasonDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SettingReasonDocDetails");
    private final static QName _SignatoryPersonDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SignatoryPersonDetails");
    private final static QName _SignatoryPersonIdentityDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SignatoryPersonIdentityDetails");
    private final static QName _SignatoryPersonV2Details_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SignatoryPersonV2Details");
    private final static QName _SignatoryRepresentativeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SignatoryRepresentativeDetails");
    private final static QName _SigningDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SigningDetails");
    private final static QName _SparePartsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SparePartsDetails");
    private final static QName _SparePartsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SparePartsItemDetails");
    private final static QName _SpecialRoomDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SpecialRoomDetails");
    private final static QName _SpecificationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SpecificationDetails");
    private final static QName _StampInfoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "StampInfoDetails");
    private final static QName _StorageRequirementDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "StorageRequirementDetails");
    private final static QName _StoreDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "StoreDetails");
    private final static QName _StoreItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "StoreItemDetails");
    private final static QName _SubjectBranchDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SubjectBranchDetails");
    private final static QName _SuretyContractDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SuretyContractDetails");
    private final static QName _SuretyDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SuretyDetails");
    private final static QName _SuretyMainContractDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SuretyMainContractDetails");
    private final static QName _SuretySubjectDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "SuretySubjectDetails");
    private final static QName _TDCADocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDCADocDetails");
    private final static QName _TDCloseCargoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDCloseCargoDetails");
    private final static QName _TDCloseHeaderDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDCloseHeaderDetails");
    private final static QName _TDCloseOperationCustomsMarkDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDCloseOperationCustomsMarkDetails");
    private final static QName _TDCloseOperationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDCloseOperationDetails");
    private final static QName _TDConsignmentCloseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDConsignmentCloseDetails");
    private final static QName _TDConsignmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDConsignmentDetails");
    private final static QName _TDConsignmentDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDConsignmentDocDetails");
    private final static QName _TDDeliveryGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDDeliveryGoodsItemDetails");
    private final static QName _TDDestinationPlaceDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDDestinationPlaceDetails");
    private final static QName _TDEmergencyCargoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDEmergencyCargoDetails");
    private final static QName _TDEmergencyOperationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDEmergencyOperationDetails");
    private final static QName _TDExchGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDExchGoodsItemDetails");
    private final static QName _TDExchGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDExchGoodsShipmentDetails");
    private final static QName _TDGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDGoodsItemDetails");
    private final static QName _TDGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDGoodsShipmentDetails");
    private final static QName _TDGuaranteeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDGuaranteeDetails");
    private final static QName _TDHeaderDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDHeaderDetails");
    private final static QName _TDInspectionDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDInspectionDocDetails");
    private final static QName _TDInternationalMailDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDInternationalMailDetails");
    private final static QName _TDLostGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDLostGoodsItemDetails");
    private final static QName _TDMovementOperationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDMovementOperationDetails");
    private final static QName _TDOperationInfoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDOperationInfoDetails");
    private final static QName _TDPackageDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDPackageDetails");
    private final static QName _TDPrecedingDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDPrecedingDocDetails");
    private final static QName _TDPresentedDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDPresentedDocDetails");
    private final static QName _TDPreviousDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDPreviousDocDetails");
    private final static QName _TDReleaseCustomsMarkDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDReleaseCustomsMarkDetails");
    private final static QName _TDReleaseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDReleaseDetails");
    private final static QName _TDRouteDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDRouteDetails");
    private final static QName _TDRouteHeaderDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDRouteHeaderDetails");
    private final static QName _TDSealDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDSealDetails");
    private final static QName _TDTIRCarnetIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDTIRCarnetIdDetails");
    private final static QName _TDTerminationCargoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDTerminationCargoDetails");
    private final static QName _TDTerminationGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDTerminationGoodsItemDetails");
    private final static QName _TDTerminationOperationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDTerminationOperationDetails");
    private final static QName _TDTranshipmentOperationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TDTranshipmentOperationDetails");
    private final static QName _TIECarrierDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIECarrierDetails");
    private final static QName _TIECloseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIECloseDetails");
    private final static QName _TIEDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIEDetails");
    private final static QName _TIEExtensionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIEExtensionDetails");
    private final static QName _TIEOperationsDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIEOperationsDetails");
    private final static QName _TIEProcedureDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIEProcedureDetails");
    private final static QName _TIERegistrationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIERegistrationDetails");
    private final static QName _TIERegistryItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIERegistryItemDetails");
    private final static QName _TIERemovalDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIERemovalDocDetails");
    private final static QName _TIERemovalInfoDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIERemovalInfoDetails");
    private final static QName _TIRCarnetIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIRCarnetIdDetails");
    private final static QName _TIRCarnetUnloadingLocationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIRCarnetUnloadingLocationDetails");
    private final static QName _TIRGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIRGoodsItemDetails");
    private final static QName _TIRGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIRGoodsShipmentDetails");
    private final static QName _TIRIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIRIdDetails");
    private final static QName _TIRTransportMeansDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TIRTransportMeansDetails");
    private final static QName _TITransportDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TITransportDetails");
    private final static QName _TMPAAutomobileDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TMPAAutomobileDetails");
    private final static QName _TMPAGoodgItemPaymentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TMPAGoodgItemPaymentDetails");
    private final static QName _TMPAGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TMPAGoodsItemDetails");
    private final static QName _TMPAGoodsShipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TMPAGoodsShipmentDetails");
    private final static QName _TMPAPrecedingDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TMPAPrecedingDocDetails");
    private final static QName _TMPAPresentedDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TMPAPresentedDocDetails");
    private final static QName _TMPATransportMeansDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TMPATransportMeansDetails");
    private final static QName _TNVEDCodeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TNVEDCodeDetails");
    private final static QName _TSWDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TSWDetails");
    private final static QName _TradeCountryDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TradeCountryDetails");
    private final static QName _TrailerDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TrailerDetails");
    private final static QName _TransactionNatureDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransactionNatureDetails");
    private final static QName _TranshipmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TranshipmentDetails");
    private final static QName _TranshipmentTransportDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TranshipmentTransportDetails");
    private final static QName _TranshipmentTransportMeansDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TranshipmentTransportMeansDetails");
    private final static QName _TransitConsignmentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransitConsignmentDetails");
    private final static QName _TransitDeclarantDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransitDeclarantDetails");
    private final static QName _TransitDeclarationIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransitDeclarationIdDetails");
    private final static QName _TransitDestinationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransitDestinationDetails");
    private final static QName _TransitGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransitGoodsItemDetails");
    private final static QName _TransitGuaranteeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransitGuaranteeDetails");
    private final static QName _TransitGuaranteeDocDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransitGuaranteeDocDetails");
    private final static QName _TransitMarkDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransitMarkDetails");
    private final static QName _TransitReservationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransitReservationDetails");
    private final static QName _TransitRoutePointDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransitRoutePointDetails");
    private final static QName _TransportDocumentDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransportDocumentDetails");
    private final static QName _TransportMeansIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransportMeansIdDetails");
    private final static QName _TransportMeansItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransportMeansItemDetails");
    private final static QName _TransportMeansRegistrationIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TransportMeansRegistrationIdDetails");
    private final static QName _TravelersChequeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "TravelersChequeDetails");
    private final static QName _UnifiedCustomsOfficeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "UnifiedCustomsOfficeDetails");
    private final static QName _UnloadWarehouseDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "UnloadWarehouseDetails");
    private final static QName _VehicleEngineDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "VehicleEngineDetails");
    private final static QName _VehicleMassDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "VehicleMassDetails");
    private final static QName _VehicleModelDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "VehicleModelDetails");
    private final static QName _VehiclePasportIdDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "VehiclePasportIdDetails");
    private final static QName _VehiclePassportRegDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "VehiclePassportRegDetails");
    private final static QName _VesselConstructionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "VesselConstructionDetails");
    private final static QName _VesselEngineDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "VesselEngineDetails");
    private final static QName _VesselRegistrationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "VesselRegistrationDetails");
    private final static QName _VetReleaseOrganizationDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "VetReleaseOrganizationDetails");
    private final static QName _VoyageDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "VoyageDetails");
    private final static QName _WarehousingGoodsItemDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "WarehousingGoodsItemDetails");
    private final static QName _WasteProductDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "WasteProductDetails");
    private final static QName _WoodCodeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "WoodCodeDetails");
    private final static QName _WoodDescriptionDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "WoodDescriptionDetails");
    private final static QName _WorkScheduleDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "WorkScheduleDetails");
    private final static QName _WorkTimeDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "WorkTimeDetails");
    private final static QName _WorkTimeHourDetails_QNAME = new QName("urn:EEC:M:CA:ComplexDataObjects:v1.8.1", "WorkTimeHourDetails");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eec.m.ca.complexdataobjects.v1_8
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AEORegistryIdDetailsType }
     * 
     */
    public AEORegistryIdDetailsType createAEORegistryIdDetailsType() {
        return new AEORegistryIdDetailsType();
    }

    /**
     * Create an instance of {@link AEOStorageFacilityDetailsType }
     * 
     */
    public AEOStorageFacilityDetailsType createAEOStorageFacilityDetailsType() {
        return new AEOStorageFacilityDetailsType();
    }

    /**
     * Create an instance of {@link ATDAcceptCustomsPersonDetailsType }
     * 
     */
    public ATDAcceptCustomsPersonDetailsType createATDAcceptCustomsPersonDetailsType() {
        return new ATDAcceptCustomsPersonDetailsType();
    }

    /**
     * Create an instance of {@link ATDAcceptOfficerDetailsType }
     * 
     */
    public ATDAcceptOfficerDetailsType createATDAcceptOfficerDetailsType() {
        return new ATDAcceptOfficerDetailsType();
    }

    /**
     * Create an instance of {@link ATDArrivalTransportMeansDetailsType }
     * 
     */
    public ATDArrivalTransportMeansDetailsType createATDArrivalTransportMeansDetailsType() {
        return new ATDArrivalTransportMeansDetailsType();
    }

    /**
     * Create an instance of {@link ATDAttachmentsDetailsType }
     * 
     */
    public ATDAttachmentsDetailsType createATDAttachmentsDetailsType() {
        return new ATDAttachmentsDetailsType();
    }

    /**
     * Create an instance of {@link ATDChangeSealDetailsType }
     * 
     */
    public ATDChangeSealDetailsType createATDChangeSealDetailsType() {
        return new ATDChangeSealDetailsType();
    }

    /**
     * Create an instance of {@link ATDCustodianDetailsType }
     * 
     */
    public ATDCustodianDetailsType createATDCustodianDetailsType() {
        return new ATDCustodianDetailsType();
    }

    /**
     * Create an instance of {@link ATDReturnLocationDetailsType }
     * 
     */
    public ATDReturnLocationDetailsType createATDReturnLocationDetailsType() {
        return new ATDReturnLocationDetailsType();
    }

    /**
     * Create an instance of {@link ATDCustomsPersonDetailsType }
     * 
     */
    public ATDCustomsPersonDetailsType createATDCustomsPersonDetailsType() {
        return new ATDCustomsPersonDetailsType();
    }

    /**
     * Create an instance of {@link ATDCustomsToolsDetailsType }
     * 
     */
    public ATDCustomsToolsDetailsType createATDCustomsToolsDetailsType() {
        return new ATDCustomsToolsDetailsType();
    }

    /**
     * Create an instance of {@link ATDDataReasonDetailsType }
     * 
     */
    public ATDDataReasonDetailsType createATDDataReasonDetailsType() {
        return new ATDDataReasonDetailsType();
    }

    /**
     * Create an instance of {@link ATDDocDetailsType }
     * 
     */
    public ATDDocDetailsType createATDDocDetailsType() {
        return new ATDDocDetailsType();
    }

    /**
     * Create an instance of {@link CustomsIdentificationDetailsType }
     * 
     */
    public CustomsIdentificationDetailsType createCustomsIdentificationDetailsType() {
        return new CustomsIdentificationDetailsType();
    }

    /**
     * Create an instance of {@link ATDGoodsDetailsType }
     * 
     */
    public ATDGoodsDetailsType createATDGoodsDetailsType() {
        return new ATDGoodsDetailsType();
    }

    /**
     * Create an instance of {@link ATDGoodsDetentionReasonDetailsType }
     * 
     */
    public ATDGoodsDetentionReasonDetailsType createATDGoodsDetentionReasonDetailsType() {
        return new ATDGoodsDetentionReasonDetailsType();
    }

    /**
     * Create an instance of {@link ATDGoodsOwnerDetailsType }
     * 
     */
    public ATDGoodsOwnerDetailsType createATDGoodsOwnerDetailsType() {
        return new ATDGoodsOwnerDetailsType();
    }

    /**
     * Create an instance of {@link ATDGoodsReturnDetailsType }
     * 
     */
    public ATDGoodsReturnDetailsType createATDGoodsReturnDetailsType() {
        return new ATDGoodsReturnDetailsType();
    }

    /**
     * Create an instance of {@link ATDInformationDetailsType }
     * 
     */
    public ATDInformationDetailsType createATDInformationDetailsType() {
        return new ATDInformationDetailsType();
    }

    /**
     * Create an instance of {@link ATDInformationSamplesSelectionDetailsType }
     * 
     */
    public ATDInformationSamplesSelectionDetailsType createATDInformationSamplesSelectionDetailsType() {
        return new ATDInformationSamplesSelectionDetailsType();
    }

    /**
     * Create an instance of {@link ATDInformationStorageDetailsType }
     * 
     */
    public ATDInformationStorageDetailsType createATDInformationStorageDetailsType() {
        return new ATDInformationStorageDetailsType();
    }

    /**
     * Create an instance of {@link ATDInformationTransportMeansDetailsType }
     * 
     */
    public ATDInformationTransportMeansDetailsType createATDInformationTransportMeansDetailsType() {
        return new ATDInformationTransportMeansDetailsType();
    }

    /**
     * Create an instance of {@link ATDLocationDetailsType }
     * 
     */
    public ATDLocationDetailsType createATDLocationDetailsType() {
        return new ATDLocationDetailsType();
    }

    /**
     * Create an instance of {@link ATDNewSealDetailsType }
     * 
     */
    public ATDNewSealDetailsType createATDNewSealDetailsType() {
        return new ATDNewSealDetailsType();
    }

    /**
     * Create an instance of {@link ATDOfficerRecipientDetailsType }
     * 
     */
    public ATDOfficerRecipientDetailsType createATDOfficerRecipientDetailsType() {
        return new ATDOfficerRecipientDetailsType();
    }

    /**
     * Create an instance of {@link ATDPackageSamplesDetailsType }
     * 
     */
    public ATDPackageSamplesDetailsType createATDPackageSamplesDetailsType() {
        return new ATDPackageSamplesDetailsType();
    }

    /**
     * Create an instance of {@link ATDPersonDetailsType }
     * 
     */
    public ATDPersonDetailsType createATDPersonDetailsType() {
        return new ATDPersonDetailsType();
    }

    /**
     * Create an instance of {@link ATDRadiationDetailsType }
     * 
     */
    public ATDRadiationDetailsType createATDRadiationDetailsType() {
        return new ATDRadiationDetailsType();
    }

    /**
     * Create an instance of {@link ATDResultsDetailsType }
     * 
     */
    public ATDResultsDetailsType createATDResultsDetailsType() {
        return new ATDResultsDetailsType();
    }

    /**
     * Create an instance of {@link ATDReturnReasonDetailsType }
     * 
     */
    public ATDReturnReasonDetailsType createATDReturnReasonDetailsType() {
        return new ATDReturnReasonDetailsType();
    }

    /**
     * Create an instance of {@link ATDSamplesAddressDetailsType }
     * 
     */
    public ATDSamplesAddressDetailsType createATDSamplesAddressDetailsType() {
        return new ATDSamplesAddressDetailsType();
    }

    /**
     * Create an instance of {@link ATDSamplesLocationDetailsType }
     * 
     */
    public ATDSamplesLocationDetailsType createATDSamplesLocationDetailsType() {
        return new ATDSamplesLocationDetailsType();
    }

    /**
     * Create an instance of {@link InspectionDocIdDetailsType }
     * 
     */
    public InspectionDocIdDetailsType createInspectionDocIdDetailsType() {
        return new InspectionDocIdDetailsType();
    }

    /**
     * Create an instance of {@link ATDSealDetailsType }
     * 
     */
    public ATDSealDetailsType createATDSealDetailsType() {
        return new ATDSealDetailsType();
    }

    /**
     * Create an instance of {@link ATDSecondCopyDetailsType }
     * 
     */
    public ATDSecondCopyDetailsType createATDSecondCopyDetailsType() {
        return new ATDSecondCopyDetailsType();
    }

    /**
     * Create an instance of {@link ATDSecondCopyRecipientDetailsType }
     * 
     */
    public ATDSecondCopyRecipientDetailsType createATDSecondCopyRecipientDetailsType() {
        return new ATDSecondCopyRecipientDetailsType();
    }

    /**
     * Create an instance of {@link ATDSecondCopySenderDetailsType }
     * 
     */
    public ATDSecondCopySenderDetailsType createATDSecondCopySenderDetailsType() {
        return new ATDSecondCopySenderDetailsType();
    }

    /**
     * Create an instance of {@link ATDServiceInfoDetailsType }
     * 
     */
    public ATDServiceInfoDetailsType createATDServiceInfoDetailsType() {
        return new ATDServiceInfoDetailsType();
    }

    /**
     * Create an instance of {@link ATDStatementDetailsType }
     * 
     */
    public ATDStatementDetailsType createATDStatementDetailsType() {
        return new ATDStatementDetailsType();
    }

    /**
     * Create an instance of {@link ATDStorageDetentionsGoodsDetailsType }
     * 
     */
    public ATDStorageDetentionsGoodsDetailsType createATDStorageDetentionsGoodsDetailsType() {
        return new ATDStorageDetentionsGoodsDetailsType();
    }

    /**
     * Create an instance of {@link ATDStorageRequirementDetailsType }
     * 
     */
    public ATDStorageRequirementDetailsType createATDStorageRequirementDetailsType() {
        return new ATDStorageRequirementDetailsType();
    }

    /**
     * Create an instance of {@link ATDTermsThievingSamplingDetailsType }
     * 
     */
    public ATDTermsThievingSamplingDetailsType createATDTermsThievingSamplingDetailsType() {
        return new ATDTermsThievingSamplingDetailsType();
    }

    /**
     * Create an instance of {@link ATDWeightMethodDetailsType }
     * 
     */
    public ATDWeightMethodDetailsType createATDWeightMethodDetailsType() {
        return new ATDWeightMethodDetailsType();
    }

    /**
     * Create an instance of {@link PIATDestinationDetailsType }
     * 
     */
    public PIATDestinationDetailsType createPIATDestinationDetailsType() {
        return new PIATDestinationDetailsType();
    }

    /**
     * Create an instance of {@link GoodsMeasureDetailsType }
     * 
     */
    public GoodsMeasureDetailsType createGoodsMeasureDetailsType() {
        return new GoodsMeasureDetailsType();
    }

    /**
     * Create an instance of {@link IdenticalGoodsCorrectionDetailsType }
     * 
     */
    public IdenticalGoodsCorrectionDetailsType createIdenticalGoodsCorrectionDetailsType() {
        return new IdenticalGoodsCorrectionDetailsType();
    }

    /**
     * Create an instance of {@link PIVPortDetailsType }
     * 
     */
    public PIVPortDetailsType createPIVPortDetailsType() {
        return new PIVPortDetailsType();
    }

    /**
     * Create an instance of {@link AgentDetailsType }
     * 
     */
    public AgentDetailsType createAgentDetailsType() {
        return new AgentDetailsType();
    }

    /**
     * Create an instance of {@link AntiepidemicEquipmentDetailsType }
     * 
     */
    public AntiepidemicEquipmentDetailsType createAntiepidemicEquipmentDetailsType() {
        return new AntiepidemicEquipmentDetailsType();
    }

    /**
     * Create an instance of {@link AntiepidemicReadyDetailsType }
     * 
     */
    public AntiepidemicReadyDetailsType createAntiepidemicReadyDetailsType() {
        return new AntiepidemicReadyDetailsType();
    }

    /**
     * Create an instance of {@link VerificationValueDetailsType }
     * 
     */
    public VerificationValueDetailsType createVerificationValueDetailsType() {
        return new VerificationValueDetailsType();
    }

    /**
     * Create an instance of {@link PointAddressDetailsType }
     * 
     */
    public PointAddressDetailsType createPointAddressDetailsType() {
        return new PointAddressDetailsType();
    }

    /**
     * Create an instance of {@link DeclarationTransportMeansDetailsType }
     * 
     */
    public DeclarationTransportMeansDetailsType createDeclarationTransportMeansDetailsType() {
        return new DeclarationTransportMeansDetailsType();
    }

    /**
     * Create an instance of {@link CustomsDocumentIdDetailsType }
     * 
     */
    public CustomsDocumentIdDetailsType createCustomsDocumentIdDetailsType() {
        return new CustomsDocumentIdDetailsType();
    }

    /**
     * Create an instance of {@link ArriveCustomsDetailsType }
     * 
     */
    public ArriveCustomsDetailsType createArriveCustomsDetailsType() {
        return new ArriveCustomsDetailsType();
    }

    /**
     * Create an instance of {@link ArrivePointDetailsType }
     * 
     */
    public ArrivePointDetailsType createArrivePointDetailsType() {
        return new ArrivePointDetailsType();
    }

    /**
     * Create an instance of {@link ArrivePointLocationDetailsType }
     * 
     */
    public ArrivePointLocationDetailsType createArrivePointLocationDetailsType() {
        return new ArrivePointLocationDetailsType();
    }

    /**
     * Create an instance of {@link ArrivePointLocationWorkDetailsType }
     * 
     */
    public ArrivePointLocationWorkDetailsType createArrivePointLocationWorkDetailsType() {
        return new ArrivePointLocationWorkDetailsType();
    }

    /**
     * Create an instance of {@link CABinaryDataDetailsType }
     * 
     */
    public CABinaryDataDetailsType createCABinaryDataDetailsType() {
        return new CABinaryDataDetailsType();
    }

    /**
     * Create an instance of {@link CATransportMeansDetailsType }
     * 
     */
    public CATransportMeansDetailsType createCATransportMeansDetailsType() {
        return new CATransportMeansDetailsType();
    }

    /**
     * Create an instance of {@link CAOrganizationType }
     * 
     */
    public CAOrganizationType createCAOrganizationType() {
        return new CAOrganizationType();
    }

    /**
     * Create an instance of {@link RegisterOrganizationDetailsType }
     * 
     */
    public RegisterOrganizationDetailsType createRegisterOrganizationDetailsType() {
        return new RegisterOrganizationDetailsType();
    }

    /**
     * Create an instance of {@link BrokerRegistryDocDetailsType }
     * 
     */
    public BrokerRegistryDocDetailsType createBrokerRegistryDocDetailsType() {
        return new BrokerRegistryDocDetailsType();
    }

    /**
     * Create an instance of {@link GoodsShipmentSubjectDetailsType }
     * 
     */
    public GoodsShipmentSubjectDetailsType createGoodsShipmentSubjectDetailsType() {
        return new GoodsShipmentSubjectDetailsType();
    }

    /**
     * Create an instance of {@link BuyerSellerRelationDetailsType }
     * 
     */
    public BuyerSellerRelationDetailsType createBuyerSellerRelationDetailsType() {
        return new BuyerSellerRelationDetailsType();
    }

    /**
     * Create an instance of {@link BuyerSellerRoyaltyFeeDetailsType }
     * 
     */
    public BuyerSellerRoyaltyFeeDetailsType createBuyerSellerRoyaltyFeeDetailsType() {
        return new BuyerSellerRoyaltyFeeDetailsType();
    }

    /**
     * Create an instance of {@link CADocDetailsType }
     * 
     */
    public CADocDetailsType createCADocDetailsType() {
        return new CADocDetailsType();
    }

    /**
     * Create an instance of {@link CALegalActDetailsType }
     * 
     */
    public CALegalActDetailsType createCALegalActDetailsType() {
        return new CALegalActDetailsType();
    }

    /**
     * Create an instance of {@link CASignatureDetailsType }
     * 
     */
    public CASignatureDetailsType createCASignatureDetailsType() {
        return new CASignatureDetailsType();
    }

    /**
     * Create an instance of {@link CAStampDetailsType }
     * 
     */
    public CAStampDetailsType createCAStampDetailsType() {
        return new CAStampDetailsType();
    }

    /**
     * Create an instance of {@link CASubjectBaseDetailsType }
     * 
     */
    public CASubjectBaseDetailsType createCASubjectBaseDetailsType() {
        return new CASubjectBaseDetailsType();
    }

    /**
     * Create an instance of {@link CATNVEDNoteDetailsType }
     * 
     */
    public CATNVEDNoteDetailsType createCATNVEDNoteDetailsType() {
        return new CATNVEDNoteDetailsType();
    }

    /**
     * Create an instance of {@link CDEAUDocDetailsType }
     * 
     */
    public CDEAUDocDetailsType createCDEAUDocDetailsType() {
        return new CDEAUDocDetailsType();
    }

    /**
     * Create an instance of {@link CDEAUDocGoodsDetailsType }
     * 
     */
    public CDEAUDocGoodsDetailsType createCDEAUDocGoodsDetailsType() {
        return new CDEAUDocGoodsDetailsType();
    }

    /**
     * Create an instance of {@link CDEAUJustificationDetailsType }
     * 
     */
    public CDEAUJustificationDetailsType createCDEAUJustificationDetailsType() {
        return new CDEAUJustificationDetailsType();
    }

    /**
     * Create an instance of {@link CDEUModifiedDocDetailsType }
     * 
     */
    public CDEUModifiedDocDetailsType createCDEUModifiedDocDetailsType() {
        return new CDEUModifiedDocDetailsType();
    }

    /**
     * Create an instance of {@link CIMDetailsType }
     * 
     */
    public CIMDetailsType createCIMDetailsType() {
        return new CIMDetailsType();
    }

    /**
     * Create an instance of {@link CIMListDetailsType }
     * 
     */
    public CIMListDetailsType createCIMListDetailsType() {
        return new CIMListDetailsType();
    }

    /**
     * Create an instance of {@link CIMRangeDetailsType }
     * 
     */
    public CIMRangeDetailsType createCIMRangeDetailsType() {
        return new CIMRangeDetailsType();
    }

    /**
     * Create an instance of {@link CPCFactPaymentDetailsType }
     * 
     */
    public CPCFactPaymentDetailsType createCPCFactPaymentDetailsType() {
        return new CPCFactPaymentDetailsType();
    }

    /**
     * Create an instance of {@link CPCGoodsItemDetailsType }
     * 
     */
    public CPCGoodsItemDetailsType createCPCGoodsItemDetailsType() {
        return new CPCGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link CPCGoodsItemPaymentDetailsType }
     * 
     */
    public CPCGoodsItemPaymentDetailsType createCPCGoodsItemPaymentDetailsType() {
        return new CPCGoodsItemPaymentDetailsType();
    }

    /**
     * Create an instance of {@link CPCGoodsShipmentDetailsType }
     * 
     */
    public CPCGoodsShipmentDetailsType createCPCGoodsShipmentDetailsType() {
        return new CPCGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link CustomsDocumentIdWOrdinalDetailsType }
     * 
     */
    public CustomsDocumentIdWOrdinalDetailsType createCustomsDocumentIdWOrdinalDetailsType() {
        return new CustomsDocumentIdWOrdinalDetailsType();
    }

    /**
     * Create an instance of {@link CPCPayerDetailsType }
     * 
     */
    public CPCPayerDetailsType createCPCPayerDetailsType() {
        return new CPCPayerDetailsType();
    }

    /**
     * Create an instance of {@link CPCPaymentAmountDetailsType }
     * 
     */
    public CPCPaymentAmountDetailsType createCPCPaymentAmountDetailsType() {
        return new CPCPaymentAmountDetailsType();
    }

    /**
     * Create an instance of {@link CPCPresentedDocDetailsType }
     * 
     */
    public CPCPresentedDocDetailsType createCPCPresentedDocDetailsType() {
        return new CPCPresentedDocDetailsType();
    }

    /**
     * Create an instance of {@link CRAdditionalInformationDetailsType }
     * 
     */
    public CRAdditionalInformationDetailsType createCRAdditionalInformationDetailsType() {
        return new CRAdditionalInformationDetailsType();
    }

    /**
     * Create an instance of {@link CRAutomobileDetailsType }
     * 
     */
    public CRAutomobileDetailsType createCRAutomobileDetailsType() {
        return new CRAutomobileDetailsType();
    }

    /**
     * Create an instance of {@link CRCommonGoodsInfoDetailsType }
     * 
     */
    public CRCommonGoodsInfoDetailsType createCRCommonGoodsInfoDetailsType() {
        return new CRCommonGoodsInfoDetailsType();
    }

    /**
     * Create an instance of {@link CRCommonPaymentDetailsType }
     * 
     */
    public CRCommonPaymentDetailsType createCRCommonPaymentDetailsType() {
        return new CRCommonPaymentDetailsType();
    }

    /**
     * Create an instance of {@link CRCurrencyDetailsType }
     * 
     */
    public CRCurrencyDetailsType createCRCurrencyDetailsType() {
        return new CRCurrencyDetailsType();
    }

    /**
     * Create an instance of {@link CRExchDetailsType }
     * 
     */
    public CRExchDetailsType createCRExchDetailsType() {
        return new CRExchDetailsType();
    }

    /**
     * Create an instance of {@link CRExchGoodsDetailsType }
     * 
     */
    public CRExchGoodsDetailsType createCRExchGoodsDetailsType() {
        return new CRExchGoodsDetailsType();
    }

    /**
     * Create an instance of {@link CRExchGoodsPaymentsDetailsType }
     * 
     */
    public CRExchGoodsPaymentsDetailsType createCRExchGoodsPaymentsDetailsType() {
        return new CRExchGoodsPaymentsDetailsType();
    }

    /**
     * Create an instance of {@link CRExchResultDetailsType }
     * 
     */
    public CRExchResultDetailsType createCRExchResultDetailsType() {
        return new CRExchResultDetailsType();
    }

    /**
     * Create an instance of {@link CRExchPaymentDetailsType }
     * 
     */
    public CRExchPaymentDetailsType createCRExchPaymentDetailsType() {
        return new CRExchPaymentDetailsType();
    }

    /**
     * Create an instance of {@link CRSubjectDetailsType }
     * 
     */
    public CRSubjectDetailsType createCRSubjectDetailsType() {
        return new CRSubjectDetailsType();
    }

    /**
     * Create an instance of {@link CRGoodsInfoDetailsType }
     * 
     */
    public CRGoodsInfoDetailsType createCRGoodsInfoDetailsType() {
        return new CRGoodsInfoDetailsType();
    }

    /**
     * Create an instance of {@link CRGoodsItemPaymentDetailsType }
     * 
     */
    public CRGoodsItemPaymentDetailsType createCRGoodsItemPaymentDetailsType() {
        return new CRGoodsItemPaymentDetailsType();
    }

    /**
     * Create an instance of {@link CRPaymentDetailsType }
     * 
     */
    public CRPaymentDetailsType createCRPaymentDetailsType() {
        return new CRPaymentDetailsType();
    }

    /**
     * Create an instance of {@link CRPreviosDocDetailsType }
     * 
     */
    public CRPreviosDocDetailsType createCRPreviosDocDetailsType() {
        return new CRPreviosDocDetailsType();
    }

    /**
     * Create an instance of {@link CRSubjectAddressDetailsType }
     * 
     */
    public CRSubjectAddressDetailsType createCRSubjectAddressDetailsType() {
        return new CRSubjectAddressDetailsType();
    }

    /**
     * Create an instance of {@link CRTypeDetailsType }
     * 
     */
    public CRTypeDetailsType createCRTypeDetailsType() {
        return new CRTypeDetailsType();
    }

    /**
     * Create an instance of {@link CVDAdditionalInformationDetailsType }
     * 
     */
    public CVDAdditionalInformationDetailsType createCVDAdditionalInformationDetailsType() {
        return new CVDAdditionalInformationDetailsType();
    }

    /**
     * Create an instance of {@link CVDCurrencyExchangeDetailsType }
     * 
     */
    public CVDCurrencyExchangeDetailsType createCVDCurrencyExchangeDetailsType() {
        return new CVDCurrencyExchangeDetailsType();
    }

    /**
     * Create an instance of {@link CVDEvidenceDocumentDetailsType }
     * 
     */
    public CVDEvidenceDocumentDetailsType createCVDEvidenceDocumentDetailsType() {
        return new CVDEvidenceDocumentDetailsType();
    }

    /**
     * Create an instance of {@link CVDGoodsItemDetailsType }
     * 
     */
    public CVDGoodsItemDetailsType createCVDGoodsItemDetailsType() {
        return new CVDGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link CVDMethod1CalculationDetailsType }
     * 
     */
    public CVDMethod1CalculationDetailsType createCVDMethod1CalculationDetailsType() {
        return new CVDMethod1CalculationDetailsType();
    }

    /**
     * Create an instance of {@link CVDMethod1DetailsType }
     * 
     */
    public CVDMethod1DetailsType createCVDMethod1DetailsType() {
        return new CVDMethod1DetailsType();
    }

    /**
     * Create an instance of {@link CVDMethod236CalculationDetailsType }
     * 
     */
    public CVDMethod236CalculationDetailsType createCVDMethod236CalculationDetailsType() {
        return new CVDMethod236CalculationDetailsType();
    }

    /**
     * Create an instance of {@link CVDMethod46CalculationDetailsType }
     * 
     */
    public CVDMethod46CalculationDetailsType createCVDMethod46CalculationDetailsType() {
        return new CVDMethod46CalculationDetailsType();
    }

    /**
     * Create an instance of {@link CVDMethod56CalculationDetailsType }
     * 
     */
    public CVDMethod56CalculationDetailsType createCVDMethod56CalculationDetailsType() {
        return new CVDMethod56CalculationDetailsType();
    }

    /**
     * Create an instance of {@link CVDOtherMethodDetailsType }
     * 
     */
    public CVDOtherMethodDetailsType createCVDOtherMethodDetailsType() {
        return new CVDOtherMethodDetailsType();
    }

    /**
     * Create an instance of {@link CargoPackagePalletDetailsType }
     * 
     */
    public CargoPackagePalletDetailsType createCargoPackagePalletDetailsType() {
        return new CargoPackagePalletDetailsType();
    }

    /**
     * Create an instance of {@link CarrierDetailsType }
     * 
     */
    public CarrierDetailsType createCarrierDetailsType() {
        return new CarrierDetailsType();
    }

    /**
     * Create an instance of {@link CarrierOrganizationDetailsType }
     * 
     */
    public CarrierOrganizationDetailsType createCarrierOrganizationDetailsType() {
        return new CarrierOrganizationDetailsType();
    }

    /**
     * Create an instance of {@link CarrierRepresentativeDetailsType }
     * 
     */
    public CarrierRepresentativeDetailsType createCarrierRepresentativeDetailsType() {
        return new CarrierRepresentativeDetailsType();
    }

    /**
     * Create an instance of {@link CashListDetailsType }
     * 
     */
    public CashListDetailsType createCashListDetailsType() {
        return new CashListDetailsType();
    }

    /**
     * Create an instance of {@link CertificatePaymentDetailsType }
     * 
     */
    public CertificatePaymentDetailsType createCertificatePaymentDetailsType() {
        return new CertificatePaymentDetailsType();
    }

    /**
     * Create an instance of {@link CheckPointCapacityDetailsType }
     * 
     */
    public CheckPointCapacityDetailsType createCheckPointCapacityDetailsType() {
        return new CheckPointCapacityDetailsType();
    }

    /**
     * Create an instance of {@link CheckPointDetailsType }
     * 
     */
    public CheckPointDetailsType createCheckPointDetailsType() {
        return new CheckPointDetailsType();
    }

    /**
     * Create an instance of {@link CheckPointEntryDetailsType }
     * 
     */
    public CheckPointEntryDetailsType createCheckPointEntryDetailsType() {
        return new CheckPointEntryDetailsType();
    }

    /**
     * Create an instance of {@link CheckPointInformationSystemDetailsType }
     * 
     */
    public CheckPointInformationSystemDetailsType createCheckPointInformationSystemDetailsType() {
        return new CheckPointInformationSystemDetailsType();
    }

    /**
     * Create an instance of {@link CheckPointLinkDetailsType }
     * 
     */
    public CheckPointLinkDetailsType createCheckPointLinkDetailsType() {
        return new CheckPointLinkDetailsType();
    }

    /**
     * Create an instance of {@link CheckPointMaintenanceDetailsType }
     * 
     */
    public CheckPointMaintenanceDetailsType createCheckPointMaintenanceDetailsType() {
        return new CheckPointMaintenanceDetailsType();
    }

    /**
     * Create an instance of {@link CheckPointMaintenanceSystemDetailsType }
     * 
     */
    public CheckPointMaintenanceSystemDetailsType createCheckPointMaintenanceSystemDetailsType() {
        return new CheckPointMaintenanceSystemDetailsType();
    }

    /**
     * Create an instance of {@link CheckPointPassportDetailsType }
     * 
     */
    public CheckPointPassportDetailsType createCheckPointPassportDetailsType() {
        return new CheckPointPassportDetailsType();
    }

    /**
     * Create an instance of {@link CheckPointSpecialControlDetailsType }
     * 
     */
    public CheckPointSpecialControlDetailsType createCheckPointSpecialControlDetailsType() {
        return new CheckPointSpecialControlDetailsType();
    }

    /**
     * Create an instance of {@link CheckPointSystemControlDetailsType }
     * 
     */
    public CheckPointSystemControlDetailsType createCheckPointSystemControlDetailsType() {
        return new CheckPointSystemControlDetailsType();
    }

    /**
     * Create an instance of {@link CheckPointTVSystemDetailsType }
     * 
     */
    public CheckPointTVSystemDetailsType createCheckPointTVSystemDetailsType() {
        return new CheckPointTVSystemDetailsType();
    }

    /**
     * Create an instance of {@link CheckPointWorkDetailsType }
     * 
     */
    public CheckPointWorkDetailsType createCheckPointWorkDetailsType() {
        return new CheckPointWorkDetailsType();
    }

    /**
     * Create an instance of {@link CustomsOperationDetailsType }
     * 
     */
    public CustomsOperationDetailsType createCustomsOperationDetailsType() {
        return new CustomsOperationDetailsType();
    }

    /**
     * Create an instance of {@link ClosedReasonDetailsType }
     * 
     */
    public ClosedReasonDetailsType createClosedReasonDetailsType() {
        return new ClosedReasonDetailsType();
    }

    /**
     * Create an instance of {@link CACommodityDescriptionDetailsType }
     * 
     */
    public CACommodityDescriptionDetailsType createCACommodityDescriptionDetailsType() {
        return new CACommodityDescriptionDetailsType();
    }

    /**
     * Create an instance of {@link CommodityGroupItemDetailsType }
     * 
     */
    public CommodityGroupItemDetailsType createCommodityGroupItemDetailsType() {
        return new CommodityGroupItemDetailsType();
    }

    /**
     * Create an instance of {@link CompetentOrganizationDetailsType }
     * 
     */
    public CompetentOrganizationDetailsType createCompetentOrganizationDetailsType() {
        return new CompetentOrganizationDetailsType();
    }

    /**
     * Create an instance of {@link CustomsDocumentSubjectDetailsType }
     * 
     */
    public CustomsDocumentSubjectDetailsType createCustomsDocumentSubjectDetailsType() {
        return new CustomsDocumentSubjectDetailsType();
    }

    /**
     * Create an instance of {@link CASubjectDetailsType }
     * 
     */
    public CASubjectDetailsType createCASubjectDetailsType() {
        return new CASubjectDetailsType();
    }

    /**
     * Create an instance of {@link ConsignmentCancelDetailsType }
     * 
     */
    public ConsignmentCancelDetailsType createConsignmentCancelDetailsType() {
        return new ConsignmentCancelDetailsType();
    }

    /**
     * Create an instance of {@link CABusinessEntityBranchDetailsType }
     * 
     */
    public CABusinessEntityBranchDetailsType createCABusinessEntityBranchDetailsType() {
        return new CABusinessEntityBranchDetailsType();
    }

    /**
     * Create an instance of {@link ContainerDetailsType }
     * 
     */
    public ContainerDetailsType createContainerDetailsType() {
        return new ContainerDetailsType();
    }

    /**
     * Create an instance of {@link ContainerInformationDetailsType }
     * 
     */
    public ContainerInformationDetailsType createContainerInformationDetailsType() {
        return new ContainerInformationDetailsType();
    }

    /**
     * Create an instance of {@link ContainerListDetailsType }
     * 
     */
    public ContainerListDetailsType createContainerListDetailsType() {
        return new ContainerListDetailsType();
    }

    /**
     * Create an instance of {@link ControlAgencyInformationType }
     * 
     */
    public ControlAgencyInformationType createControlAgencyInformationType() {
        return new ControlAgencyInformationType();
    }

    /**
     * Create an instance of {@link ControlledItemsDetailsType }
     * 
     */
    public ControlledItemsDetailsType createControlledItemsDetailsType() {
        return new ControlledItemsDetailsType();
    }

    /**
     * Create an instance of {@link CrewTrainingDetailsType }
     * 
     */
    public CrewTrainingDetailsType createCrewTrainingDetailsType() {
        return new CrewTrainingDetailsType();
    }

    /**
     * Create an instance of {@link CustomsBrokerDetailsType }
     * 
     */
    public CustomsBrokerDetailsType createCustomsBrokerDetailsType() {
        return new CustomsBrokerDetailsType();
    }

    /**
     * Create an instance of {@link CustomsCheckCodeDetailsType }
     * 
     */
    public CustomsCheckCodeDetailsType createCustomsCheckCodeDetailsType() {
        return new CustomsCheckCodeDetailsType();
    }

    /**
     * Create an instance of {@link CustomsControlZoneDetailsType }
     * 
     */
    public CustomsControlZoneDetailsType createCustomsControlZoneDetailsType() {
        return new CustomsControlZoneDetailsType();
    }

    /**
     * Create an instance of {@link CustomsControlZoneIdDetailsType }
     * 
     */
    public CustomsControlZoneIdDetailsType createCustomsControlZoneIdDetailsType() {
        return new CustomsControlZoneIdDetailsType();
    }

    /**
     * Create an instance of {@link DTExchDecisionDetailsType }
     * 
     */
    public DTExchDecisionDetailsType createDTExchDecisionDetailsType() {
        return new DTExchDecisionDetailsType();
    }

    /**
     * Create an instance of {@link CustomsIdentificationMeansIdDetailsType }
     * 
     */
    public CustomsIdentificationMeansIdDetailsType createCustomsIdentificationMeansIdDetailsType() {
        return new CustomsIdentificationMeansIdDetailsType();
    }

    /**
     * Create an instance of {@link CustomsMarkDetailsType }
     * 
     */
    public CustomsMarkDetailsType createCustomsMarkDetailsType() {
        return new CustomsMarkDetailsType();
    }

    /**
     * Create an instance of {@link CustomsOfficeClassifierDetailsType }
     * 
     */
    public CustomsOfficeClassifierDetailsType createCustomsOfficeClassifierDetailsType() {
        return new CustomsOfficeClassifierDetailsType();
    }

    /**
     * Create an instance of {@link CustomsOfficeFunctionalDetailsType }
     * 
     */
    public CustomsOfficeFunctionalDetailsType createCustomsOfficeFunctionalDetailsType() {
        return new CustomsOfficeFunctionalDetailsType();
    }

    /**
     * Create an instance of {@link CustomsOfficeIndicatorDetailsType }
     * 
     */
    public CustomsOfficeIndicatorDetailsType createCustomsOfficeIndicatorDetailsType() {
        return new CustomsOfficeIndicatorDetailsType();
    }

    /**
     * Create an instance of {@link CustomsPaymentBaseDetailsType }
     * 
     */
    public CustomsPaymentBaseDetailsType createCustomsPaymentBaseDetailsType() {
        return new CustomsPaymentBaseDetailsType();
    }

    /**
     * Create an instance of {@link GoodsItemPaymentDetailsType }
     * 
     */
    public GoodsItemPaymentDetailsType createGoodsItemPaymentDetailsType() {
        return new GoodsItemPaymentDetailsType();
    }

    /**
     * Create an instance of {@link CustomsPersonDetailsType }
     * 
     */
    public CustomsPersonDetailsType createCustomsPersonDetailsType() {
        return new CustomsPersonDetailsType();
    }

    /**
     * Create an instance of {@link CustomsPersonSignDetailsType }
     * 
     */
    public CustomsPersonSignDetailsType createCustomsPersonSignDetailsType() {
        return new CustomsPersonSignDetailsType();
    }

    /**
     * Create an instance of {@link CustomsProcedureDetailsType }
     * 
     */
    public CustomsProcedureDetailsType createCustomsProcedureDetailsType() {
        return new CustomsProcedureDetailsType();
    }

    /**
     * Create an instance of {@link CustomsReceiptIdDetailsType }
     * 
     */
    public CustomsReceiptIdDetailsType createCustomsReceiptIdDetailsType() {
        return new CustomsReceiptIdDetailsType();
    }

    /**
     * Create an instance of {@link CustomsRepresentativeDetailsType }
     * 
     */
    public CustomsRepresentativeDetailsType createCustomsRepresentativeDetailsType() {
        return new CustomsRepresentativeDetailsType();
    }

    /**
     * Create an instance of {@link CustomsTaxModeCodeDetailsType }
     * 
     */
    public CustomsTaxModeCodeDetailsType createCustomsTaxModeCodeDetailsType() {
        return new CustomsTaxModeCodeDetailsType();
    }

    /**
     * Create an instance of {@link CustomsToolDetailsType }
     * 
     */
    public CustomsToolDetailsType createCustomsToolDetailsType() {
        return new CustomsToolDetailsType();
    }

    /**
     * Create an instance of {@link CustomsValueDetailsType }
     * 
     */
    public CustomsValueDetailsType createCustomsValueDetailsType() {
        return new CustomsValueDetailsType();
    }

    /**
     * Create an instance of {@link WarehouseDetailsType }
     * 
     */
    public WarehouseDetailsType createWarehouseDetailsType() {
        return new WarehouseDetailsType();
    }

    /**
     * Create an instance of {@link DTAutomobileDetailsType }
     * 
     */
    public DTAutomobileDetailsType createDTAutomobileDetailsType() {
        return new DTAutomobileDetailsType();
    }

    /**
     * Create an instance of {@link DTExchAutoDetailsType }
     * 
     */
    public DTExchAutoDetailsType createDTExchAutoDetailsType() {
        return new DTExchAutoDetailsType();
    }

    /**
     * Create an instance of {@link DTExchAutomobileDetailsType }
     * 
     */
    public DTExchAutomobileDetailsType createDTExchAutomobileDetailsType() {
        return new DTExchAutomobileDetailsType();
    }

    /**
     * Create an instance of {@link DTExchCustomsPaymentDetailsType }
     * 
     */
    public DTExchCustomsPaymentDetailsType createDTExchCustomsPaymentDetailsType() {
        return new DTExchCustomsPaymentDetailsType();
    }

    /**
     * Create an instance of {@link DTExchDeclarationIdDetailsType }
     * 
     */
    public DTExchDeclarationIdDetailsType createDTExchDeclarationIdDetailsType() {
        return new DTExchDeclarationIdDetailsType();
    }

    /**
     * Create an instance of {@link DTExchFactPaymentDetailsType }
     * 
     */
    public DTExchFactPaymentDetailsType createDTExchFactPaymentDetailsType() {
        return new DTExchFactPaymentDetailsType();
    }

    /**
     * Create an instance of {@link DTExchGoodsPaymentsDetailsType }
     * 
     */
    public DTExchGoodsPaymentsDetailsType createDTExchGoodsPaymentsDetailsType() {
        return new DTExchGoodsPaymentsDetailsType();
    }

    /**
     * Create an instance of {@link DTExchListDetailsType }
     * 
     */
    public DTExchListDetailsType createDTExchListDetailsType() {
        return new DTExchListDetailsType();
    }

    /**
     * Create an instance of {@link PrecedingDocsDetailsType }
     * 
     */
    public PrecedingDocsDetailsType createPrecedingDocsDetailsType() {
        return new PrecedingDocsDetailsType();
    }

    /**
     * Create an instance of {@link DTExchPresentedDocDetailsType }
     * 
     */
    public DTExchPresentedDocDetailsType createDTExchPresentedDocDetailsType() {
        return new DTExchPresentedDocDetailsType();
    }

    /**
     * Create an instance of {@link DTExchGoodsItemDetailsType }
     * 
     */
    public DTExchGoodsItemDetailsType createDTExchGoodsItemDetailsType() {
        return new DTExchGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link DTExchGoodsShipmentType }
     * 
     */
    public DTExchGoodsShipmentType createDTExchGoodsShipmentType() {
        return new DTExchGoodsShipmentType();
    }

    /**
     * Create an instance of {@link DTIdentificationMeansDetailsType }
     * 
     */
    public DTIdentificationMeansDetailsType createDTIdentificationMeansDetailsType() {
        return new DTIdentificationMeansDetailsType();
    }

    /**
     * Create an instance of {@link DTMDocDetailsType }
     * 
     */
    public DTMDocDetailsType createDTMDocDetailsType() {
        return new DTMDocDetailsType();
    }

    /**
     * Create an instance of {@link DTSExchGoodsItemDetailsType }
     * 
     */
    public DTSExchGoodsItemDetailsType createDTSExchGoodsItemDetailsType() {
        return new DTSExchGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link DTSExchItemDetailsType }
     * 
     */
    public DTSExchItemDetailsType createDTSExchItemDetailsType() {
        return new DTSExchItemDetailsType();
    }

    /**
     * Create an instance of {@link DTStatDetailsType }
     * 
     */
    public DTStatDetailsType createDTStatDetailsType() {
        return new DTStatDetailsType();
    }

    /**
     * Create an instance of {@link DTStatGoodsDetailsType }
     * 
     */
    public DTStatGoodsDetailsType createDTStatGoodsDetailsType() {
        return new DTStatGoodsDetailsType();
    }

    /**
     * Create an instance of {@link DamagedIndicatorDetailsType }
     * 
     */
    public DamagedIndicatorDetailsType createDamagedIndicatorDetailsType() {
        return new DamagedIndicatorDetailsType();
    }

    /**
     * Create an instance of {@link DecisionDetailsType }
     * 
     */
    public DecisionDetailsType createDecisionDetailsType() {
        return new DecisionDetailsType();
    }

    /**
     * Create an instance of {@link DeclarantDetailsType }
     * 
     */
    public DeclarantDetailsType createDeclarantDetailsType() {
        return new DeclarantDetailsType();
    }

    /**
     * Create an instance of {@link DeclarationConsignmentDetailsType }
     * 
     */
    public DeclarationConsignmentDetailsType createDeclarationConsignmentDetailsType() {
        return new DeclarationConsignmentDetailsType();
    }

    /**
     * Create an instance of {@link DeclarationGoodsItemDetailsType }
     * 
     */
    public DeclarationGoodsItemDetailsType createDeclarationGoodsItemDetailsType() {
        return new DeclarationGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link DeclarationGoodsShipmentDetailsType }
     * 
     */
    public DeclarationGoodsShipmentDetailsType createDeclarationGoodsShipmentDetailsType() {
        return new DeclarationGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link DefferedPaymentDetailsType }
     * 
     */
    public DefferedPaymentDetailsType createDefferedPaymentDetailsType() {
        return new DefferedPaymentDetailsType();
    }

    /**
     * Create an instance of {@link DelayPaymentsDetailsType }
     * 
     */
    public DelayPaymentsDetailsType createDelayPaymentsDetailsType() {
        return new DelayPaymentsDetailsType();
    }

    /**
     * Create an instance of {@link DeliveryTermsDetailsType }
     * 
     */
    public DeliveryTermsDetailsType createDeliveryTermsDetailsType() {
        return new DeliveryTermsDetailsType();
    }

    /**
     * Create an instance of {@link CACountryDetailsType }
     * 
     */
    public CACountryDetailsType createCACountryDetailsType() {
        return new CACountryDetailsType();
    }

    /**
     * Create an instance of {@link UnifiedCustomsOfficeDetailsType }
     * 
     */
    public UnifiedCustomsOfficeDetailsType createUnifiedCustomsOfficeDetailsType() {
        return new UnifiedCustomsOfficeDetailsType();
    }

    /**
     * Create an instance of {@link TransportMeansIDDetailsType }
     * 
     */
    public TransportMeansIDDetailsType createTransportMeansIDDetailsType() {
        return new TransportMeansIDDetailsType();
    }

    /**
     * Create an instance of {@link CustomsOfficeDetailsType }
     * 
     */
    public CustomsOfficeDetailsType createCustomsOfficeDetailsType() {
        return new CustomsOfficeDetailsType();
    }

    /**
     * Create an instance of {@link RangeDetailsType }
     * 
     */
    public RangeDetailsType createRangeDetailsType() {
        return new RangeDetailsType();
    }

    /**
     * Create an instance of {@link EmbarkationPlaceDetailsType }
     * 
     */
    public EmbarkationPlaceDetailsType createEmbarkationPlaceDetailsType() {
        return new EmbarkationPlaceDetailsType();
    }

    /**
     * Create an instance of {@link DisinfectionDetailsType }
     * 
     */
    public DisinfectionDetailsType createDisinfectionDetailsType() {
        return new DisinfectionDetailsType();
    }

    /**
     * Create an instance of {@link DisinfestationDetailsType }
     * 
     */
    public DisinfestationDetailsType createDisinfestationDetailsType() {
        return new DisinfestationDetailsType();
    }

    /**
     * Create an instance of {@link DocArchIdDetailsType }
     * 
     */
    public DocArchIdDetailsType createDocArchIdDetailsType() {
        return new DocArchIdDetailsType();
    }

    /**
     * Create an instance of {@link DocumentPresentingDetailsType }
     * 
     */
    public DocumentPresentingDetailsType createDocumentPresentingDetailsType() {
        return new DocumentPresentingDetailsType();
    }

    /**
     * Create an instance of {@link DoubleCorridorDetailsType }
     * 
     */
    public DoubleCorridorDetailsType createDoubleCorridorDetailsType() {
        return new DoubleCorridorDetailsType();
    }

    /**
     * Create an instance of {@link CAPersonBaseType }
     * 
     */
    public CAPersonBaseType createCAPersonBaseType() {
        return new CAPersonBaseType();
    }

    /**
     * Create an instance of {@link DriverDetailsType }
     * 
     */
    public DriverDetailsType createDriverDetailsType() {
        return new DriverDetailsType();
    }

    /**
     * Create an instance of {@link ECChangeDetailsType }
     * 
     */
    public ECChangeDetailsType createECChangeDetailsType() {
        return new ECChangeDetailsType();
    }

    /**
     * Create an instance of {@link ECGoodsItemDetailsType }
     * 
     */
    public ECGoodsItemDetailsType createECGoodsItemDetailsType() {
        return new ECGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link ECGoodsShipmentDetailsType }
     * 
     */
    public ECGoodsShipmentDetailsType createECGoodsShipmentDetailsType() {
        return new ECGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link ECHouseShipmentDetailsType }
     * 
     */
    public ECHouseShipmentDetailsType createECHouseShipmentDetailsType() {
        return new ECHouseShipmentDetailsType();
    }

    /**
     * Create an instance of {@link ECPaymentAmountDetailsType }
     * 
     */
    public ECPaymentAmountDetailsType createECPaymentAmountDetailsType() {
        return new ECPaymentAmountDetailsType();
    }

    /**
     * Create an instance of {@link ECPrecedingDocDetailsType }
     * 
     */
    public ECPrecedingDocDetailsType createECPrecedingDocDetailsType() {
        return new ECPrecedingDocDetailsType();
    }

    /**
     * Create an instance of {@link ECPresentedDocDetailsType }
     * 
     */
    public ECPresentedDocDetailsType createECPresentedDocDetailsType() {
        return new ECPresentedDocDetailsType();
    }

    /**
     * Create an instance of {@link EDocCorrectionDetaisType }
     * 
     */
    public EDocCorrectionDetaisType createEDocCorrectionDetaisType() {
        return new EDocCorrectionDetaisType();
    }

    /**
     * Create an instance of {@link DutyTaxFeeRateDetailsType }
     * 
     */
    public DutyTaxFeeRateDetailsType createDutyTaxFeeRateDetailsType() {
        return new DutyTaxFeeRateDetailsType();
    }

    /**
     * Create an instance of {@link ElectricPowerTransferDetailsType }
     * 
     */
    public ElectricPowerTransferDetailsType createElectricPowerTransferDetailsType() {
        return new ElectricPowerTransferDetailsType();
    }

    /**
     * Create an instance of {@link EnsureDocDetailsType }
     * 
     */
    public EnsureDocDetailsType createEnsureDocDetailsType() {
        return new EnsureDocDetailsType();
    }

    /**
     * Create an instance of {@link EquipmentDetailsType }
     * 
     */
    public EquipmentDetailsType createEquipmentDetailsType() {
        return new EquipmentDetailsType();
    }

    /**
     * Create an instance of {@link ExciseStampDetailsType }
     * 
     */
    public ExciseStampDetailsType createExciseStampDetailsType() {
        return new ExciseStampDetailsType();
    }

    /**
     * Create an instance of {@link ExciseStampIdListDetailsType }
     * 
     */
    public ExciseStampIdListDetailsType createExciseStampIdListDetailsType() {
        return new ExciseStampIdListDetailsType();
    }

    /**
     * Create an instance of {@link ExciseStampRangeDetailsType }
     * 
     */
    public ExciseStampRangeDetailsType createExciseStampRangeDetailsType() {
        return new ExciseStampRangeDetailsType();
    }

    /**
     * Create an instance of {@link ExportCancellationReasonDetailsType }
     * 
     */
    public ExportCancellationReasonDetailsType createExportCancellationReasonDetailsType() {
        return new ExportCancellationReasonDetailsType();
    }

    /**
     * Create an instance of {@link FEConsignmentDetailsType }
     * 
     */
    public FEConsignmentDetailsType createFEConsignmentDetailsType() {
        return new FEConsignmentDetailsType();
    }

    /**
     * Create an instance of {@link FEFactDetailsType }
     * 
     */
    public FEFactDetailsType createFEFactDetailsType() {
        return new FEFactDetailsType();
    }

    /**
     * Create an instance of {@link FEGoodsDetailsType }
     * 
     */
    public FEGoodsDetailsType createFEGoodsDetailsType() {
        return new FEGoodsDetailsType();
    }

    /**
     * Create an instance of {@link FEGoodsInfoDetailsType }
     * 
     */
    public FEGoodsInfoDetailsType createFEGoodsInfoDetailsType() {
        return new FEGoodsInfoDetailsType();
    }

    /**
     * Create an instance of {@link FERegistrationIdDetailsType }
     * 
     */
    public FERegistrationIdDetailsType createFERegistrationIdDetailsType() {
        return new FERegistrationIdDetailsType();
    }

    /**
     * Create an instance of {@link FLAvtoDetailsType }
     * 
     */
    public FLAvtoDetailsType createFLAvtoDetailsType() {
        return new FLAvtoDetailsType();
    }

    /**
     * Create an instance of {@link FLAvtoPaymentRateDetailsType }
     * 
     */
    public FLAvtoPaymentRateDetailsType createFLAvtoPaymentRateDetailsType() {
        return new FLAvtoPaymentRateDetailsType();
    }

    /**
     * Create an instance of {@link PICargoLocationDetailsType }
     * 
     */
    public PICargoLocationDetailsType createPICargoLocationDetailsType() {
        return new PICargoLocationDetailsType();
    }

    /**
     * Create an instance of {@link FactPaymentDetailsType }
     * 
     */
    public FactPaymentDetailsType createFactPaymentDetailsType() {
        return new FactPaymentDetailsType();
    }

    /**
     * Create an instance of {@link FactPaymentOldDetailsType }
     * 
     */
    public FactPaymentOldDetailsType createFactPaymentOldDetailsType() {
        return new FactPaymentOldDetailsType();
    }

    /**
     * Create an instance of {@link IdentificationMeansItemDetailsType }
     * 
     */
    public IdentificationMeansItemDetailsType createIdentificationMeansItemDetailsType() {
        return new IdentificationMeansItemDetailsType();
    }

    /**
     * Create an instance of {@link FlightDetailsType }
     * 
     */
    public FlightDetailsType createFlightDetailsType() {
        return new FlightDetailsType();
    }

    /**
     * Create an instance of {@link ForeignTradeContractDetailsType }
     * 
     */
    public ForeignTradeContractDetailsType createForeignTradeContractDetailsType() {
        return new ForeignTradeContractDetailsType();
    }

    /**
     * Create an instance of {@link CASubjectBaseDetailsV3Type }
     * 
     */
    public CASubjectBaseDetailsV3Type createCASubjectBaseDetailsV3Type() {
        return new CASubjectBaseDetailsV3Type();
    }

    /**
     * Create an instance of {@link FreePracticeDetailsType }
     * 
     */
    public FreePracticeDetailsType createFreePracticeDetailsType() {
        return new FreePracticeDetailsType();
    }

    /**
     * Create an instance of {@link GCGuaranteeConfirmDocDetailsType }
     * 
     */
    public GCGuaranteeConfirmDocDetailsType createGCGuaranteeConfirmDocDetailsType() {
        return new GCGuaranteeConfirmDocDetailsType();
    }

    /**
     * Create an instance of {@link GDCChangeDetailsType }
     * 
     */
    public GDCChangeDetailsType createGDCChangeDetailsType() {
        return new GDCChangeDetailsType();
    }

    /**
     * Create an instance of {@link GDCExchFactPaymentDetailsType }
     * 
     */
    public GDCExchFactPaymentDetailsType createGDCExchFactPaymentDetailsType() {
        return new GDCExchFactPaymentDetailsType();
    }

    /**
     * Create an instance of {@link GDCExchGoodsItemDetailsType }
     * 
     */
    public GDCExchGoodsItemDetailsType createGDCExchGoodsItemDetailsType() {
        return new GDCExchGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link GDCExchGoodsShipmentDetailsType }
     * 
     */
    public GDCExchGoodsShipmentDetailsType createGDCExchGoodsShipmentDetailsType() {
        return new GDCExchGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link GDCExchPaymentDocDetailsType }
     * 
     */
    public GDCExchPaymentDocDetailsType createGDCExchPaymentDocDetailsType() {
        return new GDCExchPaymentDocDetailsType();
    }

    /**
     * Create an instance of {@link GDCItemDetailsType }
     * 
     */
    public GDCItemDetailsType createGDCItemDetailsType() {
        return new GDCItemDetailsType();
    }

    /**
     * Create an instance of {@link SignatoryPersonDetailsV2Type }
     * 
     */
    public SignatoryPersonDetailsV2Type createSignatoryPersonDetailsV2Type() {
        return new SignatoryPersonDetailsV2Type();
    }

    /**
     * Create an instance of {@link SignatoryRepresentativeDetailsType }
     * 
     */
    public SignatoryRepresentativeDetailsType createSignatoryRepresentativeDetailsType() {
        return new SignatoryRepresentativeDetailsType();
    }

    /**
     * Create an instance of {@link GDConsignmentDetailsType }
     * 
     */
    public GDConsignmentDetailsType createGDConsignmentDetailsType() {
        return new GDConsignmentDetailsType();
    }

    /**
     * Create an instance of {@link GDFactPaymentDetailsType }
     * 
     */
    public GDFactPaymentDetailsType createGDFactPaymentDetailsType() {
        return new GDFactPaymentDetailsType();
    }

    /**
     * Create an instance of {@link GDGoodsItemDetailsType }
     * 
     */
    public GDGoodsItemDetailsType createGDGoodsItemDetailsType() {
        return new GDGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link GDGoodsShipmentDetailsType }
     * 
     */
    public GDGoodsShipmentDetailsType createGDGoodsShipmentDetailsType() {
        return new GDGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link GDPaymentDocDetailsType }
     * 
     */
    public GDPaymentDocDetailsType createGDPaymentDocDetailsType() {
        return new GDPaymentDocDetailsType();
    }

    /**
     * Create an instance of {@link GRAGoodsItemDetailsType }
     * 
     */
    public GRAGoodsItemDetailsType createGRAGoodsItemDetailsType() {
        return new GRAGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link GRAGoodsShipmentDetailsType }
     * 
     */
    public GRAGoodsShipmentDetailsType createGRAGoodsShipmentDetailsType() {
        return new GRAGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link GRAGuaranteeDetailsType }
     * 
     */
    public GRAGuaranteeDetailsType createGRAGuaranteeDetailsType() {
        return new GRAGuaranteeDetailsType();
    }

    /**
     * Create an instance of {@link GRAPresentedDocDetailsType }
     * 
     */
    public GRAPresentedDocDetailsType createGRAPresentedDocDetailsType() {
        return new GRAPresentedDocDetailsType();
    }

    /**
     * Create an instance of {@link CADocBaseType }
     * 
     */
    public CADocBaseType createCADocBaseType() {
        return new CADocBaseType();
    }

    /**
     * Create an instance of {@link TransportMeansListDetailsType }
     * 
     */
    public TransportMeansListDetailsType createTransportMeansListDetailsType() {
        return new TransportMeansListDetailsType();
    }

    /**
     * Create an instance of {@link GoodsDecisionDetailsType }
     * 
     */
    public GoodsDecisionDetailsType createGoodsDecisionDetailsType() {
        return new GoodsDecisionDetailsType();
    }

    /**
     * Create an instance of {@link GoodsDeclarationChangeDetailsType }
     * 
     */
    public GoodsDeclarationChangeDetailsType createGoodsDeclarationChangeDetailsType() {
        return new GoodsDeclarationChangeDetailsType();
    }

    /**
     * Create an instance of {@link GoodsDisinfectionDetailsType }
     * 
     */
    public GoodsDisinfectionDetailsType createGoodsDisinfectionDetailsType() {
        return new GoodsDisinfectionDetailsType();
    }

    /**
     * Create an instance of {@link GoodsItemGroupDetailsType }
     * 
     */
    public GoodsItemGroupDetailsType createGoodsItemGroupDetailsType() {
        return new GoodsItemGroupDetailsType();
    }

    /**
     * Create an instance of {@link ProcessingDetailsType }
     * 
     */
    public ProcessingDetailsType createProcessingDetailsType() {
        return new ProcessingDetailsType();
    }

    /**
     * Create an instance of {@link GoodsLocationDetailsType }
     * 
     */
    public GoodsLocationDetailsType createGoodsLocationDetailsType() {
        return new GoodsLocationDetailsType();
    }

    /**
     * Create an instance of {@link CAGoodsManufacturerDetailsType }
     * 
     */
    public CAGoodsManufacturerDetailsType createCAGoodsManufacturerDetailsType() {
        return new CAGoodsManufacturerDetailsType();
    }

    /**
     * Create an instance of {@link GoodsMarkDetailsType }
     * 
     */
    public GoodsMarkDetailsType createGoodsMarkDetailsType() {
        return new GoodsMarkDetailsType();
    }

    /**
     * Create an instance of {@link GoodsPartViewDetailsType }
     * 
     */
    public GoodsPartViewDetailsType createGoodsPartViewDetailsType() {
        return new GoodsPartViewDetailsType();
    }

    /**
     * Create an instance of {@link GoodsReleaseDetailsType }
     * 
     */
    public GoodsReleaseDetailsType createGoodsReleaseDetailsType() {
        return new GoodsReleaseDetailsType();
    }

    /**
     * Create an instance of {@link GoodsReleaseIdDetailsType }
     * 
     */
    public GoodsReleaseIdDetailsType createGoodsReleaseIdDetailsType() {
        return new GoodsReleaseIdDetailsType();
    }

    /**
     * Create an instance of {@link GoodsUseRestrictionDetailsType }
     * 
     */
    public GoodsUseRestrictionDetailsType createGoodsUseRestrictionDetailsType() {
        return new GoodsUseRestrictionDetailsType();
    }

    /**
     * Create an instance of {@link GuaranteeCertificateAgentDetailsType }
     * 
     */
    public GuaranteeCertificateAgentDetailsType createGuaranteeCertificateAgentDetailsType() {
        return new GuaranteeCertificateAgentDetailsType();
    }

    /**
     * Create an instance of {@link CertificateDetailsType }
     * 
     */
    public CertificateDetailsType createCertificateDetailsType() {
        return new CertificateDetailsType();
    }

    /**
     * Create an instance of {@link GuaranteeCertificateIdDetailsType }
     * 
     */
    public GuaranteeCertificateIdDetailsType createGuaranteeCertificateIdDetailsType() {
        return new GuaranteeCertificateIdDetailsType();
    }

    /**
     * Create an instance of {@link GuaranteeCertificateInformationDetailsType }
     * 
     */
    public GuaranteeCertificateInformationDetailsType createGuaranteeCertificateInformationDetailsType() {
        return new GuaranteeCertificateInformationDetailsType();
    }

    /**
     * Create an instance of {@link GuaranteeCertificateMarkDetailsType }
     * 
     */
    public GuaranteeCertificateMarkDetailsType createGuaranteeCertificateMarkDetailsType() {
        return new GuaranteeCertificateMarkDetailsType();
    }

    /**
     * Create an instance of {@link CABusinessEntityDetailsType }
     * 
     */
    public CABusinessEntityDetailsType createCABusinessEntityDetailsType() {
        return new CABusinessEntityDetailsType();
    }

    /**
     * Create an instance of {@link IPObjectRegistryIdDetailsType }
     * 
     */
    public IPObjectRegistryIdDetailsType createIPObjectRegistryIdDetailsType() {
        return new IPObjectRegistryIdDetailsType();
    }

    /**
     * Create an instance of {@link IdentificationMeansDataUnitDetailsType }
     * 
     */
    public IdentificationMeansDataUnitDetailsType createIdentificationMeansDataUnitDetailsType() {
        return new IdentificationMeansDataUnitDetailsType();
    }

    /**
     * Create an instance of {@link IdentificationMeansDetailsType }
     * 
     */
    public IdentificationMeansDetailsType createIdentificationMeansDetailsType() {
        return new IdentificationMeansDetailsType();
    }

    /**
     * Create an instance of {@link IdentificationMeansListDetailsType }
     * 
     */
    public IdentificationMeansListDetailsType createIdentificationMeansListDetailsType() {
        return new IdentificationMeansListDetailsType();
    }

    /**
     * Create an instance of {@link IdentificationMeansRangeDetailsType }
     * 
     */
    public IdentificationMeansRangeDetailsType createIdentificationMeansRangeDetailsType() {
        return new IdentificationMeansRangeDetailsType();
    }

    /**
     * Create an instance of {@link ImportCarInfoDetailsType }
     * 
     */
    public ImportCarInfoDetailsType createImportCarInfoDetailsType() {
        return new ImportCarInfoDetailsType();
    }

    /**
     * Create an instance of {@link ImportCarProcessingResultInfoDetailsType }
     * 
     */
    public ImportCarProcessingResultInfoDetailsType createImportCarProcessingResultInfoDetailsType() {
        return new ImportCarProcessingResultInfoDetailsType();
    }

    /**
     * Create an instance of {@link IncidentDetailsType }
     * 
     */
    public IncidentDetailsType createIncidentDetailsType() {
        return new IncidentDetailsType();
    }

    /**
     * Create an instance of {@link IneffectiveTaxRateDetailsType }
     * 
     */
    public IneffectiveTaxRateDetailsType createIneffectiveTaxRateDetailsType() {
        return new IneffectiveTaxRateDetailsType();
    }

    /**
     * Create an instance of {@link InformationSourceDetailsType }
     * 
     */
    public InformationSourceDetailsType createInformationSourceDetailsType() {
        return new InformationSourceDetailsType();
    }

    /**
     * Create an instance of {@link InvestmentGoodsIdDetailsType }
     * 
     */
    public InvestmentGoodsIdDetailsType createInvestmentGoodsIdDetailsType() {
        return new InvestmentGoodsIdDetailsType();
    }

    /**
     * Create an instance of {@link InvoiceValueBaseDetailsType }
     * 
     */
    public InvoiceValueBaseDetailsType createInvoiceValueBaseDetailsType() {
        return new InvoiceValueBaseDetailsType();
    }

    /**
     * Create an instance of {@link ItemDetailsType }
     * 
     */
    public ItemDetailsType createItemDetailsType() {
        return new ItemDetailsType();
    }

    /**
     * Create an instance of {@link ItineraryPointDetailsType }
     * 
     */
    public ItineraryPointDetailsType createItineraryPointDetailsType() {
        return new ItineraryPointDetailsType();
    }

    /**
     * Create an instance of {@link GDCSignatoryDetailsType }
     * 
     */
    public GDCSignatoryDetailsType createGDCSignatoryDetailsType() {
        return new GDCSignatoryDetailsType();
    }

    /**
     * Create an instance of {@link LabelRangeDetailsType }
     * 
     */
    public LabelRangeDetailsType createLabelRangeDetailsType() {
        return new LabelRangeDetailsType();
    }

    /**
     * Create an instance of {@link LicensedGoodsDetailsType }
     * 
     */
    public LicensedGoodsDetailsType createLicensedGoodsDetailsType() {
        return new LicensedGoodsDetailsType();
    }

    /**
     * Create an instance of {@link LostGoodsItemDetailsType }
     * 
     */
    public LostGoodsItemDetailsType createLostGoodsItemDetailsType() {
        return new LostGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link MainteanceEquipmentDetailsType }
     * 
     */
    public MainteanceEquipmentDetailsType createMainteanceEquipmentDetailsType() {
        return new MainteanceEquipmentDetailsType();
    }

    /**
     * Create an instance of {@link CASubjectDetailsV2Type }
     * 
     */
    public CASubjectDetailsV2Type createCASubjectDetailsV2Type() {
        return new CASubjectDetailsV2Type();
    }

    /**
     * Create an instance of {@link MaritimeHealthDeclarationDetailsType }
     * 
     */
    public MaritimeHealthDeclarationDetailsType createMaritimeHealthDeclarationDetailsType() {
        return new MaritimeHealthDeclarationDetailsType();
    }

    /**
     * Create an instance of {@link ItemAvailabilityDetailsType }
     * 
     */
    public ItemAvailabilityDetailsType createItemAvailabilityDetailsType() {
        return new ItemAvailabilityDetailsType();
    }

    /**
     * Create an instance of {@link Method1AddSumDetailsType }
     * 
     */
    public Method1AddSumDetailsType createMethod1AddSumDetailsType() {
        return new Method1AddSumDetailsType();
    }

    /**
     * Create an instance of {@link Method1BasisCalculationDetailsType }
     * 
     */
    public Method1BasisCalculationDetailsType createMethod1BasisCalculationDetailsType() {
        return new Method1BasisCalculationDetailsType();
    }

    /**
     * Create an instance of {@link Method1DeductionDetailsType }
     * 
     */
    public Method1DeductionDetailsType createMethod1DeductionDetailsType() {
        return new Method1DeductionDetailsType();
    }

    /**
     * Create an instance of {@link NSDetailsType }
     * 
     */
    public NSDetailsType createNSDetailsType() {
        return new NSDetailsType();
    }

    /**
     * Create an instance of {@link NSDocumentsDetailsType }
     * 
     */
    public NSDocumentsDetailsType createNSDocumentsDetailsType() {
        return new NSDocumentsDetailsType();
    }

    /**
     * Create an instance of {@link NSTransportMeansDetailsType }
     * 
     */
    public NSTransportMeansDetailsType createNSTransportMeansDetailsType() {
        return new NSTransportMeansDetailsType();
    }

    /**
     * Create an instance of {@link NegotiableInstrumentDetailsType }
     * 
     */
    public NegotiableInstrumentDetailsType createNegotiableInstrumentDetailsType() {
        return new NegotiableInstrumentDetailsType();
    }

    /**
     * Create an instance of {@link NeighboringCheckPointDetailsType }
     * 
     */
    public NeighboringCheckPointDetailsType createNeighboringCheckPointDetailsType() {
        return new NeighboringCheckPointDetailsType();
    }

    /**
     * Create an instance of {@link ReasonDocDetailsType }
     * 
     */
    public ReasonDocDetailsType createReasonDocDetailsType() {
        return new ReasonDocDetailsType();
    }

    /**
     * Create an instance of {@link OperatorDetailsType }
     * 
     */
    public OperatorDetailsType createOperatorDetailsType() {
        return new OperatorDetailsType();
    }

    /**
     * Create an instance of {@link PDCorrectionDetailsType }
     * 
     */
    public PDCorrectionDetailsType createPDCorrectionDetailsType() {
        return new PDCorrectionDetailsType();
    }

    /**
     * Create an instance of {@link PDCustomsDecisionDetailsType }
     * 
     */
    public PDCustomsDecisionDetailsType createPDCustomsDecisionDetailsType() {
        return new PDCustomsDecisionDetailsType();
    }

    /**
     * Create an instance of {@link PDDecisionDetailsType }
     * 
     */
    public PDDecisionDetailsType createPDDecisionDetailsType() {
        return new PDDecisionDetailsType();
    }

    /**
     * Create an instance of {@link PDDeclarantDetailsType }
     * 
     */
    public PDDeclarantDetailsType createPDDeclarantDetailsType() {
        return new PDDeclarantDetailsType();
    }

    /**
     * Create an instance of {@link PDDeclaredGoodsCategoryDetailsType }
     * 
     */
    public PDDeclaredGoodsCategoryDetailsType createPDDeclaredGoodsCategoryDetailsType() {
        return new PDDeclaredGoodsCategoryDetailsType();
    }

    /**
     * Create an instance of {@link PDExchGoodsShipmentDetailsType }
     * 
     */
    public PDExchGoodsShipmentDetailsType createPDExchGoodsShipmentDetailsType() {
        return new PDExchGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link PDGoodsDetailsType }
     * 
     */
    public PDGoodsDetailsType createPDGoodsDetailsType() {
        return new PDGoodsDetailsType();
    }

    /**
     * Create an instance of {@link PDGoodsItemDetailsType }
     * 
     */
    public PDGoodsItemDetailsType createPDGoodsItemDetailsType() {
        return new PDGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link PDGoodsListDetailsType }
     * 
     */
    public PDGoodsListDetailsType createPDGoodsListDetailsType() {
        return new PDGoodsListDetailsType();
    }

    /**
     * Create an instance of {@link PDGoodsShipmentDetailsType }
     * 
     */
    public PDGoodsShipmentDetailsType createPDGoodsShipmentDetailsType() {
        return new PDGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link PDMarkDetailsType }
     * 
     */
    public PDMarkDetailsType createPDMarkDetailsType() {
        return new PDMarkDetailsType();
    }

    /**
     * Create an instance of {@link PDMoneyDetailsType }
     * 
     */
    public PDMoneyDetailsType createPDMoneyDetailsType() {
        return new PDMoneyDetailsType();
    }

    /**
     * Create an instance of {@link PDMoneyOwnerDetailsType }
     * 
     */
    public PDMoneyOwnerDetailsType createPDMoneyOwnerDetailsType() {
        return new PDMoneyOwnerDetailsType();
    }

    /**
     * Create an instance of {@link PDMoneySourceDetailsType }
     * 
     */
    public PDMoneySourceDetailsType createPDMoneySourceDetailsType() {
        return new PDMoneySourceDetailsType();
    }

    /**
     * Create an instance of {@link PDMoneyTransportationDetailsType }
     * 
     */
    public PDMoneyTransportationDetailsType createPDMoneyTransportationDetailsType() {
        return new PDMoneyTransportationDetailsType();
    }

    /**
     * Create an instance of {@link PDMoneyUsageDetailsType }
     * 
     */
    public PDMoneyUsageDetailsType createPDMoneyUsageDetailsType() {
        return new PDMoneyUsageDetailsType();
    }

    /**
     * Create an instance of {@link PDSharePartItemDetailsType }
     * 
     */
    public PDSharePartItemDetailsType createPDSharePartItemDetailsType() {
        return new PDSharePartItemDetailsType();
    }

    /**
     * Create an instance of {@link PDTransitMarkDetailsType }
     * 
     */
    public PDTransitMarkDetailsType createPDTransitMarkDetailsType() {
        return new PDTransitMarkDetailsType();
    }

    /**
     * Create an instance of {@link PDTransportMeansDetailsType }
     * 
     */
    public PDTransportMeansDetailsType createPDTransportMeansDetailsType() {
        return new PDTransportMeansDetailsType();
    }

    /**
     * Create an instance of {@link PDTransportMeansIdDetailsType }
     * 
     */
    public PDTransportMeansIdDetailsType createPDTransportMeansIdDetailsType() {
        return new PDTransportMeansIdDetailsType();
    }

    /**
     * Create an instance of {@link PDTransportMeansItemDetailsType }
     * 
     */
    public PDTransportMeansItemDetailsType createPDTransportMeansItemDetailsType() {
        return new PDTransportMeansItemDetailsType();
    }

    /**
     * Create an instance of {@link PGCGoodsItemDetailsType }
     * 
     */
    public PGCGoodsItemDetailsType createPGCGoodsItemDetailsType() {
        return new PGCGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link PGCGoodsItemGuaranteeDetailsType }
     * 
     */
    public PGCGoodsItemGuaranteeDetailsType createPGCGoodsItemGuaranteeDetailsType() {
        return new PGCGoodsItemGuaranteeDetailsType();
    }

    /**
     * Create an instance of {@link PGCGoodsShipmentDetailsType }
     * 
     */
    public PGCGoodsShipmentDetailsType createPGCGoodsShipmentDetailsType() {
        return new PGCGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link PGCGuaranteeAmountDetailsType }
     * 
     */
    public PGCGuaranteeAmountDetailsType createPGCGuaranteeAmountDetailsType() {
        return new PGCGuaranteeAmountDetailsType();
    }

    /**
     * Create an instance of {@link PGCGuaranteeDetailsType }
     * 
     */
    public PGCGuaranteeDetailsType createPGCGuaranteeDetailsType() {
        return new PGCGuaranteeDetailsType();
    }

    /**
     * Create an instance of {@link SimplePresentedDocDetailsType }
     * 
     */
    public SimplePresentedDocDetailsType createSimplePresentedDocDetailsType() {
        return new SimplePresentedDocDetailsType();
    }

    /**
     * Create an instance of {@link PIARBorderTransportDetailsType }
     * 
     */
    public PIARBorderTransportDetailsType createPIARBorderTransportDetailsType() {
        return new PIARBorderTransportDetailsType();
    }

    /**
     * Create an instance of {@link PIARConsignmentDetailsType }
     * 
     */
    public PIARConsignmentDetailsType createPIARConsignmentDetailsType() {
        return new PIARConsignmentDetailsType();
    }

    /**
     * Create an instance of {@link PIARConsignmentItemDetailsType }
     * 
     */
    public PIARConsignmentItemDetailsType createPIARConsignmentItemDetailsType() {
        return new PIARConsignmentItemDetailsType();
    }

    /**
     * Create an instance of {@link PIPersonOnBoardMainDetailsType }
     * 
     */
    public PIPersonOnBoardMainDetailsType createPIPersonOnBoardMainDetailsType() {
        return new PIPersonOnBoardMainDetailsType();
    }

    /**
     * Create an instance of {@link PIARDiseasedPersonDetailsType }
     * 
     */
    public PIARDiseasedPersonDetailsType createPIARDiseasedPersonDetailsType() {
        return new PIARDiseasedPersonDetailsType();
    }

    /**
     * Create an instance of {@link PIARDisinfestationDetailsType }
     * 
     */
    public PIARDisinfestationDetailsType createPIARDisinfestationDetailsType() {
        return new PIARDisinfestationDetailsType();
    }

    /**
     * Create an instance of {@link PIAREntryCheckPointDetailsType }
     * 
     */
    public PIAREntryCheckPointDetailsType createPIAREntryCheckPointDetailsType() {
        return new PIAREntryCheckPointDetailsType();
    }

    /**
     * Create an instance of {@link PIAREpidemicControlDetailsType }
     * 
     */
    public PIAREpidemicControlDetailsType createPIAREpidemicControlDetailsType() {
        return new PIAREpidemicControlDetailsType();
    }

    /**
     * Create an instance of {@link PIARPestControlDetailsType }
     * 
     */
    public PIARPestControlDetailsType createPIARPestControlDetailsType() {
        return new PIARPestControlDetailsType();
    }

    /**
     * Create an instance of {@link PIATBorderTransportDetailsType }
     * 
     */
    public PIATBorderTransportDetailsType createPIATBorderTransportDetailsType() {
        return new PIATBorderTransportDetailsType();
    }

    /**
     * Create an instance of {@link PICarrierDetailsType }
     * 
     */
    public PICarrierDetailsType createPICarrierDetailsType() {
        return new PICarrierDetailsType();
    }

    /**
     * Create an instance of {@link PIATSubjectDetailsType }
     * 
     */
    public PIATSubjectDetailsType createPIATSubjectDetailsType() {
        return new PIATSubjectDetailsType();
    }

    /**
     * Create an instance of {@link PIATConsignmentDetailsType }
     * 
     */
    public PIATConsignmentDetailsType createPIATConsignmentDetailsType() {
        return new PIATConsignmentDetailsType();
    }

    /**
     * Create an instance of {@link PIATConsignmentItemDetailsType }
     * 
     */
    public PIATConsignmentItemDetailsType createPIATConsignmentItemDetailsType() {
        return new PIATConsignmentItemDetailsType();
    }

    /**
     * Create an instance of {@link PIATEntryCheckPointDetailsType }
     * 
     */
    public PIATEntryCheckPointDetailsType createPIATEntryCheckPointDetailsType() {
        return new PIATEntryCheckPointDetailsType();
    }

    /**
     * Create an instance of {@link PIATCargoLocationDetailsType }
     * 
     */
    public PIATCargoLocationDetailsType createPIATCargoLocationDetailsType() {
        return new PIATCargoLocationDetailsType();
    }

    /**
     * Create an instance of {@link PIATMainConsignmentDetailsType }
     * 
     */
    public PIATMainConsignmentDetailsType createPIATMainConsignmentDetailsType() {
        return new PIATMainConsignmentDetailsType();
    }

    /**
     * Create an instance of {@link PIATTransportDocumentDetailsType }
     * 
     */
    public PIATTransportDocumentDetailsType createPIATTransportDocumentDetailsType() {
        return new PIATTransportDocumentDetailsType();
    }

    /**
     * Create an instance of {@link PIATTransportMeansItemDetailsType }
     * 
     */
    public PIATTransportMeansItemDetailsType createPIATTransportMeansItemDetailsType() {
        return new PIATTransportMeansItemDetailsType();
    }

    /**
     * Create an instance of {@link PIContainerDetailsType }
     * 
     */
    public PIContainerDetailsType createPIContainerDetailsType() {
        return new PIContainerDetailsType();
    }

    /**
     * Create an instance of {@link PIDeclarantDetailsType }
     * 
     */
    public PIDeclarantDetailsType createPIDeclarantDetailsType() {
        return new PIDeclarantDetailsType();
    }

    /**
     * Create an instance of {@link PIPresentedDocDetailsType }
     * 
     */
    public PIPresentedDocDetailsType createPIPresentedDocDetailsType() {
        return new PIPresentedDocDetailsType();
    }

    /**
     * Create an instance of {@link PIARRoutePointDetailsType }
     * 
     */
    public PIARRoutePointDetailsType createPIARRoutePointDetailsType() {
        return new PIARRoutePointDetailsType();
    }

    /**
     * Create an instance of {@link PIShipmentLocationDetailsType }
     * 
     */
    public PIShipmentLocationDetailsType createPIShipmentLocationDetailsType() {
        return new PIShipmentLocationDetailsType();
    }

    /**
     * Create an instance of {@link PITranshipmentDetailsType }
     * 
     */
    public PITranshipmentDetailsType createPITranshipmentDetailsType() {
        return new PITranshipmentDetailsType();
    }

    /**
     * Create an instance of {@link PITransitDeclarantDetailsType }
     * 
     */
    public PITransitDeclarantDetailsType createPITransitDeclarantDetailsType() {
        return new PITransitDeclarantDetailsType();
    }

    /**
     * Create an instance of {@link PITransitTransportMeansDetailsType }
     * 
     */
    public PITransitTransportMeansDetailsType createPITransitTransportMeansDetailsType() {
        return new PITransitTransportMeansDetailsType();
    }

    /**
     * Create an instance of {@link PIVBorderTransportDetailsType }
     * 
     */
    public PIVBorderTransportDetailsType createPIVBorderTransportDetailsType() {
        return new PIVBorderTransportDetailsType();
    }

    /**
     * Create an instance of {@link PIVCargoPackagePalletDetailsType }
     * 
     */
    public PIVCargoPackagePalletDetailsType createPIVCargoPackagePalletDetailsType() {
        return new PIVCargoPackagePalletDetailsType();
    }

    /**
     * Create an instance of {@link PIVConsignmentDetailsType }
     * 
     */
    public PIVConsignmentDetailsType createPIVConsignmentDetailsType() {
        return new PIVConsignmentDetailsType();
    }

    /**
     * Create an instance of {@link PIVConsignmentItemDetailsType }
     * 
     */
    public PIVConsignmentItemDetailsType createPIVConsignmentItemDetailsType() {
        return new PIVConsignmentItemDetailsType();
    }

    /**
     * Create an instance of {@link PIVCrewMemberDetailsType }
     * 
     */
    public PIVCrewMemberDetailsType createPIVCrewMemberDetailsType() {
        return new PIVCrewMemberDetailsType();
    }

    /**
     * Create an instance of {@link PIVDiseasedPersonDetailsType }
     * 
     */
    public PIVDiseasedPersonDetailsType createPIVDiseasedPersonDetailsType() {
        return new PIVDiseasedPersonDetailsType();
    }

    /**
     * Create an instance of {@link PIVEntryCheckPointDetailsType }
     * 
     */
    public PIVEntryCheckPointDetailsType createPIVEntryCheckPointDetailsType() {
        return new PIVEntryCheckPointDetailsType();
    }

    /**
     * Create an instance of {@link PIVEpidemicControlDetailsType }
     * 
     */
    public PIVEpidemicControlDetailsType createPIVEpidemicControlDetailsType() {
        return new PIVEpidemicControlDetailsType();
    }

    /**
     * Create an instance of {@link PIVRoutePointDetailsType }
     * 
     */
    public PIVRoutePointDetailsType createPIVRoutePointDetailsType() {
        return new PIVRoutePointDetailsType();
    }

    /**
     * Create an instance of {@link PIVPersonOnBoardDetailsType }
     * 
     */
    public PIVPersonOnBoardDetailsType createPIVPersonOnBoardDetailsType() {
        return new PIVPersonOnBoardDetailsType();
    }

    /**
     * Create an instance of {@link PIVPassengerDetailsType }
     * 
     */
    public PIVPassengerDetailsType createPIVPassengerDetailsType() {
        return new PIVPassengerDetailsType();
    }

    /**
     * Create an instance of {@link PIWBorderTransportDetailsType }
     * 
     */
    public PIWBorderTransportDetailsType createPIWBorderTransportDetailsType() {
        return new PIWBorderTransportDetailsType();
    }

    /**
     * Create an instance of {@link PIWConsignmentDetailsType }
     * 
     */
    public PIWConsignmentDetailsType createPIWConsignmentDetailsType() {
        return new PIWConsignmentDetailsType();
    }

    /**
     * Create an instance of {@link PIWConsignmentItemDetailsType }
     * 
     */
    public PIWConsignmentItemDetailsType createPIWConsignmentItemDetailsType() {
        return new PIWConsignmentItemDetailsType();
    }

    /**
     * Create an instance of {@link PIWEntryCheckPointDetailsType }
     * 
     */
    public PIWEntryCheckPointDetailsType createPIWEntryCheckPointDetailsType() {
        return new PIWEntryCheckPointDetailsType();
    }

    /**
     * Create an instance of {@link PIWCargoLocationDetailsType }
     * 
     */
    public PIWCargoLocationDetailsType createPIWCargoLocationDetailsType() {
        return new PIWCargoLocationDetailsType();
    }

    /**
     * Create an instance of {@link PIWStoreDetailsType }
     * 
     */
    public PIWStoreDetailsType createPIWStoreDetailsType() {
        return new PIWStoreDetailsType();
    }

    /**
     * Create an instance of {@link PIWTransportMeansDetailsType }
     * 
     */
    public PIWTransportMeansDetailsType createPIWTransportMeansDetailsType() {
        return new PIWTransportMeansDetailsType();
    }

    /**
     * Create an instance of {@link PackagePalletDetailsType }
     * 
     */
    public PackagePalletDetailsType createPackagePalletDetailsType() {
        return new PackagePalletDetailsType();
    }

    /**
     * Create an instance of {@link PassengerDeclarationIdDetailsType }
     * 
     */
    public PassengerDeclarationIdDetailsType createPassengerDeclarationIdDetailsType() {
        return new PassengerDeclarationIdDetailsType();
    }

    /**
     * Create an instance of {@link PaymentCalculationEventDetailsType }
     * 
     */
    public PaymentCalculationEventDetailsType createPaymentCalculationEventDetailsType() {
        return new PaymentCalculationEventDetailsType();
    }

    /**
     * Create an instance of {@link PaymentDocDetailsType }
     * 
     */
    public PaymentDocDetailsType createPaymentDocDetailsType() {
        return new PaymentDocDetailsType();
    }

    /**
     * Create an instance of {@link PaymentDutyTerminationDetailsType }
     * 
     */
    public PaymentDutyTerminationDetailsType createPaymentDutyTerminationDetailsType() {
        return new PaymentDutyTerminationDetailsType();
    }

    /**
     * Create an instance of {@link PaymentGuaranteeDetailsType }
     * 
     */
    public PaymentGuaranteeDetailsType createPaymentGuaranteeDetailsType() {
        return new PaymentGuaranteeDetailsType();
    }

    /**
     * Create an instance of {@link PaymentSheduleDetailsType }
     * 
     */
    public PaymentSheduleDetailsType createPaymentSheduleDetailsType() {
        return new PaymentSheduleDetailsType();
    }

    /**
     * Create an instance of {@link PeriodDateDetailsType }
     * 
     */
    public PeriodDateDetailsType createPeriodDateDetailsType() {
        return new PeriodDateDetailsType();
    }

    /**
     * Create an instance of {@link PeriodicPaymentsDetailsType }
     * 
     */
    public PeriodicPaymentsDetailsType createPeriodicPaymentsDetailsType() {
        return new PeriodicPaymentsDetailsType();
    }

    /**
     * Create an instance of {@link PermitGuaranteeDetailsType }
     * 
     */
    public PermitGuaranteeDetailsType createPermitGuaranteeDetailsType() {
        return new PermitGuaranteeDetailsType();
    }

    /**
     * Create an instance of {@link PersonalGoodsItemDetailsType }
     * 
     */
    public PersonalGoodsItemDetailsType createPersonalGoodsItemDetailsType() {
        return new PersonalGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link PestControlDetailsType }
     * 
     */
    public PestControlDetailsType createPestControlDetailsType() {
        return new PestControlDetailsType();
    }

    /**
     * Create an instance of {@link PipelineDetailsType }
     * 
     */
    public PipelineDetailsType createPipelineDetailsType() {
        return new PipelineDetailsType();
    }

    /**
     * Create an instance of {@link PowerOfAttorneyDetailsType }
     * 
     */
    public PowerOfAttorneyDetailsType createPowerOfAttorneyDetailsType() {
        return new PowerOfAttorneyDetailsType();
    }

    /**
     * Create an instance of {@link PreDecisionBaseDetailsType }
     * 
     */
    public PreDecisionBaseDetailsType createPreDecisionBaseDetailsType() {
        return new PreDecisionBaseDetailsType();
    }

    /**
     * Create an instance of {@link PreDecisionGoodsDetailsType }
     * 
     */
    public PreDecisionGoodsDetailsType createPreDecisionGoodsDetailsType() {
        return new PreDecisionGoodsDetailsType();
    }

    /**
     * Create an instance of {@link PreDecisionIdDetailsType }
     * 
     */
    public PreDecisionIdDetailsType createPreDecisionIdDetailsType() {
        return new PreDecisionIdDetailsType();
    }

    /**
     * Create an instance of {@link PreDecisionJustificationDetailsType }
     * 
     */
    public PreDecisionJustificationDetailsType createPreDecisionJustificationDetailsType() {
        return new PreDecisionJustificationDetailsType();
    }

    /**
     * Create an instance of {@link PrecedingDocDetailsType }
     * 
     */
    public PrecedingDocDetailsType createPrecedingDocDetailsType() {
        return new PrecedingDocDetailsType();
    }

    /**
     * Create an instance of {@link PrecedingDocIdDetailsType }
     * 
     */
    public PrecedingDocIdDetailsType createPrecedingDocIdDetailsType() {
        return new PrecedingDocIdDetailsType();
    }

    /**
     * Create an instance of {@link PrecedingGoodsDetaisType }
     * 
     */
    public PrecedingGoodsDetaisType createPrecedingGoodsDetaisType() {
        return new PrecedingGoodsDetaisType();
    }

    /**
     * Create an instance of {@link PreferenceDetailsType }
     * 
     */
    public PreferenceDetailsType createPreferenceDetailsType() {
        return new PreferenceDetailsType();
    }

    /**
     * Create an instance of {@link PreliminaryInformationIdDetailsType }
     * 
     */
    public PreliminaryInformationIdDetailsType createPreliminaryInformationIdDetailsType() {
        return new PreliminaryInformationIdDetailsType();
    }

    /**
     * Create an instance of {@link PresentedDocDetailsType }
     * 
     */
    public PresentedDocDetailsType createPresentedDocDetailsType() {
        return new PresentedDocDetailsType();
    }

    /**
     * Create an instance of {@link ProcessingProductDetailsType }
     * 
     */
    public ProcessingProductDetailsType createProcessingProductDetailsType() {
        return new ProcessingProductDetailsType();
    }

    /**
     * Create an instance of {@link ProcessingDescriptionDetailsType }
     * 
     */
    public ProcessingDescriptionDetailsType createProcessingDescriptionDetailsType() {
        return new ProcessingDescriptionDetailsType();
    }

    /**
     * Create an instance of {@link ProcessingOperationDetailsType }
     * 
     */
    public ProcessingOperationDetailsType createProcessingOperationDetailsType() {
        return new ProcessingOperationDetailsType();
    }

    /**
     * Create an instance of {@link ProcessingPlaceDetailsType }
     * 
     */
    public ProcessingPlaceDetailsType createProcessingPlaceDetailsType() {
        return new ProcessingPlaceDetailsType();
    }

    /**
     * Create an instance of {@link AmountQuotaDetailsType }
     * 
     */
    public AmountQuotaDetailsType createAmountQuotaDetailsType() {
        return new AmountQuotaDetailsType();
    }

    /**
     * Create an instance of {@link QuotaDetailsType }
     * 
     */
    public QuotaDetailsType createQuotaDetailsType() {
        return new QuotaDetailsType();
    }

    /**
     * Create an instance of {@link RailwayStampDetailsType }
     * 
     */
    public RailwayStampDetailsType createRailwayStampDetailsType() {
        return new RailwayStampDetailsType();
    }

    /**
     * Create an instance of {@link RecoveredDutyDetailsType }
     * 
     */
    public RecoveredDutyDetailsType createRecoveredDutyDetailsType() {
        return new RecoveredDutyDetailsType();
    }

    /**
     * Create an instance of {@link RefLicenseIdDetailsType }
     * 
     */
    public RefLicenseIdDetailsType createRefLicenseIdDetailsType() {
        return new RefLicenseIdDetailsType();
    }

    /**
     * Create an instance of {@link OrdinalRangeDetailsType }
     * 
     */
    public OrdinalRangeDetailsType createOrdinalRangeDetailsType() {
        return new OrdinalRangeDetailsType();
    }

    /**
     * Create an instance of {@link ReferenceTDConsignmentDetailsType }
     * 
     */
    public ReferenceTDConsignmentDetailsType createReferenceTDConsignmentDetailsType() {
        return new ReferenceTDConsignmentDetailsType();
    }

    /**
     * Create an instance of {@link RegisterAEODetailsType }
     * 
     */
    public RegisterAEODetailsType createRegisterAEODetailsType() {
        return new RegisterAEODetailsType();
    }

    /**
     * Create an instance of {@link RegisterCustomsBrokerDetailsType }
     * 
     */
    public RegisterCustomsBrokerDetailsType createRegisterCustomsBrokerDetailsType() {
        return new RegisterCustomsBrokerDetailsType();
    }

    /**
     * Create an instance of {@link RegisterCustomsCarrierDetailsType }
     * 
     */
    public RegisterCustomsCarrierDetailsType createRegisterCustomsCarrierDetailsType() {
        return new RegisterCustomsCarrierDetailsType();
    }

    /**
     * Create an instance of {@link RegisterCustomsWarehouseDetailsType }
     * 
     */
    public RegisterCustomsWarehouseDetailsType createRegisterCustomsWarehouseDetailsType() {
        return new RegisterCustomsWarehouseDetailsType();
    }

    /**
     * Create an instance of {@link RegisterDocumentDetailsType }
     * 
     */
    public RegisterDocumentDetailsType createRegisterDocumentDetailsType() {
        return new RegisterDocumentDetailsType();
    }

    /**
     * Create an instance of {@link RegisterDocumentIdDetailsType }
     * 
     */
    public RegisterDocumentIdDetailsType createRegisterDocumentIdDetailsType() {
        return new RegisterDocumentIdDetailsType();
    }

    /**
     * Create an instance of {@link RegisterFreeWarehouseDetailsType }
     * 
     */
    public RegisterFreeWarehouseDetailsType createRegisterFreeWarehouseDetailsType() {
        return new RegisterFreeWarehouseDetailsType();
    }

    /**
     * Create an instance of {@link RegisterPreDecisionDetailsType }
     * 
     */
    public RegisterPreDecisionDetailsType createRegisterPreDecisionDetailsType() {
        return new RegisterPreDecisionDetailsType();
    }

    /**
     * Create an instance of {@link RegisterStampDetailsType }
     * 
     */
    public RegisterStampDetailsType createRegisterStampDetailsType() {
        return new RegisterStampDetailsType();
    }

    /**
     * Create an instance of {@link RegisterTSWDetailsType }
     * 
     */
    public RegisterTSWDetailsType createRegisterTSWDetailsType() {
        return new RegisterTSWDetailsType();
    }

    /**
     * Create an instance of {@link RegistryClassificationDecisionDetailsType }
     * 
     */
    public RegistryClassificationDecisionDetailsType createRegistryClassificationDecisionDetailsType() {
        return new RegistryClassificationDecisionDetailsType();
    }

    /**
     * Create an instance of {@link ReleaseIdDetailsType }
     * 
     */
    public ReleaseIdDetailsType createReleaseIdDetailsType() {
        return new ReleaseIdDetailsType();
    }

    /**
     * Create an instance of {@link OperationPlaceDetailsType }
     * 
     */
    public OperationPlaceDetailsType createOperationPlaceDetailsType() {
        return new OperationPlaceDetailsType();
    }

    /**
     * Create an instance of {@link SEZOrganizationDetailsType }
     * 
     */
    public SEZOrganizationDetailsType createSEZOrganizationDetailsType() {
        return new SEZOrganizationDetailsType();
    }

    /**
     * Create an instance of {@link SanitaryControlDocDetailsType }
     * 
     */
    public SanitaryControlDocDetailsType createSanitaryControlDocDetailsType() {
        return new SanitaryControlDocDetailsType();
    }

    /**
     * Create an instance of {@link SanitaryMeasureDetailsType }
     * 
     */
    public SanitaryMeasureDetailsType createSanitaryMeasureDetailsType() {
        return new SanitaryMeasureDetailsType();
    }

    /**
     * Create an instance of {@link SanitaryMeasureLocationDetailsType }
     * 
     */
    public SanitaryMeasureLocationDetailsType createSanitaryMeasureLocationDetailsType() {
        return new SanitaryMeasureLocationDetailsType();
    }

    /**
     * Create an instance of {@link SealDetailsType }
     * 
     */
    public SealDetailsType createSealDetailsType() {
        return new SealDetailsType();
    }

    /**
     * Create an instance of {@link SignatoryPersonDetailsType }
     * 
     */
    public SignatoryPersonDetailsType createSignatoryPersonDetailsType() {
        return new SignatoryPersonDetailsType();
    }

    /**
     * Create an instance of {@link SignatoryPersonIdentityDetailsType }
     * 
     */
    public SignatoryPersonIdentityDetailsType createSignatoryPersonIdentityDetailsType() {
        return new SignatoryPersonIdentityDetailsType();
    }

    /**
     * Create an instance of {@link SigningDetailsType }
     * 
     */
    public SigningDetailsType createSigningDetailsType() {
        return new SigningDetailsType();
    }

    /**
     * Create an instance of {@link SparePartsItemDetailsType }
     * 
     */
    public SparePartsItemDetailsType createSparePartsItemDetailsType() {
        return new SparePartsItemDetailsType();
    }

    /**
     * Create an instance of {@link SpecialRoomDetailsType }
     * 
     */
    public SpecialRoomDetailsType createSpecialRoomDetailsType() {
        return new SpecialRoomDetailsType();
    }

    /**
     * Create an instance of {@link StampInfoDetailsType }
     * 
     */
    public StampInfoDetailsType createStampInfoDetailsType() {
        return new StampInfoDetailsType();
    }

    /**
     * Create an instance of {@link StorageRequirementDetailsType }
     * 
     */
    public StorageRequirementDetailsType createStorageRequirementDetailsType() {
        return new StorageRequirementDetailsType();
    }

    /**
     * Create an instance of {@link StoreItemDetailsType }
     * 
     */
    public StoreItemDetailsType createStoreItemDetailsType() {
        return new StoreItemDetailsType();
    }

    /**
     * Create an instance of {@link SuretyDetailsType }
     * 
     */
    public SuretyDetailsType createSuretyDetailsType() {
        return new SuretyDetailsType();
    }

    /**
     * Create an instance of {@link TDCADocDetailsType }
     * 
     */
    public TDCADocDetailsType createTDCADocDetailsType() {
        return new TDCADocDetailsType();
    }

    /**
     * Create an instance of {@link TDCloseCargoDetailsType }
     * 
     */
    public TDCloseCargoDetailsType createTDCloseCargoDetailsType() {
        return new TDCloseCargoDetailsType();
    }

    /**
     * Create an instance of {@link TDCloseHeaderDetailsType }
     * 
     */
    public TDCloseHeaderDetailsType createTDCloseHeaderDetailsType() {
        return new TDCloseHeaderDetailsType();
    }

    /**
     * Create an instance of {@link TDCloseOperationCustomsMarkDetailsType }
     * 
     */
    public TDCloseOperationCustomsMarkDetailsType createTDCloseOperationCustomsMarkDetailsType() {
        return new TDCloseOperationCustomsMarkDetailsType();
    }

    /**
     * Create an instance of {@link TDCloseOperationDetailsType }
     * 
     */
    public TDCloseOperationDetailsType createTDCloseOperationDetailsType() {
        return new TDCloseOperationDetailsType();
    }

    /**
     * Create an instance of {@link TDConsignmentCloseDetailsType }
     * 
     */
    public TDConsignmentCloseDetailsType createTDConsignmentCloseDetailsType() {
        return new TDConsignmentCloseDetailsType();
    }

    /**
     * Create an instance of {@link TDConsignmentDetailsType }
     * 
     */
    public TDConsignmentDetailsType createTDConsignmentDetailsType() {
        return new TDConsignmentDetailsType();
    }

    /**
     * Create an instance of {@link TDGoodsItemInfoDetailsType }
     * 
     */
    public TDGoodsItemInfoDetailsType createTDGoodsItemInfoDetailsType() {
        return new TDGoodsItemInfoDetailsType();
    }

    /**
     * Create an instance of {@link TDEmergencyCargoDetailsType }
     * 
     */
    public TDEmergencyCargoDetailsType createTDEmergencyCargoDetailsType() {
        return new TDEmergencyCargoDetailsType();
    }

    /**
     * Create an instance of {@link TDEmergencyOperationDetailsType }
     * 
     */
    public TDEmergencyOperationDetailsType createTDEmergencyOperationDetailsType() {
        return new TDEmergencyOperationDetailsType();
    }

    /**
     * Create an instance of {@link TDExchGoodsItemDetailsType }
     * 
     */
    public TDExchGoodsItemDetailsType createTDExchGoodsItemDetailsType() {
        return new TDExchGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link TDExchGoodsShipmentDetailsType }
     * 
     */
    public TDExchGoodsShipmentDetailsType createTDExchGoodsShipmentDetailsType() {
        return new TDExchGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link TDGoodsItemDetailsType }
     * 
     */
    public TDGoodsItemDetailsType createTDGoodsItemDetailsType() {
        return new TDGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link TDGoodsShipmentDetailsType }
     * 
     */
    public TDGoodsShipmentDetailsType createTDGoodsShipmentDetailsType() {
        return new TDGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link TDGuaranteeDetailsType }
     * 
     */
    public TDGuaranteeDetailsType createTDGuaranteeDetailsType() {
        return new TDGuaranteeDetailsType();
    }

    /**
     * Create an instance of {@link TDHeaderDetailsType }
     * 
     */
    public TDHeaderDetailsType createTDHeaderDetailsType() {
        return new TDHeaderDetailsType();
    }

    /**
     * Create an instance of {@link TDInspectionDocDetailsType }
     * 
     */
    public TDInspectionDocDetailsType createTDInspectionDocDetailsType() {
        return new TDInspectionDocDetailsType();
    }

    /**
     * Create an instance of {@link TDInternationalMailDetailsType }
     * 
     */
    public TDInternationalMailDetailsType createTDInternationalMailDetailsType() {
        return new TDInternationalMailDetailsType();
    }

    /**
     * Create an instance of {@link TDMovementOperationDetailsType }
     * 
     */
    public TDMovementOperationDetailsType createTDMovementOperationDetailsType() {
        return new TDMovementOperationDetailsType();
    }

    /**
     * Create an instance of {@link TDOperationInfoDetailsType }
     * 
     */
    public TDOperationInfoDetailsType createTDOperationInfoDetailsType() {
        return new TDOperationInfoDetailsType();
    }

    /**
     * Create an instance of {@link TDPackageDetailsType }
     * 
     */
    public TDPackageDetailsType createTDPackageDetailsType() {
        return new TDPackageDetailsType();
    }

    /**
     * Create an instance of {@link TDPrecedingDocDetailsType }
     * 
     */
    public TDPrecedingDocDetailsType createTDPrecedingDocDetailsType() {
        return new TDPrecedingDocDetailsType();
    }

    /**
     * Create an instance of {@link TDPresentedDocDetailsType }
     * 
     */
    public TDPresentedDocDetailsType createTDPresentedDocDetailsType() {
        return new TDPresentedDocDetailsType();
    }

    /**
     * Create an instance of {@link TDDocDetailsType }
     * 
     */
    public TDDocDetailsType createTDDocDetailsType() {
        return new TDDocDetailsType();
    }

    /**
     * Create an instance of {@link TDReleaseCustomsMarkDetailsType }
     * 
     */
    public TDReleaseCustomsMarkDetailsType createTDReleaseCustomsMarkDetailsType() {
        return new TDReleaseCustomsMarkDetailsType();
    }

    /**
     * Create an instance of {@link TDReleaseDetailsType }
     * 
     */
    public TDReleaseDetailsType createTDReleaseDetailsType() {
        return new TDReleaseDetailsType();
    }

    /**
     * Create an instance of {@link TDRouteDetailsType }
     * 
     */
    public TDRouteDetailsType createTDRouteDetailsType() {
        return new TDRouteDetailsType();
    }

    /**
     * Create an instance of {@link TDRouteHeaderDetailsType }
     * 
     */
    public TDRouteHeaderDetailsType createTDRouteHeaderDetailsType() {
        return new TDRouteHeaderDetailsType();
    }

    /**
     * Create an instance of {@link TDSealDetailsType }
     * 
     */
    public TDSealDetailsType createTDSealDetailsType() {
        return new TDSealDetailsType();
    }

    /**
     * Create an instance of {@link TDTIRCarnetDetailsType }
     * 
     */
    public TDTIRCarnetDetailsType createTDTIRCarnetDetailsType() {
        return new TDTIRCarnetDetailsType();
    }

    /**
     * Create an instance of {@link TDTerminationCargoDetailsType }
     * 
     */
    public TDTerminationCargoDetailsType createTDTerminationCargoDetailsType() {
        return new TDTerminationCargoDetailsType();
    }

    /**
     * Create an instance of {@link TDTerminationOperationDetailsType }
     * 
     */
    public TDTerminationOperationDetailsType createTDTerminationOperationDetailsType() {
        return new TDTerminationOperationDetailsType();
    }

    /**
     * Create an instance of {@link TDTranshipmentOperationDetailsType }
     * 
     */
    public TDTranshipmentOperationDetailsType createTDTranshipmentOperationDetailsType() {
        return new TDTranshipmentOperationDetailsType();
    }

    /**
     * Create an instance of {@link TIECarrierDetailsType }
     * 
     */
    public TIECarrierDetailsType createTIECarrierDetailsType() {
        return new TIECarrierDetailsType();
    }

    /**
     * Create an instance of {@link TIECloseDetailsType }
     * 
     */
    public TIECloseDetailsType createTIECloseDetailsType() {
        return new TIECloseDetailsType();
    }

    /**
     * Create an instance of {@link TIEDetailsType }
     * 
     */
    public TIEDetailsType createTIEDetailsType() {
        return new TIEDetailsType();
    }

    /**
     * Create an instance of {@link TIEExtensionDetailsType }
     * 
     */
    public TIEExtensionDetailsType createTIEExtensionDetailsType() {
        return new TIEExtensionDetailsType();
    }

    /**
     * Create an instance of {@link TIEOperationsDetailsType }
     * 
     */
    public TIEOperationsDetailsType createTIEOperationsDetailsType() {
        return new TIEOperationsDetailsType();
    }

    /**
     * Create an instance of {@link TIEProcedureDetailsType }
     * 
     */
    public TIEProcedureDetailsType createTIEProcedureDetailsType() {
        return new TIEProcedureDetailsType();
    }

    /**
     * Create an instance of {@link TIERegistrationDetalsType }
     * 
     */
    public TIERegistrationDetalsType createTIERegistrationDetalsType() {
        return new TIERegistrationDetalsType();
    }

    /**
     * Create an instance of {@link TIERegistryItemDetailsType }
     * 
     */
    public TIERegistryItemDetailsType createTIERegistryItemDetailsType() {
        return new TIERegistryItemDetailsType();
    }

    /**
     * Create an instance of {@link TIERemovalInfoDetailsType }
     * 
     */
    public TIERemovalInfoDetailsType createTIERemovalInfoDetailsType() {
        return new TIERemovalInfoDetailsType();
    }

    /**
     * Create an instance of {@link TIRCarnetIdDetailsType }
     * 
     */
    public TIRCarnetIdDetailsType createTIRCarnetIdDetailsType() {
        return new TIRCarnetIdDetailsType();
    }

    /**
     * Create an instance of {@link TIRCarnetUnloadingLocationDetailsType }
     * 
     */
    public TIRCarnetUnloadingLocationDetailsType createTIRCarnetUnloadingLocationDetailsType() {
        return new TIRCarnetUnloadingLocationDetailsType();
    }

    /**
     * Create an instance of {@link TIRGoodsItemDetailsType }
     * 
     */
    public TIRGoodsItemDetailsType createTIRGoodsItemDetailsType() {
        return new TIRGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link TIRGoodsShipmentDetailsType }
     * 
     */
    public TIRGoodsShipmentDetailsType createTIRGoodsShipmentDetailsType() {
        return new TIRGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link TIRBaseIdDetailsType }
     * 
     */
    public TIRBaseIdDetailsType createTIRBaseIdDetailsType() {
        return new TIRBaseIdDetailsType();
    }

    /**
     * Create an instance of {@link IdTransportMeansDetailsType }
     * 
     */
    public IdTransportMeansDetailsType createIdTransportMeansDetailsType() {
        return new IdTransportMeansDetailsType();
    }

    /**
     * Create an instance of {@link TMPAAutomobileDetailsType }
     * 
     */
    public TMPAAutomobileDetailsType createTMPAAutomobileDetailsType() {
        return new TMPAAutomobileDetailsType();
    }

    /**
     * Create an instance of {@link TMPAGoodsItemDetailsType }
     * 
     */
    public TMPAGoodsItemDetailsType createTMPAGoodsItemDetailsType() {
        return new TMPAGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link TMPAGoodsShipmentDetailsType }
     * 
     */
    public TMPAGoodsShipmentDetailsType createTMPAGoodsShipmentDetailsType() {
        return new TMPAGoodsShipmentDetailsType();
    }

    /**
     * Create an instance of {@link TMPAPrecedingDocDetailsType }
     * 
     */
    public TMPAPrecedingDocDetailsType createTMPAPrecedingDocDetailsType() {
        return new TMPAPrecedingDocDetailsType();
    }

    /**
     * Create an instance of {@link TMPATransportMeansDetailsType }
     * 
     */
    public TMPATransportMeansDetailsType createTMPATransportMeansDetailsType() {
        return new TMPATransportMeansDetailsType();
    }

    /**
     * Create an instance of {@link TNVEDCodeDetailsType }
     * 
     */
    public TNVEDCodeDetailsType createTNVEDCodeDetailsType() {
        return new TNVEDCodeDetailsType();
    }

    /**
     * Create an instance of {@link TradeCountryDetailsType }
     * 
     */
    public TradeCountryDetailsType createTradeCountryDetailsType() {
        return new TradeCountryDetailsType();
    }

    /**
     * Create an instance of {@link TrailerDetailsType }
     * 
     */
    public TrailerDetailsType createTrailerDetailsType() {
        return new TrailerDetailsType();
    }

    /**
     * Create an instance of {@link TransactionNatureDetailsType }
     * 
     */
    public TransactionNatureDetailsType createTransactionNatureDetailsType() {
        return new TransactionNatureDetailsType();
    }

    /**
     * Create an instance of {@link TranshipmentDetailsType }
     * 
     */
    public TranshipmentDetailsType createTranshipmentDetailsType() {
        return new TranshipmentDetailsType();
    }

    /**
     * Create an instance of {@link TranshipmentTransportMeansDetailsType }
     * 
     */
    public TranshipmentTransportMeansDetailsType createTranshipmentTransportMeansDetailsType() {
        return new TranshipmentTransportMeansDetailsType();
    }

    /**
     * Create an instance of {@link TransitConsignmentDetailsType }
     * 
     */
    public TransitConsignmentDetailsType createTransitConsignmentDetailsType() {
        return new TransitConsignmentDetailsType();
    }

    /**
     * Create an instance of {@link TransitDestinationDetailsType }
     * 
     */
    public TransitDestinationDetailsType createTransitDestinationDetailsType() {
        return new TransitDestinationDetailsType();
    }

    /**
     * Create an instance of {@link TransitGoodsItemDetailsType }
     * 
     */
    public TransitGoodsItemDetailsType createTransitGoodsItemDetailsType() {
        return new TransitGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link TransitGuaranteeDetailsType }
     * 
     */
    public TransitGuaranteeDetailsType createTransitGuaranteeDetailsType() {
        return new TransitGuaranteeDetailsType();
    }

    /**
     * Create an instance of {@link TransitGuaranteeDocDetailsType }
     * 
     */
    public TransitGuaranteeDocDetailsType createTransitGuaranteeDocDetailsType() {
        return new TransitGuaranteeDocDetailsType();
    }

    /**
     * Create an instance of {@link TransitMarkDetailsType }
     * 
     */
    public TransitMarkDetailsType createTransitMarkDetailsType() {
        return new TransitMarkDetailsType();
    }

    /**
     * Create an instance of {@link TransitReservationDetailsType }
     * 
     */
    public TransitReservationDetailsType createTransitReservationDetailsType() {
        return new TransitReservationDetailsType();
    }

    /**
     * Create an instance of {@link TransitRoutePointDetailsType }
     * 
     */
    public TransitRoutePointDetailsType createTransitRoutePointDetailsType() {
        return new TransitRoutePointDetailsType();
    }

    /**
     * Create an instance of {@link TransportMeansItemDetailsType }
     * 
     */
    public TransportMeansItemDetailsType createTransportMeansItemDetailsType() {
        return new TransportMeansItemDetailsType();
    }

    /**
     * Create an instance of {@link TransportMeansRegistrationIdDetailsType }
     * 
     */
    public TransportMeansRegistrationIdDetailsType createTransportMeansRegistrationIdDetailsType() {
        return new TransportMeansRegistrationIdDetailsType();
    }

    /**
     * Create an instance of {@link UnloadWarehouseDetailsType }
     * 
     */
    public UnloadWarehouseDetailsType createUnloadWarehouseDetailsType() {
        return new UnloadWarehouseDetailsType();
    }

    /**
     * Create an instance of {@link VehicleEngineDetailsType }
     * 
     */
    public VehicleEngineDetailsType createVehicleEngineDetailsType() {
        return new VehicleEngineDetailsType();
    }

    /**
     * Create an instance of {@link VehicleMassDetailsType }
     * 
     */
    public VehicleMassDetailsType createVehicleMassDetailsType() {
        return new VehicleMassDetailsType();
    }

    /**
     * Create an instance of {@link VehicleModelDetailsType }
     * 
     */
    public VehicleModelDetailsType createVehicleModelDetailsType() {
        return new VehicleModelDetailsType();
    }

    /**
     * Create an instance of {@link VehiclePassportIdDetailsType }
     * 
     */
    public VehiclePassportIdDetailsType createVehiclePassportIdDetailsType() {
        return new VehiclePassportIdDetailsType();
    }

    /**
     * Create an instance of {@link VehiclePassportRegDetailsType }
     * 
     */
    public VehiclePassportRegDetailsType createVehiclePassportRegDetailsType() {
        return new VehiclePassportRegDetailsType();
    }

    /**
     * Create an instance of {@link VesselConstructionDetailsType }
     * 
     */
    public VesselConstructionDetailsType createVesselConstructionDetailsType() {
        return new VesselConstructionDetailsType();
    }

    /**
     * Create an instance of {@link VesselEngineDetailsType }
     * 
     */
    public VesselEngineDetailsType createVesselEngineDetailsType() {
        return new VesselEngineDetailsType();
    }

    /**
     * Create an instance of {@link VesselRegistrationDetailsType }
     * 
     */
    public VesselRegistrationDetailsType createVesselRegistrationDetailsType() {
        return new VesselRegistrationDetailsType();
    }

    /**
     * Create an instance of {@link VetReleaseOrganizationDetailsType }
     * 
     */
    public VetReleaseOrganizationDetailsType createVetReleaseOrganizationDetailsType() {
        return new VetReleaseOrganizationDetailsType();
    }

    /**
     * Create an instance of {@link VoyageDetailsType }
     * 
     */
    public VoyageDetailsType createVoyageDetailsType() {
        return new VoyageDetailsType();
    }

    /**
     * Create an instance of {@link WarehousingGoodsItemDetailsType }
     * 
     */
    public WarehousingGoodsItemDetailsType createWarehousingGoodsItemDetailsType() {
        return new WarehousingGoodsItemDetailsType();
    }

    /**
     * Create an instance of {@link WoodCodeDetailsType }
     * 
     */
    public WoodCodeDetailsType createWoodCodeDetailsType() {
        return new WoodCodeDetailsType();
    }

    /**
     * Create an instance of {@link WoodDescriptionDetailsType }
     * 
     */
    public WoodDescriptionDetailsType createWoodDescriptionDetailsType() {
        return new WoodDescriptionDetailsType();
    }

    /**
     * Create an instance of {@link WorkScheduleDetailsType }
     * 
     */
    public WorkScheduleDetailsType createWorkScheduleDetailsType() {
        return new WorkScheduleDetailsType();
    }

    /**
     * Create an instance of {@link WorkTimeDetailsType }
     * 
     */
    public WorkTimeDetailsType createWorkTimeDetailsType() {
        return new WorkTimeDetailsType();
    }

    /**
     * Create an instance of {@link WorkTimeHourDetailsType }
     * 
     */
    public WorkTimeHourDetailsType createWorkTimeHourDetailsType() {
        return new WorkTimeHourDetailsType();
    }

    /**
     * Create an instance of {@link ATDSamplesSelectionDocIdDetailsType }
     * 
     */
    public ATDSamplesSelectionDocIdDetailsType createATDSamplesSelectionDocIdDetailsType() {
        return new ATDSamplesSelectionDocIdDetailsType();
    }

    /**
     * Create an instance of {@link ArrivalDepartureAddressDetailsType }
     * 
     */
    public ArrivalDepartureAddressDetailsType createArrivalDepartureAddressDetailsType() {
        return new ArrivalDepartureAddressDetailsType();
    }

    /**
     * Create an instance of {@link CAAutoBaseDetailsType }
     * 
     */
    public CAAutoBaseDetailsType createCAAutoBaseDetailsType() {
        return new CAAutoBaseDetailsType();
    }

    /**
     * Create an instance of {@link CACRGoodsBaseDetailsType }
     * 
     */
    public CACRGoodsBaseDetailsType createCACRGoodsBaseDetailsType() {
        return new CACRGoodsBaseDetailsType();
    }

    /**
     * Create an instance of {@link CACommodityDescriptionBaseDetailsType }
     * 
     */
    public CACommodityDescriptionBaseDetailsType createCACommodityDescriptionBaseDetailsType() {
        return new CACommodityDescriptionBaseDetailsType();
    }

    /**
     * Create an instance of {@link CADTGoodsBaseDetailsType }
     * 
     */
    public CADTGoodsBaseDetailsType createCADTGoodsBaseDetailsType() {
        return new CADTGoodsBaseDetailsType();
    }

    /**
     * Create an instance of {@link CAGoodsBaseType }
     * 
     */
    public CAGoodsBaseType createCAGoodsBaseType() {
        return new CAGoodsBaseType();
    }

    /**
     * Create an instance of {@link CAOrganizationBaseType }
     * 
     */
    public CAOrganizationBaseType createCAOrganizationBaseType() {
        return new CAOrganizationBaseType();
    }

    /**
     * Create an instance of {@link CAPersonBaseDetailsV2Type }
     * 
     */
    public CAPersonBaseDetailsV2Type createCAPersonBaseDetailsV2Type() {
        return new CAPersonBaseDetailsV2Type();
    }

    /**
     * Create an instance of {@link CAPersonDetailsType }
     * 
     */
    public CAPersonDetailsType createCAPersonDetailsType() {
        return new CAPersonDetailsType();
    }

    /**
     * Create an instance of {@link CASubjectBaseDetailsV2Type }
     * 
     */
    public CASubjectBaseDetailsV2Type createCASubjectBaseDetailsV2Type() {
        return new CASubjectBaseDetailsV2Type();
    }

    /**
     * Create an instance of {@link CASubjectBranchDetailsType }
     * 
     */
    public CASubjectBranchDetailsType createCASubjectBranchDetailsType() {
        return new CASubjectBranchDetailsType();
    }

    /**
     * Create an instance of {@link CRPayerDetailsType }
     * 
     */
    public CRPayerDetailsType createCRPayerDetailsType() {
        return new CRPayerDetailsType();
    }

    /**
     * Create an instance of {@link ClassificationDecisionDetailsType }
     * 
     */
    public ClassificationDecisionDetailsType createClassificationDecisionDetailsType() {
        return new ClassificationDecisionDetailsType();
    }

    /**
     * Create an instance of {@link CustomsDocIdDetailsType }
     * 
     */
    public CustomsDocIdDetailsType createCustomsDocIdDetailsType() {
        return new CustomsDocIdDetailsType();
    }

    /**
     * Create an instance of {@link CustomsPaymentV2DetailsType }
     * 
     */
    public CustomsPaymentV2DetailsType createCustomsPaymentV2DetailsType() {
        return new CustomsPaymentV2DetailsType();
    }

    /**
     * Create an instance of {@link DTAutomobileDetailsV2Type }
     * 
     */
    public DTAutomobileDetailsV2Type createDTAutomobileDetailsV2Type() {
        return new DTAutomobileDetailsV2Type();
    }

    /**
     * Create an instance of {@link DTGoodsShipmentBaseType }
     * 
     */
    public DTGoodsShipmentBaseType createDTGoodsShipmentBaseType() {
        return new DTGoodsShipmentBaseType();
    }

    /**
     * Create an instance of {@link FactPaymentBaseDetailsType }
     * 
     */
    public FactPaymentBaseDetailsType createFactPaymentBaseDetailsType() {
        return new FactPaymentBaseDetailsType();
    }

    /**
     * Create an instance of {@link GoodsDecisionDetailsV2Type }
     * 
     */
    public GoodsDecisionDetailsV2Type createGoodsDecisionDetailsV2Type() {
        return new GoodsDecisionDetailsV2Type();
    }

    /**
     * Create an instance of {@link GoodsLocationDocDetailsType }
     * 
     */
    public GoodsLocationDocDetailsType createGoodsLocationDocDetailsType() {
        return new GoodsLocationDocDetailsType();
    }

    /**
     * Create an instance of {@link GoodsMeasureQuotaDetailsType }
     * 
     */
    public GoodsMeasureQuotaDetailsType createGoodsMeasureQuotaDetailsType() {
        return new GoodsMeasureQuotaDetailsType();
    }

    /**
     * Create an instance of {@link PIARPassengerDetailsType }
     * 
     */
    public PIARPassengerDetailsType createPIARPassengerDetailsType() {
        return new PIARPassengerDetailsType();
    }

    /**
     * Create an instance of {@link PIATCarrierDetailsType }
     * 
     */
    public PIATCarrierDetailsType createPIATCarrierDetailsType() {
        return new PIATCarrierDetailsType();
    }

    /**
     * Create an instance of {@link PresentedDocBaseDetailsType }
     * 
     */
    public PresentedDocBaseDetailsType createPresentedDocBaseDetailsType() {
        return new PresentedDocBaseDetailsType();
    }

    /**
     * Create an instance of {@link RegisterSEZResidentsDetailsType }
     * 
     */
    public RegisterSEZResidentsDetailsType createRegisterSEZResidentsDetailsType() {
        return new RegisterSEZResidentsDetailsType();
    }

    /**
     * Create an instance of {@link RepresentativeContractDetailsType }
     * 
     */
    public RepresentativeContractDetailsType createRepresentativeContractDetailsType() {
        return new RepresentativeContractDetailsType();
    }

    /**
     * Create an instance of {@link SparePartsDetailsType }
     * 
     */
    public SparePartsDetailsType createSparePartsDetailsType() {
        return new SparePartsDetailsType();
    }

    /**
     * Create an instance of {@link StoreDetailsType }
     * 
     */
    public StoreDetailsType createStoreDetailsType() {
        return new StoreDetailsType();
    }

    /**
     * Create an instance of {@link SubjectRepresentativeBaseDetailsType }
     * 
     */
    public SubjectRepresentativeBaseDetailsType createSubjectRepresentativeBaseDetailsType() {
        return new SubjectRepresentativeBaseDetailsType();
    }

    /**
     * Create an instance of {@link TDTransportMeansDetailsType }
     * 
     */
    public TDTransportMeansDetailsType createTDTransportMeansDetailsType() {
        return new TDTransportMeansDetailsType();
    }

    /**
     * Create an instance of {@link TMPAPresentedDocDetailsType }
     * 
     */
    public TMPAPresentedDocDetailsType createTMPAPresentedDocDetailsType() {
        return new TMPAPresentedDocDetailsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AEORegistryIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AEORegistryIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "AEORegistryIdDetails")
    public JAXBElement<AEORegistryIdDetailsType> createAEORegistryIdDetails(AEORegistryIdDetailsType value) {
        return new JAXBElement<AEORegistryIdDetailsType>(_AEORegistryIdDetails_QNAME, AEORegistryIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AEOStorageFacilityDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AEOStorageFacilityDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "AEOStorageFacilityDetails")
    public JAXBElement<AEOStorageFacilityDetailsType> createAEOStorageFacilityDetails(AEOStorageFacilityDetailsType value) {
        return new JAXBElement<AEOStorageFacilityDetailsType>(_AEOStorageFacilityDetails_QNAME, AEOStorageFacilityDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDAcceptCustomsPersonDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDAcceptCustomsPersonDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDAcceptCustomsPersonDetails")
    public JAXBElement<ATDAcceptCustomsPersonDetailsType> createATDAcceptCustomsPersonDetails(ATDAcceptCustomsPersonDetailsType value) {
        return new JAXBElement<ATDAcceptCustomsPersonDetailsType>(_ATDAcceptCustomsPersonDetails_QNAME, ATDAcceptCustomsPersonDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDAcceptOfficerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDAcceptOfficerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDAcceptOfficerDetails")
    public JAXBElement<ATDAcceptOfficerDetailsType> createATDAcceptOfficerDetails(ATDAcceptOfficerDetailsType value) {
        return new JAXBElement<ATDAcceptOfficerDetailsType>(_ATDAcceptOfficerDetails_QNAME, ATDAcceptOfficerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDArrivalTransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDArrivalTransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDArrivalTransportMeansDetails")
    public JAXBElement<ATDArrivalTransportMeansDetailsType> createATDArrivalTransportMeansDetails(ATDArrivalTransportMeansDetailsType value) {
        return new JAXBElement<ATDArrivalTransportMeansDetailsType>(_ATDArrivalTransportMeansDetails_QNAME, ATDArrivalTransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDAttachmentsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDAttachmentsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDAttachmentsDetails")
    public JAXBElement<ATDAttachmentsDetailsType> createATDAttachmentsDetails(ATDAttachmentsDetailsType value) {
        return new JAXBElement<ATDAttachmentsDetailsType>(_ATDAttachmentsDetails_QNAME, ATDAttachmentsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDChangeSealDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDChangeSealDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDChangeSealDetails")
    public JAXBElement<ATDChangeSealDetailsType> createATDChangeSealDetails(ATDChangeSealDetailsType value) {
        return new JAXBElement<ATDChangeSealDetailsType>(_ATDChangeSealDetails_QNAME, ATDChangeSealDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDCustodianDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDCustodianDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDCustodianDetails")
    public JAXBElement<ATDCustodianDetailsType> createATDCustodianDetails(ATDCustodianDetailsType value) {
        return new JAXBElement<ATDCustodianDetailsType>(_ATDCustodianDetails_QNAME, ATDCustodianDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDReturnLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDReturnLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDCustomsOfficeContactsDetails")
    public JAXBElement<ATDReturnLocationDetailsType> createATDCustomsOfficeContactsDetails(ATDReturnLocationDetailsType value) {
        return new JAXBElement<ATDReturnLocationDetailsType>(_ATDCustomsOfficeContactsDetails_QNAME, ATDReturnLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDCustomsPersonDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDCustomsPersonDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDCustomsPersonDetails")
    public JAXBElement<ATDCustomsPersonDetailsType> createATDCustomsPersonDetails(ATDCustomsPersonDetailsType value) {
        return new JAXBElement<ATDCustomsPersonDetailsType>(_ATDCustomsPersonDetails_QNAME, ATDCustomsPersonDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDCustomsToolsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDCustomsToolsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDCustomsToolsDetails")
    public JAXBElement<ATDCustomsToolsDetailsType> createATDCustomsToolsDetails(ATDCustomsToolsDetailsType value) {
        return new JAXBElement<ATDCustomsToolsDetailsType>(_ATDCustomsToolsDetails_QNAME, ATDCustomsToolsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDDataReasonDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDDataReasonDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDDataReasonDetails")
    public JAXBElement<ATDDataReasonDetailsType> createATDDataReasonDetails(ATDDataReasonDetailsType value) {
        return new JAXBElement<ATDDataReasonDetailsType>(_ATDDataReasonDetails_QNAME, ATDDataReasonDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDDocDetails")
    public JAXBElement<ATDDocDetailsType> createATDDocDetails(ATDDocDetailsType value) {
        return new JAXBElement<ATDDocDetailsType>(_ATDDocDetails_QNAME, ATDDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsIdentificationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsIdentificationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDFactSealDetails")
    public JAXBElement<CustomsIdentificationDetailsType> createATDFactSealDetails(CustomsIdentificationDetailsType value) {
        return new JAXBElement<CustomsIdentificationDetailsType>(_ATDFactSealDetails_QNAME, CustomsIdentificationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDGoodsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDGoodsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDGoodsDetails")
    public JAXBElement<ATDGoodsDetailsType> createATDGoodsDetails(ATDGoodsDetailsType value) {
        return new JAXBElement<ATDGoodsDetailsType>(_ATDGoodsDetails_QNAME, ATDGoodsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDGoodsDetentionReasonDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDGoodsDetentionReasonDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDGoodsDetentionReasonDetails")
    public JAXBElement<ATDGoodsDetentionReasonDetailsType> createATDGoodsDetentionReasonDetails(ATDGoodsDetentionReasonDetailsType value) {
        return new JAXBElement<ATDGoodsDetentionReasonDetailsType>(_ATDGoodsDetentionReasonDetails_QNAME, ATDGoodsDetentionReasonDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDGoodsOwnerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDGoodsOwnerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDGoodsOwnerDetails")
    public JAXBElement<ATDGoodsOwnerDetailsType> createATDGoodsOwnerDetails(ATDGoodsOwnerDetailsType value) {
        return new JAXBElement<ATDGoodsOwnerDetailsType>(_ATDGoodsOwnerDetails_QNAME, ATDGoodsOwnerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDGoodsReturnDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDGoodsReturnDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDGoodsReturnDetails")
    public JAXBElement<ATDGoodsReturnDetailsType> createATDGoodsReturnDetails(ATDGoodsReturnDetailsType value) {
        return new JAXBElement<ATDGoodsReturnDetailsType>(_ATDGoodsReturnDetails_QNAME, ATDGoodsReturnDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDInformationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDInformationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDInformationDetails")
    public JAXBElement<ATDInformationDetailsType> createATDInformationDetails(ATDInformationDetailsType value) {
        return new JAXBElement<ATDInformationDetailsType>(_ATDInformationDetails_QNAME, ATDInformationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDInformationSamplesSelectionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDInformationSamplesSelectionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDInformationSamplesSelectionDetails")
    public JAXBElement<ATDInformationSamplesSelectionDetailsType> createATDInformationSamplesSelectionDetails(ATDInformationSamplesSelectionDetailsType value) {
        return new JAXBElement<ATDInformationSamplesSelectionDetailsType>(_ATDInformationSamplesSelectionDetails_QNAME, ATDInformationSamplesSelectionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDInformationStorageDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDInformationStorageDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDInformationStorageDetails")
    public JAXBElement<ATDInformationStorageDetailsType> createATDInformationStorageDetails(ATDInformationStorageDetailsType value) {
        return new JAXBElement<ATDInformationStorageDetailsType>(_ATDInformationStorageDetails_QNAME, ATDInformationStorageDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDInformationTransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDInformationTransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDInformationTransportMeansDetails")
    public JAXBElement<ATDInformationTransportMeansDetailsType> createATDInformationTransportMeansDetails(ATDInformationTransportMeansDetailsType value) {
        return new JAXBElement<ATDInformationTransportMeansDetailsType>(_ATDInformationTransportMeansDetails_QNAME, ATDInformationTransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDLocationDetails")
    public JAXBElement<ATDLocationDetailsType> createATDLocationDetails(ATDLocationDetailsType value) {
        return new JAXBElement<ATDLocationDetailsType>(_ATDLocationDetails_QNAME, ATDLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDNewSealDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDNewSealDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDNewSealDetails")
    public JAXBElement<ATDNewSealDetailsType> createATDNewSealDetails(ATDNewSealDetailsType value) {
        return new JAXBElement<ATDNewSealDetailsType>(_ATDNewSealDetails_QNAME, ATDNewSealDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDOfficerRecipientDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDOfficerRecipientDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDOfficerRecipientDetails")
    public JAXBElement<ATDOfficerRecipientDetailsType> createATDOfficerRecipientDetails(ATDOfficerRecipientDetailsType value) {
        return new JAXBElement<ATDOfficerRecipientDetailsType>(_ATDOfficerRecipientDetails_QNAME, ATDOfficerRecipientDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDPackageSamplesDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDPackageSamplesDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDPackageSamplesDetails")
    public JAXBElement<ATDPackageSamplesDetailsType> createATDPackageSamplesDetails(ATDPackageSamplesDetailsType value) {
        return new JAXBElement<ATDPackageSamplesDetailsType>(_ATDPackageSamplesDetails_QNAME, ATDPackageSamplesDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDPersonDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDPersonDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDPersonDetails")
    public JAXBElement<ATDPersonDetailsType> createATDPersonDetails(ATDPersonDetailsType value) {
        return new JAXBElement<ATDPersonDetailsType>(_ATDPersonDetails_QNAME, ATDPersonDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDRadiationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDRadiationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDRadiationDetails")
    public JAXBElement<ATDRadiationDetailsType> createATDRadiationDetails(ATDRadiationDetailsType value) {
        return new JAXBElement<ATDRadiationDetailsType>(_ATDRadiationDetails_QNAME, ATDRadiationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDResultsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDResultsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDResultsDetails")
    public JAXBElement<ATDResultsDetailsType> createATDResultsDetails(ATDResultsDetailsType value) {
        return new JAXBElement<ATDResultsDetailsType>(_ATDResultsDetails_QNAME, ATDResultsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDReturnReasonDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDReturnReasonDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDReturnReasonDetails")
    public JAXBElement<ATDReturnReasonDetailsType> createATDReturnReasonDetails(ATDReturnReasonDetailsType value) {
        return new JAXBElement<ATDReturnReasonDetailsType>(_ATDReturnReasonDetails_QNAME, ATDReturnReasonDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDSamplesAddressDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDSamplesAddressDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDSamplesAddressDetails")
    public JAXBElement<ATDSamplesAddressDetailsType> createATDSamplesAddressDetails(ATDSamplesAddressDetailsType value) {
        return new JAXBElement<ATDSamplesAddressDetailsType>(_ATDSamplesAddressDetails_QNAME, ATDSamplesAddressDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDSamplesLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDSamplesLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDSamplesLocationDetails")
    public JAXBElement<ATDSamplesLocationDetailsType> createATDSamplesLocationDetails(ATDSamplesLocationDetailsType value) {
        return new JAXBElement<ATDSamplesLocationDetailsType>(_ATDSamplesLocationDetails_QNAME, ATDSamplesLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InspectionDocIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InspectionDocIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDSamplesSelectionDocIdDetails")
    public JAXBElement<InspectionDocIdDetailsType> createATDSamplesSelectionDocIdDetails(InspectionDocIdDetailsType value) {
        return new JAXBElement<InspectionDocIdDetailsType>(_ATDSamplesSelectionDocIdDetails_QNAME, InspectionDocIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDSealDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDSealDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDSealDetails")
    public JAXBElement<ATDSealDetailsType> createATDSealDetails(ATDSealDetailsType value) {
        return new JAXBElement<ATDSealDetailsType>(_ATDSealDetails_QNAME, ATDSealDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDSecondCopyDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDSecondCopyDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDSecondCopyDetails")
    public JAXBElement<ATDSecondCopyDetailsType> createATDSecondCopyDetails(ATDSecondCopyDetailsType value) {
        return new JAXBElement<ATDSecondCopyDetailsType>(_ATDSecondCopyDetails_QNAME, ATDSecondCopyDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDSecondCopyRecipientDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDSecondCopyRecipientDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDSecondCopyRecipientDetails")
    public JAXBElement<ATDSecondCopyRecipientDetailsType> createATDSecondCopyRecipientDetails(ATDSecondCopyRecipientDetailsType value) {
        return new JAXBElement<ATDSecondCopyRecipientDetailsType>(_ATDSecondCopyRecipientDetails_QNAME, ATDSecondCopyRecipientDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDSecondCopySenderDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDSecondCopySenderDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDSecondCopySenderDetails")
    public JAXBElement<ATDSecondCopySenderDetailsType> createATDSecondCopySenderDetails(ATDSecondCopySenderDetailsType value) {
        return new JAXBElement<ATDSecondCopySenderDetailsType>(_ATDSecondCopySenderDetails_QNAME, ATDSecondCopySenderDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDServiceInfoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDServiceInfoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDServiceInfoDetails")
    public JAXBElement<ATDServiceInfoDetailsType> createATDServiceInfoDetails(ATDServiceInfoDetailsType value) {
        return new JAXBElement<ATDServiceInfoDetailsType>(_ATDServiceInfoDetails_QNAME, ATDServiceInfoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDStatementDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDStatementDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDStatementDetails")
    public JAXBElement<ATDStatementDetailsType> createATDStatementDetails(ATDStatementDetailsType value) {
        return new JAXBElement<ATDStatementDetailsType>(_ATDStatementDetails_QNAME, ATDStatementDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDStorageDetentionsGoodsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDStorageDetentionsGoodsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDStorageDetentionsGoodsDetails")
    public JAXBElement<ATDStorageDetentionsGoodsDetailsType> createATDStorageDetentionsGoodsDetails(ATDStorageDetentionsGoodsDetailsType value) {
        return new JAXBElement<ATDStorageDetentionsGoodsDetailsType>(_ATDStorageDetentionsGoodsDetails_QNAME, ATDStorageDetentionsGoodsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDStorageRequirementDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDStorageRequirementDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDStorageRequirementDetails")
    public JAXBElement<ATDStorageRequirementDetailsType> createATDStorageRequirementDetails(ATDStorageRequirementDetailsType value) {
        return new JAXBElement<ATDStorageRequirementDetailsType>(_ATDStorageRequirementDetails_QNAME, ATDStorageRequirementDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDTermsThievingSamplingDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDTermsThievingSamplingDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDTermsThievingSamplingDetails")
    public JAXBElement<ATDTermsThievingSamplingDetailsType> createATDTermsThievingSamplingDetails(ATDTermsThievingSamplingDetailsType value) {
        return new JAXBElement<ATDTermsThievingSamplingDetailsType>(_ATDTermsThievingSamplingDetails_QNAME, ATDTermsThievingSamplingDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ATDWeightMethodDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ATDWeightMethodDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDWeightMethodDetails")
    public JAXBElement<ATDWeightMethodDetailsType> createATDWeightMethodDetails(ATDWeightMethodDetailsType value) {
        return new JAXBElement<ATDWeightMethodDetailsType>(_ATDWeightMethodDetails_QNAME, ATDWeightMethodDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIATDestinationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIATDestinationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ATDestinationDetails")
    public JAXBElement<PIATDestinationDetailsType> createATDestinationDetails(PIATDestinationDetailsType value) {
        return new JAXBElement<PIATDestinationDetailsType>(_ATDestinationDetails_QNAME, PIATDestinationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InspectionDocIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InspectionDocIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ActInspectionDocIdDetails")
    public JAXBElement<InspectionDocIdDetailsType> createActInspectionDocIdDetails(InspectionDocIdDetailsType value) {
        return new JAXBElement<InspectionDocIdDetailsType>(_ActInspectionDocIdDetails_QNAME, InspectionDocIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "AddGoodsMeasureDetails")
    public JAXBElement<GoodsMeasureDetailsType> createAddGoodsMeasureDetails(GoodsMeasureDetailsType value) {
        return new JAXBElement<GoodsMeasureDetailsType>(_AddGoodsMeasureDetails_QNAME, GoodsMeasureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "AddSuretyContractDetails")
    public JAXBElement<DocDetailsV4Type> createAddSuretyContractDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_AddSuretyContractDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdenticalGoodsCorrectionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdenticalGoodsCorrectionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "AdditionsAdjustmentsDetails")
    public JAXBElement<IdenticalGoodsCorrectionDetailsType> createAdditionsAdjustmentsDetails(IdenticalGoodsCorrectionDetailsType value) {
        return new JAXBElement<IdenticalGoodsCorrectionDetailsType>(_AdditionsAdjustmentsDetails_QNAME, IdenticalGoodsCorrectionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIVPortDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIVPortDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "AffectedPortDetails")
    public JAXBElement<PIVPortDetailsType> createAffectedPortDetails(PIVPortDetailsType value) {
        return new JAXBElement<PIVPortDetailsType>(_AffectedPortDetails_QNAME, PIVPortDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "AgentDetails")
    public JAXBElement<AgentDetailsType> createAgentDetails(AgentDetailsType value) {
        return new JAXBElement<AgentDetailsType>(_AgentDetails_QNAME, AgentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfficerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfficerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "AgentRepresentativeDetails")
    public JAXBElement<OfficerDetailsType> createAgentRepresentativeDetails(OfficerDetailsType value) {
        return new JAXBElement<OfficerDetailsType>(_AgentRepresentativeDetails_QNAME, OfficerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedOverallDimensionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedOverallDimensionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "AllowanceDetails")
    public JAXBElement<UnifiedOverallDimensionDetailsType> createAllowanceDetails(UnifiedOverallDimensionDetailsType value) {
        return new JAXBElement<UnifiedOverallDimensionDetailsType>(_AllowanceDetails_QNAME, UnifiedOverallDimensionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AntiepidemicEquipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AntiepidemicEquipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "AntiepidemicEquipmentDetails")
    public JAXBElement<AntiepidemicEquipmentDetailsType> createAntiepidemicEquipmentDetails(AntiepidemicEquipmentDetailsType value) {
        return new JAXBElement<AntiepidemicEquipmentDetailsType>(_AntiepidemicEquipmentDetails_QNAME, AntiepidemicEquipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AntiepidemicReadyDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AntiepidemicReadyDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "AntiepidemicReadyDetails")
    public JAXBElement<AntiepidemicReadyDetailsType> createAntiepidemicReadyDetails(AntiepidemicReadyDetailsType value) {
        return new JAXBElement<AntiepidemicReadyDetailsType>(_AntiepidemicReadyDetails_QNAME, AntiepidemicReadyDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerificationValueDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerificationValueDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ApproximateValueDetails")
    public JAXBElement<VerificationValueDetailsType> createApproximateValueDetails(VerificationValueDetailsType value) {
        return new JAXBElement<VerificationValueDetailsType>(_ApproximateValueDetails_QNAME, VerificationValueDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointAddressDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PointAddressDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ArrivalDepartureAddressDetails")
    public JAXBElement<PointAddressDetailsType> createArrivalDepartureAddressDetails(PointAddressDetailsType value) {
        return new JAXBElement<PointAddressDetailsType>(_ArrivalDepartureAddressDetails_QNAME, PointAddressDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclarationTransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeclarationTransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ArrivalDepartureTransportDetails")
    public JAXBElement<DeclarationTransportMeansDetailsType> createArrivalDepartureTransportDetails(DeclarationTransportMeansDetailsType value) {
        return new JAXBElement<DeclarationTransportMeansDetailsType>(_ArrivalDepartureTransportDetails_QNAME, DeclarationTransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ArrivalDocumentIdDetails")
    public JAXBElement<CustomsDocumentIdDetailsType> createArrivalDocumentIdDetails(CustomsDocumentIdDetailsType value) {
        return new JAXBElement<CustomsDocumentIdDetailsType>(_ArrivalDocumentIdDetails_QNAME, CustomsDocumentIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArriveCustomsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArriveCustomsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ArriveCustomsDetails")
    public JAXBElement<ArriveCustomsDetailsType> createArriveCustomsDetails(ArriveCustomsDetailsType value) {
        return new JAXBElement<ArriveCustomsDetailsType>(_ArriveCustomsDetails_QNAME, ArriveCustomsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrivePointDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrivePointDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ArrivePointDetails")
    public JAXBElement<ArrivePointDetailsType> createArrivePointDetails(ArrivePointDetailsType value) {
        return new JAXBElement<ArrivePointDetailsType>(_ArrivePointDetails_QNAME, ArrivePointDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrivePointLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrivePointLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ArrivePointLocationDetails")
    public JAXBElement<ArrivePointLocationDetailsType> createArrivePointLocationDetails(ArrivePointLocationDetailsType value) {
        return new JAXBElement<ArrivePointLocationDetailsType>(_ArrivePointLocationDetails_QNAME, ArrivePointLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrivePointLocationWorkDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrivePointLocationWorkDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ArrivePointLocationWorkDetails")
    public JAXBElement<ArrivePointLocationWorkDetailsType> createArrivePointLocationWorkDetails(ArrivePointLocationWorkDetailsType value) {
        return new JAXBElement<ArrivePointLocationWorkDetailsType>(_ArrivePointLocationWorkDetails_QNAME, ArrivePointLocationWorkDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CABinaryDataDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CABinaryDataDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "BinaryDataDetails")
    public JAXBElement<CABinaryDataDetailsType> createBinaryDataDetails(CABinaryDataDetailsType value) {
        return new JAXBElement<CABinaryDataDetailsType>(_BinaryDataDetails_QNAME, CABinaryDataDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "BorderCustomsOfficeDetails")
    public JAXBElement<KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType> createBorderCustomsOfficeDetails(KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType value) {
        return new JAXBElement<KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType>(_BorderCustomsOfficeDetails_QNAME, KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.CustomsOfficeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclarationTransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeclarationTransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "BorderTransportDetails")
    public JAXBElement<DeclarationTransportMeansDetailsType> createBorderTransportDetails(DeclarationTransportMeansDetailsType value) {
        return new JAXBElement<DeclarationTransportMeansDetailsType>(_BorderTransportDetails_QNAME, DeclarationTransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CATransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CATransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "BorderTransportsDetails")
    public JAXBElement<CATransportMeansDetailsType> createBorderTransportsDetails(CATransportMeansDetailsType value) {
        return new JAXBElement<CATransportMeansDetailsType>(_BorderTransportsDetails_QNAME, CATransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAOrganizationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CAOrganizationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "BranchDetails")
    public JAXBElement<CAOrganizationType> createBranchDetails(CAOrganizationType value) {
        return new JAXBElement<CAOrganizationType>(_BranchDetails_QNAME, CAOrganizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterOrganizationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterOrganizationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "BrokerBranchDetails")
    public JAXBElement<RegisterOrganizationDetailsType> createBrokerBranchDetails(RegisterOrganizationDetailsType value) {
        return new JAXBElement<RegisterOrganizationDetailsType>(_BrokerBranchDetails_QNAME, RegisterOrganizationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterOrganizationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterOrganizationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "BrokerParentDetails")
    public JAXBElement<RegisterOrganizationDetailsType> createBrokerParentDetails(RegisterOrganizationDetailsType value) {
        return new JAXBElement<RegisterOrganizationDetailsType>(_BrokerParentDetails_QNAME, RegisterOrganizationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrokerRegistryDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BrokerRegistryDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "BrokerRegistryDocDetails")
    public JAXBElement<BrokerRegistryDocDetailsType> createBrokerRegistryDocDetails(BrokerRegistryDocDetailsType value) {
        return new JAXBElement<BrokerRegistryDocDetailsType>(_BrokerRegistryDocDetails_QNAME, BrokerRegistryDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsShipmentSubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsShipmentSubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "BuyerDetails")
    public JAXBElement<GoodsShipmentSubjectDetailsType> createBuyerDetails(GoodsShipmentSubjectDetailsType value) {
        return new JAXBElement<GoodsShipmentSubjectDetailsType>(_BuyerDetails_QNAME, GoodsShipmentSubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyerSellerRelationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuyerSellerRelationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "BuyerSellerRelationDetails")
    public JAXBElement<BuyerSellerRelationDetailsType> createBuyerSellerRelationDetails(BuyerSellerRelationDetailsType value) {
        return new JAXBElement<BuyerSellerRelationDetailsType>(_BuyerSellerRelationDetails_QNAME, BuyerSellerRelationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyerSellerRoyaltyFeeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BuyerSellerRoyaltyFeeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "BuyerSellerRoyaltyFeeDetails")
    public JAXBElement<BuyerSellerRoyaltyFeeDetailsType> createBuyerSellerRoyaltyFeeDetails(BuyerSellerRoyaltyFeeDetailsType value) {
        return new JAXBElement<BuyerSellerRoyaltyFeeDetailsType>(_BuyerSellerRoyaltyFeeDetails_QNAME, BuyerSellerRoyaltyFeeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CADocDetails")
    public JAXBElement<CADocDetailsType> createCADocDetails(CADocDetailsType value) {
        return new JAXBElement<CADocDetailsType>(_CADocDetails_QNAME, CADocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CALegalActDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CALegalActDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CALegalActDetails")
    public JAXBElement<CALegalActDetailsType> createCALegalActDetails(CALegalActDetailsType value) {
        return new JAXBElement<CALegalActDetailsType>(_CALegalActDetails_QNAME, CALegalActDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CAPresentedDocDetails")
    public JAXBElement<CADocDetailsType> createCAPresentedDocDetails(CADocDetailsType value) {
        return new JAXBElement<CADocDetailsType>(_CAPresentedDocDetails_QNAME, CADocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASignatureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASignatureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CASignatureDetails")
    public JAXBElement<CASignatureDetailsType> createCASignatureDetails(CASignatureDetailsType value) {
        return new JAXBElement<CASignatureDetailsType>(_CASignatureDetails_QNAME, CASignatureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAStampDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CAStampDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CAStampDetails")
    public JAXBElement<CAStampDetailsType> createCAStampDetails(CAStampDetailsType value) {
        return new JAXBElement<CAStampDetailsType>(_CAStampDetails_QNAME, CAStampDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectBaseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectBaseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CASubjectBaseDetails")
    public JAXBElement<CASubjectBaseDetailsType> createCASubjectBaseDetails(CASubjectBaseDetailsType value) {
        return new JAXBElement<CASubjectBaseDetailsType>(_CASubjectBaseDetails_QNAME, CASubjectBaseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CATNVEDNoteDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CATNVEDNoteDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CATNVEDNoteDetails")
    public JAXBElement<CATNVEDNoteDetailsType> createCATNVEDNoteDetails(CATNVEDNoteDetailsType value) {
        return new JAXBElement<CATNVEDNoteDetailsType>(_CATNVEDNoteDetails_QNAME, CATNVEDNoteDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CDEAUDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CDEAUDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CDEAUDocDetails")
    public JAXBElement<CDEAUDocDetailsType> createCDEAUDocDetails(CDEAUDocDetailsType value) {
        return new JAXBElement<CDEAUDocDetailsType>(_CDEAUDocDetails_QNAME, CDEAUDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CDEAUDocGoodsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CDEAUDocGoodsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CDEAUDocGoodsDetails")
    public JAXBElement<CDEAUDocGoodsDetailsType> createCDEAUDocGoodsDetails(CDEAUDocGoodsDetailsType value) {
        return new JAXBElement<CDEAUDocGoodsDetailsType>(_CDEAUDocGoodsDetails_QNAME, CDEAUDocGoodsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CDEAUJustificationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CDEAUJustificationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CDEAUJustificationDetails")
    public JAXBElement<CDEAUJustificationDetailsType> createCDEAUJustificationDetails(CDEAUJustificationDetailsType value) {
        return new JAXBElement<CDEAUJustificationDetailsType>(_CDEAUJustificationDetails_QNAME, CDEAUJustificationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CDEUModifiedDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CDEUModifiedDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CDEAUModifiedDocDetails")
    public JAXBElement<CDEUModifiedDocDetailsType> createCDEAUModifiedDocDetails(CDEUModifiedDocDetailsType value) {
        return new JAXBElement<CDEUModifiedDocDetailsType>(_CDEAUModifiedDocDetails_QNAME, CDEUModifiedDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIMDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CIMDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CIMDetails")
    public JAXBElement<CIMDetailsType> createCIMDetails(CIMDetailsType value) {
        return new JAXBElement<CIMDetailsType>(_CIMDetails_QNAME, CIMDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIMListDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CIMListDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CIMListDetails")
    public JAXBElement<CIMListDetailsType> createCIMListDetails(CIMListDetailsType value) {
        return new JAXBElement<CIMListDetailsType>(_CIMListDetails_QNAME, CIMListDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CIMRangeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CIMRangeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CIMRangeDetails")
    public JAXBElement<CIMRangeDetailsType> createCIMRangeDetails(CIMRangeDetailsType value) {
        return new JAXBElement<CIMRangeDetailsType>(_CIMRangeDetails_QNAME, CIMRangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPCFactPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CPCFactPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CPCFactPaymentDetails")
    public JAXBElement<CPCFactPaymentDetailsType> createCPCFactPaymentDetails(CPCFactPaymentDetailsType value) {
        return new JAXBElement<CPCFactPaymentDetailsType>(_CPCFactPaymentDetails_QNAME, CPCFactPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPCGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CPCGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CPCGoodsItemDetails")
    public JAXBElement<CPCGoodsItemDetailsType> createCPCGoodsItemDetails(CPCGoodsItemDetailsType value) {
        return new JAXBElement<CPCGoodsItemDetailsType>(_CPCGoodsItemDetails_QNAME, CPCGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPCGoodsItemPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CPCGoodsItemPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CPCGoodsItemPaymentDetails")
    public JAXBElement<CPCGoodsItemPaymentDetailsType> createCPCGoodsItemPaymentDetails(CPCGoodsItemPaymentDetailsType value) {
        return new JAXBElement<CPCGoodsItemPaymentDetailsType>(_CPCGoodsItemPaymentDetails_QNAME, CPCGoodsItemPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPCGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CPCGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CPCGoodsShipmentDetails")
    public JAXBElement<CPCGoodsShipmentDetailsType> createCPCGoodsShipmentDetails(CPCGoodsShipmentDetailsType value) {
        return new JAXBElement<CPCGoodsShipmentDetailsType>(_CPCGoodsShipmentDetails_QNAME, CPCGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdWOrdinalDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdWOrdinalDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CPCIdDetails")
    public JAXBElement<CustomsDocumentIdWOrdinalDetailsType> createCPCIdDetails(CustomsDocumentIdWOrdinalDetailsType value) {
        return new JAXBElement<CustomsDocumentIdWOrdinalDetailsType>(_CPCIdDetails_QNAME, CustomsDocumentIdWOrdinalDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPCPayerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CPCPayerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CPCPayerDetails")
    public JAXBElement<CPCPayerDetailsType> createCPCPayerDetails(CPCPayerDetailsType value) {
        return new JAXBElement<CPCPayerDetailsType>(_CPCPayerDetails_QNAME, CPCPayerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPCPaymentAmountDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CPCPaymentAmountDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CPCPaymentAmountDetails")
    public JAXBElement<CPCPaymentAmountDetailsType> createCPCPaymentAmountDetails(CPCPaymentAmountDetailsType value) {
        return new JAXBElement<CPCPaymentAmountDetailsType>(_CPCPaymentAmountDetails_QNAME, CPCPaymentAmountDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPCPresentedDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CPCPresentedDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CPCPresentedDocDetails")
    public JAXBElement<CPCPresentedDocDetailsType> createCPCPresentedDocDetails(CPCPresentedDocDetailsType value) {
        return new JAXBElement<CPCPresentedDocDetailsType>(_CPCPresentedDocDetails_QNAME, CPCPresentedDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRAdditionalInformationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRAdditionalInformationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRAdditionalInformationDetails")
    public JAXBElement<CRAdditionalInformationDetailsType> createCRAdditionalInformationDetails(CRAdditionalInformationDetailsType value) {
        return new JAXBElement<CRAdditionalInformationDetailsType>(_CRAdditionalInformationDetails_QNAME, CRAdditionalInformationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRAutomobileDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRAutomobileDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRAutomobileDetails")
    public JAXBElement<CRAutomobileDetailsType> createCRAutomobileDetails(CRAutomobileDetailsType value) {
        return new JAXBElement<CRAutomobileDetailsType>(_CRAutomobileDetails_QNAME, CRAutomobileDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRCommonGoodsInfoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRCommonGoodsInfoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRCommonGoodsInfoDetails")
    public JAXBElement<CRCommonGoodsInfoDetailsType> createCRCommonGoodsInfoDetails(CRCommonGoodsInfoDetailsType value) {
        return new JAXBElement<CRCommonGoodsInfoDetailsType>(_CRCommonGoodsInfoDetails_QNAME, CRCommonGoodsInfoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRCommonPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRCommonPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRCommonPaymentDetails")
    public JAXBElement<CRCommonPaymentDetailsType> createCRCommonPaymentDetails(CRCommonPaymentDetailsType value) {
        return new JAXBElement<CRCommonPaymentDetailsType>(_CRCommonPaymentDetails_QNAME, CRCommonPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRCurrencyDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRCurrencyDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRCurrencyDetails")
    public JAXBElement<CRCurrencyDetailsType> createCRCurrencyDetails(CRCurrencyDetailsType value) {
        return new JAXBElement<CRCurrencyDetailsType>(_CRCurrencyDetails_QNAME, CRCurrencyDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRExchDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRExchDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRExchDetails")
    public JAXBElement<CRExchDetailsType> createCRExchDetails(CRExchDetailsType value) {
        return new JAXBElement<CRExchDetailsType>(_CRExchDetails_QNAME, CRExchDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRExchGoodsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRExchGoodsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRExchGoodsDetails")
    public JAXBElement<CRExchGoodsDetailsType> createCRExchGoodsDetails(CRExchGoodsDetailsType value) {
        return new JAXBElement<CRExchGoodsDetailsType>(_CRExchGoodsDetails_QNAME, CRExchGoodsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRExchGoodsPaymentsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRExchGoodsPaymentsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRExchGoodsPaymentsDetails")
    public JAXBElement<CRExchGoodsPaymentsDetailsType> createCRExchGoodsPaymentsDetails(CRExchGoodsPaymentsDetailsType value) {
        return new JAXBElement<CRExchGoodsPaymentsDetailsType>(_CRExchGoodsPaymentsDetails_QNAME, CRExchGoodsPaymentsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRExchResultDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRExchResultDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRExchListDetails")
    public JAXBElement<CRExchResultDetailsType> createCRExchListDetails(CRExchResultDetailsType value) {
        return new JAXBElement<CRExchResultDetailsType>(_CRExchListDetails_QNAME, CRExchResultDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRExchPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRExchPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRExchPaymentDetails")
    public JAXBElement<CRExchPaymentDetailsType> createCRExchPaymentDetails(CRExchPaymentDetailsType value) {
        return new JAXBElement<CRExchPaymentDetailsType>(_CRExchPaymentDetails_QNAME, CRExchPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRSubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRSubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRFactPayerDetails")
    public JAXBElement<CRSubjectDetailsType> createCRFactPayerDetails(CRSubjectDetailsType value) {
        return new JAXBElement<CRSubjectDetailsType>(_CRFactPayerDetails_QNAME, CRSubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRGoodsInfoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRGoodsInfoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRGoodsInfoDetails")
    public JAXBElement<CRGoodsInfoDetailsType> createCRGoodsInfoDetails(CRGoodsInfoDetailsType value) {
        return new JAXBElement<CRGoodsInfoDetailsType>(_CRGoodsInfoDetails_QNAME, CRGoodsInfoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRGoodsItemPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRGoodsItemPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRGoodsItemPaymentDetails")
    public JAXBElement<CRGoodsItemPaymentDetailsType> createCRGoodsItemPaymentDetails(CRGoodsItemPaymentDetailsType value) {
        return new JAXBElement<CRGoodsItemPaymentDetailsType>(_CRGoodsItemPaymentDetails_QNAME, CRGoodsItemPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRSubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRSubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRPayerDetails")
    public JAXBElement<CRSubjectDetailsType> createCRPayerDetails(CRSubjectDetailsType value) {
        return new JAXBElement<CRSubjectDetailsType>(_CRPayerDetails_QNAME, CRSubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRPaymentDetails")
    public JAXBElement<CRPaymentDetailsType> createCRPaymentDetails(CRPaymentDetailsType value) {
        return new JAXBElement<CRPaymentDetailsType>(_CRPaymentDetails_QNAME, CRPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRPresentedDocDetails")
    public JAXBElement<CADocDetailsType> createCRPresentedDocDetails(CADocDetailsType value) {
        return new JAXBElement<CADocDetailsType>(_CRPresentedDocDetails_QNAME, CADocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRPreviosDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRPreviosDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRPreviosDocDocDetails")
    public JAXBElement<CRPreviosDocDetailsType> createCRPreviosDocDocDetails(CRPreviosDocDetailsType value) {
        return new JAXBElement<CRPreviosDocDetailsType>(_CRPreviosDocDocDetails_QNAME, CRPreviosDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRSubjectAddressDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRSubjectAddressDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRSubjectAddressDetails")
    public JAXBElement<CRSubjectAddressDetailsType> createCRSubjectAddressDetails(CRSubjectAddressDetailsType value) {
        return new JAXBElement<CRSubjectAddressDetailsType>(_CRSubjectAddressDetails_QNAME, CRSubjectAddressDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRTypeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CRTypeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CRTypeDetails")
    public JAXBElement<CRTypeDetailsType> createCRTypeDetails(CRTypeDetailsType value) {
        return new JAXBElement<CRTypeDetailsType>(_CRTypeDetails_QNAME, CRTypeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CVDAdditionalInformationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CVDAdditionalInformationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CVDAdditionalInformationDetails")
    public JAXBElement<CVDAdditionalInformationDetailsType> createCVDAdditionalInformationDetails(CVDAdditionalInformationDetailsType value) {
        return new JAXBElement<CVDAdditionalInformationDetailsType>(_CVDAdditionalInformationDetails_QNAME, CVDAdditionalInformationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CVDCurrencyExchangeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CVDCurrencyExchangeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CVDCurrencyExchangeDetails")
    public JAXBElement<CVDCurrencyExchangeDetailsType> createCVDCurrencyExchangeDetails(CVDCurrencyExchangeDetailsType value) {
        return new JAXBElement<CVDCurrencyExchangeDetailsType>(_CVDCurrencyExchangeDetails_QNAME, CVDCurrencyExchangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CVDDecisionDocDetails")
    public JAXBElement<DocDetailsV4Type> createCVDDecisionDocDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_CVDDecisionDocDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CVDEvidenceDocumentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CVDEvidenceDocumentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CVDEvidenceDocumentDetails")
    public JAXBElement<CVDEvidenceDocumentDetailsType> createCVDEvidenceDocumentDetails(CVDEvidenceDocumentDetailsType value) {
        return new JAXBElement<CVDEvidenceDocumentDetailsType>(_CVDEvidenceDocumentDetails_QNAME, CVDEvidenceDocumentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CVDGoodsDocumentDetails")
    public JAXBElement<DocDetailsV4Type> createCVDGoodsDocumentDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_CVDGoodsDocumentDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CVDGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CVDGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CVDGoodsItemDetails")
    public JAXBElement<CVDGoodsItemDetailsType> createCVDGoodsItemDetails(CVDGoodsItemDetailsType value) {
        return new JAXBElement<CVDGoodsItemDetailsType>(_CVDGoodsItemDetails_QNAME, CVDGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CVDMethod1CalculationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CVDMethod1CalculationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CVDMethod1CalculationDetails")
    public JAXBElement<CVDMethod1CalculationDetailsType> createCVDMethod1CalculationDetails(CVDMethod1CalculationDetailsType value) {
        return new JAXBElement<CVDMethod1CalculationDetailsType>(_CVDMethod1CalculationDetails_QNAME, CVDMethod1CalculationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CVDMethod1DetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CVDMethod1DetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CVDMethod1Details")
    public JAXBElement<CVDMethod1DetailsType> createCVDMethod1Details(CVDMethod1DetailsType value) {
        return new JAXBElement<CVDMethod1DetailsType>(_CVDMethod1Details_QNAME, CVDMethod1DetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CVDMethod236CalculationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CVDMethod236CalculationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CVDMethod236CalculationDetails")
    public JAXBElement<CVDMethod236CalculationDetailsType> createCVDMethod236CalculationDetails(CVDMethod236CalculationDetailsType value) {
        return new JAXBElement<CVDMethod236CalculationDetailsType>(_CVDMethod236CalculationDetails_QNAME, CVDMethod236CalculationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CVDMethod46CalculationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CVDMethod46CalculationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CVDMethod46CalculationDetails")
    public JAXBElement<CVDMethod46CalculationDetailsType> createCVDMethod46CalculationDetails(CVDMethod46CalculationDetailsType value) {
        return new JAXBElement<CVDMethod46CalculationDetailsType>(_CVDMethod46CalculationDetails_QNAME, CVDMethod46CalculationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CVDMethod56CalculationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CVDMethod56CalculationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CVDMethod56CalculationDetails")
    public JAXBElement<CVDMethod56CalculationDetailsType> createCVDMethod56CalculationDetails(CVDMethod56CalculationDetailsType value) {
        return new JAXBElement<CVDMethod56CalculationDetailsType>(_CVDMethod56CalculationDetails_QNAME, CVDMethod56CalculationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CVDOtherMethodDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CVDOtherMethodDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CVDOtherMethodDetails")
    public JAXBElement<CVDOtherMethodDetailsType> createCVDOtherMethodDetails(CVDOtherMethodDetailsType value) {
        return new JAXBElement<CVDOtherMethodDetailsType>(_CVDOtherMethodDetails_QNAME, CVDOtherMethodDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CargoPackagePalletDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CargoPackagePalletDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CargoPackagePalletDetails")
    public JAXBElement<CargoPackagePalletDetailsType> createCargoPackagePalletDetails(CargoPackagePalletDetailsType value) {
        return new JAXBElement<CargoPackagePalletDetailsType>(_CargoPackagePalletDetails_QNAME, CargoPackagePalletDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CarrierDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CarrierDetails")
    public JAXBElement<CarrierDetailsType> createCarrierDetails(CarrierDetailsType value) {
        return new JAXBElement<CarrierDetailsType>(_CarrierDetails_QNAME, CarrierDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierOrganizationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CarrierOrganizationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CarrierOrganizationDetails")
    public JAXBElement<CarrierOrganizationDetailsType> createCarrierOrganizationDetails(CarrierOrganizationDetailsType value) {
        return new JAXBElement<CarrierOrganizationDetailsType>(_CarrierOrganizationDetails_QNAME, CarrierOrganizationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierRepresentativeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CarrierRepresentativeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CarrierRepresentativeDetails")
    public JAXBElement<CarrierRepresentativeDetailsType> createCarrierRepresentativeDetails(CarrierRepresentativeDetailsType value) {
        return new JAXBElement<CarrierRepresentativeDetailsType>(_CarrierRepresentativeDetails_QNAME, CarrierRepresentativeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashListDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CashListDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CashDetails")
    public JAXBElement<CashListDetailsType> createCashDetails(CashListDetailsType value) {
        return new JAXBElement<CashListDetailsType>(_CashDetails_QNAME, CashListDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CertCADocDetails")
    public JAXBElement<DocDetailsV4Type> createCertCADocDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_CertCADocDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificatePaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CertificatePaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CertificatePaymentDetails")
    public JAXBElement<CertificatePaymentDetailsType> createCertificatePaymentDetails(CertificatePaymentDetailsType value) {
        return new JAXBElement<CertificatePaymentDetailsType>(_CertificatePaymentDetails_QNAME, CertificatePaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointCapacityDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointCapacityDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointCapacityDetails")
    public JAXBElement<CheckPointCapacityDetailsType> createCheckPointCapacityDetails(CheckPointCapacityDetailsType value) {
        return new JAXBElement<CheckPointCapacityDetailsType>(_CheckPointCapacityDetails_QNAME, CheckPointCapacityDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointDetails")
    public JAXBElement<CheckPointDetailsType> createCheckPointDetails(CheckPointDetailsType value) {
        return new JAXBElement<CheckPointDetailsType>(_CheckPointDetails_QNAME, CheckPointDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointEntryDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointEntryDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointEntryDetails")
    public JAXBElement<CheckPointEntryDetailsType> createCheckPointEntryDetails(CheckPointEntryDetailsType value) {
        return new JAXBElement<CheckPointEntryDetailsType>(_CheckPointEntryDetails_QNAME, CheckPointEntryDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointInformationSystemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointInformationSystemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointInformationSystemDetails")
    public JAXBElement<CheckPointInformationSystemDetailsType> createCheckPointInformationSystemDetails(CheckPointInformationSystemDetailsType value) {
        return new JAXBElement<CheckPointInformationSystemDetailsType>(_CheckPointInformationSystemDetails_QNAME, CheckPointInformationSystemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointLinkDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointLinkDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointLinkDetails")
    public JAXBElement<CheckPointLinkDetailsType> createCheckPointLinkDetails(CheckPointLinkDetailsType value) {
        return new JAXBElement<CheckPointLinkDetailsType>(_CheckPointLinkDetails_QNAME, CheckPointLinkDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointMaintenanceDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointMaintenanceDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointMaintenanceDetails")
    public JAXBElement<CheckPointMaintenanceDetailsType> createCheckPointMaintenanceDetails(CheckPointMaintenanceDetailsType value) {
        return new JAXBElement<CheckPointMaintenanceDetailsType>(_CheckPointMaintenanceDetails_QNAME, CheckPointMaintenanceDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointMaintenanceSystemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointMaintenanceSystemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointMaintenanceSystemDetails")
    public JAXBElement<CheckPointMaintenanceSystemDetailsType> createCheckPointMaintenanceSystemDetails(CheckPointMaintenanceSystemDetailsType value) {
        return new JAXBElement<CheckPointMaintenanceSystemDetailsType>(_CheckPointMaintenanceSystemDetails_QNAME, CheckPointMaintenanceSystemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessEntityDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BusinessEntityDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointOrganizationDetails")
    public JAXBElement<BusinessEntityDetailsType> createCheckPointOrganizationDetails(BusinessEntityDetailsType value) {
        return new JAXBElement<BusinessEntityDetailsType>(_CheckPointOrganizationDetails_QNAME, BusinessEntityDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointPassportDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointPassportDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointPassportDetails")
    public JAXBElement<CheckPointPassportDetailsType> createCheckPointPassportDetails(CheckPointPassportDetailsType value) {
        return new JAXBElement<CheckPointPassportDetailsType>(_CheckPointPassportDetails_QNAME, CheckPointPassportDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointSpecialControlDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointSpecialControlDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointSpecialControlDetails")
    public JAXBElement<CheckPointSpecialControlDetailsType> createCheckPointSpecialControlDetails(CheckPointSpecialControlDetailsType value) {
        return new JAXBElement<CheckPointSpecialControlDetailsType>(_CheckPointSpecialControlDetails_QNAME, CheckPointSpecialControlDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointSystemControlDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointSystemControlDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointSystemControlDetails")
    public JAXBElement<CheckPointSystemControlDetailsType> createCheckPointSystemControlDetails(CheckPointSystemControlDetailsType value) {
        return new JAXBElement<CheckPointSystemControlDetailsType>(_CheckPointSystemControlDetails_QNAME, CheckPointSystemControlDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointTVSystemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointTVSystemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointTVSystemDetails")
    public JAXBElement<CheckPointTVSystemDetailsType> createCheckPointTVSystemDetails(CheckPointTVSystemDetailsType value) {
        return new JAXBElement<CheckPointTVSystemDetailsType>(_CheckPointTVSystemDetails_QNAME, CheckPointTVSystemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPointWorkDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckPointWorkDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CheckPointWorkDetails")
    public JAXBElement<CheckPointWorkDetailsType> createCheckPointWorkDetails(CheckPointWorkDetailsType value) {
        return new JAXBElement<CheckPointWorkDetailsType>(_CheckPointWorkDetails_QNAME, CheckPointWorkDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsOperationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsOperationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CloseOperationDetails")
    public JAXBElement<CustomsOperationDetailsType> createCloseOperationDetails(CustomsOperationDetailsType value) {
        return new JAXBElement<CustomsOperationDetailsType>(_CloseOperationDetails_QNAME, CustomsOperationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClosedReasonDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClosedReasonDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ClosedReasonDetails")
    public JAXBElement<ClosedReasonDetailsType> createClosedReasonDetails(ClosedReasonDetailsType value) {
        return new JAXBElement<ClosedReasonDetailsType>(_ClosedReasonDetails_QNAME, ClosedReasonDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CACommodityDescriptionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CACommodityDescriptionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CommodityDescriptionDetails")
    public JAXBElement<CACommodityDescriptionDetailsType> createCommodityDescriptionDetails(CACommodityDescriptionDetailsType value) {
        return new JAXBElement<CACommodityDescriptionDetailsType>(_CommodityDescriptionDetails_QNAME, CACommodityDescriptionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CommodityGroupItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CommodityGroupItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CommodityGroupItemDetails")
    public JAXBElement<CommodityGroupItemDetailsType> createCommodityGroupItemDetails(CommodityGroupItemDetailsType value) {
        return new JAXBElement<CommodityGroupItemDetailsType>(_CommodityGroupItemDetails_QNAME, CommodityGroupItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetentOrganizationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompetentOrganizationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CompetentOrganizationCertificateDetails")
    public JAXBElement<CompetentOrganizationDetailsType> createCompetentOrganizationCertificateDetails(CompetentOrganizationDetailsType value) {
        return new JAXBElement<CompetentOrganizationDetailsType>(_CompetentOrganizationCertificateDetails_QNAME, CompetentOrganizationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsShipmentSubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsShipmentSubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ConsigneeDetails")
    public JAXBElement<GoodsShipmentSubjectDetailsType> createConsigneeDetails(GoodsShipmentSubjectDetailsType value) {
        return new JAXBElement<GoodsShipmentSubjectDetailsType>(_ConsigneeDetails_QNAME, GoodsShipmentSubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDocumentSubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsDocumentSubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ConsigneeOrganizationDetails")
    public JAXBElement<CustomsDocumentSubjectDetailsType> createConsigneeOrganizationDetails(CustomsDocumentSubjectDetailsType value) {
        return new JAXBElement<CustomsDocumentSubjectDetailsType>(_ConsigneeOrganizationDetails_QNAME, CustomsDocumentSubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ConsigneeV2Details")
    public JAXBElement<CASubjectDetailsType> createConsigneeV2Details(CASubjectDetailsType value) {
        return new JAXBElement<CASubjectDetailsType>(_ConsigneeV2Details_QNAME, CASubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsignmentCancelDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsignmentCancelDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ConsignmentCancelDetails")
    public JAXBElement<ConsignmentCancelDetailsType> createConsignmentCancelDetails(ConsignmentCancelDetailsType value) {
        return new JAXBElement<ConsignmentCancelDetailsType>(_ConsignmentCancelDetails_QNAME, ConsignmentCancelDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsShipmentSubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsShipmentSubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ConsignorDetails")
    public JAXBElement<GoodsShipmentSubjectDetailsType> createConsignorDetails(GoodsShipmentSubjectDetailsType value) {
        return new JAXBElement<GoodsShipmentSubjectDetailsType>(_ConsignorDetails_QNAME, GoodsShipmentSubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CABusinessEntityBranchDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CABusinessEntityBranchDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ConsignorOrganizationDetails")
    public JAXBElement<CABusinessEntityBranchDetailsType> createConsignorOrganizationDetails(CABusinessEntityBranchDetailsType value) {
        return new JAXBElement<CABusinessEntityBranchDetailsType>(_ConsignorOrganizationDetails_QNAME, CABusinessEntityBranchDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ConsignorV2Details")
    public JAXBElement<CASubjectDetailsType> createConsignorV2Details(CASubjectDetailsType value) {
        return new JAXBElement<CASubjectDetailsType>(_ConsignorV2Details_QNAME, CASubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContainerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ContainerDetails")
    public JAXBElement<ContainerDetailsType> createContainerDetails(ContainerDetailsType value) {
        return new JAXBElement<ContainerDetailsType>(_ContainerDetails_QNAME, ContainerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainerInformationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContainerInformationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ContainerInformationDetails")
    public JAXBElement<ContainerInformationDetailsType> createContainerInformationDetails(ContainerInformationDetailsType value) {
        return new JAXBElement<ContainerInformationDetailsType>(_ContainerInformationDetails_QNAME, ContainerInformationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContainerListDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContainerListDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ContainerListDetails")
    public JAXBElement<ContainerListDetailsType> createContainerListDetails(ContainerListDetailsType value) {
        return new JAXBElement<ContainerListDetailsType>(_ContainerListDetails_QNAME, ContainerListDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ContractDetails")
    public JAXBElement<DocDetailsV4Type> createContractDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_ContractDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlAgencyInformationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ControlAgencyInformationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ControlAgencyInformationDetails")
    public JAXBElement<ControlAgencyInformationType> createControlAgencyInformationDetails(ControlAgencyInformationType value) {
        return new JAXBElement<ControlAgencyInformationType>(_ControlAgencyInformationDetails_QNAME, ControlAgencyInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ControlledItemsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ControlledItemsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ControlledItemsDetails")
    public JAXBElement<ControlledItemsDetailsType> createControlledItemsDetails(ControlledItemsDetailsType value) {
        return new JAXBElement<ControlledItemsDetailsType>(_ControlledItemsDetails_QNAME, ControlledItemsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrewTrainingDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrewTrainingDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CrewTrainingDetails")
    public JAXBElement<CrewTrainingDetailsType> createCrewTrainingDetails(CrewTrainingDetailsType value) {
        return new JAXBElement<CrewTrainingDetailsType>(_CrewTrainingDetails_QNAME, CrewTrainingDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsBrokerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsBrokerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsBrokerDetails")
    public JAXBElement<CustomsBrokerDetailsType> createCustomsBrokerDetails(CustomsBrokerDetailsType value) {
        return new JAXBElement<CustomsBrokerDetailsType>(_CustomsBrokerDetails_QNAME, CustomsBrokerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsCheckCodeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsCheckCodeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsCheckCodeDetails")
    public JAXBElement<CustomsCheckCodeDetailsType> createCustomsCheckCodeDetails(CustomsCheckCodeDetailsType value) {
        return new JAXBElement<CustomsCheckCodeDetailsType>(_CustomsCheckCodeDetails_QNAME, CustomsCheckCodeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsControlZoneDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsControlZoneDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsControlZoneDetails")
    public JAXBElement<CustomsControlZoneDetailsType> createCustomsControlZoneDetails(CustomsControlZoneDetailsType value) {
        return new JAXBElement<CustomsControlZoneDetailsType>(_CustomsControlZoneDetails_QNAME, CustomsControlZoneDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsControlZoneIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsControlZoneIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsControlZoneIdDetails")
    public JAXBElement<CustomsControlZoneIdDetailsType> createCustomsControlZoneIdDetails(CustomsControlZoneIdDetailsType value) {
        return new JAXBElement<CustomsControlZoneIdDetailsType>(_CustomsControlZoneIdDetails_QNAME, CustomsControlZoneIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTExchDecisionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTExchDecisionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsDecisionDetails")
    public JAXBElement<DTExchDecisionDetailsType> createCustomsDecisionDetails(DTExchDecisionDetailsType value) {
        return new JAXBElement<DTExchDecisionDetailsType>(_CustomsDecisionDetails_QNAME, DTExchDecisionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsDeclarationIdDetails")
    public JAXBElement<CustomsDocumentIdDetailsType> createCustomsDeclarationIdDetails(CustomsDocumentIdDetailsType value) {
        return new JAXBElement<CustomsDocumentIdDetailsType>(_CustomsDeclarationIdDetails_QNAME, CustomsDocumentIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdWOrdinalDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdWOrdinalDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsDocIdDetails")
    public JAXBElement<CustomsDocumentIdWOrdinalDetailsType> createCustomsDocIdDetails(CustomsDocumentIdWOrdinalDetailsType value) {
        return new JAXBElement<CustomsDocumentIdWOrdinalDetailsType>(_CustomsDocIdDetails_QNAME, CustomsDocumentIdWOrdinalDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsIdentificationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsIdentificationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsIdentificationDetails")
    public JAXBElement<CustomsIdentificationDetailsType> createCustomsIdentificationDetails(CustomsIdentificationDetailsType value) {
        return new JAXBElement<CustomsIdentificationDetailsType>(_CustomsIdentificationDetails_QNAME, CustomsIdentificationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsIdentificationMeansIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsIdentificationMeansIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsIdentificationMeansIdDetails")
    public JAXBElement<CustomsIdentificationMeansIdDetailsType> createCustomsIdentificationMeansIdDetails(CustomsIdentificationMeansIdDetailsType value) {
        return new JAXBElement<CustomsIdentificationMeansIdDetailsType>(_CustomsIdentificationMeansIdDetails_QNAME, CustomsIdentificationMeansIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsMarkDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsMarkDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsMarkDetails")
    public JAXBElement<CustomsMarkDetailsType> createCustomsMarkDetails(CustomsMarkDetailsType value) {
        return new JAXBElement<CustomsMarkDetailsType>(_CustomsMarkDetails_QNAME, CustomsMarkDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsOfficeClassifierDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsOfficeClassifierDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsOfficeClassifierDetails")
    public JAXBElement<CustomsOfficeClassifierDetailsType> createCustomsOfficeClassifierDetails(CustomsOfficeClassifierDetailsType value) {
        return new JAXBElement<CustomsOfficeClassifierDetailsType>(_CustomsOfficeClassifierDetails_QNAME, CustomsOfficeClassifierDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsOfficeFunctionalDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsOfficeFunctionalDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsOfficeFunctionalDetails")
    public JAXBElement<CustomsOfficeFunctionalDetailsType> createCustomsOfficeFunctionalDetails(CustomsOfficeFunctionalDetailsType value) {
        return new JAXBElement<CustomsOfficeFunctionalDetailsType>(_CustomsOfficeFunctionalDetails_QNAME, CustomsOfficeFunctionalDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsOfficeIndicatorDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsOfficeIndicatorDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsOfficeIndicatorDetails")
    public JAXBElement<CustomsOfficeIndicatorDetailsType> createCustomsOfficeIndicatorDetails(CustomsOfficeIndicatorDetailsType value) {
        return new JAXBElement<CustomsOfficeIndicatorDetailsType>(_CustomsOfficeIndicatorDetails_QNAME, CustomsOfficeIndicatorDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsPaymentBaseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsPaymentBaseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsPaymentBaseDetails")
    public JAXBElement<CustomsPaymentBaseDetailsType> createCustomsPaymentBaseDetails(CustomsPaymentBaseDetailsType value) {
        return new JAXBElement<CustomsPaymentBaseDetailsType>(_CustomsPaymentBaseDetails_QNAME, CustomsPaymentBaseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsItemPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsItemPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsPaymentDetails")
    public JAXBElement<GoodsItemPaymentDetailsType> createCustomsPaymentDetails(GoodsItemPaymentDetailsType value) {
        return new JAXBElement<GoodsItemPaymentDetailsType>(_CustomsPaymentDetails_QNAME, GoodsItemPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsPersonDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsPersonDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsPersonDetails")
    public JAXBElement<CustomsPersonDetailsType> createCustomsPersonDetails(CustomsPersonDetailsType value) {
        return new JAXBElement<CustomsPersonDetailsType>(_CustomsPersonDetails_QNAME, CustomsPersonDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsPersonSignDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsPersonSignDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsPersonSignDetails")
    public JAXBElement<CustomsPersonSignDetailsType> createCustomsPersonSignDetails(CustomsPersonSignDetailsType value) {
        return new JAXBElement<CustomsPersonSignDetailsType>(_CustomsPersonSignDetails_QNAME, CustomsPersonSignDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsProcedureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsProcedureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsProcedureDetails")
    public JAXBElement<CustomsProcedureDetailsType> createCustomsProcedureDetails(CustomsProcedureDetailsType value) {
        return new JAXBElement<CustomsProcedureDetailsType>(_CustomsProcedureDetails_QNAME, CustomsProcedureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsReceiptIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsReceiptIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsReceiptIdDetails")
    public JAXBElement<CustomsReceiptIdDetailsType> createCustomsReceiptIdDetails(CustomsReceiptIdDetailsType value) {
        return new JAXBElement<CustomsReceiptIdDetailsType>(_CustomsReceiptIdDetails_QNAME, CustomsReceiptIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsRepresentativeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsRepresentativeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsRepresentativeDetails")
    public JAXBElement<CustomsRepresentativeDetailsType> createCustomsRepresentativeDetails(CustomsRepresentativeDetailsType value) {
        return new JAXBElement<CustomsRepresentativeDetailsType>(_CustomsRepresentativeDetails_QNAME, CustomsRepresentativeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsTaxModeCodeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsTaxModeCodeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsTaxModeCodeDetails")
    public JAXBElement<CustomsTaxModeCodeDetailsType> createCustomsTaxModeCodeDetails(CustomsTaxModeCodeDetailsType value) {
        return new JAXBElement<CustomsTaxModeCodeDetailsType>(_CustomsTaxModeCodeDetails_QNAME, CustomsTaxModeCodeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsToolDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsToolDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsToolDetails")
    public JAXBElement<CustomsToolDetailsType> createCustomsToolDetails(CustomsToolDetailsType value) {
        return new JAXBElement<CustomsToolDetailsType>(_CustomsToolDetails_QNAME, CustomsToolDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsValueDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsValueDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsValueDetails")
    public JAXBElement<CustomsValueDetailsType> createCustomsValueDetails(CustomsValueDetailsType value) {
        return new JAXBElement<CustomsValueDetailsType>(_CustomsValueDetails_QNAME, CustomsValueDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WarehouseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WarehouseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "CustomsWarehouseDetails")
    public JAXBElement<WarehouseDetailsType> createCustomsWarehouseDetails(WarehouseDetailsType value) {
        return new JAXBElement<WarehouseDetailsType>(_CustomsWarehouseDetails_QNAME, WarehouseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTAutomobileDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTAutomobileDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTAutomobileDetails")
    public JAXBElement<DTAutomobileDetailsType> createDTAutomobileDetails(DTAutomobileDetailsType value) {
        return new JAXBElement<DTAutomobileDetailsType>(_DTAutomobileDetails_QNAME, DTAutomobileDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTExchAutoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTExchAutoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTExchAutoDetails")
    public JAXBElement<DTExchAutoDetailsType> createDTExchAutoDetails(DTExchAutoDetailsType value) {
        return new JAXBElement<DTExchAutoDetailsType>(_DTExchAutoDetails_QNAME, DTExchAutoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTExchAutomobileDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTExchAutomobileDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTExchAutomobileDetails")
    public JAXBElement<DTExchAutomobileDetailsType> createDTExchAutomobileDetails(DTExchAutomobileDetailsType value) {
        return new JAXBElement<DTExchAutomobileDetailsType>(_DTExchAutomobileDetails_QNAME, DTExchAutomobileDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTExchCustomsPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTExchCustomsPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTExchCustomsPaymentDetails")
    public JAXBElement<DTExchCustomsPaymentDetailsType> createDTExchCustomsPaymentDetails(DTExchCustomsPaymentDetailsType value) {
        return new JAXBElement<DTExchCustomsPaymentDetailsType>(_DTExchCustomsPaymentDetails_QNAME, DTExchCustomsPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTExchDeclarationIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTExchDeclarationIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTExchDeclarationIdDetails")
    public JAXBElement<DTExchDeclarationIdDetailsType> createDTExchDeclarationIdDetails(DTExchDeclarationIdDetailsType value) {
        return new JAXBElement<DTExchDeclarationIdDetailsType>(_DTExchDeclarationIdDetails_QNAME, DTExchDeclarationIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTExchFactPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTExchFactPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTExchFactPaymentDetails")
    public JAXBElement<DTExchFactPaymentDetailsType> createDTExchFactPaymentDetails(DTExchFactPaymentDetailsType value) {
        return new JAXBElement<DTExchFactPaymentDetailsType>(_DTExchFactPaymentDetails_QNAME, DTExchFactPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTExchGoodsPaymentsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTExchGoodsPaymentsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTExchGoodsPaymentsDetails")
    public JAXBElement<DTExchGoodsPaymentsDetailsType> createDTExchGoodsPaymentsDetails(DTExchGoodsPaymentsDetailsType value) {
        return new JAXBElement<DTExchGoodsPaymentsDetailsType>(_DTExchGoodsPaymentsDetails_QNAME, DTExchGoodsPaymentsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTExchListDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTExchListDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTExchListDetails")
    public JAXBElement<DTExchListDetailsType> createDTExchListDetails(DTExchListDetailsType value) {
        return new JAXBElement<DTExchListDetailsType>(_DTExchListDetails_QNAME, DTExchListDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrecedingDocsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrecedingDocsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTExchPrecedingDocDetails")
    public JAXBElement<PrecedingDocsDetailsType> createDTExchPrecedingDocDetails(PrecedingDocsDetailsType value) {
        return new JAXBElement<PrecedingDocsDetailsType>(_DTExchPrecedingDocDetails_QNAME, PrecedingDocsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTExchPresentedDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTExchPresentedDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTExchPresentedDocDetails")
    public JAXBElement<DTExchPresentedDocDetailsType> createDTExchPresentedDocDetails(DTExchPresentedDocDetailsType value) {
        return new JAXBElement<DTExchPresentedDocDetailsType>(_DTExchPresentedDocDetails_QNAME, DTExchPresentedDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTExchGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTExchGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTExhcGoodsItemDetails")
    public JAXBElement<DTExchGoodsItemDetailsType> createDTExhcGoodsItemDetails(DTExchGoodsItemDetailsType value) {
        return new JAXBElement<DTExchGoodsItemDetailsType>(_DTExhcGoodsItemDetails_QNAME, DTExchGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTExchGoodsShipmentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTExchGoodsShipmentType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTExhcGoodsShipmentDetails")
    public JAXBElement<DTExchGoodsShipmentType> createDTExhcGoodsShipmentDetails(DTExchGoodsShipmentType value) {
        return new JAXBElement<DTExchGoodsShipmentType>(_DTExhcGoodsShipmentDetails_QNAME, DTExchGoodsShipmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTIdentificationMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTIdentificationMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTIdentificationMeansDetails")
    public JAXBElement<DTIdentificationMeansDetailsType> createDTIdentificationMeansDetails(DTIdentificationMeansDetailsType value) {
        return new JAXBElement<DTIdentificationMeansDetailsType>(_DTIdentificationMeansDetails_QNAME, DTIdentificationMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTMDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTMDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTMDocDetails")
    public JAXBElement<DTMDocDetailsType> createDTMDocDetails(DTMDocDetailsType value) {
        return new JAXBElement<DTMDocDetailsType>(_DTMDocDetails_QNAME, DTMDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTPaymentDocDetails")
    public JAXBElement<DocDetailsV4Type> createDTPaymentDocDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_DTPaymentDocDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTSExchGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTSExchGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTSExchGoodsItemDetails")
    public JAXBElement<DTSExchGoodsItemDetailsType> createDTSExchGoodsItemDetails(DTSExchGoodsItemDetailsType value) {
        return new JAXBElement<DTSExchGoodsItemDetailsType>(_DTSExchGoodsItemDetails_QNAME, DTSExchGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTSExchItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTSExchItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTSExchItemDetails")
    public JAXBElement<DTSExchItemDetailsType> createDTSExchItemDetails(DTSExchItemDetailsType value) {
        return new JAXBElement<DTSExchItemDetailsType>(_DTSExchItemDetails_QNAME, DTSExchItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTStatDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTStatDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTStatDetails")
    public JAXBElement<DTStatDetailsType> createDTStatDetails(DTStatDetailsType value) {
        return new JAXBElement<DTStatDetailsType>(_DTStatDetails_QNAME, DTStatDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTStatGoodsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DTStatGoodsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DTStatGoodsDetails")
    public JAXBElement<DTStatGoodsDetailsType> createDTStatGoodsDetails(DTStatGoodsDetailsType value) {
        return new JAXBElement<DTStatGoodsDetailsType>(_DTStatGoodsDetails_QNAME, DTStatGoodsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DamagedIndicatorDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DamagedIndicatorDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DamagedIndicatorDetails")
    public JAXBElement<DamagedIndicatorDetailsType> createDamagedIndicatorDetails(DamagedIndicatorDetailsType value) {
        return new JAXBElement<DamagedIndicatorDetailsType>(_DamagedIndicatorDetails_QNAME, DamagedIndicatorDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DecisionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DecisionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DecisionDetails")
    public JAXBElement<DecisionDetailsType> createDecisionDetails(DecisionDetailsType value) {
        return new JAXBElement<DecisionDetailsType>(_DecisionDetails_QNAME, DecisionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclarantDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeclarantDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DeclarantDetails")
    public JAXBElement<DeclarantDetailsType> createDeclarantDetails(DeclarantDetailsType value) {
        return new JAXBElement<DeclarantDetailsType>(_DeclarantDetails_QNAME, DeclarantDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CABusinessEntityBranchDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CABusinessEntityBranchDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DeclarantGoodsDetails")
    public JAXBElement<CABusinessEntityBranchDetailsType> createDeclarantGoodsDetails(CABusinessEntityBranchDetailsType value) {
        return new JAXBElement<CABusinessEntityBranchDetailsType>(_DeclarantGoodsDetails_QNAME, CABusinessEntityBranchDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclarationConsignmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeclarationConsignmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DeclarationConsignmentDetails")
    public JAXBElement<DeclarationConsignmentDetailsType> createDeclarationConsignmentDetails(DeclarationConsignmentDetailsType value) {
        return new JAXBElement<DeclarationConsignmentDetailsType>(_DeclarationConsignmentDetails_QNAME, DeclarationConsignmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclarationGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeclarationGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DeclarationGoodsItemDetails")
    public JAXBElement<DeclarationGoodsItemDetailsType> createDeclarationGoodsItemDetails(DeclarationGoodsItemDetailsType value) {
        return new JAXBElement<DeclarationGoodsItemDetailsType>(_DeclarationGoodsItemDetails_QNAME, DeclarationGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeclarationGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeclarationGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DeclarationGoodsShipmentDetails")
    public JAXBElement<DeclarationGoodsShipmentDetailsType> createDeclarationGoodsShipmentDetails(DeclarationGoodsShipmentDetailsType value) {
        return new JAXBElement<DeclarationGoodsShipmentDetailsType>(_DeclarationGoodsShipmentDetails_QNAME, DeclarationGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdenticalGoodsCorrectionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdenticalGoodsCorrectionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DeductionAdjustmentsDetails")
    public JAXBElement<IdenticalGoodsCorrectionDetailsType> createDeductionAdjustmentsDetails(IdenticalGoodsCorrectionDetailsType value) {
        return new JAXBElement<IdenticalGoodsCorrectionDetailsType>(_DeductionAdjustmentsDetails_QNAME, IdenticalGoodsCorrectionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefferedPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DefferedPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DefferedPaymentDetails")
    public JAXBElement<DefferedPaymentDetailsType> createDefferedPaymentDetails(DefferedPaymentDetailsType value) {
        return new JAXBElement<DefferedPaymentDetailsType>(_DefferedPaymentDetails_QNAME, DefferedPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DefferedPaymentDocDetails")
    public JAXBElement<DocDetailsV4Type> createDefferedPaymentDocDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_DefferedPaymentDocDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelayPaymentsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DelayPaymentsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DelayPaymentsDetails")
    public JAXBElement<DelayPaymentsDetailsType> createDelayPaymentsDetails(DelayPaymentsDetailsType value) {
        return new JAXBElement<DelayPaymentsDetailsType>(_DelayPaymentsDetails_QNAME, DelayPaymentsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryTermsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeliveryTermsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DeliveryTermsDetails")
    public JAXBElement<DeliveryTermsDetailsType> createDeliveryTermsDetails(DeliveryTermsDetailsType value) {
        return new JAXBElement<DeliveryTermsDetailsType>(_DeliveryTermsDetails_QNAME, DeliveryTermsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CACountryDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CACountryDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DepartureCountryDetails")
    public JAXBElement<CACountryDetailsType> createDepartureCountryDetails(CACountryDetailsType value) {
        return new JAXBElement<CACountryDetailsType>(_DepartureCountryDetails_QNAME, CACountryDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCustomsOfficeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCustomsOfficeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DepartureCustomsOfficeDetails")
    public JAXBElement<UnifiedCustomsOfficeDetailsType> createDepartureCustomsOfficeDetails(UnifiedCustomsOfficeDetailsType value) {
        return new JAXBElement<UnifiedCustomsOfficeDetailsType>(_DepartureCustomsOfficeDetails_QNAME, UnifiedCustomsOfficeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CATransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CATransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DepartureTransportDetails")
    public JAXBElement<CATransportMeansDetailsType> createDepartureTransportDetails(CATransportMeansDetailsType value) {
        return new JAXBElement<CATransportMeansDetailsType>(_DepartureTransportDetails_QNAME, CATransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMeansIDDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransportMeansIDDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DependTransportMeansIdDetails")
    public JAXBElement<TransportMeansIDDetailsType> createDependTransportMeansIdDetails(TransportMeansIDDetailsType value) {
        return new JAXBElement<TransportMeansIDDetailsType>(_DependTransportMeansIdDetails_QNAME, TransportMeansIDDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CACountryDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CACountryDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DestinationCountryDetails")
    public JAXBElement<CACountryDetailsType> createDestinationCountryDetails(CACountryDetailsType value) {
        return new JAXBElement<CACountryDetailsType>(_DestinationCountryDetails_QNAME, CACountryDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsOfficeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsOfficeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DestinationCustomsOfficeDetails")
    public JAXBElement<CustomsOfficeDetailsType> createDestinationCustomsOfficeDetails(CustomsOfficeDetailsType value) {
        return new JAXBElement<CustomsOfficeDetailsType>(_DestinationCustomsOfficeDetails_QNAME, CustomsOfficeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedOverallDimensionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedOverallDimensionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DeviationDetails")
    public JAXBElement<UnifiedOverallDimensionDetailsType> createDeviationDetails(UnifiedOverallDimensionDetailsType value) {
        return new JAXBElement<UnifiedOverallDimensionDetailsType>(_DeviationDetails_QNAME, UnifiedOverallDimensionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RangeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RangeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DiameterRangeDetails")
    public JAXBElement<RangeDetailsType> createDiameterRangeDetails(RangeDetailsType value) {
        return new JAXBElement<RangeDetailsType>(_DiameterRangeDetails_QNAME, RangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OverallDimensionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OverallDimensionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DimensionDetails")
    public JAXBElement<OverallDimensionDetailsType> createDimensionDetails(OverallDimensionDetailsType value) {
        return new JAXBElement<OverallDimensionDetailsType>(_DimensionDetails_QNAME, OverallDimensionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmbarkationPlaceDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmbarkationPlaceDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DisembarkationPlaceDetails")
    public JAXBElement<EmbarkationPlaceDetailsType> createDisembarkationPlaceDetails(EmbarkationPlaceDetailsType value) {
        return new JAXBElement<EmbarkationPlaceDetailsType>(_DisembarkationPlaceDetails_QNAME, EmbarkationPlaceDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisinfectionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisinfectionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DisinfectionDetails")
    public JAXBElement<DisinfectionDetailsType> createDisinfectionDetails(DisinfectionDetailsType value) {
        return new JAXBElement<DisinfectionDetailsType>(_DisinfectionDetails_QNAME, DisinfectionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisinfestationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisinfestationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DisinfestationDetails")
    public JAXBElement<DisinfestationDetailsType> createDisinfestationDetails(DisinfestationDetailsType value) {
        return new JAXBElement<DisinfestationDetailsType>(_DisinfestationDetails_QNAME, DisinfestationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocArchIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocArchIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DocArchIdDetails")
    public JAXBElement<DocArchIdDetailsType> createDocArchIdDetails(DocArchIdDetailsType value) {
        return new JAXBElement<DocArchIdDetailsType>(_DocArchIdDetails_QNAME, DocArchIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentPresentingDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentPresentingDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DocumentPresentingDetails")
    public JAXBElement<DocumentPresentingDetailsType> createDocumentPresentingDetails(DocumentPresentingDetailsType value) {
        return new JAXBElement<DocumentPresentingDetailsType>(_DocumentPresentingDetails_QNAME, DocumentPresentingDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DoubleCorridorDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DoubleCorridorDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DoubleCorridorDetails")
    public JAXBElement<DoubleCorridorDetailsType> createDoubleCorridorDetails(DoubleCorridorDetailsType value) {
        return new JAXBElement<DoubleCorridorDetailsType>(_DoubleCorridorDetails_QNAME, DoubleCorridorDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAPersonBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CAPersonBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DriverBaseDetails")
    public JAXBElement<CAPersonBaseType> createDriverBaseDetails(CAPersonBaseType value) {
        return new JAXBElement<CAPersonBaseType>(_DriverBaseDetails_QNAME, CAPersonBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DriverDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DriverDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "DriverDetails")
    public JAXBElement<DriverDetailsType> createDriverDetails(DriverDetailsType value) {
        return new JAXBElement<DriverDetailsType>(_DriverDetails_QNAME, DriverDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ECChangeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ECChangeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ECChangeDetails")
    public JAXBElement<ECChangeDetailsType> createECChangeDetails(ECChangeDetailsType value) {
        return new JAXBElement<ECChangeDetailsType>(_ECChangeDetails_QNAME, ECChangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ECGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ECGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ECGoodsItemDetails")
    public JAXBElement<ECGoodsItemDetailsType> createECGoodsItemDetails(ECGoodsItemDetailsType value) {
        return new JAXBElement<ECGoodsItemDetailsType>(_ECGoodsItemDetails_QNAME, ECGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ECGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ECGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ECGoodsShipmentDetails")
    public JAXBElement<ECGoodsShipmentDetailsType> createECGoodsShipmentDetails(ECGoodsShipmentDetailsType value) {
        return new JAXBElement<ECGoodsShipmentDetailsType>(_ECGoodsShipmentDetails_QNAME, ECGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ECHouseShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ECHouseShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ECHouseShipmentDetails")
    public JAXBElement<ECHouseShipmentDetailsType> createECHouseShipmentDetails(ECHouseShipmentDetailsType value) {
        return new JAXBElement<ECHouseShipmentDetailsType>(_ECHouseShipmentDetails_QNAME, ECHouseShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ECPaymentAmountDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ECPaymentAmountDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ECPaymentAmountDetails")
    public JAXBElement<ECPaymentAmountDetailsType> createECPaymentAmountDetails(ECPaymentAmountDetailsType value) {
        return new JAXBElement<ECPaymentAmountDetailsType>(_ECPaymentAmountDetails_QNAME, ECPaymentAmountDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ECPrecedingDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ECPrecedingDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ECPrecedingDocDetails")
    public JAXBElement<ECPrecedingDocDetailsType> createECPrecedingDocDetails(ECPrecedingDocDetailsType value) {
        return new JAXBElement<ECPrecedingDocDetailsType>(_ECPrecedingDocDetails_QNAME, ECPrecedingDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ECPresentedDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ECPresentedDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ECPresentedDocDetails")
    public JAXBElement<ECPresentedDocDetailsType> createECPresentedDocDetails(ECPresentedDocDetailsType value) {
        return new JAXBElement<ECPresentedDocDetailsType>(_ECPresentedDocDetails_QNAME, ECPresentedDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EDocCorrectionDetaisType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EDocCorrectionDetaisType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "EDocCorrectionDetails")
    public JAXBElement<EDocCorrectionDetaisType> createEDocCorrectionDetails(EDocCorrectionDetaisType value) {
        return new JAXBElement<EDocCorrectionDetaisType>(_EDocCorrectionDetails_QNAME, EDocCorrectionDetaisType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DutyTaxFeeRateDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DutyTaxFeeRateDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "EffectiveCustomsRateDetails")
    public JAXBElement<DutyTaxFeeRateDetailsType> createEffectiveCustomsRateDetails(DutyTaxFeeRateDetailsType value) {
        return new JAXBElement<DutyTaxFeeRateDetailsType>(_EffectiveCustomsRateDetails_QNAME, DutyTaxFeeRateDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ElectricPowerTransferDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ElectricPowerTransferDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ElectricPowerTransferDetails")
    public JAXBElement<ElectricPowerTransferDetailsType> createElectricPowerTransferDetails(ElectricPowerTransferDetailsType value) {
        return new JAXBElement<ElectricPowerTransferDetailsType>(_ElectricPowerTransferDetails_QNAME, ElectricPowerTransferDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmbarkationPlaceDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmbarkationPlaceDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "EmbarkationPlaceDetails")
    public JAXBElement<EmbarkationPlaceDetailsType> createEmbarkationPlaceDetails(EmbarkationPlaceDetailsType value) {
        return new JAXBElement<EmbarkationPlaceDetailsType>(_EmbarkationPlaceDetails_QNAME, EmbarkationPlaceDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnsureDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnsureDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "EnsureDocDetails")
    public JAXBElement<EnsureDocDetailsType> createEnsureDocDetails(EnsureDocDetailsType value) {
        return new JAXBElement<EnsureDocDetailsType>(_EnsureDocDetails_QNAME, EnsureDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EquipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "EquipmentDetails")
    public JAXBElement<EquipmentDetailsType> createEquipmentDetails(EquipmentDetailsType value) {
        return new JAXBElement<EquipmentDetailsType>(_EquipmentDetails_QNAME, EquipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExciseStampDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExciseStampDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ExciseStampDetails")
    public JAXBElement<ExciseStampDetailsType> createExciseStampDetails(ExciseStampDetailsType value) {
        return new JAXBElement<ExciseStampDetailsType>(_ExciseStampDetails_QNAME, ExciseStampDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExciseStampIdListDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExciseStampIdListDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ExciseStampIdListDetails")
    public JAXBElement<ExciseStampIdListDetailsType> createExciseStampIdListDetails(ExciseStampIdListDetailsType value) {
        return new JAXBElement<ExciseStampIdListDetailsType>(_ExciseStampIdListDetails_QNAME, ExciseStampIdListDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExciseStampRangeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExciseStampRangeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ExciseStampRangeDetails")
    public JAXBElement<ExciseStampRangeDetailsType> createExciseStampRangeDetails(ExciseStampRangeDetailsType value) {
        return new JAXBElement<ExciseStampRangeDetailsType>(_ExciseStampRangeDetails_QNAME, ExciseStampRangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportCancellationReasonDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExportCancellationReasonDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ExportCancellationReasonDetails")
    public JAXBElement<ExportCancellationReasonDetailsType> createExportCancellationReasonDetails(ExportCancellationReasonDetailsType value) {
        return new JAXBElement<ExportCancellationReasonDetailsType>(_ExportCancellationReasonDetails_QNAME, ExportCancellationReasonDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ExpressCargoDeclarationIdDetails")
    public JAXBElement<CustomsDocumentIdDetailsType> createExpressCargoDeclarationIdDetails(CustomsDocumentIdDetailsType value) {
        return new JAXBElement<CustomsDocumentIdDetailsType>(_ExpressCargoDeclarationIdDetails_QNAME, CustomsDocumentIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsOperationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsOperationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ExtensionOperationDetails")
    public JAXBElement<CustomsOperationDetailsType> createExtensionOperationDetails(CustomsOperationDetailsType value) {
        return new JAXBElement<CustomsOperationDetailsType>(_ExtensionOperationDetails_QNAME, CustomsOperationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FEConsignmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FEConsignmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FEConsignmentDetails")
    public JAXBElement<FEConsignmentDetailsType> createFEConsignmentDetails(FEConsignmentDetailsType value) {
        return new JAXBElement<FEConsignmentDetailsType>(_FEConsignmentDetails_QNAME, FEConsignmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FEFactDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FEFactDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FEFactDetails")
    public JAXBElement<FEFactDetailsType> createFEFactDetails(FEFactDetailsType value) {
        return new JAXBElement<FEFactDetailsType>(_FEFactDetails_QNAME, FEFactDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FEGoodsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FEGoodsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FEGoodsDetails")
    public JAXBElement<FEGoodsDetailsType> createFEGoodsDetails(FEGoodsDetailsType value) {
        return new JAXBElement<FEGoodsDetailsType>(_FEGoodsDetails_QNAME, FEGoodsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FEGoodsInfoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FEGoodsInfoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FEGoodsInfoDetails")
    public JAXBElement<FEGoodsInfoDetailsType> createFEGoodsInfoDetails(FEGoodsInfoDetailsType value) {
        return new JAXBElement<FEGoodsInfoDetailsType>(_FEGoodsInfoDetails_QNAME, FEGoodsInfoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FERegistrationIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FERegistrationIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FERegistrationIdDetails")
    public JAXBElement<FERegistrationIdDetailsType> createFERegistrationIdDetails(FERegistrationIdDetailsType value) {
        return new JAXBElement<FERegistrationIdDetailsType>(_FERegistrationIdDetails_QNAME, FERegistrationIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FLAvtoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FLAvtoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FLAvtoDetails")
    public JAXBElement<FLAvtoDetailsType> createFLAvtoDetails(FLAvtoDetailsType value) {
        return new JAXBElement<FLAvtoDetailsType>(_FLAvtoDetails_QNAME, FLAvtoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FLAvtoPaymentRateDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FLAvtoPaymentRateDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FLAvtoPaymentRateDetails")
    public JAXBElement<FLAvtoPaymentRateDetailsType> createFLAvtoPaymentRateDetails(FLAvtoPaymentRateDetailsType value) {
        return new JAXBElement<FLAvtoPaymentRateDetailsType>(_FLAvtoPaymentRateDetails_QNAME, FLAvtoPaymentRateDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PICargoLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PICargoLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FactDepartureLocationDetails")
    public JAXBElement<PICargoLocationDetailsType> createFactDepartureLocationDetails(PICargoLocationDetailsType value) {
        return new JAXBElement<PICargoLocationDetailsType>(_FactDepartureLocationDetails_QNAME, PICargoLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FactPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FactPaymentDetails")
    public JAXBElement<FactPaymentDetailsType> createFactPaymentDetails(FactPaymentDetailsType value) {
        return new JAXBElement<FactPaymentDetailsType>(_FactPaymentDetails_QNAME, FactPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FactPaymentOldDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FactPaymentOldDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FactPaymentOldDetails")
    public JAXBElement<FactPaymentOldDetailsType> createFactPaymentOldDetails(FactPaymentOldDetailsType value) {
        return new JAXBElement<FactPaymentOldDetailsType>(_FactPaymentOldDetails_QNAME, FactPaymentOldDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDocumentSubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsDocumentSubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FinancialSettlementSubjectDetails")
    public JAXBElement<CustomsDocumentSubjectDetailsType> createFinancialSettlementSubjectDetails(CustomsDocumentSubjectDetailsType value) {
        return new JAXBElement<CustomsDocumentSubjectDetailsType>(_FinancialSettlementSubjectDetails_QNAME, CustomsDocumentSubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationMeansItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationMeansItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FirstIdentificationMeansItemDetails")
    public JAXBElement<IdentificationMeansItemDetailsType> createFirstIdentificationMeansItemDetails(IdentificationMeansItemDetailsType value) {
        return new JAXBElement<IdentificationMeansItemDetailsType>(_FirstIdentificationMeansItemDetails_QNAME, IdentificationMeansItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FlightDetails")
    public JAXBElement<FlightDetailsType> createFlightDetails(FlightDetailsType value) {
        return new JAXBElement<FlightDetailsType>(_FlightDetails_QNAME, FlightDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ForeignAddContractDetails")
    public JAXBElement<DocDetailsV4Type> createForeignAddContractDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_ForeignAddContractDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ForeignMainContractDetails")
    public JAXBElement<DocDetailsV4Type> createForeignMainContractDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_ForeignMainContractDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectBaseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectBaseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ForeignTradeConsigneeDetails")
    public JAXBElement<CASubjectBaseDetailsType> createForeignTradeConsigneeDetails(CASubjectBaseDetailsType value) {
        return new JAXBElement<CASubjectBaseDetailsType>(_ForeignTradeConsigneeDetails_QNAME, CASubjectBaseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectBaseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectBaseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ForeignTradeConsignorDetails")
    public JAXBElement<CASubjectBaseDetailsType> createForeignTradeConsignorDetails(CASubjectBaseDetailsType value) {
        return new JAXBElement<CASubjectBaseDetailsType>(_ForeignTradeConsignorDetails_QNAME, CASubjectBaseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForeignTradeContractDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ForeignTradeContractDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ForeignTradeContractDetails")
    public JAXBElement<ForeignTradeContractDetailsType> createForeignTradeContractDetails(ForeignTradeContractDetailsType value) {
        return new JAXBElement<ForeignTradeContractDetailsType>(_ForeignTradeContractDetails_QNAME, ForeignTradeContractDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectBaseDetailsV3Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectBaseDetailsV3Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ForwarderDetails")
    public JAXBElement<CASubjectBaseDetailsV3Type> createForwarderDetails(CASubjectBaseDetailsV3Type value) {
        return new JAXBElement<CASubjectBaseDetailsV3Type>(_ForwarderDetails_QNAME, CASubjectBaseDetailsV3Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreePracticeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FreePracticeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FreePracticeDetails")
    public JAXBElement<FreePracticeDetailsType> createFreePracticeDetails(FreePracticeDetailsType value) {
        return new JAXBElement<FreePracticeDetailsType>(_FreePracticeDetails_QNAME, FreePracticeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WarehouseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WarehouseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "FreeWarehouseDetails")
    public JAXBElement<WarehouseDetailsType> createFreeWarehouseDetails(WarehouseDetailsType value) {
        return new JAXBElement<WarehouseDetailsType>(_FreeWarehouseDetails_QNAME, WarehouseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GCGuaranteeConfirmDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GCGuaranteeConfirmDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GCGuaranteeConfirmDocDetails")
    public JAXBElement<GCGuaranteeConfirmDocDetailsType> createGCGuaranteeConfirmDocDetails(GCGuaranteeConfirmDocDetailsType value) {
        return new JAXBElement<GCGuaranteeConfirmDocDetailsType>(_GCGuaranteeConfirmDocDetails_QNAME, GCGuaranteeConfirmDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDCChangeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GDCChangeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDCChangeDetails")
    public JAXBElement<GDCChangeDetailsType> createGDCChangeDetails(GDCChangeDetailsType value) {
        return new JAXBElement<GDCChangeDetailsType>(_GDCChangeDetails_QNAME, GDCChangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDCExchFactPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GDCExchFactPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDCExchFactPaymentDetails")
    public JAXBElement<GDCExchFactPaymentDetailsType> createGDCExchFactPaymentDetails(GDCExchFactPaymentDetailsType value) {
        return new JAXBElement<GDCExchFactPaymentDetailsType>(_GDCExchFactPaymentDetails_QNAME, GDCExchFactPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDCExchGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GDCExchGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDCExchGoodsItemDetails")
    public JAXBElement<GDCExchGoodsItemDetailsType> createGDCExchGoodsItemDetails(GDCExchGoodsItemDetailsType value) {
        return new JAXBElement<GDCExchGoodsItemDetailsType>(_GDCExchGoodsItemDetails_QNAME, GDCExchGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDCExchGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GDCExchGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDCExchGoodsShipmentDetails")
    public JAXBElement<GDCExchGoodsShipmentDetailsType> createGDCExchGoodsShipmentDetails(GDCExchGoodsShipmentDetailsType value) {
        return new JAXBElement<GDCExchGoodsShipmentDetailsType>(_GDCExchGoodsShipmentDetails_QNAME, GDCExchGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDCExchPaymentDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GDCExchPaymentDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDCExchPaymentDocDetails")
    public JAXBElement<GDCExchPaymentDocDetailsType> createGDCExchPaymentDocDetails(GDCExchPaymentDocDetailsType value) {
        return new JAXBElement<GDCExchPaymentDocDetailsType>(_GDCExchPaymentDocDetails_QNAME, GDCExchPaymentDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDCItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GDCItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDCItemDetails")
    public JAXBElement<GDCItemDetailsType> createGDCItemDetails(GDCItemDetailsType value) {
        return new JAXBElement<GDCItemDetailsType>(_GDCItemDetails_QNAME, GDCItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatoryPersonDetailsV2Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatoryPersonDetailsV2Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDCSignatoryPersonDetails")
    public JAXBElement<SignatoryPersonDetailsV2Type> createGDCSignatoryPersonDetails(SignatoryPersonDetailsV2Type value) {
        return new JAXBElement<SignatoryPersonDetailsV2Type>(_GDCSignatoryPersonDetails_QNAME, SignatoryPersonDetailsV2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatoryRepresentativeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatoryRepresentativeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDCSignatoryRepresentativeDetails")
    public JAXBElement<SignatoryRepresentativeDetailsType> createGDCSignatoryRepresentativeDetails(SignatoryRepresentativeDetailsType value) {
        return new JAXBElement<SignatoryRepresentativeDetailsType>(_GDCSignatoryRepresentativeDetails_QNAME, SignatoryRepresentativeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDConsignmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GDConsignmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDConsignmentDetails")
    public JAXBElement<GDConsignmentDetailsType> createGDConsignmentDetails(GDConsignmentDetailsType value) {
        return new JAXBElement<GDConsignmentDetailsType>(_GDConsignmentDetails_QNAME, GDConsignmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDFactPaymentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GDFactPaymentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDFactPaymentDetails")
    public JAXBElement<GDFactPaymentDetailsType> createGDFactPaymentDetails(GDFactPaymentDetailsType value) {
        return new JAXBElement<GDFactPaymentDetailsType>(_GDFactPaymentDetails_QNAME, GDFactPaymentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GDGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDGoodsItemDetails")
    public JAXBElement<GDGoodsItemDetailsType> createGDGoodsItemDetails(GDGoodsItemDetailsType value) {
        return new JAXBElement<GDGoodsItemDetailsType>(_GDGoodsItemDetails_QNAME, GDGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GDGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDGoodsShipmentDetails")
    public JAXBElement<GDGoodsShipmentDetailsType> createGDGoodsShipmentDetails(GDGoodsShipmentDetailsType value) {
        return new JAXBElement<GDGoodsShipmentDetailsType>(_GDGoodsShipmentDetails_QNAME, GDGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDPaymentDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GDPaymentDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GDPaymentDocDetails")
    public JAXBElement<GDPaymentDocDetailsType> createGDPaymentDocDetails(GDPaymentDocDetailsType value) {
        return new JAXBElement<GDPaymentDocDetailsType>(_GDPaymentDocDetails_QNAME, GDPaymentDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsShipmentSubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsShipmentSubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GRAConsigneeDetails")
    public JAXBElement<GoodsShipmentSubjectDetailsType> createGRAConsigneeDetails(GoodsShipmentSubjectDetailsType value) {
        return new JAXBElement<GoodsShipmentSubjectDetailsType>(_GRAConsigneeDetails_QNAME, GoodsShipmentSubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GRAGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GRAGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GRAGoodsItemDetails")
    public JAXBElement<GRAGoodsItemDetailsType> createGRAGoodsItemDetails(GRAGoodsItemDetailsType value) {
        return new JAXBElement<GRAGoodsItemDetailsType>(_GRAGoodsItemDetails_QNAME, GRAGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GRAGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GRAGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GRAGoodsShipmentDetails")
    public JAXBElement<GRAGoodsShipmentDetailsType> createGRAGoodsShipmentDetails(GRAGoodsShipmentDetailsType value) {
        return new JAXBElement<GRAGoodsShipmentDetailsType>(_GRAGoodsShipmentDetails_QNAME, GRAGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GRAGuaranteeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GRAGuaranteeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GRAGuaranteeDetails")
    public JAXBElement<GRAGuaranteeDetailsType> createGRAGuaranteeDetails(GRAGuaranteeDetailsType value) {
        return new JAXBElement<GRAGuaranteeDetailsType>(_GRAGuaranteeDetails_QNAME, GRAGuaranteeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GRAPresentedDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GRAPresentedDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GRAPresentedDocDetails")
    public JAXBElement<GRAPresentedDocDetailsType> createGRAPresentedDocDetails(GRAPresentedDocDetailsType value) {
        return new JAXBElement<GRAPresentedDocDetailsType>(_GRAPresentedDocDetails_QNAME, GRAPresentedDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GeneralContractDetails")
    public JAXBElement<CADocBaseType> createGeneralContractDetails(CADocBaseType value) {
        return new JAXBElement<CADocBaseType>(_GeneralContractDetails_QNAME, CADocBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMeansListDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransportMeansListDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodLocationTransportMeansDetails")
    public JAXBElement<TransportMeansListDetailsType> createGoodLocationTransportMeansDetails(TransportMeansListDetailsType value) {
        return new JAXBElement<TransportMeansListDetailsType>(_GoodLocationTransportMeansDetails_QNAME, TransportMeansListDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsControlMeasureDetails")
    public JAXBElement<GoodsMeasureDetailsType> createGoodsControlMeasureDetails(GoodsMeasureDetailsType value) {
        return new JAXBElement<GoodsMeasureDetailsType>(_GoodsControlMeasureDetails_QNAME, GoodsMeasureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsDecisionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsDecisionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsDecisionDetails")
    public JAXBElement<GoodsDecisionDetailsType> createGoodsDecisionDetails(GoodsDecisionDetailsType value) {
        return new JAXBElement<GoodsDecisionDetailsType>(_GoodsDecisionDetails_QNAME, GoodsDecisionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsDeclarationChangeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsDeclarationChangeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsDeclarationChangeDetails")
    public JAXBElement<GoodsDeclarationChangeDetailsType> createGoodsDeclarationChangeDetails(GoodsDeclarationChangeDetailsType value) {
        return new JAXBElement<GoodsDeclarationChangeDetailsType>(_GoodsDeclarationChangeDetails_QNAME, GoodsDeclarationChangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsDisinfectionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsDisinfectionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsDisinfectionDetails")
    public JAXBElement<GoodsDisinfectionDetailsType> createGoodsDisinfectionDetails(GoodsDisinfectionDetailsType value) {
        return new JAXBElement<GoodsDisinfectionDetailsType>(_GoodsDisinfectionDetails_QNAME, GoodsDisinfectionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsItemGroupDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsItemGroupDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsItemGroupDetails")
    public JAXBElement<GoodsItemGroupDetailsType> createGoodsItemGroupDetails(GoodsItemGroupDetailsType value) {
        return new JAXBElement<GoodsItemGroupDetailsType>(_GoodsItemGroupDetails_QNAME, GoodsItemGroupDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessingDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsItemProcessingDetails")
    public JAXBElement<ProcessingDetailsType> createGoodsItemProcessingDetails(ProcessingDetailsType value) {
        return new JAXBElement<ProcessingDetailsType>(_GoodsItemProcessingDetails_QNAME, ProcessingDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubjectAddressDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubjectAddressDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsLocationAddressDetails")
    public JAXBElement<SubjectAddressDetailsType> createGoodsLocationAddressDetails(SubjectAddressDetailsType value) {
        return new JAXBElement<SubjectAddressDetailsType>(_GoodsLocationAddressDetails_QNAME, SubjectAddressDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsLocationDetails")
    public JAXBElement<GoodsLocationDetailsType> createGoodsLocationDetails(GoodsLocationDetailsType value) {
        return new JAXBElement<GoodsLocationDetailsType>(_GoodsLocationDetails_QNAME, GoodsLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsLocationDocDetails")
    public JAXBElement<CADocBaseType> createGoodsLocationDocDetails(CADocBaseType value) {
        return new JAXBElement<CADocBaseType>(_GoodsLocationDocDetails_QNAME, CADocBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAGoodsManufacturerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CAGoodsManufacturerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsManufacturerDetails")
    public JAXBElement<CAGoodsManufacturerDetailsType> createGoodsManufacturerDetails(CAGoodsManufacturerDetailsType value) {
        return new JAXBElement<CAGoodsManufacturerDetailsType>(_GoodsManufacturerDetails_QNAME, CAGoodsManufacturerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsMarkDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsMarkDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsMarkDetails")
    public JAXBElement<GoodsMarkDetailsType> createGoodsMarkDetails(GoodsMarkDetailsType value) {
        return new JAXBElement<GoodsMarkDetailsType>(_GoodsMarkDetails_QNAME, GoodsMarkDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsMeasureDetails")
    public JAXBElement<GoodsMeasureDetailsType> createGoodsMeasureDetails(GoodsMeasureDetailsType value) {
        return new JAXBElement<GoodsMeasureDetailsType>(_GoodsMeasureDetails_QNAME, GoodsMeasureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsPartViewDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsPartViewDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsPartViewDetails")
    public JAXBElement<GoodsPartViewDetailsType> createGoodsPartViewDetails(GoodsPartViewDetailsType value) {
        return new JAXBElement<GoodsPartViewDetailsType>(_GoodsPartViewDetails_QNAME, GoodsPartViewDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReleaseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsReleaseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsReleaseDetails")
    public JAXBElement<GoodsReleaseDetailsType> createGoodsReleaseDetails(GoodsReleaseDetailsType value) {
        return new JAXBElement<GoodsReleaseDetailsType>(_GoodsReleaseDetails_QNAME, GoodsReleaseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReleaseIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsReleaseIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsReleaseIdDetails")
    public JAXBElement<GoodsReleaseIdDetailsType> createGoodsReleaseIdDetails(GoodsReleaseIdDetailsType value) {
        return new JAXBElement<GoodsReleaseIdDetailsType>(_GoodsReleaseIdDetails_QNAME, GoodsReleaseIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsTraceabilityMeasureDetails")
    public JAXBElement<GoodsMeasureDetailsType> createGoodsTraceabilityMeasureDetails(GoodsMeasureDetailsType value) {
        return new JAXBElement<GoodsMeasureDetailsType>(_GoodsTraceabilityMeasureDetails_QNAME, GoodsMeasureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsUseRestrictionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsUseRestrictionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GoodsUseRestrictionDetails")
    public JAXBElement<GoodsUseRestrictionDetailsType> createGoodsUseRestrictionDetails(GoodsUseRestrictionDetailsType value) {
        return new JAXBElement<GoodsUseRestrictionDetailsType>(_GoodsUseRestrictionDetails_QNAME, GoodsUseRestrictionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuaranteeCertificateAgentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GuaranteeCertificateAgentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GuaranteeCertificateAgentDetails")
    public JAXBElement<GuaranteeCertificateAgentDetailsType> createGuaranteeCertificateAgentDetails(GuaranteeCertificateAgentDetailsType value) {
        return new JAXBElement<GuaranteeCertificateAgentDetailsType>(_GuaranteeCertificateAgentDetails_QNAME, GuaranteeCertificateAgentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CertificateDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CertificateDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GuaranteeCertificateDetails")
    public JAXBElement<CertificateDetailsType> createGuaranteeCertificateDetails(CertificateDetailsType value) {
        return new JAXBElement<CertificateDetailsType>(_GuaranteeCertificateDetails_QNAME, CertificateDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuaranteeCertificateIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GuaranteeCertificateIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GuaranteeCertificateIdDetails")
    public JAXBElement<GuaranteeCertificateIdDetailsType> createGuaranteeCertificateIdDetails(GuaranteeCertificateIdDetailsType value) {
        return new JAXBElement<GuaranteeCertificateIdDetailsType>(_GuaranteeCertificateIdDetails_QNAME, GuaranteeCertificateIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuaranteeCertificateInformationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GuaranteeCertificateInformationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GuaranteeCertificateInformationDetails")
    public JAXBElement<GuaranteeCertificateInformationDetailsType> createGuaranteeCertificateInformationDetails(GuaranteeCertificateInformationDetailsType value) {
        return new JAXBElement<GuaranteeCertificateInformationDetailsType>(_GuaranteeCertificateInformationDetails_QNAME, GuaranteeCertificateInformationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GuaranteeCertificateMarkDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GuaranteeCertificateMarkDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GuaranteeCertificateMarkDetails")
    public JAXBElement<GuaranteeCertificateMarkDetailsType> createGuaranteeCertificateMarkDetails(GuaranteeCertificateMarkDetailsType value) {
        return new JAXBElement<GuaranteeCertificateMarkDetailsType>(_GuaranteeCertificateMarkDetails_QNAME, GuaranteeCertificateMarkDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GuaranteeCustomsDocIdDetails")
    public JAXBElement<CustomsDocumentIdDetailsType> createGuaranteeCustomsDocIdDetails(CustomsDocumentIdDetailsType value) {
        return new JAXBElement<CustomsDocumentIdDetailsType>(_GuaranteeCustomsDocIdDetails_QNAME, CustomsDocumentIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GuaranteeDocDetails")
    public JAXBElement<CADocBaseType> createGuaranteeDocDetails(CADocBaseType value) {
        return new JAXBElement<CADocBaseType>(_GuaranteeDocDetails_QNAME, CADocBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CABusinessEntityDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CABusinessEntityDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "GuarantorDetails")
    public JAXBElement<CABusinessEntityDetailsType> createGuarantorDetails(CABusinessEntityDetailsType value) {
        return new JAXBElement<CABusinessEntityDetailsType>(_GuarantorDetails_QNAME, CABusinessEntityDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "HouseWaybillDetails")
    public JAXBElement<DocDetailsV4Type> createHouseWaybillDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_HouseWaybillDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IPObjectRegistryIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IPObjectRegistryIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "IPObjectRegistryIdDetails")
    public JAXBElement<IPObjectRegistryIdDetailsType> createIPObjectRegistryIdDetails(IPObjectRegistryIdDetailsType value) {
        return new JAXBElement<IPObjectRegistryIdDetailsType>(_IPObjectRegistryIdDetails_QNAME, IPObjectRegistryIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "IdenticalGoodsMeasureDetails")
    public JAXBElement<GoodsMeasureDetailsType> createIdenticalGoodsMeasureDetails(GoodsMeasureDetailsType value) {
        return new JAXBElement<GoodsMeasureDetailsType>(_IdenticalGoodsMeasureDetails_QNAME, GoodsMeasureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationMeansDataUnitDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationMeansDataUnitDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "IdentificationMeansDataUnitDetails")
    public JAXBElement<IdentificationMeansDataUnitDetailsType> createIdentificationMeansDataUnitDetails(IdentificationMeansDataUnitDetailsType value) {
        return new JAXBElement<IdentificationMeansDataUnitDetailsType>(_IdentificationMeansDataUnitDetails_QNAME, IdentificationMeansDataUnitDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "IdentificationMeansDetails")
    public JAXBElement<IdentificationMeansDetailsType> createIdentificationMeansDetails(IdentificationMeansDetailsType value) {
        return new JAXBElement<IdentificationMeansDetailsType>(_IdentificationMeansDetails_QNAME, IdentificationMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationMeansItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationMeansItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "IdentificationMeansItemDetails")
    public JAXBElement<IdentificationMeansItemDetailsType> createIdentificationMeansItemDetails(IdentificationMeansItemDetailsType value) {
        return new JAXBElement<IdentificationMeansItemDetailsType>(_IdentificationMeansItemDetails_QNAME, IdentificationMeansItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationMeansListDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationMeansListDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "IdentificationMeansListDetails")
    public JAXBElement<IdentificationMeansListDetailsType> createIdentificationMeansListDetails(IdentificationMeansListDetailsType value) {
        return new JAXBElement<IdentificationMeansListDetailsType>(_IdentificationMeansListDetails_QNAME, IdentificationMeansListDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationMeansRangeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationMeansRangeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "IdentificationMeansRangeDetails")
    public JAXBElement<IdentificationMeansRangeDetailsType> createIdentificationMeansRangeDetails(IdentificationMeansRangeDetailsType value) {
        return new JAXBElement<IdentificationMeansRangeDetailsType>(_IdentificationMeansRangeDetails_QNAME, IdentificationMeansRangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportCarInfoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportCarInfoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ImportCarInfoDetails")
    public JAXBElement<ImportCarInfoDetailsType> createImportCarInfoDetails(ImportCarInfoDetailsType value) {
        return new JAXBElement<ImportCarInfoDetailsType>(_ImportCarInfoDetails_QNAME, ImportCarInfoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportCarProcessingResultInfoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportCarProcessingResultInfoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ImportCarProcessingResultInfoDetails")
    public JAXBElement<ImportCarProcessingResultInfoDetailsType> createImportCarProcessingResultInfoDetails(ImportCarProcessingResultInfoDetailsType value) {
        return new JAXBElement<ImportCarProcessingResultInfoDetailsType>(_ImportCarProcessingResultInfoDetails_QNAME, ImportCarProcessingResultInfoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncidentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncidentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "IncidentDetails")
    public JAXBElement<IncidentDetailsType> createIncidentDetails(IncidentDetailsType value) {
        return new JAXBElement<IncidentDetailsType>(_IncidentDetails_QNAME, IncidentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IneffectiveTaxRateDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IneffectiveTaxRateDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "IneffectiveTaxRateDetails")
    public JAXBElement<IneffectiveTaxRateDetailsType> createIneffectiveTaxRateDetails(IneffectiveTaxRateDetailsType value) {
        return new JAXBElement<IneffectiveTaxRateDetailsType>(_IneffectiveTaxRateDetails_QNAME, IneffectiveTaxRateDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InformationSourceDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InformationSourceDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "InformationSourceDetails")
    public JAXBElement<InformationSourceDetailsType> createInformationSourceDetails(InformationSourceDetailsType value) {
        return new JAXBElement<InformationSourceDetailsType>(_InformationSourceDetails_QNAME, InformationSourceDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InspectionDocIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InspectionDocIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "InspectionDocIdDetails")
    public JAXBElement<InspectionDocIdDetailsType> createInspectionDocIdDetails(InspectionDocIdDetailsType value) {
        return new JAXBElement<InspectionDocIdDetailsType>(_InspectionDocIdDetails_QNAME, InspectionDocIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvestmentGoodsIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvestmentGoodsIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "InvestmentGoodsIdDetails")
    public JAXBElement<InvestmentGoodsIdDetailsType> createInvestmentGoodsIdDetails(InvestmentGoodsIdDetailsType value) {
        return new JAXBElement<InvestmentGoodsIdDetailsType>(_InvestmentGoodsIdDetails_QNAME, InvestmentGoodsIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceValueBaseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvoiceValueBaseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "InvoiceValueDetails")
    public JAXBElement<InvoiceValueBaseDetailsType> createInvoiceValueDetails(InvoiceValueBaseDetailsType value) {
        return new JAXBElement<InvoiceValueBaseDetailsType>(_InvoiceValueDetails_QNAME, InvoiceValueBaseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ItemDetails")
    public JAXBElement<ItemDetailsType> createItemDetails(ItemDetailsType value) {
        return new JAXBElement<ItemDetailsType>(_ItemDetails_QNAME, ItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryPointDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItineraryPointDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ItineraryPointDetails")
    public JAXBElement<ItineraryPointDetailsType> createItineraryPointDetails(ItineraryPointDetailsType value) {
        return new JAXBElement<ItineraryPointDetailsType>(_ItineraryPointDetails_QNAME, ItineraryPointDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "JointlyLiablePersonDetails")
    public JAXBElement<CASubjectDetailsType> createJointlyLiablePersonDetails(CASubjectDetailsType value) {
        return new JAXBElement<CASubjectDetailsType>(_JointlyLiablePersonDetails_QNAME, CASubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GDCSignatoryDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GDCSignatoryDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "KDTSignatoryDetails")
    public JAXBElement<GDCSignatoryDetailsType> createKDTSignatoryDetails(GDCSignatoryDetailsType value) {
        return new JAXBElement<GDCSignatoryDetailsType>(_KDTSignatoryDetails_QNAME, GDCSignatoryDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LabelRangeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LabelRangeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "LabelRangeDetails")
    public JAXBElement<LabelRangeDetailsType> createLabelRangeDetails(LabelRangeDetailsType value) {
        return new JAXBElement<LabelRangeDetailsType>(_LabelRangeDetails_QNAME, LabelRangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationMeansItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationMeansItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "LastIdentificationMeansItemDetails")
    public JAXBElement<IdentificationMeansItemDetailsType> createLastIdentificationMeansItemDetails(IdentificationMeansItemDetailsType value) {
        return new JAXBElement<IdentificationMeansItemDetailsType>(_LastIdentificationMeansItemDetails_QNAME, IdentificationMeansItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicensedGoodsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LicensedGoodsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "LicensedGoodsDetails")
    public JAXBElement<LicensedGoodsDetailsType> createLicensedGoodsDetails(LicensedGoodsDetailsType value) {
        return new JAXBElement<LicensedGoodsDetailsType>(_LicensedGoodsDetails_QNAME, LicensedGoodsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LostGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LostGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "LostGoodsItemDetails")
    public JAXBElement<LostGoodsItemDetailsType> createLostGoodsItemDetails(LostGoodsItemDetailsType value) {
        return new JAXBElement<LostGoodsItemDetailsType>(_LostGoodsItemDetails_QNAME, LostGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MainteanceEquipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MainteanceEquipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "MainteanceEquipmentDetails")
    public JAXBElement<MainteanceEquipmentDetailsType> createMainteanceEquipmentDetails(MainteanceEquipmentDetailsType value) {
        return new JAXBElement<MainteanceEquipmentDetailsType>(_MainteanceEquipmentDetails_QNAME, MainteanceEquipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsV2Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsV2Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ManufacturerDetails")
    public JAXBElement<CASubjectDetailsV2Type> createManufacturerDetails(CASubjectDetailsV2Type value) {
        return new JAXBElement<CASubjectDetailsV2Type>(_ManufacturerDetails_QNAME, CASubjectDetailsV2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaritimeHealthDeclarationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MaritimeHealthDeclarationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "MaritimeHealthDeclarationDetails")
    public JAXBElement<MaritimeHealthDeclarationDetailsType> createMaritimeHealthDeclarationDetails(MaritimeHealthDeclarationDetailsType value) {
        return new JAXBElement<MaritimeHealthDeclarationDetailsType>(_MaritimeHealthDeclarationDetails_QNAME, MaritimeHealthDeclarationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemAvailabilityDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemAvailabilityDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "MedicineDetails")
    public JAXBElement<ItemAvailabilityDetailsType> createMedicineDetails(ItemAvailabilityDetailsType value) {
        return new JAXBElement<ItemAvailabilityDetailsType>(_MedicineDetails_QNAME, ItemAvailabilityDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Method1AddSumDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Method1AddSumDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "Method1AddCostsDetails")
    public JAXBElement<Method1AddSumDetailsType> createMethod1AddCostsDetails(Method1AddSumDetailsType value) {
        return new JAXBElement<Method1AddSumDetailsType>(_Method1AddCostsDetails_QNAME, Method1AddSumDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Method1BasisCalculationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Method1BasisCalculationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "Method1BasisCalculationDetails")
    public JAXBElement<Method1BasisCalculationDetailsType> createMethod1BasisCalculationDetails(Method1BasisCalculationDetailsType value) {
        return new JAXBElement<Method1BasisCalculationDetailsType>(_Method1BasisCalculationDetails_QNAME, Method1BasisCalculationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Method1DeductionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Method1DeductionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "Method1DeductionDetails")
    public JAXBElement<Method1DeductionDetailsType> createMethod1DeductionDetails(Method1DeductionDetailsType value) {
        return new JAXBElement<Method1DeductionDetailsType>(_Method1DeductionDetails_QNAME, Method1DeductionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NSDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NSDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "NSDetails")
    public JAXBElement<NSDetailsType> createNSDetails(NSDetailsType value) {
        return new JAXBElement<NSDetailsType>(_NSDetails_QNAME, NSDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NSDocumentsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NSDocumentsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "NSDocumentsDetails")
    public JAXBElement<NSDocumentsDetailsType> createNSDocumentsDetails(NSDocumentsDetailsType value) {
        return new JAXBElement<NSDocumentsDetailsType>(_NSDocumentsDetails_QNAME, NSDocumentsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NSTransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NSTransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "NSTransportMeansDetails")
    public JAXBElement<NSTransportMeansDetailsType> createNSTransportMeansDetails(NSTransportMeansDetailsType value) {
        return new JAXBElement<NSTransportMeansDetailsType>(_NSTransportMeansDetails_QNAME, NSTransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NegotiableInstrumentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NegotiableInstrumentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "NegotiableInstrumentDetails")
    public JAXBElement<NegotiableInstrumentDetailsType> createNegotiableInstrumentDetails(NegotiableInstrumentDetailsType value) {
        return new JAXBElement<NegotiableInstrumentDetailsType>(_NegotiableInstrumentDetails_QNAME, NegotiableInstrumentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NeighboringCheckPointDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NeighboringCheckPointDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "NeighboringCheckPointDetails")
    public JAXBElement<NeighboringCheckPointDetailsType> createNeighboringCheckPointDetails(NeighboringCheckPointDetailsType value) {
        return new JAXBElement<NeighboringCheckPointDetailsType>(_NeighboringCheckPointDetails_QNAME, NeighboringCheckPointDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfficerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfficerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "OfficerDetails")
    public JAXBElement<OfficerDetailsType> createOfficerDetails(OfficerDetailsType value) {
        return new JAXBElement<OfficerDetailsType>(_OfficerDetails_QNAME, OfficerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReasonDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReasonDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "OpeningReasonDocDetails")
    public JAXBElement<ReasonDocDetailsType> createOpeningReasonDocDetails(ReasonDocDetailsType value) {
        return new JAXBElement<ReasonDocDetailsType>(_OpeningReasonDocDetails_QNAME, ReasonDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatorDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatorDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "OperatorDetails")
    public JAXBElement<OperatorDetailsType> createOperatorDetails(OperatorDetailsType value) {
        return new JAXBElement<OperatorDetailsType>(_OperatorDetails_QNAME, OperatorDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CACountryDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CACountryDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "OriginCountryDetails")
    public JAXBElement<CACountryDetailsType> createOriginCountryDetails(CACountryDetailsType value) {
        return new JAXBElement<CACountryDetailsType>(_OriginCountryDetails_QNAME, CACountryDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDCorrectionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDCorrectionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDCorrectionDetails")
    public JAXBElement<PDCorrectionDetailsType> createPDCorrectionDetails(PDCorrectionDetailsType value) {
        return new JAXBElement<PDCorrectionDetailsType>(_PDCorrectionDetails_QNAME, PDCorrectionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDCustomsDecisionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDCustomsDecisionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDCustomsDecisionDetails")
    public JAXBElement<PDCustomsDecisionDetailsType> createPDCustomsDecisionDetails(PDCustomsDecisionDetailsType value) {
        return new JAXBElement<PDCustomsDecisionDetailsType>(_PDCustomsDecisionDetails_QNAME, PDCustomsDecisionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDDecisionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDDecisionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDDecisionDetails")
    public JAXBElement<PDDecisionDetailsType> createPDDecisionDetails(PDDecisionDetailsType value) {
        return new JAXBElement<PDDecisionDetailsType>(_PDDecisionDetails_QNAME, PDDecisionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDDeclarantDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDDeclarantDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDDeclarantDetails")
    public JAXBElement<PDDeclarantDetailsType> createPDDeclarantDetails(PDDeclarantDetailsType value) {
        return new JAXBElement<PDDeclarantDetailsType>(_PDDeclarantDetails_QNAME, PDDeclarantDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDDeclaredGoodsCategoryDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDDeclaredGoodsCategoryDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDDeclaredGoodsInfoDetails")
    public JAXBElement<PDDeclaredGoodsCategoryDetailsType> createPDDeclaredGoodsInfoDetails(PDDeclaredGoodsCategoryDetailsType value) {
        return new JAXBElement<PDDeclaredGoodsCategoryDetailsType>(_PDDeclaredGoodsInfoDetails_QNAME, PDDeclaredGoodsCategoryDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDExchGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDExchGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDExchGoodsShipmentDetails")
    public JAXBElement<PDExchGoodsShipmentDetailsType> createPDExchGoodsShipmentDetails(PDExchGoodsShipmentDetailsType value) {
        return new JAXBElement<PDExchGoodsShipmentDetailsType>(_PDExchGoodsShipmentDetails_QNAME, PDExchGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDGoodsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDGoodsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDGoodsDetails")
    public JAXBElement<PDGoodsDetailsType> createPDGoodsDetails(PDGoodsDetailsType value) {
        return new JAXBElement<PDGoodsDetailsType>(_PDGoodsDetails_QNAME, PDGoodsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDGoodsItemDetails")
    public JAXBElement<PDGoodsItemDetailsType> createPDGoodsItemDetails(PDGoodsItemDetailsType value) {
        return new JAXBElement<PDGoodsItemDetailsType>(_PDGoodsItemDetails_QNAME, PDGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDGoodsListDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDGoodsListDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDGoodsListDetails")
    public JAXBElement<PDGoodsListDetailsType> createPDGoodsListDetails(PDGoodsListDetailsType value) {
        return new JAXBElement<PDGoodsListDetailsType>(_PDGoodsListDetails_QNAME, PDGoodsListDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDGoodsShipmentDetails")
    public JAXBElement<PDGoodsShipmentDetailsType> createPDGoodsShipmentDetails(PDGoodsShipmentDetailsType value) {
        return new JAXBElement<PDGoodsShipmentDetailsType>(_PDGoodsShipmentDetails_QNAME, PDGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDMarkDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDMarkDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDMarkDetails")
    public JAXBElement<PDMarkDetailsType> createPDMarkDetails(PDMarkDetailsType value) {
        return new JAXBElement<PDMarkDetailsType>(_PDMarkDetails_QNAME, PDMarkDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDMoneyDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDMoneyDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDMoneyDetails")
    public JAXBElement<PDMoneyDetailsType> createPDMoneyDetails(PDMoneyDetailsType value) {
        return new JAXBElement<PDMoneyDetailsType>(_PDMoneyDetails_QNAME, PDMoneyDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDMoneyOwnerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDMoneyOwnerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDMoneyOwnerDetails")
    public JAXBElement<PDMoneyOwnerDetailsType> createPDMoneyOwnerDetails(PDMoneyOwnerDetailsType value) {
        return new JAXBElement<PDMoneyOwnerDetailsType>(_PDMoneyOwnerDetails_QNAME, PDMoneyOwnerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDMoneySourceDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDMoneySourceDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDMoneySourceDetails")
    public JAXBElement<PDMoneySourceDetailsType> createPDMoneySourceDetails(PDMoneySourceDetailsType value) {
        return new JAXBElement<PDMoneySourceDetailsType>(_PDMoneySourceDetails_QNAME, PDMoneySourceDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDMoneyTransportationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDMoneyTransportationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDMoneyTransportationDetails")
    public JAXBElement<PDMoneyTransportationDetailsType> createPDMoneyTransportationDetails(PDMoneyTransportationDetailsType value) {
        return new JAXBElement<PDMoneyTransportationDetailsType>(_PDMoneyTransportationDetails_QNAME, PDMoneyTransportationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDMoneyUsageDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDMoneyUsageDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDMoneyUsageDetails")
    public JAXBElement<PDMoneyUsageDetailsType> createPDMoneyUsageDetails(PDMoneyUsageDetailsType value) {
        return new JAXBElement<PDMoneyUsageDetailsType>(_PDMoneyUsageDetails_QNAME, PDMoneyUsageDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDSharePartItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDSharePartItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDSharePartItemDetails")
    public JAXBElement<PDSharePartItemDetailsType> createPDSharePartItemDetails(PDSharePartItemDetailsType value) {
        return new JAXBElement<PDSharePartItemDetailsType>(_PDSharePartItemDetails_QNAME, PDSharePartItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDTransitMarkDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDTransitMarkDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDTransitMarkDetails")
    public JAXBElement<PDTransitMarkDetailsType> createPDTransitMarkDetails(PDTransitMarkDetailsType value) {
        return new JAXBElement<PDTransitMarkDetailsType>(_PDTransitMarkDetails_QNAME, PDTransitMarkDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDTransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDTransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDTransportMeansDetails")
    public JAXBElement<PDTransportMeansDetailsType> createPDTransportMeansDetails(PDTransportMeansDetailsType value) {
        return new JAXBElement<PDTransportMeansDetailsType>(_PDTransportMeansDetails_QNAME, PDTransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDTransportMeansIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDTransportMeansIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDTransportMeansIdDetails")
    public JAXBElement<PDTransportMeansIdDetailsType> createPDTransportMeansIdDetails(PDTransportMeansIdDetailsType value) {
        return new JAXBElement<PDTransportMeansIdDetailsType>(_PDTransportMeansIdDetails_QNAME, PDTransportMeansIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PDTransportMeansItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PDTransportMeansItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PDTransportMeansItemDetails")
    public JAXBElement<PDTransportMeansItemDetailsType> createPDTransportMeansItemDetails(PDTransportMeansItemDetailsType value) {
        return new JAXBElement<PDTransportMeansItemDetailsType>(_PDTransportMeansItemDetails_QNAME, PDTransportMeansItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGCGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PGCGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PGCGoodsItemDetails")
    public JAXBElement<PGCGoodsItemDetailsType> createPGCGoodsItemDetails(PGCGoodsItemDetailsType value) {
        return new JAXBElement<PGCGoodsItemDetailsType>(_PGCGoodsItemDetails_QNAME, PGCGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGCGoodsItemGuaranteeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PGCGoodsItemGuaranteeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PGCGoodsItemGuaranteeDetails")
    public JAXBElement<PGCGoodsItemGuaranteeDetailsType> createPGCGoodsItemGuaranteeDetails(PGCGoodsItemGuaranteeDetailsType value) {
        return new JAXBElement<PGCGoodsItemGuaranteeDetailsType>(_PGCGoodsItemGuaranteeDetails_QNAME, PGCGoodsItemGuaranteeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGCGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PGCGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PGCGoodsShipmentDetails")
    public JAXBElement<PGCGoodsShipmentDetailsType> createPGCGoodsShipmentDetails(PGCGoodsShipmentDetailsType value) {
        return new JAXBElement<PGCGoodsShipmentDetailsType>(_PGCGoodsShipmentDetails_QNAME, PGCGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGCGuaranteeAmountDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PGCGuaranteeAmountDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PGCGuaranteeAmountDetails")
    public JAXBElement<PGCGuaranteeAmountDetailsType> createPGCGuaranteeAmountDetails(PGCGuaranteeAmountDetailsType value) {
        return new JAXBElement<PGCGuaranteeAmountDetailsType>(_PGCGuaranteeAmountDetails_QNAME, PGCGuaranteeAmountDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PGCGuaranteeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PGCGuaranteeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PGCGuaranteeDetails")
    public JAXBElement<PGCGuaranteeDetailsType> createPGCGuaranteeDetails(PGCGuaranteeDetailsType value) {
        return new JAXBElement<PGCGuaranteeDetailsType>(_PGCGuaranteeDetails_QNAME, PGCGuaranteeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimplePresentedDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SimplePresentedDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PGCPresentedDocDetails")
    public JAXBElement<SimplePresentedDocDetailsType> createPGCPresentedDocDetails(SimplePresentedDocDetailsType value) {
        return new JAXBElement<SimplePresentedDocDetailsType>(_PGCPresentedDocDetails_QNAME, SimplePresentedDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIARBorderTransportDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIARBorderTransportDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIARBorderTransportDetails")
    public JAXBElement<PIARBorderTransportDetailsType> createPIARBorderTransportDetails(PIARBorderTransportDetailsType value) {
        return new JAXBElement<PIARBorderTransportDetailsType>(_PIARBorderTransportDetails_QNAME, PIARBorderTransportDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIARConsignmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIARConsignmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIARConsignmentDetails")
    public JAXBElement<PIARConsignmentDetailsType> createPIARConsignmentDetails(PIARConsignmentDetailsType value) {
        return new JAXBElement<PIARConsignmentDetailsType>(_PIARConsignmentDetails_QNAME, PIARConsignmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIARConsignmentItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIARConsignmentItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIARConsignmentItemDetails")
    public JAXBElement<PIARConsignmentItemDetailsType> createPIARConsignmentItemDetails(PIARConsignmentItemDetailsType value) {
        return new JAXBElement<PIARConsignmentItemDetailsType>(_PIARConsignmentItemDetails_QNAME, PIARConsignmentItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIPersonOnBoardMainDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIPersonOnBoardMainDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIARCrewMemberDetails")
    public JAXBElement<PIPersonOnBoardMainDetailsType> createPIARCrewMemberDetails(PIPersonOnBoardMainDetailsType value) {
        return new JAXBElement<PIPersonOnBoardMainDetailsType>(_PIARCrewMemberDetails_QNAME, PIPersonOnBoardMainDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIARDiseasedPersonDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIARDiseasedPersonDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIARDiseasedPersonDetails")
    public JAXBElement<PIARDiseasedPersonDetailsType> createPIARDiseasedPersonDetails(PIARDiseasedPersonDetailsType value) {
        return new JAXBElement<PIARDiseasedPersonDetailsType>(_PIARDiseasedPersonDetails_QNAME, PIARDiseasedPersonDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIARDisinfestationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIARDisinfestationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIARDisinfestationDetails")
    public JAXBElement<PIARDisinfestationDetailsType> createPIARDisinfestationDetails(PIARDisinfestationDetailsType value) {
        return new JAXBElement<PIARDisinfestationDetailsType>(_PIARDisinfestationDetails_QNAME, PIARDisinfestationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIAREntryCheckPointDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIAREntryCheckPointDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIAREntryCheckPointDetails")
    public JAXBElement<PIAREntryCheckPointDetailsType> createPIAREntryCheckPointDetails(PIAREntryCheckPointDetailsType value) {
        return new JAXBElement<PIAREntryCheckPointDetailsType>(_PIAREntryCheckPointDetails_QNAME, PIAREntryCheckPointDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIAREpidemicControlDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIAREpidemicControlDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIAREpidemicControlDetails")
    public JAXBElement<PIAREpidemicControlDetailsType> createPIAREpidemicControlDetails(PIAREpidemicControlDetailsType value) {
        return new JAXBElement<PIAREpidemicControlDetailsType>(_PIAREpidemicControlDetails_QNAME, PIAREpidemicControlDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PICargoLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PICargoLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIARLoadingLocationDetails")
    public JAXBElement<PICargoLocationDetailsType> createPIARLoadingLocationDetails(PICargoLocationDetailsType value) {
        return new JAXBElement<PICargoLocationDetailsType>(_PIARLoadingLocationDetails_QNAME, PICargoLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIPersonOnBoardMainDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIPersonOnBoardMainDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIARMasterDetails")
    public JAXBElement<PIPersonOnBoardMainDetailsType> createPIARMasterDetails(PIPersonOnBoardMainDetailsType value) {
        return new JAXBElement<PIPersonOnBoardMainDetailsType>(_PIARMasterDetails_QNAME, PIPersonOnBoardMainDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIPersonOnBoardMainDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIPersonOnBoardMainDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIARPassengerDetails")
    public JAXBElement<PIPersonOnBoardMainDetailsType> createPIARPassengerDetails(PIPersonOnBoardMainDetailsType value) {
        return new JAXBElement<PIPersonOnBoardMainDetailsType>(_PIARPassengerDetails_QNAME, PIPersonOnBoardMainDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIARPestControlDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIARPestControlDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIARPestControlDetails")
    public JAXBElement<PIARPestControlDetailsType> createPIARPestControlDetails(PIARPestControlDetailsType value) {
        return new JAXBElement<PIARPestControlDetailsType>(_PIARPestControlDetails_QNAME, PIARPestControlDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PICargoLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PICargoLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIARUnloadingLocationDetails")
    public JAXBElement<PICargoLocationDetailsType> createPIARUnloadingLocationDetails(PICargoLocationDetailsType value) {
        return new JAXBElement<PICargoLocationDetailsType>(_PIARUnloadingLocationDetails_QNAME, PICargoLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIATBorderTransportDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIATBorderTransportDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATBorderTransportDetails")
    public JAXBElement<PIATBorderTransportDetailsType> createPIATBorderTransportDetails(PIATBorderTransportDetailsType value) {
        return new JAXBElement<PIATBorderTransportDetailsType>(_PIATBorderTransportDetails_QNAME, PIATBorderTransportDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PICarrierDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PICarrierDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATCarrierDetails")
    public JAXBElement<PICarrierDetailsType> createPIATCarrierDetails(PICarrierDetailsType value) {
        return new JAXBElement<PICarrierDetailsType>(_PIATCarrierDetails_QNAME, PICarrierDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIATSubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIATSubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATConsigneeDetails")
    public JAXBElement<PIATSubjectDetailsType> createPIATConsigneeDetails(PIATSubjectDetailsType value) {
        return new JAXBElement<PIATSubjectDetailsType>(_PIATConsigneeDetails_QNAME, PIATSubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIATConsignmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIATConsignmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATConsignmentDetails")
    public JAXBElement<PIATConsignmentDetailsType> createPIATConsignmentDetails(PIATConsignmentDetailsType value) {
        return new JAXBElement<PIATConsignmentDetailsType>(_PIATConsignmentDetails_QNAME, PIATConsignmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIATConsignmentItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIATConsignmentItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATConsignmentItemDetails")
    public JAXBElement<PIATConsignmentItemDetailsType> createPIATConsignmentItemDetails(PIATConsignmentItemDetailsType value) {
        return new JAXBElement<PIATConsignmentItemDetailsType>(_PIATConsignmentItemDetails_QNAME, PIATConsignmentItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIATSubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIATSubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATConsignorDetails")
    public JAXBElement<PIATSubjectDetailsType> createPIATConsignorDetails(PIATSubjectDetailsType value) {
        return new JAXBElement<PIATSubjectDetailsType>(_PIATConsignorDetails_QNAME, PIATSubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIATEntryCheckPointDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIATEntryCheckPointDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATEntryCheckPointDetails")
    public JAXBElement<PIATEntryCheckPointDetailsType> createPIATEntryCheckPointDetails(PIATEntryCheckPointDetailsType value) {
        return new JAXBElement<PIATEntryCheckPointDetailsType>(_PIATEntryCheckPointDetails_QNAME, PIATEntryCheckPointDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryPointDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItineraryPointDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATItineraryPointDetails")
    public JAXBElement<ItineraryPointDetailsType> createPIATItineraryPointDetails(ItineraryPointDetailsType value) {
        return new JAXBElement<ItineraryPointDetailsType>(_PIATItineraryPointDetails_QNAME, ItineraryPointDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIATCargoLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIATCargoLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATLoadingLocationDetails")
    public JAXBElement<PIATCargoLocationDetailsType> createPIATLoadingLocationDetails(PIATCargoLocationDetailsType value) {
        return new JAXBElement<PIATCargoLocationDetailsType>(_PIATLoadingLocationDetails_QNAME, PIATCargoLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIATMainConsignmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIATMainConsignmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATMainConsignmentDetails")
    public JAXBElement<PIATMainConsignmentDetailsType> createPIATMainConsignmentDetails(PIATMainConsignmentDetailsType value) {
        return new JAXBElement<PIATMainConsignmentDetailsType>(_PIATMainConsignmentDetails_QNAME, PIATMainConsignmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIATTransportDocumentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIATTransportDocumentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATTransportDocumentDetails")
    public JAXBElement<PIATTransportDocumentDetailsType> createPIATTransportDocumentDetails(PIATTransportDocumentDetailsType value) {
        return new JAXBElement<PIATTransportDocumentDetailsType>(_PIATTransportDocumentDetails_QNAME, PIATTransportDocumentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIATTransportMeansItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIATTransportMeansItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATTransportMeansItemDetails")
    public JAXBElement<PIATTransportMeansItemDetailsType> createPIATTransportMeansItemDetails(PIATTransportMeansItemDetailsType value) {
        return new JAXBElement<PIATTransportMeansItemDetailsType>(_PIATTransportMeansItemDetails_QNAME, PIATTransportMeansItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIATCargoLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIATCargoLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIATUnloadingLocationDetails")
    public JAXBElement<PIATCargoLocationDetailsType> createPIATUnloadingLocationDetails(PIATCargoLocationDetailsType value) {
        return new JAXBElement<PIATCargoLocationDetailsType>(_PIATUnloadingLocationDetails_QNAME, PIATCargoLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsV2Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsV2Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIBuyerDetails")
    public JAXBElement<CASubjectDetailsV2Type> createPIBuyerDetails(CASubjectDetailsV2Type value) {
        return new JAXBElement<CASubjectDetailsV2Type>(_PIBuyerDetails_QNAME, CASubjectDetailsV2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsV2Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsV2Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PICarrierDetails")
    public JAXBElement<CASubjectDetailsV2Type> createPICarrierDetails(CASubjectDetailsV2Type value) {
        return new JAXBElement<CASubjectDetailsV2Type>(_PICarrierDetails_QNAME, CASubjectDetailsV2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsV2Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsV2Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIConsigneeDetails")
    public JAXBElement<CASubjectDetailsV2Type> createPIConsigneeDetails(CASubjectDetailsV2Type value) {
        return new JAXBElement<CASubjectDetailsV2Type>(_PIConsigneeDetails_QNAME, CASubjectDetailsV2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsV2Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsV2Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIConsignorDetails")
    public JAXBElement<CASubjectDetailsV2Type> createPIConsignorDetails(CASubjectDetailsV2Type value) {
        return new JAXBElement<CASubjectDetailsV2Type>(_PIConsignorDetails_QNAME, CASubjectDetailsV2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIContainerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIContainerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIContainerDetails")
    public JAXBElement<PIContainerDetailsType> createPIContainerDetails(PIContainerDetailsType value) {
        return new JAXBElement<PIContainerDetailsType>(_PIContainerDetails_QNAME, PIContainerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIDeclarantDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIDeclarantDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIDeclarantDetails")
    public JAXBElement<PIDeclarantDetailsType> createPIDeclarantDetails(PIDeclarantDetailsType value) {
        return new JAXBElement<PIDeclarantDetailsType>(_PIDeclarantDetails_QNAME, PIDeclarantDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIPresentedDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIPresentedDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIGoodsDocDetails")
    public JAXBElement<PIPresentedDocDetailsType> createPIGoodsDocDetails(PIPresentedDocDetailsType value) {
        return new JAXBElement<PIPresentedDocDetailsType>(_PIGoodsDocDetails_QNAME, PIPresentedDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIARRoutePointDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIARRoutePointDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIItineraryPointDetails")
    public JAXBElement<PIARRoutePointDetailsType> createPIItineraryPointDetails(PIARRoutePointDetailsType value) {
        return new JAXBElement<PIARRoutePointDetailsType>(_PIItineraryPointDetails_QNAME, PIARRoutePointDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIPrecedingDocDetails")
    public JAXBElement<DocDetailsV4Type> createPIPrecedingDocDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_PIPrecedingDocDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsV2Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsV2Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PISellerDetails")
    public JAXBElement<CASubjectDetailsV2Type> createPISellerDetails(CASubjectDetailsV2Type value) {
        return new JAXBElement<CASubjectDetailsV2Type>(_PISellerDetails_QNAME, CASubjectDetailsV2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIShipmentLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIShipmentLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIShipmentLocationDetails")
    public JAXBElement<PIShipmentLocationDetailsType> createPIShipmentLocationDetails(PIShipmentLocationDetailsType value) {
        return new JAXBElement<PIShipmentLocationDetailsType>(_PIShipmentLocationDetails_QNAME, PIShipmentLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PITranshipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PITranshipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PITranshipmentDetails")
    public JAXBElement<PITranshipmentDetailsType> createPITranshipmentDetails(PITranshipmentDetailsType value) {
        return new JAXBElement<PITranshipmentDetailsType>(_PITranshipmentDetails_QNAME, PITranshipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PITransitDeclarantDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PITransitDeclarantDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PITransitDeclarantDetails")
    public JAXBElement<PITransitDeclarantDetailsType> createPITransitDeclarantDetails(PITransitDeclarantDetailsType value) {
        return new JAXBElement<PITransitDeclarantDetailsType>(_PITransitDeclarantDetails_QNAME, PITransitDeclarantDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PITransitTransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PITransitTransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PITransitTransportMeansDetails")
    public JAXBElement<PITransitTransportMeansDetailsType> createPITransitTransportMeansDetails(PITransitTransportMeansDetailsType value) {
        return new JAXBElement<PITransitTransportMeansDetailsType>(_PITransitTransportMeansDetails_QNAME, PITransitTransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CarrierDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIUnionCarrierDetails")
    public JAXBElement<CarrierDetailsType> createPIUnionCarrierDetails(CarrierDetailsType value) {
        return new JAXBElement<CarrierDetailsType>(_PIUnionCarrierDetails_QNAME, CarrierDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIVBorderTransportDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIVBorderTransportDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVBorderTransportDetails")
    public JAXBElement<PIVBorderTransportDetailsType> createPIVBorderTransportDetails(PIVBorderTransportDetailsType value) {
        return new JAXBElement<PIVBorderTransportDetailsType>(_PIVBorderTransportDetails_QNAME, PIVBorderTransportDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIVCargoPackagePalletDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIVCargoPackagePalletDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVCargoPackagePalletDetails")
    public JAXBElement<PIVCargoPackagePalletDetailsType> createPIVCargoPackagePalletDetails(PIVCargoPackagePalletDetailsType value) {
        return new JAXBElement<PIVCargoPackagePalletDetailsType>(_PIVCargoPackagePalletDetails_QNAME, PIVCargoPackagePalletDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIVConsignmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIVConsignmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVConsignmentDetails")
    public JAXBElement<PIVConsignmentDetailsType> createPIVConsignmentDetails(PIVConsignmentDetailsType value) {
        return new JAXBElement<PIVConsignmentDetailsType>(_PIVConsignmentDetails_QNAME, PIVConsignmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIVConsignmentItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIVConsignmentItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVConsignmentItemDetails")
    public JAXBElement<PIVConsignmentItemDetailsType> createPIVConsignmentItemDetails(PIVConsignmentItemDetailsType value) {
        return new JAXBElement<PIVConsignmentItemDetailsType>(_PIVConsignmentItemDetails_QNAME, PIVConsignmentItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIVCrewMemberDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIVCrewMemberDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVCrewMemberDetails")
    public JAXBElement<PIVCrewMemberDetailsType> createPIVCrewMemberDetails(PIVCrewMemberDetailsType value) {
        return new JAXBElement<PIVCrewMemberDetailsType>(_PIVCrewMemberDetails_QNAME, PIVCrewMemberDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIVDiseasedPersonDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIVDiseasedPersonDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVDiseasedPersonDetails")
    public JAXBElement<PIVDiseasedPersonDetailsType> createPIVDiseasedPersonDetails(PIVDiseasedPersonDetailsType value) {
        return new JAXBElement<PIVDiseasedPersonDetailsType>(_PIVDiseasedPersonDetails_QNAME, PIVDiseasedPersonDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIVEntryCheckPointDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIVEntryCheckPointDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVEntryCheckPointDetails")
    public JAXBElement<PIVEntryCheckPointDetailsType> createPIVEntryCheckPointDetails(PIVEntryCheckPointDetailsType value) {
        return new JAXBElement<PIVEntryCheckPointDetailsType>(_PIVEntryCheckPointDetails_QNAME, PIVEntryCheckPointDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIVEpidemicControlDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIVEpidemicControlDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVEpidemicControlDetails")
    public JAXBElement<PIVEpidemicControlDetailsType> createPIVEpidemicControlDetails(PIVEpidemicControlDetailsType value) {
        return new JAXBElement<PIVEpidemicControlDetailsType>(_PIVEpidemicControlDetails_QNAME, PIVEpidemicControlDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIVRoutePointDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIVRoutePointDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVItineraryPointDetails")
    public JAXBElement<PIVRoutePointDetailsType> createPIVItineraryPointDetails(PIVRoutePointDetailsType value) {
        return new JAXBElement<PIVRoutePointDetailsType>(_PIVItineraryPointDetails_QNAME, PIVRoutePointDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PICargoLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PICargoLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVLoadingLocationDetails")
    public JAXBElement<PICargoLocationDetailsType> createPIVLoadingLocationDetails(PICargoLocationDetailsType value) {
        return new JAXBElement<PICargoLocationDetailsType>(_PIVLoadingLocationDetails_QNAME, PICargoLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIVPersonOnBoardDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIVPersonOnBoardDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVMasterDetails")
    public JAXBElement<PIVPersonOnBoardDetailsType> createPIVMasterDetails(PIVPersonOnBoardDetailsType value) {
        return new JAXBElement<PIVPersonOnBoardDetailsType>(_PIVMasterDetails_QNAME, PIVPersonOnBoardDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIVPassengerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIVPassengerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVPassengerDetails")
    public JAXBElement<PIVPassengerDetailsType> createPIVPassengerDetails(PIVPassengerDetailsType value) {
        return new JAXBElement<PIVPassengerDetailsType>(_PIVPassengerDetails_QNAME, PIVPassengerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PICargoLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PICargoLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIVUnloadingLocationDetails")
    public JAXBElement<PICargoLocationDetailsType> createPIVUnloadingLocationDetails(PICargoLocationDetailsType value) {
        return new JAXBElement<PICargoLocationDetailsType>(_PIVUnloadingLocationDetails_QNAME, PICargoLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIWBorderTransportDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIWBorderTransportDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIWBorderTransportDetails")
    public JAXBElement<PIWBorderTransportDetailsType> createPIWBorderTransportDetails(PIWBorderTransportDetailsType value) {
        return new JAXBElement<PIWBorderTransportDetailsType>(_PIWBorderTransportDetails_QNAME, PIWBorderTransportDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIWConsignmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIWConsignmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIWConsignmentDetails")
    public JAXBElement<PIWConsignmentDetailsType> createPIWConsignmentDetails(PIWConsignmentDetailsType value) {
        return new JAXBElement<PIWConsignmentDetailsType>(_PIWConsignmentDetails_QNAME, PIWConsignmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIWConsignmentItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIWConsignmentItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIWConsignmentItemDetails")
    public JAXBElement<PIWConsignmentItemDetailsType> createPIWConsignmentItemDetails(PIWConsignmentItemDetailsType value) {
        return new JAXBElement<PIWConsignmentItemDetailsType>(_PIWConsignmentItemDetails_QNAME, PIWConsignmentItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIWEntryCheckPointDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIWEntryCheckPointDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIWEntryCheckPointDetails")
    public JAXBElement<PIWEntryCheckPointDetailsType> createPIWEntryCheckPointDetails(PIWEntryCheckPointDetailsType value) {
        return new JAXBElement<PIWEntryCheckPointDetailsType>(_PIWEntryCheckPointDetails_QNAME, PIWEntryCheckPointDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIWCargoLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIWCargoLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIWLoadingLocationDetails")
    public JAXBElement<PIWCargoLocationDetailsType> createPIWLoadingLocationDetails(PIWCargoLocationDetailsType value) {
        return new JAXBElement<PIWCargoLocationDetailsType>(_PIWLoadingLocationDetails_QNAME, PIWCargoLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIWStoreDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIWStoreDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIWStoreDetails")
    public JAXBElement<PIWStoreDetailsType> createPIWStoreDetails(PIWStoreDetailsType value) {
        return new JAXBElement<PIWStoreDetailsType>(_PIWStoreDetails_QNAME, PIWStoreDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIWTransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIWTransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIWTransportMeansDetails")
    public JAXBElement<PIWTransportMeansDetailsType> createPIWTransportMeansDetails(PIWTransportMeansDetailsType value) {
        return new JAXBElement<PIWTransportMeansDetailsType>(_PIWTransportMeansDetails_QNAME, PIWTransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PIWCargoLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PIWCargoLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PIWUnloadingLocationDetails")
    public JAXBElement<PIWCargoLocationDetailsType> createPIWUnloadingLocationDetails(PIWCargoLocationDetailsType value) {
        return new JAXBElement<PIWCargoLocationDetailsType>(_PIWUnloadingLocationDetails_QNAME, PIWCargoLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackagePalletDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PackagePalletDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PackagePalletDetails")
    public JAXBElement<PackagePalletDetailsType> createPackagePalletDetails(PackagePalletDetailsType value) {
        return new JAXBElement<PackagePalletDetailsType>(_PackagePalletDetails_QNAME, PackagePalletDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerDeclarationIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PassengerDeclarationIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PassengerDeclarationIdDetails")
    public JAXBElement<PassengerDeclarationIdDetailsType> createPassengerDeclarationIdDetails(PassengerDeclarationIdDetailsType value) {
        return new JAXBElement<PassengerDeclarationIdDetailsType>(_PassengerDeclarationIdDetails_QNAME, PassengerDeclarationIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCalculationEventDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentCalculationEventDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PaymentCalculationEventDetails")
    public JAXBElement<PaymentCalculationEventDetailsType> createPaymentCalculationEventDetails(PaymentCalculationEventDetailsType value) {
        return new JAXBElement<PaymentCalculationEventDetailsType>(_PaymentCalculationEventDetails_QNAME, PaymentCalculationEventDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PaymentDocDetails")
    public JAXBElement<PaymentDocDetailsType> createPaymentDocDetails(PaymentDocDetailsType value) {
        return new JAXBElement<PaymentDocDetailsType>(_PaymentDocDetails_QNAME, PaymentDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentDutyTerminationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentDutyTerminationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PaymentDutyTerminationDetails")
    public JAXBElement<PaymentDutyTerminationDetailsType> createPaymentDutyTerminationDetails(PaymentDutyTerminationDetailsType value) {
        return new JAXBElement<PaymentDutyTerminationDetailsType>(_PaymentDutyTerminationDetails_QNAME, PaymentDutyTerminationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentGuaranteeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentGuaranteeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PaymentGuaranteeDetails")
    public JAXBElement<PaymentGuaranteeDetailsType> createPaymentGuaranteeDetails(PaymentGuaranteeDetailsType value) {
        return new JAXBElement<PaymentGuaranteeDetailsType>(_PaymentGuaranteeDetails_QNAME, PaymentGuaranteeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PaymentInvoiceDetails")
    public JAXBElement<DocDetailsV4Type> createPaymentInvoiceDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_PaymentInvoiceDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentSheduleDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentSheduleDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PaymentSheduleDetails")
    public JAXBElement<PaymentSheduleDetailsType> createPaymentSheduleDetails(PaymentSheduleDetailsType value) {
        return new JAXBElement<PaymentSheduleDetailsType>(_PaymentSheduleDetails_QNAME, PaymentSheduleDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodDateDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PeriodDateDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PeriodDateDetails")
    public JAXBElement<PeriodDateDetailsType> createPeriodDateDetails(PeriodDateDetailsType value) {
        return new JAXBElement<PeriodDateDetailsType>(_PeriodDateDetails_QNAME, PeriodDateDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PeriodDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PeriodDetails")
    public JAXBElement<PeriodDetailsType> createPeriodDetails(PeriodDetailsType value) {
        return new JAXBElement<PeriodDetailsType>(_PeriodDetails_QNAME, PeriodDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PeriodicPaymentsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PeriodicPaymentsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PeriodicPaymentsDetails")
    public JAXBElement<PeriodicPaymentsDetailsType> createPeriodicPaymentsDetails(PeriodicPaymentsDetailsType value) {
        return new JAXBElement<PeriodicPaymentsDetailsType>(_PeriodicPaymentsDetails_QNAME, PeriodicPaymentsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PermitGuaranteeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PermitGuaranteeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PermitGuaranteeDetails")
    public JAXBElement<PermitGuaranteeDetailsType> createPermitGuaranteeDetails(PermitGuaranteeDetailsType value) {
        return new JAXBElement<PermitGuaranteeDetailsType>(_PermitGuaranteeDetails_QNAME, PermitGuaranteeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PermitTranspornationDocDetails")
    public JAXBElement<CADocBaseType> createPermitTranspornationDocDetails(CADocBaseType value) {
        return new JAXBElement<CADocBaseType>(_PermitTranspornationDocDetails_QNAME, CADocBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonalGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonalGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PersonalGoodsItemDetails")
    public JAXBElement<PersonalGoodsItemDetailsType> createPersonalGoodsItemDetails(PersonalGoodsItemDetailsType value) {
        return new JAXBElement<PersonalGoodsItemDetailsType>(_PersonalGoodsItemDetails_QNAME, PersonalGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PestControlDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PestControlDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PestControlDetails")
    public JAXBElement<PestControlDetailsType> createPestControlDetails(PestControlDetailsType value) {
        return new JAXBElement<PestControlDetailsType>(_PestControlDetails_QNAME, PestControlDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PipelineDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PipelineDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PipelineGoodsDetails")
    public JAXBElement<PipelineDetailsType> createPipelineGoodsDetails(PipelineDetailsType value) {
        return new JAXBElement<PipelineDetailsType>(_PipelineGoodsDetails_QNAME, PipelineDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointAddressDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PointAddressDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PointLocationAddressDetails")
    public JAXBElement<PointAddressDetailsType> createPointLocationAddressDetails(PointAddressDetailsType value) {
        return new JAXBElement<PointAddressDetailsType>(_PointLocationAddressDetails_QNAME, PointAddressDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PostalAddressDetails")
    public JAXBElement<AddressDetailsType> createPostalAddressDetails(AddressDetailsType value) {
        return new JAXBElement<AddressDetailsType>(_PostalAddressDetails_QNAME, AddressDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PowerOfAttorneyDetails")
    public JAXBElement<CADocBaseType> createPowerOfAttorneyDetails(CADocBaseType value) {
        return new JAXBElement<CADocBaseType>(_PowerOfAttorneyDetails_QNAME, CADocBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOfAttorneyDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PowerOfAttorneyDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PowerOfAttorneyV2Details")
    public JAXBElement<PowerOfAttorneyDetailsType> createPowerOfAttorneyV2Details(PowerOfAttorneyDetailsType value) {
        return new JAXBElement<PowerOfAttorneyDetailsType>(_PowerOfAttorneyV2Details_QNAME, PowerOfAttorneyDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreDecisionBaseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PreDecisionBaseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PreDecisionBaseDetails")
    public JAXBElement<PreDecisionBaseDetailsType> createPreDecisionBaseDetails(PreDecisionBaseDetailsType value) {
        return new JAXBElement<PreDecisionBaseDetailsType>(_PreDecisionBaseDetails_QNAME, PreDecisionBaseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PreDecisionCancelDocDetails")
    public JAXBElement<CADocBaseType> createPreDecisionCancelDocDetails(CADocBaseType value) {
        return new JAXBElement<CADocBaseType>(_PreDecisionCancelDocDetails_QNAME, CADocBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreDecisionGoodsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PreDecisionGoodsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PreDecisionGoodsDetails")
    public JAXBElement<PreDecisionGoodsDetailsType> createPreDecisionGoodsDetails(PreDecisionGoodsDetailsType value) {
        return new JAXBElement<PreDecisionGoodsDetailsType>(_PreDecisionGoodsDetails_QNAME, PreDecisionGoodsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreDecisionIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PreDecisionIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PreDecisionIdDetails")
    public JAXBElement<PreDecisionIdDetailsType> createPreDecisionIdDetails(PreDecisionIdDetailsType value) {
        return new JAXBElement<PreDecisionIdDetailsType>(_PreDecisionIdDetails_QNAME, PreDecisionIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreDecisionJustificationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PreDecisionJustificationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PreDecisionJustificationDetails")
    public JAXBElement<PreDecisionJustificationDetailsType> createPreDecisionJustificationDetails(PreDecisionJustificationDetailsType value) {
        return new JAXBElement<PreDecisionJustificationDetailsType>(_PreDecisionJustificationDetails_QNAME, PreDecisionJustificationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrecedingDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrecedingDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PrecedingDocDetails")
    public JAXBElement<PrecedingDocDetailsType> createPrecedingDocDetails(PrecedingDocDetailsType value) {
        return new JAXBElement<PrecedingDocDetailsType>(_PrecedingDocDetails_QNAME, PrecedingDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrecedingDocIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrecedingDocIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PrecedingDocIdDetails")
    public JAXBElement<PrecedingDocIdDetailsType> createPrecedingDocIdDetails(PrecedingDocIdDetailsType value) {
        return new JAXBElement<PrecedingDocIdDetailsType>(_PrecedingDocIdDetails_QNAME, PrecedingDocIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrecedingGoodsDetaisType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrecedingGoodsDetaisType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PrecedingGoodsDetails")
    public JAXBElement<PrecedingGoodsDetaisType> createPrecedingGoodsDetails(PrecedingGoodsDetaisType value) {
        return new JAXBElement<PrecedingGoodsDetaisType>(_PrecedingGoodsDetails_QNAME, PrecedingGoodsDetaisType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CACountryDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CACountryDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PrefOriginCountryDetails")
    public JAXBElement<CACountryDetailsType> createPrefOriginCountryDetails(CACountryDetailsType value) {
        return new JAXBElement<CACountryDetailsType>(_PrefOriginCountryDetails_QNAME, CACountryDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreferenceDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PreferenceDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PreferenceDetails")
    public JAXBElement<PreferenceDetailsType> createPreferenceDetails(PreferenceDetailsType value) {
        return new JAXBElement<PreferenceDetailsType>(_PreferenceDetails_QNAME, PreferenceDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreliminaryInformationIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PreliminaryInformationIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PreliminaryInformationIdDetails")
    public JAXBElement<PreliminaryInformationIdDetailsType> createPreliminaryInformationIdDetails(PreliminaryInformationIdDetailsType value) {
        return new JAXBElement<PreliminaryInformationIdDetailsType>(_PreliminaryInformationIdDetails_QNAME, PreliminaryInformationIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PresentedDocBaseDetails")
    public JAXBElement<DocDetailsV4Type> createPresentedDocBaseDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_PresentedDocBaseDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PresentedDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PresentedDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "PresentedDocDetails")
    public JAXBElement<PresentedDocDetailsType> createPresentedDocDetails(PresentedDocDetailsType value) {
        return new JAXBElement<PresentedDocDetailsType>(_PresentedDocDetails_QNAME, PresentedDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingProductDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessingProductDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ProcedssingReminderDetails")
    public JAXBElement<ProcessingProductDetailsType> createProcedssingReminderDetails(ProcessingProductDetailsType value) {
        return new JAXBElement<ProcessingProductDetailsType>(_ProcedssingReminderDetails_QNAME, ProcessingProductDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingDescriptionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessingDescriptionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ProcessingDescriptionDetails")
    public JAXBElement<ProcessingDescriptionDetailsType> createProcessingDescriptionDetails(ProcessingDescriptionDetailsType value) {
        return new JAXBElement<ProcessingDescriptionDetailsType>(_ProcessingDescriptionDetails_QNAME, ProcessingDescriptionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ProcessingDocumentDetails")
    public JAXBElement<CADocBaseType> createProcessingDocumentDetails(CADocBaseType value) {
        return new JAXBElement<CADocBaseType>(_ProcessingDocumentDetails_QNAME, CADocBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingOperationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessingOperationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ProcessingOperationDetails")
    public JAXBElement<ProcessingOperationDetailsType> createProcessingOperationDetails(ProcessingOperationDetailsType value) {
        return new JAXBElement<ProcessingOperationDetailsType>(_ProcessingOperationDetails_QNAME, ProcessingOperationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingPlaceDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessingPlaceDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ProcessingPlaceDetails")
    public JAXBElement<ProcessingPlaceDetailsType> createProcessingPlaceDetails(ProcessingPlaceDetailsType value) {
        return new JAXBElement<ProcessingPlaceDetailsType>(_ProcessingPlaceDetails_QNAME, ProcessingPlaceDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingProductDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessingProductDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ProcessingProductDetails")
    public JAXBElement<ProcessingProductDetailsType> createProcessingProductDetails(ProcessingProductDetailsType value) {
        return new JAXBElement<ProcessingProductDetailsType>(_ProcessingProductDetails_QNAME, ProcessingProductDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ProcessingSubjectDetails")
    public JAXBElement<CASubjectDetailsType> createProcessingSubjectDetails(CASubjectDetailsType value) {
        return new JAXBElement<CASubjectDetailsType>(_ProcessingSubjectDetails_QNAME, CASubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountQuotaDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AmountQuotaDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "QuotaAmountReminderDetails")
    public JAXBElement<AmountQuotaDetailsType> createQuotaAmountReminderDetails(AmountQuotaDetailsType value) {
        return new JAXBElement<AmountQuotaDetailsType>(_QuotaAmountReminderDetails_QNAME, AmountQuotaDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuotaDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuotaDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "QuotaDetails")
    public JAXBElement<QuotaDetailsType> createQuotaDetails(QuotaDetailsType value) {
        return new JAXBElement<QuotaDetailsType>(_QuotaDetails_QNAME, QuotaDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "QuotaMeasureReminderDetails")
    public JAXBElement<GoodsMeasureDetailsType> createQuotaMeasureReminderDetails(GoodsMeasureDetailsType value) {
        return new JAXBElement<GoodsMeasureDetailsType>(_QuotaMeasureReminderDetails_QNAME, GoodsMeasureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "QuotaWriteOffMeasureDetails")
    public JAXBElement<GoodsMeasureDetailsType> createQuotaWriteOffMeasureDetails(GoodsMeasureDetailsType value) {
        return new JAXBElement<GoodsMeasureDetailsType>(_QuotaWriteOffMeasureDetails_QNAME, GoodsMeasureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RailwayStampDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RailwayStampDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RailwayStampDetails")
    public JAXBElement<RailwayStampDetailsType> createRailwayStampDetails(RailwayStampDetailsType value) {
        return new JAXBElement<RailwayStampDetailsType>(_RailwayStampDetails_QNAME, RailwayStampDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReasonDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReasonDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ReasonDocDetails")
    public JAXBElement<ReasonDocDetailsType> createReasonDocDetails(ReasonDocDetailsType value) {
        return new JAXBElement<ReasonDocDetailsType>(_ReasonDocDetails_QNAME, ReasonDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecoveredDutyDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RecoveredDutyDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RecoveredDutyDetails")
    public JAXBElement<RecoveredDutyDetailsType> createRecoveredDutyDetails(RecoveredDutyDetailsType value) {
        return new JAXBElement<RecoveredDutyDetailsType>(_RecoveredDutyDetails_QNAME, RecoveredDutyDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RefGuaranteeCertificateIdDetails")
    public JAXBElement<CustomsDocumentIdDetailsType> createRefGuaranteeCertificateIdDetails(CustomsDocumentIdDetailsType value) {
        return new JAXBElement<CustomsDocumentIdDetailsType>(_RefGuaranteeCertificateIdDetails_QNAME, CustomsDocumentIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RefLicenseIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RefLicenseIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RefLicenseIdDetails")
    public JAXBElement<RefLicenseIdDetailsType> createRefLicenseIdDetails(RefLicenseIdDetailsType value) {
        return new JAXBElement<RefLicenseIdDetailsType>(_RefLicenseIdDetails_QNAME, RefLicenseIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerDeclarationIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PassengerDeclarationIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RefPassengerDeclarationIdDetails")
    public JAXBElement<PassengerDeclarationIdDetailsType> createRefPassengerDeclarationIdDetails(PassengerDeclarationIdDetailsType value) {
        return new JAXBElement<PassengerDeclarationIdDetailsType>(_RefPassengerDeclarationIdDetails_QNAME, PassengerDeclarationIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PreliminaryInformationIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PreliminaryInformationIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RefPreliminaryInformationIdDetails")
    public JAXBElement<PreliminaryInformationIdDetailsType> createRefPreliminaryInformationIdDetails(PreliminaryInformationIdDetailsType value) {
        return new JAXBElement<PreliminaryInformationIdDetailsType>(_RefPreliminaryInformationIdDetails_QNAME, PreliminaryInformationIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdinalRangeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrdinalRangeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ReferenceConsignmentItemRangeDetails")
    public JAXBElement<OrdinalRangeDetailsType> createReferenceConsignmentItemRangeDetails(OrdinalRangeDetailsType value) {
        return new JAXBElement<OrdinalRangeDetailsType>(_ReferenceConsignmentItemRangeDetails_QNAME, OrdinalRangeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReferenceTDConsignmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReferenceTDConsignmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ReferenceTDConsignmentDetails")
    public JAXBElement<ReferenceTDConsignmentDetailsType> createReferenceTDConsignmentDetails(ReferenceTDConsignmentDetailsType value) {
        return new JAXBElement<ReferenceTDConsignmentDetailsType>(_ReferenceTDConsignmentDetails_QNAME, ReferenceTDConsignmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterAEODetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterAEODetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegisterAEODetails")
    public JAXBElement<RegisterAEODetailsType> createRegisterAEODetails(RegisterAEODetailsType value) {
        return new JAXBElement<RegisterAEODetailsType>(_RegisterAEODetails_QNAME, RegisterAEODetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCustomsBrokerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterCustomsBrokerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegisterCustomsBrokerDetails")
    public JAXBElement<RegisterCustomsBrokerDetailsType> createRegisterCustomsBrokerDetails(RegisterCustomsBrokerDetailsType value) {
        return new JAXBElement<RegisterCustomsBrokerDetailsType>(_RegisterCustomsBrokerDetails_QNAME, RegisterCustomsBrokerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCustomsCarrierDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterCustomsCarrierDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegisterCustomsCarrierDetails")
    public JAXBElement<RegisterCustomsCarrierDetailsType> createRegisterCustomsCarrierDetails(RegisterCustomsCarrierDetailsType value) {
        return new JAXBElement<RegisterCustomsCarrierDetailsType>(_RegisterCustomsCarrierDetails_QNAME, RegisterCustomsCarrierDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterCustomsWarehouseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterCustomsWarehouseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegisterCustomsWarehouseDetails")
    public JAXBElement<RegisterCustomsWarehouseDetailsType> createRegisterCustomsWarehouseDetails(RegisterCustomsWarehouseDetailsType value) {
        return new JAXBElement<RegisterCustomsWarehouseDetailsType>(_RegisterCustomsWarehouseDetails_QNAME, RegisterCustomsWarehouseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterDocumentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterDocumentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegisterDocumentDetails")
    public JAXBElement<RegisterDocumentDetailsType> createRegisterDocumentDetails(RegisterDocumentDetailsType value) {
        return new JAXBElement<RegisterDocumentDetailsType>(_RegisterDocumentDetails_QNAME, RegisterDocumentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterDocumentIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterDocumentIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegisterDocumentIdDetails")
    public JAXBElement<RegisterDocumentIdDetailsType> createRegisterDocumentIdDetails(RegisterDocumentIdDetailsType value) {
        return new JAXBElement<RegisterDocumentIdDetailsType>(_RegisterDocumentIdDetails_QNAME, RegisterDocumentIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterFreeWarehouseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterFreeWarehouseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegisterFreeWarehouseDetails")
    public JAXBElement<RegisterFreeWarehouseDetailsType> createRegisterFreeWarehouseDetails(RegisterFreeWarehouseDetailsType value) {
        return new JAXBElement<RegisterFreeWarehouseDetailsType>(_RegisterFreeWarehouseDetails_QNAME, RegisterFreeWarehouseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterOrganizationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterOrganizationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegisterOrganizationDetails")
    public JAXBElement<RegisterOrganizationDetailsType> createRegisterOrganizationDetails(RegisterOrganizationDetailsType value) {
        return new JAXBElement<RegisterOrganizationDetailsType>(_RegisterOrganizationDetails_QNAME, RegisterOrganizationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterPreDecisionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterPreDecisionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegisterPreDecisionDetails")
    public JAXBElement<RegisterPreDecisionDetailsType> createRegisterPreDecisionDetails(RegisterPreDecisionDetailsType value) {
        return new JAXBElement<RegisterPreDecisionDetailsType>(_RegisterPreDecisionDetails_QNAME, RegisterPreDecisionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterStampDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterStampDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegisterStampDetails")
    public JAXBElement<RegisterStampDetailsType> createRegisterStampDetails(RegisterStampDetailsType value) {
        return new JAXBElement<RegisterStampDetailsType>(_RegisterStampDetails_QNAME, RegisterStampDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterTSWDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegisterTSWDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegisterTSWDetails")
    public JAXBElement<RegisterTSWDetailsType> createRegisterTSWDetails(RegisterTSWDetailsType value) {
        return new JAXBElement<RegisterTSWDetailsType>(_RegisterTSWDetails_QNAME, RegisterTSWDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsOperationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsOperationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegistrationOperationDetails")
    public JAXBElement<CustomsOperationDetailsType> createRegistrationOperationDetails(CustomsOperationDetailsType value) {
        return new JAXBElement<CustomsOperationDetailsType>(_RegistrationOperationDetails_QNAME, CustomsOperationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistryClassificationDecisionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistryClassificationDecisionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RegistryClassificationDecisionDetails")
    public JAXBElement<RegistryClassificationDecisionDetailsType> createRegistryClassificationDecisionDetails(RegistryClassificationDecisionDetailsType value) {
        return new JAXBElement<RegistryClassificationDecisionDetailsType>(_RegistryClassificationDecisionDetails_QNAME, RegistryClassificationDecisionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsReleaseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsReleaseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ReleaseDecisionDetails")
    public JAXBElement<GoodsReleaseDetailsType> createReleaseDecisionDetails(GoodsReleaseDetailsType value) {
        return new JAXBElement<GoodsReleaseDetailsType>(_ReleaseDecisionDetails_QNAME, GoodsReleaseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReleaseIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReleaseIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ReleaseIdDetails")
    public JAXBElement<ReleaseIdDetailsType> createReleaseIdDetails(ReleaseIdDetailsType value) {
        return new JAXBElement<ReleaseIdDetailsType>(_ReleaseIdDetails_QNAME, ReleaseIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationPlaceDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationPlaceDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "ReloadPlaceDetails")
    public JAXBElement<OperationPlaceDetailsType> createReloadPlaceDetails(OperationPlaceDetailsType value) {
        return new JAXBElement<OperationPlaceDetailsType>(_ReloadPlaceDetails_QNAME, OperationPlaceDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsMeasureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RemainGoodsMeasureDetails")
    public JAXBElement<GoodsMeasureDetailsType> createRemainGoodsMeasureDetails(GoodsMeasureDetailsType value) {
        return new JAXBElement<GoodsMeasureDetailsType>(_RemainGoodsMeasureDetails_QNAME, GoodsMeasureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RepresentativeContractDetails")
    public JAXBElement<CADocBaseType> createRepresentativeContractDetails(CADocBaseType value) {
        return new JAXBElement<CADocBaseType>(_RepresentativeContractDetails_QNAME, CADocBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCustomsOfficeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCustomsOfficeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RouteCustomsOfficeDetails")
    public JAXBElement<UnifiedCustomsOfficeDetailsType> createRouteCustomsOfficeDetails(UnifiedCustomsOfficeDetailsType value) {
        return new JAXBElement<UnifiedCustomsOfficeDetailsType>(_RouteCustomsOfficeDetails_QNAME, UnifiedCustomsOfficeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CATransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CATransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "RouteTransportDetails")
    public JAXBElement<CATransportMeansDetailsType> createRouteTransportDetails(CATransportMeansDetailsType value) {
        return new JAXBElement<CATransportMeansDetailsType>(_RouteTransportDetails_QNAME, CATransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SEZOrganizationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SEZOrganizationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SEZOrganizationDetails")
    public JAXBElement<SEZOrganizationDetailsType> createSEZOrganizationDetails(SEZOrganizationDetailsType value) {
        return new JAXBElement<SEZOrganizationDetailsType>(_SEZOrganizationDetails_QNAME, SEZOrganizationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SanitaryControlDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SanitaryControlDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SanitaryControlDocDetails")
    public JAXBElement<SanitaryControlDocDetailsType> createSanitaryControlDocDetails(SanitaryControlDocDetailsType value) {
        return new JAXBElement<SanitaryControlDocDetailsType>(_SanitaryControlDocDetails_QNAME, SanitaryControlDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SanitaryMeasureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SanitaryMeasureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SanitaryMeasureDetails")
    public JAXBElement<SanitaryMeasureDetailsType> createSanitaryMeasureDetails(SanitaryMeasureDetailsType value) {
        return new JAXBElement<SanitaryMeasureDetailsType>(_SanitaryMeasureDetails_QNAME, SanitaryMeasureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SanitaryMeasureLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SanitaryMeasureLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SanitaryMeasureLocationDetails")
    public JAXBElement<SanitaryMeasureLocationDetailsType> createSanitaryMeasureLocationDetails(SanitaryMeasureLocationDetailsType value) {
        return new JAXBElement<SanitaryMeasureLocationDetailsType>(_SanitaryMeasureLocationDetails_QNAME, SanitaryMeasureLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SealDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SealDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SealDetails")
    public JAXBElement<SealDetailsType> createSealDetails(SealDetailsType value) {
        return new JAXBElement<SealDetailsType>(_SealDetails_QNAME, SealDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GoodsShipmentSubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GoodsShipmentSubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SellerDetails")
    public JAXBElement<GoodsShipmentSubjectDetailsType> createSellerDetails(GoodsShipmentSubjectDetailsType value) {
        return new JAXBElement<GoodsShipmentSubjectDetailsType>(_SellerDetails_QNAME, GoodsShipmentSubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReasonDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ReasonDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SettingReasonDocDetails")
    public JAXBElement<ReasonDocDetailsType> createSettingReasonDocDetails(ReasonDocDetailsType value) {
        return new JAXBElement<ReasonDocDetailsType>(_SettingReasonDocDetails_QNAME, ReasonDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatoryPersonDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatoryPersonDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SignatoryPersonDetails")
    public JAXBElement<SignatoryPersonDetailsType> createSignatoryPersonDetails(SignatoryPersonDetailsType value) {
        return new JAXBElement<SignatoryPersonDetailsType>(_SignatoryPersonDetails_QNAME, SignatoryPersonDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatoryPersonIdentityDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatoryPersonIdentityDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SignatoryPersonIdentityDetails")
    public JAXBElement<SignatoryPersonIdentityDetailsType> createSignatoryPersonIdentityDetails(SignatoryPersonIdentityDetailsType value) {
        return new JAXBElement<SignatoryPersonIdentityDetailsType>(_SignatoryPersonIdentityDetails_QNAME, SignatoryPersonIdentityDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatoryPersonDetailsV2Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatoryPersonDetailsV2Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SignatoryPersonV2Details")
    public JAXBElement<SignatoryPersonDetailsV2Type> createSignatoryPersonV2Details(SignatoryPersonDetailsV2Type value) {
        return new JAXBElement<SignatoryPersonDetailsV2Type>(_SignatoryPersonV2Details_QNAME, SignatoryPersonDetailsV2Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatoryRepresentativeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SignatoryRepresentativeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SignatoryRepresentativeDetails")
    public JAXBElement<SignatoryRepresentativeDetailsType> createSignatoryRepresentativeDetails(SignatoryRepresentativeDetailsType value) {
        return new JAXBElement<SignatoryRepresentativeDetailsType>(_SignatoryRepresentativeDetails_QNAME, SignatoryRepresentativeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SigningDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SigningDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SigningDetails")
    public JAXBElement<SigningDetailsType> createSigningDetails(SigningDetailsType value) {
        return new JAXBElement<SigningDetailsType>(_SigningDetails_QNAME, SigningDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemAvailabilityDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemAvailabilityDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SparePartsDetails")
    public JAXBElement<ItemAvailabilityDetailsType> createSparePartsDetails(ItemAvailabilityDetailsType value) {
        return new JAXBElement<ItemAvailabilityDetailsType>(_SparePartsDetails_QNAME, ItemAvailabilityDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SparePartsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SparePartsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SparePartsItemDetails")
    public JAXBElement<SparePartsItemDetailsType> createSparePartsItemDetails(SparePartsItemDetailsType value) {
        return new JAXBElement<SparePartsItemDetailsType>(_SparePartsItemDetails_QNAME, SparePartsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialRoomDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecialRoomDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SpecialRoomDetails")
    public JAXBElement<SpecialRoomDetailsType> createSpecialRoomDetails(SpecialRoomDetailsType value) {
        return new JAXBElement<SpecialRoomDetailsType>(_SpecialRoomDetails_QNAME, SpecialRoomDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SpecificationDetails")
    public JAXBElement<CADocBaseType> createSpecificationDetails(CADocBaseType value) {
        return new JAXBElement<CADocBaseType>(_SpecificationDetails_QNAME, CADocBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StampInfoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StampInfoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "StampInfoDetails")
    public JAXBElement<StampInfoDetailsType> createStampInfoDetails(StampInfoDetailsType value) {
        return new JAXBElement<StampInfoDetailsType>(_StampInfoDetails_QNAME, StampInfoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StorageRequirementDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StorageRequirementDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "StorageRequirementDetails")
    public JAXBElement<StorageRequirementDetailsType> createStorageRequirementDetails(StorageRequirementDetailsType value) {
        return new JAXBElement<StorageRequirementDetailsType>(_StorageRequirementDetails_QNAME, StorageRequirementDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemAvailabilityDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemAvailabilityDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "StoreDetails")
    public JAXBElement<ItemAvailabilityDetailsType> createStoreDetails(ItemAvailabilityDetailsType value) {
        return new JAXBElement<ItemAvailabilityDetailsType>(_StoreDetails_QNAME, ItemAvailabilityDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StoreItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "StoreItemDetails")
    public JAXBElement<StoreItemDetailsType> createStoreItemDetails(StoreItemDetailsType value) {
        return new JAXBElement<StoreItemDetailsType>(_StoreItemDetails_QNAME, StoreItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAOrganizationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CAOrganizationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SubjectBranchDetails")
    public JAXBElement<CAOrganizationType> createSubjectBranchDetails(CAOrganizationType value) {
        return new JAXBElement<CAOrganizationType>(_SubjectBranchDetails_QNAME, CAOrganizationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SuretyContractDetails")
    public JAXBElement<DocDetailsV4Type> createSuretyContractDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_SuretyContractDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuretyDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuretyDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SuretyDetails")
    public JAXBElement<SuretyDetailsType> createSuretyDetails(SuretyDetailsType value) {
        return new JAXBElement<SuretyDetailsType>(_SuretyDetails_QNAME, SuretyDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SuretyMainContractDetails")
    public JAXBElement<DocDetailsV4Type> createSuretyMainContractDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_SuretyMainContractDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "SuretySubjectDetails")
    public JAXBElement<CASubjectDetailsType> createSuretySubjectDetails(CASubjectDetailsType value) {
        return new JAXBElement<CASubjectDetailsType>(_SuretySubjectDetails_QNAME, CASubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDCADocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDCADocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDCADocDetails")
    public JAXBElement<TDCADocDetailsType> createTDCADocDetails(TDCADocDetailsType value) {
        return new JAXBElement<TDCADocDetailsType>(_TDCADocDetails_QNAME, TDCADocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDCloseCargoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDCloseCargoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDCloseCargoDetails")
    public JAXBElement<TDCloseCargoDetailsType> createTDCloseCargoDetails(TDCloseCargoDetailsType value) {
        return new JAXBElement<TDCloseCargoDetailsType>(_TDCloseCargoDetails_QNAME, TDCloseCargoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDCloseHeaderDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDCloseHeaderDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDCloseHeaderDetails")
    public JAXBElement<TDCloseHeaderDetailsType> createTDCloseHeaderDetails(TDCloseHeaderDetailsType value) {
        return new JAXBElement<TDCloseHeaderDetailsType>(_TDCloseHeaderDetails_QNAME, TDCloseHeaderDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDCloseOperationCustomsMarkDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDCloseOperationCustomsMarkDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDCloseOperationCustomsMarkDetails")
    public JAXBElement<TDCloseOperationCustomsMarkDetailsType> createTDCloseOperationCustomsMarkDetails(TDCloseOperationCustomsMarkDetailsType value) {
        return new JAXBElement<TDCloseOperationCustomsMarkDetailsType>(_TDCloseOperationCustomsMarkDetails_QNAME, TDCloseOperationCustomsMarkDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDCloseOperationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDCloseOperationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDCloseOperationDetails")
    public JAXBElement<TDCloseOperationDetailsType> createTDCloseOperationDetails(TDCloseOperationDetailsType value) {
        return new JAXBElement<TDCloseOperationDetailsType>(_TDCloseOperationDetails_QNAME, TDCloseOperationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDConsignmentCloseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDConsignmentCloseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDConsignmentCloseDetails")
    public JAXBElement<TDConsignmentCloseDetailsType> createTDConsignmentCloseDetails(TDConsignmentCloseDetailsType value) {
        return new JAXBElement<TDConsignmentCloseDetailsType>(_TDConsignmentCloseDetails_QNAME, TDConsignmentCloseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDConsignmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDConsignmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDConsignmentDetails")
    public JAXBElement<TDConsignmentDetailsType> createTDConsignmentDetails(TDConsignmentDetailsType value) {
        return new JAXBElement<TDConsignmentDetailsType>(_TDConsignmentDetails_QNAME, TDConsignmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDConsignmentDocDetails")
    public JAXBElement<DocDetailsV4Type> createTDConsignmentDocDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_TDConsignmentDocDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDGoodsItemInfoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDGoodsItemInfoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDDeliveryGoodsItemDetails")
    public JAXBElement<TDGoodsItemInfoDetailsType> createTDDeliveryGoodsItemDetails(TDGoodsItemInfoDetailsType value) {
        return new JAXBElement<TDGoodsItemInfoDetailsType>(_TDDeliveryGoodsItemDetails_QNAME, TDGoodsItemInfoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationPlaceDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperationPlaceDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDDestinationPlaceDetails")
    public JAXBElement<OperationPlaceDetailsType> createTDDestinationPlaceDetails(OperationPlaceDetailsType value) {
        return new JAXBElement<OperationPlaceDetailsType>(_TDDestinationPlaceDetails_QNAME, OperationPlaceDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDEmergencyCargoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDEmergencyCargoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDEmergencyCargoDetails")
    public JAXBElement<TDEmergencyCargoDetailsType> createTDEmergencyCargoDetails(TDEmergencyCargoDetailsType value) {
        return new JAXBElement<TDEmergencyCargoDetailsType>(_TDEmergencyCargoDetails_QNAME, TDEmergencyCargoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDEmergencyOperationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDEmergencyOperationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDEmergencyOperationDetails")
    public JAXBElement<TDEmergencyOperationDetailsType> createTDEmergencyOperationDetails(TDEmergencyOperationDetailsType value) {
        return new JAXBElement<TDEmergencyOperationDetailsType>(_TDEmergencyOperationDetails_QNAME, TDEmergencyOperationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDExchGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDExchGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDExchGoodsItemDetails")
    public JAXBElement<TDExchGoodsItemDetailsType> createTDExchGoodsItemDetails(TDExchGoodsItemDetailsType value) {
        return new JAXBElement<TDExchGoodsItemDetailsType>(_TDExchGoodsItemDetails_QNAME, TDExchGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDExchGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDExchGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDExchGoodsShipmentDetails")
    public JAXBElement<TDExchGoodsShipmentDetailsType> createTDExchGoodsShipmentDetails(TDExchGoodsShipmentDetailsType value) {
        return new JAXBElement<TDExchGoodsShipmentDetailsType>(_TDExchGoodsShipmentDetails_QNAME, TDExchGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDGoodsItemDetails")
    public JAXBElement<TDGoodsItemDetailsType> createTDGoodsItemDetails(TDGoodsItemDetailsType value) {
        return new JAXBElement<TDGoodsItemDetailsType>(_TDGoodsItemDetails_QNAME, TDGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDGoodsShipmentDetails")
    public JAXBElement<TDGoodsShipmentDetailsType> createTDGoodsShipmentDetails(TDGoodsShipmentDetailsType value) {
        return new JAXBElement<TDGoodsShipmentDetailsType>(_TDGoodsShipmentDetails_QNAME, TDGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDGuaranteeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDGuaranteeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDGuaranteeDetails")
    public JAXBElement<TDGuaranteeDetailsType> createTDGuaranteeDetails(TDGuaranteeDetailsType value) {
        return new JAXBElement<TDGuaranteeDetailsType>(_TDGuaranteeDetails_QNAME, TDGuaranteeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDHeaderDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDHeaderDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDHeaderDetails")
    public JAXBElement<TDHeaderDetailsType> createTDHeaderDetails(TDHeaderDetailsType value) {
        return new JAXBElement<TDHeaderDetailsType>(_TDHeaderDetails_QNAME, TDHeaderDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDInspectionDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDInspectionDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDInspectionDocDetails")
    public JAXBElement<TDInspectionDocDetailsType> createTDInspectionDocDetails(TDInspectionDocDetailsType value) {
        return new JAXBElement<TDInspectionDocDetailsType>(_TDInspectionDocDetails_QNAME, TDInspectionDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDInternationalMailDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDInternationalMailDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDInternationalMailDetails")
    public JAXBElement<TDInternationalMailDetailsType> createTDInternationalMailDetails(TDInternationalMailDetailsType value) {
        return new JAXBElement<TDInternationalMailDetailsType>(_TDInternationalMailDetails_QNAME, TDInternationalMailDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDGoodsItemInfoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDGoodsItemInfoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDLostGoodsItemDetails")
    public JAXBElement<TDGoodsItemInfoDetailsType> createTDLostGoodsItemDetails(TDGoodsItemInfoDetailsType value) {
        return new JAXBElement<TDGoodsItemInfoDetailsType>(_TDLostGoodsItemDetails_QNAME, TDGoodsItemInfoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDMovementOperationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDMovementOperationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDMovementOperationDetails")
    public JAXBElement<TDMovementOperationDetailsType> createTDMovementOperationDetails(TDMovementOperationDetailsType value) {
        return new JAXBElement<TDMovementOperationDetailsType>(_TDMovementOperationDetails_QNAME, TDMovementOperationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDOperationInfoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDOperationInfoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDOperationInfoDetails")
    public JAXBElement<TDOperationInfoDetailsType> createTDOperationInfoDetails(TDOperationInfoDetailsType value) {
        return new JAXBElement<TDOperationInfoDetailsType>(_TDOperationInfoDetails_QNAME, TDOperationInfoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDPackageDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDPackageDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDPackageDetails")
    public JAXBElement<TDPackageDetailsType> createTDPackageDetails(TDPackageDetailsType value) {
        return new JAXBElement<TDPackageDetailsType>(_TDPackageDetails_QNAME, TDPackageDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDPrecedingDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDPrecedingDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDPrecedingDocDetails")
    public JAXBElement<TDPrecedingDocDetailsType> createTDPrecedingDocDetails(TDPrecedingDocDetailsType value) {
        return new JAXBElement<TDPrecedingDocDetailsType>(_TDPrecedingDocDetails_QNAME, TDPrecedingDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDPresentedDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDPresentedDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDPresentedDocDetails")
    public JAXBElement<TDPresentedDocDetailsType> createTDPresentedDocDetails(TDPresentedDocDetailsType value) {
        return new JAXBElement<TDPresentedDocDetailsType>(_TDPresentedDocDetails_QNAME, TDPresentedDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDPreviousDocDetails")
    public JAXBElement<TDDocDetailsType> createTDPreviousDocDetails(TDDocDetailsType value) {
        return new JAXBElement<TDDocDetailsType>(_TDPreviousDocDetails_QNAME, TDDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDReleaseCustomsMarkDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDReleaseCustomsMarkDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDReleaseCustomsMarkDetails")
    public JAXBElement<TDReleaseCustomsMarkDetailsType> createTDReleaseCustomsMarkDetails(TDReleaseCustomsMarkDetailsType value) {
        return new JAXBElement<TDReleaseCustomsMarkDetailsType>(_TDReleaseCustomsMarkDetails_QNAME, TDReleaseCustomsMarkDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDReleaseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDReleaseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDReleaseDetails")
    public JAXBElement<TDReleaseDetailsType> createTDReleaseDetails(TDReleaseDetailsType value) {
        return new JAXBElement<TDReleaseDetailsType>(_TDReleaseDetails_QNAME, TDReleaseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDRouteDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDRouteDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDRouteDetails")
    public JAXBElement<TDRouteDetailsType> createTDRouteDetails(TDRouteDetailsType value) {
        return new JAXBElement<TDRouteDetailsType>(_TDRouteDetails_QNAME, TDRouteDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDRouteHeaderDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDRouteHeaderDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDRouteHeaderDetails")
    public JAXBElement<TDRouteHeaderDetailsType> createTDRouteHeaderDetails(TDRouteHeaderDetailsType value) {
        return new JAXBElement<TDRouteHeaderDetailsType>(_TDRouteHeaderDetails_QNAME, TDRouteHeaderDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDSealDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDSealDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDSealDetails")
    public JAXBElement<TDSealDetailsType> createTDSealDetails(TDSealDetailsType value) {
        return new JAXBElement<TDSealDetailsType>(_TDSealDetails_QNAME, TDSealDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDTIRCarnetDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDTIRCarnetDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDTIRCarnetIdDetails")
    public JAXBElement<TDTIRCarnetDetailsType> createTDTIRCarnetIdDetails(TDTIRCarnetDetailsType value) {
        return new JAXBElement<TDTIRCarnetDetailsType>(_TDTIRCarnetIdDetails_QNAME, TDTIRCarnetDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDTerminationCargoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDTerminationCargoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDTerminationCargoDetails")
    public JAXBElement<TDTerminationCargoDetailsType> createTDTerminationCargoDetails(TDTerminationCargoDetailsType value) {
        return new JAXBElement<TDTerminationCargoDetailsType>(_TDTerminationCargoDetails_QNAME, TDTerminationCargoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDGoodsItemInfoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDGoodsItemInfoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDTerminationGoodsItemDetails")
    public JAXBElement<TDGoodsItemInfoDetailsType> createTDTerminationGoodsItemDetails(TDGoodsItemInfoDetailsType value) {
        return new JAXBElement<TDGoodsItemInfoDetailsType>(_TDTerminationGoodsItemDetails_QNAME, TDGoodsItemInfoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDTerminationOperationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDTerminationOperationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDTerminationOperationDetails")
    public JAXBElement<TDTerminationOperationDetailsType> createTDTerminationOperationDetails(TDTerminationOperationDetailsType value) {
        return new JAXBElement<TDTerminationOperationDetailsType>(_TDTerminationOperationDetails_QNAME, TDTerminationOperationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TDTranshipmentOperationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TDTranshipmentOperationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TDTranshipmentOperationDetails")
    public JAXBElement<TDTranshipmentOperationDetailsType> createTDTranshipmentOperationDetails(TDTranshipmentOperationDetailsType value) {
        return new JAXBElement<TDTranshipmentOperationDetailsType>(_TDTranshipmentOperationDetails_QNAME, TDTranshipmentOperationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIECarrierDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIECarrierDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIECarrierDetails")
    public JAXBElement<TIECarrierDetailsType> createTIECarrierDetails(TIECarrierDetailsType value) {
        return new JAXBElement<TIECarrierDetailsType>(_TIECarrierDetails_QNAME, TIECarrierDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIECloseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIECloseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIECloseDetails")
    public JAXBElement<TIECloseDetailsType> createTIECloseDetails(TIECloseDetailsType value) {
        return new JAXBElement<TIECloseDetailsType>(_TIECloseDetails_QNAME, TIECloseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIEDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIEDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIEDetails")
    public JAXBElement<TIEDetailsType> createTIEDetails(TIEDetailsType value) {
        return new JAXBElement<TIEDetailsType>(_TIEDetails_QNAME, TIEDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIEExtensionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIEExtensionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIEExtensionDetails")
    public JAXBElement<TIEExtensionDetailsType> createTIEExtensionDetails(TIEExtensionDetailsType value) {
        return new JAXBElement<TIEExtensionDetailsType>(_TIEExtensionDetails_QNAME, TIEExtensionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIEOperationsDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIEOperationsDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIEOperationsDetails")
    public JAXBElement<TIEOperationsDetailsType> createTIEOperationsDetails(TIEOperationsDetailsType value) {
        return new JAXBElement<TIEOperationsDetailsType>(_TIEOperationsDetails_QNAME, TIEOperationsDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIEProcedureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIEProcedureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIEProcedureDetails")
    public JAXBElement<TIEProcedureDetailsType> createTIEProcedureDetails(TIEProcedureDetailsType value) {
        return new JAXBElement<TIEProcedureDetailsType>(_TIEProcedureDetails_QNAME, TIEProcedureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIERegistrationDetalsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIERegistrationDetalsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIERegistrationDetails")
    public JAXBElement<TIERegistrationDetalsType> createTIERegistrationDetails(TIERegistrationDetalsType value) {
        return new JAXBElement<TIERegistrationDetalsType>(_TIERegistrationDetails_QNAME, TIERegistrationDetalsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIERegistryItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIERegistryItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIERegistryItemDetails")
    public JAXBElement<TIERegistryItemDetailsType> createTIERegistryItemDetails(TIERegistryItemDetailsType value) {
        return new JAXBElement<TIERegistryItemDetailsType>(_TIERegistryItemDetails_QNAME, TIERegistryItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CADocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CADocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIERemovalDocDetails")
    public JAXBElement<CADocDetailsType> createTIERemovalDocDetails(CADocDetailsType value) {
        return new JAXBElement<CADocDetailsType>(_TIERemovalDocDetails_QNAME, CADocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIERemovalInfoDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIERemovalInfoDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIERemovalInfoDetails")
    public JAXBElement<TIERemovalInfoDetailsType> createTIERemovalInfoDetails(TIERemovalInfoDetailsType value) {
        return new JAXBElement<TIERemovalInfoDetailsType>(_TIERemovalInfoDetails_QNAME, TIERemovalInfoDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIRCarnetIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIRCarnetIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIRCarnetIdDetails")
    public JAXBElement<TIRCarnetIdDetailsType> createTIRCarnetIdDetails(TIRCarnetIdDetailsType value) {
        return new JAXBElement<TIRCarnetIdDetailsType>(_TIRCarnetIdDetails_QNAME, TIRCarnetIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIRCarnetUnloadingLocationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIRCarnetUnloadingLocationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIRCarnetUnloadingLocationDetails")
    public JAXBElement<TIRCarnetUnloadingLocationDetailsType> createTIRCarnetUnloadingLocationDetails(TIRCarnetUnloadingLocationDetailsType value) {
        return new JAXBElement<TIRCarnetUnloadingLocationDetailsType>(_TIRCarnetUnloadingLocationDetails_QNAME, TIRCarnetUnloadingLocationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIRGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIRGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIRGoodsItemDetails")
    public JAXBElement<TIRGoodsItemDetailsType> createTIRGoodsItemDetails(TIRGoodsItemDetailsType value) {
        return new JAXBElement<TIRGoodsItemDetailsType>(_TIRGoodsItemDetails_QNAME, TIRGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIRGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIRGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIRGoodsShipmentDetails")
    public JAXBElement<TIRGoodsShipmentDetailsType> createTIRGoodsShipmentDetails(TIRGoodsShipmentDetailsType value) {
        return new JAXBElement<TIRGoodsShipmentDetailsType>(_TIRGoodsShipmentDetails_QNAME, TIRGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TIRBaseIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TIRBaseIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIRIdDetails")
    public JAXBElement<TIRBaseIdDetailsType> createTIRIdDetails(TIRBaseIdDetailsType value) {
        return new JAXBElement<TIRBaseIdDetailsType>(_TIRIdDetails_QNAME, TIRBaseIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CATransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CATransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TIRTransportMeansDetails")
    public JAXBElement<CATransportMeansDetailsType> createTIRTransportMeansDetails(CATransportMeansDetailsType value) {
        return new JAXBElement<CATransportMeansDetailsType>(_TIRTransportMeansDetails_QNAME, CATransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdTransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdTransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TITransportDetails")
    public JAXBElement<IdTransportMeansDetailsType> createTITransportDetails(IdTransportMeansDetailsType value) {
        return new JAXBElement<IdTransportMeansDetailsType>(_TITransportDetails_QNAME, IdTransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMPAAutomobileDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMPAAutomobileDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TMPAAutomobileDetails")
    public JAXBElement<TMPAAutomobileDetailsType> createTMPAAutomobileDetails(TMPAAutomobileDetailsType value) {
        return new JAXBElement<TMPAAutomobileDetailsType>(_TMPAAutomobileDetails_QNAME, TMPAAutomobileDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsPaymentBaseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsPaymentBaseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TMPAGoodgItemPaymentDetails")
    public JAXBElement<CustomsPaymentBaseDetailsType> createTMPAGoodgItemPaymentDetails(CustomsPaymentBaseDetailsType value) {
        return new JAXBElement<CustomsPaymentBaseDetailsType>(_TMPAGoodgItemPaymentDetails_QNAME, CustomsPaymentBaseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMPAGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMPAGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TMPAGoodsItemDetails")
    public JAXBElement<TMPAGoodsItemDetailsType> createTMPAGoodsItemDetails(TMPAGoodsItemDetailsType value) {
        return new JAXBElement<TMPAGoodsItemDetailsType>(_TMPAGoodsItemDetails_QNAME, TMPAGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMPAGoodsShipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMPAGoodsShipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TMPAGoodsShipmentDetails")
    public JAXBElement<TMPAGoodsShipmentDetailsType> createTMPAGoodsShipmentDetails(TMPAGoodsShipmentDetailsType value) {
        return new JAXBElement<TMPAGoodsShipmentDetailsType>(_TMPAGoodsShipmentDetails_QNAME, TMPAGoodsShipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMPAPrecedingDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMPAPrecedingDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TMPAPrecedingDocDetails")
    public JAXBElement<TMPAPrecedingDocDetailsType> createTMPAPrecedingDocDetails(TMPAPrecedingDocDetailsType value) {
        return new JAXBElement<TMPAPrecedingDocDetailsType>(_TMPAPrecedingDocDetails_QNAME, TMPAPrecedingDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimplePresentedDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SimplePresentedDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TMPAPresentedDocDetails")
    public JAXBElement<SimplePresentedDocDetailsType> createTMPAPresentedDocDetails(SimplePresentedDocDetailsType value) {
        return new JAXBElement<SimplePresentedDocDetailsType>(_TMPAPresentedDocDetails_QNAME, SimplePresentedDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TMPATransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TMPATransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TMPATransportMeansDetails")
    public JAXBElement<TMPATransportMeansDetailsType> createTMPATransportMeansDetails(TMPATransportMeansDetailsType value) {
        return new JAXBElement<TMPATransportMeansDetailsType>(_TMPATransportMeansDetails_QNAME, TMPATransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TNVEDCodeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TNVEDCodeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TNVEDCodeDetails")
    public JAXBElement<TNVEDCodeDetailsType> createTNVEDCodeDetails(TNVEDCodeDetailsType value) {
        return new JAXBElement<TNVEDCodeDetailsType>(_TNVEDCodeDetails_QNAME, TNVEDCodeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WarehouseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WarehouseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TSWDetails")
    public JAXBElement<WarehouseDetailsType> createTSWDetails(WarehouseDetailsType value) {
        return new JAXBElement<WarehouseDetailsType>(_TSWDetails_QNAME, WarehouseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TradeCountryDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TradeCountryDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TradeCountryDetails")
    public JAXBElement<TradeCountryDetailsType> createTradeCountryDetails(TradeCountryDetailsType value) {
        return new JAXBElement<TradeCountryDetailsType>(_TradeCountryDetails_QNAME, TradeCountryDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrailerDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TrailerDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TrailerDetails")
    public JAXBElement<TrailerDetailsType> createTrailerDetails(TrailerDetailsType value) {
        return new JAXBElement<TrailerDetailsType>(_TrailerDetails_QNAME, TrailerDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionNatureDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransactionNatureDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransactionNatureDetails")
    public JAXBElement<TransactionNatureDetailsType> createTransactionNatureDetails(TransactionNatureDetailsType value) {
        return new JAXBElement<TransactionNatureDetailsType>(_TransactionNatureDetails_QNAME, TransactionNatureDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranshipmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TranshipmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TranshipmentDetails")
    public JAXBElement<TranshipmentDetailsType> createTranshipmentDetails(TranshipmentDetailsType value) {
        return new JAXBElement<TranshipmentDetailsType>(_TranshipmentDetails_QNAME, TranshipmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CATransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CATransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TranshipmentTransportDetails")
    public JAXBElement<CATransportMeansDetailsType> createTranshipmentTransportDetails(CATransportMeansDetailsType value) {
        return new JAXBElement<CATransportMeansDetailsType>(_TranshipmentTransportDetails_QNAME, CATransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TranshipmentTransportMeansDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TranshipmentTransportMeansDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TranshipmentTransportMeansDetails")
    public JAXBElement<TranshipmentTransportMeansDetailsType> createTranshipmentTransportMeansDetails(TranshipmentTransportMeansDetailsType value) {
        return new JAXBElement<TranshipmentTransportMeansDetailsType>(_TranshipmentTransportMeansDetails_QNAME, TranshipmentTransportMeansDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitConsignmentDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransitConsignmentDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransitConsignmentDetails")
    public JAXBElement<TransitConsignmentDetailsType> createTransitConsignmentDetails(TransitConsignmentDetailsType value) {
        return new JAXBElement<TransitConsignmentDetailsType>(_TransitConsignmentDetails_QNAME, TransitConsignmentDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CASubjectDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransitDeclarantDetails")
    public JAXBElement<CASubjectDetailsType> createTransitDeclarantDetails(CASubjectDetailsType value) {
        return new JAXBElement<CASubjectDetailsType>(_TransitDeclarantDetails_QNAME, CASubjectDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomsDocumentIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransitDeclarationIdDetails")
    public JAXBElement<CustomsDocumentIdDetailsType> createTransitDeclarationIdDetails(CustomsDocumentIdDetailsType value) {
        return new JAXBElement<CustomsDocumentIdDetailsType>(_TransitDeclarationIdDetails_QNAME, CustomsDocumentIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitDestinationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransitDestinationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransitDestinationDetails")
    public JAXBElement<TransitDestinationDetailsType> createTransitDestinationDetails(TransitDestinationDetailsType value) {
        return new JAXBElement<TransitDestinationDetailsType>(_TransitDestinationDetails_QNAME, TransitDestinationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransitGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransitGoodsItemDetails")
    public JAXBElement<TransitGoodsItemDetailsType> createTransitGoodsItemDetails(TransitGoodsItemDetailsType value) {
        return new JAXBElement<TransitGoodsItemDetailsType>(_TransitGoodsItemDetails_QNAME, TransitGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitGuaranteeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransitGuaranteeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransitGuaranteeDetails")
    public JAXBElement<TransitGuaranteeDetailsType> createTransitGuaranteeDetails(TransitGuaranteeDetailsType value) {
        return new JAXBElement<TransitGuaranteeDetailsType>(_TransitGuaranteeDetails_QNAME, TransitGuaranteeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitGuaranteeDocDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransitGuaranteeDocDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransitGuaranteeDocDetails")
    public JAXBElement<TransitGuaranteeDocDetailsType> createTransitGuaranteeDocDetails(TransitGuaranteeDocDetailsType value) {
        return new JAXBElement<TransitGuaranteeDocDetailsType>(_TransitGuaranteeDocDetails_QNAME, TransitGuaranteeDocDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitMarkDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransitMarkDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransitMarkDetails")
    public JAXBElement<TransitMarkDetailsType> createTransitMarkDetails(TransitMarkDetailsType value) {
        return new JAXBElement<TransitMarkDetailsType>(_TransitMarkDetails_QNAME, TransitMarkDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitReservationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransitReservationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransitReservationDetails")
    public JAXBElement<TransitReservationDetailsType> createTransitReservationDetails(TransitReservationDetailsType value) {
        return new JAXBElement<TransitReservationDetailsType>(_TransitReservationDetails_QNAME, TransitReservationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitRoutePointDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransitRoutePointDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransitRoutePointDetails")
    public JAXBElement<TransitRoutePointDetailsType> createTransitRoutePointDetails(TransitRoutePointDetailsType value) {
        return new JAXBElement<TransitRoutePointDetailsType>(_TransitRoutePointDetails_QNAME, TransitRoutePointDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocDetailsV4Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransportDocumentDetails")
    public JAXBElement<DocDetailsV4Type> createTransportDocumentDetails(DocDetailsV4Type value) {
        return new JAXBElement<DocDetailsV4Type>(_TransportDocumentDetails_QNAME, DocDetailsV4Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMeansIDDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransportMeansIDDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransportMeansIdDetails")
    public JAXBElement<TransportMeansIDDetailsType> createTransportMeansIdDetails(TransportMeansIDDetailsType value) {
        return new JAXBElement<TransportMeansIDDetailsType>(_TransportMeansIdDetails_QNAME, TransportMeansIDDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMeansItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransportMeansItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransportMeansItemDetails")
    public JAXBElement<TransportMeansItemDetailsType> createTransportMeansItemDetails(TransportMeansItemDetailsType value) {
        return new JAXBElement<TransportMeansItemDetailsType>(_TransportMeansItemDetails_QNAME, TransportMeansItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMeansRegistrationIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransportMeansRegistrationIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TransportMeansRegistrationIdDetails")
    public JAXBElement<TransportMeansRegistrationIdDetailsType> createTransportMeansRegistrationIdDetails(TransportMeansRegistrationIdDetailsType value) {
        return new JAXBElement<TransportMeansRegistrationIdDetailsType>(_TransportMeansRegistrationIdDetails_QNAME, TransportMeansRegistrationIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashListDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CashListDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "TravelersChequeDetails")
    public JAXBElement<CashListDetailsType> createTravelersChequeDetails(CashListDetailsType value) {
        return new JAXBElement<CashListDetailsType>(_TravelersChequeDetails_QNAME, CashListDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCustomsOfficeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCustomsOfficeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "UnifiedCustomsOfficeDetails")
    public JAXBElement<UnifiedCustomsOfficeDetailsType> createUnifiedCustomsOfficeDetails(UnifiedCustomsOfficeDetailsType value) {
        return new JAXBElement<UnifiedCustomsOfficeDetailsType>(_UnifiedCustomsOfficeDetails_QNAME, UnifiedCustomsOfficeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnloadWarehouseDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnloadWarehouseDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "UnloadWarehouseDetails")
    public JAXBElement<UnloadWarehouseDetailsType> createUnloadWarehouseDetails(UnloadWarehouseDetailsType value) {
        return new JAXBElement<UnloadWarehouseDetailsType>(_UnloadWarehouseDetails_QNAME, UnloadWarehouseDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleEngineDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehicleEngineDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "VehicleEngineDetails")
    public JAXBElement<VehicleEngineDetailsType> createVehicleEngineDetails(VehicleEngineDetailsType value) {
        return new JAXBElement<VehicleEngineDetailsType>(_VehicleEngineDetails_QNAME, VehicleEngineDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleMassDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehicleMassDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "VehicleMassDetails")
    public JAXBElement<VehicleMassDetailsType> createVehicleMassDetails(VehicleMassDetailsType value) {
        return new JAXBElement<VehicleMassDetailsType>(_VehicleMassDetails_QNAME, VehicleMassDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleModelDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehicleModelDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "VehicleModelDetails")
    public JAXBElement<VehicleModelDetailsType> createVehicleModelDetails(VehicleModelDetailsType value) {
        return new JAXBElement<VehicleModelDetailsType>(_VehicleModelDetails_QNAME, VehicleModelDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiclePassportIdDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehiclePassportIdDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "VehiclePasportIdDetails")
    public JAXBElement<VehiclePassportIdDetailsType> createVehiclePasportIdDetails(VehiclePassportIdDetailsType value) {
        return new JAXBElement<VehiclePassportIdDetailsType>(_VehiclePasportIdDetails_QNAME, VehiclePassportIdDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehiclePassportRegDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehiclePassportRegDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "VehiclePassportRegDetails")
    public JAXBElement<VehiclePassportRegDetailsType> createVehiclePassportRegDetails(VehiclePassportRegDetailsType value) {
        return new JAXBElement<VehiclePassportRegDetailsType>(_VehiclePassportRegDetails_QNAME, VehiclePassportRegDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VesselConstructionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VesselConstructionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "VesselConstructionDetails")
    public JAXBElement<VesselConstructionDetailsType> createVesselConstructionDetails(VesselConstructionDetailsType value) {
        return new JAXBElement<VesselConstructionDetailsType>(_VesselConstructionDetails_QNAME, VesselConstructionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VesselEngineDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VesselEngineDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "VesselEngineDetails")
    public JAXBElement<VesselEngineDetailsType> createVesselEngineDetails(VesselEngineDetailsType value) {
        return new JAXBElement<VesselEngineDetailsType>(_VesselEngineDetails_QNAME, VesselEngineDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VesselRegistrationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VesselRegistrationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "VesselRegistrationDetails")
    public JAXBElement<VesselRegistrationDetailsType> createVesselRegistrationDetails(VesselRegistrationDetailsType value) {
        return new JAXBElement<VesselRegistrationDetailsType>(_VesselRegistrationDetails_QNAME, VesselRegistrationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VetReleaseOrganizationDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VetReleaseOrganizationDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "VetReleaseOrganizationDetails")
    public JAXBElement<VetReleaseOrganizationDetailsType> createVetReleaseOrganizationDetails(VetReleaseOrganizationDetailsType value) {
        return new JAXBElement<VetReleaseOrganizationDetailsType>(_VetReleaseOrganizationDetails_QNAME, VetReleaseOrganizationDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoyageDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VoyageDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "VoyageDetails")
    public JAXBElement<VoyageDetailsType> createVoyageDetails(VoyageDetailsType value) {
        return new JAXBElement<VoyageDetailsType>(_VoyageDetails_QNAME, VoyageDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WarehousingGoodsItemDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WarehousingGoodsItemDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "WarehousingGoodsItemDetails")
    public JAXBElement<WarehousingGoodsItemDetailsType> createWarehousingGoodsItemDetails(WarehousingGoodsItemDetailsType value) {
        return new JAXBElement<WarehousingGoodsItemDetailsType>(_WarehousingGoodsItemDetails_QNAME, WarehousingGoodsItemDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessingProductDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProcessingProductDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "WasteProductDetails")
    public JAXBElement<ProcessingProductDetailsType> createWasteProductDetails(ProcessingProductDetailsType value) {
        return new JAXBElement<ProcessingProductDetailsType>(_WasteProductDetails_QNAME, ProcessingProductDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WoodCodeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WoodCodeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "WoodCodeDetails")
    public JAXBElement<WoodCodeDetailsType> createWoodCodeDetails(WoodCodeDetailsType value) {
        return new JAXBElement<WoodCodeDetailsType>(_WoodCodeDetails_QNAME, WoodCodeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WoodDescriptionDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WoodDescriptionDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "WoodDescriptionDetails")
    public JAXBElement<WoodDescriptionDetailsType> createWoodDescriptionDetails(WoodDescriptionDetailsType value) {
        return new JAXBElement<WoodDescriptionDetailsType>(_WoodDescriptionDetails_QNAME, WoodDescriptionDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkScheduleDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkScheduleDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "WorkScheduleDetails")
    public JAXBElement<WorkScheduleDetailsType> createWorkScheduleDetails(WorkScheduleDetailsType value) {
        return new JAXBElement<WorkScheduleDetailsType>(_WorkScheduleDetails_QNAME, WorkScheduleDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkTimeDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkTimeDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "WorkTimeDetails")
    public JAXBElement<WorkTimeDetailsType> createWorkTimeDetails(WorkTimeDetailsType value) {
        return new JAXBElement<WorkTimeDetailsType>(_WorkTimeDetails_QNAME, WorkTimeDetailsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WorkTimeHourDetailsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WorkTimeHourDetailsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:CA:ComplexDataObjects:v1.8.1", name = "WorkTimeHourDetails")
    public JAXBElement<WorkTimeHourDetailsType> createWorkTimeHourDetails(WorkTimeHourDetailsType value) {
        return new JAXBElement<WorkTimeHourDetailsType>(_WorkTimeHourDetails_QNAME, WorkTimeHourDetailsType.class, null, value);
    }

}
