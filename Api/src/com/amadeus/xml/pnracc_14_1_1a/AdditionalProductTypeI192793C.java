
package com.amadeus.xml.pnracc_14_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalProductTypeI_192793C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductTypeI_192793C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="equipment" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="numOfStops" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *         &lt;element name="weekDay" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductTypeI_192793C", propOrder = {
    "equipment",
    "numOfStops",
    "weekDay"
})
public class AdditionalProductTypeI192793C {

    protected String equipment;
    protected BigInteger numOfStops;
    protected BigInteger weekDay;

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
     * Gets the value of the numOfStops property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOfStops() {
        return numOfStops;
    }

    /**
     * Sets the value of the numOfStops property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOfStops(BigInteger value) {
        this.numOfStops = value;
    }

    /**
     * Gets the value of the weekDay property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWeekDay() {
        return weekDay;
    }

    /**
     * Sets the value of the weekDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWeekDay(BigInteger value) {
        this.weekDay = value;
    }

}
