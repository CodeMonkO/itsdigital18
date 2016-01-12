
package com.amadeus.xml.pnracc_14_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the range of seats on a means of transport.
 * 
 * <p>Java class for SeatRangeDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRangeDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatRow" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericInteger_Length1To3"/>
 *         &lt;element name="maximumRange" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericInteger_Length1To18" minOccurs="0"/>
 *         &lt;element name="seatColumn" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRangeDetailsTypeI", propOrder = {
    "seatRow",
    "maximumRange",
    "seatColumn"
})
public class SeatRangeDetailsTypeI {

    @XmlElement(required = true)
    protected BigInteger seatRow;
    protected BigInteger maximumRange;
    protected String seatColumn;

    /**
     * Gets the value of the seatRow property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeatRow() {
        return seatRow;
    }

    /**
     * Sets the value of the seatRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeatRow(BigInteger value) {
        this.seatRow = value;
    }

    /**
     * Gets the value of the maximumRange property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumRange() {
        return maximumRange;
    }

    /**
     * Sets the value of the maximumRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumRange(BigInteger value) {
        this.maximumRange = value;
    }

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

}
