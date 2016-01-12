
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify pricing indicator information.
 * 
 * <p>Java class for PricingTicketingSubsequentTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingSubsequentTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tstInformation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}RateTariffClassInformationTypeI"/>
 *         &lt;element name="salesIndicator" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AlphaString_Length1To2" minOccurs="0"/>
 *         &lt;element name="fcmi" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AlphaNumericString_Length1To1"/>
 *         &lt;element name="bestFareType" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingSubsequentTypeI", propOrder = {
    "tstInformation",
    "salesIndicator",
    "fcmi",
    "bestFareType"
})
public class PricingTicketingSubsequentTypeI {

    @XmlElement(required = true)
    protected RateTariffClassInformationTypeI tstInformation;
    protected String salesIndicator;
    @XmlElement(required = true)
    protected String fcmi;
    protected String bestFareType;

    /**
     * Gets the value of the tstInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RateTariffClassInformationTypeI }
     *     
     */
    public RateTariffClassInformationTypeI getTstInformation() {
        return tstInformation;
    }

    /**
     * Sets the value of the tstInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTariffClassInformationTypeI }
     *     
     */
    public void setTstInformation(RateTariffClassInformationTypeI value) {
        this.tstInformation = value;
    }

    /**
     * Gets the value of the salesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesIndicator() {
        return salesIndicator;
    }

    /**
     * Sets the value of the salesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesIndicator(String value) {
        this.salesIndicator = value;
    }

    /**
     * Gets the value of the fcmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcmi() {
        return fcmi;
    }

    /**
     * Sets the value of the fcmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcmi(String value) {
        this.fcmi = value;
    }

    /**
     * Gets the value of the bestFareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBestFareType() {
        return bestFareType;
    }

    /**
     * Sets the value of the bestFareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBestFareType(String value) {
        this.bestFareType = value;
    }

}
