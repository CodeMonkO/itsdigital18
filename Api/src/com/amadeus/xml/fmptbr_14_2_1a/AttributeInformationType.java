
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of attribute and the attribute
 * 
 * <p>Java class for AttributeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="feeParameterType" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length3To3" minOccurs="0"/>
 *         &lt;element name="feeParameterDescription" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}AlphaNumericString_Length1To15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeInformationType", propOrder = {
    "feeParameterType",
    "feeParameterDescription"
})
public class AttributeInformationType {

    protected String feeParameterType;
    protected String feeParameterDescription;

    /**
     * Gets the value of the feeParameterType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeParameterType() {
        return feeParameterType;
    }

    /**
     * Sets the value of the feeParameterType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeParameterType(String value) {
        this.feeParameterType = value;
    }

    /**
     * Gets the value of the feeParameterDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeParameterDescription() {
        return feeParameterDescription;
    }

    /**
     * Sets the value of the feeParameterDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeParameterDescription(String value) {
        this.feeParameterDescription = value;
    }

}
