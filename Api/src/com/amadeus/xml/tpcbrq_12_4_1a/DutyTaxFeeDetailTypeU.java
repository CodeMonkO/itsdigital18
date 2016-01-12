
package com.amadeus.xml.tpcbrq_12_4_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutyTaxFeeDetailTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DutyTaxFeeDetailTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxRate" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}NumericDecimal_Length1To9" minOccurs="0"/>
 *         &lt;element name="taxValueQualifier" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DutyTaxFeeDetailTypeU", propOrder = {
    "taxRate",
    "taxValueQualifier"
})
public class DutyTaxFeeDetailTypeU {

    protected BigDecimal taxRate;
    protected String taxValueQualifier;

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTaxRate(BigDecimal value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxValueQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxValueQualifier() {
        return taxValueQualifier;
    }

    /**
     * Sets the value of the taxValueQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxValueQualifier(String value) {
        this.taxValueQualifier = value;
    }

}
