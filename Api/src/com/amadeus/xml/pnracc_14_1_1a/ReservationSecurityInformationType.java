
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the Amadeus PNR Record Locator Security Information for RR, SP elements and PNR Header or RP line
 * 
 * <p>Java class for ReservationSecurityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationSecurityInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="secondRpInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SecondRpLineInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationSecurityInformationType", propOrder = {
    "secondRpInformation"
})
public class ReservationSecurityInformationType {

    protected SecondRpLineInformationType secondRpInformation;

    /**
     * Gets the value of the secondRpInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SecondRpLineInformationType }
     *     
     */
    public SecondRpLineInformationType getSecondRpInformation() {
        return secondRpInformation;
    }

    /**
     * Sets the value of the secondRpInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondRpLineInformationType }
     *     
     */
    public void setSecondRpInformation(SecondRpLineInformationType value) {
        this.secondRpInformation = value;
    }

}
