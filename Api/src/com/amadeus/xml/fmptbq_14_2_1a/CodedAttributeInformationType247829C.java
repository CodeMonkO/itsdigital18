
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey coded key and corresponding value
 * 
 * <p>Java class for CodedAttributeInformationType_247829C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedAttributeInformationType_247829C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feeType" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To5"/>
 *         &lt;element name="feeIdNumber" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To50"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedAttributeInformationType_247829C", propOrder = {
    "feeType",
    "feeIdNumber"
})
public class CodedAttributeInformationType247829C {

    @XmlElement(required = true)
    protected String feeType;
    @XmlElement(required = true)
    protected String feeIdNumber;

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeType(String value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the feeIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeIdNumber() {
        return feeIdNumber;
    }

    /**
     * Sets the value of the feeIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeIdNumber(String value) {
        this.feeIdNumber = value;
    }

}
