
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.amadeus.xml;

import java.util.List;
import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.amadeus.wsdl._2010._06.ws.link_v1.TransactionFlowLinkType;
import com.amadeus.xml._2010._06.security_v1.AMASecurityHostedUser;
import com.amadeus.xml._2010._06.session_v3.Session;
import com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.AvailcabinStatus;
import com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.ConversionRate;
import com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.DateOfFlight;
import com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.FareRule;
import com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.FlightQualification;
import com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.ItemNumber;
import com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.MsgType;
import com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.MultiCorporate;
import com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.PricingInfo;
import com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.PricingTickInfo;
import com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.TransportInformation;
import com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.TripDescription;
import com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo;
import com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FareRouteInfo;
import com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails;
import com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.InfoText;
import com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.StatusInfo;
import com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo;
import com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TransactionType;
import com.amadeus.xml.fmptbq_14_2_1a.AttributeType;
import com.amadeus.xml.fmptbq_14_2_1a.ConsumerReferenceInformationType;
import com.amadeus.xml.fmptbq_14_2_1a.FOPRepresentationType;
import com.amadeus.xml.fmptbq_14_2_1a.FareInformationType;
import com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.CombinationFareFamilies;
import com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.FareFamilies;
import com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.FareOptions;
import com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.FeeOption;
import com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.Itinerary;
import com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.OfficeIdDetails;
import com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.TicketChangeInfo;
import com.amadeus.xml.fmptbq_14_2_1a.GroupPassengerDetailsType;
import com.amadeus.xml.fmptbq_14_2_1a.NumberOfUnitsType;
import com.amadeus.xml.fmptbq_14_2_1a.TaxType;
import com.amadeus.xml.fmptbq_14_2_1a.TravelFlightInformationType165052S;
import com.amadeus.xml.fmptbq_14_2_1a.TravellerReferenceInformationType;
import com.amadeus.xml.fmptbq_14_2_1a.ValueSearchCriteriaType;
import com.amadeus.xml.fmptbr_14_2_1a.CompanyIdentificationTextType;
import com.amadeus.xml.fmptbr_14_2_1a.FareFamilyType;
import com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax;
import com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax;
import com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ErrorMessage;
import com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FeeDetails;
import com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex;
import com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.GlobalInformation;
import com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.MnrGrp;
import com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions;
import com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation;
import com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp;
import com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.WarningInfo;
import com.amadeus.xml.fmptbr_14_2_1a.StatusType;
import com.amadeus.xml.itareq_05_2_ia.AirSellFromRecommendation.ItineraryDetails;
import com.amadeus.xml.itareq_05_2_ia.MessageActionDetailsTypeI;
import com.amadeus.xml.itares_05_2_ia.AirSellFromRecommendationReply.ErrorAtMessageLevel;
import com.amadeus.xml.pnracc_14_1_1a.InteractiveFreeTextTypeI132924S;
import com.amadeus.xml.pnracc_14_1_1a.LongFreeTextType;
import com.amadeus.xml.pnracc_14_1_1a.NumberOfUnitsTypeI;
import com.amadeus.xml.pnracc_14_1_1a.PNRReply.DcsData;
import com.amadeus.xml.pnracc_14_1_1a.PNRReply.GeneralErrorInfo;
import com.amadeus.xml.pnracc_14_1_1a.PNRReply.OfferGroup;
import com.amadeus.xml.pnracc_14_1_1a.PNRReply.PnrHeader;
import com.amadeus.xml.pnracc_14_1_1a.PNRReply.PricingRecordGroup;
import com.amadeus.xml.pnracc_14_1_1a.PNRReply.TechnicalData;
import com.amadeus.xml.pnracc_14_1_1a.PNRReply.TstData;
import com.amadeus.xml.pnracc_14_1_1a.POSGroupType;
import com.amadeus.xml.pnracc_14_1_1a.PnrHistoryDataType;
import com.amadeus.xml.pnracc_14_1_1a.QueueType;
import com.amadeus.xml.pnracc_14_1_1a.ReservationSecurityInformationType156156S;
import com.amadeus.xml.pnracc_14_1_1a.SegmentGroupingInformationType;
import com.amadeus.xml.pnracc_14_1_1a.StatusType178422S;
import com.amadeus.xml.pnradd_14_1_1a.OptionalPNRActionsType;
import com.amadeus.xml.pnradd_14_1_1a.PNRAddMultiElements.DataElementsMaster;
import com.amadeus.xml.pnradd_14_1_1a.PNRAddMultiElements.OriginDestinationDetails;
import com.amadeus.xml.pnradd_14_1_1a.PNRAddMultiElements.TravellerInfo;
import com.amadeus.xml.pnrret_14_1_1a.PNRRetrieve;
import com.amadeus.xml.pnrret_14_1_1a.PNRRetrieve.RetrievalFacts;
import com.amadeus.xml.pnrret_14_1_1a.PNRRetrieve.Settings;
import com.amadeus.xml.pnrspl_14_1_1a.SplitPNRType;
import com.amadeus.xml.pnrxcl_14_1_1a.CancelPNRElementType;
import com.amadeus.xml.pnrxcl_14_1_1a.ReservationControlInformationType;
import com.amadeus.xml.smpreq_13_1_ia.AdditionalBusinessSourceInformationTypeI;
import com.amadeus.xml.smpreq_13_1_ia.AirRetrieveSeatMap.Traveler;
import com.amadeus.xml.smpreq_13_1_ia.ConversionRateTypeI;
import com.amadeus.xml.smpreq_13_1_ia.EquipmentInfoTypeI;
import com.amadeus.xml.smpreq_13_1_ia.FrequentTravellerInformationTypeI;
import com.amadeus.xml.smpreq_13_1_ia.RelatedProductInformationTypeI;
import com.amadeus.xml.smpreq_13_1_ia.ReservationControlInformationTypeI;
import com.amadeus.xml.smpreq_13_1_ia.SeatRequestParametersTypeI;
import com.amadeus.xml.smpreq_13_1_ia.TravelProductInformationTypeI;
import com.amadeus.xml.smpres_13_1_ia.AirRetrieveSeatMapReply.SeatmapInformation;
import com.amadeus.xml.smpres_13_1_ia.ErrorInformationTypeI;
import com.amadeus.xml.smpres_13_1_ia.ResponseAnalysisDetailsTypeI;
import com.amadeus.xml.smpres_13_1_ia.WarningInformationTypeI;
import com.amadeus.xml.tautcq_04_1_1a.TicketCreateTSTFromPricing.PsaList;
import com.amadeus.xml.tautcr_04_1_1a.TicketCreateTSTFromPricingReply.ApplicationError;
import com.amadeus.xml.tautcr_04_1_1a.TicketCreateTSTFromPricingReply.TstList;
import com.amadeus.xml.tipnrq_12_4_1a.CorporateFareInformationType;
import com.amadeus.xml.tipnrq_12_4_1a.FareInformativePricingWithoutPNR.ObFeeRequestGroup;
import com.amadeus.xml.tipnrq_12_4_1a.FareInformativePricingWithoutPNR.OriginatorGroup;
import com.amadeus.xml.tipnrq_12_4_1a.FareInformativePricingWithoutPNR.PassengersGroup;
import com.amadeus.xml.tipnrq_12_4_1a.FareInformativePricingWithoutPNR.PricingOptionsGroup;
import com.amadeus.xml.tipnrq_12_4_1a.FareInformativePricingWithoutPNR.TaxExemptGroup;
import com.amadeus.xml.tipnrq_12_4_1a.FareInformativePricingWithoutPNR.TripsGroup;
import com.amadeus.xml.tipnrq_12_4_1a.FormOfPaymentTypeI;
import com.amadeus.xml.tipnrq_12_4_1a.MonetaryInformationType;
import com.amadeus.xml.tipnrr_12_4_1a.FareInformativePricingWithoutPNRReply.MainGroup;
import com.amadeus.xml.tnlres_00_1_1a.PNRList;
import com.amadeus.xml.tpcbrq_12_4_1a.CommercialAgreementsTypeI;
import com.amadeus.xml.tpcbrq_12_4_1a.DutyTaxFeeDetailsTypeU;
import com.amadeus.xml.tpcbrq_12_4_1a.FarePricePNRWithBookingClass.BookingClassSelection;
import com.amadeus.xml.tpcbrq_12_4_1a.FarePricePNRWithBookingClass.DiscountInformation;
import com.amadeus.xml.tpcbrq_12_4_1a.FarePricePNRWithBookingClass.FlightInformation;
import com.amadeus.xml.tpcbrq_12_4_1a.FarePricePNRWithBookingClass.FopInformation;
import com.amadeus.xml.tpcbrq_12_4_1a.FarePricePNRWithBookingClass.FrequentFlyerInformation;
import com.amadeus.xml.tpcbrq_12_4_1a.FarePricePNRWithBookingClass.OpenSegmentsInformation;
import com.amadeus.xml.tpcbrq_12_4_1a.FarePricePNRWithBookingClass.PricingFareBase;
import com.amadeus.xml.tpcbrq_12_4_1a.PointOfSaleInformationTypeU;
import com.amadeus.xml.tpcbrq_12_4_1a.ReferenceInformationTypeI94605S;
import com.amadeus.xml.tpcbrq_12_4_1a.TransportIdentifierType;
import com.amadeus.xml.tpcbrr_12_4_1a.FarePricePNRWithBookingClassReply.FareList;
import com.amadeus.xml.ttktiq_09_1_1a.CodedAttributeType;
import com.amadeus.xml.ttktiq_09_1_1a.DocIssuanceIssueTicket.OptionGroup;
import com.amadeus.xml.ttktiq_09_1_1a.ReferenceInfoType;
import com.amadeus.xml.ttktiq_09_1_1a.ReferenceInformationType;
import com.amadeus.xml.ttktiq_09_1_1a.StockInformationType;
import com.amadeus.xml.ttktiq_09_1_1a.StructuredDateTimeInformationType;
import com.amadeus.xml.ttktiq_09_1_1a.TicketAgentInfoTypeI;
import com.amadeus.xml.ttktiq_09_1_1a.TravellerInformationType;
import com.amadeus.xml.ttktir_09_1_1a.ErrorGroupType;
import com.amadeus.xml.ttktir_09_1_1a.ResponseAnalysisDetailsType;
import com.amadeus.xml.vlssoq_04_1_1a.ConversationIDType;
import com.amadeus.xml.vlssor_04_1_1a.SecuritySignOutReply.ErrorSection;

/**
 * This class was generated by Apache CXF 3.0.0-milestone1
 * 2016-01-13T00:10:04.282+05:30
 * Generated source version: 3.0.0-milestone1
 * 
 */

@javax.jws.WebService(
                      serviceName = "AmadeusWebServices",
                      portName = "AmadeusWebServicesPort",
                      targetNamespace = "http://xml.amadeus.com",
                      wsdlLocation = "file:/C:/Eclipse Luna/Api/resources/1ASIWFBKRDD_PDT_20151102_083721.wsdl",
                      endpointInterface = "com.amadeus.xml..AmadeusWebServicesPT")
                      
public class AmadeusWebServicesPTImpl implements AmadeusWebServicesPT {

    private static final Logger LOG = Logger.getLogger(AmadeusWebServicesPTImpl.class.getName());

