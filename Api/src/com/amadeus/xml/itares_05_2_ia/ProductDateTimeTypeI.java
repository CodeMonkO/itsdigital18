
package com.amadeus.xml.itares_05_2_ia;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the dates and times associated with a product.
 * 
 * <p>Java class for ProductDateTimeTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDateTimeTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departureDate" type="{http://xml.amadeus.com/ITARES_05_2_IA}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="departureTime" type="{http://xml.amadeus.com/ITARES_05_2_IA}NumericInteger_Length1To4" minOccurs="0"/>
 *         &lt;element name="arrivalDate" type="{http://xml.amadeus.com/ITARES_05_2_IA}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="arrivalTime" type="{http://xml.amadeus.com/ITARES_05_2_IA}NumericInteger_Length1To4" minOccurs="0"/>
 *         &lt;element name="dateVariation" type="{http://xml.amadeus.com/ITARES_05_2_IA}NumericInteger_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDateTimeTypeI", propOrder = {
    "departureDate",
    "departureTime",
    "arrivalDate",
    "arrivalTime",
    "dateVariation"
})
public class ProductDateTimeTypeI {

    protected String departureDate;
    protected BigInteger departureTime;
    protected String arrivalDate;
    protected BigInteger arrivalTime;
    protected BigInteger dateVariation;

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepartureTime(BigInteger value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(String value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the arrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Sets the value of the arrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArrivalTime(BigInteger value) {
        this.arrivalTime = value;
    }

    /**
     * Gets the value of the dateVariation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDateVariation() {
        return dateVariation;
    }

    /**
     * Sets the value of the dateVariation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDateVariation(BigInteger value) {
        this.dateVariation = value;
    }

}
