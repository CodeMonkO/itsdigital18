
package com.amadeus.xml.tipnrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the type of monetary amount, the amount, and the currency code.
 * 
 * <p>Java class for MonetaryInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeQualifier" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="amount" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationDetailsType", propOrder = {
    "typeQualifier",
    "amount",
    "currency"
})
public class MonetaryInformationDetailsType {

    @XmlElement(required = true)
    protected String typeQualifier;
    protected String amount;
    protected String currency;

    /**
     * Gets the value of the typeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeQualifier() {
        return typeQualifier;
    }

    /**
     * Sets the value of the typeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeQualifier(String value) {
        this.typeQualifier = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
