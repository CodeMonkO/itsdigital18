
package com.amadeus.xml.tpcbrq_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide specific reference identification for a traveller.
 * 
 * <p>Java class for ReferenceInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceDetails" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferencingDetailsTypeI_47428C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInformationTypeI", propOrder = {
    "referenceDetails"
})
public class ReferenceInformationTypeI {

    @XmlElement(required = true)
    protected ReferencingDetailsTypeI47428C referenceDetails;

    /**
     * Gets the value of the referenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsTypeI47428C }
     *     
     */
    public ReferencingDetailsTypeI47428C getReferenceDetails() {
        return referenceDetails;
    }

    /**
     * Sets the value of the referenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsTypeI47428C }
     *     
     */
    public void setReferenceDetails(ReferencingDetailsTypeI47428C value) {
        this.referenceDetails = value;
    }

}
