
package com.amadeus.xml.pnracc_14_1_1a;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the number and weight of baggage.
 * 
 * <p>Java class for BaggageDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeAllowance" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *         &lt;element name="measurement" type="{http://xml.amadeus.com/PNRACC_14_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="quantityCode" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *         &lt;element name="unitQualifier" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="processIndicator" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDetailsType", propOrder = {
    "freeAllowance",
    "measurement",
    "quantityCode",
    "unitQualifier",
    "processIndicator"
})
public class BaggageDetailsType {

    protected BigInteger freeAllowance;
    protected BigDecimal measurement;
    protected String quantityCode;
    protected String unitQualifier;
    protected String processIndicator;

    /**
     * Gets the value of the freeAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFreeAllowance() {
        return freeAllowance;
    }

    /**
     * Sets the value of the freeAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFreeAllowance(BigInteger value) {
        this.freeAllowance = value;
    }

    /**
     * Gets the value of the measurement property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMeasurement(BigDecimal value) {
        this.measurement = value;
    }

    /**
     * Gets the value of the quantityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantityCode() {
        return quantityCode;
    }

    /**
     * Sets the value of the quantityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantityCode(String value) {
        this.quantityCode = value;
    }

    /**
     * Gets the value of the unitQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitQualifier() {
        return unitQualifier;
    }

    /**
     * Sets the value of the unitQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitQualifier(String value) {
        this.unitQualifier = value;
    }

    /**
     * Gets the value of the processIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessIndicator() {
        return processIndicator;
    }

    /**
     * Sets the value of the processIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessIndicator(String value) {
        this.processIndicator = value;
    }

}
