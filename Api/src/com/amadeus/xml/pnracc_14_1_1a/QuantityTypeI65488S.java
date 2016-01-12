
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a pertinent quantity.
 * 
 * <p>Java class for QuantityTypeI_65488S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityTypeI_65488S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantityDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}QuantityDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityTypeI_65488S", propOrder = {
    "quantityDetails"
})
public class QuantityTypeI65488S {

    @XmlElement(required = true)
    protected QuantityDetailsTypeI quantityDetails;

    /**
     * Gets the value of the quantityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityDetailsTypeI }
     *     
     */
    public QuantityDetailsTypeI getQuantityDetails() {
        return quantityDetails;
    }

    /**
     * Sets the value of the quantityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityDetailsTypeI }
     *     
     */
    public void setQuantityDetails(QuantityDetailsTypeI value) {
        this.quantityDetails = value;
    }

}
