
package com.amadeus.xml.pnrspl_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reservationInfo" type="{http://xml.amadeus.com/PNRSPL_14_1_1A}ReservationControlInformationType" minOccurs="0"/>
 *         &lt;element name="splitDetails" type="{http://xml.amadeus.com/PNRSPL_14_1_1A}SplitPNRType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reservationInfo",
    "splitDetails"
})
@XmlRootElement(name = "PNR_Split")
public class PNRSplit {

    protected ReservationControlInformationType reservationInfo;
    @XmlElement(required = true)
    protected SplitPNRType splitDetails;

    /**
     * Gets the value of the reservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationType }
     *     
     */
    public ReservationControlInformationType getReservationInfo() {
        return reservationInfo;
    }

    /**
     * Sets the value of the reservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationType }
     *     
     */
    public void setReservationInfo(ReservationControlInformationType value) {
        this.reservationInfo = value;
    }

    /**
     * Gets the value of the splitDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SplitPNRType }
     *     
     */
    public SplitPNRType getSplitDetails() {
        return splitDetails;
    }

    /**
     * Sets the value of the splitDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SplitPNRType }
     *     
     */
    public void setSplitDetails(SplitPNRType value) {
        this.splitDetails = value;
    }

}
