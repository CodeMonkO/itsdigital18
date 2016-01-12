
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the current and/or original fare basis code.
 * 
 * <p>Java class for RateTariffClassInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateTariffClassInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tstIndicator" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AlphaNumericString_Length1To1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTariffClassInformationTypeI", propOrder = {
    "tstIndicator"
})
public class RateTariffClassInformationTypeI {

    @XmlElement(required = true)
    protected String tstIndicator;

    /**
     * Gets the value of the tstIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTstIndicator() {
        return tstIndicator;
    }

    /**
     * Sets the value of the tstIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTstIndicator(String value) {
        this.tstIndicator = value;
    }

}
