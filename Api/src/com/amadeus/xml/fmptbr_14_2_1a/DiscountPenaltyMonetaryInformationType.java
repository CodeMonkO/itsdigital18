
package com.amadeus.xml.fmptbr_14_2_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the type of discount and penalty information, the monetary amount, and associated information.
 * 
 * <p>Java class for DiscountPenaltyMonetaryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountPenaltyMonetaryInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feeType" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="feeAmountType" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="feeAmount" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="feeCurrency" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountPenaltyMonetaryInformationType", propOrder = {
    "feeType",
    "feeAmountType",
    "feeAmount",
    "feeCurrency"
})
public class DiscountPenaltyMonetaryInformationType {

    protected String feeType;
    protected String feeAmountType;
    protected BigDecimal feeAmount;
    protected String feeCurrency;

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
     * Gets the value of the feeAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeAmountType() {
        return feeAmountType;
    }

    /**
     * Sets the value of the feeAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeAmountType(String value) {
        this.feeAmountType = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFeeAmount(BigDecimal value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the feeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeCurrency() {
        return feeCurrency;
    }

    /**
     * Sets the value of the feeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeCurrency(String value) {
        this.feeCurrency = value;
    }

}
