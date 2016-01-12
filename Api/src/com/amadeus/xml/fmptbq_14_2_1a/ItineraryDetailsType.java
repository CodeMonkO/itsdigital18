
package com.amadeus.xml.fmptbq_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Forces arrival or departure to/from the same city or airport option
 * 
 * <p>Java class for ItineraryDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airportCityQualifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length1To1"/>
 *         &lt;element name="segmentNumber" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumericInteger_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryDetailsType", propOrder = {
    "airportCityQualifier",
    "segmentNumber"
})
public class ItineraryDetailsType {

    @XmlElement(required = true)
    protected String airportCityQualifier;
    @XmlElement(required = true)
    protected BigInteger segmentNumber;

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
     * Gets the value of the segmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSegmentNumber() {
        return segmentNumber;
    }

    /**
     * Sets the value of the segmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSegmentNumber(BigInteger value) {
        this.segmentNumber = value;
    }

}
