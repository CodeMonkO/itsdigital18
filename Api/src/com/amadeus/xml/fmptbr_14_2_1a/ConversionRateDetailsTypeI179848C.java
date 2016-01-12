
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConversionRateDetailsTypeI_179848C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionRateDetailsTypeI_179848C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionType" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaString_Length1To3"/>
 *         &lt;element name="rate" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length0To18" minOccurs="0"/>
 *         &lt;element name="convertedAmountLink" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length0To18" minOccurs="0"/>
 *         &lt;element name="taxQualifier" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length0To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionRateDetailsTypeI_179848C", propOrder = {
    "conversionType",
    "currency",
    "rate",
    "convertedAmountLink",
    "taxQualifier"
})
public class ConversionRateDetailsTypeI179848C {

    protected String conversionType;
    @XmlElement(required = true)
    protected String currency;
    protected String rate;
    protected String convertedAmountLink;
    protected String taxQualifier;

    /**
     * Gets the value of the conversionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConversionType() {
        return conversionType;
    }

    /**
     * Sets the value of the conversionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConversionType(String value) {
        this.conversionType = value;
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

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRate(String value) {
        this.rate = value;
    }

    /**
     * Gets the value of the convertedAmountLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConvertedAmountLink() {
        return convertedAmountLink;
    }

    /**
     * Sets the value of the convertedAmountLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConvertedAmountLink(String value) {
        this.convertedAmountLink = value;
    }

    /**
     * Gets the value of the taxQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxQualifier() {
        return taxQualifier;
    }

    /**
     * Sets the value of the taxQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxQualifier(String value) {
        this.taxQualifier = value;
    }

}
