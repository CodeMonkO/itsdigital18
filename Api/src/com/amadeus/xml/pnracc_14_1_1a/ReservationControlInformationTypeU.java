
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a reference to a reservation.
 * 
 * <p>Java class for ReservationControlInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ReservationControlInformationDetailsTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationTypeU", propOrder = {
    "referenceDetails"
})
public class ReservationControlInformationTypeU {

    @XmlElement(required = true)
    protected ReservationControlInformationDetailsTypeU referenceDetails;

    /**
     * Gets the value of the referenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationDetailsTypeU }
     *     
     */
    public ReservationControlInformationDetailsTypeU getReferenceDetails() {
        return referenceDetails;
    }

    /**
     * Sets the value of the referenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationDetailsTypeU }
     *     
     */
    public void setReferenceDetails(ReservationControlInformationDetailsTypeU value) {
        this.referenceDetails = value;
    }

}
