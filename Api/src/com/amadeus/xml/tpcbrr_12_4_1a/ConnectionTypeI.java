
package com.amadeus.xml.tpcbrr_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify connection designator.
 * 
 * <p>Java class for ConnectionTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="connecDetails" type="{http://xml.amadeus.com/TPCBRR_12_4_1A}ConnectionDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionTypeI", propOrder = {
    "connecDetails"
})
public class ConnectionTypeI {

    @XmlElement(required = true)
    protected ConnectionDetailsTypeI connecDetails;

    /**
     * Gets the value of the connecDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDetailsTypeI }
     *     
     */
    public ConnectionDetailsTypeI getConnecDetails() {
        return connecDetails;
    }

    /**
     * Sets the value of the connecDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDetailsTypeI }
     *     
     */
    public void setConnecDetails(ConnectionDetailsTypeI value) {
        this.connecDetails = value;
    }

}
