
package com.amadeus.xml.smpreq_13_1_ia;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of the frequent traveller number by company code with the capability to reference a specific traveller.
 * 
 * <p>Java class for FrequentTravellerIdentificationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrier" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaNumericString_Length1To35"/>
 *         &lt;element name="number" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaNumericString_Length1To25"/>
 *         &lt;element name="customerReference" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="tierLevel" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="priorityCode" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="customerValue" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}NumericInteger_Length1To4" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationTypeI", propOrder = {
    "carrier",
    "number",
    "customerReference",
    "tierLevel",
    "priorityCode",
    "customerValue",
    "type"
})
public class FrequentTravellerIdentificationTypeI {

    @XmlElement(required = true)
    protected String carrier;
    @XmlElement(required = true)
    protected String number;
    protected String customerReference;
    protected String tierLevel;
    protected String priorityCode;
    protected BigInteger customerValue;
    protected String type;

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

}
