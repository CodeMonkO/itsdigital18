
package com.amadeus.xml.fmptbq_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Cabin class designation
 * 
 * <p>Java class for CabinClassDesignationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinClassDesignationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinDesignator" type="{http://xml.amadeus.com/FMPTBQ_14_2_1A}AlphaNumericString_Length1To1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinClassDesignationType", propOrder = {
    "cabinDesignator"
})
public class CabinClassDesignationType {

    @XmlElement(required = true)
    protected String cabinDesignator;

    /**
     * Gets the value of the cabinDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinDesignator() {
        return cabinDesignator;
    }

    /**
     * Sets the value of the cabinDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinDesignator(String value) {
        this.cabinDesignator = value;
    }

}
