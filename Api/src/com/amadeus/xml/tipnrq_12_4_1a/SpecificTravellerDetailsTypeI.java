
package com.amadeus.xml.tipnrq_12_4_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify additional details about a particular traveller.
 * 
 * <p>Java class for SpecificTravellerDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificTravellerDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementValue" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}NumericInteger_Length1To18" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificTravellerDetailsTypeI", propOrder = {
    "measurementValue"
})
public class SpecificTravellerDetailsTypeI {

    protected BigInteger measurementValue;

    /**
     * Gets the value of the measurementValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMeasurementValue() {
        return measurementValue;
    }

    /**
     * Sets the value of the measurementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMeasurementValue(BigInteger value) {
        this.measurementValue = value;
    }

}
