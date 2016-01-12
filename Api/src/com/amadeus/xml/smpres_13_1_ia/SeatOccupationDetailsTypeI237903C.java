
package com.amadeus.xml.smpres_13_1_ia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the status of a specific seat.
 * 
 * <p>Java class for SeatOccupationDetailsTypeI_237903C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatOccupationDetailsTypeI_237903C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatColumn" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To1"/>
 *         &lt;element name="seatOccupation" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatOccupationDetailsTypeI_237903C", propOrder = {
    "seatColumn",
    "seatOccupation"
})
public class SeatOccupationDetailsTypeI237903C {

    @XmlElement(required = true)
    protected String seatColumn;
    protected String seatOccupation;

    /**
     * Gets the value of the seatColumn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatColumn() {
        return seatColumn;
    }

    /**
     * Sets the value of the seatColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatColumn(String value) {
        this.seatColumn = value;
    }

    /**
     * Gets the value of the seatOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatOccupation() {
        return seatOccupation;
    }

    /**
     * Sets the value of the seatOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatOccupation(String value) {
        this.seatOccupation = value;
    }

}
