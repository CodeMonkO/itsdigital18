
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniqueIdDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniqueIdDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerFeeRefQualif" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniqueIdDescriptionType", propOrder = {
    "passengerFeeRefQualif"
})
public class UniqueIdDescriptionType {

    protected String passengerFeeRefQualif;

    /**
     * Gets the value of the passengerFeeRefQualif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerFeeRefQualif() {
        return passengerFeeRefQualif;
    }

    /**
     * Sets the value of the passengerFeeRefQualif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerFeeRefQualif(String value) {
        this.passengerFeeRefQualif = value;
    }

}
