
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify miscellaneous, confidential, quality control and invoice remarks, as well as departure comments, applicable to Acceptance, Boarding, Baggage....
 * 
 * <p>Java class for MiscellaneousRemarksType_132926S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MiscellaneousRemarksType_132926S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remarkDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}MiscellaneousRemarkType_192839C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MiscellaneousRemarksType_132926S", propOrder = {
    "remarkDetails"
})
public class MiscellaneousRemarksType132926S {

    protected MiscellaneousRemarkType192839C remarkDetails;

    /**
     * Gets the value of the remarkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousRemarkType192839C }
     *     
     */
    public MiscellaneousRemarkType192839C getRemarkDetails() {
        return remarkDetails;
    }

    /**
     * Sets the value of the remarkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousRemarkType192839C }
     *     
     */
    public void setRemarkDetails(MiscellaneousRemarkType192839C value) {
        this.remarkDetails = value;
    }

}
