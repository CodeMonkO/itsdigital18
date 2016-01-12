
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify miscellaneous, confidential, quality control and invoice remarks, as well as departure comments, applicable to Acceptance, Boarding, Baggage....
 * 
 * <p>Java class for MiscellaneousRemarksType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscellaneousRemarksType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remarkDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}MiscellaneousRemarkType_187480C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscellaneousRemarksType", propOrder = {
    "remarkDetails"
})
public class MiscellaneousRemarksType {

    protected MiscellaneousRemarkType187480C remarkDetails;

    /**
     * Gets the value of the remarkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousRemarkType187480C }
     *     
     */
    public MiscellaneousRemarkType187480C getRemarkDetails() {
        return remarkDetails;
    }

    /**
     * Sets the value of the remarkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousRemarkType187480C }
     *     
     */
    public void setRemarkDetails(MiscellaneousRemarkType187480C value) {
        this.remarkDetails = value;
    }

}
