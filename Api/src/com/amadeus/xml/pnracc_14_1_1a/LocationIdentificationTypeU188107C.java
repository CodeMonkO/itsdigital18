
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of a location by code or name. Identification of a location by code or name. Identification of a location by code or name. Identification of a location by code or name
 * 
 * <p>Java class for LocationIdentificationTypeU_188107C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationIdentificationTypeU_188107C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iataLocCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="name" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To256" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationIdentificationTypeU_188107C", propOrder = {
    "iataLocCode",
    "name"
})
public class LocationIdentificationTypeU188107C {

    protected String iataLocCode;
    protected String name;

    /**
     * Gets the value of the iataLocCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataLocCode() {
        return iataLocCode;
    }

    /**
     * Sets the value of the iataLocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataLocCode(String value) {
        this.iataLocCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
