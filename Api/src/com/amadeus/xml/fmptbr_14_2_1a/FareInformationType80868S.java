
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify fare details.
 * 
 * <p>Java class for FareInformationType_80868S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInformationType_80868S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}FareDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInformationType_80868S", propOrder = {
    "fareDetails"
})
public class FareInformationType80868S {

    protected FareDetailsType fareDetails;

    /**
     * Gets the value of the fareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailsType }
     *     
     */
    public FareDetailsType getFareDetails() {
        return fareDetails;
    }

    /**
     * Sets the value of the fareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailsType }
     *     
     */
    public void setFareDetails(FareDetailsType value) {
        this.fareDetails = value;
    }

}
