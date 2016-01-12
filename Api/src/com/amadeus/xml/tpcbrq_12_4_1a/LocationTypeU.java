
package com.amadeus.xml.tpcbrq_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a location
 * 
 * <p>Java class for LocationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cityCode" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="cityQualifier" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationTypeU", propOrder = {
    "cityCode",
    "cityQualifier"
})
public class LocationTypeU {

    protected String cityCode;
    protected String cityQualifier;

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the cityQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityQualifier() {
        return cityQualifier;
    }

    /**
     * Sets the value of the cityQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityQualifier(String value) {
        this.cityQualifier = value;
    }

}
