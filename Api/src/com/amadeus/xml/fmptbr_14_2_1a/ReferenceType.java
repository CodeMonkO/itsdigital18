
package com.amadeus.xml.fmptbr_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify which number in a sequence of references and/or the reference number.
 * 
 * <p>Java class for ReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refOfLeg" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="firstItemIdentifier" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="lastItemIdentifier" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceType", propOrder = {
    "refOfLeg",
    "firstItemIdentifier",
    "lastItemIdentifier"
})
public class ReferenceType {

    protected String refOfLeg;
    protected BigInteger firstItemIdentifier;
    protected BigInteger lastItemIdentifier;

    /**
     * Gets the value of the refOfLeg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefOfLeg() {
        return refOfLeg;
    }

    /**
     * Sets the value of the refOfLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefOfLeg(String value) {
        this.refOfLeg = value;
    }

    /**
     * Gets the value of the firstItemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstItemIdentifier() {
        return firstItemIdentifier;
    }

    /**
     * Sets the value of the firstItemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstItemIdentifier(BigInteger value) {
        this.firstItemIdentifier = value;
    }

    /**
     * Gets the value of the lastItemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastItemIdentifier() {
        return lastItemIdentifier;
    }

    /**
     * Sets the value of the lastItemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastItemIdentifier(BigInteger value) {
        this.lastItemIdentifier = value;
    }

}
