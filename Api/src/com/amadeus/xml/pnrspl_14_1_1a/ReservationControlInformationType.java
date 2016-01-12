
package com.amadeus.xml.pnrspl_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Reservation control information
 * 
 * <p>Java class for ReservationControlInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservation" type="{http://xml.amadeus.com/PNRSPL_14_1_1A}ReservationControlInformationDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationType", propOrder = {
    "reservation"
})
public class ReservationControlInformationType {

    @XmlElement(required = true)
    protected ReservationControlInformationDetailsTypeI reservation;

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationDetailsTypeI }
     *     
     */
    public ReservationControlInformationDetailsTypeI getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationDetailsTypeI }
     *     
     */
    public void setReservation(ReservationControlInformationDetailsTypeI value) {
        this.reservation = value;
    }

}
