
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a reference to a reservation
 * 
 * <p>Java class for ReservationControlInformationTypeI_196500S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationTypeI_196500S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ReservationControlInformationDetailsTypeI_274231C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationTypeI_196500S", propOrder = {
    "reservation"
})
public class ReservationControlInformationTypeI196500S {

    protected ReservationControlInformationDetailsTypeI274231C reservation;

    /**
     * Gets the value of the reservation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationDetailsTypeI274231C }
     *     
     */
    public ReservationControlInformationDetailsTypeI274231C getReservation() {
        return reservation;
    }

    /**
     * Sets the value of the reservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationDetailsTypeI274231C }
     *     
     */
    public void setReservation(ReservationControlInformationDetailsTypeI274231C value) {
        this.reservation = value;
    }

}
