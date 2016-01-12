
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConnectPointDetailsType_195492C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectPointDetailsType_195492C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inclusionIdentifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length0To1"/>
 *         &lt;element name="locationId" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length3To5"/>
 *         &lt;element name="airportCityQualifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectPointDetailsType_195492C", propOrder = {
    "inclusionIdentifier",
    "locationId",
    "airportCityQualifier"
})
public class ConnectPointDetailsType195492C {

    @XmlElement(required = true)
    protected String inclusionIdentifier;
    @XmlElement(required = true)
    protected String locationId;
    protected String airportCityQualifier;

    /**
     * Gets the value of the inclusionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclusionIdentifier() {
        return inclusionIdentifier;
    }

    /**
     * Sets the value of the inclusionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclusionIdentifier(String value) {
        this.inclusionIdentifier = value;
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

}
