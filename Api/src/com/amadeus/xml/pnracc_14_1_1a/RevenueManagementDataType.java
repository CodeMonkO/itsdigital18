
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RevenueManagementDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevenueManagementDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="overbooking" type="{http://xml.amadeus.com/PNRACC_14_1_1A}OverbookingDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevenueManagementDataType", propOrder = {
    "overbooking"
})
public class RevenueManagementDataType {

    @XmlElement(required = true)
    protected OverbookingDetailsType overbooking;

    /**
     * Gets the value of the overbooking property.
     * 
     * @return
     *     possible object is
     *     {@link OverbookingDetailsType }
     *     
     */
    public OverbookingDetailsType getOverbooking() {
        return overbooking;
    }

    /**
     * Sets the value of the overbooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverbookingDetailsType }
     *     
     */
    public void setOverbooking(OverbookingDetailsType value) {
        this.overbooking = value;
    }

}
