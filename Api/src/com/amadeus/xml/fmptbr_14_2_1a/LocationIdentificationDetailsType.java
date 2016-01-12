
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationIdentificationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationIdentificationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationId" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaString_Length3To5"/>
 *         &lt;element name="airportCityQualifier" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="terminal" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationIdentificationDetailsType", propOrder = {
    "locationId",
    "airportCityQualifier",
    "terminal"
})
public class LocationIdentificationDetailsType {

    @XmlElement(required = true)
    protected String locationId;
    protected String airportCityQualifier;
    protected String terminal;

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
     * Gets the value of the terminal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminal() {
        return terminal;
    }

    /**
     * Sets the value of the terminal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminal(String value) {
        this.terminal = value;
    }

}
