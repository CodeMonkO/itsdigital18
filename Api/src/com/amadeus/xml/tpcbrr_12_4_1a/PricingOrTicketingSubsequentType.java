
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information related to a ticket
 * 
 * <p>Java class for PricingOrTicketingSubsequentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingOrTicketingSubsequentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareBasisDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}RateTariffClassInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingOrTicketingSubsequentType", propOrder = {
    "fareBasisDetails"
})
public class PricingOrTicketingSubsequentType {

    protected RateTariffClassInformationType fareBasisDetails;

    /**
     * Gets the value of the fareBasisDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RateTariffClassInformationType }
     *     
     */
    public RateTariffClassInformationType getFareBasisDetails() {
        return fareBasisDetails;
    }

    /**
     * Sets the value of the fareBasisDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTariffClassInformationType }
     *     
     */
    public void setFareBasisDetails(RateTariffClassInformationType value) {
        this.fareBasisDetails = value;
    }

}
