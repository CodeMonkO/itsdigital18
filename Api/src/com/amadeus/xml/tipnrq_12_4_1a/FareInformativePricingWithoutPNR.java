
package com.amadeus.xml.tipnrq_12_4_1a;

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
 *         &lt;element name="messageDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}MessageActionDetailsTypeI"/>
 *         &lt;element name="originatorGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="additionalBusinessInformation" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AdditionalBusinessSourceInformationTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="currencyOverride" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}ConversionRateTypeI" minOccurs="0"/>
 *         &lt;element name="corporateFares" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}CorporateFareInformationType" minOccurs="0"/>
 *         &lt;element name="taxExemptGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="taxExempt" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}TaxTypeI"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="generalFormOfPayment" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FormOfPaymentTypeI" minOccurs="0"/>
 *         &lt;element name="passengersGroup" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="segmentRepetitionControl" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SegmentRepetitionControlTypeI_69179S"/>
 *                   &lt;element name="travellersID" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SpecificTravellerTypeI" minOccurs="0"/>
 *                   &lt;element name="ptcGroup" maxOccurs="3" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="discountPtc" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareInformationTypeI"/>
 *                             &lt;element name="passengerFormOfPayment" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FormOfPaymentTypeI" minOccurs="0"/>
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
 *         &lt;element name="pricingOptionsGroup" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pricingDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}PricingTicketingDetailsType"/>
 *                   &lt;element name="extPricingDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="instantPricingOption" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}MonetaryInformationType" minOccurs="0"/>
 *         &lt;element name="tripsGroup">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="originDestination" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}OriginAndDestinationDetailsTypeI"/>
 *                   &lt;element name="segmentGroup" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="segmentInformation" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}TravelProductInformationTypeI"/>
 *                             &lt;element name="additionnalSegmentDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
 *                             &lt;element name="zapOffDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
 *                             &lt;element name="inventoryGroup" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="inventory" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}ProductInformationTypeI"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="pricePsgByFareBasisInfo" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="segmentRepetitionControl" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SegmentRepetitionControlType"/>
 *                                       &lt;element name="specificTravellerDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SpecificTravellerTypeI_65902S" minOccurs="0"/>
 *                                       &lt;element name="requestedPricingInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="fareInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareInformationType"/>
 *                                                 &lt;element name="dateAndTimeInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}DateAndTimeInformationTypeI" minOccurs="0"/>
 *                                                 &lt;element name="pricingByFareBasisInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareQualifierDetailsTypeI_82845S" minOccurs="0"/>
 *                                                 &lt;element name="routingNumberInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareRouteInformationTypeI" minOccurs="0"/>
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
 *                             &lt;element name="trigger" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}DummySegmentTypeI"/>
 *                             &lt;element name="psgDetailsGroup" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}GroupPassengerDetailsType" maxOccurs="99" minOccurs="0"/>
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
 *         &lt;element name="obFeeRequestGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="markersFeeOptions" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}DummySegmentTypeI"/>
 *                   &lt;element name="feeOptionInfoGroup" maxOccurs="5">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="feeTypeInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SelectionDetailsType"/>
 *                             &lt;element name="rateTaxInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}MonetaryInformationType_69171S" minOccurs="0"/>
 *                             &lt;element name="feeDetailsInfoGroup" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="feeInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SpecificDataInformationTypeI"/>
 *                                       &lt;element name="feeProcessingInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SelectionDetailsType"/>
 *                                       &lt;element name="associatedAmountsInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}MonetaryInformationType_69173S" minOccurs="0"/>
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
    "originatorGroup",
    "currencyOverride",
    "corporateFares",
    "taxExemptGroup",
    "generalFormOfPayment",
    "passengersGroup",
    "pricingOptionsGroup",
    "instantPricingOption",
    "tripsGroup",
    "obFeeRequestGroup"
})
@XmlRootElement(name = "Fare_InformativePricingWithoutPNR")
public class FareInformativePricingWithoutPNR {

