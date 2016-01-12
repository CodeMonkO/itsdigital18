
package com.amadeus.xml.fmptbr_14_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide details relating to the sequence.
 * 
 * <p>Java class for SequenceDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequenceDetailsTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequenceDetails" type="{http://xml.amadeus.com/FMPTBR_14_2_1A}SequenceInformationTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceDetailsTypeU", propOrder = {
    "sequenceDetails"
})
public class SequenceDetailsTypeU {

    protected SequenceInformationTypeU sequenceDetails;

    /**
     * Gets the value of the sequenceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceInformationTypeU }
     *     
     */
    public SequenceInformationTypeU getSequenceDetails() {
        return sequenceDetails;
    }

    /**
     * Sets the value of the sequenceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceInformationTypeU }
     *     
     */
    public void setSequenceDetails(SequenceInformationTypeU value) {
        this.sequenceDetails = value;
    }

}
