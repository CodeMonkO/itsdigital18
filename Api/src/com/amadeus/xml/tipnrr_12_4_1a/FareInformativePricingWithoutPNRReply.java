
package com.amadeus.xml.tipnrr_12_4_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messageDetails" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MessageActionDetailsTypeI"/>
 *         &lt;element name="errorGroup" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ErrorGroupType" minOccurs="0"/>
 *         &lt;element name="mainGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dummySegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DummySegmentTypeI"/>
 *                   &lt;element name="convertionRate" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ConversionRateTypeI" minOccurs="0"/>
 *                   &lt;element name="generalIndicatorsGroup" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="generalIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="pricingGroupLevelGroup" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numberOfPax" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SegmentRepetitionControlTypeI"/>
 *                             &lt;element name="passengersID" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SpecificTravellerTypeI" maxOccurs="99" minOccurs="0"/>
 *                             &lt;element name="fareInfoGroup">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="emptySegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareInformationTypeI"/>
 *                                       &lt;element name="pricingIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
 *                                       &lt;element name="fareAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationType_157205S" minOccurs="0"/>
 *                                       &lt;element name="textData" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" maxOccurs="99" minOccurs="0"/>
 *                                       &lt;element name="surchargesGroup" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="taxesAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI"/>
 *                                                 &lt;element name="penaltiesAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DiscountAndPenaltyInformationTypeI" minOccurs="0"/>
 *                                                 &lt;element name="pfcAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" maxOccurs="5" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="corporateGroup" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="corporateData" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareCalculationCodeDetailsTypeI"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="negoFareGroup" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="negoFareIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingSubsequentTypeI"/>
 *                                                 &lt;element name="extNegoFareIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
 *                                                 &lt;element name="negoFareAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DiscountAndPenaltyInformationTypeI" minOccurs="0"/>
 *                                                 &lt;element name="negoFareText" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="segmentLevelGroup" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="segmentInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S"/>
 *                                                 &lt;element name="additionalInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
 *                                                 &lt;element name="fareBasis" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
 *                                                 &lt;element name="cabinGroup" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="cabinSegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ProductInformationTypeI"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="baggageAllowance" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ExcessBaggageTypeI" minOccurs="0"/>
 *                                                 &lt;element name="ptcSegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}NumberOfUnitsTypeI" minOccurs="0"/>
 *                                                 &lt;element name="couponInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}QuantityTypeI" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="structuredFareCalcGroup" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="structureFareCalcRoot" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareComponentInformationTypeI"/>
 *                                                 &lt;element name="group27" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="structuredFareCalcG27EQN" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}NumberOfUnitsTypeI"/>
 *                                                           &lt;element name="group28" maxOccurs="99" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="structuredFareCalcG28ITM" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ItemNumberTypeI"/>
 *                                                                     &lt;element name="group29" maxOccurs="99" minOccurs="0">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="structuredFareCalcG28ADT" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ActionDetailsTypeI"/>
 *                                                                               &lt;element name="structuredFareCalcG28TVL" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S" minOccurs="0"/>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                     &lt;element name="structuredFareCalcG28MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
 *                                                                     &lt;element name="structuredFareCalcG28PTS" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/>
 *                                                                     &lt;element name="structuredFareCalcG28FCC" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/>
 *                                                                     &lt;element name="structuredFareCalcG28PTK" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
 *                                                                     &lt;element name="structuredFareCalcG28FRU" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareRulesInformationTypeI" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="dummySegmentGroup27" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DummySegmentTypeI"/>
 *                                                           &lt;element name="structuredFareCalcG27MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
 *                                                           &lt;element name="structuredFareCalcG27TXD" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
 *                                                           &lt;element name="structuredFareCalcG27CVR" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ConversionRateTypeI" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="carrierFeeGroup" maxOccurs="9" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="feeType" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SelectionDetailsTypeI"/>
 *                                                 &lt;element name="feeDetails" maxOccurs="99" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="feeInfo" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SpecificDataInformationTypeI"/>
 *                                                           &lt;element name="feeAmounts" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
 *                                                           &lt;element name="feeTaxes" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
 *                                                           &lt;element name="feeDescription" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="fareComponentDetailsGroup" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareComponentDetailsType" maxOccurs="99" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageDetails",
    "errorGroup",
    "mainGroup"
})
@XmlRootElement(name = "Fare_InformativePricingWithoutPNRReply")
public class FareInformativePricingWithoutPNRReply {

    @XmlElement(required = true)
    protected MessageActionDetailsTypeI messageDetails;
    protected ErrorGroupType errorGroup;
    protected FareInformativePricingWithoutPNRReply.MainGroup mainGroup;

    /**
     * Gets the value of the messageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MessageActionDetailsTypeI }
     *     
     */
    public MessageActionDetailsTypeI getMessageDetails() {
        return messageDetails;
    }

    /**
     * Sets the value of the messageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageActionDetailsTypeI }
     *     
     */
    public void setMessageDetails(MessageActionDetailsTypeI value) {
        this.messageDetails = value;
    }

    /**
     * Gets the value of the errorGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorGroupType }
     *     
     */
    public ErrorGroupType getErrorGroup() {
        return errorGroup;
    }

    /**
     * Sets the value of the errorGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorGroupType }
     *     
     */
    public void setErrorGroup(ErrorGroupType value) {
        this.errorGroup = value;
    }

    /**
     * Gets the value of the mainGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FareInformativePricingWithoutPNRReply.MainGroup }
     *     
     */
    public FareInformativePricingWithoutPNRReply.MainGroup getMainGroup() {
        return mainGroup;
    }

