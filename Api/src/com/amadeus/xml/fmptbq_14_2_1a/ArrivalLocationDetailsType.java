
package com.amadeus.xml.fmptbq_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrivalLocationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrivalLocationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distance" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="distanceUnit" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length0To3" minOccurs="0"/>
 *         &lt;element name="locationId" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length3To5" minOccurs="0"/>
 *         &lt;element name="airportCityQualifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="latitude" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length6To6" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length6To6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrivalLocationDetailsType", propOrder = {
    "distance",
    "distanceUnit",
    "locationId",
    "airportCityQualifier",
    "latitude",
    "longitude"
})
public class ArrivalLocationDetailsType {

    protected BigInteger distance;
    protected String distanceUnit;
    protected String locationId;
    protected String airportCityQualifier;
    protected String latitude;
    protected String longitude;

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDistance(BigInteger value) {
        this.distance = value;
    }

    /**
     * Gets the value of the distanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * Sets the value of the distanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnit(String value) {
        this.distanceUnit = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationId(String value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the airportCityQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCityQualifier() {
        return airportCityQualifier;
    }

    /**
     * Sets the value of the airportCityQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCityQualifier(String value) {
        this.airportCityQualifier = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

}
