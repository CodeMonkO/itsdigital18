
package com.amadeus.xml.tipnrq_12_4_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the number of selection segments to be processed.
 * 
 * <p>Java class for SegmentRepetitionControlDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentRepetitionControlDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productReference" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentRepetitionControlDetailsType", propOrder = {
    "productReference",
    "numberOfUnits"
})
public class SegmentRepetitionControlDetailsType {

    protected BigInteger productReference;
    protected BigInteger numberOfUnits;

    /**
     * Gets the value of the productReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductReference() {
        return productReference;
    }

    /**
     * Sets the value of the productReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductReference(BigInteger value) {
        this.productReference = value;
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

}
