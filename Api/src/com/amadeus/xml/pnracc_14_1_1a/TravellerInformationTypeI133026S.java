
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a traveler(s) and personal details relating to the traveler(s).
 * 
 * <p>Java class for TravellerInformationTypeI_133026S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInformationTypeI_133026S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paxDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TravellerSurnameInformationTypeI_193003C"/>
 *         &lt;element name="otherPaxDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TravellerDetailsTypeI_193004C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationTypeI_133026S", propOrder = {
    "paxDetails",
    "otherPaxDetails"
})
public class TravellerInformationTypeI133026S {

    @XmlElement(required = true)
    protected TravellerSurnameInformationTypeI193003C paxDetails;
    protected TravellerDetailsTypeI193004C otherPaxDetails;

    /**
     * Gets the value of the paxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationTypeI193003C }
     *     
     */
    public TravellerSurnameInformationTypeI193003C getPaxDetails() {
        return paxDetails;
    }

    /**
     * Sets the value of the paxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationTypeI193003C }
     *     
     */
    public void setPaxDetails(TravellerSurnameInformationTypeI193003C value) {
        this.paxDetails = value;
    }

    /**
     * Gets the value of the otherPaxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerDetailsTypeI193004C }
     *     
     */
    public TravellerDetailsTypeI193004C getOtherPaxDetails() {
        return otherPaxDetails;
    }

    /**
     * Sets the value of the otherPaxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerDetailsTypeI193004C }
     *     
     */
    public void setOtherPaxDetails(TravellerDetailsTypeI193004C value) {
        this.otherPaxDetails = value;
    }

}
