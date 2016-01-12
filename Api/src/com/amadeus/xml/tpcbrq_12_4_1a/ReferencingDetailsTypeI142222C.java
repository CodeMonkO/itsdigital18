
package com.amadeus.xml.tpcbrq_12_4_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide reference identification.
 * 
 * <p>Java class for ReferencingDetailsTypeI_142222C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencingDetailsTypeI_142222C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refQualifier" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="refNumber" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}NumericInteger_Length1To5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencingDetailsTypeI_142222C", propOrder = {
    "refQualifier",
    "refNumber"
})
public class ReferencingDetailsTypeI142222C {

    protected String refQualifier;
    protected BigInteger refNumber;

    /**
     * Gets the value of the refQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefQualifier() {
        return refQualifier;
    }

    /**
     * Sets the value of the refQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefQualifier(String value) {
        this.refQualifier = value;
    }

    /**
     * Gets the value of the refNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRefNumber() {
        return refNumber;
    }

    /**
     * Sets the value of the refNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRefNumber(BigInteger value) {
        this.refNumber = value;
    }

}
