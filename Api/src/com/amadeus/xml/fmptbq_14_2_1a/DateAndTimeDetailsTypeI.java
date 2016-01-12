
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * DATE AND TIME DETAILS
 * 
 * <p>Java class for DateAndTimeDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateAndTimeDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timeQualifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="date" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}Date_DDMMYY" minOccurs="0"/>
 *         &lt;element name="time" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="timeWindow" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateAndTimeDetailsTypeI", propOrder = {
    "timeQualifier",
    "date",
    "time",
    "timeWindow"
})
public class DateAndTimeDetailsTypeI {

    protected String timeQualifier;
    protected String date;
    protected String time;
    protected String timeWindow;

    /**
     * Gets the value of the timeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeQualifier() {
        return timeQualifier;
    }

    /**
     * Sets the value of the timeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeQualifier(String value) {
        this.timeQualifier = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the timeWindow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeWindow() {
        return timeWindow;
    }

    /**
     * Sets the value of the timeWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeWindow(String value) {
        this.timeWindow = value;
    }

}
