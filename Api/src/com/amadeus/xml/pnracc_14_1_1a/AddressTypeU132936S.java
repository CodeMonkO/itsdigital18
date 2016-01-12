
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an address
 * 
 * <p>Java class for AddressTypeU_132936S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressTypeU_132936S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressUsageDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AddressUsageTypeU_192856C"/>
 *         &lt;element name="addressDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AddressDetailsTypeU_192854C" minOccurs="0"/>
 *         &lt;element name="city" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To30" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *         &lt;element name="regionDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}CountrySubEntityDetailsTypeU_192857C" minOccurs="0"/>
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}LocationIdentificationTypeU_192855C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressTypeU_132936S", propOrder = {
    "addressUsageDetails",
    "addressDetails",
    "city",
    "zipCode",
    "countryCode",
    "regionDetails",
    "locationDetails"
})
public class AddressTypeU132936S {

    @XmlElement(required = true)
    protected AddressUsageTypeU192856C addressUsageDetails;
    protected AddressDetailsTypeU192854C addressDetails;
    protected String city;
    protected String zipCode;
    protected String countryCode;
    protected CountrySubEntityDetailsTypeU192857C regionDetails;
    protected LocationIdentificationTypeU192855C locationDetails;

    /**
     * Gets the value of the addressUsageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUsageTypeU192856C }
     *     
     */
    public AddressUsageTypeU192856C getAddressUsageDetails() {
        return addressUsageDetails;
    }

    /**
     * Sets the value of the addressUsageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUsageTypeU192856C }
     *     
     */
    public void setAddressUsageDetails(AddressUsageTypeU192856C value) {
        this.addressUsageDetails = value;
    }

    /**
     * Gets the value of the addressDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailsTypeU192854C }
     *     
     */
    public AddressDetailsTypeU192854C getAddressDetails() {
        return addressDetails;
    }

    /**
     * Sets the value of the addressDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailsTypeU192854C }
     *     
     */
    public void setAddressDetails(AddressDetailsTypeU192854C value) {
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
     *     {@link CountrySubEntityDetailsTypeU192857C }
     *     
     */
    public CountrySubEntityDetailsTypeU192857C getRegionDetails() {
        return regionDetails;
    }

    /**
     * Sets the value of the regionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubEntityDetailsTypeU192857C }
     *     
     */
    public void setRegionDetails(CountrySubEntityDetailsTypeU192857C value) {
        this.regionDetails = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentificationTypeU192855C }
     *     
     */
    public LocationIdentificationTypeU192855C getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentificationTypeU192855C }
     *     
     */
    public void setLocationDetails(LocationIdentificationTypeU192855C value) {
        this.locationDetails = value;
    }

}
