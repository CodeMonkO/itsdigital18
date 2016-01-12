
package com.amadeus.xml.smpres_13_1_ia;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dates and times relevant to a traveller.
 * 
 * <p>Java class for TravellerTimeDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerTimeDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkInDateTime" type="{http://xml.amadeus.com/SMPRES_13_1_IA}NumericInteger_Length10To10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerTimeDetailsTypeI", propOrder = {
    "checkInDateTime"
})
public class TravellerTimeDetailsTypeI {

    protected BigInteger checkInDateTime;

    /**
     * Gets the value of the checkInDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCheckInDateTime() {
        return checkInDateTime;
    }

    /**
     * Sets the value of the checkInDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCheckInDateTime(BigInteger value) {
        this.checkInDateTime = value;
    }

}
