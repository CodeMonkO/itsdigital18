
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a traveler(s) and personal details relating to the traveler(s).
 * 
 * <p>Java class for TravellerInformationTypeI_128676S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInformationTypeI_128676S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paxDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TravellerSurnameInformationTypeI_18003C"/>
 *         &lt;element name="otherPaxDetails" type="{http://xml.amadeus.com/PNRACC_14_1_1A}TravellerDetailsTypeI_187478C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationTypeI_128676S", propOrder = {
    "paxDetails",
    "otherPaxDetails"
})
public class TravellerInformationTypeI128676S {

    @XmlElement(required = true)
    protected TravellerSurnameInformationTypeI18003C paxDetails;
    protected TravellerDetailsTypeI187478C otherPaxDetails;

    /**
     * Gets the value of the paxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationTypeI18003C }
     *     
     */
    public TravellerSurnameInformationTypeI18003C getPaxDetails() {
        return paxDetails;
    }

    /**
     * Sets the value of the paxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationTypeI18003C }
     *     
     */
    public void setPaxDetails(TravellerSurnameInformationTypeI18003C value) {
        this.paxDetails = value;
    }

    /**
     * Gets the value of the otherPaxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerDetailsTypeI187478C }
     *     
     */
    public TravellerDetailsTypeI187478C getOtherPaxDetails() {
        return otherPaxDetails;
    }

    /**
     * Sets the value of the otherPaxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerDetailsTypeI187478C }
     *     
     */
    public void setOtherPaxDetails(TravellerDetailsTypeI187478C value) {
        this.otherPaxDetails = value;
    }

}
