
package com.amadeus.xml.tpcbrr_12_4_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the number and weight of baggage.
 * 
 * <p>Java class for BaggageDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baggageQuantity" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *         &lt;element name="baggageWeight" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *         &lt;element name="baggageType" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="measureUnit" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDetailsTypeI", propOrder = {
    "baggageQuantity",
    "baggageWeight",
    "baggageType",
    "measureUnit"
})
public class BaggageDetailsTypeI {

    protected BigInteger baggageQuantity;
    protected BigInteger baggageWeight;
    protected String baggageType;
    protected String measureUnit;

    /**
     * Gets the value of the baggageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaggageQuantity() {
        return baggageQuantity;
    }

    /**
     * Sets the value of the baggageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaggageQuantity(BigInteger value) {
        this.baggageQuantity = value;
    }

    /**
     * Gets the value of the baggageWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBaggageWeight() {
        return baggageWeight;
    }

    /**
     * Sets the value of the baggageWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBaggageWeight(BigInteger value) {
        this.baggageWeight = value;
    }

    /**
     * Gets the value of the baggageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageType() {
        return baggageType;
    }

    /**
     * Sets the value of the baggageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageType(String value) {
        this.baggageType = value;
    }

    /**
     * Gets the value of the measureUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasureUnit() {
        return measureUnit;
    }

    /**
     * Sets the value of the measureUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasureUnit(String value) {
        this.measureUnit = value;
    }

}
