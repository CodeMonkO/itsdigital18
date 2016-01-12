
package com.amadeus.xml.fmptbq_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * DATE AND TIME DETAILS
 * 
 * <p>Java class for DateAndTimeDetailsType_254619C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeDetailsType_254619C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rangeQualifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="dayInterval" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumericInteger_Length1To6" minOccurs="0"/>
 *         &lt;element name="timeAtdestination" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}Time24_HHMM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeDetailsType_254619C", propOrder = {
    "rangeQualifier",
    "dayInterval",
    "timeAtdestination"
})
public class DateAndTimeDetailsType254619C {

    protected String rangeQualifier;
    protected BigInteger dayInterval;
    protected String timeAtdestination;

    /**
     * Gets the value of the rangeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRangeQualifier() {
        return rangeQualifier;
    }

    /**
     * Sets the value of the rangeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRangeQualifier(String value) {
        this.rangeQualifier = value;
    }

    /**
     * Gets the value of the dayInterval property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayInterval() {
        return dayInterval;
    }

    /**
     * Sets the value of the dayInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayInterval(BigInteger value) {
        this.dayInterval = value;
    }

    /**
     * Gets the value of the timeAtdestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeAtdestination() {
        return timeAtdestination;
    }

    /**
     * Sets the value of the timeAtdestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeAtdestination(String value) {
        this.timeAtdestination = value;
    }

}
