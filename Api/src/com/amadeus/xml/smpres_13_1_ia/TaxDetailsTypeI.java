
package com.amadeus.xml.smpres_13_1_ia;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a rate, type of tax, and currency code.
 * 
 * <p>Java class for TaxDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rate" type="{http://xml.amadeus.com/SMPRES_13_1_IA}NumericDecimal_Length1To17" minOccurs="0"/>
 *         &lt;element name="countryCode" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="filedAmount" type="{http://xml.amadeus.com/SMPRES_13_1_IA}NumericDecimal_Length1To17" minOccurs="0"/>
 *         &lt;element name="filedCurrency" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="filedType" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="conversionRate" type="{http://xml.amadeus.com/SMPRES_13_1_IA}NumericInteger_Length1To18" minOccurs="0"/>
 *         &lt;element name="taxQualifier" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To3" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetailsTypeI", propOrder = {
    "rate",
    "countryCode",
    "currencyCode",
    "type",
    "filedAmount",
    "filedCurrency",
    "filedType",
    "conversionRate",
    "taxQualifier"
})
public class TaxDetailsTypeI {

    protected BigDecimal rate;
    protected String countryCode;
    protected String currencyCode;
    protected String type;
    protected BigDecimal filedAmount;
    protected String filedCurrency;
    protected String filedType;
    protected BigInteger conversionRate;
    protected List<String> taxQualifier;

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRate(BigDecimal value) {
        this.rate = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

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
     * Gets the value of the filedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFiledAmount() {
        return filedAmount;
    }

    /**
     * Sets the value of the filedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFiledAmount(BigDecimal value) {
        this.filedAmount = value;
    }

    /**
     * Gets the value of the filedCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledCurrency() {
        return filedCurrency;
    }

    /**
     * Sets the value of the filedCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledCurrency(String value) {
        this.filedCurrency = value;
    }

    /**
     * Gets the value of the filedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledType() {
        return filedType;
    }

    /**
     * Sets the value of the filedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledType(String value) {
        this.filedType = value;
    }

    /**
     * Gets the value of the conversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConversionRate() {
        return conversionRate;
    }

    /**
     * Sets the value of the conversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConversionRate(BigInteger value) {
        this.conversionRate = value;
    }

    /**
     * Gets the value of the taxQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTaxQualifier() {
        if (taxQualifier == null) {
            taxQualifier = new ArrayList<String>();
        }
        return this.taxQualifier;
    }

}
