
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify additional originator and source information.
 * 
 * <p>Java class for AdditionalBusinessSourceInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalBusinessSourceInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="originatorDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}OriginatorIdentificationDetailsTypeI_192816C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalBusinessSourceInformationTypeI", propOrder = {
    "originatorDetails"
})
public class AdditionalBusinessSourceInformationTypeI {

    @XmlElement(required = true)
    protected OriginatorIdentificationDetailsTypeI192816C originatorDetails;

    /**
     * Gets the value of the originatorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI192816C }
     *     
     */
    public OriginatorIdentificationDetailsTypeI192816C getOriginatorDetails() {
        return originatorDetails;
    }

    /**
     * Sets the value of the originatorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI192816C }
     *     
     */
    public void setOriginatorDetails(OriginatorIdentificationDetailsTypeI192816C value) {
        this.originatorDetails = value;
    }

}
