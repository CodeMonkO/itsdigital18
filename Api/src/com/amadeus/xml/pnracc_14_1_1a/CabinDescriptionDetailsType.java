
package com.amadeus.xml.pnracc_14_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify cabin features
 * 
 * <p>Java class for CabinDescriptionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinDescriptionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="positionInShip" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="cabinSide" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="categoryLocation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="maxOccupancy" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericInteger_Length1To2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinDescriptionDetailsType", propOrder = {
    "positionInShip",
    "cabinSide",
    "categoryLocation",
    "maxOccupancy"
})
public class CabinDescriptionDetailsType {

    protected String positionInShip;
    protected String cabinSide;
    protected String categoryLocation;
    protected BigInteger maxOccupancy;

    /**
     * Gets the value of the positionInShip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionInShip() {
        return positionInShip;
    }

    /**
     * Sets the value of the positionInShip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionInShip(String value) {
        this.positionInShip = value;
    }

    /**
     * Gets the value of the cabinSide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinSide() {
        return cabinSide;
    }

    /**
     * Sets the value of the cabinSide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinSide(String value) {
        this.cabinSide = value;
    }

    /**
     * Gets the value of the categoryLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryLocation() {
        return categoryLocation;
    }

    /**
     * Sets the value of the categoryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryLocation(String value) {
        this.categoryLocation = value;
    }

    /**
     * Gets the value of the maxOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * Sets the value of the maxOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxOccupancy(BigInteger value) {
        this.maxOccupancy = value;
    }

}
