
package com.amadeus.xml.itares_05_2_ia;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Additional details describing a specific means of transport.
 * 
 * <p>Java class for AdditionalProductTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipment" type="{http://xml.amadeus.com/ITARES_05_2_IA}AlphaNumericString_Length1To8" minOccurs="0"/>
 *         &lt;element name="numberOfStops" type="{http://xml.amadeus.com/ITARES_05_2_IA}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://xml.amadeus.com/ITARES_05_2_IA}NumericInteger_Length1To6" minOccurs="0"/>
 *         &lt;element name="percentage" type="{http://xml.amadeus.com/ITARES_05_2_IA}NumericInteger_Length1To8" minOccurs="0"/>
 *         &lt;element name="daysOfOperation" type="{http://xml.amadeus.com/ITARES_05_2_IA}AlphaNumericString_Length1To7" minOccurs="0"/>
 *         &lt;element name="dateTimePeriod" type="{http://xml.amadeus.com/ITARES_05_2_IA}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="complexingFlightIndicator" type="{http://xml.amadeus.com/ITARES_05_2_IA}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="locations" type="{http://xml.amadeus.com/ITARES_05_2_IA}AlphaNumericString_Length1To25" maxOccurs="3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductTypeI", propOrder = {
    "equipment",
    "numberOfStops",
    "duration",
    "percentage",
    "daysOfOperation",
    "dateTimePeriod",
    "complexingFlightIndicator",
    "locations"
})
public class AdditionalProductTypeI {

    protected String equipment;
    protected BigInteger numberOfStops;
    protected BigInteger duration;
    protected BigInteger percentage;
    protected String daysOfOperation;
    protected String dateTimePeriod;
    protected String complexingFlightIndicator;
    protected List<String> locations;

    /**
     * Gets the value of the equipment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * Sets the value of the equipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipment(String value) {
        this.equipment = value;
    }

    /**
     * Gets the value of the numberOfStops property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfStops() {
        return numberOfStops;
    }

    /**
     * Sets the value of the numberOfStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfStops(BigInteger value) {
        this.numberOfStops = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentage(BigInteger value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the daysOfOperation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysOfOperation() {
        return daysOfOperation;
    }

    /**
     * Sets the value of the daysOfOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysOfOperation(String value) {
        this.daysOfOperation = value;
    }

    /**
     * Gets the value of the dateTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateTimePeriod() {
        return dateTimePeriod;
    }

    /**
     * Sets the value of the dateTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTimePeriod(String value) {
        this.dateTimePeriod = value;
    }

    /**
     * Gets the value of the complexingFlightIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexingFlightIndicator() {
        return complexingFlightIndicator;
    }

    /**
     * Sets the value of the complexingFlightIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexingFlightIndicator(String value) {
        this.complexingFlightIndicator = value;
    }

    /**
     * Gets the value of the locations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLocations() {
        if (locations == null) {
            locations = new ArrayList<String>();
        }
        return this.locations;
    }

}
