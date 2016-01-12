
package com.amadeus.xml.fmptbq_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Exchange and link unique identifiers
 * 
 * <p>Java class for ItemReferencesAndVersionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReferencesAndVersionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerFeeRefType" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="passengerFeeRefNumber" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="otherCharacteristics" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}UniqueIdDescriptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReferencesAndVersionsType", propOrder = {
    "passengerFeeRefType",
    "passengerFeeRefNumber",
    "otherCharacteristics"
})
public class ItemReferencesAndVersionsType {

    protected String passengerFeeRefType;
    protected BigInteger passengerFeeRefNumber;
    protected UniqueIdDescriptionType otherCharacteristics;

    /**
     * Gets the value of the passengerFeeRefType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerFeeRefType() {
        return passengerFeeRefType;
    }

    /**
     * Sets the value of the passengerFeeRefType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerFeeRefType(String value) {
        this.passengerFeeRefType = value;
    }

    /**
     * Gets the value of the passengerFeeRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassengerFeeRefNumber() {
        return passengerFeeRefNumber;
    }

    /**
     * Sets the value of the passengerFeeRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassengerFeeRefNumber(BigInteger value) {
        this.passengerFeeRefNumber = value;
    }

    /**
     * Gets the value of the otherCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdDescriptionType }
     *     
     */
    public UniqueIdDescriptionType getOtherCharacteristics() {
        return otherCharacteristics;
    }

    /**
     * Sets the value of the otherCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdDescriptionType }
     *     
     */
    public void setOtherCharacteristics(UniqueIdDescriptionType value) {
        this.otherCharacteristics = value;
    }

}
