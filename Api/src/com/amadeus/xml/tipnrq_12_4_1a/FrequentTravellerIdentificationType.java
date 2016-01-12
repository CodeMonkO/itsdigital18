
package com.amadeus.xml.tipnrq_12_4_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrequentTravellerIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrier" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="number" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AlphaNumericString_Length1To28" minOccurs="0"/>
 *         &lt;element name="customerReference" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="status" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="tierLevel" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="priorityCode" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="tierDescription" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="companyCode" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="customerValue" type="{http://xml.amadeus.com/TIPNRQ_12_4_1A}NumericInteger_Length1To4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationType", propOrder = {
    "carrier",
    "number",
    "customerReference",
    "status",
    "tierLevel",
    "priorityCode",
    "tierDescription",
    "companyCode",
    "customerValue"
})
public class FrequentTravellerIdentificationType {

    protected String carrier;
    protected String number;
    protected String customerReference;
    protected String status;
    protected String tierLevel;
    protected String priorityCode;
    protected String tierDescription;
    protected String companyCode;
    protected BigInteger customerValue;

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the tierLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierLevel() {
        return tierLevel;
    }

    /**
     * Sets the value of the tierLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierLevel(String value) {
        this.tierLevel = value;
    }

    /**
     * Gets the value of the priorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityCode() {
        return priorityCode;
    }

    /**
     * Sets the value of the priorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityCode(String value) {
        this.priorityCode = value;
    }

    /**
     * Gets the value of the tierDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierDescription() {
        return tierDescription;
    }

    /**
     * Sets the value of the tierDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierDescription(String value) {
        this.tierDescription = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the customerValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerValue() {
        return customerValue;
    }

    /**
     * Sets the value of the customerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerValue(BigInteger value) {
        this.customerValue = value;
    }

}