    @XmlElement(required = true)
    protected MessageActionDetailsTypeI messageDetails;
    protected FareInformativePricingWithoutPNR.OriginatorGroup originatorGroup;
    protected ConversionRateTypeI currencyOverride;
    protected CorporateFareInformationType corporateFares;
    protected FareInformativePricingWithoutPNR.TaxExemptGroup taxExemptGroup;
    protected FormOfPaymentTypeI generalFormOfPayment;
    protected List<FareInformativePricingWithoutPNR.PassengersGroup> passengersGroup;
    protected List<FareInformativePricingWithoutPNR.PricingOptionsGroup> pricingOptionsGroup;
    protected MonetaryInformationType instantPricingOption;
    @XmlElement(required = true)
    protected FareInformativePricingWithoutPNR.TripsGroup tripsGroup;
    protected FareInformativePricingWithoutPNR.ObFeeRequestGroup obFeeRequestGroup;

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
     * Gets the value of the originatorGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FareInformativePricingWithoutPNR.OriginatorGroup }
     *     
     */
    public FareInformativePricingWithoutPNR.OriginatorGroup getOriginatorGroup() {
        return originatorGroup;
    }

    /**
     * Sets the value of the originatorGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInformativePricingWithoutPNR.OriginatorGroup }
     *     
     */
    public void setOriginatorGroup(FareInformativePricingWithoutPNR.OriginatorGroup value) {
        this.originatorGroup = value;
    }

    /**
     * Gets the value of the currencyOverride property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateTypeI }
     *     
     */
    public ConversionRateTypeI getCurrencyOverride() {
        return currencyOverride;
    }

    /**
     * Sets the value of the currencyOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateTypeI }
     *     
     */
    public void setCurrencyOverride(ConversionRateTypeI value) {
        this.currencyOverride = value;
    }

    /**
     * Gets the value of the corporateFares property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateFareInformationType }
     *     
     */
    public CorporateFareInformationType getCorporateFares() {
        return corporateFares;
    }

    /**
     * Sets the value of the corporateFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateFareInformationType }
     *     
     */
    public void setCorporateFares(CorporateFareInformationType value) {
        this.corporateFares = value;
    }

    /**
     * Gets the value of the taxExemptGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FareInformativePricingWithoutPNR.TaxExemptGroup }
     *     
     */
    public FareInformativePricingWithoutPNR.TaxExemptGroup getTaxExemptGroup() {
        return taxExemptGroup;
    }

    /**
     * Sets the value of the taxExemptGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInformativePricingWithoutPNR.TaxExemptGroup }
     *     
     */
    public void setTaxExemptGroup(FareInformativePricingWithoutPNR.TaxExemptGroup value) {
        this.taxExemptGroup = value;
    }

    /**
     * Gets the value of the generalFormOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public FormOfPaymentTypeI getGeneralFormOfPayment() {
        return generalFormOfPayment;
    }

    /**
     * Sets the value of the generalFormOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentTypeI }
     *     
     */
    public void setGeneralFormOfPayment(FormOfPaymentTypeI value) {
        this.generalFormOfPayment = value;
    }

    /**
     * Gets the value of the passengersGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengersGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengersGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInformativePricingWithoutPNR.PassengersGroup }
     * 
     * 
     */
    public List<FareInformativePricingWithoutPNR.PassengersGroup> getPassengersGroup() {
        if (passengersGroup == null) {
            passengersGroup = new ArrayList<FareInformativePricingWithoutPNR.PassengersGroup>();
        }
        return this.passengersGroup;
    }

    /**
     * Gets the value of the pricingOptionsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingOptionsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingOptionsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareInformativePricingWithoutPNR.PricingOptionsGroup }
     * 
     * 
     */
    public List<FareInformativePricingWithoutPNR.PricingOptionsGroup> getPricingOptionsGroup() {
        if (pricingOptionsGroup == null) {
            pricingOptionsGroup = new ArrayList<FareInformativePricingWithoutPNR.PricingOptionsGroup>();
        }
        return this.pricingOptionsGroup;
    }

    /**
     * Gets the value of the instantPricingOption property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationType }
     *     
     */
    public MonetaryInformationType getInstantPricingOption() {
        return instantPricingOption;
    }

    /**
     * Sets the value of the instantPricingOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationType }
     *     
     */
    public void setInstantPricingOption(MonetaryInformationType value) {
        this.instantPricingOption = value;
    }

    /**
     * Gets the value of the tripsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FareInformativePricingWithoutPNR.TripsGroup }
     *     
     */
    public FareInformativePricingWithoutPNR.TripsGroup getTripsGroup() {
        return tripsGroup;
    }

    /**
     * Sets the value of the tripsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInformativePricingWithoutPNR.TripsGroup }
     *     
     */
    public void setTripsGroup(FareInformativePricingWithoutPNR.TripsGroup value) {
        this.tripsGroup = value;
    }

    /**
     * Gets the value of the obFeeRequestGroup property.
     * 
     * @return
     *     possible object is
     *     {@link FareInformativePricingWithoutPNR.ObFeeRequestGroup }
     *     
     */
    public FareInformativePricingWithoutPNR.ObFeeRequestGroup getObFeeRequestGroup() {
        return obFeeRequestGroup;
    }

    /**
     * Sets the value of the obFeeRequestGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareInformativePricingWithoutPNR.ObFeeRequestGroup }
     *     
     */
    public void setObFeeRequestGroup(FareInformativePricingWithoutPNR.ObFeeRequestGroup value) {
        this.obFeeRequestGroup = value;
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
     *         &lt;element name="markersFeeOptions" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}DummySegmentTypeI"/>
     *         &lt;element name="feeOptionInfoGroup" maxOccurs="5">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="feeTypeInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SelectionDetailsType"/>
     *                   &lt;element name="rateTaxInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}MonetaryInformationType_69171S" minOccurs="0"/>
     *                   &lt;element name="feeDetailsInfoGroup" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="feeInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SpecificDataInformationTypeI"/>
     *                             &lt;element name="feeProcessingInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SelectionDetailsType"/>
     *                             &lt;element name="associatedAmountsInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}MonetaryInformationType_69173S" minOccurs="0"/>
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
        "markersFeeOptions",
        "feeOptionInfoGroup"
    })
    public static class ObFeeRequestGroup {

        @XmlElement(required = true)
        protected DummySegmentTypeI markersFeeOptions;
        @XmlElement(required = true)
        protected List<FareInformativePricingWithoutPNR.ObFeeRequestGroup.FeeOptionInfoGroup> feeOptionInfoGroup;

        /**
         * Gets the value of the markersFeeOptions property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getMarkersFeeOptions() {
            return markersFeeOptions;
        }

        /**
         * Sets the value of the markersFeeOptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setMarkersFeeOptions(DummySegmentTypeI value) {
            this.markersFeeOptions = value;
        }

        /**
         * Gets the value of the feeOptionInfoGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the feeOptionInfoGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFeeOptionInfoGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareInformativePricingWithoutPNR.ObFeeRequestGroup.FeeOptionInfoGroup }
         * 
         * 
         */
        public List<FareInformativePricingWithoutPNR.ObFeeRequestGroup.FeeOptionInfoGroup> getFeeOptionInfoGroup() {
            if (feeOptionInfoGroup == null) {
                feeOptionInfoGroup = new ArrayList<FareInformativePricingWithoutPNR.ObFeeRequestGroup.FeeOptionInfoGroup>();
            }
            return this.feeOptionInfoGroup;
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
         *         &lt;element name="feeTypeInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SelectionDetailsType"/>
         *         &lt;element name="rateTaxInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}MonetaryInformationType_69171S" minOccurs="0"/>
         *         &lt;element name="feeDetailsInfoGroup" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="feeInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SpecificDataInformationTypeI"/>
         *                   &lt;element name="feeProcessingInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SelectionDetailsType"/>
         *                   &lt;element name="associatedAmountsInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}MonetaryInformationType_69173S" minOccurs="0"/>
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
            "feeTypeInfo",
            "rateTaxInfo",
            "feeDetailsInfoGroup"
        })
        public static class FeeOptionInfoGroup {

            @XmlElement(required = true)
            protected SelectionDetailsType feeTypeInfo;
            protected MonetaryInformationType69171S rateTaxInfo;
            protected List<FareInformativePricingWithoutPNR.ObFeeRequestGroup.FeeOptionInfoGroup.FeeDetailsInfoGroup> feeDetailsInfoGroup;

            /**
             * Gets the value of the feeTypeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link SelectionDetailsType }
             *     
             */
            public SelectionDetailsType getFeeTypeInfo() {
                return feeTypeInfo;
            }

            /**
             * Sets the value of the feeTypeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link SelectionDetailsType }
             *     
             */
            public void setFeeTypeInfo(SelectionDetailsType value) {
                this.feeTypeInfo = value;
            }

            /**
             * Gets the value of the rateTaxInfo property.
             * 
             * @return
             *     possible object is
             *     {@link MonetaryInformationType69171S }
             *     
             */
            public MonetaryInformationType69171S getRateTaxInfo() {
                return rateTaxInfo;
            }

            /**
             * Sets the value of the rateTaxInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link MonetaryInformationType69171S }
             *     
             */
            public void setRateTaxInfo(MonetaryInformationType69171S value) {
                this.rateTaxInfo = value;
            }

            /**
             * Gets the value of the feeDetailsInfoGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the feeDetailsInfoGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFeeDetailsInfoGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareInformativePricingWithoutPNR.ObFeeRequestGroup.FeeOptionInfoGroup.FeeDetailsInfoGroup }
             * 
             * 
             */
            public List<FareInformativePricingWithoutPNR.ObFeeRequestGroup.FeeOptionInfoGroup.FeeDetailsInfoGroup> getFeeDetailsInfoGroup() {
                if (feeDetailsInfoGroup == null) {
                    feeDetailsInfoGroup = new ArrayList<FareInformativePricingWithoutPNR.ObFeeRequestGroup.FeeOptionInfoGroup.FeeDetailsInfoGroup>();
                }
                return this.feeDetailsInfoGroup;
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
             *         &lt;element name="feeInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SpecificDataInformationTypeI"/>
             *         &lt;element name="feeProcessingInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SelectionDetailsType"/>
             *         &lt;element name="associatedAmountsInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}MonetaryInformationType_69173S" minOccurs="0"/>
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
                "feeProcessingInfo",
                "associatedAmountsInfo"
            })
            public static class FeeDetailsInfoGroup {

                @XmlElement(required = true)
                protected SpecificDataInformationTypeI feeInfo;
                @XmlElement(required = true)
                protected SelectionDetailsType feeProcessingInfo;
                protected MonetaryInformationType69173S associatedAmountsInfo;

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
                 * Gets the value of the feeProcessingInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SelectionDetailsType }
                 *     
                 */
                public SelectionDetailsType getFeeProcessingInfo() {
                    return feeProcessingInfo;
                }

                /**
                 * Sets the value of the feeProcessingInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SelectionDetailsType }
                 *     
                 */
                public void setFeeProcessingInfo(SelectionDetailsType value) {
                    this.feeProcessingInfo = value;
                }

                /**
                 * Gets the value of the associatedAmountsInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationType69173S }
                 *     
                 */
                public MonetaryInformationType69173S getAssociatedAmountsInfo() {
                    return associatedAmountsInfo;
                }

                /**
                 * Sets the value of the associatedAmountsInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationType69173S }
                 *     
                 */
                public void setAssociatedAmountsInfo(MonetaryInformationType69173S value) {
                    this.associatedAmountsInfo = value;
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
     *         &lt;element name="additionalBusinessInformation" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AdditionalBusinessSourceInformationTypeI" minOccurs="0"/>
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
        "additionalBusinessInformation"
    })
    public static class OriginatorGroup {

        protected AdditionalBusinessSourceInformationTypeI additionalBusinessInformation;

        /**
         * Gets the value of the additionalBusinessInformation property.
         * 
         * @return
         *     possible object is
         *     {@link AdditionalBusinessSourceInformationTypeI }
         *     
         */
        public AdditionalBusinessSourceInformationTypeI getAdditionalBusinessInformation() {
            return additionalBusinessInformation;
        }

        /**
         * Sets the value of the additionalBusinessInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdditionalBusinessSourceInformationTypeI }
         *     
         */
        public void setAdditionalBusinessInformation(AdditionalBusinessSourceInformationTypeI value) {
            this.additionalBusinessInformation = value;
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
     *         &lt;element name="segmentRepetitionControl" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SegmentRepetitionControlTypeI_69179S"/>
     *         &lt;element name="travellersID" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SpecificTravellerTypeI" minOccurs="0"/>
     *         &lt;element name="ptcGroup" maxOccurs="3" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="discountPtc" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareInformationTypeI"/>
     *                   &lt;element name="passengerFormOfPayment" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FormOfPaymentTypeI" minOccurs="0"/>
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
        "segmentRepetitionControl",
        "travellersID",
        "ptcGroup"
    })
    public static class PassengersGroup {

        @XmlElement(required = true)
        protected SegmentRepetitionControlTypeI69179S segmentRepetitionControl;
        protected SpecificTravellerTypeI travellersID;
        protected List<FareInformativePricingWithoutPNR.PassengersGroup.PtcGroup> ptcGroup;

        /**
         * Gets the value of the segmentRepetitionControl property.
         * 
         * @return
         *     possible object is
         *     {@link SegmentRepetitionControlTypeI69179S }
         *     
         */
        public SegmentRepetitionControlTypeI69179S getSegmentRepetitionControl() {
            return segmentRepetitionControl;
        }

        /**
         * Sets the value of the segmentRepetitionControl property.
         * 
         * @param value
         *     allowed object is
         *     {@link SegmentRepetitionControlTypeI69179S }
         *     
         */
        public void setSegmentRepetitionControl(SegmentRepetitionControlTypeI69179S value) {
            this.segmentRepetitionControl = value;
        }

        /**
         * Gets the value of the travellersID property.
         * 
         * @return
         *     possible object is
         *     {@link SpecificTravellerTypeI }
         *     
         */
        public SpecificTravellerTypeI getTravellersID() {
            return travellersID;
        }

        /**
         * Sets the value of the travellersID property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecificTravellerTypeI }
         *     
         */
        public void setTravellersID(SpecificTravellerTypeI value) {
            this.travellersID = value;
        }

        /**
         * Gets the value of the ptcGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ptcGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPtcGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareInformativePricingWithoutPNR.PassengersGroup.PtcGroup }
         * 
         * 
         */
        public List<FareInformativePricingWithoutPNR.PassengersGroup.PtcGroup> getPtcGroup() {
            if (ptcGroup == null) {
                ptcGroup = new ArrayList<FareInformativePricingWithoutPNR.PassengersGroup.PtcGroup>();
            }
            return this.ptcGroup;
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
         *         &lt;element name="discountPtc" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareInformationTypeI"/>
         *         &lt;element name="passengerFormOfPayment" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FormOfPaymentTypeI" minOccurs="0"/>
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
            "discountPtc",
            "passengerFormOfPayment"
        })
        public static class PtcGroup {

            @XmlElement(required = true)
            protected FareInformationTypeI discountPtc;
            protected FormOfPaymentTypeI passengerFormOfPayment;

            /**
             * Gets the value of the discountPtc property.
             * 
             * @return
             *     possible object is
             *     {@link FareInformationTypeI }
             *     
             */
            public FareInformationTypeI getDiscountPtc() {
                return discountPtc;
            }

            /**
             * Sets the value of the discountPtc property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareInformationTypeI }
             *     
             */
            public void setDiscountPtc(FareInformationTypeI value) {
                this.discountPtc = value;
            }

            /**
             * Gets the value of the passengerFormOfPayment property.
             * 
             * @return
             *     possible object is
             *     {@link FormOfPaymentTypeI }
             *     
             */
            public FormOfPaymentTypeI getPassengerFormOfPayment() {
                return passengerFormOfPayment;
            }

            /**
             * Sets the value of the passengerFormOfPayment property.
             * 
             * @param value
             *     allowed object is
             *     {@link FormOfPaymentTypeI }
             *     
             */
            public void setPassengerFormOfPayment(FormOfPaymentTypeI value) {
                this.passengerFormOfPayment = value;
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
     *         &lt;element name="pricingDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}PricingTicketingDetailsType"/>
     *         &lt;element name="extPricingDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
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
        "pricingDetails",
        "extPricingDetails"
    })
    public static class PricingOptionsGroup {

        @XmlElement(required = true)
        protected PricingTicketingDetailsType pricingDetails;
        protected FareQualifierDetailsTypeI extPricingDetails;

        /**
         * Gets the value of the pricingDetails property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public PricingTicketingDetailsType getPricingDetails() {
            return pricingDetails;
        }

        /**
         * Sets the value of the pricingDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public void setPricingDetails(PricingTicketingDetailsType value) {
            this.pricingDetails = value;
        }

        /**
         * Gets the value of the extPricingDetails property.
         * 
         * @return
         *     possible object is
         *     {@link FareQualifierDetailsTypeI }
         *     
         */
        public FareQualifierDetailsTypeI getExtPricingDetails() {
            return extPricingDetails;
        }

        /**
         * Sets the value of the extPricingDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareQualifierDetailsTypeI }
         *     
         */
        public void setExtPricingDetails(FareQualifierDetailsTypeI value) {
            this.extPricingDetails = value;
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
     *         &lt;element name="taxExempt" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}TaxTypeI"/>
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
        "taxExempt"
    })
    public static class TaxExemptGroup {

        @XmlElement(required = true)
        protected TaxTypeI taxExempt;

        /**
         * Gets the value of the taxExempt property.
         * 
         * @return
         *     possible object is
         *     {@link TaxTypeI }
         *     
         */
        public TaxTypeI getTaxExempt() {
            return taxExempt;
        }

        /**
         * Sets the value of the taxExempt property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxTypeI }
         *     
         */
        public void setTaxExempt(TaxTypeI value) {
            this.taxExempt = value;
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
     *         &lt;element name="originDestination" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}OriginAndDestinationDetailsTypeI"/>
     *         &lt;element name="segmentGroup" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="segmentInformation" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}TravelProductInformationTypeI"/>
     *                   &lt;element name="additionnalSegmentDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
     *                   &lt;element name="zapOffDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
     *                   &lt;element name="inventoryGroup" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="inventory" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}ProductInformationTypeI"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="pricePsgByFareBasisInfo" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="segmentRepetitionControl" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SegmentRepetitionControlType"/>
     *                             &lt;element name="specificTravellerDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SpecificTravellerTypeI_65902S" minOccurs="0"/>
     *                             &lt;element name="requestedPricingInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="fareInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareInformationType"/>
     *                                       &lt;element name="dateAndTimeInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}DateAndTimeInformationTypeI" minOccurs="0"/>
     *                                       &lt;element name="pricingByFareBasisInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareQualifierDetailsTypeI_82845S" minOccurs="0"/>
     *                                       &lt;element name="routingNumberInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareRouteInformationTypeI" minOccurs="0"/>
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
     *                   &lt;element name="trigger" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}DummySegmentTypeI"/>
     *                   &lt;element name="psgDetailsGroup" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}GroupPassengerDetailsType" maxOccurs="99" minOccurs="0"/>
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
        "originDestination",
        "segmentGroup"
    })
    public static class TripsGroup {

        @XmlElement(required = true)
        protected OriginAndDestinationDetailsTypeI originDestination;
        @XmlElement(required = true)
        protected List<FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup> segmentGroup;

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
         * Gets the value of the segmentGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup }
         * 
         * 
         */
        public List<FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup> getSegmentGroup() {
            if (segmentGroup == null) {
                segmentGroup = new ArrayList<FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup>();
            }
            return this.segmentGroup;
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
         *         &lt;element name="segmentInformation" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}TravelProductInformationTypeI"/>
         *         &lt;element name="additionnalSegmentDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
         *         &lt;element name="zapOffDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareQualifierDetailsTypeI" minOccurs="0"/>
         *         &lt;element name="inventoryGroup" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="inventory" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}ProductInformationTypeI"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="pricePsgByFareBasisInfo" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="segmentRepetitionControl" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SegmentRepetitionControlType"/>
         *                   &lt;element name="specificTravellerDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SpecificTravellerTypeI_65902S" minOccurs="0"/>
         *                   &lt;element name="requestedPricingInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="fareInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareInformationType"/>
         *                             &lt;element name="dateAndTimeInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}DateAndTimeInformationTypeI" minOccurs="0"/>
         *                             &lt;element name="pricingByFareBasisInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareQualifierDetailsTypeI_82845S" minOccurs="0"/>
         *                             &lt;element name="routingNumberInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareRouteInformationTypeI" minOccurs="0"/>
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
         *         &lt;element name="trigger" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}DummySegmentTypeI"/>
         *         &lt;element name="psgDetailsGroup" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}GroupPassengerDetailsType" maxOccurs="99" minOccurs="0"/>
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
            "additionnalSegmentDetails",
            "zapOffDetails",
            "inventoryGroup",
            "pricePsgByFareBasisInfo",
            "trigger",
            "psgDetailsGroup"
        })
        public static class SegmentGroup {

            @XmlElement(required = true)
            protected TravelProductInformationTypeI segmentInformation;
            protected AdditionalProductDetailsTypeI additionnalSegmentDetails;
            protected FareQualifierDetailsTypeI zapOffDetails;
            protected FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.InventoryGroup inventoryGroup;
            protected List<FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.PricePsgByFareBasisInfo> pricePsgByFareBasisInfo;
            @XmlElement(required = true)
            protected DummySegmentTypeI trigger;
            protected List<GroupPassengerDetailsType> psgDetailsGroup;

            /**
             * Gets the value of the segmentInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationTypeI }
             *     
             */
            public TravelProductInformationTypeI getSegmentInformation() {
                return segmentInformation;
            }

            /**
             * Sets the value of the segmentInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationTypeI }
             *     
             */
            public void setSegmentInformation(TravelProductInformationTypeI value) {
                this.segmentInformation = value;
            }

            /**
             * Gets the value of the additionnalSegmentDetails property.
             * 
             * @return
             *     possible object is
             *     {@link AdditionalProductDetailsTypeI }
             *     
             */
            public AdditionalProductDetailsTypeI getAdditionnalSegmentDetails() {
                return additionnalSegmentDetails;
            }

            /**
             * Sets the value of the additionnalSegmentDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalProductDetailsTypeI }
             *     
             */
            public void setAdditionnalSegmentDetails(AdditionalProductDetailsTypeI value) {
                this.additionnalSegmentDetails = value;
            }

            /**
             * Gets the value of the zapOffDetails property.
             * 
             * @return
             *     possible object is
             *     {@link FareQualifierDetailsTypeI }
             *     
             */
            public FareQualifierDetailsTypeI getZapOffDetails() {
                return zapOffDetails;
            }

            /**
             * Sets the value of the zapOffDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareQualifierDetailsTypeI }
             *     
             */
            public void setZapOffDetails(FareQualifierDetailsTypeI value) {
                this.zapOffDetails = value;
            }

            /**
             * Gets the value of the inventoryGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.InventoryGroup }
             *     
             */
            public FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.InventoryGroup getInventoryGroup() {
                return inventoryGroup;
            }

            /**
             * Sets the value of the inventoryGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.InventoryGroup }
             *     
             */
            public void setInventoryGroup(FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.InventoryGroup value) {
                this.inventoryGroup = value;
            }

            /**
             * Gets the value of the pricePsgByFareBasisInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pricePsgByFareBasisInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPricePsgByFareBasisInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.PricePsgByFareBasisInfo }
             * 
             * 
             */
            public List<FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.PricePsgByFareBasisInfo> getPricePsgByFareBasisInfo() {
                if (pricePsgByFareBasisInfo == null) {
                    pricePsgByFareBasisInfo = new ArrayList<FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.PricePsgByFareBasisInfo>();
                }
                return this.pricePsgByFareBasisInfo;
            }

            /**
             * Gets the value of the trigger property.
             * 
             * @return
             *     possible object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public DummySegmentTypeI getTrigger() {
                return trigger;
            }

            /**
             * Sets the value of the trigger property.
             * 
             * @param value
             *     allowed object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public void setTrigger(DummySegmentTypeI value) {
                this.trigger = value;
            }

            /**
             * Gets the value of the psgDetailsGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the psgDetailsGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPsgDetailsGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GroupPassengerDetailsType }
             * 
             * 
             */
            public List<GroupPassengerDetailsType> getPsgDetailsGroup() {
                if (psgDetailsGroup == null) {
                    psgDetailsGroup = new ArrayList<GroupPassengerDetailsType>();
                }
                return this.psgDetailsGroup;
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
             *         &lt;element name="inventory" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}ProductInformationTypeI"/>
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
                "inventory"
            })
            public static class InventoryGroup {

                @XmlElement(required = true)
                protected ProductInformationTypeI inventory;

                /**
                 * Gets the value of the inventory property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ProductInformationTypeI }
                 *     
                 */
                public ProductInformationTypeI getInventory() {
                    return inventory;
                }

                /**
                 * Sets the value of the inventory property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ProductInformationTypeI }
                 *     
                 */
                public void setInventory(ProductInformationTypeI value) {
                    this.inventory = value;
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
             *         &lt;element name="segmentRepetitionControl" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SegmentRepetitionControlType"/>
             *         &lt;element name="specificTravellerDetails" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}SpecificTravellerTypeI_65902S" minOccurs="0"/>
             *         &lt;element name="requestedPricingInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="fareInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareInformationType"/>
             *                   &lt;element name="dateAndTimeInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}DateAndTimeInformationTypeI" minOccurs="0"/>
             *                   &lt;element name="pricingByFareBasisInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareQualifierDetailsTypeI_82845S" minOccurs="0"/>
             *                   &lt;element name="routingNumberInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareRouteInformationTypeI" minOccurs="0"/>
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
                "segmentRepetitionControl",
                "specificTravellerDetails",
                "requestedPricingInfo"
            })
            public static class PricePsgByFareBasisInfo {

                @XmlElement(required = true)
                protected SegmentRepetitionControlType segmentRepetitionControl;
                protected SpecificTravellerTypeI65902S specificTravellerDetails;
                protected FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.PricePsgByFareBasisInfo.RequestedPricingInfo requestedPricingInfo;

                /**
                 * Gets the value of the segmentRepetitionControl property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SegmentRepetitionControlType }
                 *     
                 */
                public SegmentRepetitionControlType getSegmentRepetitionControl() {
                    return segmentRepetitionControl;
                }

                /**
                 * Sets the value of the segmentRepetitionControl property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SegmentRepetitionControlType }
                 *     
                 */
                public void setSegmentRepetitionControl(SegmentRepetitionControlType value) {
                    this.segmentRepetitionControl = value;
                }

                /**
                 * Gets the value of the specificTravellerDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SpecificTravellerTypeI65902S }
                 *     
                 */
                public SpecificTravellerTypeI65902S getSpecificTravellerDetails() {
                    return specificTravellerDetails;
                }

                /**
                 * Sets the value of the specificTravellerDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SpecificTravellerTypeI65902S }
                 *     
                 */
                public void setSpecificTravellerDetails(SpecificTravellerTypeI65902S value) {
                    this.specificTravellerDetails = value;
                }

                /**
                 * Gets the value of the requestedPricingInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.PricePsgByFareBasisInfo.RequestedPricingInfo }
                 *     
                 */
                public FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.PricePsgByFareBasisInfo.RequestedPricingInfo getRequestedPricingInfo() {
                    return requestedPricingInfo;
                }

                /**
                 * Sets the value of the requestedPricingInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.PricePsgByFareBasisInfo.RequestedPricingInfo }
                 *     
                 */
                public void setRequestedPricingInfo(FareInformativePricingWithoutPNR.TripsGroup.SegmentGroup.PricePsgByFareBasisInfo.RequestedPricingInfo value) {
                    this.requestedPricingInfo = value;
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
                 *         &lt;element name="fareInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareInformationType"/>
                 *         &lt;element name="dateAndTimeInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}DateAndTimeInformationTypeI" minOccurs="0"/>
                 *         &lt;element name="pricingByFareBasisInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareQualifierDetailsTypeI_82845S" minOccurs="0"/>
                 *         &lt;element name="routingNumberInfo" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}FareRouteInformationTypeI" minOccurs="0"/>
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
                    "fareInfo",
                    "dateAndTimeInfo",
                    "pricingByFareBasisInfo",
                    "routingNumberInfo"
                })
                public static class RequestedPricingInfo {

                    @XmlElement(required = true)
                    protected FareInformationType fareInfo;
                    protected DateAndTimeInformationTypeI dateAndTimeInfo;
                    protected FareQualifierDetailsTypeI82845S pricingByFareBasisInfo;
                    protected FareRouteInformationTypeI routingNumberInfo;

                    /**
                     * Gets the value of the fareInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareInformationType }
                     *     
                     */
                    public FareInformationType getFareInfo() {
                        return fareInfo;
                    }

                    /**
                     * Sets the value of the fareInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareInformationType }
                     *     
                     */
                    public void setFareInfo(FareInformationType value) {
                        this.fareInfo = value;
                    }

                    /**
                     * Gets the value of the dateAndTimeInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DateAndTimeInformationTypeI }
                     *     
                     */
                    public DateAndTimeInformationTypeI getDateAndTimeInfo() {
                        return dateAndTimeInfo;
                    }

                    /**
                     * Sets the value of the dateAndTimeInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DateAndTimeInformationTypeI }
                     *     
                     */
                    public void setDateAndTimeInfo(DateAndTimeInformationTypeI value) {
                        this.dateAndTimeInfo = value;
                    }

                    /**
                     * Gets the value of the pricingByFareBasisInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareQualifierDetailsTypeI82845S }
                     *     
                     */
                    public FareQualifierDetailsTypeI82845S getPricingByFareBasisInfo() {
                        return pricingByFareBasisInfo;
                    }

                    /**
                     * Sets the value of the pricingByFareBasisInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareQualifierDetailsTypeI82845S }
                     *     
                     */
                    public void setPricingByFareBasisInfo(FareQualifierDetailsTypeI82845S value) {
                        this.pricingByFareBasisInfo = value;
                    }

                    /**
                     * Gets the value of the routingNumberInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareRouteInformationTypeI }
                     *     
                     */
                    public FareRouteInformationTypeI getRoutingNumberInfo() {
                        return routingNumberInfo;
                    }

                    /**
                     * Sets the value of the routingNumberInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareRouteInformationTypeI }
                     *     
                     */
                    public void setRoutingNumberInfo(FareRouteInformationTypeI value) {
                        this.routingNumberInfo = value;
                    }

                }

            }

        }

    }

}
