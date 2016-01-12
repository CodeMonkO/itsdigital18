
package com.amadeus.xml.tpcbrq_12_4_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide specific reference identification.
 * 
 * <p>Java class for ReferenceInformationTypeI_94610S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceInformationTypeI_94610S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="refDetails" type="{http://xml.amadeus.com/TPCBRQ_12_4_1A}ReferencingDetailsTypeI_142223C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceInformationTypeI_94610S", propOrder = {
    "refDetails"
})
public class ReferenceInformationTypeI94610S {

    protected ReferencingDetailsTypeI142223C refDetails;

    /**
     * Gets the value of the refDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferencingDetailsTypeI142223C }
     *     
     */
    public ReferencingDetailsTypeI142223C getRefDetails() {
        return refDetails;
    }

    /**
     * Sets the value of the refDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferencingDetailsTypeI142223C }
     *     
     */
    public void setRefDetails(ReferencingDetailsTypeI142223C value) {
        this.refDetails = value;
    }

}
