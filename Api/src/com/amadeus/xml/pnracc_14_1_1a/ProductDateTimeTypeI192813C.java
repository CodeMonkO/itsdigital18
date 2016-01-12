
package com.amadeus.xml.pnracc_14_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the dates and times associated with a product.
 * 
 * <p>Java class for ProductDateTimeTypeI_192813C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDateTimeTypeI_192813C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="depDate" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericInteger_Length6To6"/>
 *         &lt;element name="depTime" type="{http://xml.amadeus.com/PNRACC_14_1_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="arrDate" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericInteger_Length6To6" minOccurs="0"/>
 *         &lt;element name="arrTime" type="{http://xml.amadeus.com/PNRACC_14_1_1A}Time24_HHMM" minOccurs="0"/>
 *         &lt;element name="dayChangeIndicator" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDateTimeTypeI_192813C", propOrder = {
    "depDate",
    "depTime",
    "arrDate",
    "arrTime",
    "dayChangeIndicator"
})
public class ProductDateTimeTypeI192813C {

    @XmlElement(required = true)
    protected BigInteger depDate;
    protected String depTime;
    protected BigInteger arrDate;
    protected String arrTime;
    protected BigInteger dayChangeIndicator;

    /**
     * Gets the value of the depDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDepDate() {
        return depDate;
    }

    /**
     * Sets the value of the depDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDepDate(BigInteger value) {
        this.depDate = value;
    }

    /**
     * Gets the value of the depTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepTime() {
        return depTime;
    }

    /**
     * Sets the value of the depTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepTime(String value) {
        this.depTime = value;
    }

    /**
     * Gets the value of the arrDate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getArrDate() {
        return arrDate;
    }

    /**
     * Sets the value of the arrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setArrDate(BigInteger value) {
        this.arrDate = value;
    }

    /**
     * Gets the value of the arrTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrTime() {
        return arrTime;
    }

    /**
     * Sets the value of the arrTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrTime(String value) {
        this.arrTime = value;
    }

    /**
     * Gets the value of the dayChangeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayChangeIndicator() {
        return dayChangeIndicator;
    }

    /**
     * Sets the value of the dayChangeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayChangeIndicator(BigInteger value) {
        this.dayChangeIndicator = value;
    }

}
