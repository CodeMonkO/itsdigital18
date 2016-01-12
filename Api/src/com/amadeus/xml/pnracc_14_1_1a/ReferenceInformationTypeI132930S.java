
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide specific reference identification for a traveller.
 * 
 * <p>Java class for ReferenceInformationTypeI_132930S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInformationTypeI_132930S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="referenceDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}ReferencingDetailsTypeI_192843C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInformationTypeI_132930S", propOrder = {
    "referenceDetails"
})
public class ReferenceInformationTypeI132930S {

    @XmlElement(required = true)
    protected ReferencingDetailsTypeI192843C referenceDetails;

    /**
     * Gets the value of the referenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsTypeI192843C }
     *     
     */
    public ReferencingDetailsTypeI192843C getReferenceDetails() {
        return referenceDetails;
    }

    /**
     * Sets the value of the referenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsTypeI192843C }
     *     
     */
    public void setReferenceDetails(ReferencingDetailsTypeI192843C value) {
        this.referenceDetails = value;
    }

}
