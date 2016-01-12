
package com.amadeus.xml.tpcbrq_12_4_1a;

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
 *         &lt;element name="pnrLocatorData" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReservationControlInformationTypeI" minOccurs="0"/>
 *         &lt;element name="paxSegReference" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationTypeI_94605S" minOccurs="0"/>
 *         &lt;element name="overrideInformation" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}CodedAttributeType"/>
 *         &lt;element name="dateOverride" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}StructuredDateTimeInformationType" minOccurs="0"/>
 *         &lt;element name="validatingCarrier" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}TransportIdentifierType" minOccurs="0"/>
 *         &lt;element name="cityOverride" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}PointOfSaleInformationTypeU" minOccurs="0"/>
 *         &lt;element name="currencyOverride" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ConversionRateTypeI" minOccurs="0"/>
 *         &lt;element name="taxDetails" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}DutyTaxFeeDetailsTypeU" maxOccurs="60" minOccurs="0"/>
 *         &lt;element name="discountInformation" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="penDisInformation" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}DiscountAndPenaltyInformationTypeI"/>
 *                   &lt;element name="referenceQualifier" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationTypeI_94606S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pricingFareBase" maxOccurs="1584" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fareBasisOptions" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}FareQualifierDetailsTypeI"/>
 *                   &lt;element name="fareBasisSegReference" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationTypeI_94606S" minOccurs="0"/>
 *                   &lt;element name="fareBasisDates" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}StructuredDateTimeInformationType_94602S" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="passengerTattoo" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationType_94604S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="flightInformation" maxOccurs="16" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itineraryOptions" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}TravelItineraryInformationTypeI"/>
 *                   &lt;element name="itinerarySegReference" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationTypeI_94610S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="openSegmentsInformation" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="extendedItinerary" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}TravelProductInformationTypeI"/>
 *                   &lt;element name="extendedItinerarySegReference" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationTypeI_94610S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bookingClassSelection" maxOccurs="16" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bookingClassList" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ProductInformationTypeI"/>
 *                   &lt;element name="bookCodeSegAsso" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationTypeI"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="fopInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fop" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}FormOfPaymentTypeI"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="carrierAgreements" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}CommercialAgreementsTypeI" minOccurs="0"/>
 *         &lt;element name="frequentFlyerInformation" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flequentFlyerdetails" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}FrequentTravellerIdentificationCodeType"/>
 *                   &lt;element name="passengerReference" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationType" minOccurs="0"/>
 *                   &lt;element name="flightReference" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="instantPricingOption" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}MonetaryInformationType" minOccurs="0"/>
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
    "pnrLocatorData",
    "paxSegReference",
    "overrideInformation",
    "dateOverride",
    "validatingCarrier",
    "cityOverride",
    "currencyOverride",
    "taxDetails",
    "discountInformation",
    "pricingFareBase",
    "flightInformation",
    "openSegmentsInformation",
    "bookingClassSelection",
    "fopInformation",
    "carrierAgreements",
    "frequentFlyerInformation",
    "instantPricingOption"
})
@XmlRootElement(name = "Fare_PricePNRWithBookingClass")
public class FarePricePNRWithBookingClass {

