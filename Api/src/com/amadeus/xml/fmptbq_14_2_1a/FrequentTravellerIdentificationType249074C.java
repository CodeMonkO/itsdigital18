
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of the frequent traveller number by company code with the capability to reference a specific traveller.
 * 
 * <p>Java class for FrequentTravellerIdentificationType_249074C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationType_249074C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrier" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="number" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="customerReference" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="tierLevel" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="priorityCode" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="tierDescription" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationType_249074C", propOrder = {
    "carrier",
    "number",
    "customerReference",
    "tierLevel",
    "priorityCode",
    "tierDescription",
    "type"
})
public class FrequentTravellerIdentificationType249074C {

    @XmlElement(required = true)
    protected String carrier;
    protected String number;
    protected String customerReference;
    protected String tierLevel;
    protected String priorityCode;
    protected String tierDescription;
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
