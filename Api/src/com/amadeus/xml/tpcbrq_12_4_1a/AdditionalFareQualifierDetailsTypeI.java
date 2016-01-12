
package com.amadeus.xml.tpcbrq_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the fare basis and ticket designator codes.
 * 
 * <p>Java class for AdditionalFareQualifierDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalFareQualifierDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryCode" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="fareBasisCode" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="ticketDesignator" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="discTktDesignator" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalFareQualifierDetailsTypeI", propOrder = {
    "primaryCode",
    "fareBasisCode",
    "ticketDesignator",
    "discTktDesignator"
})
public class AdditionalFareQualifierDetailsTypeI {

    @XmlElement(required = true)
    protected String primaryCode;
    protected String fareBasisCode;
    protected String ticketDesignator;
    protected String discTktDesignator;

    /**
     * Gets the value of the primaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCode() {
        return primaryCode;
    }

    /**
     * Sets the value of the primaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCode(String value) {
        this.primaryCode = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the ticketDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDesignator() {
        return ticketDesignator;
    }

    /**
     * Sets the value of the ticketDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDesignator(String value) {
        this.ticketDesignator = value;
    }

    /**
     * Gets the value of the discTktDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscTktDesignator() {
        return discTktDesignator;
    }

    /**
     * Sets the value of the discTktDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscTktDesignator(String value) {
        this.discTktDesignator = value;
    }

}
