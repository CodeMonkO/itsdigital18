
package com.amadeus.xml.tpcbrq_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is designed to convey date/time in a structured way.
 * 
 * <p>Java class for StructuredDateTimeInformationType_94602S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredDateTimeInformationType_94602S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareBasisDateQualifier" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="fareBasisDate" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}StructuredDateTimeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredDateTimeInformationType_94602S", propOrder = {
    "fareBasisDateQualifier",
    "fareBasisDate"
})
public class StructuredDateTimeInformationType94602S {

    @XmlElement(required = true)
    protected String fareBasisDateQualifier;
    @XmlElement(required = true)
    protected StructuredDateTimeType fareBasisDate;

    /**
     * Gets the value of the fareBasisDateQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisDateQualifier() {
        return fareBasisDateQualifier;
    }

    /**
     * Sets the value of the fareBasisDateQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisDateQualifier(String value) {
        this.fareBasisDateQualifier = value;
    }

    /**
     * Gets the value of the fareBasisDate property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public StructuredDateTimeType getFareBasisDate() {
        return fareBasisDate;
    }

    /**
     * Sets the value of the fareBasisDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeType }
     *     
     */
    public void setFareBasisDate(StructuredDateTimeType value) {
        this.fareBasisDate = value;
    }

}
