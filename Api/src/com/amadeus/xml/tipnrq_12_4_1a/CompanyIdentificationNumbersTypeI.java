
package com.amadeus.xml.tipnrq_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Number to identify a company and any associated companies.
 * 
 * <p>Java class for CompanyIdentificationNumbersTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentificationNumbersTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AlphaNumericString_Length1To15"/>
 *         &lt;element name="otherIdentifier" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AlphaNumericString_Length1To15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentificationNumbersTypeI", propOrder = {
    "identifier",
    "otherIdentifier"
})
public class CompanyIdentificationNumbersTypeI {

    @XmlElement(required = true)
    protected String identifier;
    protected String otherIdentifier;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the otherIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherIdentifier() {
        return otherIdentifier;
    }

    /**
     * Sets the value of the otherIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherIdentifier(String value) {
        this.otherIdentifier = value;
    }

}
