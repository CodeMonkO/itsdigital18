
package com.amadeus.xml.pnracc_14_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details concerning seat selection and the associated security and processing information.
 * 
 * <p>Java class for SeatSelectionDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatSelectionDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specificSeatDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SpecificSeatDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="noSmokingIndicator" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="seatCharacteristicDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SeatCharacteristicDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="seatRangeDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SeatRangeDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="classDesignator" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="cabinClass" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatSelectionDetailsTypeI", propOrder = {
    "specificSeatDetails",
    "noSmokingIndicator",
    "seatCharacteristicDetails",
    "seatRangeDetails",
    "classDesignator",
    "cabinClass"
})
public class SeatSelectionDetailsTypeI {

    protected SpecificSeatDetailsTypeI specificSeatDetails;
    protected String noSmokingIndicator;
    protected SeatCharacteristicDetailsTypeI seatCharacteristicDetails;
    protected SeatRangeDetailsTypeI seatRangeDetails;
    protected String classDesignator;
    protected BigInteger cabinClass;

    /**
     * Gets the value of the specificSeatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificSeatDetailsTypeI }
     *     
     */
    public SpecificSeatDetailsTypeI getSpecificSeatDetails() {
        return specificSeatDetails;
    }

    /**
     * Sets the value of the specificSeatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificSeatDetailsTypeI }
     *     
     */
    public void setSpecificSeatDetails(SpecificSeatDetailsTypeI value) {
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
     *     {@link SeatCharacteristicDetailsTypeI }
     *     
     */
    public SeatCharacteristicDetailsTypeI getSeatCharacteristicDetails() {
        return seatCharacteristicDetails;
    }

    /**
     * Sets the value of the seatCharacteristicDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatCharacteristicDetailsTypeI }
     *     
     */
    public void setSeatCharacteristicDetails(SeatCharacteristicDetailsTypeI value) {
        this.seatCharacteristicDetails = value;
    }

    /**
     * Gets the value of the seatRangeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SeatRangeDetailsTypeI }
     *     
     */
    public SeatRangeDetailsTypeI getSeatRangeDetails() {
        return seatRangeDetails;
    }

    /**
     * Sets the value of the seatRangeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatRangeDetailsTypeI }
     *     
     */
    public void setSeatRangeDetails(SeatRangeDetailsTypeI value) {
        this.seatRangeDetails = value;
    }

    /**
     * Gets the value of the classDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDesignator() {
        return classDesignator;
    }

    /**
     * Sets the value of the classDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDesignator(String value) {
        this.classDesignator = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCabinClass(BigInteger value) {
        this.cabinClass = value;
    }

}
