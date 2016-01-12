
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To advise the requester system the status of the reply
 * 
 * <p>Java class for StatusType_150135S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusType_150135S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusInformation" type="{http://xml.amadeus.com/PNRACC_14_1_1A}StatusDetailsType_215781C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusType_150135S", propOrder = {
    "statusInformation"
})
public class StatusType150135S {

    @XmlElement(required = true)
    protected StatusDetailsType215781C statusInformation;

    /**
     * Gets the value of the statusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailsType215781C }
     *     
     */
    public StatusDetailsType215781C getStatusInformation() {
        return statusInformation;
    }

    /**
     * Sets the value of the statusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailsType215781C }
     *     
     */
    public void setStatusInformation(StatusDetailsType215781C value) {
        this.statusInformation = value;
    }

}
