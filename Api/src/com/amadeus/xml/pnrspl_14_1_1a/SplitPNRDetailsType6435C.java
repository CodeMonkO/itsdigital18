
package com.amadeus.xml.pnrspl_14_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * determine the element to split
 * 
 * <p>Java class for SplitPNRDetailsType_6435C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitPNRDetailsType_6435C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://xml.amadeus.com/PNRSPL_14_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="quantity" type="{http://xml.amadeus.com/PNRSPL_14_1_1A}NumericInteger_Length1To2"/>
 *         &lt;element name="tattoo" type="{http://xml.amadeus.com/PNRSPL_14_1_1A}AlphaNumericString_Length1To5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitPNRDetailsType_6435C", propOrder = {
    "type",
    "quantity",
    "tattoo"
})
public class SplitPNRDetailsType6435C {

    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected BigInteger quantity;
    @XmlElement(required = true)
    protected String tattoo;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

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
     * Gets the value of the tattoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTattoo() {
        return tattoo;
    }

    /**
     * Sets the value of the tattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTattoo(String value) {
        this.tattoo = value;
    }

}
