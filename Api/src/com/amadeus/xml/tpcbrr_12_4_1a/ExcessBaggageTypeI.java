
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning baggage allowance details.
 * 
 * <p>Java class for ExcessBaggageTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcessBaggageTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bagAllowanceDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}BaggageDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessBaggageTypeI", propOrder = {
    "bagAllowanceDetails"
})
public class ExcessBaggageTypeI {

    protected BaggageDetailsTypeI bagAllowanceDetails;

    /**
     * Gets the value of the bagAllowanceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public BaggageDetailsTypeI getBagAllowanceDetails() {
        return bagAllowanceDetails;
    }

    /**
     * Sets the value of the bagAllowanceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public void setBagAllowanceDetails(BaggageDetailsTypeI value) {
        this.bagAllowanceDetails = value;
    }

}
