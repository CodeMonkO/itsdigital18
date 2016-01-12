
package com.amadeus.xml.fmptbq_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="elapsedGroundTime" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumericInteger_Length1To4" minOccurs="0"/>
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
    "elapsedGroundTime"
})
public class MileageTimeDetailsTypeI {

    protected BigInteger elapsedGroundTime;

    /**
     * Gets the value of the elapsedGroundTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getElapsedGroundTime() {
        return elapsedGroundTime;
    }

    /**
     * Sets the value of the elapsedGroundTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setElapsedGroundTime(BigInteger value) {
        this.elapsedGroundTime = value;
    }

}
