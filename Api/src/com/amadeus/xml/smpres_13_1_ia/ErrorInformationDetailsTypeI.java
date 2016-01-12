
package com.amadeus.xml.smpres_13_1_ia;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify an error and whether it occurred at the system or application level.
 * 
 * <p>Java class for ErrorInformationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorInformationDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processingLevel" type="{http://xml.amadeus.com/SMPRES_13_1_IA}NumericInteger_Length1To1"/>
 *         &lt;element name="code" type="{http://xml.amadeus.com/SMPRES_13_1_IA}NumericInteger_Length1To4" minOccurs="0"/>
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
@XmlType(name = "ErrorInformationDetailsTypeI", propOrder = {
    "processingLevel",
    "code",
    "description"
})
public class ErrorInformationDetailsTypeI {

    @XmlElement(required = true)
    protected BigInteger processingLevel;
    protected BigInteger code;
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
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCode(BigInteger value) {
        this.code = value;
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
