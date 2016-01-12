
package com.amadeus.xml.fmptbq_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Contains PNR travel (Reservation Booking code, Booking status). Only present in case with-PNR.
 * 
 * <p>Java class for PassengerItineraryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerItineraryInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="booking" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="identifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="status" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="itemNumber" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="dateTimeDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ProductDateTimeType" minOccurs="0"/>
 *         &lt;element name="designator" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="movementType" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="productTypeDetails" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}ProductTypeDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerItineraryInformationType", propOrder = {
    "booking",
    "identifier",
    "status",
    "itemNumber",
    "dateTimeDetails",
    "designator",
    "movementType",
    "productTypeDetails"
})
public class PassengerItineraryInformationType {

    protected String booking;
    protected String identifier;
    protected String status;
    protected BigInteger itemNumber;
    protected ProductDateTimeType dateTimeDetails;
    protected String designator;
    protected String movementType;
    protected ProductTypeDetailsType productTypeDetails;

    /**
     * Gets the value of the booking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBooking() {
        return booking;
    }

    /**
     * Sets the value of the booking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBooking(String value) {
        this.booking = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemNumber(BigInteger value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the dateTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeType }
     *     
     */
    public ProductDateTimeType getDateTimeDetails() {
        return dateTimeDetails;
    }

    /**
     * Sets the value of the dateTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeType }
     *     
     */
    public void setDateTimeDetails(ProductDateTimeType value) {
        this.dateTimeDetails = value;
    }

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignator(String value) {
        this.designator = value;
    }

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementType(String value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the productTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsType }
     *     
     */
    public ProductTypeDetailsType getProductTypeDetails() {
        return productTypeDetails;
    }

    /**
     * Sets the value of the productTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsType }
     *     
     */
    public void setProductTypeDetails(ProductTypeDetailsType value) {
        this.productTypeDetails = value;
    }

}
