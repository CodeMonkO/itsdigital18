
package com.amadeus.xml.fmptbr_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valueQualifier" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *         &lt;element name="value" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="fareDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}FareDetailsType_193037C" minOccurs="0"/>
 *         &lt;element name="identityNumber" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="fareTypeGrouping" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}FareTypeGroupingInformationType" minOccurs="0"/>
 *         &lt;element name="rateCategory" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInformationType", propOrder = {
    "valueQualifier",
    "value",
    "fareDetails",
    "identityNumber",
    "fareTypeGrouping",
    "rateCategory"
})
public class FareInformationType {

    protected String valueQualifier;
    protected BigInteger value;
    protected FareDetailsType193037C fareDetails;
    protected String identityNumber;
    protected FareTypeGroupingInformationType fareTypeGrouping;
    protected String rateCategory;

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

    /**
     * Gets the value of the fareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailsType193037C }
     *     
     */
    public FareDetailsType193037C getFareDetails() {
        return fareDetails;
    }

    /**
     * Sets the value of the fareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailsType193037C }
     *     
     */
    public void setFareDetails(FareDetailsType193037C value) {
        this.fareDetails = value;
    }

    /**
     * Gets the value of the identityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    /**
     * Sets the value of the identityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityNumber(String value) {
        this.identityNumber = value;
    }

    /**
     * Gets the value of the fareTypeGrouping property.
     * 
     * @return
     *     possible object is
     *     {@link FareTypeGroupingInformationType }
     *     
     */
    public FareTypeGroupingInformationType getFareTypeGrouping() {
        return fareTypeGrouping;
    }

    /**
     * Sets the value of the fareTypeGrouping property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTypeGroupingInformationType }
     *     
     */
    public void setFareTypeGrouping(FareTypeGroupingInformationType value) {
        this.fareTypeGrouping = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCategory() {
        return rateCategory;
    }

    /**
     * Sets the value of the rateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCategory(String value) {
        this.rateCategory = value;
    }

}