    protected ReservationControlInformationTypeI pnrLocatorData;
    protected ReferenceInformationTypeI94605S paxSegReference;
    @XmlElement(required = true)
    protected CodedAttributeType overrideInformation;
    protected StructuredDateTimeInformationType dateOverride;
    protected TransportIdentifierType validatingCarrier;
    protected PointOfSaleInformationTypeU cityOverride;
    protected ConversionRateTypeI currencyOverride;
    protected List<DutyTaxFeeDetailsTypeU> taxDetails;
    protected List<FarePricePNRWithBookingClass.DiscountInformation> discountInformation;
    protected List<FarePricePNRWithBookingClass.PricingFareBase> pricingFareBase;
    protected List<FarePricePNRWithBookingClass.FlightInformation> flightInformation;
    protected List<FarePricePNRWithBookingClass.OpenSegmentsInformation> openSegmentsInformation;
    protected List<FarePricePNRWithBookingClass.BookingClassSelection> bookingClassSelection;
    protected FarePricePNRWithBookingClass.FopInformation fopInformation;
    protected CommercialAgreementsTypeI carrierAgreements;
    protected List<FarePricePNRWithBookingClass.FrequentFlyerInformation> frequentFlyerInformation;
    protected MonetaryInformationType instantPricingOption;

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
     * Gets the value of the paxSegReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformationTypeI94605S }
     *     
     */
    public ReferenceInformationTypeI94605S getPaxSegReference() {
        return paxSegReference;
    }

    /**
     * Sets the value of the paxSegReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformationTypeI94605S }
     *     
     */
    public void setPaxSegReference(ReferenceInformationTypeI94605S value) {
        this.paxSegReference = value;
    }

    /**
     * Gets the value of the overrideInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getOverrideInformation() {
        return overrideInformation;
    }

    /**
     * Sets the value of the overrideInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setOverrideInformation(CodedAttributeType value) {
        this.overrideInformation = value;
    }

    /**
     * Gets the value of the dateOverride property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType }
     *     
     */
    public StructuredDateTimeInformationType getDateOverride() {
        return dateOverride;
    }

    /**
     * Sets the value of the dateOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType }
     *     
     */
    public void setDateOverride(StructuredDateTimeInformationType value) {
        this.dateOverride = value;
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
     * Gets the value of the cityOverride property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSaleInformationTypeU }
     *     
     */
    public PointOfSaleInformationTypeU getCityOverride() {
        return cityOverride;
    }

    /**
     * Sets the value of the cityOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSaleInformationTypeU }
     *     
     */
    public void setCityOverride(PointOfSaleInformationTypeU value) {
        this.cityOverride = value;
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
     * Gets the value of the taxDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DutyTaxFeeDetailsTypeU }
     * 
     * 
     */
    public List<DutyTaxFeeDetailsTypeU> getTaxDetails() {
        if (taxDetails == null) {
            taxDetails = new ArrayList<DutyTaxFeeDetailsTypeU>();
        }
        return this.taxDetails;
    }

    /**
     * Gets the value of the discountInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePricePNRWithBookingClass.DiscountInformation }
     * 
     * 
     */
    public List<FarePricePNRWithBookingClass.DiscountInformation> getDiscountInformation() {
        if (discountInformation == null) {
            discountInformation = new ArrayList<FarePricePNRWithBookingClass.DiscountInformation>();
        }
        return this.discountInformation;
    }

    /**
     * Gets the value of the pricingFareBase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingFareBase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingFareBase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePricePNRWithBookingClass.PricingFareBase }
     * 
     * 
     */
    public List<FarePricePNRWithBookingClass.PricingFareBase> getPricingFareBase() {
        if (pricingFareBase == null) {
            pricingFareBase = new ArrayList<FarePricePNRWithBookingClass.PricingFareBase>();
        }
        return this.pricingFareBase;
    }

    /**
     * Gets the value of the flightInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePricePNRWithBookingClass.FlightInformation }
     * 
     * 
     */
    public List<FarePricePNRWithBookingClass.FlightInformation> getFlightInformation() {
        if (flightInformation == null) {
            flightInformation = new ArrayList<FarePricePNRWithBookingClass.FlightInformation>();
        }
        return this.flightInformation;
    }

    /**
     * Gets the value of the openSegmentsInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openSegmentsInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenSegmentsInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePricePNRWithBookingClass.OpenSegmentsInformation }
     * 
     * 
     */
    public List<FarePricePNRWithBookingClass.OpenSegmentsInformation> getOpenSegmentsInformation() {
        if (openSegmentsInformation == null) {
            openSegmentsInformation = new ArrayList<FarePricePNRWithBookingClass.OpenSegmentsInformation>();
        }
        return this.openSegmentsInformation;
    }

    /**
     * Gets the value of the bookingClassSelection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingClassSelection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingClassSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePricePNRWithBookingClass.BookingClassSelection }
     * 
     * 
     */
    public List<FarePricePNRWithBookingClass.BookingClassSelection> getBookingClassSelection() {
        if (bookingClassSelection == null) {
            bookingClassSelection = new ArrayList<FarePricePNRWithBookingClass.BookingClassSelection>();
        }
        return this.bookingClassSelection;
    }

    /**
     * Gets the value of the fopInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FarePricePNRWithBookingClass.FopInformation }
     *     
     */
    public FarePricePNRWithBookingClass.FopInformation getFopInformation() {
        return fopInformation;
    }

    /**
     * Sets the value of the fopInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePricePNRWithBookingClass.FopInformation }
     *     
     */
    public void setFopInformation(FarePricePNRWithBookingClass.FopInformation value) {
        this.fopInformation = value;
    }

    /**
     * Gets the value of the carrierAgreements property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialAgreementsTypeI }
     *     
     */
    public CommercialAgreementsTypeI getCarrierAgreements() {
        return carrierAgreements;
    }

    /**
     * Sets the value of the carrierAgreements property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialAgreementsTypeI }
     *     
     */
    public void setCarrierAgreements(CommercialAgreementsTypeI value) {
        this.carrierAgreements = value;
    }

    /**
     * Gets the value of the frequentFlyerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frequentFlyerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrequentFlyerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FarePricePNRWithBookingClass.FrequentFlyerInformation }
     * 
     * 
     */
    public List<FarePricePNRWithBookingClass.FrequentFlyerInformation> getFrequentFlyerInformation() {
        if (frequentFlyerInformation == null) {
            frequentFlyerInformation = new ArrayList<FarePricePNRWithBookingClass.FrequentFlyerInformation>();
        }
        return this.frequentFlyerInformation;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="bookingClassList" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ProductInformationTypeI"/>
     *         &lt;element name="bookCodeSegAsso" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationTypeI"/>
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
        "bookingClassList",
        "bookCodeSegAsso"
    })
    public static class BookingClassSelection {

        @XmlElement(required = true)
        protected ProductInformationTypeI bookingClassList;
        @XmlElement(required = true)
        protected ReferenceInformationTypeI bookCodeSegAsso;

        /**
         * Gets the value of the bookingClassList property.
         * 
         * @return
         *     possible object is
         *     {@link ProductInformationTypeI }
         *     
         */
        public ProductInformationTypeI getBookingClassList() {
            return bookingClassList;
        }

        /**
         * Sets the value of the bookingClassList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProductInformationTypeI }
         *     
         */
        public void setBookingClassList(ProductInformationTypeI value) {
            this.bookingClassList = value;
        }

        /**
         * Gets the value of the bookCodeSegAsso property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationTypeI }
         *     
         */
        public ReferenceInformationTypeI getBookCodeSegAsso() {
            return bookCodeSegAsso;
        }

        /**
         * Sets the value of the bookCodeSegAsso property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationTypeI }
         *     
         */
        public void setBookCodeSegAsso(ReferenceInformationTypeI value) {
            this.bookCodeSegAsso = value;
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
     *         &lt;element name="penDisInformation" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}DiscountAndPenaltyInformationTypeI"/>
     *         &lt;element name="referenceQualifier" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationTypeI_94606S" minOccurs="0"/>
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
        "referenceQualifier"
    })
    public static class DiscountInformation {

        @XmlElement(required = true)
        protected DiscountAndPenaltyInformationTypeI penDisInformation;
        protected ReferenceInformationTypeI94606S referenceQualifier;

        /**
         * Gets the value of the penDisInformation property.
         * 
         * @return
         *     possible object is
         *     {@link DiscountAndPenaltyInformationTypeI }
         *     
         */
        public DiscountAndPenaltyInformationTypeI getPenDisInformation() {
            return penDisInformation;
        }

        /**
         * Sets the value of the penDisInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link DiscountAndPenaltyInformationTypeI }
         *     
         */
        public void setPenDisInformation(DiscountAndPenaltyInformationTypeI value) {
            this.penDisInformation = value;
        }

        /**
         * Gets the value of the referenceQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationTypeI94606S }
         *     
         */
        public ReferenceInformationTypeI94606S getReferenceQualifier() {
            return referenceQualifier;
        }

        /**
         * Sets the value of the referenceQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationTypeI94606S }
         *     
         */
        public void setReferenceQualifier(ReferenceInformationTypeI94606S value) {
            this.referenceQualifier = value;
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
     *         &lt;element name="itineraryOptions" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}TravelItineraryInformationTypeI"/>
     *         &lt;element name="itinerarySegReference" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationTypeI_94610S" minOccurs="0"/>
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
        "itineraryOptions",
        "itinerarySegReference"
    })
    public static class FlightInformation {

        @XmlElement(required = true)
        protected TravelItineraryInformationTypeI itineraryOptions;
        protected ReferenceInformationTypeI94610S itinerarySegReference;

        /**
         * Gets the value of the itineraryOptions property.
         * 
         * @return
         *     possible object is
         *     {@link TravelItineraryInformationTypeI }
         *     
         */
        public TravelItineraryInformationTypeI getItineraryOptions() {
            return itineraryOptions;
        }

        /**
         * Sets the value of the itineraryOptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelItineraryInformationTypeI }
         *     
         */
        public void setItineraryOptions(TravelItineraryInformationTypeI value) {
            this.itineraryOptions = value;
        }

        /**
         * Gets the value of the itinerarySegReference property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationTypeI94610S }
         *     
         */
        public ReferenceInformationTypeI94610S getItinerarySegReference() {
            return itinerarySegReference;
        }

        /**
         * Sets the value of the itinerarySegReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationTypeI94610S }
         *     
         */
        public void setItinerarySegReference(ReferenceInformationTypeI94610S value) {
            this.itinerarySegReference = value;
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
     *         &lt;element name="fop" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}FormOfPaymentTypeI"/>
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
        "fop"
    })
    public static class FopInformation {

        @XmlElement(required = true)
        protected FormOfPaymentTypeI fop;

        /**
         * Gets the value of the fop property.
         * 
         * @return
         *     possible object is
         *     {@link FormOfPaymentTypeI }
         *     
         */
        public FormOfPaymentTypeI getFop() {
            return fop;
        }

        /**
         * Sets the value of the fop property.
         * 
         * @param value
         *     allowed object is
         *     {@link FormOfPaymentTypeI }
         *     
         */
        public void setFop(FormOfPaymentTypeI value) {
            this.fop = value;
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
     *         &lt;element name="flequentFlyerdetails" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}FrequentTravellerIdentificationCodeType"/>
     *         &lt;element name="passengerReference" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationType" minOccurs="0"/>
     *         &lt;element name="flightReference" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInfoType" minOccurs="0"/>
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
        "flequentFlyerdetails",
        "passengerReference",
        "flightReference"
    })
    public static class FrequentFlyerInformation {

        @XmlElement(required = true)
        protected FrequentTravellerIdentificationCodeType flequentFlyerdetails;
        protected ReferenceInformationType passengerReference;
        protected ReferenceInfoType flightReference;

        /**
         * Gets the value of the flequentFlyerdetails property.
         * 
         * @return
         *     possible object is
         *     {@link FrequentTravellerIdentificationCodeType }
         *     
         */
        public FrequentTravellerIdentificationCodeType getFlequentFlyerdetails() {
            return flequentFlyerdetails;
        }

        /**
         * Sets the value of the flequentFlyerdetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link FrequentTravellerIdentificationCodeType }
         *     
         */
        public void setFlequentFlyerdetails(FrequentTravellerIdentificationCodeType value) {
            this.flequentFlyerdetails = value;
        }

        /**
         * Gets the value of the passengerReference property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationType }
         *     
         */
        public ReferenceInformationType getPassengerReference() {
            return passengerReference;
        }

        /**
         * Sets the value of the passengerReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationType }
         *     
         */
        public void setPassengerReference(ReferenceInformationType value) {
            this.passengerReference = value;
        }

        /**
         * Gets the value of the flightReference property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType }
         *     
         */
        public ReferenceInfoType getFlightReference() {
            return flightReference;
        }

        /**
         * Sets the value of the flightReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType }
         *     
         */
        public void setFlightReference(ReferenceInfoType value) {
            this.flightReference = value;
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
     *         &lt;element name="extendedItinerary" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}TravelProductInformationTypeI"/>
     *         &lt;element name="extendedItinerarySegReference" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationTypeI_94610S" minOccurs="0"/>
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
        "extendedItinerary",
        "extendedItinerarySegReference"
    })
    public static class OpenSegmentsInformation {

        @XmlElement(required = true)
        protected TravelProductInformationTypeI extendedItinerary;
        protected ReferenceInformationTypeI94610S extendedItinerarySegReference;

        /**
         * Gets the value of the extendedItinerary property.
         * 
         * @return
         *     possible object is
         *     {@link TravelProductInformationTypeI }
         *     
         */
        public TravelProductInformationTypeI getExtendedItinerary() {
            return extendedItinerary;
        }

        /**
         * Sets the value of the extendedItinerary property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelProductInformationTypeI }
         *     
         */
        public void setExtendedItinerary(TravelProductInformationTypeI value) {
            this.extendedItinerary = value;
        }

        /**
         * Gets the value of the extendedItinerarySegReference property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationTypeI94610S }
         *     
         */
        public ReferenceInformationTypeI94610S getExtendedItinerarySegReference() {
            return extendedItinerarySegReference;
        }

        /**
         * Sets the value of the extendedItinerarySegReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationTypeI94610S }
         *     
         */
        public void setExtendedItinerarySegReference(ReferenceInformationTypeI94610S value) {
            this.extendedItinerarySegReference = value;
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
     *         &lt;element name="fareBasisOptions" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}FareQualifierDetailsTypeI"/>
     *         &lt;element name="fareBasisSegReference" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationTypeI_94606S" minOccurs="0"/>
     *         &lt;element name="fareBasisDates" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}StructuredDateTimeInformationType_94602S" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="passengerTattoo" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferenceInformationType_94604S" minOccurs="0"/>
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
        "fareBasisOptions",
        "fareBasisSegReference",
        "fareBasisDates",
        "passengerTattoo"
    })
    public static class PricingFareBase {

        @XmlElement(required = true)
        protected FareQualifierDetailsTypeI fareBasisOptions;
        protected ReferenceInformationTypeI94606S fareBasisSegReference;
        protected List<StructuredDateTimeInformationType94602S> fareBasisDates;
        protected ReferenceInformationType94604S passengerTattoo;

        /**
         * Gets the value of the fareBasisOptions property.
         * 
         * @return
         *     possible object is
         *     {@link FareQualifierDetailsTypeI }
         *     
         */
        public FareQualifierDetailsTypeI getFareBasisOptions() {
            return fareBasisOptions;
        }

        /**
         * Sets the value of the fareBasisOptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareQualifierDetailsTypeI }
         *     
         */
        public void setFareBasisOptions(FareQualifierDetailsTypeI value) {
            this.fareBasisOptions = value;
        }

        /**
         * Gets the value of the fareBasisSegReference property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationTypeI94606S }
         *     
         */
        public ReferenceInformationTypeI94606S getFareBasisSegReference() {
            return fareBasisSegReference;
        }

        /**
         * Sets the value of the fareBasisSegReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationTypeI94606S }
         *     
         */
        public void setFareBasisSegReference(ReferenceInformationTypeI94606S value) {
            this.fareBasisSegReference = value;
        }

        /**
         * Gets the value of the fareBasisDates property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareBasisDates property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareBasisDates().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredDateTimeInformationType94602S }
         * 
         * 
         */
        public List<StructuredDateTimeInformationType94602S> getFareBasisDates() {
            if (fareBasisDates == null) {
                fareBasisDates = new ArrayList<StructuredDateTimeInformationType94602S>();
            }
            return this.fareBasisDates;
        }

        /**
         * Gets the value of the passengerTattoo property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInformationType94604S }
         *     
         */
        public ReferenceInformationType94604S getPassengerTattoo() {
            return passengerTattoo;
        }

        /**
         * Sets the value of the passengerTattoo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInformationType94604S }
         *     
         */
        public void setPassengerTattoo(ReferenceInformationType94604S value) {
            this.passengerTattoo = value;
        }

    }

}
