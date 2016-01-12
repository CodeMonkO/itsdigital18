
package com.amadeus.xml.pnrxcl_14_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ELEMENT DATA
 * 
 * <p>Java class for ElementIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElementIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://xml.amadeus.com/PNRXCL_14_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="number" type="{http://xml.amadeus.com/PNRXCL_14_1_1A}NumericInteger_Length1To5" minOccurs="0"/>
 *         &lt;element name="subElement" type="{http://xml.amadeus.com/PNRXCL_14_1_1A}NumericInteger_Length1To5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementIdentificationType", propOrder = {
    "identifier",
    "number",
    "subElement"
})
public class ElementIdentificationType {

    protected String identifier;
    protected BigInteger number;
    protected BigInteger subElement;

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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the subElement property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubElement() {
        return subElement;
    }

    /**
     * Sets the value of the subElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubElement(BigInteger value) {
        this.subElement = value;
    }

}
