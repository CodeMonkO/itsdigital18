
package com.amadeus.xml.tpcbrr_12_4_1a;

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
 *         &lt;element name="applicationError" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ErrorGroupType" minOccurs="0"/>
 *         &lt;element name="pnrLocatorData" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ReservationControlInformationTypeI" minOccurs="0"/>
 *         &lt;element name="fareList" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pricingInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}PricingTicketingSubsequentTypeI"/>
 *                   &lt;element name="fareReference" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ItemReferencesAndVersionsType_94584S"/>
 *                   &lt;element name="fareIndicators" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}FareInformationType" minOccurs="0"/>
 *                   &lt;element name="lastTktDate" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}StructuredDateTimeInformationType" minOccurs="0"/>
 *                   &lt;element name="validatingCarrier" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TransportIdentifierType" minOccurs="0"/>
 *                   &lt;element name="paxSegReference" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ReferenceInformationTypeI"/>
 *                   &lt;element name="fareDataInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationType" minOccurs="0"/>
 *                   &lt;element name="taxInformation" maxOccurs="120" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="taxDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DutyTaxFeeDetailsTypeU"/>
 *                             &lt;element name="amountDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="bankerRates" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ConversionRateTypeI" minOccurs="0"/>
 *                   &lt;element name="passengerInformation" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="penDisInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DiscountAndPenaltyInformationTypeI_6128S"/>
 *                             &lt;element name="passengerReference" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ReferenceInformationTypeI" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="originDestination" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/>
 *                   &lt;element name="segmentInformation" maxOccurs="96" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="connexInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ConnectionTypeI"/>
 *                             &lt;element name="segDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TravelProductInformationTypeI_26322S" minOccurs="0"/>
 *                             &lt;element name="fareQualifier" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
 *                             &lt;element name="validityInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="bagAllowanceInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ExcessBaggageTypeI" minOccurs="0"/>
 *                             &lt;element name="segmentReference" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ReferenceInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="sequenceInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="otherPricingInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CodedAttributeType_39223S" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="warningInformation" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="warningCode" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ApplicationErrorInformationType"/>
 *                             &lt;element name="warningText" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}InteractiveFreeTextTypeI_6759S" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="automaticReissueInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TicketNumberTypeI"/>
 *                             &lt;element name="couponInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CouponInformationTypeI"/>
 *                             &lt;element name="paperCouponRange" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TicketNumberTypeI"/>
 *                                       &lt;element name="couponInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CouponInformationTypeI"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="baseFareInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
 *                             &lt;element name="firstDpiGroup">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="reIssuePenalty" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DiscountAndPenaltyInformationTypeI"/>
 *                                       &lt;element name="reissueInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
 *                                       &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
 *                                       &lt;element name="reissueBalanceInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="secondDpiGroup">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="penalty" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DiscountAndPenaltyInformationTypeI"/>
 *                                       &lt;element name="residualValueInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
 *                                       &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
 *                                       &lt;element name="issueBalanceInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="reissueAttributes" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CodedAttributeType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="corporateInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CorporateFareInformationType" minOccurs="0"/>
 *                   &lt;element name="feeBreakdown" maxOccurs="9" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="feeType" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}SelectionDetailsTypeI"/>
 *                             &lt;element name="feeDetails" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="feeInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}SpecificDataInformationTypeI"/>
 *                                       &lt;element name="feeDescription" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                                       &lt;element name="feeAmounts" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_39230S" minOccurs="0"/>
 *                                       &lt;element name="feeTaxes" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
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
 *                   &lt;element name="mileage" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
 *                   &lt;element name="fareComponentDetailsGroup" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}FareComponentDetailsType" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="endFareList" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DummySegmentTypeI"/>
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
    "applicationError",
    "pnrLocatorData",
    "fareList"
})
@XmlRootElement(name = "Fare_PricePNRWithBookingClassReply")
public class FarePricePNRWithBookingClassReply {

    protected ErrorGroupType applicationError;
    protected ReservationControlInformationTypeI pnrLocatorData;
    protected List<FarePricePNRWithBookingClassReply.FareList> fareList;

    /**
     * Gets the value of the applicationError property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorGroupType }
     *     
     */
    public ErrorGroupType getApplicationError() {
        return applicationError;
    }

    /**
     * Sets the value of the applicationError property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorGroupType }
     *     
     */
    public void setApplicationError(ErrorGroupType value) {
        this.applicationError = value;
    }

    /**
     * Gets the value of the pnrLocatorData property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public ReservationControlInformationTypeI getPnrLocatorData() {
        return pnrLocatorData;
    }

    /**
     * Sets the value of the pnrLocatorData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationTypeI }
     *     
     */
    public void setPnrLocatorData(ReservationControlInformationTypeI value) {
        this.pnrLocatorData = value;
    }

