
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CabinProductDetailsType_205138C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinProductDetailsType_205138C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rbd" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaString_Length1To1"/>
 *         &lt;element name="bookingModifier" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AMA_EDICodesetType_Length1" minOccurs="0"/>
 *         &lt;element name="cabin" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="avlStatus" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinProductDetailsType_205138C", propOrder = {
    "rbd",
    "bookingModifier",
    "cabin",
    "avlStatus"
})
public class CabinProductDetailsType205138C {

    @XmlElement(required = true)
    protected String rbd;
    protected String bookingModifier;
    protected String cabin;
    protected String avlStatus;

    /**
     * Gets the value of the rbd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRbd() {
        return rbd;
    }

    /**
     * Sets the value of the rbd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRbd(String value) {
        this.rbd = value;
    }

    /**
     * Gets the value of the bookingModifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingModifier() {
        return bookingModifier;
    }

    /**
     * Sets the value of the bookingModifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingModifier(String value) {
        this.bookingModifier = value;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabin(String value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the avlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvlStatus() {
        return avlStatus;
    }

    /**
     * Sets the value of the avlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvlStatus(String value) {
        this.avlStatus = value;
    }

}
