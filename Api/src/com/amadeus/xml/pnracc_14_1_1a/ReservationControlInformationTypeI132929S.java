
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a reference to a reservation
 * 
 * <p>Java class for ReservationControlInformationTypeI_132929S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationTypeI_132929S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ReservationControlInformationDetailsTypeI_192842C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationTypeI_132929S", propOrder = {
    "reservation"
})
public class ReservationControlInformationTypeI132929S {

    protected ReservationControlInformationDetailsTypeI192842C reservation;

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationDetailsTypeI192842C }
     *     
     */
    public ReservationControlInformationDetailsTypeI192842C getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationDetailsTypeI192842C }
     *     
     */
    public void setReservation(ReservationControlInformationDetailsTypeI192842C value) {
        this.reservation = value;
    }

}
