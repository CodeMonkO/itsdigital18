
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of source.
 * 
 * <p>Java class for SourceTypeDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceTypeDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceQualifier1" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaString_Length1To1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceTypeDetailsTypeI", propOrder = {
    "sourceQualifier1"
})
public class SourceTypeDetailsTypeI {

    @XmlElement(required = true)
    protected String sourceQualifier1;

    /**
     * Gets the value of the sourceQualifier1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceQualifier1() {
        return sourceQualifier1;
    }

    /**
     * Sets the value of the sourceQualifier1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceQualifier1(String value) {
        this.sourceQualifier1 = value;
    }

}
