
package com.amadeus.xml.fmptbr_14_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a user
 * 
 * <p>Java class for OriginatorIdentificationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatorIdentificationDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="officeName" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}NumericInteger_Length1To9" minOccurs="0"/>
 *         &lt;element name="agentSignin" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To9" minOccurs="0"/>
 *         &lt;element name="confidentialOffice" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To9" minOccurs="0"/>
 *         &lt;element name="otherOffice" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatorIdentificationDetailsTypeI", propOrder = {
    "officeName",
    "agentSignin",
    "confidentialOffice",
    "otherOffice"
})
public class OriginatorIdentificationDetailsTypeI {

    protected BigInteger officeName;
    protected String agentSignin;
    protected String confidentialOffice;
    protected String otherOffice;

    /**
     * Gets the value of the officeName property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOfficeName() {
        return officeName;
    }

    /**
     * Sets the value of the officeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOfficeName(BigInteger value) {
        this.officeName = value;
    }

    /**
     * Gets the value of the agentSignin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentSignin() {
        return agentSignin;
    }

    /**
     * Sets the value of the agentSignin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentSignin(String value) {
        this.agentSignin = value;
    }

    /**
     * Gets the value of the confidentialOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfidentialOffice() {
        return confidentialOffice;
    }

    /**
     * Sets the value of the confidentialOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfidentialOffice(String value) {
        this.confidentialOffice = value;
    }

    /**
     * Gets the value of the otherOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherOffice() {
        return otherOffice;
    }

    /**
     * Sets the value of the otherOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherOffice(String value) {
        this.otherOffice = value;
    }

}
