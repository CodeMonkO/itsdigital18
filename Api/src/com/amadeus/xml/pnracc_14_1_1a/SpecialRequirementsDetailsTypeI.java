
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify special request or services information relating to a traveler
 * 
 * <p>Java class for SpecialRequirementsDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssr" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SpecialRequirementsTypeDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsTypeI", propOrder = {
    "ssr"
})
public class SpecialRequirementsDetailsTypeI {

    @XmlElement(required = true)
    protected SpecialRequirementsTypeDetailsTypeI ssr;

    /**
     * Gets the value of the ssr property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsTypeDetailsTypeI }
     *     
     */
    public SpecialRequirementsTypeDetailsTypeI getSsr() {
        return ssr;
    }

    /**
     * Sets the value of the ssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsTypeDetailsTypeI }
     *     
     */
    public void setSsr(SpecialRequirementsTypeDetailsTypeI value) {
        this.ssr = value;
    }

}
