
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgentIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arcNumber" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="erspNumber" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="iataNumber" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentIdentificationType", propOrder = {
    "arcNumber",
    "erspNumber",
    "iataNumber"
})
public class AgentIdentificationType {

    protected String arcNumber;
    protected String erspNumber;
    protected String iataNumber;

    /**
     * Gets the value of the arcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcNumber() {
        return arcNumber;
    }

    /**
     * Sets the value of the arcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcNumber(String value) {
        this.arcNumber = value;
    }

    /**
     * Gets the value of the erspNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErspNumber() {
        return erspNumber;
    }

    /**
     * Sets the value of the erspNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErspNumber(String value) {
        this.erspNumber = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataNumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataNumber(String value) {
        this.iataNumber = value;
    }

}
