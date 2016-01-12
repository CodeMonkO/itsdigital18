
package com.amadeus.xml.smpres_13_1_ia;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Product class, number, and designator which define a cabin in a means of transport.
 * 
 * <p>Java class for CabinClassDesignationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinClassDesignationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="classDesignator" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaString_Length1To1"/>
 *         &lt;element name="bookingClass" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="cabinClass" type="{http://xml.amadeus.com/SMPRES_13_1_IA}NumericInteger_Length1To1" minOccurs="0"/>
 *         &lt;element name="compartmentDesignator" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinClassDesignationTypeI", propOrder = {
    "classDesignator",
    "bookingClass",
    "cabinClass",
    "compartmentDesignator"
})
public class CabinClassDesignationTypeI {

    @XmlElement(required = true)
    protected String classDesignator;
    protected String bookingClass;
    protected BigInteger cabinClass;
    protected String compartmentDesignator;

    /**
     * Gets the value of the classDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDesignator() {
        return classDesignator;
    }

    /**
     * Sets the value of the classDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDesignator(String value) {
        this.classDesignator = value;
    }

    /**
     * Gets the value of the bookingClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingClass() {
        return bookingClass;
    }

    /**
     * Sets the value of the bookingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingClass(String value) {
        this.bookingClass = value;
    }

    /**
     * Gets the value of the cabinClass property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCabinClass() {
        return cabinClass;
    }

    /**
     * Sets the value of the cabinClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCabinClass(BigInteger value) {
        this.cabinClass = value;
    }

    /**
     * Gets the value of the compartmentDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompartmentDesignator() {
        return compartmentDesignator;
    }

    /**
     * Sets the value of the compartmentDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompartmentDesignator(String value) {
        this.compartmentDesignator = value;
    }

}
