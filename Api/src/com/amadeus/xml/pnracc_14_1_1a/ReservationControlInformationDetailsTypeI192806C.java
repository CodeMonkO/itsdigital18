
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReservationControlInformationDetailsTypeI_192806C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationDetailsTypeI_192806C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="controlNumber" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length6To6"/>
 *         &lt;element name="controlType" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationDetailsTypeI_192806C", propOrder = {
    "controlNumber",
    "controlType"
})
public class ReservationControlInformationDetailsTypeI192806C {

    @XmlElement(required = true)
    protected String controlNumber;
    @XmlElement(required = true)
    protected String controlType;

    /**
     * Gets the value of the controlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /**
     * Sets the value of the controlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlNumber(String value) {
        this.controlNumber = value;
    }

    /**
     * Gets the value of the controlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * Sets the value of the controlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlType(String value) {
        this.controlType = value;
    }

}
