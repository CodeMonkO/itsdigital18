
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify more than one identification number.
 * 
 * <p>Java class for MultipleIdentificationNumbersTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultipleIdentificationNumbersTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="corporateNumberIdentifier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="corporateName" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleIdentificationNumbersTypeI", propOrder = {
    "corporateNumberIdentifier",
    "corporateName"
})
public class MultipleIdentificationNumbersTypeI {

    protected String corporateNumberIdentifier;
    protected String corporateName;

    /**
     * Gets the value of the corporateNumberIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateNumberIdentifier() {
        return corporateNumberIdentifier;
    }

    /**
     * Sets the value of the corporateNumberIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateNumberIdentifier(String value) {
        this.corporateNumberIdentifier = value;
    }

    /**
     * Gets the value of the corporateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateName() {
        return corporateName;
    }

    /**
     * Sets the value of the corporateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateName(String value) {
        this.corporateName = value;
    }

}
