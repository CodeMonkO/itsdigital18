
package com.amadeus.xml.smpreq_13_1_ia;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details of a conversion rate related to an amount.
 * 
 * <p>Java class for ConversionRateTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConversionRateTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conversionRateDetails" type="{http://xml.amadeus.com/SMPREQ_13_1_IA}ConversionRateDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConversionRateTypeI", propOrder = {
    "conversionRateDetails"
})
public class ConversionRateTypeI {

    @XmlElement(required = true)
    protected ConversionRateDetailsTypeI conversionRateDetails;

    /**
     * Gets the value of the conversionRateDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ConversionRateDetailsTypeI }
     *     
     */
    public ConversionRateDetailsTypeI getConversionRateDetails() {
        return conversionRateDetails;
    }

    /**
     * Sets the value of the conversionRateDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConversionRateDetailsTypeI }
     *     
     */
    public void setConversionRateDetails(ConversionRateDetailsTypeI value) {
        this.conversionRateDetails = value;
    }

}
