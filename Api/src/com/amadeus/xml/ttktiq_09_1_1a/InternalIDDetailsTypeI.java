
package com.amadeus.xml.ttktiq_09_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an internal identification and the type of identification.
 * 
 * <p>Java class for InternalIDDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternalIDDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inhouseId" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}AlphaNumericString_Length1To9"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/TTKTIQ_09_1_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalIDDetailsTypeI", propOrder = {
    "inhouseId",
    "type"
})
public class InternalIDDetailsTypeI {

    @XmlElement(required = true)
    protected String inhouseId;
    @XmlElement(required = true)
    protected String type;

    /**
     * Gets the value of the inhouseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInhouseId() {
        return inhouseId;
    }

    /**
     * Sets the value of the inhouseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInhouseId(String value) {
        this.inhouseId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
