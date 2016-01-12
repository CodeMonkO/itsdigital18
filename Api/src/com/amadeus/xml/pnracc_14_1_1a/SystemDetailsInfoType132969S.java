
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to specify a system
 * 
 * <p>Java class for SystemDetailsInfoType_132969S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemDetailsInfoType_132969S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveringSystem" type="{http://xml.amadeus.com/PNRACC_14_1_1A}SystemDetailsTypeI_192903C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemDetailsInfoType_132969S", propOrder = {
    "deliveringSystem"
})
public class SystemDetailsInfoType132969S {

    @XmlElement(required = true)
    protected SystemDetailsTypeI192903C deliveringSystem;

    /**
     * Gets the value of the deliveringSystem property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsTypeI192903C }
     *     
     */
    public SystemDetailsTypeI192903C getDeliveringSystem() {
        return deliveringSystem;
    }

    /**
     * Sets the value of the deliveringSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsTypeI192903C }
     *     
     */
    public void setDeliveringSystem(SystemDetailsTypeI192903C value) {
        this.deliveringSystem = value;
    }

}
