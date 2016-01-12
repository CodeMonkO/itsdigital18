
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a status and related information.
 * 
 * <p>Java class for StatusTypeI_133063S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusTypeI_133063S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StatusDetailsTypeI_192809C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTypeI_133063S", propOrder = {
    "statusDetails"
})
public class StatusTypeI133063S {

    @XmlElement(required = true)
    protected StatusDetailsTypeI192809C statusDetails;

    /**
     * Gets the value of the statusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailsTypeI192809C }
     *     
     */
    public StatusDetailsTypeI192809C getStatusDetails() {
        return statusDetails;
    }

    /**
     * Sets the value of the statusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailsTypeI192809C }
     *     
     */
    public void setStatusDetails(StatusDetailsTypeI192809C value) {
        this.statusDetails = value;
    }

}
