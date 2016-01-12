
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a location by code or name.
 * 
 * <p>Java class for LocationTypeI_186910C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationTypeI_186910C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trueLocationId" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To10"/>
 *         &lt;element name="trueLocation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationTypeI_186910C", propOrder = {
    "trueLocationId",
    "trueLocation"
})
public class LocationTypeI186910C {

    @XmlElement(required = true)
    protected String trueLocationId;
    protected String trueLocation;

    /**
     * Gets the value of the trueLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueLocationId() {
        return trueLocationId;
    }

    /**
     * Sets the value of the trueLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueLocationId(String value) {
        this.trueLocationId = value;
    }

    /**
     * Gets the value of the trueLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrueLocation() {
        return trueLocation;
    }

    /**
     * Sets the value of the trueLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrueLocation(String value) {
        this.trueLocation = value;
    }

}
