
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an address
 * 
 * <p>Java class for AddressType_129098S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType_129098S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressUsageDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AddressUsageTypeU" minOccurs="0"/>
 *         &lt;element name="addressDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AddressDetailsTypeU" minOccurs="0"/>
 *         &lt;element name="city" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="regionDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}CountrySubEntityDetailsTypeU_188109C" minOccurs="0"/>
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}LocationIdentificationTypeU_188107C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType_129098S", propOrder = {
    "addressUsageDetails",
    "addressDetails",
    "city",
    "zipCode",
    "countryCode",
    "regionDetails",
    "locationDetails"
})
public class AddressType129098S {

    protected AddressUsageTypeU addressUsageDetails;
    protected AddressDetailsTypeU addressDetails;
    protected String city;
    protected String zipCode;
    protected String countryCode;
    protected CountrySubEntityDetailsTypeU188109C regionDetails;
    protected LocationIdentificationTypeU188107C locationDetails;

    /**
     * Gets the value of the addressUsageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUsageTypeU }
     *     
     */
    public AddressUsageTypeU getAddressUsageDetails() {
        return addressUsageDetails;
    }

    /**
     * Sets the value of the addressUsageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUsageTypeU }
     *     
     */
    public void setAddressUsageDetails(AddressUsageTypeU value) {
        this.addressUsageDetails = value;
    }

    /**
     * Gets the value of the addressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailsTypeU }
     *     
     */
    public AddressDetailsTypeU getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailsTypeU }
     *     
     */
    public void setAddressDetails(AddressDetailsTypeU value) {
        this.addressDetails = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the regionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubEntityDetailsTypeU188109C }
     *     
     */
    public CountrySubEntityDetailsTypeU188109C getRegionDetails() {
        return regionDetails;
    }

    /**
     * Sets the value of the regionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubEntityDetailsTypeU188109C }
     *     
     */
    public void setRegionDetails(CountrySubEntityDetailsTypeU188109C value) {
        this.regionDetails = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentificationTypeU188107C }
     *     
     */
    public LocationIdentificationTypeU188107C getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentificationTypeU188107C }
     *     
     */
    public void setLocationDetails(LocationIdentificationTypeU188107C value) {
        this.locationDetails = value;
    }

}
