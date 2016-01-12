
package com.amadeus.xml.tpcbrq_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a segment of an itinerary and related details.
 * 
 * <p>Java class for TravelItineraryInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelItineraryInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="globalRoute" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="bookingClass" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="flightDetails" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ProductTypeDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelItineraryInformationTypeI", propOrder = {
    "globalRoute",
    "bookingClass",
    "flightDetails"
})
public class TravelItineraryInformationTypeI {

    protected String globalRoute;
    protected String bookingClass;
    protected ProductTypeDetailsTypeI flightDetails;

    /**
     * Gets the value of the globalRoute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalRoute() {
        return globalRoute;
    }

    /**
     * Sets the value of the globalRoute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalRoute(String value) {
        this.globalRoute = value;
    }

    /**
     * Gets the value of the bookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingClass() {
        return bookingClass;
    }

    /**
     * Sets the value of the bookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingClass(String value) {
        this.bookingClass = value;
    }

    /**
     * Gets the value of the flightDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public ProductTypeDetailsTypeI getFlightDetails() {
        return flightDetails;
    }

    /**
     * Sets the value of the flightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public void setFlightDetails(ProductTypeDetailsTypeI value) {
        this.flightDetails = value;
    }

}
