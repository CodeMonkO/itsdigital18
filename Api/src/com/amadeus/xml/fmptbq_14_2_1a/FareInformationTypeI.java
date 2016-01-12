
package com.amadeus.xml.fmptbq_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify fare details.
 * 
 * <p>Java class for FareInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valueQualifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="value" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInformationTypeI", propOrder = {
    "valueQualifier",
    "value"
})
public class FareInformationTypeI {

    protected String valueQualifier;
    protected BigInteger value;

    /**
     * Gets the value of the valueQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueQualifier() {
        return valueQualifier;
    }

    /**
     * Sets the value of the valueQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueQualifier(String value) {
        this.valueQualifier = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

}
