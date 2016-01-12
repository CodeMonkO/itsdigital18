
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the type of monetary amount, the amount, and the currency code.
 * 
 * <p>Java class for MonetaryInformationDetailsType_223826C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationDetailsType_223826C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareDataQualifier" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="fareAmount" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AlphaNumericString_Length1To11" minOccurs="0"/>
 *         &lt;element name="fareCurrency" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="fareLocation" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}AlphaNumericString_Length3To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationDetailsType_223826C", propOrder = {
    "fareDataQualifier",
    "fareAmount",
    "fareCurrency",
    "fareLocation"
})
public class MonetaryInformationDetailsType223826C {

    @XmlElement(required = true)
    protected String fareDataQualifier;
    protected String fareAmount;
    protected String fareCurrency;
    protected String fareLocation;

    /**
     * Gets the value of the fareDataQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareDataQualifier() {
        return fareDataQualifier;
    }

    /**
     * Sets the value of the fareDataQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareDataQualifier(String value) {
        this.fareDataQualifier = value;
    }

    /**
     * Gets the value of the fareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareAmount() {
        return fareAmount;
    }

    /**
     * Sets the value of the fareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareAmount(String value) {
        this.fareAmount = value;
    }

    /**
     * Gets the value of the fareCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCurrency() {
        return fareCurrency;
    }

    /**
     * Sets the value of the fareCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCurrency(String value) {
        this.fareCurrency = value;
    }

    /**
     * Gets the value of the fareLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLocation() {
        return fareLocation;
    }

    /**
     * Sets the value of the fareLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLocation(String value) {
        this.fareLocation = value;
    }

}
