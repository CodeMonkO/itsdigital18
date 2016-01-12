
package com.amadeus.xml.pnracc_14_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * cruise business data
 * 
 * <p>Java class for CruiseBusinessDataType_38250G complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CruiseBusinessDataType_38250G">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sailingShipInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ShipIdentificationType_132957S"/>
 *         &lt;element name="sailingProviderInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}CompanyInformationType_132953S"/>
 *         &lt;element name="sailingPortsInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}PlaceLocationIdentificationTypeU_132955S"/>
 *         &lt;element name="sailingDateInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredPeriodInformationType_8955S"/>
 *         &lt;element name="passengerInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TravellerInformationTypeI_132959S" maxOccurs="9"/>
 *         &lt;element name="bookingDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cruiseBookingReferenceInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ReservationControlInformationTypeI_132961S"/>
 *                   &lt;element name="bookingCompany" type="{http://xml.amadeus.com/PNRACC_14_1_1A}CompanyInformationType_132960S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bookingDate" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_20645S"/>
 *         &lt;element name="sailingGroupInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ItemReferencesAndVersionsType_132954S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CruiseBusinessDataType_38250G", propOrder = {
    "sailingShipInformation",
    "sailingProviderInformation",
    "sailingPortsInformation",
    "sailingDateInformation",
    "passengerInfo",
    "bookingDetails",
    "bookingDate",
    "sailingGroupInformation"
})
public class CruiseBusinessDataType38250G {

    @XmlElement(required = true)
    protected ShipIdentificationType132957S sailingShipInformation;
    @XmlElement(required = true)
    protected CompanyInformationType132953S sailingProviderInformation;
    @XmlElement(required = true)
    protected PlaceLocationIdentificationTypeU132955S sailingPortsInformation;
    @XmlElement(required = true)
    protected StructuredPeriodInformationType8955S sailingDateInformation;
    @XmlElement(required = true)
    protected List<TravellerInformationTypeI132959S> passengerInfo;
    protected CruiseBusinessDataType38250G.BookingDetails bookingDetails;
    @XmlElement(required = true)
    protected StructuredDateTimeInformationType20645S bookingDate;
    protected ItemReferencesAndVersionsType132954S sailingGroupInformation;

    /**
     * Gets the value of the sailingShipInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShipIdentificationType132957S }
     *     
     */
    public ShipIdentificationType132957S getSailingShipInformation() {
        return sailingShipInformation;
    }

    /**
     * Sets the value of the sailingShipInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipIdentificationType132957S }
     *     
     */
    public void setSailingShipInformation(ShipIdentificationType132957S value) {
        this.sailingShipInformation = value;
    }

    /**
     * Gets the value of the sailingProviderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType132953S }
     *     
     */
    public CompanyInformationType132953S getSailingProviderInformation() {
        return sailingProviderInformation;
    }

    /**
     * Sets the value of the sailingProviderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType132953S }
     *     
     */
    public void setSailingProviderInformation(CompanyInformationType132953S value) {
        this.sailingProviderInformation = value;
    }

    /**
     * Gets the value of the sailingPortsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentificationTypeU132955S }
     *     
     */
    public PlaceLocationIdentificationTypeU132955S getSailingPortsInformation() {
        return sailingPortsInformation;
    }

    /**
     * Sets the value of the sailingPortsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentificationTypeU132955S }
     *     
     */
    public void setSailingPortsInformation(PlaceLocationIdentificationTypeU132955S value) {
        this.sailingPortsInformation = value;
    }

    /**
     * Gets the value of the sailingDateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredPeriodInformationType8955S }
     *     
     */
    public StructuredPeriodInformationType8955S getSailingDateInformation() {
        return sailingDateInformation;
    }

    /**
     * Sets the value of the sailingDateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredPeriodInformationType8955S }
     *     
     */
    public void setSailingDateInformation(StructuredPeriodInformationType8955S value) {
        this.sailingDateInformation = value;
    }

    /**
     * Gets the value of the passengerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravellerInformationTypeI132959S }
     * 
     * 
     */
    public List<TravellerInformationTypeI132959S> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<TravellerInformationTypeI132959S>();
        }
        return this.passengerInfo;
    }

    /**
     * Gets the value of the bookingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseBusinessDataType38250G.BookingDetails }
     *     
     */
    public CruiseBusinessDataType38250G.BookingDetails getBookingDetails() {
        return bookingDetails;
    }

    /**
     * Sets the value of the bookingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseBusinessDataType38250G.BookingDetails }
     *     
     */
    public void setBookingDetails(CruiseBusinessDataType38250G.BookingDetails value) {
        this.bookingDetails = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType20645S }
     *     
     */
    public StructuredDateTimeInformationType20645S getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType20645S }
     *     
     */
    public void setBookingDate(StructuredDateTimeInformationType20645S value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the sailingGroupInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReferencesAndVersionsType132954S }
     *     
     */
    public ItemReferencesAndVersionsType132954S getSailingGroupInformation() {
        return sailingGroupInformation;
    }

    /**
     * Sets the value of the sailingGroupInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReferencesAndVersionsType132954S }
     *     
     */
    public void setSailingGroupInformation(ItemReferencesAndVersionsType132954S value) {
        this.sailingGroupInformation = value;
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
     *         &lt;element name="cruiseBookingReferenceInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ReservationControlInformationTypeI_132961S"/>
     *         &lt;element name="bookingCompany" type="{http://xml.amadeus.com/PNRACC_14_1_1A}CompanyInformationType_132960S" minOccurs="0"/>
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
        "cruiseBookingReferenceInfo",
        "bookingCompany"
    })
    public static class BookingDetails {

        @XmlElement(required = true)
        protected ReservationControlInformationTypeI132961S cruiseBookingReferenceInfo;
        protected CompanyInformationType132960S bookingCompany;

        /**
         * Gets the value of the cruiseBookingReferenceInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationControlInformationTypeI132961S }
         *     
         */
        public ReservationControlInformationTypeI132961S getCruiseBookingReferenceInfo() {
            return cruiseBookingReferenceInfo;
        }

        /**
         * Sets the value of the cruiseBookingReferenceInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationControlInformationTypeI132961S }
         *     
         */
        public void setCruiseBookingReferenceInfo(ReservationControlInformationTypeI132961S value) {
            this.cruiseBookingReferenceInfo = value;
        }

        /**
         * Gets the value of the bookingCompany property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyInformationType132960S }
         *     
         */
        public CompanyInformationType132960S getBookingCompany() {
            return bookingCompany;
        }

        /**
         * Sets the value of the bookingCompany property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyInformationType132960S }
         *     
         */
        public void setBookingCompany(CompanyInformationType132960S value) {
            this.bookingCompany = value;
        }

    }

}
