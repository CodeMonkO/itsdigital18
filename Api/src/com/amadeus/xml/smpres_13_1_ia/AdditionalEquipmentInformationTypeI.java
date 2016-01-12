
package com.amadeus.xml.smpres_13_1_ia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify equipment configuration, registration number, and cabin facilities.
 * 
 * <p>Java class for AdditionalEquipmentInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalEquipmentInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fittedConfigurationCode" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="airlineDetails" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalEquipmentInformationTypeI", propOrder = {
    "fittedConfigurationCode",
    "airlineDetails"
})
public class AdditionalEquipmentInformationTypeI {

    protected String fittedConfigurationCode;
    protected String airlineDetails;

    /**
     * Gets the value of the fittedConfigurationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFittedConfigurationCode() {
        return fittedConfigurationCode;
    }

    /**
     * Sets the value of the fittedConfigurationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFittedConfigurationCode(String value) {
        this.fittedConfigurationCode = value;
    }

    /**
     * Gets the value of the airlineDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDetails() {
        return airlineDetails;
    }

    /**
     * Sets the value of the airlineDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineDetails(String value) {
        this.airlineDetails = value;
    }

}
