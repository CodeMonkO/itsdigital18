
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Dates and times relevant to a traveller.
 * 
 * <p>Java class for TravellerTimeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerTimeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkInDateTime" type="{http://xml.amadeus.com/PNRACC_14_1_1A}Time24_HHMM" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerTimeDetailsType", propOrder = {
    "checkInDateTime"
})
public class TravellerTimeDetailsType {

    protected String checkInDateTime;

    /**
     * Gets the value of the checkInDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInDateTime() {
        return checkInDateTime;
    }

    /**
     * Sets the value of the checkInDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInDateTime(String value) {
        this.checkInDateTime = value;
    }

}
