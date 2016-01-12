
package com.amadeus.xml.tipnrq_12_4_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the number of selection segments to be processed.
 * 
 * <p>Java class for SegmentRepetitionControlDetailsTypeI_193634C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentRepetitionControlDetailsTypeI_193634C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantity" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="totalNumberOfItems" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentRepetitionControlDetailsTypeI_193634C", propOrder = {
    "quantity",
    "numberOfUnits",
    "totalNumberOfItems"
})
public class SegmentRepetitionControlDetailsTypeI193634C {

    protected BigInteger quantity;
    protected BigInteger numberOfUnits;
    protected BigInteger totalNumberOfItems;

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfUnits(BigInteger value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the totalNumberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfItems() {
        return totalNumberOfItems;
    }

    /**
     * Sets the value of the totalNumberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfItems(BigInteger value) {
        this.totalNumberOfItems = value;
    }

}
