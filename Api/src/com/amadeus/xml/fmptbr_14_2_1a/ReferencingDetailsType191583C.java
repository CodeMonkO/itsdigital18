
package com.amadeus.xml.fmptbr_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Referencing details
 * 
 * <p>Java class for ReferencingDetailsType_191583C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencingDetailsType_191583C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refQualifier" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="refNumber" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}NumericInteger_Length0To6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencingDetailsType_191583C", propOrder = {
    "refQualifier",
    "refNumber"
})
public class ReferencingDetailsType191583C {

    protected String refQualifier;
    @XmlElement(required = true)
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
