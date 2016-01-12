
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * cruise Extended Content
 * 
 * <p>Java class for CruiseExtendedContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CruiseExtendedContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sailingShipInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ShipIdentificationType"/>
 *         &lt;element name="sailingdetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sailingDateInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredPeriodInformationType_128716S"/>
 *                   &lt;element name="checkintimeInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_128714S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sailingPortsInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}PlaceLocationIdentificationType_128824S"/>
 *         &lt;element name="cruiseNumber" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
 *         &lt;element name="cabinDescription" type="{http://xml.amadeus.com/PNRACC_14_1_1A}CabinDescriptionType" minOccurs="0"/>
 *         &lt;element name="bookingDate" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_128714S" minOccurs="0"/>
 *         &lt;element name="ticketdetailsgroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TicketNumberType_128754S"/>
 *                   &lt;element name="ticketIssuancedate" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_128714S" minOccurs="0"/>
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
@XmlType(name = "CruiseExtendedContentType", propOrder = {
    "sailingShipInformation",
    "sailingdetails",
    "sailingPortsInformation",
    "cruiseNumber",
    "cabinDescription",
    "bookingDate",
    "ticketdetailsgroup"
})
public class CruiseExtendedContentType {

    @XmlElement(required = true)
    protected ShipIdentificationType sailingShipInformation;
    @XmlElement(required = true)
    protected CruiseExtendedContentType.Sailingdetails sailingdetails;
    @XmlElement(required = true)
    protected PlaceLocationIdentificationType128824S sailingPortsInformation;
    protected ItemReferencesAndVersionsType cruiseNumber;
    protected CabinDescriptionType cabinDescription;
    protected StructuredDateTimeInformationType128714S bookingDate;
    protected CruiseExtendedContentType.Ticketdetailsgroup ticketdetailsgroup;

    /**
     * Gets the value of the sailingShipInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShipIdentificationType }
     *     
     */
    public ShipIdentificationType getSailingShipInformation() {
        return sailingShipInformation;
    }

    /**
     * Sets the value of the sailingShipInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipIdentificationType }
     *     
     */
    public void setSailingShipInformation(ShipIdentificationType value) {
        this.sailingShipInformation = value;
    }

    /**
     * Gets the value of the sailingdetails property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseExtendedContentType.Sailingdetails }
     *     
     */
    public CruiseExtendedContentType.Sailingdetails getSailingdetails() {
        return sailingdetails;
    }

    /**
     * Sets the value of the sailingdetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseExtendedContentType.Sailingdetails }
     *     
     */
    public void setSailingdetails(CruiseExtendedContentType.Sailingdetails value) {
        this.sailingdetails = value;
    }

    /**
     * Gets the value of the sailingPortsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentificationType128824S }
     *     
     */
    public PlaceLocationIdentificationType128824S getSailingPortsInformation() {
        return sailingPortsInformation;
    }

    /**
     * Sets the value of the sailingPortsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentificationType128824S }
     *     
     */
    public void setSailingPortsInformation(PlaceLocationIdentificationType128824S value) {
        this.sailingPortsInformation = value;
    }

    /**
     * Gets the value of the cruiseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReferencesAndVersionsType }
     *     
     */
    public ItemReferencesAndVersionsType getCruiseNumber() {
        return cruiseNumber;
    }

    /**
     * Sets the value of the cruiseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReferencesAndVersionsType }
     *     
     */
    public void setCruiseNumber(ItemReferencesAndVersionsType value) {
        this.cruiseNumber = value;
    }

    /**
     * Gets the value of the cabinDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CabinDescriptionType }
     *     
     */
    public CabinDescriptionType getCabinDescription() {
        return cabinDescription;
    }

    /**
     * Sets the value of the cabinDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinDescriptionType }
     *     
     */
    public void setCabinDescription(CabinDescriptionType value) {
        this.cabinDescription = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType128714S }
     *     
     */
    public StructuredDateTimeInformationType128714S getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType128714S }
     *     
     */
    public void setBookingDate(StructuredDateTimeInformationType128714S value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the ticketdetailsgroup property.
     * 
     * @return
     *     possible object is
     *     {@link CruiseExtendedContentType.Ticketdetailsgroup }
     *     
     */
    public CruiseExtendedContentType.Ticketdetailsgroup getTicketdetailsgroup() {
        return ticketdetailsgroup;
    }

    /**
     * Sets the value of the ticketdetailsgroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link CruiseExtendedContentType.Ticketdetailsgroup }
     *     
     */
    public void setTicketdetailsgroup(CruiseExtendedContentType.Ticketdetailsgroup value) {
        this.ticketdetailsgroup = value;
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
     *         &lt;element name="sailingDateInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredPeriodInformationType_128716S"/>
     *         &lt;element name="checkintimeInfo" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_128714S" minOccurs="0"/>
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
        "sailingDateInformation",
        "checkintimeInfo"
    })
    public static class Sailingdetails {

        @XmlElement(required = true)
        protected StructuredPeriodInformationType128716S sailingDateInformation;
        protected StructuredDateTimeInformationType128714S checkintimeInfo;

        /**
         * Gets the value of the sailingDateInformation property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredPeriodInformationType128716S }
         *     
         */
        public StructuredPeriodInformationType128716S getSailingDateInformation() {
            return sailingDateInformation;
        }

        /**
         * Sets the value of the sailingDateInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredPeriodInformationType128716S }
         *     
         */
        public void setSailingDateInformation(StructuredPeriodInformationType128716S value) {
            this.sailingDateInformation = value;
        }

        /**
         * Gets the value of the checkintimeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType128714S }
         *     
         */
        public StructuredDateTimeInformationType128714S getCheckintimeInfo() {
            return checkintimeInfo;
        }

        /**
         * Sets the value of the checkintimeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType128714S }
         *     
         */
        public void setCheckintimeInfo(StructuredDateTimeInformationType128714S value) {
            this.checkintimeInfo = value;
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
     *         &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TicketNumberType_128754S"/>
     *         &lt;element name="ticketIssuancedate" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StructuredDateTimeInformationType_128714S" minOccurs="0"/>
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
        "ticketNumber",
        "ticketIssuancedate"
    })
    public static class Ticketdetailsgroup {

        @XmlElement(required = true)
        protected TicketNumberType128754S ticketNumber;
        protected StructuredDateTimeInformationType128714S ticketIssuancedate;

        /**
         * Gets the value of the ticketNumber property.
         * 
         * @return
         *     possible object is
         *     {@link TicketNumberType128754S }
         *     
         */
        public TicketNumberType128754S getTicketNumber() {
            return ticketNumber;
        }

        /**
         * Sets the value of the ticketNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketNumberType128754S }
         *     
         */
        public void setTicketNumber(TicketNumberType128754S value) {
            this.ticketNumber = value;
        }

        /**
         * Gets the value of the ticketIssuancedate property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType128714S }
         *     
         */
        public StructuredDateTimeInformationType128714S getTicketIssuancedate() {
            return ticketIssuancedate;
        }

        /**
         * Sets the value of the ticketIssuancedate property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType128714S }
         *     
         */
        public void setTicketIssuancedate(StructuredDateTimeInformationType128714S value) {
            this.ticketIssuancedate = value;
        }

    }

}
