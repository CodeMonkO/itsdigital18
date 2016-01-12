
package com.amadeus.xml.fmptbr_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate commercial agreements related to the service being provided.
 * 
 * <p>Java class for CompanyRoleIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyRoleIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeShareType" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="airlineDesignator" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length2To3" minOccurs="0"/>
 *         &lt;element name="flightNumber" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}NumericInteger_Length1To4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyRoleIdentificationType", propOrder = {
    "codeShareType",
    "airlineDesignator",
    "flightNumber"
})
public class CompanyRoleIdentificationType {

    protected String codeShareType;
    protected String airlineDesignator;
    protected BigInteger flightNumber;

    /**
     * Gets the value of the codeShareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeShareType() {
        return codeShareType;
    }

    /**
     * Sets the value of the codeShareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeShareType(String value) {
        this.codeShareType = value;
    }

    /**
     * Gets the value of the airlineDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDesignator() {
        return airlineDesignator;
    }

    /**
     * Sets the value of the airlineDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineDesignator(String value) {
        this.airlineDesignator = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlightNumber(BigInteger value) {
        this.flightNumber = value;
    }

}