    /* (non-Javadoc)
     * @see com.amadeus.xml..AmadeusWebServicesPT#fareCheckRules(com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.MsgType  msgType ,)com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.AvailcabinStatus  availcabinStatus ,)com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.ConversionRate  conversionRate ,)com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.PricingTickInfo  pricingTickInfo ,)com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.MultiCorporate  multiCorporate ,)com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.ItemNumber  itemNumber ,)com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.DateOfFlight  dateOfFlight ,)java.util.List<com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.FlightQualification>  flightQualification ,)java.util.List<com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.TransportInformation>  transportInformation ,)java.util.List<com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.TripDescription>  tripDescription ,)java.util.List<com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.PricingInfo>  pricingInfo ,)com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.FareRule  fareRule ,)com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TransactionType  transactionType ,)com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.StatusInfo  statusInfo ,)com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FareRouteInfo  fareRouteInfo ,)java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.InfoText>  infoText ,)com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo  errorInfo ,)java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo>  tariffInfo ,)java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails>  flightDetails )*
     */
    public void fareCheckRules(com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.MsgType msgType,com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.AvailcabinStatus availcabinStatus,com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.ConversionRate conversionRate,com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.PricingTickInfo pricingTickInfo,com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.MultiCorporate multiCorporate,com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.ItemNumber itemNumber,com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.DateOfFlight dateOfFlight,java.util.List<com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.FlightQualification> flightQualification,java.util.List<com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.TransportInformation> transportInformation,java.util.List<com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.TripDescription> tripDescription,java.util.List<com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.PricingInfo> pricingInfo,com.amadeus.xml.farqnq_07_1_1a.FareCheckRules.FareRule fareRule,javax.xml.ws.Holder<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TransactionType> transactionType,javax.xml.ws.Holder<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.StatusInfo> statusInfo,javax.xml.ws.Holder<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FareRouteInfo> fareRouteInfo,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.InfoText>> infoText,javax.xml.ws.Holder<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo> errorInfo,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo>> tariffInfo,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails>> flightDetails) { 
        LOG.info("Executing operation fareCheckRules");
        System.out.println(msgType);
        System.out.println(availcabinStatus);
        System.out.println(conversionRate);
        System.out.println(pricingTickInfo);
        System.out.println(multiCorporate);
        System.out.println(itemNumber);
        System.out.println(dateOfFlight);
        System.out.println(flightQualification);
        System.out.println(transportInformation);
        System.out.println(tripDescription);
        System.out.println(pricingInfo);
        System.out.println(fareRule);
        try {
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TransactionType transactionTypeValue = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TransactionType();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TransactionType.MessageFunctionDetails transactionTypeValueMessageFunctionDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TransactionType.MessageFunctionDetails();
            transactionTypeValueMessageFunctionDetails.setMessageFunction("MessageFunction-2106931350");
            transactionTypeValue.setMessageFunctionDetails(transactionTypeValueMessageFunctionDetails);
            transactionType.value = transactionTypeValue;
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.StatusInfo statusInfoValue = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.StatusInfo();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.StatusInfo.StatusDetails statusInfoValueStatusDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.StatusInfo.StatusDetails();
            statusInfoValueStatusDetails.setIndicator("Indicator197302679");
            statusInfoValue.setStatusDetails(statusInfoValueStatusDetails);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.StatusInfo.OtherDetails> statusInfoValueOtherDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.StatusInfo.OtherDetails>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.StatusInfo.OtherDetails statusInfoValueOtherDetailsVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.StatusInfo.OtherDetails();
            statusInfoValueOtherDetailsVal1.setIndicator("Indicator1518915850");
            statusInfoValueOtherDetails.add(statusInfoValueOtherDetailsVal1);
            statusInfoValue.getOtherDetails().addAll(statusInfoValueOtherDetails);
            statusInfo.value = statusInfoValue;
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FareRouteInfo fareRouteInfoValue = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FareRouteInfo();
            fareRouteInfoValue.setDayOfWeek("DayOfWeek-976306647");
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FareRouteInfo.FareQualifierDetails fareRouteInfoValueFareQualifierDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FareRouteInfo.FareQualifierDetails();
            java.util.List<java.lang.String> fareRouteInfoValueFareQualifierDetailsFareQualifier = new java.util.ArrayList<java.lang.String>();
            java.lang.String fareRouteInfoValueFareQualifierDetailsFareQualifierVal1 = "fareRouteInfoValueFareQualifierDetailsFareQualifierVal2067259997";
            fareRouteInfoValueFareQualifierDetailsFareQualifier.add(fareRouteInfoValueFareQualifierDetailsFareQualifierVal1);
            fareRouteInfoValueFareQualifierDetails.getFareQualifier().addAll(fareRouteInfoValueFareQualifierDetailsFareQualifier);
            fareRouteInfoValue.setFareQualifierDetails(fareRouteInfoValueFareQualifierDetails);
            fareRouteInfoValue.setIdentificationNumber("IdentificationNumber-868881945");
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FareRouteInfo.ValidityPeriod fareRouteInfoValueValidityPeriod = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FareRouteInfo.ValidityPeriod();
            fareRouteInfoValueValidityPeriod.setFirstDate(new java.math.BigDecimal("3533426425611117518.5209910613752808028"));
            fareRouteInfoValueValidityPeriod.setSecondDate(new java.math.BigDecimal("8042117382500984467.2252263646089549371"));
            fareRouteInfoValue.setValidityPeriod(fareRouteInfoValueValidityPeriod);
            fareRouteInfo.value = fareRouteInfoValue;
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.InfoText> infoTextValue = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.InfoText>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.InfoText infoTextValueVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.InfoText();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.InfoText.FreeTextQualification infoTextValueVal1FreeTextQualification = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.InfoText.FreeTextQualification();
            infoTextValueVal1FreeTextQualification.setTextSubjectQualifier("TextSubjectQualifier1242533339");
            infoTextValueVal1FreeTextQualification.setInformationType("InformationType557303073");
            infoTextValueVal1.setFreeTextQualification(infoTextValueVal1FreeTextQualification);
            java.util.List<java.lang.String> infoTextValueVal1FreeText = new java.util.ArrayList<java.lang.String>();
            java.lang.String infoTextValueVal1FreeTextVal1 = "infoTextValueVal1FreeTextVal-262799659";
            infoTextValueVal1FreeText.add(infoTextValueVal1FreeTextVal1);
            infoTextValueVal1.getFreeText().addAll(infoTextValueVal1FreeText);
            infoTextValue.add(infoTextValueVal1);
            infoText.value = infoTextValue;
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo errorInfoValue = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo.RejectErrorCode errorInfoValueRejectErrorCode = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo.RejectErrorCode();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo.RejectErrorCode.ErrorDetails errorInfoValueRejectErrorCodeErrorDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo.RejectErrorCode.ErrorDetails();
            errorInfoValueRejectErrorCodeErrorDetails.setErrorCode("ErrorCode1861749022");
            errorInfoValueRejectErrorCode.setErrorDetails(errorInfoValueRejectErrorCodeErrorDetails);
            errorInfoValue.setRejectErrorCode(errorInfoValueRejectErrorCode);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo.ErrorFreeText errorInfoValueErrorFreeText = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo.ErrorFreeText();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo.ErrorFreeText.FreeTextQualification errorInfoValueErrorFreeTextFreeTextQualification = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.ErrorInfo.ErrorFreeText.FreeTextQualification();
            errorInfoValueErrorFreeTextFreeTextQualification.setTextSubjectQualifier("TextSubjectQualifier-36166840");
            errorInfoValueErrorFreeTextFreeTextQualification.setInformationType("InformationType-605643982");
            errorInfoValueErrorFreeText.setFreeTextQualification(errorInfoValueErrorFreeTextFreeTextQualification);
            java.util.List<java.lang.String> errorInfoValueErrorFreeTextFreeText = new java.util.ArrayList<java.lang.String>();
            java.lang.String errorInfoValueErrorFreeTextFreeTextVal1 = "errorInfoValueErrorFreeTextFreeTextVal-309122352";
            errorInfoValueErrorFreeTextFreeText.add(errorInfoValueErrorFreeTextFreeTextVal1);
            errorInfoValueErrorFreeText.getFreeText().addAll(errorInfoValueErrorFreeTextFreeText);
            errorInfoValue.setErrorFreeText(errorInfoValueErrorFreeText);
            errorInfo.value = errorInfoValue;
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo> tariffInfoValue = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo tariffInfoValueVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo.FareRuleInfo tariffInfoValueVal1FareRuleInfo = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo.FareRuleInfo();
            tariffInfoValueVal1FareRuleInfo.setRuleSectionLocalId("RuleSectionLocalId-1861306377");
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo.FareRuleInfo.CompanyDetails tariffInfoValueVal1FareRuleInfoCompanyDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo.FareRuleInfo.CompanyDetails();
            tariffInfoValueVal1FareRuleInfoCompanyDetails.setMarketingCompany("MarketingCompany1736624659");
            tariffInfoValueVal1FareRuleInfoCompanyDetails.setOperatingcompany("Operatingcompany299482162");
            tariffInfoValueVal1FareRuleInfoCompanyDetails.setOtherCompany("OtherCompany-1375382534");
            tariffInfoValueVal1FareRuleInfo.setCompanyDetails(tariffInfoValueVal1FareRuleInfoCompanyDetails);
            tariffInfoValueVal1FareRuleInfo.setRuleCategoryCode("RuleCategoryCode-281850284");
            tariffInfoValueVal1.setFareRuleInfo(tariffInfoValueVal1FareRuleInfo);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo.FareRuleText> tariffInfoValueVal1FareRuleText = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo.FareRuleText>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo.FareRuleText tariffInfoValueVal1FareRuleTextVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo.FareRuleText();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo.FareRuleText.FreeTextQualification tariffInfoValueVal1FareRuleTextVal1FreeTextQualification = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.TariffInfo.FareRuleText.FreeTextQualification();
            tariffInfoValueVal1FareRuleTextVal1FreeTextQualification.setTextSubjectQualifier("TextSubjectQualifier-896397594");
            tariffInfoValueVal1FareRuleTextVal1FreeTextQualification.setInformationType("InformationType2100925475");
            tariffInfoValueVal1FareRuleTextVal1.setFreeTextQualification(tariffInfoValueVal1FareRuleTextVal1FreeTextQualification);
            java.util.List<java.lang.String> tariffInfoValueVal1FareRuleTextVal1FreeText = new java.util.ArrayList<java.lang.String>();
            tariffInfoValueVal1FareRuleTextVal1.getFreeText().addAll(tariffInfoValueVal1FareRuleTextVal1FreeText);
            tariffInfoValueVal1FareRuleText.add(tariffInfoValueVal1FareRuleTextVal1);
            tariffInfoValueVal1.getFareRuleText().addAll(tariffInfoValueVal1FareRuleText);
            tariffInfoValue.add(tariffInfoValueVal1);
            tariffInfo.value = tariffInfoValue;
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails> flightDetailsValue = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails flightDetailsValueVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.NbOfSegments flightDetailsValueVal1NbOfSegments = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.NbOfSegments();
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.NbOfSegments.SegmentControlDetails> flightDetailsValueVal1NbOfSegmentsSegmentControlDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.NbOfSegments.SegmentControlDetails>();
            flightDetailsValueVal1NbOfSegments.getSegmentControlDetails().addAll(flightDetailsValueVal1NbOfSegmentsSegmentControlDetails);
            flightDetailsValueVal1.setNbOfSegments(flightDetailsValueVal1NbOfSegments);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.AmountConversion flightDetailsValueVal1AmountConversion = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.AmountConversion();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.AmountConversion.ConversionRateDetails flightDetailsValueVal1AmountConversionConversionRateDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.AmountConversion.ConversionRateDetails();
            flightDetailsValueVal1AmountConversionConversionRateDetails.setConversionType("ConversionType1868716536");
            flightDetailsValueVal1AmountConversionConversionRateDetails.setCurrency("Currency-851989532");
            flightDetailsValueVal1AmountConversionConversionRateDetails.setRateType("RateType-1246582360");
            flightDetailsValueVal1AmountConversionConversionRateDetails.setPricingAmount(new java.math.BigDecimal("4042317939827025982.5433626180925795822"));
            flightDetailsValueVal1AmountConversionConversionRateDetails.setMeasurementValue(new java.math.BigDecimal("5018598662111075744.6482072733484043952"));
            flightDetailsValueVal1AmountConversionConversionRateDetails.setMeasurementSignificance("MeasurementSignificance430374957");
            flightDetailsValueVal1AmountConversion.setConversionRateDetails(flightDetailsValueVal1AmountConversionConversionRateDetails);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.AmountConversion.OtherConversionRateDetails> flightDetailsValueVal1AmountConversionOtherConversionRateDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.AmountConversion.OtherConversionRateDetails>();
            flightDetailsValueVal1AmountConversion.getOtherConversionRateDetails().addAll(flightDetailsValueVal1AmountConversionOtherConversionRateDetails);
            flightDetailsValueVal1.setAmountConversion(flightDetailsValueVal1AmountConversion);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QuantityValue flightDetailsValueVal1QuantityValue = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QuantityValue();
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QuantityValue.QuantityDetails> flightDetailsValueVal1QuantityValueQuantityDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QuantityValue.QuantityDetails>();
            flightDetailsValueVal1QuantityValue.getQuantityDetails().addAll(flightDetailsValueVal1QuantityValueQuantityDetails);
            flightDetailsValueVal1.setQuantityValue(flightDetailsValueVal1QuantityValue);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PricingAndDateInfo flightDetailsValueVal1PricingAndDateInfo = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PricingAndDateInfo();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PricingAndDateInfo.ProductDateTimeDetails flightDetailsValueVal1PricingAndDateInfoProductDateTimeDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PricingAndDateInfo.ProductDateTimeDetails();
            flightDetailsValueVal1PricingAndDateInfoProductDateTimeDetails.setDepartureDate("DepartureDate1409669416");
            flightDetailsValueVal1PricingAndDateInfoProductDateTimeDetails.setArrivalDate("ArrivalDate81044812");
            flightDetailsValueVal1PricingAndDateInfo.setProductDateTimeDetails(flightDetailsValueVal1PricingAndDateInfoProductDateTimeDetails);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PricingAndDateInfo.LocationDetails flightDetailsValueVal1PricingAndDateInfoLocationDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PricingAndDateInfo.LocationDetails();
            flightDetailsValueVal1PricingAndDateInfoLocationDetails.setCity("City-1584453313");
            flightDetailsValueVal1PricingAndDateInfoLocationDetails.setCountry("Country-1215036196");
            flightDetailsValueVal1PricingAndDateInfo.setLocationDetails(flightDetailsValueVal1PricingAndDateInfoLocationDetails);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PricingAndDateInfo.OtherLocationDetails flightDetailsValueVal1PricingAndDateInfoOtherLocationDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PricingAndDateInfo.OtherLocationDetails();
            flightDetailsValueVal1PricingAndDateInfoOtherLocationDetails.setCity("City1781465129");
            flightDetailsValueVal1PricingAndDateInfoOtherLocationDetails.setCountry("Country-56349175");
            flightDetailsValueVal1PricingAndDateInfo.setOtherLocationDetails(flightDetailsValueVal1PricingAndDateInfoOtherLocationDetails);
            flightDetailsValueVal1PricingAndDateInfo.setIdNumber("IdNumber1567640438");
            flightDetailsValueVal1.setPricingAndDateInfo(flightDetailsValueVal1PricingAndDateInfo);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QualificationFareDetails> flightDetailsValueVal1QualificationFareDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QualificationFareDetails>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QualificationFareDetails flightDetailsValueVal1QualificationFareDetailsVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QualificationFareDetails();
            flightDetailsValueVal1QualificationFareDetailsVal1.setMovementType("MovementType-618432001");
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QualificationFareDetails.FareCategories flightDetailsValueVal1QualificationFareDetailsVal1FareCategories = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QualificationFareDetails.FareCategories();
            java.util.List<java.lang.String> flightDetailsValueVal1QualificationFareDetailsVal1FareCategoriesFareType = new java.util.ArrayList<java.lang.String>();
            flightDetailsValueVal1QualificationFareDetailsVal1FareCategories.getFareType().addAll(flightDetailsValueVal1QualificationFareDetailsVal1FareCategoriesFareType);
            flightDetailsValueVal1QualificationFareDetailsVal1.setFareCategories(flightDetailsValueVal1QualificationFareDetailsVal1FareCategories);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QualificationFareDetails.FareDetails flightDetailsValueVal1QualificationFareDetailsVal1FareDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QualificationFareDetails.FareDetails();
            flightDetailsValueVal1QualificationFareDetailsVal1FareDetails.setQualifier("Qualifier-1126510188");
            flightDetailsValueVal1QualificationFareDetailsVal1FareDetails.setRate(new java.math.BigDecimal("-4224599855514031824.3266420148643863177"));
            flightDetailsValueVal1QualificationFareDetailsVal1FareDetails.setCountry("Country19016679");
            flightDetailsValueVal1QualificationFareDetailsVal1FareDetails.setFareCategory("FareCategory-437127943");
            flightDetailsValueVal1QualificationFareDetailsVal1.setFareDetails(flightDetailsValueVal1QualificationFareDetailsVal1FareDetails);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QualificationFareDetails.AdditionalFareDetails flightDetailsValueVal1QualificationFareDetailsVal1AdditionalFareDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QualificationFareDetails.AdditionalFareDetails();
            flightDetailsValueVal1QualificationFareDetailsVal1AdditionalFareDetails.setRateClass("RateClass1956287585");
            flightDetailsValueVal1QualificationFareDetailsVal1AdditionalFareDetails.setCommodityCategory("CommodityCategory-1675796431");
            java.util.List<java.lang.String> flightDetailsValueVal1QualificationFareDetailsVal1AdditionalFareDetailsFareClass = new java.util.ArrayList<java.lang.String>();
            flightDetailsValueVal1QualificationFareDetailsVal1AdditionalFareDetails.getFareClass().addAll(flightDetailsValueVal1QualificationFareDetailsVal1AdditionalFareDetailsFareClass);
            flightDetailsValueVal1QualificationFareDetailsVal1.setAdditionalFareDetails(flightDetailsValueVal1QualificationFareDetailsVal1AdditionalFareDetails);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QualificationFareDetails.DiscountDetails> flightDetailsValueVal1QualificationFareDetailsVal1DiscountDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.QualificationFareDetails.DiscountDetails>();
            flightDetailsValueVal1QualificationFareDetailsVal1.getDiscountDetails().addAll(flightDetailsValueVal1QualificationFareDetailsVal1DiscountDetails);
            flightDetailsValueVal1QualificationFareDetails.add(flightDetailsValueVal1QualificationFareDetailsVal1);
            flightDetailsValueVal1.getQualificationFareDetails().addAll(flightDetailsValueVal1QualificationFareDetails);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TransportService> flightDetailsValueVal1TransportService = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TransportService>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TransportService flightDetailsValueVal1TransportServiceVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TransportService();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TransportService.CompanyIdentification flightDetailsValueVal1TransportServiceVal1CompanyIdentification = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TransportService.CompanyIdentification();
            flightDetailsValueVal1TransportServiceVal1CompanyIdentification.setMarketingCompany("MarketingCompany-272328883");
            flightDetailsValueVal1TransportServiceVal1CompanyIdentification.setOperatingcompany("Operatingcompany-1139404793");
            flightDetailsValueVal1TransportServiceVal1CompanyIdentification.setOtherCompany("OtherCompany2070668913");
            flightDetailsValueVal1TransportServiceVal1.setCompanyIdentification(flightDetailsValueVal1TransportServiceVal1CompanyIdentification);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TransportService.ProductIdentificationDetails> flightDetailsValueVal1TransportServiceVal1ProductIdentificationDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TransportService.ProductIdentificationDetails>();
            flightDetailsValueVal1TransportServiceVal1.getProductIdentificationDetails().addAll(flightDetailsValueVal1TransportServiceVal1ProductIdentificationDetails);
            flightDetailsValueVal1TransportService.add(flightDetailsValueVal1TransportServiceVal1);
            flightDetailsValueVal1.getTransportService().addAll(flightDetailsValueVal1TransportService);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FlightErrorCode> flightDetailsValueVal1FlightErrorCode = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FlightErrorCode>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FlightErrorCode flightDetailsValueVal1FlightErrorCodeVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FlightErrorCode();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FlightErrorCode.FreeTextQualification flightDetailsValueVal1FlightErrorCodeVal1FreeTextQualification = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FlightErrorCode.FreeTextQualification();
            flightDetailsValueVal1FlightErrorCodeVal1FreeTextQualification.setTextSubjectQualifier("TextSubjectQualifier2056278730");
            flightDetailsValueVal1FlightErrorCodeVal1FreeTextQualification.setInformationType("InformationType70911043");
            flightDetailsValueVal1FlightErrorCodeVal1.setFreeTextQualification(flightDetailsValueVal1FlightErrorCodeVal1FreeTextQualification);
            java.util.List<java.lang.String> flightDetailsValueVal1FlightErrorCodeVal1FreeText = new java.util.ArrayList<java.lang.String>();
            flightDetailsValueVal1FlightErrorCodeVal1.getFreeText().addAll(flightDetailsValueVal1FlightErrorCodeVal1FreeText);
            flightDetailsValueVal1FlightErrorCode.add(flightDetailsValueVal1FlightErrorCodeVal1);
            flightDetailsValueVal1.getFlightErrorCode().addAll(flightDetailsValueVal1FlightErrorCode);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ProductInfo> flightDetailsValueVal1ProductInfo = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ProductInfo>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ProductInfo flightDetailsValueVal1ProductInfoVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ProductInfo();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ProductInfo.ProductDetails flightDetailsValueVal1ProductInfoVal1ProductDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ProductInfo.ProductDetails();
            flightDetailsValueVal1ProductInfoVal1ProductDetails.setProductDetailsQualifier("ProductDetailsQualifier2028242283");
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ProductInfo.ProductDetails.BookingClassDetails> flightDetailsValueVal1ProductInfoVal1ProductDetailsBookingClassDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ProductInfo.ProductDetails.BookingClassDetails>();
            flightDetailsValueVal1ProductInfoVal1ProductDetails.getBookingClassDetails().addAll(flightDetailsValueVal1ProductInfoVal1ProductDetailsBookingClassDetails);
            flightDetailsValueVal1ProductInfoVal1.setProductDetails(flightDetailsValueVal1ProductInfoVal1ProductDetails);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ProductInfo.ProductErrorCode> flightDetailsValueVal1ProductInfoVal1ProductErrorCode = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ProductInfo.ProductErrorCode>();
            flightDetailsValueVal1ProductInfoVal1.getProductErrorCode().addAll(flightDetailsValueVal1ProductInfoVal1ProductErrorCode);
            flightDetailsValueVal1ProductInfo.add(flightDetailsValueVal1ProductInfoVal1);
            flightDetailsValueVal1.getProductInfo().addAll(flightDetailsValueVal1ProductInfo);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo> flightDetailsValueVal1PriceInfo = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo flightDetailsValueVal1PriceInfoVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo.MonetaryRates flightDetailsValueVal1PriceInfoVal1MonetaryRates = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo.MonetaryRates();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo.MonetaryRates.MonetaryDetails flightDetailsValueVal1PriceInfoVal1MonetaryRatesMonetaryDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo.MonetaryRates.MonetaryDetails();
            flightDetailsValueVal1PriceInfoVal1MonetaryRatesMonetaryDetails.setTypeQualifier("TypeQualifier-1070361953");
            flightDetailsValueVal1PriceInfoVal1MonetaryRatesMonetaryDetails.setAmount("Amount-2034049533");
            flightDetailsValueVal1PriceInfoVal1MonetaryRatesMonetaryDetails.setCurrency("Currency-1299417843");
            flightDetailsValueVal1PriceInfoVal1MonetaryRates.setMonetaryDetails(flightDetailsValueVal1PriceInfoVal1MonetaryRatesMonetaryDetails);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo.MonetaryRates.AmountTwo> flightDetailsValueVal1PriceInfoVal1MonetaryRatesAmountTwo = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo.MonetaryRates.AmountTwo>();
            flightDetailsValueVal1PriceInfoVal1MonetaryRates.getAmountTwo().addAll(flightDetailsValueVal1PriceInfoVal1MonetaryRatesAmountTwo);
            flightDetailsValueVal1PriceInfoVal1.setMonetaryRates(flightDetailsValueVal1PriceInfoVal1MonetaryRates);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo.TaxAmount flightDetailsValueVal1PriceInfoVal1TaxAmount = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo.TaxAmount();
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo.TaxAmount.TaxDetails> flightDetailsValueVal1PriceInfoVal1TaxAmountTaxDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo.TaxAmount.TaxDetails>();
            flightDetailsValueVal1PriceInfoVal1TaxAmount.getTaxDetails().addAll(flightDetailsValueVal1PriceInfoVal1TaxAmountTaxDetails);
            flightDetailsValueVal1PriceInfoVal1.setTaxAmount(flightDetailsValueVal1PriceInfoVal1TaxAmount);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo.FareTypeInfo> flightDetailsValueVal1PriceInfoVal1FareTypeInfo = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.PriceInfo.FareTypeInfo>();
            flightDetailsValueVal1PriceInfoVal1.getFareTypeInfo().addAll(flightDetailsValueVal1PriceInfoVal1FareTypeInfo);
            flightDetailsValueVal1PriceInfo.add(flightDetailsValueVal1PriceInfoVal1);
            flightDetailsValueVal1.getPriceInfo().addAll(flightDetailsValueVal1PriceInfo);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo> flightDetailsValueVal1FareDetailInfo = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo flightDetailsValueVal1FareDetailInfoVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.NbOfUnits flightDetailsValueVal1FareDetailInfoVal1NbOfUnits = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.NbOfUnits();
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.NbOfUnits.QuantityDetails> flightDetailsValueVal1FareDetailInfoVal1NbOfUnitsQuantityDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.NbOfUnits.QuantityDetails>();
            flightDetailsValueVal1FareDetailInfoVal1NbOfUnits.getQuantityDetails().addAll(flightDetailsValueVal1FareDetailInfoVal1NbOfUnitsQuantityDetails);
            flightDetailsValueVal1FareDetailInfoVal1.setNbOfUnits(flightDetailsValueVal1FareDetailInfoVal1NbOfUnits);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.PricingPlusDateInfo flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfo = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.PricingPlusDateInfo();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.PricingPlusDateInfo.ProductDateTimeDetails flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfoProductDateTimeDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.PricingPlusDateInfo.ProductDateTimeDetails();
            flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfoProductDateTimeDetails.setDepartureDate("DepartureDate268878979");
            flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfoProductDateTimeDetails.setArrivalDate("ArrivalDate-222513462");
            flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfo.setProductDateTimeDetails(flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfoProductDateTimeDetails);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.PricingPlusDateInfo.LocationDetails flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfoLocationDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.PricingPlusDateInfo.LocationDetails();
            flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfoLocationDetails.setCity("City-1326912887");
            flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfoLocationDetails.setCountry("Country-1389673223");
            flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfo.setLocationDetails(flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfoLocationDetails);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.PricingPlusDateInfo.OtherLocationDetails flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfoOtherLocationDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.PricingPlusDateInfo.OtherLocationDetails();
            flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfoOtherLocationDetails.setCity("City-1889169742");
            flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfoOtherLocationDetails.setCountry("Country2146846638");
            flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfo.setOtherLocationDetails(flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfoOtherLocationDetails);
            flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfo.setIdNumber("IdNumber815473889");
            flightDetailsValueVal1FareDetailInfoVal1.setPricingPlusDateInfo(flightDetailsValueVal1FareDetailInfoVal1PricingPlusDateInfo);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.FareDeatilInfo flightDetailsValueVal1FareDetailInfoVal1FareDeatilInfo = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.FareDeatilInfo();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.FareDeatilInfo.FareTypeGrouping flightDetailsValueVal1FareDetailInfoVal1FareDeatilInfoFareTypeGrouping = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareDetailInfo.FareDeatilInfo.FareTypeGrouping();
            java.util.List<java.lang.String> flightDetailsValueVal1FareDetailInfoVal1FareDeatilInfoFareTypeGroupingPricingGroup = new java.util.ArrayList<java.lang.String>();
            flightDetailsValueVal1FareDetailInfoVal1FareDeatilInfoFareTypeGrouping.getPricingGroup().addAll(flightDetailsValueVal1FareDetailInfoVal1FareDeatilInfoFareTypeGroupingPricingGroup);
            flightDetailsValueVal1FareDetailInfoVal1FareDeatilInfo.setFareTypeGrouping(flightDetailsValueVal1FareDetailInfoVal1FareDeatilInfoFareTypeGrouping);
            flightDetailsValueVal1FareDetailInfoVal1.setFareDeatilInfo(flightDetailsValueVal1FareDetailInfoVal1FareDeatilInfo);
            flightDetailsValueVal1FareDetailInfo.add(flightDetailsValueVal1FareDetailInfoVal1);
            flightDetailsValueVal1.getFareDetailInfo().addAll(flightDetailsValueVal1FareDetailInfo);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp> flightDetailsValueVal1OdiGrp = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp flightDetailsValueVal1OdiGrpVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.OriginDestination flightDetailsValueVal1OdiGrpVal1OriginDestination = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.OriginDestination();
            flightDetailsValueVal1OdiGrpVal1OriginDestination.setOrigin("Origin1249233056");
            flightDetailsValueVal1OdiGrpVal1OriginDestination.setDestination("Destination-1646506925");
            flightDetailsValueVal1OdiGrpVal1.setOriginDestination(flightDetailsValueVal1OdiGrpVal1OriginDestination);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.FlightDateAndTime> flightDetailsValueVal1OdiGrpVal1FlightDateAndTime = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.FlightDateAndTime>();
            flightDetailsValueVal1OdiGrpVal1.getFlightDateAndTime().addAll(flightDetailsValueVal1OdiGrpVal1FlightDateAndTime);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.FlightErrorText flightDetailsValueVal1OdiGrpVal1FlightErrorText = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.FlightErrorText();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.FlightErrorText.FreeTextQualification flightDetailsValueVal1OdiGrpVal1FlightErrorTextFreeTextQualification = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.FlightErrorText.FreeTextQualification();
            flightDetailsValueVal1OdiGrpVal1FlightErrorTextFreeTextQualification.setTextSubjectQualifier("TextSubjectQualifier-1953401648");
            flightDetailsValueVal1OdiGrpVal1FlightErrorTextFreeTextQualification.setInformationType("InformationType-382313096");
            flightDetailsValueVal1OdiGrpVal1FlightErrorText.setFreeTextQualification(flightDetailsValueVal1OdiGrpVal1FlightErrorTextFreeTextQualification);
            java.util.List<java.lang.String> flightDetailsValueVal1OdiGrpVal1FlightErrorTextFreeText = new java.util.ArrayList<java.lang.String>();
            flightDetailsValueVal1OdiGrpVal1FlightErrorText.getFreeText().addAll(flightDetailsValueVal1OdiGrpVal1FlightErrorTextFreeText);
            flightDetailsValueVal1OdiGrpVal1.setFlightErrorText(flightDetailsValueVal1OdiGrpVal1FlightErrorText);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.MonGrp> flightDetailsValueVal1OdiGrpVal1MonGrp = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.MonGrp>();
            flightDetailsValueVal1OdiGrpVal1.getMonGrp().addAll(flightDetailsValueVal1OdiGrpVal1MonGrp);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.RoutingGrp> flightDetailsValueVal1OdiGrpVal1RoutingGrp = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.RoutingGrp>();
            flightDetailsValueVal1OdiGrpVal1.getRoutingGrp().addAll(flightDetailsValueVal1OdiGrpVal1RoutingGrp);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.TravelProductGrp> flightDetailsValueVal1OdiGrpVal1TravelProductGrp = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.OdiGrp.TravelProductGrp>();
            flightDetailsValueVal1OdiGrpVal1.getTravelProductGrp().addAll(flightDetailsValueVal1OdiGrpVal1TravelProductGrp);
            flightDetailsValueVal1OdiGrp.add(flightDetailsValueVal1OdiGrpVal1);
            flightDetailsValueVal1.getOdiGrp().addAll(flightDetailsValueVal1OdiGrp);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp> flightDetailsValueVal1TravellerGrp = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp flightDetailsValueVal1TravellerGrpVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp.TravellerIdentRef flightDetailsValueVal1TravellerGrpVal1TravellerIdentRef = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp.TravellerIdentRef();
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp.TravellerIdentRef.ReferenceDetails> flightDetailsValueVal1TravellerGrpVal1TravellerIdentRefReferenceDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp.TravellerIdentRef.ReferenceDetails>();
            flightDetailsValueVal1TravellerGrpVal1TravellerIdentRef.getReferenceDetails().addAll(flightDetailsValueVal1TravellerGrpVal1TravellerIdentRefReferenceDetails);
            flightDetailsValueVal1TravellerGrpVal1.setTravellerIdentRef(flightDetailsValueVal1TravellerGrpVal1TravellerIdentRef);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp.FareRulesDetails flightDetailsValueVal1TravellerGrpVal1FareRulesDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp.FareRulesDetails();
            flightDetailsValueVal1TravellerGrpVal1FareRulesDetails.setTariffClassId("TariffClassId-602329493");
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp.FareRulesDetails.CompanyDetails flightDetailsValueVal1TravellerGrpVal1FareRulesDetailsCompanyDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp.FareRulesDetails.CompanyDetails();
            flightDetailsValueVal1TravellerGrpVal1FareRulesDetailsCompanyDetails.setMarketingCompany("MarketingCompany2006465770");
            flightDetailsValueVal1TravellerGrpVal1FareRulesDetailsCompanyDetails.setOperatingcompany("Operatingcompany1908926113");
            flightDetailsValueVal1TravellerGrpVal1FareRulesDetailsCompanyDetails.setOtherCompany("OtherCompany1212700152");
            flightDetailsValueVal1TravellerGrpVal1FareRulesDetails.setCompanyDetails(flightDetailsValueVal1TravellerGrpVal1FareRulesDetailsCompanyDetails);
            java.util.List<java.lang.String> flightDetailsValueVal1TravellerGrpVal1FareRulesDetailsRuleSectionId = new java.util.ArrayList<java.lang.String>();
            flightDetailsValueVal1TravellerGrpVal1FareRulesDetails.getRuleSectionId().addAll(flightDetailsValueVal1TravellerGrpVal1FareRulesDetailsRuleSectionId);
            flightDetailsValueVal1TravellerGrpVal1.setFareRulesDetails(flightDetailsValueVal1TravellerGrpVal1FareRulesDetails);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp.FlightMovementDateInfo flightDetailsValueVal1TravellerGrpVal1FlightMovementDateInfo = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp.FlightMovementDateInfo();
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp.FlightMovementDateInfo.DateAndTimeDetails> flightDetailsValueVal1TravellerGrpVal1FlightMovementDateInfoDateAndTimeDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.TravellerGrp.FlightMovementDateInfo.DateAndTimeDetails>();
            flightDetailsValueVal1TravellerGrpVal1FlightMovementDateInfo.getDateAndTimeDetails().addAll(flightDetailsValueVal1TravellerGrpVal1FlightMovementDateInfoDateAndTimeDetails);
            flightDetailsValueVal1TravellerGrpVal1.setFlightMovementDateInfo(flightDetailsValueVal1TravellerGrpVal1FlightMovementDateInfo);
            flightDetailsValueVal1TravellerGrp.add(flightDetailsValueVal1TravellerGrpVal1);
            flightDetailsValueVal1.getTravellerGrp().addAll(flightDetailsValueVal1TravellerGrp);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareRouteGrp> flightDetailsValueVal1FareRouteGrp = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareRouteGrp>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareRouteGrp flightDetailsValueVal1FareRouteGrpVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareRouteGrp();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareRouteGrp.FareRouteInfo flightDetailsValueVal1FareRouteGrpVal1FareRouteInfo = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareRouteGrp.FareRouteInfo();
            flightDetailsValueVal1FareRouteGrpVal1FareRouteInfo.setDayOfWeek("DayOfWeek1162699609");
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareRouteGrp.FareRouteInfo.FareQualifierDetails flightDetailsValueVal1FareRouteGrpVal1FareRouteInfoFareQualifierDetails = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareRouteGrp.FareRouteInfo.FareQualifierDetails();
            java.util.List<java.lang.String> flightDetailsValueVal1FareRouteGrpVal1FareRouteInfoFareQualifierDetailsFareQualifier = new java.util.ArrayList<java.lang.String>();
            flightDetailsValueVal1FareRouteGrpVal1FareRouteInfoFareQualifierDetails.getFareQualifier().addAll(flightDetailsValueVal1FareRouteGrpVal1FareRouteInfoFareQualifierDetailsFareQualifier);
            flightDetailsValueVal1FareRouteGrpVal1FareRouteInfo.setFareQualifierDetails(flightDetailsValueVal1FareRouteGrpVal1FareRouteInfoFareQualifierDetails);
            flightDetailsValueVal1FareRouteGrpVal1FareRouteInfo.setIdentificationNumber("IdentificationNumber2017326748");
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareRouteGrp.FareRouteInfo.ValidityPeriod flightDetailsValueVal1FareRouteGrpVal1FareRouteInfoValidityPeriod = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareRouteGrp.FareRouteInfo.ValidityPeriod();
            flightDetailsValueVal1FareRouteGrpVal1FareRouteInfoValidityPeriod.setFirstDate(new java.math.BigDecimal("6973044322160316380.327355406409864992"));
            flightDetailsValueVal1FareRouteGrpVal1FareRouteInfoValidityPeriod.setSecondDate(new java.math.BigDecimal("-8430347948596334522.171279508149622391"));
            flightDetailsValueVal1FareRouteGrpVal1FareRouteInfo.setValidityPeriod(flightDetailsValueVal1FareRouteGrpVal1FareRouteInfoValidityPeriod);
            flightDetailsValueVal1FareRouteGrpVal1.setFareRouteInfo(flightDetailsValueVal1FareRouteGrpVal1FareRouteInfo);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareRouteGrp.JourneyGrp> flightDetailsValueVal1FareRouteGrpVal1JourneyGrp = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.FareRouteGrp.JourneyGrp>();
            flightDetailsValueVal1FareRouteGrpVal1.getJourneyGrp().addAll(flightDetailsValueVal1FareRouteGrpVal1JourneyGrp);
            flightDetailsValueVal1FareRouteGrp.add(flightDetailsValueVal1FareRouteGrpVal1);
            flightDetailsValueVal1.getFareRouteGrp().addAll(flightDetailsValueVal1FareRouteGrp);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp> flightDetailsValueVal1ItemGrp = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp>();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp flightDetailsValueVal1ItemGrpVal1 = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp();
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.ItemNb flightDetailsValueVal1ItemGrpVal1ItemNb = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.ItemNb();
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.ItemNb.ItemNumberDetails> flightDetailsValueVal1ItemGrpVal1ItemNbItemNumberDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.ItemNb.ItemNumberDetails>();
            flightDetailsValueVal1ItemGrpVal1ItemNb.getItemNumberDetails().addAll(flightDetailsValueVal1ItemGrpVal1ItemNbItemNumberDetails);
            flightDetailsValueVal1ItemGrpVal1.setItemNb(flightDetailsValueVal1ItemGrpVal1ItemNb);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.ProductAvailabilityStatus flightDetailsValueVal1ItemGrpVal1ProductAvailabilityStatus = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.ProductAvailabilityStatus();
            flightDetailsValueVal1ItemGrpVal1ProductAvailabilityStatus.setProductDetailsQualifier("ProductDetailsQualifier-2003842515");
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.ProductAvailabilityStatus.BookingClassDetails> flightDetailsValueVal1ItemGrpVal1ProductAvailabilityStatusBookingClassDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.ProductAvailabilityStatus.BookingClassDetails>();
            flightDetailsValueVal1ItemGrpVal1ProductAvailabilityStatus.getBookingClassDetails().addAll(flightDetailsValueVal1ItemGrpVal1ProductAvailabilityStatusBookingClassDetails);
            flightDetailsValueVal1ItemGrpVal1.setProductAvailabilityStatus(flightDetailsValueVal1ItemGrpVal1ProductAvailabilityStatus);
            com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.QuantityItem flightDetailsValueVal1ItemGrpVal1QuantityItem = new com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.QuantityItem();
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.QuantityItem.QuantityDetails> flightDetailsValueVal1ItemGrpVal1QuantityItemQuantityDetails = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.QuantityItem.QuantityDetails>();
            flightDetailsValueVal1ItemGrpVal1QuantityItem.getQuantityDetails().addAll(flightDetailsValueVal1ItemGrpVal1QuantityItemQuantityDetails);
            flightDetailsValueVal1ItemGrpVal1.setQuantityItem(flightDetailsValueVal1ItemGrpVal1QuantityItem);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.TransportServiceItem> flightDetailsValueVal1ItemGrpVal1TransportServiceItem = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.TransportServiceItem>();
            flightDetailsValueVal1ItemGrpVal1.getTransportServiceItem().addAll(flightDetailsValueVal1ItemGrpVal1TransportServiceItem);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.FreeTextItem> flightDetailsValueVal1ItemGrpVal1FreeTextItem = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.FreeTextItem>();
            flightDetailsValueVal1ItemGrpVal1.getFreeTextItem().addAll(flightDetailsValueVal1ItemGrpVal1FreeTextItem);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.FareQualifItem> flightDetailsValueVal1ItemGrpVal1FareQualifItem = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.FareQualifItem>();
            flightDetailsValueVal1ItemGrpVal1.getFareQualifItem().addAll(flightDetailsValueVal1ItemGrpVal1FareQualifItem);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.OriginDestinationGrp> flightDetailsValueVal1ItemGrpVal1OriginDestinationGrp = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.OriginDestinationGrp>();
            flightDetailsValueVal1ItemGrpVal1.getOriginDestinationGrp().addAll(flightDetailsValueVal1ItemGrpVal1OriginDestinationGrp);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.UnitGrp> flightDetailsValueVal1ItemGrpVal1UnitGrp = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.UnitGrp>();
            flightDetailsValueVal1ItemGrpVal1.getUnitGrp().addAll(flightDetailsValueVal1ItemGrpVal1UnitGrp);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.MonetaryGrp> flightDetailsValueVal1ItemGrpVal1MonetaryGrp = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.MonetaryGrp>();
            flightDetailsValueVal1ItemGrpVal1.getMonetaryGrp().addAll(flightDetailsValueVal1ItemGrpVal1MonetaryGrp);
            java.util.List<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.FarerouteGrp> flightDetailsValueVal1ItemGrpVal1FarerouteGrp = new java.util.ArrayList<com.amadeus.xml.farqnr_07_1_1a.FareCheckRulesReply.FlightDetails.ItemGrp.FarerouteGrp>();
            flightDetailsValueVal1ItemGrpVal1.getFarerouteGrp().addAll(flightDetailsValueVal1ItemGrpVal1FarerouteGrp);
            flightDetailsValueVal1ItemGrp.add(flightDetailsValueVal1ItemGrpVal1);
            flightDetailsValueVal1.getItemGrp().addAll(flightDetailsValueVal1ItemGrp);
            flightDetailsValue.add(flightDetailsValueVal1);
            flightDetails.value = flightDetailsValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see com.amadeus.xml..AmadeusWebServicesPT#fareMasterPricerTravelBoardSearch(com.amadeus.xml.fmptbq_14_2_1a.NumberOfUnitsType  numberOfUnit ,)com.amadeus.xml.fmptbq_14_2_1a.AttributeType  globalOptions ,)java.util.List<com.amadeus.xml.fmptbq_14_2_1a.TravellerReferenceInformationType>  paxReference ,)com.amadeus.xml.fmptbq_14_2_1a.ConsumerReferenceInformationType  customerRef ,)java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FOPRepresentationType>  formOfPaymentByPassenger ,)java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FareInformationType>  solutionFamily ,)java.util.List<com.amadeus.xml.fmptbq_14_2_1a.GroupPassengerDetailsType>  passengerInfoGrp ,)java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.FareFamilies>  fareFamilies ,)com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.FareOptions  fareOptions ,)com.amadeus.xml.fmptbq_14_2_1a.MonetaryInformationType  priceToBeat ,)java.util.List<com.amadeus.xml.fmptbq_14_2_1a.TaxType>  taxInfo ,)com.amadeus.xml.fmptbq_14_2_1a.TravelFlightInformationType165052S  travelFlightInfo ,)java.util.List<com.amadeus.xml.fmptbq_14_2_1a.ValueSearchCriteriaType>  valueSearch ,)java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.Itinerary>  itinerary ,)com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.TicketChangeInfo  ticketChangeInfo ,)java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.CombinationFareFamilies>  combinationFareFamilies ,)java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.FeeOption>  feeOption ,)java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.OfficeIdDetails>  officeIdDetails ,)com.amadeus.xml.fmptbr_14_2_1a.StatusType  replyStatus ,)com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ErrorMessage  errorMessage ,)com.amadeus.xml.fmptbr_14_2_1a.ConversionRateTypeI  conversionRate ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareInformationType>  solutionFamily1 ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareFamilyType>  familyInformation ,)com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax  amountInfoForAllPax ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax>  amountInfoPerPax ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FeeDetails>  feeDetails ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.CompanyIdentificationTextType>  companyIdText ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OfficeIdDetails>  officeIdDetails1 ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex>  flightIndex ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation>  recommendation ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions>  otherSolutions ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.WarningInfo>  warningInfo ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.GlobalInformation>  globalInformation ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp>  serviceFeesGrp ,)java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ValueSearchCriteriaType>  value ,)com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.MnrGrp  mnrGrp )*
     */
    public void fareMasterPricerTravelBoardSearch(com.amadeus.xml.fmptbq_14_2_1a.NumberOfUnitsType numberOfUnit,com.amadeus.xml.fmptbq_14_2_1a.AttributeType globalOptions,java.util.List<com.amadeus.xml.fmptbq_14_2_1a.TravellerReferenceInformationType> paxReference,com.amadeus.xml.fmptbq_14_2_1a.ConsumerReferenceInformationType customerRef,java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FOPRepresentationType> formOfPaymentByPassenger,java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FareInformationType> solutionFamily,java.util.List<com.amadeus.xml.fmptbq_14_2_1a.GroupPassengerDetailsType> passengerInfoGrp,java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.FareFamilies> fareFamilies,com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.FareOptions fareOptions,com.amadeus.xml.fmptbq_14_2_1a.MonetaryInformationType priceToBeat,java.util.List<com.amadeus.xml.fmptbq_14_2_1a.TaxType> taxInfo,com.amadeus.xml.fmptbq_14_2_1a.TravelFlightInformationType165052S travelFlightInfo,java.util.List<com.amadeus.xml.fmptbq_14_2_1a.ValueSearchCriteriaType> valueSearch,java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.Itinerary> itinerary,com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.TicketChangeInfo ticketChangeInfo,java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.CombinationFareFamilies> combinationFareFamilies,java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.FeeOption> feeOption,java.util.List<com.amadeus.xml.fmptbq_14_2_1a.FareMasterPricerTravelBoardSearch.OfficeIdDetails> officeIdDetails,javax.xml.ws.Holder<com.amadeus.xml.fmptbr_14_2_1a.StatusType> replyStatus,javax.xml.ws.Holder<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ErrorMessage> errorMessage,javax.xml.ws.Holder<com.amadeus.xml.fmptbr_14_2_1a.ConversionRateTypeI> conversionRate,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareInformationType>> solutionFamily1,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareFamilyType>> familyInformation,javax.xml.ws.Holder<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax> amountInfoForAllPax,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax>> amountInfoPerPax,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FeeDetails>> feeDetails,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.CompanyIdentificationTextType>> companyIdText,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OfficeIdDetails>> officeIdDetails1,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex>> flightIndex,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation>> recommendation,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions>> otherSolutions,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.WarningInfo>> warningInfo,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.GlobalInformation>> globalInformation,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp>> serviceFeesGrp,javax.xml.ws.Holder<java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ValueSearchCriteriaType>> value,javax.xml.ws.Holder<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.MnrGrp> mnrGrp) { 
        LOG.info("Executing operation fareMasterPricerTravelBoardSearch");
        System.out.println(numberOfUnit);
        System.out.println(globalOptions);
        System.out.println(paxReference);
        System.out.println(customerRef);
        System.out.println(formOfPaymentByPassenger);
        System.out.println(solutionFamily);
        System.out.println(passengerInfoGrp);
        System.out.println(fareFamilies);
        System.out.println(fareOptions);
        System.out.println(priceToBeat);
        System.out.println(taxInfo);
        System.out.println(travelFlightInfo);
        System.out.println(valueSearch);
        System.out.println(itinerary);
        System.out.println(ticketChangeInfo);
        System.out.println(combinationFareFamilies);
        System.out.println(feeOption);
        System.out.println(officeIdDetails);
        try {
            com.amadeus.xml.fmptbr_14_2_1a.StatusType replyStatusValue = new com.amadeus.xml.fmptbr_14_2_1a.StatusType();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.StatusDetailsType> replyStatusValueStatus = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.StatusDetailsType>();
            com.amadeus.xml.fmptbr_14_2_1a.StatusDetailsType replyStatusValueStatusVal1 = new com.amadeus.xml.fmptbr_14_2_1a.StatusDetailsType();
            replyStatusValueStatusVal1.setAdvisoryTypeInfo("AdvisoryTypeInfo-1374728945");
            replyStatusValueStatusVal1.setNotification("Notification313873563");
            replyStatusValueStatusVal1.setNotification2("Notification2-1898153319");
            replyStatusValueStatusVal1.setDescription("Description2134991430");
            replyStatusValueStatus.add(replyStatusValueStatusVal1);
            replyStatusValue.getStatus().addAll(replyStatusValueStatus);
            replyStatus.value = replyStatusValue;
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ErrorMessage errorMessageValue = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ErrorMessage();
            com.amadeus.xml.fmptbr_14_2_1a.ApplicationErrorInformationType78543S errorMessageValueApplicationError = new com.amadeus.xml.fmptbr_14_2_1a.ApplicationErrorInformationType78543S();
            com.amadeus.xml.fmptbr_14_2_1a.ApplicationErrorInformationType errorMessageValueApplicationErrorApplicationErrorDetail = new com.amadeus.xml.fmptbr_14_2_1a.ApplicationErrorInformationType();
            errorMessageValueApplicationErrorApplicationErrorDetail.setError("Error1272854303");
            errorMessageValueApplicationError.setApplicationErrorDetail(errorMessageValueApplicationErrorApplicationErrorDetail);
            errorMessageValue.setApplicationError(errorMessageValueApplicationError);
            com.amadeus.xml.fmptbr_14_2_1a.InteractiveFreeTextType78544S errorMessageValueErrorMessageText = new com.amadeus.xml.fmptbr_14_2_1a.InteractiveFreeTextType78544S();
            com.amadeus.xml.fmptbr_14_2_1a.FreeTextQualificationType120769C errorMessageValueErrorMessageTextFreeTextQualification = new com.amadeus.xml.fmptbr_14_2_1a.FreeTextQualificationType120769C();
            errorMessageValueErrorMessageTextFreeTextQualification.setTextSubjectQualifier("TextSubjectQualifier1643999323");
            errorMessageValueErrorMessageTextFreeTextQualification.setInformationType("InformationType2055458160");
            errorMessageValueErrorMessageTextFreeTextQualification.setLanguage("Language-961150113");
            errorMessageValueErrorMessageText.setFreeTextQualification(errorMessageValueErrorMessageTextFreeTextQualification);
            java.util.List<java.lang.String> errorMessageValueErrorMessageTextDescription = new java.util.ArrayList<java.lang.String>();
            java.lang.String errorMessageValueErrorMessageTextDescriptionVal1 = "errorMessageValueErrorMessageTextDescriptionVal2065864191";
            errorMessageValueErrorMessageTextDescription.add(errorMessageValueErrorMessageTextDescriptionVal1);
            errorMessageValueErrorMessageText.getDescription().addAll(errorMessageValueErrorMessageTextDescription);
            errorMessageValue.setErrorMessageText(errorMessageValueErrorMessageText);
            errorMessage.value = errorMessageValue;
            com.amadeus.xml.fmptbr_14_2_1a.ConversionRateTypeI conversionRateValue = new com.amadeus.xml.fmptbr_14_2_1a.ConversionRateTypeI();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ConversionRateDetailsTypeI179848C> conversionRateValueConversionRateDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ConversionRateDetailsTypeI179848C>();
            com.amadeus.xml.fmptbr_14_2_1a.ConversionRateDetailsTypeI179848C conversionRateValueConversionRateDetailVal1 = new com.amadeus.xml.fmptbr_14_2_1a.ConversionRateDetailsTypeI179848C();
            conversionRateValueConversionRateDetailVal1.setConversionType("ConversionType-252932305");
            conversionRateValueConversionRateDetailVal1.setCurrency("Currency928226249");
            conversionRateValueConversionRateDetailVal1.setRate("Rate-933512616");
            conversionRateValueConversionRateDetailVal1.setConvertedAmountLink("ConvertedAmountLink-526849876");
            conversionRateValueConversionRateDetailVal1.setTaxQualifier("TaxQualifier-1850458208");
            conversionRateValueConversionRateDetail.add(conversionRateValueConversionRateDetailVal1);
            conversionRateValue.getConversionRateDetail().addAll(conversionRateValueConversionRateDetail);
            conversionRate.value = conversionRateValue;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareInformationType> solutionFamily1Value = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareInformationType>();
            com.amadeus.xml.fmptbr_14_2_1a.FareInformationType solutionFamily1ValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareInformationType();
            solutionFamily1ValueVal1.setValueQualifier("ValueQualifier1272014344");
            solutionFamily1ValueVal1.setValue(new java.math.BigInteger("-84935261534508647235048631023220931165"));
            com.amadeus.xml.fmptbr_14_2_1a.FareDetailsType193037C solutionFamily1ValueVal1FareDetails = new com.amadeus.xml.fmptbr_14_2_1a.FareDetailsType193037C();
            solutionFamily1ValueVal1FareDetails.setQualifier("Qualifier2139653135");
            solutionFamily1ValueVal1FareDetails.setRate(new java.math.BigInteger("3537089767177554175567877740559247906"));
            solutionFamily1ValueVal1FareDetails.setCountry("Country969793968");
            solutionFamily1ValueVal1FareDetails.setFareCategory("FareCategory-905698044");
            solutionFamily1ValueVal1.setFareDetails(solutionFamily1ValueVal1FareDetails);
            solutionFamily1ValueVal1.setIdentityNumber("IdentityNumber-268707086");
            com.amadeus.xml.fmptbr_14_2_1a.FareTypeGroupingInformationType solutionFamily1ValueVal1FareTypeGrouping = new com.amadeus.xml.fmptbr_14_2_1a.FareTypeGroupingInformationType();
            solutionFamily1ValueVal1FareTypeGrouping.setPricingGroup("PricingGroup2050276023");
            solutionFamily1ValueVal1.setFareTypeGrouping(solutionFamily1ValueVal1FareTypeGrouping);
            solutionFamily1ValueVal1.setRateCategory("RateCategory-1768463967");
            solutionFamily1Value.add(solutionFamily1ValueVal1);
            solutionFamily1.value = solutionFamily1Value;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareFamilyType> familyInformationValue = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareFamilyType>();
            com.amadeus.xml.fmptbr_14_2_1a.FareFamilyType familyInformationValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareFamilyType();
            familyInformationValueVal1.setRefNumber(new java.math.BigInteger("52279085444871459494451220953856087216"));
            familyInformationValueVal1.setFareFamilyname("FareFamilyname-1598497100");
            familyInformationValueVal1.setHierarchy(new java.math.BigInteger("57339920137934880613252489546343405972"));
            familyInformationValueVal1.setCabin("Cabin-1404045986");
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareFamilyDetailsType> familyInformationValueVal1CommercialFamilyDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareFamilyDetailsType>();
            com.amadeus.xml.fmptbr_14_2_1a.FareFamilyDetailsType familyInformationValueVal1CommercialFamilyDetailsVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareFamilyDetailsType();
            familyInformationValueVal1CommercialFamilyDetailsVal1.setCommercialFamily("CommercialFamily-430309843");
            familyInformationValueVal1CommercialFamilyDetails.add(familyInformationValueVal1CommercialFamilyDetailsVal1);
            familyInformationValueVal1.getCommercialFamilyDetails().addAll(familyInformationValueVal1CommercialFamilyDetails);
            familyInformationValueVal1.setDescription("Description1318322411");
            familyInformationValueVal1.setCarrier("Carrier49513527");
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ServicesReferencesType> familyInformationValueVal1Services = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ServicesReferencesType>();
            com.amadeus.xml.fmptbr_14_2_1a.ServicesReferencesType familyInformationValueVal1ServicesVal1 = new com.amadeus.xml.fmptbr_14_2_1a.ServicesReferencesType();
            familyInformationValueVal1ServicesVal1.setReference("Reference483902750");
            familyInformationValueVal1ServicesVal1.setStatus("Status-630817741");
            familyInformationValueVal1Services.add(familyInformationValueVal1ServicesVal1);
            familyInformationValueVal1.getServices().addAll(familyInformationValueVal1Services);
            familyInformationValue.add(familyInformationValueVal1);
            familyInformation.value = familyInformationValue;
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax amountInfoForAllPaxValue = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax();
            com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationType137835S amountInfoForAllPaxValueItineraryAmounts = new com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationType137835S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType> amountInfoForAllPaxValueItineraryAmountsMonetaryDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType>();
            com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType amountInfoForAllPaxValueItineraryAmountsMonetaryDetailVal1 = new com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType();
            amountInfoForAllPaxValueItineraryAmountsMonetaryDetailVal1.setAmountType("AmountType-1112495118");
            amountInfoForAllPaxValueItineraryAmountsMonetaryDetailVal1.setAmount(new java.math.BigDecimal("-8165552153569980407.1982375310631124147"));
            amountInfoForAllPaxValueItineraryAmountsMonetaryDetailVal1.setCurrency("Currency-745739249");
            amountInfoForAllPaxValueItineraryAmountsMonetaryDetail.add(amountInfoForAllPaxValueItineraryAmountsMonetaryDetailVal1);
            amountInfoForAllPaxValueItineraryAmounts.getMonetaryDetail().addAll(amountInfoForAllPaxValueItineraryAmountsMonetaryDetail);
            amountInfoForAllPaxValue.setItineraryAmounts(amountInfoForAllPaxValueItineraryAmounts);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax.AmountsPerSgt> amountInfoForAllPaxValueAmountsPerSgt = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax.AmountsPerSgt>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax.AmountsPerSgt amountInfoForAllPaxValueAmountsPerSgtVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoForAllPax.AmountsPerSgt();
            com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType133176S amountInfoForAllPaxValueAmountsPerSgtVal1SgtRef = new com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType133176S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType> amountInfoForAllPaxValueAmountsPerSgtVal1SgtRefReferencingDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType>();
            amountInfoForAllPaxValueAmountsPerSgtVal1SgtRef.getReferencingDetail().addAll(amountInfoForAllPaxValueAmountsPerSgtVal1SgtRefReferencingDetail);
            amountInfoForAllPaxValueAmountsPerSgtVal1.setSgtRef(amountInfoForAllPaxValueAmountsPerSgtVal1SgtRef);
            com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationType137835S amountInfoForAllPaxValueAmountsPerSgtVal1Amounts = new com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationType137835S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType> amountInfoForAllPaxValueAmountsPerSgtVal1AmountsMonetaryDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType>();
            amountInfoForAllPaxValueAmountsPerSgtVal1Amounts.getMonetaryDetail().addAll(amountInfoForAllPaxValueAmountsPerSgtVal1AmountsMonetaryDetail);
            amountInfoForAllPaxValueAmountsPerSgtVal1.setAmounts(amountInfoForAllPaxValueAmountsPerSgtVal1Amounts);
            amountInfoForAllPaxValueAmountsPerSgt.add(amountInfoForAllPaxValueAmountsPerSgtVal1);
            amountInfoForAllPaxValue.getAmountsPerSgt().addAll(amountInfoForAllPaxValueAmountsPerSgt);
            amountInfoForAllPax.value = amountInfoForAllPaxValue;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax> amountInfoPerPaxValue = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax amountInfoPerPaxValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax();
            com.amadeus.xml.fmptbr_14_2_1a.SpecificTravellerType amountInfoPerPaxValueVal1PaxRef = new com.amadeus.xml.fmptbr_14_2_1a.SpecificTravellerType();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.SpecificTravellerDetailsType> amountInfoPerPaxValueVal1PaxRefTravellerDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.SpecificTravellerDetailsType>();
            amountInfoPerPaxValueVal1PaxRef.getTravellerDetails().addAll(amountInfoPerPaxValueVal1PaxRefTravellerDetails);
            amountInfoPerPaxValueVal1.setPaxRef(amountInfoPerPaxValueVal1PaxRef);
            com.amadeus.xml.fmptbr_14_2_1a.FareInformationType80868S amountInfoPerPaxValueVal1PaxAttributes = new com.amadeus.xml.fmptbr_14_2_1a.FareInformationType80868S();
            com.amadeus.xml.fmptbr_14_2_1a.FareDetailsType amountInfoPerPaxValueVal1PaxAttributesFareDetails = new com.amadeus.xml.fmptbr_14_2_1a.FareDetailsType();
            amountInfoPerPaxValueVal1PaxAttributesFareDetails.setPassengerTypeQualifier("PassengerTypeQualifier396251127");
            amountInfoPerPaxValueVal1PaxAttributes.setFareDetails(amountInfoPerPaxValueVal1PaxAttributesFareDetails);
            amountInfoPerPaxValueVal1.setPaxAttributes(amountInfoPerPaxValueVal1PaxAttributes);
            com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationType137835S amountInfoPerPaxValueVal1ItineraryAmounts = new com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationType137835S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType> amountInfoPerPaxValueVal1ItineraryAmountsMonetaryDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType>();
            amountInfoPerPaxValueVal1ItineraryAmounts.getMonetaryDetail().addAll(amountInfoPerPaxValueVal1ItineraryAmountsMonetaryDetail);
            amountInfoPerPaxValueVal1.setItineraryAmounts(amountInfoPerPaxValueVal1ItineraryAmounts);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax.AmountsPerSgt> amountInfoPerPaxValueVal1AmountsPerSgt = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax.AmountsPerSgt>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax.AmountsPerSgt amountInfoPerPaxValueVal1AmountsPerSgtVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.AmountInfoPerPax.AmountsPerSgt();
            com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType133176S amountInfoPerPaxValueVal1AmountsPerSgtVal1SgtRef = new com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType133176S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType> amountInfoPerPaxValueVal1AmountsPerSgtVal1SgtRefReferencingDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType>();
            amountInfoPerPaxValueVal1AmountsPerSgtVal1SgtRef.getReferencingDetail().addAll(amountInfoPerPaxValueVal1AmountsPerSgtVal1SgtRefReferencingDetail);
            amountInfoPerPaxValueVal1AmountsPerSgtVal1.setSgtRef(amountInfoPerPaxValueVal1AmountsPerSgtVal1SgtRef);
            com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationType137835S amountInfoPerPaxValueVal1AmountsPerSgtVal1Amounts = new com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationType137835S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType> amountInfoPerPaxValueVal1AmountsPerSgtVal1AmountsMonetaryDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType>();
            amountInfoPerPaxValueVal1AmountsPerSgtVal1Amounts.getMonetaryDetail().addAll(amountInfoPerPaxValueVal1AmountsPerSgtVal1AmountsMonetaryDetail);
            amountInfoPerPaxValueVal1AmountsPerSgtVal1.setAmounts(amountInfoPerPaxValueVal1AmountsPerSgtVal1Amounts);
            amountInfoPerPaxValueVal1AmountsPerSgt.add(amountInfoPerPaxValueVal1AmountsPerSgtVal1);
            amountInfoPerPaxValueVal1.getAmountsPerSgt().addAll(amountInfoPerPaxValueVal1AmountsPerSgt);
            amountInfoPerPaxValue.add(amountInfoPerPaxValueVal1);
            amountInfoPerPax.value = amountInfoPerPaxValue;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FeeDetails> feeDetailsValue = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FeeDetails>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FeeDetails feeDetailsValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FeeDetails();
            com.amadeus.xml.fmptbr_14_2_1a.ItemReferencesAndVersionsType78564S feeDetailsValueVal1FeeReference = new com.amadeus.xml.fmptbr_14_2_1a.ItemReferencesAndVersionsType78564S();
            feeDetailsValueVal1FeeReference.setReferenceType("ReferenceType-228462768");
            feeDetailsValueVal1FeeReference.setFeeRefNumber(new java.math.BigInteger("83791332523682278516074750471236919717"));
            feeDetailsValueVal1.setFeeReference(feeDetailsValueVal1FeeReference);
            com.amadeus.xml.fmptbr_14_2_1a.DiscountAndPenaltyInformationType feeDetailsValueVal1FeeInformation = new com.amadeus.xml.fmptbr_14_2_1a.DiscountAndPenaltyInformationType();
            feeDetailsValueVal1FeeInformation.setFeeIdentification("FeeIdentification-671155475");
            com.amadeus.xml.fmptbr_14_2_1a.DiscountPenaltyMonetaryInformationType feeDetailsValueVal1FeeInformationFeeInformation = new com.amadeus.xml.fmptbr_14_2_1a.DiscountPenaltyMonetaryInformationType();
            feeDetailsValueVal1FeeInformationFeeInformation.setFeeType("FeeType826052545");
            feeDetailsValueVal1FeeInformationFeeInformation.setFeeAmountType("FeeAmountType1135391829");
            feeDetailsValueVal1FeeInformationFeeInformation.setFeeAmount(new java.math.BigDecimal("9184195261528466859.5097323296205252066"));
            feeDetailsValueVal1FeeInformationFeeInformation.setFeeCurrency("FeeCurrency-2118200302");
            feeDetailsValueVal1FeeInformation.setFeeInformation(feeDetailsValueVal1FeeInformationFeeInformation);
            feeDetailsValueVal1.setFeeInformation(feeDetailsValueVal1FeeInformation);
            com.amadeus.xml.fmptbr_14_2_1a.AttributeType78561S feeDetailsValueVal1FeeParameters = new com.amadeus.xml.fmptbr_14_2_1a.AttributeType78561S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.AttributeInformationType> feeDetailsValueVal1FeeParametersFeeParameter = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.AttributeInformationType>();
            feeDetailsValueVal1FeeParameters.getFeeParameter().addAll(feeDetailsValueVal1FeeParametersFeeParameter);
            feeDetailsValueVal1.setFeeParameters(feeDetailsValueVal1FeeParameters);
            com.amadeus.xml.fmptbr_14_2_1a.ConversionRateTypeI78562S feeDetailsValueVal1ConvertedOrOriginalInfo = new com.amadeus.xml.fmptbr_14_2_1a.ConversionRateTypeI78562S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ConversionRateDetailsTypeI> feeDetailsValueVal1ConvertedOrOriginalInfoConversionRateDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ConversionRateDetailsTypeI>();
            feeDetailsValueVal1ConvertedOrOriginalInfo.getConversionRateDetail().addAll(feeDetailsValueVal1ConvertedOrOriginalInfoConversionRateDetail);
            feeDetailsValueVal1.setConvertedOrOriginalInfo(feeDetailsValueVal1ConvertedOrOriginalInfo);
            feeDetailsValue.add(feeDetailsValueVal1);
            feeDetails.value = feeDetailsValue;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.CompanyIdentificationTextType> companyIdTextValue = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.CompanyIdentificationTextType>();
            com.amadeus.xml.fmptbr_14_2_1a.CompanyIdentificationTextType companyIdTextValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.CompanyIdentificationTextType();
            companyIdTextValueVal1.setTextRefNumber(new java.math.BigInteger("-3380081729703221162266365661235601142"));
            companyIdTextValueVal1.setCompanyText("CompanyText16691458");
            companyIdTextValue.add(companyIdTextValueVal1);
            companyIdText.value = companyIdTextValue;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OfficeIdDetails> officeIdDetails1Value = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OfficeIdDetails>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OfficeIdDetails officeIdDetails1ValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OfficeIdDetails();
            com.amadeus.xml.fmptbr_14_2_1a.UserIdentificationType officeIdDetails1ValueVal1OfficeIdInformation = new com.amadeus.xml.fmptbr_14_2_1a.UserIdentificationType();
            com.amadeus.xml.fmptbr_14_2_1a.OriginatorIdentificationDetailsTypeI officeIdDetails1ValueVal1OfficeIdInformationOfficeIdentification = new com.amadeus.xml.fmptbr_14_2_1a.OriginatorIdentificationDetailsTypeI();
            officeIdDetails1ValueVal1OfficeIdInformationOfficeIdentification.setOfficeName(new java.math.BigInteger("57399625441360847253992020253821558733"));
            officeIdDetails1ValueVal1OfficeIdInformationOfficeIdentification.setAgentSignin("AgentSignin-2022450469");
            officeIdDetails1ValueVal1OfficeIdInformationOfficeIdentification.setConfidentialOffice("ConfidentialOffice-1869705767");
            officeIdDetails1ValueVal1OfficeIdInformationOfficeIdentification.setOtherOffice("OtherOffice1064326472");
            officeIdDetails1ValueVal1OfficeIdInformation.setOfficeIdentification(officeIdDetails1ValueVal1OfficeIdInformationOfficeIdentification);
            officeIdDetails1ValueVal1OfficeIdInformation.setOfficeType("OfficeType1144244761");
            officeIdDetails1ValueVal1OfficeIdInformation.setOfficeCode("OfficeCode-1140405820");
            officeIdDetails1ValueVal1.setOfficeIdInformation(officeIdDetails1ValueVal1OfficeIdInformation);
            com.amadeus.xml.fmptbr_14_2_1a.ItemReferencesAndVersionsType78536S officeIdDetails1ValueVal1OfficeIdReference = new com.amadeus.xml.fmptbr_14_2_1a.ItemReferencesAndVersionsType78536S();
            officeIdDetails1ValueVal1OfficeIdReference.setReferenceType("ReferenceType787732477");
            officeIdDetails1ValueVal1OfficeIdReference.setRefNumber(new java.math.BigInteger("-39428047355432800178117655731912621538"));
            officeIdDetails1ValueVal1.setOfficeIdReference(officeIdDetails1ValueVal1OfficeIdReference);
            officeIdDetails1Value.add(officeIdDetails1ValueVal1);
            officeIdDetails1.value = officeIdDetails1Value;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex> flightIndexValue = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex flightIndexValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex();
            com.amadeus.xml.fmptbr_14_2_1a.OriginAndDestinationRequestType flightIndexValueVal1RequestedSegmentRef = new com.amadeus.xml.fmptbr_14_2_1a.OriginAndDestinationRequestType();
            flightIndexValueVal1RequestedSegmentRef.setSegRef(new java.math.BigInteger("25433830707897234044093876259807726221"));
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ItineraryDetailsType> flightIndexValueVal1RequestedSegmentRefLocationForcing = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ItineraryDetailsType>();
            flightIndexValueVal1RequestedSegmentRef.getLocationForcing().addAll(flightIndexValueVal1RequestedSegmentRefLocationForcing);
            flightIndexValueVal1.setRequestedSegmentRef(flightIndexValueVal1RequestedSegmentRef);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights> flightIndexValueVal1GroupOfFlights = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights flightIndexValueVal1GroupOfFlightsVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights();
            com.amadeus.xml.fmptbr_14_2_1a.ProposedSegmentType flightIndexValueVal1GroupOfFlightsVal1PropFlightGrDetail = new com.amadeus.xml.fmptbr_14_2_1a.ProposedSegmentType();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ProposedSegmentDetailsType> flightIndexValueVal1GroupOfFlightsVal1PropFlightGrDetailFlightProposal = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ProposedSegmentDetailsType>();
            flightIndexValueVal1GroupOfFlightsVal1PropFlightGrDetail.getFlightProposal().addAll(flightIndexValueVal1GroupOfFlightsVal1PropFlightGrDetailFlightProposal);
            flightIndexValueVal1GroupOfFlightsVal1PropFlightGrDetail.setFlightCharacteristic("FlightCharacteristic-381739555");
            flightIndexValueVal1GroupOfFlightsVal1PropFlightGrDetail.setMajCabin("MajCabin1083562619");
            flightIndexValueVal1GroupOfFlightsVal1.setPropFlightGrDetail(flightIndexValueVal1GroupOfFlightsVal1PropFlightGrDetail);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights.FlightDetails> flightIndexValueVal1GroupOfFlightsVal1FlightDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.FlightIndex.GroupOfFlights.FlightDetails>();
            flightIndexValueVal1GroupOfFlightsVal1.getFlightDetails().addAll(flightIndexValueVal1GroupOfFlightsVal1FlightDetails);
            flightIndexValueVal1GroupOfFlights.add(flightIndexValueVal1GroupOfFlightsVal1);
            flightIndexValueVal1.getGroupOfFlights().addAll(flightIndexValueVal1GroupOfFlights);
            flightIndexValue.add(flightIndexValueVal1);
            flightIndex.value = flightIndexValue;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation> recommendationValue = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation recommendationValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation();
            com.amadeus.xml.fmptbr_14_2_1a.ItemNumberType161497S recommendationValueVal1ItemNumber = new com.amadeus.xml.fmptbr_14_2_1a.ItemNumberType161497S();
            com.amadeus.xml.fmptbr_14_2_1a.ItemNumberIdentificationType191597C recommendationValueVal1ItemNumberItemNumberId = new com.amadeus.xml.fmptbr_14_2_1a.ItemNumberIdentificationType191597C();
            recommendationValueVal1ItemNumberItemNumberId.setNumber("Number474822909");
            recommendationValueVal1ItemNumberItemNumberId.setNumberType("NumberType530125361");
            recommendationValueVal1ItemNumber.setItemNumberId(recommendationValueVal1ItemNumberItemNumberId);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.CompanyRoleIdentificationType120771C> recommendationValueVal1ItemNumberCodeShareDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.CompanyRoleIdentificationType120771C>();
            recommendationValueVal1ItemNumber.getCodeShareDetails().addAll(recommendationValueVal1ItemNumberCodeShareDetails);
            com.amadeus.xml.fmptbr_14_2_1a.PricingTicketingInformationType recommendationValueVal1ItemNumberPriceTicketing = new com.amadeus.xml.fmptbr_14_2_1a.PricingTicketingInformationType();
            java.util.List<java.lang.String> recommendationValueVal1ItemNumberPriceTicketingPriceType = new java.util.ArrayList<java.lang.String>();
            recommendationValueVal1ItemNumberPriceTicketing.getPriceType().addAll(recommendationValueVal1ItemNumberPriceTicketingPriceType);
            recommendationValueVal1ItemNumber.setPriceTicketing(recommendationValueVal1ItemNumberPriceTicketing);
            recommendationValueVal1.setItemNumber(recommendationValueVal1ItemNumber);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.InteractiveFreeTextType78544S> recommendationValueVal1WarningMessage = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.InteractiveFreeTextType78544S>();
            com.amadeus.xml.fmptbr_14_2_1a.InteractiveFreeTextType78544S recommendationValueVal1WarningMessageVal1 = new com.amadeus.xml.fmptbr_14_2_1a.InteractiveFreeTextType78544S();
            com.amadeus.xml.fmptbr_14_2_1a.FreeTextQualificationType120769C recommendationValueVal1WarningMessageVal1FreeTextQualification = new com.amadeus.xml.fmptbr_14_2_1a.FreeTextQualificationType120769C();
            recommendationValueVal1WarningMessageVal1FreeTextQualification.setTextSubjectQualifier("TextSubjectQualifier-776110109");
            recommendationValueVal1WarningMessageVal1FreeTextQualification.setInformationType("InformationType1331855819");
            recommendationValueVal1WarningMessageVal1FreeTextQualification.setLanguage("Language-1010732207");
            recommendationValueVal1WarningMessageVal1.setFreeTextQualification(recommendationValueVal1WarningMessageVal1FreeTextQualification);
            java.util.List<java.lang.String> recommendationValueVal1WarningMessageVal1Description = new java.util.ArrayList<java.lang.String>();
            recommendationValueVal1WarningMessageVal1.getDescription().addAll(recommendationValueVal1WarningMessageVal1Description);
            recommendationValueVal1WarningMessage.add(recommendationValueVal1WarningMessageVal1);
            recommendationValueVal1.getWarningMessage().addAll(recommendationValueVal1WarningMessage);
            com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType133176S recommendationValueVal1FareFamilyRef = new com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType133176S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType> recommendationValueVal1FareFamilyRefReferencingDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType>();
            recommendationValueVal1FareFamilyRef.getReferencingDetail().addAll(recommendationValueVal1FareFamilyRefReferencingDetail);
            recommendationValueVal1.setFareFamilyRef(recommendationValueVal1FareFamilyRef);
            com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationType134806S recommendationValueVal1RecPriceInfo = new com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationType134806S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType> recommendationValueVal1RecPriceInfoMonetaryDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType>();
            recommendationValueVal1RecPriceInfo.getMonetaryDetail().addAll(recommendationValueVal1RecPriceInfoMonetaryDetail);
            recommendationValueVal1.setRecPriceInfo(recommendationValueVal1RecPriceInfo);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.MiniRulesType78547S> recommendationValueVal1MiniRule = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.MiniRulesType78547S>();
            com.amadeus.xml.fmptbr_14_2_1a.MiniRulesType78547S recommendationValueVal1MiniRuleVal1 = new com.amadeus.xml.fmptbr_14_2_1a.MiniRulesType78547S();
            recommendationValueVal1MiniRuleVal1.setRestrictionType("RestrictionType94390830");
            recommendationValueVal1MiniRuleVal1.setCategory("Category-1568867510");
            com.amadeus.xml.fmptbr_14_2_1a.MiniRulesIndicatorType recommendationValueVal1MiniRuleVal1Indicator = new com.amadeus.xml.fmptbr_14_2_1a.MiniRulesIndicatorType();
            java.util.List<java.lang.String> recommendationValueVal1MiniRuleVal1IndicatorRuleIndicator = new java.util.ArrayList<java.lang.String>();
            recommendationValueVal1MiniRuleVal1Indicator.getRuleIndicator().addAll(recommendationValueVal1MiniRuleVal1IndicatorRuleIndicator);
            recommendationValueVal1MiniRuleVal1.setIndicator(recommendationValueVal1MiniRuleVal1Indicator);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.MiniRulesDetailsType> recommendationValueVal1MiniRuleVal1MiniRules = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.MiniRulesDetailsType>();
            recommendationValueVal1MiniRuleVal1.getMiniRules().addAll(recommendationValueVal1MiniRuleVal1MiniRules);
            recommendationValueVal1MiniRule.add(recommendationValueVal1MiniRuleVal1);
            recommendationValueVal1.getMiniRule().addAll(recommendationValueVal1MiniRule);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType> recommendationValueVal1SegmentFlightRef = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType>();
            com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType recommendationValueVal1SegmentFlightRefVal1 = new com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType191583C> recommendationValueVal1SegmentFlightRefVal1ReferencingDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType191583C>();
            recommendationValueVal1SegmentFlightRefVal1.getReferencingDetail().addAll(recommendationValueVal1SegmentFlightRefVal1ReferencingDetail);
            recommendationValueVal1SegmentFlightRef.add(recommendationValueVal1SegmentFlightRefVal1);
            recommendationValueVal1.getSegmentFlightRef().addAll(recommendationValueVal1SegmentFlightRef);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.RecommandationSegmentsFareDetails> recommendationValueVal1RecommandationSegmentsFareDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.RecommandationSegmentsFareDetails>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.RecommandationSegmentsFareDetails recommendationValueVal1RecommandationSegmentsFareDetailsVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.RecommandationSegmentsFareDetails();
            com.amadeus.xml.fmptbr_14_2_1a.OriginAndDestinationRequestType recommendationValueVal1RecommandationSegmentsFareDetailsVal1RecommendationSegRef = new com.amadeus.xml.fmptbr_14_2_1a.OriginAndDestinationRequestType();
            recommendationValueVal1RecommandationSegmentsFareDetailsVal1RecommendationSegRef.setSegRef(new java.math.BigInteger("-24103761838463889199063191032255615544"));
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ItineraryDetailsType> recommendationValueVal1RecommandationSegmentsFareDetailsVal1RecommendationSegRefLocationForcing = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ItineraryDetailsType>();
            recommendationValueVal1RecommandationSegmentsFareDetailsVal1RecommendationSegRef.getLocationForcing().addAll(recommendationValueVal1RecommandationSegmentsFareDetailsVal1RecommendationSegRefLocationForcing);
            recommendationValueVal1RecommandationSegmentsFareDetailsVal1.setRecommendationSegRef(recommendationValueVal1RecommandationSegmentsFareDetailsVal1RecommendationSegRef);
            com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationType137835S recommendationValueVal1RecommandationSegmentsFareDetailsVal1SegmentMonetaryInformation = new com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationType137835S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType> recommendationValueVal1RecommandationSegmentsFareDetailsVal1SegmentMonetaryInformationMonetaryDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType>();
            recommendationValueVal1RecommandationSegmentsFareDetailsVal1SegmentMonetaryInformation.getMonetaryDetail().addAll(recommendationValueVal1RecommandationSegmentsFareDetailsVal1SegmentMonetaryInformationMonetaryDetail);
            recommendationValueVal1RecommandationSegmentsFareDetailsVal1.setSegmentMonetaryInformation(recommendationValueVal1RecommandationSegmentsFareDetailsVal1SegmentMonetaryInformation);
            recommendationValueVal1RecommandationSegmentsFareDetails.add(recommendationValueVal1RecommandationSegmentsFareDetailsVal1);
            recommendationValueVal1.getRecommandationSegmentsFareDetails().addAll(recommendationValueVal1RecommandationSegmentsFareDetails);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct> recommendationValueVal1PaxFareProduct = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct recommendationValueVal1PaxFareProductVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct();
            com.amadeus.xml.fmptbr_14_2_1a.PricingTicketingSubsequentType144401S recommendationValueVal1PaxFareProductVal1PaxFareDetail = new com.amadeus.xml.fmptbr_14_2_1a.PricingTicketingSubsequentType144401S();
            recommendationValueVal1PaxFareProductVal1PaxFareDetail.setPaxFareNum("PaxFareNum-1996025192");
            recommendationValueVal1PaxFareProductVal1PaxFareDetail.setTotalFareAmount(new java.math.BigDecimal("5998777049352476893.472808217068600514"));
            recommendationValueVal1PaxFareProductVal1PaxFareDetail.setTotalTaxAmount(new java.math.BigDecimal("5614948470220467490.5710650505428110709"));
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.CompanyRoleIdentificationType120771C> recommendationValueVal1PaxFareProductVal1PaxFareDetailCodeShareDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.CompanyRoleIdentificationType120771C>();
            recommendationValueVal1PaxFareProductVal1PaxFareDetail.getCodeShareDetails().addAll(recommendationValueVal1PaxFareProductVal1PaxFareDetailCodeShareDetails);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType> recommendationValueVal1PaxFareProductVal1PaxFareDetailMonetaryDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsType>();
            recommendationValueVal1PaxFareProductVal1PaxFareDetail.getMonetaryDetails().addAll(recommendationValueVal1PaxFareProductVal1PaxFareDetailMonetaryDetails);
            com.amadeus.xml.fmptbr_14_2_1a.PricingTicketingInformationType recommendationValueVal1PaxFareProductVal1PaxFareDetailPricingTicketing = new com.amadeus.xml.fmptbr_14_2_1a.PricingTicketingInformationType();
            java.util.List<java.lang.String> recommendationValueVal1PaxFareProductVal1PaxFareDetailPricingTicketingPriceType = new java.util.ArrayList<java.lang.String>();
            recommendationValueVal1PaxFareProductVal1PaxFareDetailPricingTicketing.getPriceType().addAll(recommendationValueVal1PaxFareProductVal1PaxFareDetailPricingTicketingPriceType);
            recommendationValueVal1PaxFareProductVal1PaxFareDetail.setPricingTicketing(recommendationValueVal1PaxFareProductVal1PaxFareDetailPricingTicketing);
            recommendationValueVal1PaxFareProductVal1.setPaxFareDetail(recommendationValueVal1PaxFareProductVal1PaxFareDetail);
            com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType134839S recommendationValueVal1PaxFareProductVal1FeeRef = new com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType134839S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType195561C> recommendationValueVal1PaxFareProductVal1FeeRefReferencingDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType195561C>();
            recommendationValueVal1PaxFareProductVal1FeeRef.getReferencingDetail().addAll(recommendationValueVal1PaxFareProductVal1FeeRefReferencingDetail);
            recommendationValueVal1PaxFareProductVal1.setFeeRef(recommendationValueVal1PaxFareProductVal1FeeRef);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.TravellerReferenceInformationType> recommendationValueVal1PaxFareProductVal1PaxReference = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.TravellerReferenceInformationType>();
            recommendationValueVal1PaxFareProductVal1.getPaxReference().addAll(recommendationValueVal1PaxFareProductVal1PaxReference);
            com.amadeus.xml.fmptbr_14_2_1a.TaxType recommendationValueVal1PaxFareProductVal1PassengerTaxDetails = new com.amadeus.xml.fmptbr_14_2_1a.TaxType();
            recommendationValueVal1PaxFareProductVal1PassengerTaxDetails.setTaxCategory("TaxCategory-86452360");
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.TaxDetailsType> recommendationValueVal1PaxFareProductVal1PassengerTaxDetailsTaxDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.TaxDetailsType>();
            recommendationValueVal1PaxFareProductVal1PassengerTaxDetails.getTaxDetails().addAll(recommendationValueVal1PaxFareProductVal1PassengerTaxDetailsTaxDetails);
            recommendationValueVal1PaxFareProductVal1.setPassengerTaxDetails(recommendationValueVal1PaxFareProductVal1PassengerTaxDetails);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.Fare> recommendationValueVal1PaxFareProductVal1Fare = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.Fare>();
            recommendationValueVal1PaxFareProductVal1.getFare().addAll(recommendationValueVal1PaxFareProductVal1Fare);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.FareDetails> recommendationValueVal1PaxFareProductVal1FareDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.PaxFareProduct.FareDetails>();
            recommendationValueVal1PaxFareProductVal1.getFareDetails().addAll(recommendationValueVal1PaxFareProductVal1FareDetails);
            recommendationValueVal1PaxFareProduct.add(recommendationValueVal1PaxFareProductVal1);
            recommendationValueVal1.getPaxFareProduct().addAll(recommendationValueVal1PaxFareProduct);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails> recommendationValueVal1SpecificRecDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails recommendationValueVal1SpecificRecDetailsVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails();
            com.amadeus.xml.fmptbr_14_2_1a.ItemReferencesAndVersionsType recommendationValueVal1SpecificRecDetailsVal1SpecificRecItem = new com.amadeus.xml.fmptbr_14_2_1a.ItemReferencesAndVersionsType();
            recommendationValueVal1SpecificRecDetailsVal1SpecificRecItem.setReferenceType("ReferenceType-1949813");
            recommendationValueVal1SpecificRecDetailsVal1SpecificRecItem.setRefNumber(new java.math.BigInteger("55185059440885930993917853053117073339"));
            recommendationValueVal1SpecificRecDetailsVal1.setSpecificRecItem(recommendationValueVal1SpecificRecDetailsVal1SpecificRecItem);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails> recommendationValueVal1SpecificRecDetailsVal1SpecificProductDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.Recommendation.SpecificRecDetails.SpecificProductDetails>();
            recommendationValueVal1SpecificRecDetailsVal1.getSpecificProductDetails().addAll(recommendationValueVal1SpecificRecDetailsVal1SpecificProductDetails);
            recommendationValueVal1SpecificRecDetails.add(recommendationValueVal1SpecificRecDetailsVal1);
            recommendationValueVal1.getSpecificRecDetails().addAll(recommendationValueVal1SpecificRecDetails);
            recommendationValue.add(recommendationValueVal1);
            recommendation.value = recommendationValue;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions> otherSolutionsValue = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions otherSolutionsValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions();
            com.amadeus.xml.fmptbr_14_2_1a.SequenceDetailsTypeU otherSolutionsValueVal1Reference = new com.amadeus.xml.fmptbr_14_2_1a.SequenceDetailsTypeU();
            com.amadeus.xml.fmptbr_14_2_1a.SequenceInformationTypeU otherSolutionsValueVal1ReferenceSequenceDetails = new com.amadeus.xml.fmptbr_14_2_1a.SequenceInformationTypeU();
            otherSolutionsValueVal1ReferenceSequenceDetails.setNumber("Number1184585581");
            otherSolutionsValueVal1ReferenceSequenceDetails.setIdentificationCode("IdentificationCode-1073435631");
            otherSolutionsValueVal1Reference.setSequenceDetails(otherSolutionsValueVal1ReferenceSequenceDetails);
            otherSolutionsValueVal1.setReference(otherSolutionsValueVal1Reference);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions.AmtGroup> otherSolutionsValueVal1AmtGroup = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions.AmtGroup>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions.AmtGroup otherSolutionsValueVal1AmtGroupVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions.AmtGroup();
            com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType165972S otherSolutionsValueVal1AmtGroupVal1Ref = new com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType165972S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType234704C> otherSolutionsValueVal1AmtGroupVal1RefReferenceDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType234704C>();
            otherSolutionsValueVal1AmtGroupVal1Ref.getReferenceDetails().addAll(otherSolutionsValueVal1AmtGroupVal1RefReferenceDetails);
            otherSolutionsValueVal1AmtGroupVal1.setRef(otherSolutionsValueVal1AmtGroupVal1Ref);
            com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationTypeI otherSolutionsValueVal1AmtGroupVal1Amount = new com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationTypeI();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsTypeI> otherSolutionsValueVal1AmtGroupVal1AmountMonetaryDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsTypeI>();
            otherSolutionsValueVal1AmtGroupVal1Amount.getMonetaryDetails().addAll(otherSolutionsValueVal1AmtGroupVal1AmountMonetaryDetails);
            otherSolutionsValueVal1AmtGroupVal1.setAmount(otherSolutionsValueVal1AmtGroupVal1Amount);
            otherSolutionsValueVal1AmtGroup.add(otherSolutionsValueVal1AmtGroupVal1);
            otherSolutionsValueVal1.getAmtGroup().addAll(otherSolutionsValueVal1AmtGroup);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions.PsgInfo> otherSolutionsValueVal1PsgInfo = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions.PsgInfo>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions.PsgInfo otherSolutionsValueVal1PsgInfoVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OtherSolutions.PsgInfo();
            com.amadeus.xml.fmptbr_14_2_1a.SegmentRepetitionControlTypeI otherSolutionsValueVal1PsgInfoVal1Ref = new com.amadeus.xml.fmptbr_14_2_1a.SegmentRepetitionControlTypeI();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.SegmentRepetitionControlDetailsTypeI> otherSolutionsValueVal1PsgInfoVal1RefSegmentControlDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.SegmentRepetitionControlDetailsTypeI>();
            otherSolutionsValueVal1PsgInfoVal1Ref.getSegmentControlDetails().addAll(otherSolutionsValueVal1PsgInfoVal1RefSegmentControlDetails);
            otherSolutionsValueVal1PsgInfoVal1.setRef(otherSolutionsValueVal1PsgInfoVal1Ref);
            com.amadeus.xml.fmptbr_14_2_1a.FareInformationTypeI otherSolutionsValueVal1PsgInfoVal1Description = new com.amadeus.xml.fmptbr_14_2_1a.FareInformationTypeI();
            otherSolutionsValueVal1PsgInfoVal1Description.setValueQualifier("ValueQualifier-515388554");
            otherSolutionsValueVal1PsgInfoVal1Description.setValue(new java.math.BigInteger("-66687836443010821334349091043010485633"));
            otherSolutionsValueVal1PsgInfoVal1.setDescription(otherSolutionsValueVal1PsgInfoVal1Description);
            com.amadeus.xml.fmptbr_14_2_1a.FrequentTravellerIdentificationCodeType otherSolutionsValueVal1PsgInfoVal1FreqTraveller = new com.amadeus.xml.fmptbr_14_2_1a.FrequentTravellerIdentificationCodeType();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FrequentTravellerIdentificationType> otherSolutionsValueVal1PsgInfoVal1FreqTravellerFrequentTravellerDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FrequentTravellerIdentificationType>();
            otherSolutionsValueVal1PsgInfoVal1FreqTraveller.getFrequentTravellerDetails().addAll(otherSolutionsValueVal1PsgInfoVal1FreqTravellerFrequentTravellerDetails);
            otherSolutionsValueVal1PsgInfoVal1.setFreqTraveller(otherSolutionsValueVal1PsgInfoVal1FreqTraveller);
            com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationTypeI otherSolutionsValueVal1PsgInfoVal1Amount = new com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationTypeI();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsTypeI> otherSolutionsValueVal1PsgInfoVal1AmountMonetaryDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.MonetaryInformationDetailsTypeI>();
            otherSolutionsValueVal1PsgInfoVal1Amount.getMonetaryDetails().addAll(otherSolutionsValueVal1PsgInfoVal1AmountMonetaryDetails);
            otherSolutionsValueVal1PsgInfoVal1.setAmount(otherSolutionsValueVal1PsgInfoVal1Amount);
            com.amadeus.xml.fmptbr_14_2_1a.FlightProductInformationType161491S otherSolutionsValueVal1PsgInfoVal1Fare = new com.amadeus.xml.fmptbr_14_2_1a.FlightProductInformationType161491S();
            com.amadeus.xml.fmptbr_14_2_1a.CabinProductDetailsType229142C otherSolutionsValueVal1PsgInfoVal1FareCabinProduct = new com.amadeus.xml.fmptbr_14_2_1a.CabinProductDetailsType229142C();
            otherSolutionsValueVal1PsgInfoVal1FareCabinProduct.setRbd("Rbd-356366928");
            otherSolutionsValueVal1PsgInfoVal1FareCabinProduct.setCabin("Cabin-60275299");
            otherSolutionsValueVal1PsgInfoVal1FareCabinProduct.setAvlStatus("AvlStatus-758902935");
            otherSolutionsValueVal1PsgInfoVal1Fare.setCabinProduct(otherSolutionsValueVal1PsgInfoVal1FareCabinProduct);
            com.amadeus.xml.fmptbr_14_2_1a.FareProductDetailsType otherSolutionsValueVal1PsgInfoVal1FareFareProductDetail = new com.amadeus.xml.fmptbr_14_2_1a.FareProductDetailsType();
            otherSolutionsValueVal1PsgInfoVal1FareFareProductDetail.setFareBasis("FareBasis1228579010");
            otherSolutionsValueVal1PsgInfoVal1Fare.setFareProductDetail(otherSolutionsValueVal1PsgInfoVal1FareFareProductDetail);
            otherSolutionsValueVal1PsgInfoVal1.setFare(otherSolutionsValueVal1PsgInfoVal1Fare);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.AttributeTypeU> otherSolutionsValueVal1PsgInfoVal1Attribute = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.AttributeTypeU>();
            otherSolutionsValueVal1PsgInfoVal1.getAttribute().addAll(otherSolutionsValueVal1PsgInfoVal1Attribute);
            otherSolutionsValueVal1PsgInfo.add(otherSolutionsValueVal1PsgInfoVal1);
            otherSolutionsValueVal1.getPsgInfo().addAll(otherSolutionsValueVal1PsgInfo);
            otherSolutionsValue.add(otherSolutionsValueVal1);
            otherSolutions.value = otherSolutionsValue;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.WarningInfo> warningInfoValue = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.WarningInfo>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.WarningInfo warningInfoValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.WarningInfo();
            com.amadeus.xml.fmptbr_14_2_1a.DummySegmentTypeI warningInfoValueVal1GlobalMessageMarker = new com.amadeus.xml.fmptbr_14_2_1a.DummySegmentTypeI();
            warningInfoValueVal1.setGlobalMessageMarker(warningInfoValueVal1GlobalMessageMarker);
            com.amadeus.xml.fmptbr_14_2_1a.InteractiveFreeTextType78534S warningInfoValueVal1GlobalMessage = new com.amadeus.xml.fmptbr_14_2_1a.InteractiveFreeTextType78534S();
            com.amadeus.xml.fmptbr_14_2_1a.FreeTextQualificationType warningInfoValueVal1GlobalMessageFreeTextQualification = new com.amadeus.xml.fmptbr_14_2_1a.FreeTextQualificationType();
            warningInfoValueVal1GlobalMessageFreeTextQualification.setTextSubjectQualifier("TextSubjectQualifier1768843881");
            warningInfoValueVal1GlobalMessageFreeTextQualification.setInformationType("InformationType2014754320");
            warningInfoValueVal1GlobalMessage.setFreeTextQualification(warningInfoValueVal1GlobalMessageFreeTextQualification);
            java.util.List<java.lang.String> warningInfoValueVal1GlobalMessageDescription = new java.util.ArrayList<java.lang.String>();
            warningInfoValueVal1GlobalMessage.getDescription().addAll(warningInfoValueVal1GlobalMessageDescription);
            warningInfoValueVal1.setGlobalMessage(warningInfoValueVal1GlobalMessage);
            warningInfoValue.add(warningInfoValueVal1);
            warningInfo.value = warningInfoValue;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.GlobalInformation> globalInformationValue = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.GlobalInformation>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.GlobalInformation globalInformationValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.GlobalInformation();
            com.amadeus.xml.fmptbr_14_2_1a.CodedAttributeType globalInformationValueVal1Attributes = new com.amadeus.xml.fmptbr_14_2_1a.CodedAttributeType();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.CodedAttributeInformationType> globalInformationValueVal1AttributesAttributeDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.CodedAttributeInformationType>();
            globalInformationValueVal1Attributes.getAttributeDetails().addAll(globalInformationValueVal1AttributesAttributeDetails);
            globalInformationValueVal1.setAttributes(globalInformationValueVal1Attributes);
            globalInformationValue.add(globalInformationValueVal1);
            globalInformation.value = globalInformationValue;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp> serviceFeesGrpValue = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp serviceFeesGrpValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp();
            com.amadeus.xml.fmptbr_14_2_1a.SelectionDetailsType serviceFeesGrpValueVal1ServiceTypeInfo = new com.amadeus.xml.fmptbr_14_2_1a.SelectionDetailsType();
            com.amadeus.xml.fmptbr_14_2_1a.SelectionDetailsInformationType serviceFeesGrpValueVal1ServiceTypeInfoCarrierFeeDetails = new com.amadeus.xml.fmptbr_14_2_1a.SelectionDetailsInformationType();
            serviceFeesGrpValueVal1ServiceTypeInfoCarrierFeeDetails.setType("Type-1403101499");
            serviceFeesGrpValueVal1ServiceTypeInfoCarrierFeeDetails.setOptionInformation("OptionInformation1691690325");
            serviceFeesGrpValueVal1ServiceTypeInfo.setCarrierFeeDetails(serviceFeesGrpValueVal1ServiceTypeInfoCarrierFeeDetails);
            serviceFeesGrpValueVal1.setServiceTypeInfo(serviceFeesGrpValueVal1ServiceTypeInfo);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeRefGrp> serviceFeesGrpValueVal1ServiceFeeRefGrp = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeRefGrp>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeRefGrp serviceFeesGrpValueVal1ServiceFeeRefGrpVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeRefGrp();
            com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType serviceFeesGrpValueVal1ServiceFeeRefGrpVal1RefInfo = new com.amadeus.xml.fmptbr_14_2_1a.ReferenceInfoType();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType191583C> serviceFeesGrpValueVal1ServiceFeeRefGrpVal1RefInfoReferencingDetail = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ReferencingDetailsType191583C>();
            serviceFeesGrpValueVal1ServiceFeeRefGrpVal1RefInfo.getReferencingDetail().addAll(serviceFeesGrpValueVal1ServiceFeeRefGrpVal1RefInfoReferencingDetail);
            serviceFeesGrpValueVal1ServiceFeeRefGrpVal1.setRefInfo(serviceFeesGrpValueVal1ServiceFeeRefGrpVal1RefInfo);
            serviceFeesGrpValueVal1ServiceFeeRefGrp.add(serviceFeesGrpValueVal1ServiceFeeRefGrpVal1);
            serviceFeesGrpValueVal1.getServiceFeeRefGrp().addAll(serviceFeesGrpValueVal1ServiceFeeRefGrp);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp> serviceFeesGrpValueVal1ServiceCoverageInfoGrp = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp();
            com.amadeus.xml.fmptbr_14_2_1a.ItemNumberType serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1ItemNumberInfo = new com.amadeus.xml.fmptbr_14_2_1a.ItemNumberType();
            com.amadeus.xml.fmptbr_14_2_1a.ItemNumberIdentificationType192331C serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1ItemNumberInfoItemNumber = new com.amadeus.xml.fmptbr_14_2_1a.ItemNumberIdentificationType192331C();
            serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1ItemNumberInfoItemNumber.setNumber("Number2136622247");
            serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1ItemNumberInfoItemNumber.setType("Type-599066803");
            serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1ItemNumberInfoItemNumber.setQualifier("Qualifier-1284073178");
            serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1ItemNumberInfoItemNumber.setResponsibleAgency("ResponsibleAgency574817273");
            serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1ItemNumberInfo.setItemNumber(serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1ItemNumberInfoItemNumber);
            serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1.setItemNumberInfo(serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1ItemNumberInfo);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp.ServiceCovInfoGrp> serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1ServiceCovInfoGrp = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceCoverageInfoGrp.ServiceCovInfoGrp>();
            serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1.getServiceCovInfoGrp().addAll(serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1ServiceCovInfoGrp);
            serviceFeesGrpValueVal1ServiceCoverageInfoGrp.add(serviceFeesGrpValueVal1ServiceCoverageInfoGrpVal1);
            serviceFeesGrpValueVal1.getServiceCoverageInfoGrp().addAll(serviceFeesGrpValueVal1ServiceCoverageInfoGrp);
            com.amadeus.xml.fmptbr_14_2_1a.DummySegmentTypeI serviceFeesGrpValueVal1GlobalMessageMarker = new com.amadeus.xml.fmptbr_14_2_1a.DummySegmentTypeI();
            serviceFeesGrpValueVal1.setGlobalMessageMarker(serviceFeesGrpValueVal1GlobalMessageMarker);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp> serviceFeesGrpValueVal1ServiceFeeInfoGrp = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp();
            com.amadeus.xml.fmptbr_14_2_1a.ItemNumberType serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1ItemNumberInfo = new com.amadeus.xml.fmptbr_14_2_1a.ItemNumberType();
            com.amadeus.xml.fmptbr_14_2_1a.ItemNumberIdentificationType192331C serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1ItemNumberInfoItemNumber = new com.amadeus.xml.fmptbr_14_2_1a.ItemNumberIdentificationType192331C();
            serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1ItemNumberInfoItemNumber.setNumber("Number2024649150");
            serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1ItemNumberInfoItemNumber.setType("Type1417962298");
            serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1ItemNumberInfoItemNumber.setQualifier("Qualifier1999057789");
            serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1ItemNumberInfoItemNumber.setResponsibleAgency("ResponsibleAgency-2030527469");
            serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1ItemNumberInfo.setItemNumber(serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1ItemNumberInfoItemNumber);
            serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1.setItemNumberInfo(serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1ItemNumberInfo);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp> serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1ServiceDetailsGrp = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceFeeInfoGrp.ServiceDetailsGrp>();
            serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1.getServiceDetailsGrp().addAll(serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1ServiceDetailsGrp);
            serviceFeesGrpValueVal1ServiceFeeInfoGrp.add(serviceFeesGrpValueVal1ServiceFeeInfoGrpVal1);
            serviceFeesGrpValueVal1.getServiceFeeInfoGrp().addAll(serviceFeesGrpValueVal1ServiceFeeInfoGrp);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp> serviceFeesGrpValueVal1ServiceDetailsGrp = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp serviceFeesGrpValueVal1ServiceDetailsGrpVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp();
            com.amadeus.xml.fmptbr_14_2_1a.SpecificDataInformationType serviceFeesGrpValueVal1ServiceDetailsGrpVal1ServiceOptionInfo = new com.amadeus.xml.fmptbr_14_2_1a.SpecificDataInformationType();
            com.amadeus.xml.fmptbr_14_2_1a.DataTypeInformationType serviceFeesGrpValueVal1ServiceDetailsGrpVal1ServiceOptionInfoDataTypeInformation = new com.amadeus.xml.fmptbr_14_2_1a.DataTypeInformationType();
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1ServiceOptionInfoDataTypeInformation.setSubType("SubType-1843687903");
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1ServiceOptionInfoDataTypeInformation.setOption("Option1588175167");
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1ServiceOptionInfo.setDataTypeInformation(serviceFeesGrpValueVal1ServiceDetailsGrpVal1ServiceOptionInfoDataTypeInformation);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.DataInformationType> serviceFeesGrpValueVal1ServiceDetailsGrpVal1ServiceOptionInfoDataInformation = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.DataInformationType>();
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1ServiceOptionInfo.getDataInformation().addAll(serviceFeesGrpValueVal1ServiceDetailsGrpVal1ServiceOptionInfoDataInformation);
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1.setServiceOptionInfo(serviceFeesGrpValueVal1ServiceDetailsGrpVal1ServiceOptionInfo);
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp.FeeDescriptionGrp serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrp = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.ServiceDetailsGrp.FeeDescriptionGrp();
            com.amadeus.xml.fmptbr_14_2_1a.ItemNumberType80866S serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpItemNumberInfo = new com.amadeus.xml.fmptbr_14_2_1a.ItemNumberType80866S();
            com.amadeus.xml.fmptbr_14_2_1a.ItemNumberIdentificationType serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpItemNumberInfoItemNumberDetails = new com.amadeus.xml.fmptbr_14_2_1a.ItemNumberIdentificationType();
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpItemNumberInfoItemNumberDetails.setNumber("Number331131056");
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpItemNumberInfoItemNumberDetails.setType("Type329788920");
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpItemNumberInfoItemNumberDetails.setQualifier("Qualifier-1827750820");
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpItemNumberInfoItemNumberDetails.setResponsibleAgency("ResponsibleAgency-446442452");
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpItemNumberInfo.setItemNumberDetails(serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpItemNumberInfoItemNumberDetails);
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrp.setItemNumberInfo(serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpItemNumberInfo);
            com.amadeus.xml.fmptbr_14_2_1a.AttributeType serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceAttributesInfo = new com.amadeus.xml.fmptbr_14_2_1a.AttributeType();
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceAttributesInfo.setAttributeQualifier("AttributeQualifier1559419822");
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.AttributeInformationType97181C> serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceAttributesInfoAttributeDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.AttributeInformationType97181C>();
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceAttributesInfo.getAttributeDetails().addAll(serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceAttributesInfoAttributeDetails);
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrp.setServiceAttributesInfo(serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceAttributesInfo);
            com.amadeus.xml.fmptbr_14_2_1a.SpecialRequirementsDetailsType serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfo = new com.amadeus.xml.fmptbr_14_2_1a.SpecialRequirementsDetailsType();
            com.amadeus.xml.fmptbr_14_2_1a.SpecialRequirementsTypeDetailsType serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoServiceRequirementsInfo = new com.amadeus.xml.fmptbr_14_2_1a.SpecialRequirementsTypeDetailsType();
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoServiceRequirementsInfo.setServiceClassification("ServiceClassification-1460497045");
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoServiceRequirementsInfo.setServiceStatus("ServiceStatus1579951943");
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoServiceRequirementsInfo.setServiceNumberOfInstances(new java.math.BigInteger("-53760991068507323505257204466113432712"));
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoServiceRequirementsInfo.setServiceMarketingCarrier("ServiceMarketingCarrier-1030104050");
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoServiceRequirementsInfo.setServiceGroup("ServiceGroup-1264399316");
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoServiceRequirementsInfo.setServiceSubGroup("ServiceSubGroup1835613715");
            java.util.List<java.lang.String> serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoServiceRequirementsInfoServiceFreeText = new java.util.ArrayList<java.lang.String>();
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoServiceRequirementsInfo.getServiceFreeText().addAll(serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoServiceRequirementsInfoServiceFreeText);
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfo.setServiceRequirementsInfo(serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoServiceRequirementsInfo);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.SpecialRequirementsDataDetailsType> serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoSeatDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.SpecialRequirementsDataDetailsType>();
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfo.getSeatDetails().addAll(serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfoSeatDetails);
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrp.setServiceDescriptionInfo(serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpServiceDescriptionInfo);
            com.amadeus.xml.fmptbr_14_2_1a.InteractiveFreeTextType serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpCommercialName = new com.amadeus.xml.fmptbr_14_2_1a.InteractiveFreeTextType();
            com.amadeus.xml.fmptbr_14_2_1a.FreeTextQualificationTypeI serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpCommercialNameFreeTextQualification = new com.amadeus.xml.fmptbr_14_2_1a.FreeTextQualificationTypeI();
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpCommercialNameFreeTextQualification.setTextSubjectQualifier("TextSubjectQualifier1496404985");
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpCommercialName.setFreeTextQualification(serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpCommercialNameFreeTextQualification);
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpCommercialName.setFreeText("FreeText852378661");
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrp.setCommercialName(serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrpCommercialName);
            serviceFeesGrpValueVal1ServiceDetailsGrpVal1.setFeeDescriptionGrp(serviceFeesGrpValueVal1ServiceDetailsGrpVal1FeeDescriptionGrp);
            serviceFeesGrpValueVal1ServiceDetailsGrp.add(serviceFeesGrpValueVal1ServiceDetailsGrpVal1);
            serviceFeesGrpValueVal1.getServiceDetailsGrp().addAll(serviceFeesGrpValueVal1ServiceDetailsGrp);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.FreeBagAllowanceGrp> serviceFeesGrpValueVal1FreeBagAllowanceGrp = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.FreeBagAllowanceGrp>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.FreeBagAllowanceGrp serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.ServiceFeesGrp.FreeBagAllowanceGrp();
            com.amadeus.xml.fmptbr_14_2_1a.ExcessBaggageType serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1FreeBagAllownceInfo = new com.amadeus.xml.fmptbr_14_2_1a.ExcessBaggageType();
            com.amadeus.xml.fmptbr_14_2_1a.BaggageDetailsType serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1FreeBagAllownceInfoBaggageDetails = new com.amadeus.xml.fmptbr_14_2_1a.BaggageDetailsType();
            serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1FreeBagAllownceInfoBaggageDetails.setFreeAllowance(new java.math.BigInteger("-4125764277535943331481483916904218899"));
            serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1FreeBagAllownceInfoBaggageDetails.setQuantityCode("QuantityCode1243079394");
            serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1FreeBagAllownceInfoBaggageDetails.setUnitQualifier("UnitQualifier-157648829");
            serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1FreeBagAllownceInfo.setBaggageDetails(serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1FreeBagAllownceInfoBaggageDetails);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.BagtagDetailsType> serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1FreeBagAllownceInfoBagTagDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.BagtagDetailsType>();
            serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1FreeBagAllownceInfo.getBagTagDetails().addAll(serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1FreeBagAllownceInfoBagTagDetails);
            serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1.setFreeBagAllownceInfo(serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1FreeBagAllownceInfo);
            com.amadeus.xml.fmptbr_14_2_1a.ItemNumberType166130S serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1ItemNumberInfo = new com.amadeus.xml.fmptbr_14_2_1a.ItemNumberType166130S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ItemNumberIdentificationType234878C> serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1ItemNumberInfoItemNumberDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ItemNumberIdentificationType234878C>();
            serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1ItemNumberInfo.getItemNumberDetails().addAll(serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1ItemNumberInfoItemNumberDetails);
            serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1.setItemNumberInfo(serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1ItemNumberInfo);
            serviceFeesGrpValueVal1FreeBagAllowanceGrp.add(serviceFeesGrpValueVal1FreeBagAllowanceGrpVal1);
            serviceFeesGrpValueVal1.getFreeBagAllowanceGrp().addAll(serviceFeesGrpValueVal1FreeBagAllowanceGrp);
            serviceFeesGrpValue.add(serviceFeesGrpValueVal1);
            serviceFeesGrp.value = serviceFeesGrpValue;
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ValueSearchCriteriaType> valueValue = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ValueSearchCriteriaType>();
            com.amadeus.xml.fmptbr_14_2_1a.ValueSearchCriteriaType valueValueVal1 = new com.amadeus.xml.fmptbr_14_2_1a.ValueSearchCriteriaType();
            valueValueVal1.setRef("Ref1731017032");
            valueValueVal1.setValue("Value1292610386");
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.CriteriaiDetaislType> valueValueVal1CriteriaDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.CriteriaiDetaislType>();
            com.amadeus.xml.fmptbr_14_2_1a.CriteriaiDetaislType valueValueVal1CriteriaDetailsVal1 = new com.amadeus.xml.fmptbr_14_2_1a.CriteriaiDetaislType();
            valueValueVal1CriteriaDetailsVal1.setType("Type-876267756");
            valueValueVal1CriteriaDetailsVal1.setValue("Value1248678881");
            valueValueVal1CriteriaDetails.add(valueValueVal1CriteriaDetailsVal1);
            valueValueVal1.getCriteriaDetails().addAll(valueValueVal1CriteriaDetails);
            valueValue.add(valueValueVal1);
            value.value = valueValue;
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.MnrGrp mnrGrpValue = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.MnrGrp();
            com.amadeus.xml.fmptbr_14_2_1a.MiniRulesType mnrGrpValueMnr = new com.amadeus.xml.fmptbr_14_2_1a.MiniRulesType();
            mnrGrpValueMnr.setCategory("Category733488191");
            mnrGrpValue.setMnr(mnrGrpValueMnr);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails> mnrGrpValueMnrDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails>();
            com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails mnrGrpValueMnrDetailsVal1 = new com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails();
            com.amadeus.xml.fmptbr_14_2_1a.ItemNumberType176648S mnrGrpValueMnrDetailsVal1MnrRef = new com.amadeus.xml.fmptbr_14_2_1a.ItemNumberType176648S();
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.ItemNumberIdentificationType248537C> mnrGrpValueMnrDetailsVal1MnrRefItemNumberDetails = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.ItemNumberIdentificationType248537C>();
            mnrGrpValueMnrDetailsVal1MnrRef.getItemNumberDetails().addAll(mnrGrpValueMnrDetailsVal1MnrRefItemNumberDetails);
            mnrGrpValueMnrDetailsVal1.setMnrRef(mnrGrpValueMnrDetailsVal1MnrRef);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.DateAndTimeInformationType182345S> mnrGrpValueMnrDetailsVal1DateInfo = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.DateAndTimeInformationType182345S>();
            mnrGrpValueMnrDetailsVal1.getDateInfo().addAll(mnrGrpValueMnrDetailsVal1DateInfo);
            java.util.List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails.CatGrp> mnrGrpValueMnrDetailsVal1CatGrp = new java.util.ArrayList<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.MnrGrp.MnrDetails.CatGrp>();
            mnrGrpValueMnrDetailsVal1.getCatGrp().addAll(mnrGrpValueMnrDetailsVal1CatGrp);
            mnrGrpValueMnrDetails.add(mnrGrpValueMnrDetailsVal1);
            mnrGrpValue.getMnrDetails().addAll(mnrGrpValueMnrDetails);
            mnrGrp.value = mnrGrpValue;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

	@Override
	public void airRetrieveSeatMap(TravelProductInformationTypeI travelProductIdent, SeatRequestParametersTypeI seatRequestParameters, RelatedProductInformationTypeI productInformation, FrequentTravellerInformationTypeI frequentTravelerInfo, ReservationControlInformationTypeI resControlInfo,
			EquipmentInfoTypeI equipmentInformation, AdditionalBusinessSourceInformationTypeI additionalInfo, ConversionRateTypeI conversionRate, List<Traveler> traveler, Holder<ResponseAnalysisDetailsTypeI> responseDetails, Holder<ErrorInformationTypeI> errorInformation,
			Holder<WarningInformationTypeI> warningInformation, Holder<com.amadeus.xml.smpres_13_1_ia.SeatRequestParametersTypeI> seatRequestParameters0, Holder<List<SeatmapInformation>> seatmapInformation, Holder<Session> session, Holder<TransactionFlowLinkType> link, AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void airSellFromRecommendation(MessageActionDetailsTypeI messageActionDetails, com.amadeus.xml.itareq_05_2_ia.ReservationControlInformationTypeI recordLocator, List<ItineraryDetails> itineraryDetails, Holder<com.amadeus.xml.itares_05_2_ia.MessageActionDetailsTypeI> message,
			Holder<List<ErrorAtMessageLevel>> errorAtMessageLevel, Holder<List<com.amadeus.xml.itares_05_2_ia.AirSellFromRecommendationReply.ItineraryDetails>> itineraryDetails0, Holder<Session> session, Holder<TransactionFlowLinkType> link, AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void docIssuanceIssueTicket(TicketAgentInfoTypeI agentInfo, StructuredDateTimeInformationType overrideDate, List<ReferenceInfoType> selection, List<ReferenceInformationType> paxSelection, StockInformationType stock, List<OptionGroup> optionGroup,
			TravellerInformationType infantOrAdultAssociation, List<CodedAttributeType> otherCompoundOptions, Holder<ResponseAnalysisDetailsType> processingStatus, Holder<ErrorGroupType> errorGroup, Holder<Session> session, Holder<TransactionFlowLinkType> link, AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fareCheckRules(MsgType msgType, AvailcabinStatus availcabinStatus, ConversionRate conversionRate, PricingTickInfo pricingTickInfo, MultiCorporate multiCorporate, ItemNumber itemNumber, DateOfFlight dateOfFlight, List<FlightQualification> flightQualification,
			List<TransportInformation> transportInformation, List<TripDescription> tripDescription, List<PricingInfo> pricingInfo, FareRule fareRule, Holder<TransactionType> transactionType, Holder<StatusInfo> statusInfo, Holder<FareRouteInfo> fareRouteInfo, Holder<List<InfoText>> infoText,
			Holder<ErrorInfo> errorInfo, Holder<List<TariffInfo>> tariffInfo, Holder<List<FlightDetails>> flightDetails, Holder<Session> session, Holder<TransactionFlowLinkType> link, AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fareInformativePricingWithoutPNR(com.amadeus.xml.tipnrq_12_4_1a.MessageActionDetailsTypeI messageDetails, OriginatorGroup originatorGroup, com.amadeus.xml.tipnrq_12_4_1a.ConversionRateTypeI currencyOverride, CorporateFareInformationType corporateFares, TaxExemptGroup taxExemptGroup,
			FormOfPaymentTypeI generalFormOfPayment, List<PassengersGroup> passengersGroup, List<PricingOptionsGroup> pricingOptionsGroup, MonetaryInformationType instantPricingOption, TripsGroup tripsGroup, ObFeeRequestGroup obFeeRequestGroup,
			Holder<com.amadeus.xml.tipnrr_12_4_1a.MessageActionDetailsTypeI> messageDetails0, Holder<com.amadeus.xml.tipnrr_12_4_1a.ErrorGroupType> errorGroup, Holder<MainGroup> mainGroup, Holder<Session> session, Holder<TransactionFlowLinkType> link, AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fareMasterPricerTravelBoardSearch(NumberOfUnitsType numberOfUnit, AttributeType globalOptions, List<TravellerReferenceInformationType> paxReference, ConsumerReferenceInformationType customerRef, List<FOPRepresentationType> formOfPaymentByPassenger,
			List<FareInformationType> solutionFamily, List<GroupPassengerDetailsType> passengerInfoGrp, List<FareFamilies> fareFamilies, FareOptions fareOptions, com.amadeus.xml.fmptbq_14_2_1a.MonetaryInformationType priceToBeat, List<TaxType> taxInfo,
			TravelFlightInformationType165052S travelFlightInfo, List<ValueSearchCriteriaType> valueSearch, List<Itinerary> itinerary, TicketChangeInfo ticketChangeInfo, List<CombinationFareFamilies> combinationFareFamilies, List<FeeOption> feeOption, List<OfficeIdDetails> officeIdDetails,
			Holder<StatusType> replyStatus, Holder<ErrorMessage> errorMessage, Holder<com.amadeus.xml.fmptbr_14_2_1a.ConversionRateTypeI> conversionRate, Holder<List<com.amadeus.xml.fmptbr_14_2_1a.FareInformationType>> solutionFamily0, Holder<List<FareFamilyType>> familyInformation,
			Holder<AmountInfoForAllPax> amountInfoForAllPax, Holder<List<AmountInfoPerPax>> amountInfoPerPax, Holder<List<FeeDetails>> feeDetails, Holder<List<CompanyIdentificationTextType>> companyIdText,
			Holder<List<com.amadeus.xml.fmptbr_14_2_1a.FareMasterPricerTravelBoardSearchReply.OfficeIdDetails>> officeIdDetails0, Holder<List<FlightIndex>> flightIndex, Holder<List<Recommendation>> recommendation, Holder<List<OtherSolutions>> otherSolutions, Holder<List<WarningInfo>> warningInfo,
			Holder<List<GlobalInformation>> globalInformation, Holder<List<ServiceFeesGrp>> serviceFeesGrp, Holder<List<com.amadeus.xml.fmptbr_14_2_1a.ValueSearchCriteriaType>> value, Holder<MnrGrp> mnrGrp, Holder<Session> session, Holder<TransactionFlowLinkType> link, AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void farePricePNRWithBookingClass(com.amadeus.xml.tpcbrq_12_4_1a.ReservationControlInformationTypeI pnrLocatorData, ReferenceInformationTypeI94605S paxSegReference, com.amadeus.xml.tpcbrq_12_4_1a.CodedAttributeType overrideInformation,
			com.amadeus.xml.tpcbrq_12_4_1a.StructuredDateTimeInformationType dateOverride, TransportIdentifierType validatingCarrier, PointOfSaleInformationTypeU cityOverride, com.amadeus.xml.tpcbrq_12_4_1a.ConversionRateTypeI currencyOverride, List<DutyTaxFeeDetailsTypeU> taxDetails,
			List<DiscountInformation> discountInformation, List<PricingFareBase> pricingFareBase, List<FlightInformation> flightInformation, List<OpenSegmentsInformation> openSegmentsInformation, List<BookingClassSelection> bookingClassSelection, FopInformation fopInformation,
			CommercialAgreementsTypeI carrierAgreements, List<FrequentFlyerInformation> frequentFlyerInformation, com.amadeus.xml.tpcbrq_12_4_1a.MonetaryInformationType instantPricingOption, Holder<com.amadeus.xml.tpcbrr_12_4_1a.ErrorGroupType> applicationError,
			Holder<com.amadeus.xml.tpcbrr_12_4_1a.ReservationControlInformationTypeI> pnrLocatorData0, Holder<List<FareList>> fareList, Holder<Session> session, Holder<TransactionFlowLinkType> link, AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pnrAddMultiElements(com.amadeus.xml.pnradd_14_1_1a.ReservationControlInformationTypeI reservationInfo, OptionalPNRActionsType pnrActions, List<TravellerInfo> travellerInfo, List<OriginDestinationDetails> originDestinationDetails, DataElementsMaster dataElementsMaster,
			Holder<List<PnrHeader>> pnrHeader, Holder<ReservationSecurityInformationType156156S> securityInformation, Holder<QueueType> queueInformations, Holder<NumberOfUnitsTypeI> numberOfUnits, Holder<List<GeneralErrorInfo>> generalErrorInfo,
			Holder<com.amadeus.xml.pnracc_14_1_1a.CodedAttributeType> pnrType, Holder<List<LongFreeTextType>> freetextData, Holder<StatusType178422S> pnrHeaderTag, Holder<List<InteractiveFreeTextTypeI132924S>> freeFormText, Holder<List<PnrHistoryDataType>> historyData,
			Holder<POSGroupType> sbrPOSDetails, Holder<POSGroupType> sbrCreationPosDetails, Holder<POSGroupType> sbrUpdatorPosDetails, Holder<TechnicalData> technicalData, Holder<List<com.amadeus.xml.pnracc_14_1_1a.PNRReply.TravellerInfo>> travellerInfo0,
			Holder<List<com.amadeus.xml.pnracc_14_1_1a.PNRReply.OriginDestinationDetails>> originDestinationDetails0, Holder<List<SegmentGroupingInformationType>> segmentGroupingInfo, Holder<com.amadeus.xml.pnracc_14_1_1a.PNRReply.DataElementsMaster> dataElementsMaster0,
			Holder<List<TstData>> tstData, Holder<PricingRecordGroup> pricingRecordGroup, Holder<DcsData> dcsData, Holder<OfferGroup> offerGroup, Holder<Session> session, Holder<TransactionFlowLinkType> link, AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pnrCancel(ReservationControlInformationType reservationInfo, com.amadeus.xml.pnrxcl_14_1_1a.OptionalPNRActionsType pnrActions, List<CancelPNRElementType> cancelElements, Holder<List<PnrHeader>> pnrHeader, Holder<ReservationSecurityInformationType156156S> securityInformation,
			Holder<QueueType> queueInformations, Holder<NumberOfUnitsTypeI> numberOfUnits, Holder<List<GeneralErrorInfo>> generalErrorInfo, Holder<com.amadeus.xml.pnracc_14_1_1a.CodedAttributeType> pnrType, Holder<List<LongFreeTextType>> freetextData, Holder<StatusType178422S> pnrHeaderTag,
			Holder<List<InteractiveFreeTextTypeI132924S>> freeFormText, Holder<List<PnrHistoryDataType>> historyData, Holder<POSGroupType> sbrPOSDetails, Holder<POSGroupType> sbrCreationPosDetails, Holder<POSGroupType> sbrUpdatorPosDetails, Holder<TechnicalData> technicalData,
			Holder<List<com.amadeus.xml.pnracc_14_1_1a.PNRReply.TravellerInfo>> travellerInfo, Holder<List<com.amadeus.xml.pnracc_14_1_1a.PNRReply.OriginDestinationDetails>> originDestinationDetails, Holder<List<SegmentGroupingInformationType>> segmentGroupingInfo,
			Holder<com.amadeus.xml.pnracc_14_1_1a.PNRReply.DataElementsMaster> dataElementsMaster, Holder<List<TstData>> tstData, Holder<PricingRecordGroup> pricingRecordGroup, Holder<DcsData> dcsData, Holder<OfferGroup> offerGroup, Holder<Session> session, Holder<TransactionFlowLinkType> link,
			AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pnrRetrieve(Settings settings, RetrievalFacts retrievalFacts, Holder<List<PnrHeader>> pnrHeader, Holder<ReservationSecurityInformationType156156S> securityInformation, Holder<QueueType> queueInformations, Holder<NumberOfUnitsTypeI> numberOfUnits,
			Holder<List<GeneralErrorInfo>> generalErrorInfo, Holder<com.amadeus.xml.pnracc_14_1_1a.CodedAttributeType> pnrType, Holder<List<LongFreeTextType>> freetextData, Holder<StatusType178422S> pnrHeaderTag, Holder<List<InteractiveFreeTextTypeI132924S>> freeFormText,
			Holder<List<PnrHistoryDataType>> historyData, Holder<POSGroupType> sbrPOSDetails, Holder<POSGroupType> sbrCreationPosDetails, Holder<POSGroupType> sbrUpdatorPosDetails, Holder<TechnicalData> technicalData,
			Holder<List<com.amadeus.xml.pnracc_14_1_1a.PNRReply.TravellerInfo>> travellerInfo, Holder<List<com.amadeus.xml.pnracc_14_1_1a.PNRReply.OriginDestinationDetails>> originDestinationDetails, Holder<List<SegmentGroupingInformationType>> segmentGroupingInfo,
			Holder<com.amadeus.xml.pnracc_14_1_1a.PNRReply.DataElementsMaster> dataElementsMaster, Holder<List<TstData>> tstData, Holder<PricingRecordGroup> pricingRecordGroup, Holder<DcsData> dcsData, Holder<OfferGroup> offerGroup, Holder<Session> session, Holder<TransactionFlowLinkType> link,
			AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PNRList pnrRetrieve2(PNRRetrieve pnrRetrieve141, Holder<Session> session, Holder<TransactionFlowLinkType> link, AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void pnrSplit(com.amadeus.xml.pnrspl_14_1_1a.ReservationControlInformationType reservationInfo, SplitPNRType splitDetails, Holder<List<PnrHeader>> pnrHeader, Holder<ReservationSecurityInformationType156156S> securityInformation, Holder<QueueType> queueInformations,
			Holder<NumberOfUnitsTypeI> numberOfUnits, Holder<List<GeneralErrorInfo>> generalErrorInfo, Holder<com.amadeus.xml.pnracc_14_1_1a.CodedAttributeType> pnrType, Holder<List<LongFreeTextType>> freetextData, Holder<StatusType178422S> pnrHeaderTag,
			Holder<List<InteractiveFreeTextTypeI132924S>> freeFormText, Holder<List<PnrHistoryDataType>> historyData, Holder<POSGroupType> sbrPOSDetails, Holder<POSGroupType> sbrCreationPosDetails, Holder<POSGroupType> sbrUpdatorPosDetails, Holder<TechnicalData> technicalData,
			Holder<List<com.amadeus.xml.pnracc_14_1_1a.PNRReply.TravellerInfo>> travellerInfo, Holder<List<com.amadeus.xml.pnracc_14_1_1a.PNRReply.OriginDestinationDetails>> originDestinationDetails, Holder<List<SegmentGroupingInformationType>> segmentGroupingInfo,
			Holder<com.amadeus.xml.pnracc_14_1_1a.PNRReply.DataElementsMaster> dataElementsMaster, Holder<List<TstData>> tstData, Holder<PricingRecordGroup> pricingRecordGroup, Holder<DcsData> dcsData, Holder<OfferGroup> offerGroup, Holder<Session> session, Holder<TransactionFlowLinkType> link,
			AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void securitySignOut(ConversationIDType conversationClt, Holder<ErrorSection> errorSection, Holder<com.amadeus.xml.vlssor_04_1_1a.ResponseAnalysisDetailsType> processStatus, Holder<Session> session, Holder<TransactionFlowLinkType> link, AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ticketCreateTSTFromPricing(com.amadeus.xml.tautcq_04_1_1a.ReservationControlInformationTypeI pnrLocatorData, List<PsaList> psaList, Holder<ApplicationError> applicationError, Holder<com.amadeus.xml.tautcr_04_1_1a.ReservationControlInformationTypeI> pnrLocatorData0,
			Holder<List<TstList>> tstList, Holder<Session> session, Holder<TransactionFlowLinkType> link, AMASecurityHostedUser security) {
		// TODO Auto-generated method stub
		
	}

}
