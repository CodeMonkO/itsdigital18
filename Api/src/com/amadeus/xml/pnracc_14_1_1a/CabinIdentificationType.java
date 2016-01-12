
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a cabin
 * 
 * <p>Java class for CabinIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinNbr" type="{http://xml.amadeus.com/PNRACC_14_1_1A}AlphaNumericString_Length1To8"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinIdentificationType", propOrder = {
    "cabinNbr"
})
public class CabinIdentificationType {

    @XmlElement(required = true)
    protected String cabinNbr;

    /**
     * Gets the value of the cabinNbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinNbr() {
        return cabinNbr;
    }

    /**
     * Sets the value of the cabinNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinNbr(String value) {
        this.cabinNbr = value;
    }

}