    /**
     * Sets the value of the mainGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInformativePricingWithoutPNRReply.MainGroup }
     *     
     */
    public void setMainGroup(FareInformativePricingWithoutPNRReply.MainGroup value) {
        this.mainGroup = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="dummySegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DummySegmentTypeI"/>
     *         &lt;element name="convertionRate" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ConversionRateTypeI" minOccurs="0"/>
     *         &lt;element name="generalIndicatorsGroup" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="generalIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="pricingGroupLevelGroup" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="numberOfPax" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SegmentRepetitionControlTypeI"/>
     *                   &lt;element name="passengersID" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SpecificTravellerTypeI" maxOccurs="99" minOccurs="0"/>
     *                   &lt;element name="fareInfoGroup">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="emptySegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareInformationTypeI"/>
     *                             &lt;element name="pricingIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
     *                             &lt;element name="fareAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationType_157205S" minOccurs="0"/>
     *                             &lt;element name="textData" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" maxOccurs="99" minOccurs="0"/>
     *                             &lt;element name="surchargesGroup" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="taxesAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI"/>
     *                                       &lt;element name="penaltiesAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DiscountAndPenaltyInformationTypeI" minOccurs="0"/>
     *                                       &lt;element name="pfcAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" maxOccurs="5" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="corporateGroup" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="corporateData" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareCalculationCodeDetailsTypeI"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="negoFareGroup" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="negoFareIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingSubsequentTypeI"/>
     *                                       &lt;element name="extNegoFareIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
     *                                       &lt;element name="negoFareAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DiscountAndPenaltyInformationTypeI" minOccurs="0"/>
     *                                       &lt;element name="negoFareText" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="segmentLevelGroup" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="segmentInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S"/>
     *                                       &lt;element name="additionalInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
     *                                       &lt;element name="fareBasis" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
     *                                       &lt;element name="cabinGroup" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="cabinSegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ProductInformationTypeI"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="baggageAllowance" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ExcessBaggageTypeI" minOccurs="0"/>
     *                                       &lt;element name="ptcSegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}NumberOfUnitsTypeI" minOccurs="0"/>
     *                                       &lt;element name="couponInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}QuantityTypeI" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="structuredFareCalcGroup" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="structureFareCalcRoot" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareComponentInformationTypeI"/>
     *                                       &lt;element name="group27" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="structuredFareCalcG27EQN" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}NumberOfUnitsTypeI"/>
     *                                                 &lt;element name="group28" maxOccurs="99" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="structuredFareCalcG28ITM" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ItemNumberTypeI"/>
     *                                                           &lt;element name="group29" maxOccurs="99" minOccurs="0">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="structuredFareCalcG28ADT" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ActionDetailsTypeI"/>
     *                                                                     &lt;element name="structuredFareCalcG28TVL" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S" minOccurs="0"/>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                           &lt;element name="structuredFareCalcG28MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
     *                                                           &lt;element name="structuredFareCalcG28PTS" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/>
     *                                                           &lt;element name="structuredFareCalcG28FCC" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/>
     *                                                           &lt;element name="structuredFareCalcG28PTK" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
     *                                                           &lt;element name="structuredFareCalcG28FRU" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareRulesInformationTypeI" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="dummySegmentGroup27" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DummySegmentTypeI"/>
     *                                                 &lt;element name="structuredFareCalcG27MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
     *                                                 &lt;element name="structuredFareCalcG27TXD" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
     *                                                 &lt;element name="structuredFareCalcG27CVR" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ConversionRateTypeI" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="carrierFeeGroup" maxOccurs="9" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="feeType" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SelectionDetailsTypeI"/>
     *                                       &lt;element name="feeDetails" maxOccurs="99" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="feeInfo" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SpecificDataInformationTypeI"/>
     *                                                 &lt;element name="feeAmounts" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
     *                                                 &lt;element name="feeTaxes" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
     *                                                 &lt;element name="feeDescription" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="fareComponentDetailsGroup" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareComponentDetailsType" maxOccurs="99" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dummySegment",
        "convertionRate",
        "generalIndicatorsGroup",
        "pricingGroupLevelGroup"
    })
    public static class MainGroup {

        @XmlElement(required = true)
        protected DummySegmentTypeI dummySegment;
        protected ConversionRateTypeI convertionRate;
        protected FareInformativePricingWithoutPNRReply.MainGroup.GeneralIndicatorsGroup generalIndicatorsGroup;
        @XmlElement(required = true)
        protected List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup> pricingGroupLevelGroup;

        /**
         * Gets the value of the dummySegment property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getDummySegment() {
            return dummySegment;
        }

        /**
         * Sets the value of the dummySegment property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setDummySegment(DummySegmentTypeI value) {
            this.dummySegment = value;
        }

        /**
         * Gets the value of the convertionRate property.
         * 
         * @return
         *     possible object is
         *     {@link ConversionRateTypeI }
         *     
         */
        public ConversionRateTypeI getConvertionRate() {
            return convertionRate;
        }

        /**
         * Sets the value of the convertionRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConversionRateTypeI }
         *     
         */
        public void setConvertionRate(ConversionRateTypeI value) {
            this.convertionRate = value;
        }

        /**
         * Gets the value of the generalIndicatorsGroup property.
         * 
         * @return
         *     possible object is
         *     {@link FareInformativePricingWithoutPNRReply.MainGroup.GeneralIndicatorsGroup }
         *     
         */
        public FareInformativePricingWithoutPNRReply.MainGroup.GeneralIndicatorsGroup getGeneralIndicatorsGroup() {
            return generalIndicatorsGroup;
        }

        /**
         * Sets the value of the generalIndicatorsGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareInformativePricingWithoutPNRReply.MainGroup.GeneralIndicatorsGroup }
         *     
         */
        public void setGeneralIndicatorsGroup(FareInformativePricingWithoutPNRReply.MainGroup.GeneralIndicatorsGroup value) {
            this.generalIndicatorsGroup = value;
        }

        /**
         * Gets the value of the pricingGroupLevelGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pricingGroupLevelGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPricingGroupLevelGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup }
         * 
         * 
         */
        public List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup> getPricingGroupLevelGroup() {
            if (pricingGroupLevelGroup == null) {
                pricingGroupLevelGroup = new ArrayList<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup>();
            }
            return this.pricingGroupLevelGroup;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="generalIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "generalIndicators"
        })
        public static class GeneralIndicatorsGroup {

            @XmlElement(required = true)
            protected PricingTicketingDetailsTypeI generalIndicators;

            /**
             * Gets the value of the generalIndicators property.
             * 
             * @return
             *     possible object is
             *     {@link PricingTicketingDetailsTypeI }
             *     
             */
            public PricingTicketingDetailsTypeI getGeneralIndicators() {
                return generalIndicators;
            }

            /**
             * Sets the value of the generalIndicators property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingTicketingDetailsTypeI }
             *     
             */
            public void setGeneralIndicators(PricingTicketingDetailsTypeI value) {
                this.generalIndicators = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="numberOfPax" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SegmentRepetitionControlTypeI"/>
         *         &lt;element name="passengersID" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SpecificTravellerTypeI" maxOccurs="99" minOccurs="0"/>
         *         &lt;element name="fareInfoGroup">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="emptySegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareInformationTypeI"/>
         *                   &lt;element name="pricingIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
         *                   &lt;element name="fareAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationType_157205S" minOccurs="0"/>
         *                   &lt;element name="textData" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" maxOccurs="99" minOccurs="0"/>
         *                   &lt;element name="surchargesGroup" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="taxesAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI"/>
         *                             &lt;element name="penaltiesAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DiscountAndPenaltyInformationTypeI" minOccurs="0"/>
         *                             &lt;element name="pfcAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" maxOccurs="5" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="corporateGroup" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="corporateData" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareCalculationCodeDetailsTypeI"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="negoFareGroup" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="negoFareIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingSubsequentTypeI"/>
         *                             &lt;element name="extNegoFareIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
         *                             &lt;element name="negoFareAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DiscountAndPenaltyInformationTypeI" minOccurs="0"/>
         *                             &lt;element name="negoFareText" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="segmentLevelGroup" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="segmentInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S"/>
         *                             &lt;element name="additionalInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
         *                             &lt;element name="fareBasis" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
         *                             &lt;element name="cabinGroup" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="cabinSegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ProductInformationTypeI"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="baggageAllowance" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ExcessBaggageTypeI" minOccurs="0"/>
         *                             &lt;element name="ptcSegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}NumberOfUnitsTypeI" minOccurs="0"/>
         *                             &lt;element name="couponInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}QuantityTypeI" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="structuredFareCalcGroup" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="structureFareCalcRoot" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareComponentInformationTypeI"/>
         *                             &lt;element name="group27" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="structuredFareCalcG27EQN" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}NumberOfUnitsTypeI"/>
         *                                       &lt;element name="group28" maxOccurs="99" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="structuredFareCalcG28ITM" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ItemNumberTypeI"/>
         *                                                 &lt;element name="group29" maxOccurs="99" minOccurs="0">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="structuredFareCalcG28ADT" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ActionDetailsTypeI"/>
         *                                                           &lt;element name="structuredFareCalcG28TVL" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S" minOccurs="0"/>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="structuredFareCalcG28MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
         *                                                 &lt;element name="structuredFareCalcG28PTS" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/>
         *                                                 &lt;element name="structuredFareCalcG28FCC" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/>
         *                                                 &lt;element name="structuredFareCalcG28PTK" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
         *                                                 &lt;element name="structuredFareCalcG28FRU" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareRulesInformationTypeI" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="dummySegmentGroup27" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DummySegmentTypeI"/>
         *                                       &lt;element name="structuredFareCalcG27MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
         *                                       &lt;element name="structuredFareCalcG27TXD" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
         *                                       &lt;element name="structuredFareCalcG27CVR" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ConversionRateTypeI" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="carrierFeeGroup" maxOccurs="9" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="feeType" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SelectionDetailsTypeI"/>
         *                             &lt;element name="feeDetails" maxOccurs="99" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="feeInfo" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SpecificDataInformationTypeI"/>
         *                                       &lt;element name="feeAmounts" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
         *                                       &lt;element name="feeTaxes" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
         *                                       &lt;element name="feeDescription" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="fareComponentDetailsGroup" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareComponentDetailsType" maxOccurs="99" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numberOfPax",
            "passengersID",
            "fareInfoGroup"
        })
        public static class PricingGroupLevelGroup {

            @XmlElement(required = true)
            protected SegmentRepetitionControlTypeI numberOfPax;
            protected List<SpecificTravellerTypeI> passengersID;
            @XmlElement(required = true)
            protected FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup fareInfoGroup;

            /**
             * Gets the value of the numberOfPax property.
             * 
             * @return
             *     possible object is
             *     {@link SegmentRepetitionControlTypeI }
             *     
             */
            public SegmentRepetitionControlTypeI getNumberOfPax() {
                return numberOfPax;
            }

            /**
             * Sets the value of the numberOfPax property.
             * 
             * @param value
             *     allowed object is
             *     {@link SegmentRepetitionControlTypeI }
             *     
             */
            public void setNumberOfPax(SegmentRepetitionControlTypeI value) {
                this.numberOfPax = value;
            }

            /**
             * Gets the value of the passengersID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passengersID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassengersID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SpecificTravellerTypeI }
             * 
             * 
             */
            public List<SpecificTravellerTypeI> getPassengersID() {
                if (passengersID == null) {
                    passengersID = new ArrayList<SpecificTravellerTypeI>();
                }
                return this.passengersID;
            }

            /**
             * Gets the value of the fareInfoGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup }
             *     
             */
            public FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup getFareInfoGroup() {
                return fareInfoGroup;
            }

            /**
             * Sets the value of the fareInfoGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup }
             *     
             */
            public void setFareInfoGroup(FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup value) {
                this.fareInfoGroup = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="emptySegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareInformationTypeI"/>
             *         &lt;element name="pricingIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
             *         &lt;element name="fareAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationType_157205S" minOccurs="0"/>
             *         &lt;element name="textData" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" maxOccurs="99" minOccurs="0"/>
             *         &lt;element name="surchargesGroup" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="taxesAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI"/>
             *                   &lt;element name="penaltiesAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DiscountAndPenaltyInformationTypeI" minOccurs="0"/>
             *                   &lt;element name="pfcAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" maxOccurs="5" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="corporateGroup" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="corporateData" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareCalculationCodeDetailsTypeI"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="negoFareGroup" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="negoFareIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingSubsequentTypeI"/>
             *                   &lt;element name="extNegoFareIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
             *                   &lt;element name="negoFareAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DiscountAndPenaltyInformationTypeI" minOccurs="0"/>
             *                   &lt;element name="negoFareText" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="segmentLevelGroup" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="segmentInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S"/>
             *                   &lt;element name="additionalInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
             *                   &lt;element name="fareBasis" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
             *                   &lt;element name="cabinGroup" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="cabinSegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ProductInformationTypeI"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="baggageAllowance" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ExcessBaggageTypeI" minOccurs="0"/>
             *                   &lt;element name="ptcSegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}NumberOfUnitsTypeI" minOccurs="0"/>
             *                   &lt;element name="couponInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}QuantityTypeI" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="structuredFareCalcGroup" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="structureFareCalcRoot" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareComponentInformationTypeI"/>
             *                   &lt;element name="group27" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="structuredFareCalcG27EQN" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}NumberOfUnitsTypeI"/>
             *                             &lt;element name="group28" maxOccurs="99" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="structuredFareCalcG28ITM" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ItemNumberTypeI"/>
             *                                       &lt;element name="group29" maxOccurs="99" minOccurs="0">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="structuredFareCalcG28ADT" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ActionDetailsTypeI"/>
             *                                                 &lt;element name="structuredFareCalcG28TVL" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S" minOccurs="0"/>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                       &lt;element name="structuredFareCalcG28MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
             *                                       &lt;element name="structuredFareCalcG28PTS" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/>
             *                                       &lt;element name="structuredFareCalcG28FCC" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/>
             *                                       &lt;element name="structuredFareCalcG28PTK" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
             *                                       &lt;element name="structuredFareCalcG28FRU" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareRulesInformationTypeI" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="dummySegmentGroup27" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DummySegmentTypeI"/>
             *                             &lt;element name="structuredFareCalcG27MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
             *                             &lt;element name="structuredFareCalcG27TXD" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
             *                             &lt;element name="structuredFareCalcG27CVR" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ConversionRateTypeI" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="carrierFeeGroup" maxOccurs="9" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="feeType" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SelectionDetailsTypeI"/>
             *                   &lt;element name="feeDetails" maxOccurs="99" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="feeInfo" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SpecificDataInformationTypeI"/>
             *                             &lt;element name="feeAmounts" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
             *                             &lt;element name="feeTaxes" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
             *                             &lt;element name="feeDescription" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="fareComponentDetailsGroup" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareComponentDetailsType" maxOccurs="99" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "emptySegment",
                "pricingIndicators",
                "fareAmount",
                "textData",
                "surchargesGroup",
                "corporateGroup",
                "negoFareGroup",
                "segmentLevelGroup",
                "structuredFareCalcGroup",
                "carrierFeeGroup",
                "fareComponentDetailsGroup"
            })
            public static class FareInfoGroup {

                @XmlElement(required = true)
                protected FareInformationTypeI emptySegment;
                protected PricingTicketingDetailsTypeI pricingIndicators;
                protected MonetaryInformationType157205S fareAmount;
                protected List<InteractiveFreeTextTypeI> textData;
                protected FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SurchargesGroup surchargesGroup;
                protected List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.CorporateGroup> corporateGroup;
                protected List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.NegoFareGroup> negoFareGroup;
                protected List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SegmentLevelGroup> segmentLevelGroup;
                protected FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup structuredFareCalcGroup;
                protected List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.CarrierFeeGroup> carrierFeeGroup;
                protected List<FareComponentDetailsType> fareComponentDetailsGroup;

                /**
                 * Gets the value of the emptySegment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareInformationTypeI }
                 *     
                 */
                public FareInformationTypeI getEmptySegment() {
                    return emptySegment;
                }

                /**
                 * Sets the value of the emptySegment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareInformationTypeI }
                 *     
                 */
                public void setEmptySegment(FareInformationTypeI value) {
                    this.emptySegment = value;
                }

                /**
                 * Gets the value of the pricingIndicators property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PricingTicketingDetailsTypeI }
                 *     
                 */
                public PricingTicketingDetailsTypeI getPricingIndicators() {
                    return pricingIndicators;
                }

                /**
                 * Sets the value of the pricingIndicators property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PricingTicketingDetailsTypeI }
                 *     
                 */
                public void setPricingIndicators(PricingTicketingDetailsTypeI value) {
                    this.pricingIndicators = value;
                }

                /**
                 * Gets the value of the fareAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationType157205S }
                 *     
                 */
                public MonetaryInformationType157205S getFareAmount() {
                    return fareAmount;
                }

                /**
                 * Sets the value of the fareAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationType157205S }
                 *     
                 */
                public void setFareAmount(MonetaryInformationType157205S value) {
                    this.fareAmount = value;
                }

                /**
                 * Gets the value of the textData property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the textData property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTextData().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InteractiveFreeTextTypeI }
                 * 
                 * 
                 */
                public List<InteractiveFreeTextTypeI> getTextData() {
                    if (textData == null) {
                        textData = new ArrayList<InteractiveFreeTextTypeI>();
                    }
                    return this.textData;
                }

                /**
                 * Gets the value of the surchargesGroup property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SurchargesGroup }
                 *     
                 */
                public FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SurchargesGroup getSurchargesGroup() {
                    return surchargesGroup;
                }

                /**
                 * Sets the value of the surchargesGroup property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SurchargesGroup }
                 *     
                 */
                public void setSurchargesGroup(FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SurchargesGroup value) {
                    this.surchargesGroup = value;
                }

                /**
                 * Gets the value of the corporateGroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the corporateGroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCorporateGroup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.CorporateGroup }
                 * 
                 * 
                 */
                public List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.CorporateGroup> getCorporateGroup() {
                    if (corporateGroup == null) {
                        corporateGroup = new ArrayList<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.CorporateGroup>();
                    }
                    return this.corporateGroup;
                }

                /**
                 * Gets the value of the negoFareGroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the negoFareGroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getNegoFareGroup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.NegoFareGroup }
                 * 
                 * 
                 */
                public List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.NegoFareGroup> getNegoFareGroup() {
                    if (negoFareGroup == null) {
                        negoFareGroup = new ArrayList<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.NegoFareGroup>();
                    }
                    return this.negoFareGroup;
                }

                /**
                 * Gets the value of the segmentLevelGroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the segmentLevelGroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSegmentLevelGroup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SegmentLevelGroup }
                 * 
                 * 
                 */
                public List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SegmentLevelGroup> getSegmentLevelGroup() {
                    if (segmentLevelGroup == null) {
                        segmentLevelGroup = new ArrayList<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SegmentLevelGroup>();
                    }
                    return this.segmentLevelGroup;
                }

                /**
                 * Gets the value of the structuredFareCalcGroup property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup }
                 *     
                 */
                public FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup getStructuredFareCalcGroup() {
                    return structuredFareCalcGroup;
                }

                /**
                 * Sets the value of the structuredFareCalcGroup property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup }
                 *     
                 */
                public void setStructuredFareCalcGroup(FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup value) {
                    this.structuredFareCalcGroup = value;
                }

                /**
                 * Gets the value of the carrierFeeGroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the carrierFeeGroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCarrierFeeGroup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.CarrierFeeGroup }
                 * 
                 * 
                 */
                public List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.CarrierFeeGroup> getCarrierFeeGroup() {
                    if (carrierFeeGroup == null) {
                        carrierFeeGroup = new ArrayList<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.CarrierFeeGroup>();
                    }
                    return this.carrierFeeGroup;
                }

                /**
                 * Gets the value of the fareComponentDetailsGroup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the fareComponentDetailsGroup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFareComponentDetailsGroup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FareComponentDetailsType }
                 * 
                 * 
                 */
                public List<FareComponentDetailsType> getFareComponentDetailsGroup() {
                    if (fareComponentDetailsGroup == null) {
                        fareComponentDetailsGroup = new ArrayList<FareComponentDetailsType>();
                    }
                    return this.fareComponentDetailsGroup;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="feeType" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SelectionDetailsTypeI"/>
                 *         &lt;element name="feeDetails" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="feeInfo" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SpecificDataInformationTypeI"/>
                 *                   &lt;element name="feeAmounts" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
                 *                   &lt;element name="feeTaxes" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
                 *                   &lt;element name="feeDescription" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "feeType",
                    "feeDetails"
                })
                public static class CarrierFeeGroup {

                    @XmlElement(required = true)
                    protected SelectionDetailsTypeI feeType;
                    protected List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.CarrierFeeGroup.FeeDetails> feeDetails;

                    /**
                     * Gets the value of the feeType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SelectionDetailsTypeI }
                     *     
                     */
                    public SelectionDetailsTypeI getFeeType() {
                        return feeType;
                    }

                    /**
                     * Sets the value of the feeType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SelectionDetailsTypeI }
                     *     
                     */
                    public void setFeeType(SelectionDetailsTypeI value) {
                        this.feeType = value;
                    }

                    /**
                     * Gets the value of the feeDetails property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the feeDetails property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getFeeDetails().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.CarrierFeeGroup.FeeDetails }
                     * 
                     * 
                     */
                    public List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.CarrierFeeGroup.FeeDetails> getFeeDetails() {
                        if (feeDetails == null) {
                            feeDetails = new ArrayList<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.CarrierFeeGroup.FeeDetails>();
                        }
                        return this.feeDetails;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="feeInfo" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}SpecificDataInformationTypeI"/>
                     *         &lt;element name="feeAmounts" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
                     *         &lt;element name="feeTaxes" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
                     *         &lt;element name="feeDescription" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "feeInfo",
                        "feeAmounts",
                        "feeTaxes",
                        "feeDescription"
                    })
                    public static class FeeDetails {

                        @XmlElement(required = true)
                        protected SpecificDataInformationTypeI feeInfo;
                        protected MonetaryInformationTypeI feeAmounts;
                        protected List<TaxTypeI> feeTaxes;
                        protected InteractiveFreeTextTypeI feeDescription;

                        /**
                         * Gets the value of the feeInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link SpecificDataInformationTypeI }
                         *     
                         */
                        public SpecificDataInformationTypeI getFeeInfo() {
                            return feeInfo;
                        }

                        /**
                         * Sets the value of the feeInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link SpecificDataInformationTypeI }
                         *     
                         */
                        public void setFeeInfo(SpecificDataInformationTypeI value) {
                            this.feeInfo = value;
                        }

                        /**
                         * Gets the value of the feeAmounts property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link MonetaryInformationTypeI }
                         *     
                         */
                        public MonetaryInformationTypeI getFeeAmounts() {
                            return feeAmounts;
                        }

                        /**
                         * Sets the value of the feeAmounts property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link MonetaryInformationTypeI }
                         *     
                         */
                        public void setFeeAmounts(MonetaryInformationTypeI value) {
                            this.feeAmounts = value;
                        }

                        /**
                         * Gets the value of the feeTaxes property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the feeTaxes property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getFeeTaxes().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link TaxTypeI }
                         * 
                         * 
                         */
                        public List<TaxTypeI> getFeeTaxes() {
                            if (feeTaxes == null) {
                                feeTaxes = new ArrayList<TaxTypeI>();
                            }
                            return this.feeTaxes;
                        }

                        /**
                         * Gets the value of the feeDescription property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link InteractiveFreeTextTypeI }
                         *     
                         */
                        public InteractiveFreeTextTypeI getFeeDescription() {
                            return feeDescription;
                        }

                        /**
                         * Sets the value of the feeDescription property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link InteractiveFreeTextTypeI }
                         *     
                         */
                        public void setFeeDescription(InteractiveFreeTextTypeI value) {
                            this.feeDescription = value;
                        }

                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="corporateData" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareCalculationCodeDetailsTypeI"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "corporateData"
                })
                public static class CorporateGroup {

                    @XmlElement(required = true)
                    protected FareCalculationCodeDetailsTypeI corporateData;

                    /**
                     * Gets the value of the corporateData property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareCalculationCodeDetailsTypeI }
                     *     
                     */
                    public FareCalculationCodeDetailsTypeI getCorporateData() {
                        return corporateData;
                    }

                    /**
                     * Sets the value of the corporateData property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareCalculationCodeDetailsTypeI }
                     *     
                     */
                    public void setCorporateData(FareCalculationCodeDetailsTypeI value) {
                        this.corporateData = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="negoFareIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingSubsequentTypeI"/>
                 *         &lt;element name="extNegoFareIndicators" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
                 *         &lt;element name="negoFareAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DiscountAndPenaltyInformationTypeI" minOccurs="0"/>
                 *         &lt;element name="negoFareText" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "negoFareIndicators",
                    "extNegoFareIndicators",
                    "negoFareAmount",
                    "negoFareText"
                })
                public static class NegoFareGroup {

                    @XmlElement(required = true)
                    protected PricingTicketingSubsequentTypeI negoFareIndicators;
                    protected FareQualifierDetailsTypeI extNegoFareIndicators;
                    protected DiscountAndPenaltyInformationTypeI negoFareAmount;
                    protected InteractiveFreeTextTypeI negoFareText;

                    /**
                     * Gets the value of the negoFareIndicators property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PricingTicketingSubsequentTypeI }
                     *     
                     */
                    public PricingTicketingSubsequentTypeI getNegoFareIndicators() {
                        return negoFareIndicators;
                    }

                    /**
                     * Sets the value of the negoFareIndicators property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PricingTicketingSubsequentTypeI }
                     *     
                     */
                    public void setNegoFareIndicators(PricingTicketingSubsequentTypeI value) {
                        this.negoFareIndicators = value;
                    }

                    /**
                     * Gets the value of the extNegoFareIndicators property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareQualifierDetailsTypeI }
                     *     
                     */
                    public FareQualifierDetailsTypeI getExtNegoFareIndicators() {
                        return extNegoFareIndicators;
                    }

                    /**
                     * Sets the value of the extNegoFareIndicators property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareQualifierDetailsTypeI }
                     *     
                     */
                    public void setExtNegoFareIndicators(FareQualifierDetailsTypeI value) {
                        this.extNegoFareIndicators = value;
                    }

                    /**
                     * Gets the value of the negoFareAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DiscountAndPenaltyInformationTypeI }
                     *     
                     */
                    public DiscountAndPenaltyInformationTypeI getNegoFareAmount() {
                        return negoFareAmount;
                    }

                    /**
                     * Sets the value of the negoFareAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DiscountAndPenaltyInformationTypeI }
                     *     
                     */
                    public void setNegoFareAmount(DiscountAndPenaltyInformationTypeI value) {
                        this.negoFareAmount = value;
                    }

                    /**
                     * Gets the value of the negoFareText property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link InteractiveFreeTextTypeI }
                     *     
                     */
                    public InteractiveFreeTextTypeI getNegoFareText() {
                        return negoFareText;
                    }

                    /**
                     * Sets the value of the negoFareText property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link InteractiveFreeTextTypeI }
                     *     
                     */
                    public void setNegoFareText(InteractiveFreeTextTypeI value) {
                        this.negoFareText = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="segmentInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S"/>
                 *         &lt;element name="additionalInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
                 *         &lt;element name="fareBasis" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
                 *         &lt;element name="cabinGroup" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="cabinSegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ProductInformationTypeI"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="baggageAllowance" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ExcessBaggageTypeI" minOccurs="0"/>
                 *         &lt;element name="ptcSegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}NumberOfUnitsTypeI" minOccurs="0"/>
                 *         &lt;element name="couponInformation" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}QuantityTypeI" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "segmentInformation",
                    "additionalInformation",
                    "fareBasis",
                    "cabinGroup",
                    "baggageAllowance",
                    "ptcSegment",
                    "couponInformation"
                })
                public static class SegmentLevelGroup {

                    @XmlElement(required = true)
                    protected TravelProductInformationTypeI69238S segmentInformation;
                    protected PricingTicketingDetailsTypeI additionalInformation;
                    protected FareQualifierDetailsTypeI fareBasis;
                    protected List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SegmentLevelGroup.CabinGroup> cabinGroup;
                    protected ExcessBaggageTypeI baggageAllowance;
                    protected NumberOfUnitsTypeI ptcSegment;
                    protected QuantityTypeI couponInformation;

                    /**
                     * Gets the value of the segmentInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TravelProductInformationTypeI69238S }
                     *     
                     */
                    public TravelProductInformationTypeI69238S getSegmentInformation() {
                        return segmentInformation;
                    }

                    /**
                     * Sets the value of the segmentInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TravelProductInformationTypeI69238S }
                     *     
                     */
                    public void setSegmentInformation(TravelProductInformationTypeI69238S value) {
                        this.segmentInformation = value;
                    }

                    /**
                     * Gets the value of the additionalInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PricingTicketingDetailsTypeI }
                     *     
                     */
                    public PricingTicketingDetailsTypeI getAdditionalInformation() {
                        return additionalInformation;
                    }

                    /**
                     * Sets the value of the additionalInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PricingTicketingDetailsTypeI }
                     *     
                     */
                    public void setAdditionalInformation(PricingTicketingDetailsTypeI value) {
                        this.additionalInformation = value;
                    }

                    /**
                     * Gets the value of the fareBasis property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareQualifierDetailsTypeI }
                     *     
                     */
                    public FareQualifierDetailsTypeI getFareBasis() {
                        return fareBasis;
                    }

                    /**
                     * Sets the value of the fareBasis property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareQualifierDetailsTypeI }
                     *     
                     */
                    public void setFareBasis(FareQualifierDetailsTypeI value) {
                        this.fareBasis = value;
                    }

                    /**
                     * Gets the value of the cabinGroup property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the cabinGroup property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCabinGroup().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SegmentLevelGroup.CabinGroup }
                     * 
                     * 
                     */
                    public List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SegmentLevelGroup.CabinGroup> getCabinGroup() {
                        if (cabinGroup == null) {
                            cabinGroup = new ArrayList<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.SegmentLevelGroup.CabinGroup>();
                        }
                        return this.cabinGroup;
                    }

                    /**
                     * Gets the value of the baggageAllowance property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ExcessBaggageTypeI }
                     *     
                     */
                    public ExcessBaggageTypeI getBaggageAllowance() {
                        return baggageAllowance;
                    }

                    /**
                     * Sets the value of the baggageAllowance property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ExcessBaggageTypeI }
                     *     
                     */
                    public void setBaggageAllowance(ExcessBaggageTypeI value) {
                        this.baggageAllowance = value;
                    }

                    /**
                     * Gets the value of the ptcSegment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link NumberOfUnitsTypeI }
                     *     
                     */
                    public NumberOfUnitsTypeI getPtcSegment() {
                        return ptcSegment;
                    }

                    /**
                     * Sets the value of the ptcSegment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link NumberOfUnitsTypeI }
                     *     
                     */
                    public void setPtcSegment(NumberOfUnitsTypeI value) {
                        this.ptcSegment = value;
                    }

                    /**
                     * Gets the value of the couponInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link QuantityTypeI }
                     *     
                     */
                    public QuantityTypeI getCouponInformation() {
                        return couponInformation;
                    }

                    /**
                     * Sets the value of the couponInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link QuantityTypeI }
                     *     
                     */
                    public void setCouponInformation(QuantityTypeI value) {
                        this.couponInformation = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="cabinSegment" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ProductInformationTypeI"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "cabinSegment"
                    })
                    public static class CabinGroup {

                        @XmlElement(required = true)
                        protected ProductInformationTypeI cabinSegment;

                        /**
                         * Gets the value of the cabinSegment property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ProductInformationTypeI }
                         *     
                         */
                        public ProductInformationTypeI getCabinSegment() {
                            return cabinSegment;
                        }

                        /**
                         * Sets the value of the cabinSegment property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ProductInformationTypeI }
                         *     
                         */
                        public void setCabinSegment(ProductInformationTypeI value) {
                            this.cabinSegment = value;
                        }

                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="structureFareCalcRoot" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareComponentInformationTypeI"/>
                 *         &lt;element name="group27" maxOccurs="99" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="structuredFareCalcG27EQN" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}NumberOfUnitsTypeI"/>
                 *                   &lt;element name="group28" maxOccurs="99" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="structuredFareCalcG28ITM" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ItemNumberTypeI"/>
                 *                             &lt;element name="group29" maxOccurs="99" minOccurs="0">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="structuredFareCalcG28ADT" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ActionDetailsTypeI"/>
                 *                                       &lt;element name="structuredFareCalcG28TVL" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S" minOccurs="0"/>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                             &lt;element name="structuredFareCalcG28MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
                 *                             &lt;element name="structuredFareCalcG28PTS" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/>
                 *                             &lt;element name="structuredFareCalcG28FCC" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/>
                 *                             &lt;element name="structuredFareCalcG28PTK" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
                 *                             &lt;element name="structuredFareCalcG28FRU" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareRulesInformationTypeI" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="dummySegmentGroup27" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DummySegmentTypeI"/>
                 *                   &lt;element name="structuredFareCalcG27MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
                 *                   &lt;element name="structuredFareCalcG27TXD" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
                 *                   &lt;element name="structuredFareCalcG27CVR" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ConversionRateTypeI" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "structureFareCalcRoot",
                    "group27"
                })
                public static class StructuredFareCalcGroup {

                    @XmlElement(required = true)
                    protected FareComponentInformationTypeI structureFareCalcRoot;
                    protected List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup.Group27> group27;

                    /**
                     * Gets the value of the structureFareCalcRoot property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareComponentInformationTypeI }
                     *     
                     */
                    public FareComponentInformationTypeI getStructureFareCalcRoot() {
                        return structureFareCalcRoot;
                    }

                    /**
                     * Sets the value of the structureFareCalcRoot property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareComponentInformationTypeI }
                     *     
                     */
                    public void setStructureFareCalcRoot(FareComponentInformationTypeI value) {
                        this.structureFareCalcRoot = value;
                    }

                    /**
                     * Gets the value of the group27 property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the group27 property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getGroup27().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup.Group27 }
                     * 
                     * 
                     */
                    public List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup.Group27> getGroup27() {
                        if (group27 == null) {
                            group27 = new ArrayList<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup.Group27>();
                        }
                        return this.group27;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="structuredFareCalcG27EQN" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}NumberOfUnitsTypeI"/>
                     *         &lt;element name="group28" maxOccurs="99" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="structuredFareCalcG28ITM" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ItemNumberTypeI"/>
                     *                   &lt;element name="group29" maxOccurs="99" minOccurs="0">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="structuredFareCalcG28ADT" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ActionDetailsTypeI"/>
                     *                             &lt;element name="structuredFareCalcG28TVL" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S" minOccurs="0"/>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                   &lt;element name="structuredFareCalcG28MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
                     *                   &lt;element name="structuredFareCalcG28PTS" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/>
                     *                   &lt;element name="structuredFareCalcG28FCC" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/>
                     *                   &lt;element name="structuredFareCalcG28PTK" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
                     *                   &lt;element name="structuredFareCalcG28FRU" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareRulesInformationTypeI" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="dummySegmentGroup27" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DummySegmentTypeI"/>
                     *         &lt;element name="structuredFareCalcG27MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
                     *         &lt;element name="structuredFareCalcG27TXD" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
                     *         &lt;element name="structuredFareCalcG27CVR" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ConversionRateTypeI" minOccurs="0"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "structuredFareCalcG27EQN",
                        "group28",
                        "dummySegmentGroup27",
                        "structuredFareCalcG27MON",
                        "structuredFareCalcG27TXD",
                        "structuredFareCalcG27CVR"
                    })
                    public static class Group27 {

                        @XmlElement(required = true)
                        protected NumberOfUnitsTypeI structuredFareCalcG27EQN;
                        protected List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup.Group27 .Group28> group28;
                        @XmlElement(required = true)
                        protected DummySegmentTypeI dummySegmentGroup27;
                        protected MonetaryInformationTypeI structuredFareCalcG27MON;
                        protected List<TaxTypeI> structuredFareCalcG27TXD;
                        protected ConversionRateTypeI structuredFareCalcG27CVR;

                        /**
                         * Gets the value of the structuredFareCalcG27EQN property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link NumberOfUnitsTypeI }
                         *     
                         */
                        public NumberOfUnitsTypeI getStructuredFareCalcG27EQN() {
                            return structuredFareCalcG27EQN;
                        }

                        /**
                         * Sets the value of the structuredFareCalcG27EQN property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link NumberOfUnitsTypeI }
                         *     
                         */
                        public void setStructuredFareCalcG27EQN(NumberOfUnitsTypeI value) {
                            this.structuredFareCalcG27EQN = value;
                        }

                        /**
                         * Gets the value of the group28 property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the group28 property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getGroup28().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup.Group27 .Group28 }
                         * 
                         * 
                         */
                        public List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup.Group27 .Group28> getGroup28() {
                            if (group28 == null) {
                                group28 = new ArrayList<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup.Group27 .Group28>();
                            }
                            return this.group28;
                        }

                        /**
                         * Gets the value of the dummySegmentGroup27 property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link DummySegmentTypeI }
                         *     
                         */
                        public DummySegmentTypeI getDummySegmentGroup27() {
                            return dummySegmentGroup27;
                        }

                        /**
                         * Sets the value of the dummySegmentGroup27 property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DummySegmentTypeI }
                         *     
                         */
                        public void setDummySegmentGroup27(DummySegmentTypeI value) {
                            this.dummySegmentGroup27 = value;
                        }

                        /**
                         * Gets the value of the structuredFareCalcG27MON property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link MonetaryInformationTypeI }
                         *     
                         */
                        public MonetaryInformationTypeI getStructuredFareCalcG27MON() {
                            return structuredFareCalcG27MON;
                        }

                        /**
                         * Sets the value of the structuredFareCalcG27MON property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link MonetaryInformationTypeI }
                         *     
                         */
                        public void setStructuredFareCalcG27MON(MonetaryInformationTypeI value) {
                            this.structuredFareCalcG27MON = value;
                        }

                        /**
                         * Gets the value of the structuredFareCalcG27TXD property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the structuredFareCalcG27TXD property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getStructuredFareCalcG27TXD().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link TaxTypeI }
                         * 
                         * 
                         */
                        public List<TaxTypeI> getStructuredFareCalcG27TXD() {
                            if (structuredFareCalcG27TXD == null) {
                                structuredFareCalcG27TXD = new ArrayList<TaxTypeI>();
                            }
                            return this.structuredFareCalcG27TXD;
                        }

                        /**
                         * Gets the value of the structuredFareCalcG27CVR property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ConversionRateTypeI }
                         *     
                         */
                        public ConversionRateTypeI getStructuredFareCalcG27CVR() {
                            return structuredFareCalcG27CVR;
                        }

                        /**
                         * Sets the value of the structuredFareCalcG27CVR property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ConversionRateTypeI }
                         *     
                         */
                        public void setStructuredFareCalcG27CVR(ConversionRateTypeI value) {
                            this.structuredFareCalcG27CVR = value;
                        }


                        /**
                         * <p>Java class for anonymous complex type.
                         * 
                         * <p>The following schema fragment specifies the expected content contained within this class.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="structuredFareCalcG28ITM" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ItemNumberTypeI"/>
                         *         &lt;element name="group29" maxOccurs="99" minOccurs="0">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="structuredFareCalcG28ADT" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ActionDetailsTypeI"/>
                         *                   &lt;element name="structuredFareCalcG28TVL" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S" minOccurs="0"/>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *         &lt;element name="structuredFareCalcG28MON" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
                         *         &lt;element name="structuredFareCalcG28PTS" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingSubsequentTypeI" minOccurs="0"/>
                         *         &lt;element name="structuredFareCalcG28FCC" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareCalculationCodeDetailsTypeI" minOccurs="0"/>
                         *         &lt;element name="structuredFareCalcG28PTK" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}PricingTicketingDetailsTypeI" minOccurs="0"/>
                         *         &lt;element name="structuredFareCalcG28FRU" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}FareRulesInformationTypeI" minOccurs="0"/>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "structuredFareCalcG28ITM",
                            "group29",
                            "structuredFareCalcG28MON",
                            "structuredFareCalcG28PTS",
                            "structuredFareCalcG28FCC",
                            "structuredFareCalcG28PTK",
                            "structuredFareCalcG28FRU"
                        })
                        public static class Group28 {

                            @XmlElement(required = true)
                            protected ItemNumberTypeI structuredFareCalcG28ITM;
                            protected List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup.Group27 .Group28 .Group29> group29;
                            protected MonetaryInformationTypeI structuredFareCalcG28MON;
                            protected PricingTicketingSubsequentTypeI structuredFareCalcG28PTS;
                            protected FareCalculationCodeDetailsTypeI structuredFareCalcG28FCC;
                            protected PricingTicketingDetailsTypeI structuredFareCalcG28PTK;
                            protected FareRulesInformationTypeI structuredFareCalcG28FRU;

                            /**
                             * Gets the value of the structuredFareCalcG28ITM property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link ItemNumberTypeI }
                             *     
                             */
                            public ItemNumberTypeI getStructuredFareCalcG28ITM() {
                                return structuredFareCalcG28ITM;
                            }

                            /**
                             * Sets the value of the structuredFareCalcG28ITM property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link ItemNumberTypeI }
                             *     
                             */
                            public void setStructuredFareCalcG28ITM(ItemNumberTypeI value) {
                                this.structuredFareCalcG28ITM = value;
                            }

                            /**
                             * Gets the value of the group29 property.
                             * 
                             * <p>
                             * This accessor method returns a reference to the live list,
                             * not a snapshot. Therefore any modification you make to the
                             * returned list will be present inside the JAXB object.
                             * This is why there is not a <CODE>set</CODE> method for the group29 property.
                             * 
                             * <p>
                             * For example, to add a new item, do as follows:
                             * <pre>
                             *    getGroup29().add(newItem);
                             * </pre>
                             * 
                             * 
                             * <p>
                             * Objects of the following type(s) are allowed in the list
                             * {@link FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup.Group27 .Group28 .Group29 }
                             * 
                             * 
                             */
                            public List<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup.Group27 .Group28 .Group29> getGroup29() {
                                if (group29 == null) {
                                    group29 = new ArrayList<FareInformativePricingWithoutPNRReply.MainGroup.PricingGroupLevelGroup.FareInfoGroup.StructuredFareCalcGroup.Group27 .Group28 .Group29>();
                                }
                                return this.group29;
                            }

                            /**
                             * Gets the value of the structuredFareCalcG28MON property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link MonetaryInformationTypeI }
                             *     
                             */
                            public MonetaryInformationTypeI getStructuredFareCalcG28MON() {
                                return structuredFareCalcG28MON;
                            }

                            /**
                             * Sets the value of the structuredFareCalcG28MON property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link MonetaryInformationTypeI }
                             *     
                             */
                            public void setStructuredFareCalcG28MON(MonetaryInformationTypeI value) {
                                this.structuredFareCalcG28MON = value;
                            }

                            /**
                             * Gets the value of the structuredFareCalcG28PTS property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link PricingTicketingSubsequentTypeI }
                             *     
                             */
                            public PricingTicketingSubsequentTypeI getStructuredFareCalcG28PTS() {
                                return structuredFareCalcG28PTS;
                            }

                            /**
                             * Sets the value of the structuredFareCalcG28PTS property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link PricingTicketingSubsequentTypeI }
                             *     
                             */
                            public void setStructuredFareCalcG28PTS(PricingTicketingSubsequentTypeI value) {
                                this.structuredFareCalcG28PTS = value;
                            }

                            /**
                             * Gets the value of the structuredFareCalcG28FCC property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link FareCalculationCodeDetailsTypeI }
                             *     
                             */
                            public FareCalculationCodeDetailsTypeI getStructuredFareCalcG28FCC() {
                                return structuredFareCalcG28FCC;
                            }

                            /**
                             * Sets the value of the structuredFareCalcG28FCC property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link FareCalculationCodeDetailsTypeI }
                             *     
                             */
                            public void setStructuredFareCalcG28FCC(FareCalculationCodeDetailsTypeI value) {
                                this.structuredFareCalcG28FCC = value;
                            }

                            /**
                             * Gets the value of the structuredFareCalcG28PTK property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link PricingTicketingDetailsTypeI }
                             *     
                             */
                            public PricingTicketingDetailsTypeI getStructuredFareCalcG28PTK() {
                                return structuredFareCalcG28PTK;
                            }

                            /**
                             * Sets the value of the structuredFareCalcG28PTK property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link PricingTicketingDetailsTypeI }
                             *     
                             */
                            public void setStructuredFareCalcG28PTK(PricingTicketingDetailsTypeI value) {
                                this.structuredFareCalcG28PTK = value;
                            }

                            /**
                             * Gets the value of the structuredFareCalcG28FRU property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link FareRulesInformationTypeI }
                             *     
                             */
                            public FareRulesInformationTypeI getStructuredFareCalcG28FRU() {
                                return structuredFareCalcG28FRU;
                            }

                            /**
                             * Sets the value of the structuredFareCalcG28FRU property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link FareRulesInformationTypeI }
                             *     
                             */
                            public void setStructuredFareCalcG28FRU(FareRulesInformationTypeI value) {
                                this.structuredFareCalcG28FRU = value;
                            }


                            /**
                             * <p>Java class for anonymous complex type.
                             * 
                             * <p>The following schema fragment specifies the expected content contained within this class.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="structuredFareCalcG28ADT" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}ActionDetailsTypeI"/>
                             *         &lt;element name="structuredFareCalcG28TVL" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TravelProductInformationTypeI_69238S" minOccurs="0"/>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "structuredFareCalcG28ADT",
                                "structuredFareCalcG28TVL"
                            })
                            public static class Group29 {

                                @XmlElement(required = true)
                                protected ActionDetailsTypeI structuredFareCalcG28ADT;
                                protected TravelProductInformationTypeI69238S structuredFareCalcG28TVL;

                                /**
                                 * Gets the value of the structuredFareCalcG28ADT property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link ActionDetailsTypeI }
                                 *     
                                 */
                                public ActionDetailsTypeI getStructuredFareCalcG28ADT() {
                                    return structuredFareCalcG28ADT;
                                }

                                /**
                                 * Sets the value of the structuredFareCalcG28ADT property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link ActionDetailsTypeI }
                                 *     
                                 */
                                public void setStructuredFareCalcG28ADT(ActionDetailsTypeI value) {
                                    this.structuredFareCalcG28ADT = value;
                                }

                                /**
                                 * Gets the value of the structuredFareCalcG28TVL property.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link TravelProductInformationTypeI69238S }
                                 *     
                                 */
                                public TravelProductInformationTypeI69238S getStructuredFareCalcG28TVL() {
                                    return structuredFareCalcG28TVL;
                                }

                                /**
                                 * Sets the value of the structuredFareCalcG28TVL property.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link TravelProductInformationTypeI69238S }
                                 *     
                                 */
                                public void setStructuredFareCalcG28TVL(TravelProductInformationTypeI69238S value) {
                                    this.structuredFareCalcG28TVL = value;
                                }

                            }

                        }

                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="taxesAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}TaxTypeI"/>
                 *         &lt;element name="penaltiesAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}DiscountAndPenaltyInformationTypeI" minOccurs="0"/>
                 *         &lt;element name="pfcAmount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}MonetaryInformationTypeI" maxOccurs="5" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "taxesAmount",
                    "penaltiesAmount",
                    "pfcAmount"
                })
                public static class SurchargesGroup {

                    @XmlElement(required = true)
                    protected TaxTypeI taxesAmount;
                    protected DiscountAndPenaltyInformationTypeI penaltiesAmount;
                    protected List<MonetaryInformationTypeI> pfcAmount;

                    /**
                     * Gets the value of the taxesAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TaxTypeI }
                     *     
                     */
                    public TaxTypeI getTaxesAmount() {
                        return taxesAmount;
                    }

                    /**
                     * Sets the value of the taxesAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TaxTypeI }
                     *     
                     */
                    public void setTaxesAmount(TaxTypeI value) {
                        this.taxesAmount = value;
                    }

                    /**
                     * Gets the value of the penaltiesAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DiscountAndPenaltyInformationTypeI }
                     *     
                     */
                    public DiscountAndPenaltyInformationTypeI getPenaltiesAmount() {
                        return penaltiesAmount;
                    }

                    /**
                     * Sets the value of the penaltiesAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DiscountAndPenaltyInformationTypeI }
                     *     
                     */
                    public void setPenaltiesAmount(DiscountAndPenaltyInformationTypeI value) {
                        this.penaltiesAmount = value;
                    }

                    /**
                     * Gets the value of the pfcAmount property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the pfcAmount property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPfcAmount().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MonetaryInformationTypeI }
                     * 
                     * 
                     */
                    public List<MonetaryInformationTypeI> getPfcAmount() {
                        if (pfcAmount == null) {
                            pfcAmount = new ArrayList<MonetaryInformationTypeI>();
                        }
                        return this.pfcAmount;
                    }

                }

            }

        }

    }

}
