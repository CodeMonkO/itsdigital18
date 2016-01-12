
package com.amadeus.xml.fmptbr_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductDateTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDateTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dateOfDeparture" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}Date_DDMMYY"/>
 *         &lt;element name="timeOfDeparture" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="dateOfArrival" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}Date_DDMMYY" minOccurs="0"/>
 *         &lt;element name="timeOfArrival" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="dateVariation" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDateTimeType", propOrder = {
    "dateOfDeparture",
    "timeOfDeparture",
    "dateOfArrival",
    "timeOfArrival",
    "dateVariation"
})
public class ProductDateTimeType {

    @XmlElement(required = true)
    protected String dateOfDeparture;
    protected String timeOfDeparture;
    protected String dateOfArrival;
    protected String timeOfArrival;
    protected BigInteger dateVariation;

    /**
     * Gets the value of the dateOfDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfDeparture() {
        return dateOfDeparture;
    }

    /**
     * Sets the value of the dateOfDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfDeparture(String value) {
        this.dateOfDeparture = value;
    }

    /**
     * Gets the value of the timeOfDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    /**
     * Sets the value of the timeOfDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfDeparture(String value) {
        this.timeOfDeparture = value;
    }

    /**
     * Gets the value of the dateOfArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfArrival() {
        return dateOfArrival;
    }

    /**
     * Sets the value of the dateOfArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfArrival(String value) {
        this.dateOfArrival = value;
    }

    /**
     * Gets the value of the timeOfArrival property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeOfArrival() {
        return timeOfArrival;
    }

    /**
     * Sets the value of the timeOfArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeOfArrival(String value) {
        this.timeOfArrival = value;
    }

    /**
     * Gets the value of the dateVariation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDateVariation() {
        return dateVariation;
    }

    /**
     * Sets the value of the dateVariation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDateVariation(BigInteger value) {
        this.dateVariation = value;
    }

}
