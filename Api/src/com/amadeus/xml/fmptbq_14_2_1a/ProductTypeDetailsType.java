
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Product type details
 * 
 * <p>Java class for ProductTypeDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTypeDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *         &lt;element name="availabilityContext" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To6" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTypeDetailsType", propOrder = {
    "sequenceNumber",
    "availabilityContext"
})
public class ProductTypeDetailsType {

    protected String sequenceNumber;
    protected String availabilityContext;

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the availabilityContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailabilityContext() {
        return availabilityContext;
    }

    /**
     * Sets the value of the availabilityContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailabilityContext(String value) {
        this.availabilityContext = value;
    }

}
