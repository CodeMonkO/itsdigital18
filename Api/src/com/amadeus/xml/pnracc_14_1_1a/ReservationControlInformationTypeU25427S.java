
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a reference to a reservation.
 * 
 * <p>Java class for ReservationControlInformationTypeU_25427S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationTypeU_25427S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservationControlId" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ReservationControlInformationDetailsTypeU_46323C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationTypeU_25427S", propOrder = {
    "reservationControlId"
})
public class ReservationControlInformationTypeU25427S {

    @XmlElement(required = true)
    protected ReservationControlInformationDetailsTypeU46323C reservationControlId;

    /**
     * Gets the value of the reservationControlId property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationDetailsTypeU46323C }
     *     
     */
    public ReservationControlInformationDetailsTypeU46323C getReservationControlId() {
        return reservationControlId;
    }

    /**
     * Sets the value of the reservationControlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationDetailsTypeU46323C }
     *     
     */
    public void setReservationControlId(ReservationControlInformationDetailsTypeU46323C value) {
        this.reservationControlId = value;
    }

}
