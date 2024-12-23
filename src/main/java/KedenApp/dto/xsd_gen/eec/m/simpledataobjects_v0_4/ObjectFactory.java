
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eec.m.simpledataobjects.v0_4 package. 
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

    private final static QName _AIId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AIId");
    private final static QName _AbbreviationName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AbbreviationName");
    private final static QName _ActivityEndDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ActivityEndDate");
    private final static QName _ActivityStartDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ActivityStartDate");
    private final static QName _AdditionalInfoText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AdditionalInfoText");
    private final static QName _AddressKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AddressKindCode");
    private final static QName _AddressText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AddressText");
    private final static QName _AdministrativeDivisionCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AdministrativeDivisionCode");
    private final static QName _AdministrativeDivisionName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AdministrativeDivisionName");
    private final static QName _AgeDuration_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AgeDuration");
    private final static QName _AnnotationText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AnnotationText");
    private final static QName _AreaMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AreaMeasure");
    private final static QName _AuthorityBriefName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AuthorityBriefName");
    private final static QName _AuthorityDecisionCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AuthorityDecisionCode");
    private final static QName _AuthorityId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AuthorityId");
    private final static QName _AuthorityName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AuthorityName");
    private final static QName _AuthorityV2Id_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "AuthorityV2Id");
    private final static QName _BankAccountId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BankAccountId");
    private final static QName _BankCorrAccountId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BankCorrAccountId");
    private final static QName _BankId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BankId");
    private final static QName _BankName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BankName");
    private final static QName _BirthDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BirthDate");
    private final static QName _BorderCheckpointCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BorderCheckpointCode");
    private final static QName _BorderCheckpointName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BorderCheckpointName");
    private final static QName _BuildingNumberId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BuildingNumberId");
    private final static QName _BusinessEntityBriefName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BusinessEntityBriefName");
    private final static QName _BusinessEntityId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BusinessEntityId");
    private final static QName _BusinessEntityName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BusinessEntityName");
    private final static QName _BusinessEntityTypeCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BusinessEntityTypeCode");
    private final static QName _BusinessEntityTypeName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BusinessEntityTypeName");
    private final static QName _BusinessEntityUnitName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "BusinessEntityUnitName");
    private final static QName _CargoHandlingLocationCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CargoHandlingLocationCode");
    private final static QName _CheckSumId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CheckSumId");
    private final static QName _CityName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CityName");
    private final static QName _ClassificationLevelCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ClassificationLevelCode");
    private final static QName _ClassificationMethodCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ClassificationMethodCode");
    private final static QName _ClassificationName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ClassificationName");
    private final static QName _CodeListChangeKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodeListChangeKindCode");
    private final static QName _CodeListCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodeListCode");
    private final static QName _CodeListConductMethodCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodeListConductMethodCode");
    private final static QName _CodeListEventCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodeListEventCode");
    private final static QName _CodeListItemEndDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodeListItemEndDate");
    private final static QName _CodeListItemStartDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodeListItemStartDate");
    private final static QName _CodeListKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodeListKindCode");
    private final static QName _CodeListName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodeListName");
    private final static QName _CodeListProvideMethodCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodeListProvideMethodCode");
    private final static QName _CodeListStandardId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodeListStandardId");
    private final static QName _CodifiedListId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodifiedListId");
    private final static QName _CodifiedListItemCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodifiedListItemCode");
    private final static QName _CodifiedListItemName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CodifiedListItemName");
    private final static QName _CommodityCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CommodityCode");
    private final static QName _CommodityMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CommodityMeasure");
    private final static QName _CommodityName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CommodityName");
    private final static QName _CommunicationChannelCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CommunicationChannelCode");
    private final static QName _CommunicationChannelId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CommunicationChannelId");
    private final static QName _CommunicationChannelName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CommunicationChannelName");
    private final static QName _ConfidentialityDegreeCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ConfidentialityDegreeCode");
    private final static QName _CountryCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CountryCode");
    private final static QName _CurrencyCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CurrencyCode");
    private final static QName _CurrencyConversionRate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CurrencyConversionRate");
    private final static QName _CurrentVersionDateTime_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CurrentVersionDateTime");
    private final static QName _CustomsOfficeCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CustomsOfficeCode");
    private final static QName _CustomsOfficeName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "CustomsOfficeName");
    private final static QName _DayQuantity_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DayQuantity");
    private final static QName _DeathDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DeathDate");
    private final static QName _DescriptionText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DescriptionText");
    private final static QName _DesignationName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DesignationName");
    private final static QName _DetailsResourceId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DetailsResourceId");
    private final static QName _DistrictName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DistrictName");
    private final static QName _DocAuthorityId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocAuthorityId");
    private final static QName _DocBinaryText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocBinaryText");
    private final static QName _DocChangeDateTime_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocChangeDateTime");
    private final static QName _DocCreationDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocCreationDate");
    private final static QName _DocId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocId");
    private final static QName _DocIssuingAuthorityId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocIssuingAuthorityId");
    private final static QName _DocIssuingAuthorityName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocIssuingAuthorityName");
    private final static QName _DocKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocKindCode");
    private final static QName _DocKindName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocKindName");
    private final static QName _DocName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocName");
    private final static QName _DocRequestKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocRequestKindCode");
    private final static QName _DocSeriesId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocSeriesId");
    private final static QName _DocStartDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocStartDate");
    private final static QName _DocStatusCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocStatusCode");
    private final static QName _DocValidityDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocValidityDate");
    private final static QName _DocValidityDuration_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "DocValidityDuration");
    private final static QName _EAEUDocCreationDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EAEUDocCreationDate");
    private final static QName _EAEUDocEffectiveDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EAEUDocEffectiveDate");
    private final static QName _EAEUDocId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EAEUDocId");
    private final static QName _EAEUDocIssuerId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EAEUDocIssuerId");
    private final static QName _EAEUDocIssuerName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EAEUDocIssuerName");
    private final static QName _EAEUDocKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EAEUDocKindCode");
    private final static QName _EAEUDocName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EAEUDocName");
    private final static QName _EAEUDocValidityDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EAEUDocValidityDate");
    private final static QName _EAEUScopeCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EAEUScopeCode");
    private final static QName _EDocCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EDocCode");
    private final static QName _EDocDateTime_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EDocDateTime");
    private final static QName _EDocDetailedErrorText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EDocDetailedErrorText");
    private final static QName _EDocElementText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EDocElementText");
    private final static QName _EDocErrorCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EDocErrorCode");
    private final static QName _EDocErrorText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EDocErrorText");
    private final static QName _EDocId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EDocId");
    private final static QName _EDocRefId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EDocRefId");
    private final static QName _EDocVersionId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EDocVersionId");
    private final static QName _EducationLevelCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EducationLevelCode");
    private final static QName _EndDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EndDate");
    private final static QName _EndDateTime_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EndDateTime");
    private final static QName _EndTime_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EndTime");
    private final static QName _EngineCapacityMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EngineCapacityMeasure");
    private final static QName _EngineId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EngineId");
    private final static QName _EngineMaxPowerMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EngineMaxPowerMeasure");
    private final static QName _EngineModelCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EngineModelCode");
    private final static QName _EventDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EventDate");
    private final static QName _EventDateTime_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EventDateTime");
    private final static QName _EventYear_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "EventYear");
    private final static QName _FirstName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "FirstName");
    private final static QName _FormNumberId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "FormNumberId");
    private final static QName _FormSeriesId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "FormSeriesId");
    private final static QName _GLNId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "GLNId");
    private final static QName _GTINId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "GTINId");
    private final static QName _GrossMassMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "GrossMassMeasure");
    private final static QName _GrossVolumeMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "GrossVolumeMeasure");
    private final static QName _HeightMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "HeightMeasure");
    private final static QName _IPObjectId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "IPObjectId");
    private final static QName _IdentificationMeansKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "IdentificationMeansKindCode");
    private final static QName _IdentificationMeansUnitCharacterValueId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "IdentificationMeansUnitCharacterValueId");
    private final static QName _IdentityDocKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "IdentityDocKindCode");
    private final static QName _IdentityDocNumberId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "IdentityDocNumberId");
    private final static QName _IdentityDocSeriesId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "IdentityDocSeriesId");
    private final static QName _InfEnvelopeCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "InfEnvelopeCode");
    private final static QName _InformationResourceId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "InformationResourceId");
    private final static QName _InformationResourceName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "InformationResourceName");
    private final static QName _InternationalClassificationUseCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "InternationalClassificationUseCode");
    private final static QName _InternationalNonproprietaryName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "InternationalNonproprietaryName");
    private final static QName _ItemQuantity_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ItemQuantity");
    private final static QName _KeywordName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "KeywordName");
    private final static QName _LanguageCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "LanguageCode");
    private final static QName _LastName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "LastName");
    private final static QName _LatitudeMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "LatitudeMeasure");
    private final static QName _LegalActCreationDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "LegalActCreationDate");
    private final static QName _LegalActId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "LegalActId");
    private final static QName _LegalActKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "LegalActKindCode");
    private final static QName _LegalActKindName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "LegalActKindName");
    private final static QName _LegalActName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "LegalActName");
    private final static QName _LengthMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "LengthMeasure");
    private final static QName _LocationName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "LocationName");
    private final static QName _LongitudeMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "LongitudeMeasure");
    private final static QName _ManufactureDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ManufactureDate");
    private final static QName _ManufactureMonth_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ManufactureMonth");
    private final static QName _ManufactureYear_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ManufactureYear");
    private final static QName _MarketId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "MarketId");
    private final static QName _MassMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "MassMeasure");
    private final static QName _MiddleName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "MiddleName");
    private final static QName _MonthQuantity_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "MonthQuantity");
    private final static QName _NationalityCountryCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "NationalityCountryCode");
    private final static QName _NetMassMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "NetMassMeasure");
    private final static QName _NetVolumeMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "NetVolumeMeasure");
    private final static QName _NoteText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "NoteText");
    private final static QName _ObjectOrdinal_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ObjectOrdinal");
    private final static QName _ObsAttributeText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ObsAttributeText");
    private final static QName _ObsKeyText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ObsKeyText");
    private final static QName _ObsValue_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ObsValue");
    private final static QName _OperatorName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "OperatorName");
    private final static QName _OrganizationBriefName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "OrganizationBriefName");
    private final static QName _OrganizationCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "OrganizationCode");
    private final static QName _OrganizationId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "OrganizationId");
    private final static QName _OrganizationName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "OrganizationName");
    private final static QName _PackageKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PackageKindCode");
    private final static QName _PackageQuantity_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PackageQuantity");
    private final static QName _PageQuantity_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PageQuantity");
    private final static QName _ParentCodifiedListItemCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ParentCodifiedListItemCode");
    private final static QName _ParentReferenceDataItemCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ParentReferenceDataItemCode");
    private final static QName _ParentReferenceDataSectionCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ParentReferenceDataSectionCode");
    private final static QName _PassengerQuantity_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PassengerQuantity");
    private final static QName _PayeeAccountId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PayeeAccountId");
    private final static QName _PayeeName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PayeeName");
    private final static QName _PaymentAmount_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PaymentAmount");
    private final static QName _PaymentBudgetCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PaymentBudgetCode");
    private final static QName _PaymentDateTime_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PaymentDateTime");
    private final static QName _PaymentId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PaymentId");
    private final static QName _PaymentKindName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PaymentKindName");
    private final static QName _PaymentPurposeText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PaymentPurposeText");
    private final static QName _PaymentSystemAccountId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PaymentSystemAccountId");
    private final static QName _PaymentSystemName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PaymentSystemName");
    private final static QName _PositionName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PositionName");
    private final static QName _PostCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PostCode");
    private final static QName _PostOfficeBoxId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "PostOfficeBoxId");
    private final static QName _ProcessingResultCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ProcessingResultCode");
    private final static QName _ProcessingResultV2Code_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ProcessingResultV2Code");
    private final static QName _ProductCostAmount_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ProductCostAmount");
    private final static QName _ProductId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ProductId");
    private final static QName _ProductInstanceId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ProductInstanceId");
    private final static QName _ProductMarkName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ProductMarkName");
    private final static QName _ProductModelName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ProductModelName");
    private final static QName _ProductName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ProductName");
    private final static QName _ProductShelfLifeDuration_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ProductShelfLifeDuration");
    private final static QName _ProductShelfLifeEndDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ProductShelfLifeEndDate");
    private final static QName _ProductSortName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ProductSortName");
    private final static QName _ProvidedInformationCountryCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ProvidedInformationCountryCode");
    private final static QName _QualificationDegreeCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "QualificationDegreeCode");
    private final static QName _QualificationDegreeName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "QualificationDegreeName");
    private final static QName _ReferenceDataId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ReferenceDataId");
    private final static QName _ReferenceDataItemCharacteristicCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ReferenceDataItemCharacteristicCode");
    private final static QName _ReferenceDataItemCharacteristicName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ReferenceDataItemCharacteristicName");
    private final static QName _ReferenceDataItemCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ReferenceDataItemCode");
    private final static QName _ReferenceDataItemName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ReferenceDataItemName");
    private final static QName _ReferenceDataItemText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ReferenceDataItemText");
    private final static QName _ReferenceDataSectionCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ReferenceDataSectionCode");
    private final static QName _ReferenceDataSectionName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ReferenceDataSectionName");
    private final static QName _RegionName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "RegionName");
    private final static QName _ReportAttributeText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ReportAttributeText");
    private final static QName _ReportKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ReportKindCode");
    private final static QName _ReportName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ReportName");
    private final static QName _ResourceId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "ResourceId");
    private final static QName _RevisionPeriodicityText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "RevisionPeriodicityText");
    private final static QName _RoomNumberId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "RoomNumberId");
    private final static QName _RoutePointKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "RoutePointKindCode");
    private final static QName _SealId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "SealId");
    private final static QName _SeatQuantity_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "SeatQuantity");
    private final static QName _SettlementName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "SettlementName");
    private final static QName _SexCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "SexCode");
    private final static QName _SourceCurrencyCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "SourceCurrencyCode");
    private final static QName _SourceCurrencyUnitQuantity_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "SourceCurrencyUnitQuantity");
    private final static QName _SpecialityCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "SpecialityCode");
    private final static QName _SpecialityName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "SpecialityName");
    private final static QName _StartDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "StartDate");
    private final static QName _StartDateTime_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "StartDateTime");
    private final static QName _StartTime_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "StartTime");
    private final static QName _StateCodeListPresenceCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "StateCodeListPresenceCode");
    private final static QName _StatusCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "StatusCode");
    private final static QName _StatusEndDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "StatusEndDate");
    private final static QName _StatusStartDate_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "StatusStartDate");
    private final static QName _StreetName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "StreetName");
    private final static QName _SubjectBriefName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "SubjectBriefName");
    private final static QName _SubjectName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "SubjectName");
    private final static QName _SupplyChainPartyKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "SupplyChainPartyKindCode");
    private final static QName _TargetCurrencyCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "TargetCurrencyCode");
    private final static QName _TargetCurrencyUnitQuantity_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "TargetCurrencyUnitQuantity");
    private final static QName _TaxRegistrationReasonCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "TaxRegistrationReasonCode");
    private final static QName _TaxpayerId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "TaxpayerId");
    private final static QName _TerritoryCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "TerritoryCode");
    private final static QName _TotalAmount_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "TotalAmount");
    private final static QName _TransliterationText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "TransliterationText");
    private final static QName _TransportMeansRegId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "TransportMeansRegId");
    private final static QName _TransportModeCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "TransportModeCode");
    private final static QName _UnifiedBankId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedBankId");
    private final static QName _UnifiedCommodityMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedCommodityMeasure");
    private final static QName _UnifiedCommunicationChannelCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedCommunicationChannelCode");
    private final static QName _UnifiedCountryCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedCountryCode");
    private final static QName _UnifiedCurrencyCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedCurrencyCode");
    private final static QName _UnifiedCurrencyN3Code_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedCurrencyN3Code");
    private final static QName _UnifiedEAEUDocIssuerId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedEAEUDocIssuerId");
    private final static QName _UnifiedEAEUDocKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedEAEUDocKindCode");
    private final static QName _UnifiedGrossMassMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedGrossMassMeasure");
    private final static QName _UnifiedGrossVolumeMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedGrossVolumeMeasure");
    private final static QName _UnifiedHeightMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedHeightMeasure");
    private final static QName _UnifiedIdentityDocKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedIdentityDocKindCode");
    private final static QName _UnifiedLengthMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedLengthMeasure");
    private final static QName _UnifiedMassMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedMassMeasure");
    private final static QName _UnifiedMeasurementUnitCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedMeasurementUnitCode");
    private final static QName _UnifiedNetMassMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedNetMassMeasure");
    private final static QName _UnifiedNetVolumeMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedNetVolumeMeasure");
    private final static QName _UnifiedOrganizationCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedOrganizationCode");
    private final static QName _UnifiedOrganizationId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedOrganizationId");
    private final static QName _UnifiedPackageKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedPackageKindCode");
    private final static QName _UnifiedPaymentAmount_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedPaymentAmount");
    private final static QName _UnifiedPaymentBudgetCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedPaymentBudgetCode");
    private final static QName _UnifiedRoutePointKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedRoutePointKindCode");
    private final static QName _UnifiedSexCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedSexCode");
    private final static QName _UnifiedTaxpayerId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedTaxpayerId");
    private final static QName _UnifiedTerritoryCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedTerritoryCode");
    private final static QName _UnifiedTransportModeCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedTransportModeCode");
    private final static QName _UnifiedWeekDayCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedWeekDayCode");
    private final static QName _UnifiedWidthMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UnifiedWidthMeasure");
    private final static QName _UniqueCustomsNumberId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UniqueCustomsNumberId");
    private final static QName _UpdateDateTime_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UpdateDateTime");
    private final static QName _UseText_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "UseText");
    private final static QName _VehicleAxleOrdinal_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleAxleOrdinal");
    private final static QName _VehicleAxleQuantity_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleAxleQuantity");
    private final static QName _VehicleBodyId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleBodyId");
    private final static QName _VehicleCategoryCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleCategoryCode");
    private final static QName _VehicleChassisId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleChassisId");
    private final static QName _VehicleCommercialName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleCommercialName");
    private final static QName _VehicleEPassportId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleEPassportId");
    private final static QName _VehicleEcoClassCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleEcoClassCode");
    private final static QName _VehicleId_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleId");
    private final static QName _VehicleMakeCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleMakeCode");
    private final static QName _VehicleMakeName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleMakeName");
    private final static QName _VehicleMassKindCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleMassKindCode");
    private final static QName _VehicleModelName_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehicleModelName");
    private final static QName _VehiclePassengerQuantity_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "VehiclePassengerQuantity");
    private final static QName _WeekDayCode_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "WeekDayCode");
    private final static QName _WidthMeasure_QNAME = new QName("urn:EEC:M:SimpleDataObjects:v0.4.14", "WidthMeasure");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eec.m.simpledataobjects.v0_4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnifiedPhysicalMeasureType }
     * 
     */
    public UnifiedPhysicalMeasureType createUnifiedPhysicalMeasureType() {
        return new UnifiedPhysicalMeasureType();
    }

    /**
     * Create an instance of {@link FractionNumber10MeasureType }
     * 
     */
    public FractionNumber10MeasureType createFractionNumber10MeasureType() {
        return new FractionNumber10MeasureType();
    }

    /**
     * Create an instance of {@link UnifiedAmountWithCurrencyType }
     * 
     */
    public UnifiedAmountWithCurrencyType createUnifiedAmountWithCurrencyType() {
        return new UnifiedAmountWithCurrencyType();
    }

    /**
     * Create an instance of {@link UnifiedCountryCodeType }
     * 
     */
    public UnifiedCountryCodeType createUnifiedCountryCodeType() {
        return new UnifiedCountryCodeType();
    }

    /**
     * Create an instance of {@link TransportMeansRegIdType }
     * 
     */
    public TransportMeansRegIdType createTransportMeansRegIdType() {
        return new TransportMeansRegIdType();
    }

    /**
     * Create an instance of {@link AmountWithCurrencyV3Type }
     * 
     */
    public AmountWithCurrencyV3Type createAmountWithCurrencyV3Type() {
        return new AmountWithCurrencyV3Type();
    }

    /**
     * Create an instance of {@link UnifiedCode20Type }
     * 
     */
    public UnifiedCode20Type createUnifiedCode20Type() {
        return new UnifiedCode20Type();
    }

    /**
     * Create an instance of {@link Picture10MbType }
     * 
     */
    public Picture10MbType createPicture10MbType() {
        return new Picture10MbType();
    }

    /**
     * Create an instance of {@link PhysicalMeasureType }
     * 
     */
    public PhysicalMeasureType createPhysicalMeasureType() {
        return new PhysicalMeasureType();
    }

    /**
     * Create an instance of {@link StatusCodeType }
     * 
     */
    public StatusCodeType createStatusCodeType() {
        return new StatusCodeType();
    }

    /**
     * Create an instance of {@link UnifiedId20Type }
     * 
     */
    public UnifiedId20Type createUnifiedId20Type() {
        return new UnifiedId20Type();
    }

    /**
     * Create an instance of {@link BusinessEntityIdType }
     * 
     */
    public BusinessEntityIdType createBusinessEntityIdType() {
        return new BusinessEntityIdType();
    }

    /**
     * Create an instance of {@link CheckSumIdType }
     * 
     */
    public CheckSumIdType createCheckSumIdType() {
        return new CheckSumIdType();
    }

    /**
     * Create an instance of {@link ClassifiedReferenceDataItemCodeType }
     * 
     */
    public ClassifiedReferenceDataItemCodeType createClassifiedReferenceDataItemCodeType() {
        return new ClassifiedReferenceDataItemCodeType();
    }

    /**
     * Create an instance of {@link ClassifiedReferenceDataItemNameType }
     * 
     */
    public ClassifiedReferenceDataItemNameType createClassifiedReferenceDataItemNameType() {
        return new ClassifiedReferenceDataItemNameType();
    }

    /**
     * Create an instance of {@link BinaryTextType }
     * 
     */
    public BinaryTextType createBinaryTextType() {
        return new BinaryTextType();
    }

    /**
     * Create an instance of {@link EAEUDocKindCodeType }
     * 
     */
    public EAEUDocKindCodeType createEAEUDocKindCodeType() {
        return new EAEUDocKindCodeType();
    }

    /**
     * Create an instance of {@link IdentificationMeansKindCodeType }
     * 
     */
    public IdentificationMeansKindCodeType createIdentificationMeansKindCodeType() {
        return new IdentificationMeansKindCodeType();
    }

    /**
     * Create an instance of {@link IdentityDocKindCodeType }
     * 
     */
    public IdentityDocKindCodeType createIdentityDocKindCodeType() {
        return new IdentityDocKindCodeType();
    }

    /**
     * Create an instance of {@link LocalizedName500Type }
     * 
     */
    public LocalizedName500Type createLocalizedName500Type() {
        return new LocalizedName500Type();
    }

    /**
     * Create an instance of {@link ObsComponentTextType }
     * 
     */
    public ObsComponentTextType createObsComponentTextType() {
        return new ObsComponentTextType();
    }

    /**
     * Create an instance of {@link PackageKindCodeType }
     * 
     */
    public PackageKindCodeType createPackageKindCodeType() {
        return new PackageKindCodeType();
    }

    /**
     * Create an instance of {@link AccountingAmountType }
     * 
     */
    public AccountingAmountType createAccountingAmountType() {
        return new AccountingAmountType();
    }

    /**
     * Create an instance of {@link ClassifiedReferenceDataItemTextType }
     * 
     */
    public ClassifiedReferenceDataItemTextType createClassifiedReferenceDataItemTextType() {
        return new ClassifiedReferenceDataItemTextType();
    }

    /**
     * Create an instance of {@link UnifiedCurrencyCodeType }
     * 
     */
    public UnifiedCurrencyCodeType createUnifiedCurrencyCodeType() {
        return new UnifiedCurrencyCodeType();
    }

    /**
     * Create an instance of {@link TransliterationTextType }
     * 
     */
    public TransliterationTextType createTransliterationTextType() {
        return new TransliterationTextType();
    }

    /**
     * Create an instance of {@link UnifiedBankIdType }
     * 
     */
    public UnifiedBankIdType createUnifiedBankIdType() {
        return new UnifiedBankIdType();
    }

    /**
     * Create an instance of {@link UnifiedCurrencyN3CodeType }
     * 
     */
    public UnifiedCurrencyN3CodeType createUnifiedCurrencyN3CodeType() {
        return new UnifiedCurrencyN3CodeType();
    }

    /**
     * Create an instance of {@link UnifiedOrganizationCodeType }
     * 
     */
    public UnifiedOrganizationCodeType createUnifiedOrganizationCodeType() {
        return new UnifiedOrganizationCodeType();
    }

    /**
     * Create an instance of {@link UnifiedOrganizationIdType }
     * 
     */
    public UnifiedOrganizationIdType createUnifiedOrganizationIdType() {
        return new UnifiedOrganizationIdType();
    }

    /**
     * Create an instance of {@link AccountingAmountV3Type }
     * 
     */
    public AccountingAmountV3Type createAccountingAmountV3Type() {
        return new AccountingAmountV3Type();
    }

    /**
     * Create an instance of {@link UnifiedPaymentBudgetCodeType }
     * 
     */
    public UnifiedPaymentBudgetCodeType createUnifiedPaymentBudgetCodeType() {
        return new UnifiedPaymentBudgetCodeType();
    }

    /**
     * Create an instance of {@link UnifiedTaxpayerIdType }
     * 
     */
    public UnifiedTaxpayerIdType createUnifiedTaxpayerIdType() {
        return new UnifiedTaxpayerIdType();
    }

    /**
     * Create an instance of {@link UnifiedTerritoryCodeType }
     * 
     */
    public UnifiedTerritoryCodeType createUnifiedTerritoryCodeType() {
        return new UnifiedTerritoryCodeType();
    }

    /**
     * Create an instance of {@link VehicleEcoClassCodeType }
     * 
     */
    public VehicleEcoClassCodeType createVehicleEcoClassCodeType() {
        return new VehicleEcoClassCodeType();
    }

    /**
     * Create an instance of {@link VehicleMakeCodeType }
     * 
     */
    public VehicleMakeCodeType createVehicleMakeCodeType() {
        return new VehicleMakeCodeType();
    }

    /**
     * Create an instance of {@link AmountWithCurrencyType }
     * 
     */
    public AmountWithCurrencyType createAmountWithCurrencyType() {
        return new AmountWithCurrencyType();
    }

    /**
     * Create an instance of {@link AmountWithNumericCurrencyType }
     * 
     */
    public AmountWithNumericCurrencyType createAmountWithNumericCurrencyType() {
        return new AmountWithNumericCurrencyType();
    }

    /**
     * Create an instance of {@link AmountWithNumericCurrencyV3Type }
     * 
     */
    public AmountWithNumericCurrencyV3Type createAmountWithNumericCurrencyV3Type() {
        return new AmountWithNumericCurrencyV3Type();
    }

    /**
     * Create an instance of {@link BankAccountIdV2Type }
     * 
     */
    public BankAccountIdV2Type createBankAccountIdV2Type() {
        return new BankAccountIdV2Type();
    }

    /**
     * Create an instance of {@link CheckSumQualifiedIdType }
     * 
     */
    public CheckSumQualifiedIdType createCheckSumQualifiedIdType() {
        return new CheckSumQualifiedIdType();
    }

    /**
     * Create an instance of {@link DimensionalMeasureType }
     * 
     */
    public DimensionalMeasureType createDimensionalMeasureType() {
        return new DimensionalMeasureType();
    }

    /**
     * Create an instance of {@link DocKindCodeType }
     * 
     */
    public DocKindCodeType createDocKindCodeType() {
        return new DocKindCodeType();
    }

    /**
     * Create an instance of {@link FractionNumber9MeasureType }
     * 
     */
    public FractionNumber9MeasureType createFractionNumber9MeasureType() {
        return new FractionNumber9MeasureType();
    }

    /**
     * Create an instance of {@link GraphicType }
     * 
     */
    public GraphicType createGraphicType() {
        return new GraphicType();
    }

    /**
     * Create an instance of {@link LocalizedNameType }
     * 
     */
    public LocalizedNameType createLocalizedNameType() {
        return new LocalizedNameType();
    }

    /**
     * Create an instance of {@link NationalCodeType }
     * 
     */
    public NationalCodeType createNationalCodeType() {
        return new NationalCodeType();
    }

    /**
     * Create an instance of {@link NationalIdType }
     * 
     */
    public NationalIdType createNationalIdType() {
        return new NationalIdType();
    }

    /**
     * Create an instance of {@link Picture1536KbType }
     * 
     */
    public Picture1536KbType createPicture1536KbType() {
        return new Picture1536KbType();
    }

    /**
     * Create an instance of {@link Picture1MbType }
     * 
     */
    public Picture1MbType createPicture1MbType() {
        return new Picture1MbType();
    }

    /**
     * Create an instance of {@link PictureType }
     * 
     */
    public PictureType createPictureType() {
        return new PictureType();
    }

    /**
     * Create an instance of {@link QualifiedCodeType }
     * 
     */
    public QualifiedCodeType createQualifiedCodeType() {
        return new QualifiedCodeType();
    }

    /**
     * Create an instance of {@link QualifiedIdType }
     * 
     */
    public QualifiedIdType createQualifiedIdType() {
        return new QualifiedIdType();
    }

    /**
     * Create an instance of {@link QualifiedOptionalCodeType }
     * 
     */
    public QualifiedOptionalCodeType createQualifiedOptionalCodeType() {
        return new QualifiedOptionalCodeType();
    }

    /**
     * Create an instance of {@link SoundType }
     * 
     */
    public SoundType createSoundType() {
        return new SoundType();
    }

    /**
     * Create an instance of {@link UnifiedAccountingAmountType }
     * 
     */
    public UnifiedAccountingAmountType createUnifiedAccountingAmountType() {
        return new UnifiedAccountingAmountType();
    }

    /**
     * Create an instance of {@link UnifiedAmountWithNumericCurrencyType }
     * 
     */
    public UnifiedAmountWithNumericCurrencyType createUnifiedAmountWithNumericCurrencyType() {
        return new UnifiedAmountWithNumericCurrencyType();
    }

    /**
     * Create an instance of {@link UnifiedDimensionalMeasureType }
     * 
     */
    public UnifiedDimensionalMeasureType createUnifiedDimensionalMeasureType() {
        return new UnifiedDimensionalMeasureType();
    }

    /**
     * Create an instance of {@link UnifiedIdentityDocKindCodeType }
     * 
     */
    public UnifiedIdentityDocKindCodeType createUnifiedIdentityDocKindCodeType() {
        return new UnifiedIdentityDocKindCodeType();
    }

    /**
     * Create an instance of {@link UnifiedMeasurementUnitCodeType }
     * 
     */
    public UnifiedMeasurementUnitCodeType createUnifiedMeasurementUnitCodeType() {
        return new UnifiedMeasurementUnitCodeType();
    }

    /**
     * Create an instance of {@link UnifiedOptionalCode20Type }
     * 
     */
    public UnifiedOptionalCode20Type createUnifiedOptionalCode20Type() {
        return new UnifiedOptionalCode20Type();
    }

    /**
     * Create an instance of {@link UnifiedPackageKindCodeType }
     * 
     */
    public UnifiedPackageKindCodeType createUnifiedPackageKindCodeType() {
        return new UnifiedPackageKindCodeType();
    }

    /**
     * Create an instance of {@link UnifiedTransportModeCodeType }
     * 
     */
    public UnifiedTransportModeCodeType createUnifiedTransportModeCodeType() {
        return new UnifiedTransportModeCodeType();
    }

    /**
     * Create an instance of {@link VideoType }
     * 
     */
    public VideoType createVideoType() {
        return new VideoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AIId")
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
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AbbreviationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAbbreviationName(String value) {
        return new JAXBElement<String>(_AbbreviationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ActivityEndDate")
    public JAXBElement<XMLGregorianCalendar> createActivityEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActivityEndDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ActivityStartDate")
    public JAXBElement<XMLGregorianCalendar> createActivityStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActivityStartDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AdditionalInfoText")
    public JAXBElement<String> createAdditionalInfoText(String value) {
        return new JAXBElement<String>(_AdditionalInfoText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AddressKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAddressKindCode(String value) {
        return new JAXBElement<String>(_AddressKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AddressText")
    public JAXBElement<String> createAddressText(String value) {
        return new JAXBElement<String>(_AddressText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AdministrativeDivisionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAdministrativeDivisionCode(String value) {
        return new JAXBElement<String>(_AdministrativeDivisionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AdministrativeDivisionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAdministrativeDivisionName(String value) {
        return new JAXBElement<String>(_AdministrativeDivisionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AgeDuration")
    public JAXBElement<Duration> createAgeDuration(Duration value) {
        return new JAXBElement<Duration>(_AgeDuration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AnnotationText")
    public JAXBElement<String> createAnnotationText(String value) {
        return new JAXBElement<String>(_AnnotationText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AreaMeasure")
    public JAXBElement<PhysicalMeasureType> createAreaMeasure(PhysicalMeasureType value) {
        return new JAXBElement<PhysicalMeasureType>(_AreaMeasure_QNAME, PhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AuthorityBriefName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAuthorityBriefName(String value) {
        return new JAXBElement<String>(_AuthorityBriefName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AuthorityDecisionCode")
    public JAXBElement<StatusCodeType> createAuthorityDecisionCode(StatusCodeType value) {
        return new JAXBElement<StatusCodeType>(_AuthorityDecisionCode_QNAME, StatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AuthorityId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAuthorityId(String value) {
        return new JAXBElement<String>(_AuthorityId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AuthorityName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAuthorityName(String value) {
        return new JAXBElement<String>(_AuthorityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedId20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedId20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "AuthorityV2Id")
    public JAXBElement<UnifiedId20Type> createAuthorityV2Id(UnifiedId20Type value) {
        return new JAXBElement<UnifiedId20Type>(_AuthorityV2Id_QNAME, UnifiedId20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BankAccountId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBankAccountId(String value) {
        return new JAXBElement<String>(_BankAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BankCorrAccountId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBankCorrAccountId(String value) {
        return new JAXBElement<String>(_BankCorrAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BankId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBankId(String value) {
        return new JAXBElement<String>(_BankId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BankName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBankName(String value) {
        return new JAXBElement<String>(_BankName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BirthDate")
    public JAXBElement<XMLGregorianCalendar> createBirthDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BirthDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BorderCheckpointCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBorderCheckpointCode(String value) {
        return new JAXBElement<String>(_BorderCheckpointCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BorderCheckpointName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBorderCheckpointName(String value) {
        return new JAXBElement<String>(_BorderCheckpointName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BuildingNumberId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBuildingNumberId(String value) {
        return new JAXBElement<String>(_BuildingNumberId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BusinessEntityBriefName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBusinessEntityBriefName(String value) {
        return new JAXBElement<String>(_BusinessEntityBriefName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessEntityIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BusinessEntityIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BusinessEntityId")
    public JAXBElement<BusinessEntityIdType> createBusinessEntityId(BusinessEntityIdType value) {
        return new JAXBElement<BusinessEntityIdType>(_BusinessEntityId_QNAME, BusinessEntityIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BusinessEntityName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBusinessEntityName(String value) {
        return new JAXBElement<String>(_BusinessEntityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BusinessEntityTypeCode")
    public JAXBElement<UnifiedCode20Type> createBusinessEntityTypeCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_BusinessEntityTypeCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BusinessEntityTypeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBusinessEntityTypeName(String value) {
        return new JAXBElement<String>(_BusinessEntityTypeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "BusinessEntityUnitName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBusinessEntityUnitName(String value) {
        return new JAXBElement<String>(_BusinessEntityUnitName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CargoHandlingLocationCode")
    public JAXBElement<UnifiedCode20Type> createCargoHandlingLocationCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_CargoHandlingLocationCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckSumIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckSumIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CheckSumId")
    public JAXBElement<CheckSumIdType> createCheckSumId(CheckSumIdType value) {
        return new JAXBElement<CheckSumIdType>(_CheckSumId_QNAME, CheckSumIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CityName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCityName(String value) {
        return new JAXBElement<String>(_CityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ClassificationLevelCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createClassificationLevelCode(String value) {
        return new JAXBElement<String>(_ClassificationLevelCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ClassificationMethodCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createClassificationMethodCode(String value) {
        return new JAXBElement<String>(_ClassificationMethodCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ClassificationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createClassificationName(String value) {
        return new JAXBElement<String>(_ClassificationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodeListChangeKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCodeListChangeKindCode(String value) {
        return new JAXBElement<String>(_CodeListChangeKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodeListCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCodeListCode(String value) {
        return new JAXBElement<String>(_CodeListCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodeListConductMethodCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCodeListConductMethodCode(String value) {
        return new JAXBElement<String>(_CodeListConductMethodCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodeListEventCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCodeListEventCode(String value) {
        return new JAXBElement<String>(_CodeListEventCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodeListItemEndDate")
    public JAXBElement<XMLGregorianCalendar> createCodeListItemEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CodeListItemEndDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodeListItemStartDate")
    public JAXBElement<XMLGregorianCalendar> createCodeListItemStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CodeListItemStartDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodeListKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCodeListKindCode(String value) {
        return new JAXBElement<String>(_CodeListKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodeListName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCodeListName(String value) {
        return new JAXBElement<String>(_CodeListName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodeListProvideMethodCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCodeListProvideMethodCode(String value) {
        return new JAXBElement<String>(_CodeListProvideMethodCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodeListStandardId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCodeListStandardId(String value) {
        return new JAXBElement<String>(_CodeListStandardId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodifiedListId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCodifiedListId(String value) {
        return new JAXBElement<String>(_CodifiedListId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodifiedListItemCode")
    public JAXBElement<ClassifiedReferenceDataItemCodeType> createCodifiedListItemCode(ClassifiedReferenceDataItemCodeType value) {
        return new JAXBElement<ClassifiedReferenceDataItemCodeType>(_CodifiedListItemCode_QNAME, ClassifiedReferenceDataItemCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemNameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemNameType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CodifiedListItemName")
    public JAXBElement<ClassifiedReferenceDataItemNameType> createCodifiedListItemName(ClassifiedReferenceDataItemNameType value) {
        return new JAXBElement<ClassifiedReferenceDataItemNameType>(_CodifiedListItemName_QNAME, ClassifiedReferenceDataItemNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CommodityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCommodityCode(String value) {
        return new JAXBElement<String>(_CommodityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CommodityMeasure")
    public JAXBElement<PhysicalMeasureType> createCommodityMeasure(PhysicalMeasureType value) {
        return new JAXBElement<PhysicalMeasureType>(_CommodityMeasure_QNAME, PhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CommodityName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCommodityName(String value) {
        return new JAXBElement<String>(_CommodityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CommunicationChannelCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCommunicationChannelCode(String value) {
        return new JAXBElement<String>(_CommunicationChannelCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CommunicationChannelId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCommunicationChannelId(String value) {
        return new JAXBElement<String>(_CommunicationChannelId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CommunicationChannelName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCommunicationChannelName(String value) {
        return new JAXBElement<String>(_CommunicationChannelName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ConfidentialityDegreeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createConfidentialityDegreeCode(String value) {
        return new JAXBElement<String>(_ConfidentialityDegreeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCountryCode(String value) {
        return new JAXBElement<String>(_CountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CurrencyCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCurrencyCode(String value) {
        return new JAXBElement<String>(_CurrencyCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CurrencyConversionRate")
    public JAXBElement<BigDecimal> createCurrencyConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CurrencyConversionRate_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CurrentVersionDateTime")
    public JAXBElement<XMLGregorianCalendar> createCurrentVersionDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CurrentVersionDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CustomsOfficeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsOfficeCode(String value) {
        return new JAXBElement<String>(_CustomsOfficeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "CustomsOfficeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCustomsOfficeName(String value) {
        return new JAXBElement<String>(_CustomsOfficeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DayQuantity")
    public JAXBElement<BigInteger> createDayQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_DayQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DeathDate")
    public JAXBElement<XMLGregorianCalendar> createDeathDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DeathDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DescriptionText")
    public JAXBElement<String> createDescriptionText(String value) {
        return new JAXBElement<String>(_DescriptionText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DesignationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDesignationName(String value) {
        return new JAXBElement<String>(_DesignationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DetailsResourceId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDetailsResourceId(String value) {
        return new JAXBElement<String>(_DetailsResourceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DistrictName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDistrictName(String value) {
        return new JAXBElement<String>(_DistrictName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocAuthorityId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocAuthorityId(String value) {
        return new JAXBElement<String>(_DocAuthorityId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryTextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BinaryTextType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocBinaryText")
    public JAXBElement<BinaryTextType> createDocBinaryText(BinaryTextType value) {
        return new JAXBElement<BinaryTextType>(_DocBinaryText_QNAME, BinaryTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocChangeDateTime")
    public JAXBElement<XMLGregorianCalendar> createDocChangeDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocChangeDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocCreationDate")
    public JAXBElement<XMLGregorianCalendar> createDocCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocCreationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocId(String value) {
        return new JAXBElement<String>(_DocId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocIssuingAuthorityId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocIssuingAuthorityId(String value) {
        return new JAXBElement<String>(_DocIssuingAuthorityId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocIssuingAuthorityName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocIssuingAuthorityName(String value) {
        return new JAXBElement<String>(_DocIssuingAuthorityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocKindCode")
    public JAXBElement<UnifiedCode20Type> createDocKindCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_DocKindCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocKindName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocKindName(String value) {
        return new JAXBElement<String>(_DocKindName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocName(String value) {
        return new JAXBElement<String>(_DocName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocRequestKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocRequestKindCode(String value) {
        return new JAXBElement<String>(_DocRequestKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocSeriesId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocSeriesId(String value) {
        return new JAXBElement<String>(_DocSeriesId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocStartDate")
    public JAXBElement<XMLGregorianCalendar> createDocStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocStartDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDocStatusCode(String value) {
        return new JAXBElement<String>(_DocStatusCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocValidityDate")
    public JAXBElement<XMLGregorianCalendar> createDocValidityDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocValidityDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "DocValidityDuration")
    public JAXBElement<Duration> createDocValidityDuration(Duration value) {
        return new JAXBElement<Duration>(_DocValidityDuration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EAEUDocCreationDate")
    public JAXBElement<XMLGregorianCalendar> createEAEUDocCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EAEUDocCreationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EAEUDocEffectiveDate")
    public JAXBElement<XMLGregorianCalendar> createEAEUDocEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EAEUDocEffectiveDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EAEUDocId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEAEUDocId(String value) {
        return new JAXBElement<String>(_EAEUDocId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EAEUDocIssuerId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEAEUDocIssuerId(String value) {
        return new JAXBElement<String>(_EAEUDocIssuerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EAEUDocIssuerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEAEUDocIssuerName(String value) {
        return new JAXBElement<String>(_EAEUDocIssuerName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EAEUDocKindCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EAEUDocKindCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EAEUDocKindCode")
    public JAXBElement<EAEUDocKindCodeType> createEAEUDocKindCode(EAEUDocKindCodeType value) {
        return new JAXBElement<EAEUDocKindCodeType>(_EAEUDocKindCode_QNAME, EAEUDocKindCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EAEUDocName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEAEUDocName(String value) {
        return new JAXBElement<String>(_EAEUDocName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EAEUDocValidityDate")
    public JAXBElement<XMLGregorianCalendar> createEAEUDocValidityDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EAEUDocValidityDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EAEUScopeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEAEUScopeCode(String value) {
        return new JAXBElement<String>(_EAEUScopeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EDocCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEDocCode(String value) {
        return new JAXBElement<String>(_EDocCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EDocDateTime")
    public JAXBElement<XMLGregorianCalendar> createEDocDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EDocDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EDocDetailedErrorText")
    public JAXBElement<String> createEDocDetailedErrorText(String value) {
        return new JAXBElement<String>(_EDocDetailedErrorText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EDocElementText")
    public JAXBElement<String> createEDocElementText(String value) {
        return new JAXBElement<String>(_EDocElementText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EDocErrorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEDocErrorCode(String value) {
        return new JAXBElement<String>(_EDocErrorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EDocErrorText")
    public JAXBElement<String> createEDocErrorText(String value) {
        return new JAXBElement<String>(_EDocErrorText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EDocId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEDocId(String value) {
        return new JAXBElement<String>(_EDocId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EDocRefId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEDocRefId(String value) {
        return new JAXBElement<String>(_EDocRefId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EDocVersionId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEDocVersionId(String value) {
        return new JAXBElement<String>(_EDocVersionId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EducationLevelCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEducationLevelCode(String value) {
        return new JAXBElement<String>(_EducationLevelCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EndDate")
    public JAXBElement<XMLGregorianCalendar> createEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EndDateTime")
    public JAXBElement<XMLGregorianCalendar> createEndDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EndTime")
    public JAXBElement<XMLGregorianCalendar> createEndTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EndTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EngineCapacityMeasure")
    public JAXBElement<PhysicalMeasureType> createEngineCapacityMeasure(PhysicalMeasureType value) {
        return new JAXBElement<PhysicalMeasureType>(_EngineCapacityMeasure_QNAME, PhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EngineId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEngineId(String value) {
        return new JAXBElement<String>(_EngineId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EngineMaxPowerMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createEngineMaxPowerMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_EngineMaxPowerMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EngineModelCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEngineModelCode(String value) {
        return new JAXBElement<String>(_EngineModelCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EventDate")
    public JAXBElement<XMLGregorianCalendar> createEventDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EventDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EventDateTime")
    public JAXBElement<XMLGregorianCalendar> createEventDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EventDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "EventYear")
    public JAXBElement<XMLGregorianCalendar> createEventYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EventYear_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "FirstName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "FormNumberId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFormNumberId(String value) {
        return new JAXBElement<String>(_FormNumberId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "FormSeriesId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createFormSeriesId(String value) {
        return new JAXBElement<String>(_FormSeriesId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "GLNId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGLNId(String value) {
        return new JAXBElement<String>(_GLNId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "GTINId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGTINId(String value) {
        return new JAXBElement<String>(_GTINId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "GrossMassMeasure")
    public JAXBElement<PhysicalMeasureType> createGrossMassMeasure(PhysicalMeasureType value) {
        return new JAXBElement<PhysicalMeasureType>(_GrossMassMeasure_QNAME, PhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "GrossVolumeMeasure")
    public JAXBElement<PhysicalMeasureType> createGrossVolumeMeasure(PhysicalMeasureType value) {
        return new JAXBElement<PhysicalMeasureType>(_GrossVolumeMeasure_QNAME, PhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "HeightMeasure")
    public JAXBElement<PhysicalMeasureType> createHeightMeasure(PhysicalMeasureType value) {
        return new JAXBElement<PhysicalMeasureType>(_HeightMeasure_QNAME, PhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "IPObjectId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIPObjectId(String value) {
        return new JAXBElement<String>(_IPObjectId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationMeansKindCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentificationMeansKindCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "IdentificationMeansKindCode")
    public JAXBElement<IdentificationMeansKindCodeType> createIdentificationMeansKindCode(IdentificationMeansKindCodeType value) {
        return new JAXBElement<IdentificationMeansKindCodeType>(_IdentificationMeansKindCode_QNAME, IdentificationMeansKindCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "IdentificationMeansUnitCharacterValueId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIdentificationMeansUnitCharacterValueId(String value) {
        return new JAXBElement<String>(_IdentificationMeansUnitCharacterValueId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentityDocKindCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdentityDocKindCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "IdentityDocKindCode")
    public JAXBElement<IdentityDocKindCodeType> createIdentityDocKindCode(IdentityDocKindCodeType value) {
        return new JAXBElement<IdentityDocKindCodeType>(_IdentityDocKindCode_QNAME, IdentityDocKindCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "IdentityDocNumberId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIdentityDocNumberId(String value) {
        return new JAXBElement<String>(_IdentityDocNumberId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "IdentityDocSeriesId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createIdentityDocSeriesId(String value) {
        return new JAXBElement<String>(_IdentityDocSeriesId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "InfEnvelopeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInfEnvelopeCode(String value) {
        return new JAXBElement<String>(_InfEnvelopeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "InformationResourceId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInformationResourceId(String value) {
        return new JAXBElement<String>(_InformationResourceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "InformationResourceName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInformationResourceName(String value) {
        return new JAXBElement<String>(_InformationResourceName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "InternationalClassificationUseCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createInternationalClassificationUseCode(String value) {
        return new JAXBElement<String>(_InternationalClassificationUseCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocalizedName500Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LocalizedName500Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "InternationalNonproprietaryName")
    public JAXBElement<LocalizedName500Type> createInternationalNonproprietaryName(LocalizedName500Type value) {
        return new JAXBElement<LocalizedName500Type>(_InternationalNonproprietaryName_QNAME, LocalizedName500Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ItemQuantity")
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
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "KeywordName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createKeywordName(String value) {
        return new JAXBElement<String>(_KeywordName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "LanguageCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLanguageCode(String value) {
        return new JAXBElement<String>(_LanguageCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "LastName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLastName(String value) {
        return new JAXBElement<String>(_LastName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "LatitudeMeasure")
    public JAXBElement<BigDecimal> createLatitudeMeasure(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LatitudeMeasure_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "LegalActCreationDate")
    public JAXBElement<XMLGregorianCalendar> createLegalActCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LegalActCreationDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "LegalActId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLegalActId(String value) {
        return new JAXBElement<String>(_LegalActId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "LegalActKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLegalActKindCode(String value) {
        return new JAXBElement<String>(_LegalActKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "LegalActKindName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLegalActKindName(String value) {
        return new JAXBElement<String>(_LegalActKindName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "LegalActName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLegalActName(String value) {
        return new JAXBElement<String>(_LegalActName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "LengthMeasure")
    public JAXBElement<PhysicalMeasureType> createLengthMeasure(PhysicalMeasureType value) {
        return new JAXBElement<PhysicalMeasureType>(_LengthMeasure_QNAME, PhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "LocationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLocationName(String value) {
        return new JAXBElement<String>(_LocationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "LongitudeMeasure")
    public JAXBElement<BigDecimal> createLongitudeMeasure(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LongitudeMeasure_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ManufactureDate")
    public JAXBElement<XMLGregorianCalendar> createManufactureDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ManufactureDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ManufactureMonth")
    public JAXBElement<XMLGregorianCalendar> createManufactureMonth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ManufactureMonth_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ManufactureYear")
    public JAXBElement<XMLGregorianCalendar> createManufactureYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ManufactureYear_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "MarketId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMarketId(String value) {
        return new JAXBElement<String>(_MarketId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "MassMeasure")
    public JAXBElement<PhysicalMeasureType> createMassMeasure(PhysicalMeasureType value) {
        return new JAXBElement<PhysicalMeasureType>(_MassMeasure_QNAME, PhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "MiddleName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMiddleName(String value) {
        return new JAXBElement<String>(_MiddleName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "MonthQuantity")
    public JAXBElement<BigInteger> createMonthQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_MonthQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCountryCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCountryCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "NationalityCountryCode")
    public JAXBElement<UnifiedCountryCodeType> createNationalityCountryCode(UnifiedCountryCodeType value) {
        return new JAXBElement<UnifiedCountryCodeType>(_NationalityCountryCode_QNAME, UnifiedCountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "NetMassMeasure")
    public JAXBElement<PhysicalMeasureType> createNetMassMeasure(PhysicalMeasureType value) {
        return new JAXBElement<PhysicalMeasureType>(_NetMassMeasure_QNAME, PhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "NetVolumeMeasure")
    public JAXBElement<PhysicalMeasureType> createNetVolumeMeasure(PhysicalMeasureType value) {
        return new JAXBElement<PhysicalMeasureType>(_NetVolumeMeasure_QNAME, PhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "NoteText")
    public JAXBElement<String> createNoteText(String value) {
        return new JAXBElement<String>(_NoteText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ObjectOrdinal")
    public JAXBElement<BigInteger> createObjectOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_ObjectOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObsComponentTextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObsComponentTextType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ObsAttributeText")
    public JAXBElement<ObsComponentTextType> createObsAttributeText(ObsComponentTextType value) {
        return new JAXBElement<ObsComponentTextType>(_ObsAttributeText_QNAME, ObsComponentTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObsComponentTextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObsComponentTextType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ObsKeyText")
    public JAXBElement<ObsComponentTextType> createObsKeyText(ObsComponentTextType value) {
        return new JAXBElement<ObsComponentTextType>(_ObsKeyText_QNAME, ObsComponentTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ObsValue")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createObsValue(String value) {
        return new JAXBElement<String>(_ObsValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "OperatorName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOperatorName(String value) {
        return new JAXBElement<String>(_OperatorName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "OrganizationBriefName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOrganizationBriefName(String value) {
        return new JAXBElement<String>(_OrganizationBriefName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "OrganizationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOrganizationCode(String value) {
        return new JAXBElement<String>(_OrganizationCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "OrganizationId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOrganizationId(String value) {
        return new JAXBElement<String>(_OrganizationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "OrganizationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOrganizationName(String value) {
        return new JAXBElement<String>(_OrganizationName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PackageKindCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PackageKindCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PackageKindCode")
    public JAXBElement<PackageKindCodeType> createPackageKindCode(PackageKindCodeType value) {
        return new JAXBElement<PackageKindCodeType>(_PackageKindCode_QNAME, PackageKindCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PackageQuantity")
    public JAXBElement<BigInteger> createPackageQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_PackageQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PageQuantity")
    public JAXBElement<BigInteger> createPageQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_PageQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ParentCodifiedListItemCode")
    public JAXBElement<ClassifiedReferenceDataItemCodeType> createParentCodifiedListItemCode(ClassifiedReferenceDataItemCodeType value) {
        return new JAXBElement<ClassifiedReferenceDataItemCodeType>(_ParentCodifiedListItemCode_QNAME, ClassifiedReferenceDataItemCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ParentReferenceDataItemCode")
    public JAXBElement<ClassifiedReferenceDataItemCodeType> createParentReferenceDataItemCode(ClassifiedReferenceDataItemCodeType value) {
        return new JAXBElement<ClassifiedReferenceDataItemCodeType>(_ParentReferenceDataItemCode_QNAME, ClassifiedReferenceDataItemCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ParentReferenceDataSectionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createParentReferenceDataSectionCode(String value) {
        return new JAXBElement<String>(_ParentReferenceDataSectionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PassengerQuantity")
    public JAXBElement<BigInteger> createPassengerQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_PassengerQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PayeeAccountId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPayeeAccountId(String value) {
        return new JAXBElement<String>(_PayeeAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PayeeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPayeeName(String value) {
        return new JAXBElement<String>(_PayeeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingAmountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountingAmountType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PaymentAmount")
    public JAXBElement<AccountingAmountType> createPaymentAmount(AccountingAmountType value) {
        return new JAXBElement<AccountingAmountType>(_PaymentAmount_QNAME, AccountingAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PaymentBudgetCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentBudgetCode(String value) {
        return new JAXBElement<String>(_PaymentBudgetCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PaymentDateTime")
    public JAXBElement<XMLGregorianCalendar> createPaymentDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PaymentDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PaymentId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentId(String value) {
        return new JAXBElement<String>(_PaymentId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PaymentKindName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentKindName(String value) {
        return new JAXBElement<String>(_PaymentKindName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PaymentPurposeText")
    public JAXBElement<String> createPaymentPurposeText(String value) {
        return new JAXBElement<String>(_PaymentPurposeText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PaymentSystemAccountId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentSystemAccountId(String value) {
        return new JAXBElement<String>(_PaymentSystemAccountId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PaymentSystemName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPaymentSystemName(String value) {
        return new JAXBElement<String>(_PaymentSystemName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PositionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPositionName(String value) {
        return new JAXBElement<String>(_PositionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PostCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostCode(String value) {
        return new JAXBElement<String>(_PostCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "PostOfficeBoxId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPostOfficeBoxId(String value) {
        return new JAXBElement<String>(_PostOfficeBoxId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ProcessingResultCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProcessingResultCode(String value) {
        return new JAXBElement<String>(_ProcessingResultCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ProcessingResultV2Code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProcessingResultV2Code(String value) {
        return new JAXBElement<String>(_ProcessingResultV2Code_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingAmountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountingAmountType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ProductCostAmount")
    public JAXBElement<AccountingAmountType> createProductCostAmount(AccountingAmountType value) {
        return new JAXBElement<AccountingAmountType>(_ProductCostAmount_QNAME, AccountingAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ProductId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductId(String value) {
        return new JAXBElement<String>(_ProductId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ProductInstanceId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductInstanceId(String value) {
        return new JAXBElement<String>(_ProductInstanceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ProductMarkName")
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
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ProductModelName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductModelName(String value) {
        return new JAXBElement<String>(_ProductModelName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ProductName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductName(String value) {
        return new JAXBElement<String>(_ProductName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ProductShelfLifeDuration")
    public JAXBElement<Duration> createProductShelfLifeDuration(Duration value) {
        return new JAXBElement<Duration>(_ProductShelfLifeDuration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ProductShelfLifeEndDate")
    public JAXBElement<XMLGregorianCalendar> createProductShelfLifeEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProductShelfLifeEndDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ProductSortName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProductSortName(String value) {
        return new JAXBElement<String>(_ProductSortName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ProvidedInformationCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createProvidedInformationCountryCode(String value) {
        return new JAXBElement<String>(_ProvidedInformationCountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "QualificationDegreeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createQualificationDegreeCode(String value) {
        return new JAXBElement<String>(_QualificationDegreeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "QualificationDegreeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createQualificationDegreeName(String value) {
        return new JAXBElement<String>(_QualificationDegreeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ReferenceDataId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReferenceDataId(String value) {
        return new JAXBElement<String>(_ReferenceDataId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ReferenceDataItemCharacteristicCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReferenceDataItemCharacteristicCode(String value) {
        return new JAXBElement<String>(_ReferenceDataItemCharacteristicCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ReferenceDataItemCharacteristicName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReferenceDataItemCharacteristicName(String value) {
        return new JAXBElement<String>(_ReferenceDataItemCharacteristicName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ReferenceDataItemCode")
    public JAXBElement<ClassifiedReferenceDataItemCodeType> createReferenceDataItemCode(ClassifiedReferenceDataItemCodeType value) {
        return new JAXBElement<ClassifiedReferenceDataItemCodeType>(_ReferenceDataItemCode_QNAME, ClassifiedReferenceDataItemCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemNameType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemNameType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ReferenceDataItemName")
    public JAXBElement<ClassifiedReferenceDataItemNameType> createReferenceDataItemName(ClassifiedReferenceDataItemNameType value) {
        return new JAXBElement<ClassifiedReferenceDataItemNameType>(_ReferenceDataItemName_QNAME, ClassifiedReferenceDataItemNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemTextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClassifiedReferenceDataItemTextType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ReferenceDataItemText")
    public JAXBElement<ClassifiedReferenceDataItemTextType> createReferenceDataItemText(ClassifiedReferenceDataItemTextType value) {
        return new JAXBElement<ClassifiedReferenceDataItemTextType>(_ReferenceDataItemText_QNAME, ClassifiedReferenceDataItemTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ReferenceDataSectionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReferenceDataSectionCode(String value) {
        return new JAXBElement<String>(_ReferenceDataSectionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ReferenceDataSectionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReferenceDataSectionName(String value) {
        return new JAXBElement<String>(_ReferenceDataSectionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "RegionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRegionName(String value) {
        return new JAXBElement<String>(_RegionName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObsComponentTextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObsComponentTextType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ReportAttributeText")
    public JAXBElement<ObsComponentTextType> createReportAttributeText(ObsComponentTextType value) {
        return new JAXBElement<ObsComponentTextType>(_ReportAttributeText_QNAME, ObsComponentTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ReportKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReportKindCode(String value) {
        return new JAXBElement<String>(_ReportKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ReportName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createReportName(String value) {
        return new JAXBElement<String>(_ReportName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "ResourceId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createResourceId(String value) {
        return new JAXBElement<String>(_ResourceId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "RevisionPeriodicityText")
    public JAXBElement<String> createRevisionPeriodicityText(String value) {
        return new JAXBElement<String>(_RevisionPeriodicityText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "RoomNumberId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRoomNumberId(String value) {
        return new JAXBElement<String>(_RoomNumberId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "RoutePointKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createRoutePointKindCode(String value) {
        return new JAXBElement<String>(_RoutePointKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "SealId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSealId(String value) {
        return new JAXBElement<String>(_SealId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "SeatQuantity")
    public JAXBElement<BigInteger> createSeatQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_SeatQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "SettlementName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSettlementName(String value) {
        return new JAXBElement<String>(_SettlementName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "SexCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSexCode(String value) {
        return new JAXBElement<String>(_SexCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCurrencyCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCurrencyCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "SourceCurrencyCode")
    public JAXBElement<UnifiedCurrencyCodeType> createSourceCurrencyCode(UnifiedCurrencyCodeType value) {
        return new JAXBElement<UnifiedCurrencyCodeType>(_SourceCurrencyCode_QNAME, UnifiedCurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "SourceCurrencyUnitQuantity")
    public JAXBElement<BigInteger> createSourceCurrencyUnitQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_SourceCurrencyUnitQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "SpecialityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpecialityCode(String value) {
        return new JAXBElement<String>(_SpecialityCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "SpecialityName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSpecialityName(String value) {
        return new JAXBElement<String>(_SpecialityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "StartDate")
    public JAXBElement<XMLGregorianCalendar> createStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "StartDateTime")
    public JAXBElement<XMLGregorianCalendar> createStartDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "StartTime")
    public JAXBElement<XMLGregorianCalendar> createStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StartTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "StateCodeListPresenceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStateCodeListPresenceCode(String value) {
        return new JAXBElement<String>(_StateCodeListPresenceCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatusCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StatusCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "StatusCode")
    public JAXBElement<StatusCodeType> createStatusCode(StatusCodeType value) {
        return new JAXBElement<StatusCodeType>(_StatusCode_QNAME, StatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "StatusEndDate")
    public JAXBElement<XMLGregorianCalendar> createStatusEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StatusEndDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "StatusStartDate")
    public JAXBElement<XMLGregorianCalendar> createStatusStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_StatusStartDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "StreetName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStreetName(String value) {
        return new JAXBElement<String>(_StreetName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "SubjectBriefName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSubjectBriefName(String value) {
        return new JAXBElement<String>(_SubjectBriefName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "SubjectName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSubjectName(String value) {
        return new JAXBElement<String>(_SubjectName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "SupplyChainPartyKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSupplyChainPartyKindCode(String value) {
        return new JAXBElement<String>(_SupplyChainPartyKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCurrencyCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCurrencyCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "TargetCurrencyCode")
    public JAXBElement<UnifiedCurrencyCodeType> createTargetCurrencyCode(UnifiedCurrencyCodeType value) {
        return new JAXBElement<UnifiedCurrencyCodeType>(_TargetCurrencyCode_QNAME, UnifiedCurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "TargetCurrencyUnitQuantity")
    public JAXBElement<BigInteger> createTargetCurrencyUnitQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_TargetCurrencyUnitQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "TaxRegistrationReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTaxRegistrationReasonCode(String value) {
        return new JAXBElement<String>(_TaxRegistrationReasonCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "TaxpayerId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTaxpayerId(String value) {
        return new JAXBElement<String>(_TaxpayerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "TerritoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTerritoryCode(String value) {
        return new JAXBElement<String>(_TerritoryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingAmountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountingAmountType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "TotalAmount")
    public JAXBElement<AccountingAmountType> createTotalAmount(AccountingAmountType value) {
        return new JAXBElement<AccountingAmountType>(_TotalAmount_QNAME, AccountingAmountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransliterationTextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransliterationTextType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "TransliterationText")
    public JAXBElement<TransliterationTextType> createTransliterationText(TransliterationTextType value) {
        return new JAXBElement<TransliterationTextType>(_TransliterationText_QNAME, TransliterationTextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransportMeansRegIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransportMeansRegIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "TransportMeansRegId")
    public JAXBElement<TransportMeansRegIdType> createTransportMeansRegId(TransportMeansRegIdType value) {
        return new JAXBElement<TransportMeansRegIdType>(_TransportMeansRegId_QNAME, TransportMeansRegIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "TransportModeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createTransportModeCode(String value) {
        return new JAXBElement<String>(_TransportModeCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedBankIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedBankIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedBankId")
    public JAXBElement<UnifiedBankIdType> createUnifiedBankId(UnifiedBankIdType value) {
        return new JAXBElement<UnifiedBankIdType>(_UnifiedBankId_QNAME, UnifiedBankIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedCommodityMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createUnifiedCommodityMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_UnifiedCommodityMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedCommunicationChannelCode")
    public JAXBElement<UnifiedCode20Type> createUnifiedCommunicationChannelCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_UnifiedCommunicationChannelCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCountryCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCountryCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedCountryCode")
    public JAXBElement<UnifiedCountryCodeType> createUnifiedCountryCode(UnifiedCountryCodeType value) {
        return new JAXBElement<UnifiedCountryCodeType>(_UnifiedCountryCode_QNAME, UnifiedCountryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCurrencyCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCurrencyCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedCurrencyCode")
    public JAXBElement<UnifiedCurrencyCodeType> createUnifiedCurrencyCode(UnifiedCurrencyCodeType value) {
        return new JAXBElement<UnifiedCurrencyCodeType>(_UnifiedCurrencyCode_QNAME, UnifiedCurrencyCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCurrencyN3CodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCurrencyN3CodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedCurrencyN3Code")
    public JAXBElement<UnifiedCurrencyN3CodeType> createUnifiedCurrencyN3Code(UnifiedCurrencyN3CodeType value) {
        return new JAXBElement<UnifiedCurrencyN3CodeType>(_UnifiedCurrencyN3Code_QNAME, UnifiedCurrencyN3CodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedId20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedId20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedEAEUDocIssuerId")
    public JAXBElement<UnifiedId20Type> createUnifiedEAEUDocIssuerId(UnifiedId20Type value) {
        return new JAXBElement<UnifiedId20Type>(_UnifiedEAEUDocIssuerId_QNAME, UnifiedId20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedEAEUDocKindCode")
    public JAXBElement<UnifiedCode20Type> createUnifiedEAEUDocKindCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_UnifiedEAEUDocKindCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedGrossMassMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createUnifiedGrossMassMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_UnifiedGrossMassMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedGrossVolumeMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createUnifiedGrossVolumeMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_UnifiedGrossVolumeMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedHeightMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createUnifiedHeightMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_UnifiedHeightMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedIdentityDocKindCode")
    public JAXBElement<UnifiedCode20Type> createUnifiedIdentityDocKindCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_UnifiedIdentityDocKindCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedLengthMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createUnifiedLengthMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_UnifiedLengthMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedMassMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createUnifiedMassMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_UnifiedMassMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedMeasurementUnitCode")
    public JAXBElement<UnifiedCode20Type> createUnifiedMeasurementUnitCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_UnifiedMeasurementUnitCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedNetMassMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createUnifiedNetMassMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_UnifiedNetMassMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedNetVolumeMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createUnifiedNetVolumeMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_UnifiedNetVolumeMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedOrganizationCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedOrganizationCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedOrganizationCode")
    public JAXBElement<UnifiedOrganizationCodeType> createUnifiedOrganizationCode(UnifiedOrganizationCodeType value) {
        return new JAXBElement<UnifiedOrganizationCodeType>(_UnifiedOrganizationCode_QNAME, UnifiedOrganizationCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedOrganizationIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedOrganizationIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedOrganizationId")
    public JAXBElement<UnifiedOrganizationIdType> createUnifiedOrganizationId(UnifiedOrganizationIdType value) {
        return new JAXBElement<UnifiedOrganizationIdType>(_UnifiedOrganizationId_QNAME, UnifiedOrganizationIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedPackageKindCode")
    public JAXBElement<UnifiedCode20Type> createUnifiedPackageKindCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_UnifiedPackageKindCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountingAmountV3Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountingAmountV3Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedPaymentAmount")
    public JAXBElement<AccountingAmountV3Type> createUnifiedPaymentAmount(AccountingAmountV3Type value) {
        return new JAXBElement<AccountingAmountV3Type>(_UnifiedPaymentAmount_QNAME, AccountingAmountV3Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPaymentBudgetCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPaymentBudgetCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedPaymentBudgetCode")
    public JAXBElement<UnifiedPaymentBudgetCodeType> createUnifiedPaymentBudgetCode(UnifiedPaymentBudgetCodeType value) {
        return new JAXBElement<UnifiedPaymentBudgetCodeType>(_UnifiedPaymentBudgetCode_QNAME, UnifiedPaymentBudgetCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedRoutePointKindCode")
    public JAXBElement<UnifiedCode20Type> createUnifiedRoutePointKindCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_UnifiedRoutePointKindCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedSexCode")
    public JAXBElement<UnifiedCode20Type> createUnifiedSexCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_UnifiedSexCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedTaxpayerIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedTaxpayerIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedTaxpayerId")
    public JAXBElement<UnifiedTaxpayerIdType> createUnifiedTaxpayerId(UnifiedTaxpayerIdType value) {
        return new JAXBElement<UnifiedTaxpayerIdType>(_UnifiedTaxpayerId_QNAME, UnifiedTaxpayerIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedTerritoryCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedTerritoryCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedTerritoryCode")
    public JAXBElement<UnifiedTerritoryCodeType> createUnifiedTerritoryCode(UnifiedTerritoryCodeType value) {
        return new JAXBElement<UnifiedTerritoryCodeType>(_UnifiedTerritoryCode_QNAME, UnifiedTerritoryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedTransportModeCode")
    public JAXBElement<UnifiedCode20Type> createUnifiedTransportModeCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_UnifiedTransportModeCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedCode20Type }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedWeekDayCode")
    public JAXBElement<UnifiedCode20Type> createUnifiedWeekDayCode(UnifiedCode20Type value) {
        return new JAXBElement<UnifiedCode20Type>(_UnifiedWeekDayCode_QNAME, UnifiedCode20Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnifiedPhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UnifiedWidthMeasure")
    public JAXBElement<UnifiedPhysicalMeasureType> createUnifiedWidthMeasure(UnifiedPhysicalMeasureType value) {
        return new JAXBElement<UnifiedPhysicalMeasureType>(_UnifiedWidthMeasure_QNAME, UnifiedPhysicalMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UniqueCustomsNumberId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createUniqueCustomsNumberId(String value) {
        return new JAXBElement<String>(_UniqueCustomsNumberId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UpdateDateTime")
    public JAXBElement<XMLGregorianCalendar> createUpdateDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_UpdateDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "UseText")
    public JAXBElement<String> createUseText(String value) {
        return new JAXBElement<String>(_UseText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleAxleOrdinal")
    public JAXBElement<BigInteger> createVehicleAxleOrdinal(BigInteger value) {
        return new JAXBElement<BigInteger>(_VehicleAxleOrdinal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleAxleQuantity")
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
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleBodyId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleBodyId(String value) {
        return new JAXBElement<String>(_VehicleBodyId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleCategoryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleCategoryCode(String value) {
        return new JAXBElement<String>(_VehicleCategoryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleChassisId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleChassisId(String value) {
        return new JAXBElement<String>(_VehicleChassisId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleCommercialName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleCommercialName(String value) {
        return new JAXBElement<String>(_VehicleCommercialName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleEPassportId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleEPassportId(String value) {
        return new JAXBElement<String>(_VehicleEPassportId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleEcoClassCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehicleEcoClassCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleEcoClassCode")
    public JAXBElement<VehicleEcoClassCodeType> createVehicleEcoClassCode(VehicleEcoClassCodeType value) {
        return new JAXBElement<VehicleEcoClassCodeType>(_VehicleEcoClassCode_QNAME, VehicleEcoClassCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleId(String value) {
        return new JAXBElement<String>(_VehicleId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleMakeCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehicleMakeCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleMakeCode")
    public JAXBElement<VehicleMakeCodeType> createVehicleMakeCode(VehicleMakeCodeType value) {
        return new JAXBElement<VehicleMakeCodeType>(_VehicleMakeCode_QNAME, VehicleMakeCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleMakeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleMakeName(String value) {
        return new JAXBElement<String>(_VehicleMakeName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleMassKindCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleMassKindCode(String value) {
        return new JAXBElement<String>(_VehicleMassKindCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehicleModelName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createVehicleModelName(String value) {
        return new JAXBElement<String>(_VehicleModelName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "VehiclePassengerQuantity")
    public JAXBElement<BigInteger> createVehiclePassengerQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_VehiclePassengerQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "WeekDayCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createWeekDayCode(String value) {
        return new JAXBElement<String>(_WeekDayCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhysicalMeasureType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14", name = "WidthMeasure")
    public JAXBElement<PhysicalMeasureType> createWidthMeasure(PhysicalMeasureType value) {
        return new JAXBElement<PhysicalMeasureType>(_WidthMeasure_QNAME, PhysicalMeasureType.class, null, value);
    }

}
