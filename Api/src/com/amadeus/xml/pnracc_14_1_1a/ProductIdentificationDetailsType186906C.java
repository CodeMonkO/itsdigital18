
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Code, number or name to identify a specific product or service.
 * 
 * <p>Java class for ProductIdentificationDetailsType_186906C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationDetailsType_186906C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificationNbr" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="bookingClass" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentificationDetailsType_186906C", propOrder = {
    "identificationNbr",
    "bookingClass"
})
public class ProductIdentificationDetailsType186906C {

    protected String identificationNbr;
    protected String bookingClass;

    /**
     * Gets the value of the identificationNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationNbr() {
        return identificationNbr;
    }

    /**
     * Sets the value of the identificationNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationNbr(String value) {
        this.identificationNbr = value;
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

}
