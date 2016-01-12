
package com.amadeus.xml.tipnrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the action to be taken and the selection criteria.
 * 
 * <p>Java class for ProcessingInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionQualifier" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="referenceQualifier" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="numberOfItems" type="{http://xml.amadeus.com/TIPNRR_12_4_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingInformationTypeI", propOrder = {
    "actionQualifier",
    "referenceQualifier",
    "numberOfItems"
})
public class ProcessingInformationTypeI {

    protected String actionQualifier;
    protected String referenceQualifier;
    protected String numberOfItems;

    /**
     * Gets the value of the actionQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionQualifier() {
        return actionQualifier;
    }

    /**
     * Sets the value of the actionQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionQualifier(String value) {
        this.actionQualifier = value;
    }

    /**
     * Gets the value of the referenceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceQualifier() {
        return referenceQualifier;
    }

    /**
     * Sets the value of the referenceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceQualifier(String value) {
        this.referenceQualifier = value;
    }

    /**
     * Gets the value of the numberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Sets the value of the numberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfItems(String value) {
        this.numberOfItems = value;
    }

}
