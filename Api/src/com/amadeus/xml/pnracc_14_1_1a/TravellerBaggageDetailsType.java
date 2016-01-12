
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the baggage details, including number of bags and serial numbers.
 * 
 * <p>Java class for TravellerBaggageDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerBaggageDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baggageDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}BaggageDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerBaggageDetailsType", propOrder = {
    "baggageDetails"
})
public class TravellerBaggageDetailsType {

    @XmlElement(required = true)
    protected BaggageDetailsType baggageDetails;

    /**
     * Gets the value of the baggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsType }
     *     
     */
    public BaggageDetailsType getBaggageDetails() {
        return baggageDetails;
    }

    /**
     * Sets the value of the baggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsType }
     *     
     */
    public void setBaggageDetails(BaggageDetailsType value) {
        this.baggageDetails = value;
    }

}
