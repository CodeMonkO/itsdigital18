
package com.amadeus.xml.fmptbq_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * DATE AND TIME DETAILS
 * 
 * <p>Java class for DateAndTimeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flexibilityQualifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="tripInterval" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumericInteger_Length1To6" minOccurs="0"/>
 *         &lt;element name="tripDuration" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumericInteger_Length1To4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeDetailsType", propOrder = {
    "flexibilityQualifier",
    "tripInterval",
    "tripDuration"
})
public class DateAndTimeDetailsType {

    protected String flexibilityQualifier;
    protected BigInteger tripInterval;
    protected BigInteger tripDuration;

    /**
     * Gets the value of the flexibilityQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlexibilityQualifier() {
        return flexibilityQualifier;
    }

    /**
     * Sets the value of the flexibilityQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlexibilityQualifier(String value) {
        this.flexibilityQualifier = value;
    }

    /**
     * Gets the value of the tripInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTripInterval() {
        return tripInterval;
    }

    /**
     * Sets the value of the tripInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTripInterval(BigInteger value) {
        this.tripInterval = value;
    }

    /**
     * Gets the value of the tripDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTripDuration() {
        return tripDuration;
    }

    /**
     * Sets the value of the tripDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTripDuration(BigInteger value) {
        this.tripDuration = value;
    }

}
