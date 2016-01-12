
package com.amadeus.xml.pnracc_14_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler information
 * 
 * <p>Java class for FrequentTravellerIdentificationCodeType_132997S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationCodeType_132997S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airlineFrequentTraveler" type="{http://xml.amadeus.com/PNRACC_14_1_1A}FrequentTravellerIdentificationType"/>
 *         &lt;element name="allianceFrequentTraveler" type="{http://xml.amadeus.com/PNRACC_14_1_1A}FrequentTravellerIdentificationType_192940C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationCodeType_132997S", propOrder = {
    "airlineFrequentTraveler",
    "allianceFrequentTraveler"
})
public class FrequentTravellerIdentificationCodeType132997S {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationType airlineFrequentTraveler;
    protected FrequentTravellerIdentificationType192940C allianceFrequentTraveler;

    /**
     * Gets the value of the airlineFrequentTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationType }
     *     
     */
    public FrequentTravellerIdentificationType getAirlineFrequentTraveler() {
        return airlineFrequentTraveler;
    }

    /**
     * Sets the value of the airlineFrequentTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationType }
     *     
     */
    public void setAirlineFrequentTraveler(FrequentTravellerIdentificationType value) {
        this.airlineFrequentTraveler = value;
    }

    /**
     * Gets the value of the allianceFrequentTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationType192940C }
     *     
     */
    public FrequentTravellerIdentificationType192940C getAllianceFrequentTraveler() {
        return allianceFrequentTraveler;
    }

    /**
     * Sets the value of the allianceFrequentTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationType192940C }
     *     
     */
    public void setAllianceFrequentTraveler(FrequentTravellerIdentificationType192940C value) {
        this.allianceFrequentTraveler = value;
    }

}
