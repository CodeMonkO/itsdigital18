
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details concerning seat selection and the associated security and processing information.
 * 
 * <p>Java class for SeatSelectionDetailsTypeI_133070S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatSelectionDetailsTypeI_133070S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specificSeatDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SpecificSeatDetailsTypeI_193060C" minOccurs="0"/>
 *         &lt;element name="noSmokingIndicator" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="seatCharacteristicDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SeatCharacteristicDetailsTypeI_193061C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatSelectionDetailsTypeI_133070S", propOrder = {
    "specificSeatDetails",
    "noSmokingIndicator",
    "seatCharacteristicDetails"
})
public class SeatSelectionDetailsTypeI133070S {

    protected SpecificSeatDetailsTypeI193060C specificSeatDetails;
    protected String noSmokingIndicator;
    protected SeatCharacteristicDetailsTypeI193061C seatCharacteristicDetails;

    /**
     * Gets the value of the specificSeatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificSeatDetailsTypeI193060C }
     *     
     */
    public SpecificSeatDetailsTypeI193060C getSpecificSeatDetails() {
        return specificSeatDetails;
    }

    /**
     * Sets the value of the specificSeatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificSeatDetailsTypeI193060C }
     *     
     */
    public void setSpecificSeatDetails(SpecificSeatDetailsTypeI193060C value) {
        this.specificSeatDetails = value;
    }

    /**
     * Gets the value of the noSmokingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoSmokingIndicator() {
        return noSmokingIndicator;
    }

    /**
     * Sets the value of the noSmokingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoSmokingIndicator(String value) {
        this.noSmokingIndicator = value;
    }

    /**
     * Gets the value of the seatCharacteristicDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SeatCharacteristicDetailsTypeI193061C }
     *     
     */
    public SeatCharacteristicDetailsTypeI193061C getSeatCharacteristicDetails() {
        return seatCharacteristicDetails;
    }

    /**
     * Sets the value of the seatCharacteristicDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatCharacteristicDetailsTypeI193061C }
     *     
     */
    public void setSeatCharacteristicDetails(SeatCharacteristicDetailsTypeI193061C value) {
        this.seatCharacteristicDetails = value;
    }

}