    /**
     * Gets the value of the fareList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePricePNRWithBookingClassReply.FareList }
     * 
     * 
     */
    public List<FarePricePNRWithBookingClassReply.FareList> getFareList() {
        if (fareList == null) {
            fareList = new ArrayList<FarePricePNRWithBookingClassReply.FareList>();
        }
        return this.fareList;
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
     *         &lt;element name="pricingInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}PricingTicketingSubsequentTypeI"/>
     *         &lt;element name="fareReference" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ItemReferencesAndVersionsType_94584S"/>
     *         &lt;element name="fareIndicators" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}FareInformationType" minOccurs="0"/>
     *         &lt;element name="lastTktDate" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}StructuredDateTimeInformationType" minOccurs="0"/>
     *         &lt;element name="validatingCarrier" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TransportIdentifierType" minOccurs="0"/>
     *         &lt;element name="paxSegReference" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ReferenceInformationTypeI"/>
     *         &lt;element name="fareDataInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationType" minOccurs="0"/>
     *         &lt;element name="taxInformation" maxOccurs="120" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="taxDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DutyTaxFeeDetailsTypeU"/>
     *                   &lt;element name="amountDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="bankerRates" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ConversionRateTypeI" minOccurs="0"/>
     *         &lt;element name="passengerInformation" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="penDisInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DiscountAndPenaltyInformationTypeI_6128S"/>
     *                   &lt;element name="passengerReference" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ReferenceInformationTypeI" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="originDestination" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/>
     *         &lt;element name="segmentInformation" maxOccurs="96" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="connexInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ConnectionTypeI"/>
     *                   &lt;element name="segDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TravelProductInformationTypeI_26322S" minOccurs="0"/>
     *                   &lt;element name="fareQualifier" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
     *                   &lt;element name="validityInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="bagAllowanceInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ExcessBaggageTypeI" minOccurs="0"/>
     *                   &lt;element name="segmentReference" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ReferenceInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="sequenceInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="otherPricingInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CodedAttributeType_39223S" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="warningInformation" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="warningCode" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ApplicationErrorInformationType"/>
     *                   &lt;element name="warningText" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}InteractiveFreeTextTypeI_6759S" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="automaticReissueInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TicketNumberTypeI"/>
     *                   &lt;element name="couponInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CouponInformationTypeI"/>
     *                   &lt;element name="paperCouponRange" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TicketNumberTypeI"/>
     *                             &lt;element name="couponInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CouponInformationTypeI"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="baseFareInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
     *                   &lt;element name="firstDpiGroup">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="reIssuePenalty" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DiscountAndPenaltyInformationTypeI"/>
     *                             &lt;element name="reissueInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
     *                             &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
     *                             &lt;element name="reissueBalanceInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="secondDpiGroup">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="penalty" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DiscountAndPenaltyInformationTypeI"/>
     *                             &lt;element name="residualValueInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
     *                             &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
     *                             &lt;element name="issueBalanceInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="reissueAttributes" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CodedAttributeType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="corporateInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CorporateFareInformationType" minOccurs="0"/>
     *         &lt;element name="feeBreakdown" maxOccurs="9" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="feeType" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}SelectionDetailsTypeI"/>
     *                   &lt;element name="feeDetails" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="feeInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}SpecificDataInformationTypeI"/>
     *                             &lt;element name="feeDescription" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
     *                             &lt;element name="feeAmounts" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_39230S" minOccurs="0"/>
     *                             &lt;element name="feeTaxes" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
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
     *         &lt;element name="mileage" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
     *         &lt;element name="fareComponentDetailsGroup" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}FareComponentDetailsType" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="endFareList" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DummySegmentTypeI"/>
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
        "pricingInformation",
        "fareReference",
        "fareIndicators",
        "lastTktDate",
        "validatingCarrier",
        "paxSegReference",
        "fareDataInformation",
        "taxInformation",
        "bankerRates",
        "passengerInformation",
        "originDestination",
        "segmentInformation",
        "otherPricingInfo",
        "warningInformation",
        "automaticReissueInfo",
        "corporateInfo",
        "feeBreakdown",
        "mileage",
        "fareComponentDetailsGroup",
        "endFareList"
    })
    public static class FareList {

        @XmlElement(required = true)
        protected PricingTicketingSubsequentTypeI pricingInformation;
        @XmlElement(required = true)
        protected ItemReferencesAndVersionsType94584S fareReference;
        protected FareInformationType fareIndicators;
        protected StructuredDateTimeInformationType lastTktDate;
        protected TransportIdentifierType validatingCarrier;
        @XmlElement(required = true)
        protected ReferenceInformationTypeI paxSegReference;
        protected MonetaryInformationType fareDataInformation;
        protected List<FarePricePNRWithBookingClassReply.FareList.TaxInformation> taxInformation;
        protected ConversionRateTypeI bankerRates;
        protected List<FarePricePNRWithBookingClassReply.FareList.PassengerInformation> passengerInformation;
        protected OriginAndDestinationDetailsTypeI originDestination;
        protected List<FarePricePNRWithBookingClassReply.FareList.SegmentInformation> segmentInformation;
        protected List<CodedAttributeType39223S> otherPricingInfo;
        protected List<FarePricePNRWithBookingClassReply.FareList.WarningInformation> warningInformation;
        protected FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo automaticReissueInfo;
        protected CorporateFareInformationType corporateInfo;
        protected List<FarePricePNRWithBookingClassReply.FareList.FeeBreakdown> feeBreakdown;
        protected AdditionalProductDetailsTypeI mileage;
        protected List<FareComponentDetailsType> fareComponentDetailsGroup;
        @XmlElement(required = true)
        protected DummySegmentTypeI endFareList;

        /**
         * Gets the value of the pricingInformation property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingSubsequentTypeI }
         *     
         */
        public PricingTicketingSubsequentTypeI getPricingInformation() {
            return pricingInformation;
        }

        /**
         * Sets the value of the pricingInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingSubsequentTypeI }
         *     
         */
        public void setPricingInformation(PricingTicketingSubsequentTypeI value) {
            this.pricingInformation = value;
        }

        /**
         * Gets the value of the fareReference property.
         * 
         * @return
         *     possible object is
         *     {@link ItemReferencesAndVersionsType94584S }
         *     
         */
        public ItemReferencesAndVersionsType94584S getFareReference() {
            return fareReference;
        }

        /**
         * Sets the value of the fareReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemReferencesAndVersionsType94584S }
         *     
         */
        public void setFareReference(ItemReferencesAndVersionsType94584S value) {
            this.fareReference = value;
        }

        /**
         * Gets the value of the fareIndicators property.
         * 
         * @return
         *     possible object is
         *     {@link FareInformationType }
         *     
         */
        public FareInformationType getFareIndicators() {
            return fareIndicators;
        }

        /**
         * Sets the value of the fareIndicators property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareInformationType }
         *     
         */
        public void setFareIndicators(FareInformationType value) {
            this.fareIndicators = value;
        }

        /**
         * Gets the value of the lastTktDate property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType }
         *     
         */
        public StructuredDateTimeInformationType getLastTktDate() {
            return lastTktDate;
        }

        /**
         * Sets the value of the lastTktDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType }
         *     
         */
        public void setLastTktDate(StructuredDateTimeInformationType value) {
            this.lastTktDate = value;
        }

        /**
         * Gets the value of the validatingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link TransportIdentifierType }
         *     
         */
        public TransportIdentifierType getValidatingCarrier() {
            return validatingCarrier;
        }

        /**
         * Sets the value of the validatingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransportIdentifierType }
         *     
         */
        public void setValidatingCarrier(TransportIdentifierType value) {
            this.validatingCarrier = value;
        }

        /**
         * Gets the value of the paxSegReference property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationTypeI }
         *     
         */
        public ReferenceInformationTypeI getPaxSegReference() {
            return paxSegReference;
        }

        /**
         * Sets the value of the paxSegReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationTypeI }
         *     
         */
        public void setPaxSegReference(ReferenceInformationTypeI value) {
            this.paxSegReference = value;
        }

        /**
         * Gets the value of the fareDataInformation property.
         * 
         * @return
         *     possible object is
         *     {@link MonetaryInformationType }
         *     
         */
        public MonetaryInformationType getFareDataInformation() {
            return fareDataInformation;
        }

        /**
         * Sets the value of the fareDataInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonetaryInformationType }
         *     
         */
        public void setFareDataInformation(MonetaryInformationType value) {
            this.fareDataInformation = value;
        }

        /**
         * Gets the value of the taxInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FarePricePNRWithBookingClassReply.FareList.TaxInformation }
         * 
         * 
         */
        public List<FarePricePNRWithBookingClassReply.FareList.TaxInformation> getTaxInformation() {
            if (taxInformation == null) {
                taxInformation = new ArrayList<FarePricePNRWithBookingClassReply.FareList.TaxInformation>();
            }
            return this.taxInformation;
        }

        /**
         * Gets the value of the bankerRates property.
         * 
         * @return
         *     possible object is
         *     {@link ConversionRateTypeI }
         *     
         */
        public ConversionRateTypeI getBankerRates() {
            return bankerRates;
        }

        /**
         * Sets the value of the bankerRates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ConversionRateTypeI }
         *     
         */
        public void setBankerRates(ConversionRateTypeI value) {
            this.bankerRates = value;
        }

        /**
         * Gets the value of the passengerInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FarePricePNRWithBookingClassReply.FareList.PassengerInformation }
         * 
         * 
         */
        public List<FarePricePNRWithBookingClassReply.FareList.PassengerInformation> getPassengerInformation() {
            if (passengerInformation == null) {
                passengerInformation = new ArrayList<FarePricePNRWithBookingClassReply.FareList.PassengerInformation>();
            }
            return this.passengerInformation;
        }

        /**
         * Gets the value of the originDestination property.
         * 
         * @return
         *     possible object is
         *     {@link OriginAndDestinationDetailsTypeI }
         *     
         */
        public OriginAndDestinationDetailsTypeI getOriginDestination() {
            return originDestination;
        }

        /**
         * Sets the value of the originDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginAndDestinationDetailsTypeI }
         *     
         */
        public void setOriginDestination(OriginAndDestinationDetailsTypeI value) {
            this.originDestination = value;
        }

        /**
         * Gets the value of the segmentInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FarePricePNRWithBookingClassReply.FareList.SegmentInformation }
         * 
         * 
         */
        public List<FarePricePNRWithBookingClassReply.FareList.SegmentInformation> getSegmentInformation() {
            if (segmentInformation == null) {
                segmentInformation = new ArrayList<FarePricePNRWithBookingClassReply.FareList.SegmentInformation>();
            }
            return this.segmentInformation;
        }

        /**
         * Gets the value of the otherPricingInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherPricingInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherPricingInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodedAttributeType39223S }
         * 
         * 
         */
        public List<CodedAttributeType39223S> getOtherPricingInfo() {
            if (otherPricingInfo == null) {
                otherPricingInfo = new ArrayList<CodedAttributeType39223S>();
            }
            return this.otherPricingInfo;
        }

        /**
         * Gets the value of the warningInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the warningInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWarningInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FarePricePNRWithBookingClassReply.FareList.WarningInformation }
         * 
         * 
         */
        public List<FarePricePNRWithBookingClassReply.FareList.WarningInformation> getWarningInformation() {
            if (warningInformation == null) {
                warningInformation = new ArrayList<FarePricePNRWithBookingClassReply.FareList.WarningInformation>();
            }
            return this.warningInformation;
        }

        /**
         * Gets the value of the automaticReissueInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo }
         *     
         */
        public FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo getAutomaticReissueInfo() {
            return automaticReissueInfo;
        }

        /**
         * Sets the value of the automaticReissueInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo }
         *     
         */
        public void setAutomaticReissueInfo(FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo value) {
            this.automaticReissueInfo = value;
        }

        /**
         * Gets the value of the corporateInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CorporateFareInformationType }
         *     
         */
        public CorporateFareInformationType getCorporateInfo() {
            return corporateInfo;
        }

        /**
         * Sets the value of the corporateInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CorporateFareInformationType }
         *     
         */
        public void setCorporateInfo(CorporateFareInformationType value) {
            this.corporateInfo = value;
        }

        /**
         * Gets the value of the feeBreakdown property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feeBreakdown property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeeBreakdown().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FarePricePNRWithBookingClassReply.FareList.FeeBreakdown }
         * 
         * 
         */
        public List<FarePricePNRWithBookingClassReply.FareList.FeeBreakdown> getFeeBreakdown() {
            if (feeBreakdown == null) {
                feeBreakdown = new ArrayList<FarePricePNRWithBookingClassReply.FareList.FeeBreakdown>();
            }
            return this.feeBreakdown;
        }

        /**
         * Gets the value of the mileage property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalProductDetailsTypeI }
         *     
         */
        public AdditionalProductDetailsTypeI getMileage() {
            return mileage;
        }

        /**
         * Sets the value of the mileage property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalProductDetailsTypeI }
         *     
         */
        public void setMileage(AdditionalProductDetailsTypeI value) {
            this.mileage = value;
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
         * Gets the value of the endFareList property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getEndFareList() {
            return endFareList;
        }

        /**
         * Sets the value of the endFareList property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setEndFareList(DummySegmentTypeI value) {
            this.endFareList = value;
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
         *         &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TicketNumberTypeI"/>
         *         &lt;element name="couponInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CouponInformationTypeI"/>
         *         &lt;element name="paperCouponRange" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TicketNumberTypeI"/>
         *                   &lt;element name="couponInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CouponInformationTypeI"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="baseFareInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
         *         &lt;element name="firstDpiGroup">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="reIssuePenalty" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DiscountAndPenaltyInformationTypeI"/>
         *                   &lt;element name="reissueInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
         *                   &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
         *                   &lt;element name="reissueBalanceInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="secondDpiGroup">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="penalty" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DiscountAndPenaltyInformationTypeI"/>
         *                   &lt;element name="residualValueInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
         *                   &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
         *                   &lt;element name="issueBalanceInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="reissueAttributes" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CodedAttributeType" minOccurs="0"/>
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
            "ticketInfo",
            "couponInfo",
            "paperCouponRange",
            "baseFareInfo",
            "firstDpiGroup",
            "secondDpiGroup",
            "reissueAttributes"
        })
        public static class AutomaticReissueInfo {

            @XmlElement(required = true)
            protected TicketNumberTypeI ticketInfo;
            @XmlElement(required = true)
            protected CouponInformationTypeI couponInfo;
            protected FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.PaperCouponRange paperCouponRange;
            @XmlElement(required = true)
            protected MonetaryInformationTypeI20897S baseFareInfo;
            @XmlElement(required = true)
            protected FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.FirstDpiGroup firstDpiGroup;
            @XmlElement(required = true)
            protected FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.SecondDpiGroup secondDpiGroup;
            protected CodedAttributeType reissueAttributes;

            /**
             * Gets the value of the ticketInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TicketNumberTypeI }
             *     
             */
            public TicketNumberTypeI getTicketInfo() {
                return ticketInfo;
            }

            /**
             * Sets the value of the ticketInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketNumberTypeI }
             *     
             */
            public void setTicketInfo(TicketNumberTypeI value) {
                this.ticketInfo = value;
            }

            /**
             * Gets the value of the couponInfo property.
             * 
             * @return
             *     possible object is
             *     {@link CouponInformationTypeI }
             *     
             */
            public CouponInformationTypeI getCouponInfo() {
                return couponInfo;
            }

            /**
             * Sets the value of the couponInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link CouponInformationTypeI }
             *     
             */
            public void setCouponInfo(CouponInformationTypeI value) {
                this.couponInfo = value;
            }

            /**
             * Gets the value of the paperCouponRange property.
             * 
             * @return
             *     possible object is
             *     {@link FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.PaperCouponRange }
             *     
             */
            public FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.PaperCouponRange getPaperCouponRange() {
                return paperCouponRange;
            }

            /**
             * Sets the value of the paperCouponRange property.
             * 
             * @param value
             *     allowed object is
             *     {@link FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.PaperCouponRange }
             *     
             */
            public void setPaperCouponRange(FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.PaperCouponRange value) {
                this.paperCouponRange = value;
            }

            /**
             * Gets the value of the baseFareInfo property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI20897S }
             *     
             */
            public MonetaryInformationTypeI20897S getBaseFareInfo() {
                return baseFareInfo;
            }

            /**
             * Sets the value of the baseFareInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI20897S }
             *     
             */
            public void setBaseFareInfo(MonetaryInformationTypeI20897S value) {
                this.baseFareInfo = value;
            }

            /**
             * Gets the value of the firstDpiGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.FirstDpiGroup }
             *     
             */
            public FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.FirstDpiGroup getFirstDpiGroup() {
                return firstDpiGroup;
            }

            /**
             * Sets the value of the firstDpiGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.FirstDpiGroup }
             *     
             */
            public void setFirstDpiGroup(FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.FirstDpiGroup value) {
                this.firstDpiGroup = value;
            }

            /**
             * Gets the value of the secondDpiGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.SecondDpiGroup }
             *     
             */
            public FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.SecondDpiGroup getSecondDpiGroup() {
                return secondDpiGroup;
            }

            /**
             * Sets the value of the secondDpiGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.SecondDpiGroup }
             *     
             */
            public void setSecondDpiGroup(FarePricePNRWithBookingClassReply.FareList.AutomaticReissueInfo.SecondDpiGroup value) {
                this.secondDpiGroup = value;
            }

            /**
             * Gets the value of the reissueAttributes property.
             * 
             * @return
             *     possible object is
             *     {@link CodedAttributeType }
             *     
             */
            public CodedAttributeType getReissueAttributes() {
                return reissueAttributes;
            }

            /**
             * Sets the value of the reissueAttributes property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedAttributeType }
             *     
             */
            public void setReissueAttributes(CodedAttributeType value) {
                this.reissueAttributes = value;
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
             *         &lt;element name="reIssuePenalty" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DiscountAndPenaltyInformationTypeI"/>
             *         &lt;element name="reissueInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
             *         &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
             *         &lt;element name="reissueBalanceInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
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
                "reIssuePenalty",
                "reissueInfo",
                "oldTaxInfo",
                "reissueBalanceInfo"
            })
            public static class FirstDpiGroup {

                @XmlElement(required = true)
                protected DiscountAndPenaltyInformationTypeI reIssuePenalty;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI20897S reissueInfo;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI20897S oldTaxInfo;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI20897S reissueBalanceInfo;

                /**
                 * Gets the value of the reIssuePenalty property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DiscountAndPenaltyInformationTypeI }
                 *     
                 */
                public DiscountAndPenaltyInformationTypeI getReIssuePenalty() {
                    return reIssuePenalty;
                }

                /**
                 * Sets the value of the reIssuePenalty property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DiscountAndPenaltyInformationTypeI }
                 *     
                 */
                public void setReIssuePenalty(DiscountAndPenaltyInformationTypeI value) {
                    this.reIssuePenalty = value;
                }

                /**
                 * Gets the value of the reissueInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI20897S }
                 *     
                 */
                public MonetaryInformationTypeI20897S getReissueInfo() {
                    return reissueInfo;
                }

                /**
                 * Sets the value of the reissueInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI20897S }
                 *     
                 */
                public void setReissueInfo(MonetaryInformationTypeI20897S value) {
                    this.reissueInfo = value;
                }

                /**
                 * Gets the value of the oldTaxInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI20897S }
                 *     
                 */
                public MonetaryInformationTypeI20897S getOldTaxInfo() {
                    return oldTaxInfo;
                }

                /**
                 * Sets the value of the oldTaxInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI20897S }
                 *     
                 */
                public void setOldTaxInfo(MonetaryInformationTypeI20897S value) {
                    this.oldTaxInfo = value;
                }

                /**
                 * Gets the value of the reissueBalanceInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI20897S }
                 *     
                 */
                public MonetaryInformationTypeI20897S getReissueBalanceInfo() {
                    return reissueBalanceInfo;
                }

                /**
                 * Sets the value of the reissueBalanceInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI20897S }
                 *     
                 */
                public void setReissueBalanceInfo(MonetaryInformationTypeI20897S value) {
                    this.reissueBalanceInfo = value;
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
             *         &lt;element name="ticketInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TicketNumberTypeI"/>
             *         &lt;element name="couponInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}CouponInformationTypeI"/>
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
                "ticketInfo",
                "couponInfo"
            })
            public static class PaperCouponRange {

                @XmlElement(required = true)
                protected TicketNumberTypeI ticketInfo;
                @XmlElement(required = true)
                protected CouponInformationTypeI couponInfo;

                /**
                 * Gets the value of the ticketInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TicketNumberTypeI }
                 *     
                 */
                public TicketNumberTypeI getTicketInfo() {
                    return ticketInfo;
                }

                /**
                 * Sets the value of the ticketInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TicketNumberTypeI }
                 *     
                 */
                public void setTicketInfo(TicketNumberTypeI value) {
                    this.ticketInfo = value;
                }

                /**
                 * Gets the value of the couponInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CouponInformationTypeI }
                 *     
                 */
                public CouponInformationTypeI getCouponInfo() {
                    return couponInfo;
                }

                /**
                 * Sets the value of the couponInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CouponInformationTypeI }
                 *     
                 */
                public void setCouponInfo(CouponInformationTypeI value) {
                    this.couponInfo = value;
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
             *         &lt;element name="penalty" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DiscountAndPenaltyInformationTypeI"/>
             *         &lt;element name="residualValueInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
             *         &lt;element name="oldTaxInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
             *         &lt;element name="issueBalanceInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_20897S"/>
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
                "penalty",
                "residualValueInfo",
                "oldTaxInfo",
                "issueBalanceInfo"
            })
            public static class SecondDpiGroup {

                @XmlElement(required = true)
                protected DiscountAndPenaltyInformationTypeI penalty;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI20897S residualValueInfo;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI20897S oldTaxInfo;
                @XmlElement(required = true)
                protected MonetaryInformationTypeI20897S issueBalanceInfo;

                /**
                 * Gets the value of the penalty property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DiscountAndPenaltyInformationTypeI }
                 *     
                 */
                public DiscountAndPenaltyInformationTypeI getPenalty() {
                    return penalty;
                }

                /**
                 * Sets the value of the penalty property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DiscountAndPenaltyInformationTypeI }
                 *     
                 */
                public void setPenalty(DiscountAndPenaltyInformationTypeI value) {
                    this.penalty = value;
                }

                /**
                 * Gets the value of the residualValueInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI20897S }
                 *     
                 */
                public MonetaryInformationTypeI20897S getResidualValueInfo() {
                    return residualValueInfo;
                }

                /**
                 * Sets the value of the residualValueInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI20897S }
                 *     
                 */
                public void setResidualValueInfo(MonetaryInformationTypeI20897S value) {
                    this.residualValueInfo = value;
                }

                /**
                 * Gets the value of the oldTaxInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI20897S }
                 *     
                 */
                public MonetaryInformationTypeI20897S getOldTaxInfo() {
                    return oldTaxInfo;
                }

                /**
                 * Sets the value of the oldTaxInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI20897S }
                 *     
                 */
                public void setOldTaxInfo(MonetaryInformationTypeI20897S value) {
                    this.oldTaxInfo = value;
                }

                /**
                 * Gets the value of the issueBalanceInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI20897S }
                 *     
                 */
                public MonetaryInformationTypeI20897S getIssueBalanceInfo() {
                    return issueBalanceInfo;
                }

                /**
                 * Sets the value of the issueBalanceInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI20897S }
                 *     
                 */
                public void setIssueBalanceInfo(MonetaryInformationTypeI20897S value) {
                    this.issueBalanceInfo = value;
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
         *         &lt;element name="feeType" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}SelectionDetailsTypeI"/>
         *         &lt;element name="feeDetails" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="feeInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}SpecificDataInformationTypeI"/>
         *                   &lt;element name="feeDescription" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
         *                   &lt;element name="feeAmounts" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_39230S" minOccurs="0"/>
         *                   &lt;element name="feeTaxes" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
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
        public static class FeeBreakdown {

            @XmlElement(required = true)
            protected SelectionDetailsTypeI feeType;
            protected List<FarePricePNRWithBookingClassReply.FareList.FeeBreakdown.FeeDetails> feeDetails;

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
             * {@link FarePricePNRWithBookingClassReply.FareList.FeeBreakdown.FeeDetails }
             * 
             * 
             */
            public List<FarePricePNRWithBookingClassReply.FareList.FeeBreakdown.FeeDetails> getFeeDetails() {
                if (feeDetails == null) {
                    feeDetails = new ArrayList<FarePricePNRWithBookingClassReply.FareList.FeeBreakdown.FeeDetails>();
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
             *         &lt;element name="feeInfo" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}SpecificDataInformationTypeI"/>
             *         &lt;element name="feeDescription" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
             *         &lt;element name="feeAmounts" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI_39230S" minOccurs="0"/>
             *         &lt;element name="feeTaxes" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TaxTypeI" maxOccurs="99" minOccurs="0"/>
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
                "feeDescription",
                "feeAmounts",
                "feeTaxes"
            })
            public static class FeeDetails {

                @XmlElement(required = true)
                protected SpecificDataInformationTypeI feeInfo;
                protected InteractiveFreeTextTypeI feeDescription;
                protected MonetaryInformationTypeI39230S feeAmounts;
                protected List<TaxTypeI> feeTaxes;

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

                /**
                 * Gets the value of the feeAmounts property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI39230S }
                 *     
                 */
                public MonetaryInformationTypeI39230S getFeeAmounts() {
                    return feeAmounts;
                }

                /**
                 * Sets the value of the feeAmounts property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI39230S }
                 *     
                 */
                public void setFeeAmounts(MonetaryInformationTypeI39230S value) {
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
         *         &lt;element name="penDisInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DiscountAndPenaltyInformationTypeI_6128S"/>
         *         &lt;element name="passengerReference" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ReferenceInformationTypeI" minOccurs="0"/>
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
            "penDisInformation",
            "passengerReference"
        })
        public static class PassengerInformation {

            @XmlElement(required = true)
            protected DiscountAndPenaltyInformationTypeI6128S penDisInformation;
            protected ReferenceInformationTypeI passengerReference;

            /**
             * Gets the value of the penDisInformation property.
             * 
             * @return
             *     possible object is
             *     {@link DiscountAndPenaltyInformationTypeI6128S }
             *     
             */
            public DiscountAndPenaltyInformationTypeI6128S getPenDisInformation() {
                return penDisInformation;
            }

            /**
             * Sets the value of the penDisInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link DiscountAndPenaltyInformationTypeI6128S }
             *     
             */
            public void setPenDisInformation(DiscountAndPenaltyInformationTypeI6128S value) {
                this.penDisInformation = value;
            }

            /**
             * Gets the value of the passengerReference property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInformationTypeI }
             *     
             */
            public ReferenceInformationTypeI getPassengerReference() {
                return passengerReference;
            }

            /**
             * Sets the value of the passengerReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInformationTypeI }
             *     
             */
            public void setPassengerReference(ReferenceInformationTypeI value) {
                this.passengerReference = value;
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
         *         &lt;element name="connexInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ConnectionTypeI"/>
         *         &lt;element name="segDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}TravelProductInformationTypeI_26322S" minOccurs="0"/>
         *         &lt;element name="fareQualifier" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
         *         &lt;element name="validityInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="bagAllowanceInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ExcessBaggageTypeI" minOccurs="0"/>
         *         &lt;element name="segmentReference" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ReferenceInformationTypeI" minOccurs="0"/>
         *         &lt;element name="sequenceInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
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
            "connexInformation",
            "segDetails",
            "fareQualifier",
            "validityInformation",
            "bagAllowanceInformation",
            "segmentReference",
            "sequenceInformation"
        })
        public static class SegmentInformation {

            @XmlElement(required = true)
            protected ConnectionTypeI connexInformation;
            protected TravelProductInformationTypeI26322S segDetails;
            protected FareQualifierDetailsTypeI fareQualifier;
            protected List<StructuredDateTimeInformationType> validityInformation;
            protected ExcessBaggageTypeI bagAllowanceInformation;
            protected ReferenceInformationTypeI segmentReference;
            protected ItemReferencesAndVersionsType sequenceInformation;

            /**
             * Gets the value of the connexInformation property.
             * 
             * @return
             *     possible object is
             *     {@link ConnectionTypeI }
             *     
             */
            public ConnectionTypeI getConnexInformation() {
                return connexInformation;
            }

            /**
             * Sets the value of the connexInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ConnectionTypeI }
             *     
             */
            public void setConnexInformation(ConnectionTypeI value) {
                this.connexInformation = value;
            }

            /**
             * Gets the value of the segDetails property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationTypeI26322S }
             *     
             */
            public TravelProductInformationTypeI26322S getSegDetails() {
                return segDetails;
            }

            /**
             * Sets the value of the segDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationTypeI26322S }
             *     
             */
            public void setSegDetails(TravelProductInformationTypeI26322S value) {
                this.segDetails = value;
            }

            /**
             * Gets the value of the fareQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link FareQualifierDetailsTypeI }
             *     
             */
            public FareQualifierDetailsTypeI getFareQualifier() {
                return fareQualifier;
            }

            /**
             * Sets the value of the fareQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareQualifierDetailsTypeI }
             *     
             */
            public void setFareQualifier(FareQualifierDetailsTypeI value) {
                this.fareQualifier = value;
            }

            /**
             * Gets the value of the validityInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the validityInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getValidityInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StructuredDateTimeInformationType }
             * 
             * 
             */
            public List<StructuredDateTimeInformationType> getValidityInformation() {
                if (validityInformation == null) {
                    validityInformation = new ArrayList<StructuredDateTimeInformationType>();
                }
                return this.validityInformation;
            }

            /**
             * Gets the value of the bagAllowanceInformation property.
             * 
             * @return
             *     possible object is
             *     {@link ExcessBaggageTypeI }
             *     
             */
            public ExcessBaggageTypeI getBagAllowanceInformation() {
                return bagAllowanceInformation;
            }

            /**
             * Sets the value of the bagAllowanceInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExcessBaggageTypeI }
             *     
             */
            public void setBagAllowanceInformation(ExcessBaggageTypeI value) {
                this.bagAllowanceInformation = value;
            }

            /**
             * Gets the value of the segmentReference property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInformationTypeI }
             *     
             */
            public ReferenceInformationTypeI getSegmentReference() {
                return segmentReference;
            }

            /**
             * Sets the value of the segmentReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInformationTypeI }
             *     
             */
            public void setSegmentReference(ReferenceInformationTypeI value) {
                this.segmentReference = value;
            }

            /**
             * Gets the value of the sequenceInformation property.
             * 
             * @return
             *     possible object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public ItemReferencesAndVersionsType getSequenceInformation() {
                return sequenceInformation;
            }

            /**
             * Sets the value of the sequenceInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public void setSequenceInformation(ItemReferencesAndVersionsType value) {
                this.sequenceInformation = value;
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
         *         &lt;element name="taxDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}DutyTaxFeeDetailsTypeU"/>
         *         &lt;element name="amountDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}MonetaryInformationTypeI" minOccurs="0"/>
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
            "taxDetails",
            "amountDetails"
        })
        public static class TaxInformation {

            @XmlElement(required = true)
            protected DutyTaxFeeDetailsTypeU taxDetails;
            protected MonetaryInformationTypeI amountDetails;

            /**
             * Gets the value of the taxDetails property.
             * 
             * @return
             *     possible object is
             *     {@link DutyTaxFeeDetailsTypeU }
             *     
             */
            public DutyTaxFeeDetailsTypeU getTaxDetails() {
                return taxDetails;
            }

            /**
             * Sets the value of the taxDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link DutyTaxFeeDetailsTypeU }
             *     
             */
            public void setTaxDetails(DutyTaxFeeDetailsTypeU value) {
                this.taxDetails = value;
            }

            /**
             * Gets the value of the amountDetails property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public MonetaryInformationTypeI getAmountDetails() {
                return amountDetails;
            }

            /**
             * Sets the value of the amountDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationTypeI }
             *     
             */
            public void setAmountDetails(MonetaryInformationTypeI value) {
                this.amountDetails = value;
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
         *         &lt;element name="warningCode" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ApplicationErrorInformationType"/>
         *         &lt;element name="warningText" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}InteractiveFreeTextTypeI_6759S" minOccurs="0"/>
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
            "warningCode",
            "warningText"
        })
        public static class WarningInformation {

            @XmlElement(required = true)
            protected ApplicationErrorInformationType warningCode;
            protected InteractiveFreeTextTypeI6759S warningText;

            /**
             * Gets the value of the warningCode property.
             * 
             * @return
             *     possible object is
             *     {@link ApplicationErrorInformationType }
             *     
             */
            public ApplicationErrorInformationType getWarningCode() {
                return warningCode;
            }

            /**
             * Sets the value of the warningCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link ApplicationErrorInformationType }
             *     
             */
            public void setWarningCode(ApplicationErrorInformationType value) {
                this.warningCode = value;
            }

            /**
             * Gets the value of the warningText property.
             * 
             * @return
             *     possible object is
             *     {@link InteractiveFreeTextTypeI6759S }
             *     
             */
            public InteractiveFreeTextTypeI6759S getWarningText() {
                return warningText;
            }

            /**
             * Sets the value of the warningText property.
             * 
             * @param value
             *     allowed object is
             *     {@link InteractiveFreeTextTypeI6759S }
             *     
             */
            public void setWarningText(InteractiveFreeTextTypeI6759S value) {
                this.warningText = value;
            }

        }

    }

}
