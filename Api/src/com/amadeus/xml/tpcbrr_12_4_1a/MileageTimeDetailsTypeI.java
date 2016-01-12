
package com.amadeus.xml.tpcbrr_12_4_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the distance/duration of a trip.
 * 
 * <p>Java class for MileageTimeDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MileageTimeDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalMileage" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}NumericInteger_Length1To8"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MileageTimeDetailsTypeI", propOrder = {
    "totalMileage"
})
public class MileageTimeDetailsTypeI {

    @XmlElement(required = true)
    protected BigInteger totalMileage;

    /**
     * Gets the value of the totalMileage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMileage() {
        return totalMileage;
    }

    /**
     * Sets the value of the totalMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMileage(BigInteger value) {
        this.totalMileage = value;
    }

}
