
package com.amadeus.xml.smpres_13_1_ia;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a warning error and whether it occurred at the system or application level.
 * 
 * <p>Java class for WarningDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarningDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processingLevel" type="{http://xml.amadeus.com/SMPRES_13_1_IA}NumericInteger_Length1To1"/>
 *         &lt;element name="number" type="{http://xml.amadeus.com/SMPRES_13_1_IA}NumericInteger_Length1To4" minOccurs="0"/>
 *         &lt;element name="description" type="{http://xml.amadeus.com/SMPRES_13_1_IA}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarningDetailsTypeI", propOrder = {
    "processingLevel",
    "number",
    "description"
})
public class WarningDetailsTypeI {

    @XmlElement(required = true)
    protected BigInteger processingLevel;
    protected BigInteger number;
    protected String description;

    /**
     * Gets the value of the processingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProcessingLevel() {
        return processingLevel;
    }

    /**
     * Sets the value of the processingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProcessingLevel(BigInteger value) {
        this.processingLevel = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
